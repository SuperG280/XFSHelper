package com.superg280.dev.xfshelper;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Locale;

public class DevicesActivity extends AppCompatActivity {

    private AdapterDeviceItem adapterDevice = null;
    private boolean hideAddButton = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);

		Toolbar toolbar = findViewById(R.id.toolbar_devices);
        setSupportActionBar(toolbar);

        final Spinner spinnerDevices = findViewById( R.id.spinner_devices_select);
        DevicesSpinnerAdapter devicesAdapter = new DevicesSpinnerAdapter( getApplicationContext(), Devices.getDev_icons(), Devices.getDev_literales());


        final SearchView searchView = findViewById(R.id.searchView_devices);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                //InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                //imm.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                String text = s;
                adapterDevice.filter( text);

                return false;
            }
        });

        spinnerDevices.setAdapter(devicesAdapter);

        spinnerDevices.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

                ArrayList<XFSDeviceCode> items = null;

                switch ( pos) {
                    case Devices.DEV_MANAGER:
                        items = XFSCodes.getManagerData(getApplicationContext());
                        break;
                    case Devices.DEV_DISPENSER:
                        items = XFSCodes.getDispenserData(getApplicationContext());
                        break;
                    case Devices.DEV_CARD:
                        items = XFSCodes.getCardReaderData(getApplicationContext());
                        break;
                    case Devices.DEV_PINPAD:
                        items = XFSCodes.getPinPadData(getApplicationContext());
                        break;
                    case Devices.DEV_SENSORS:
                        items = XFSCodes.getSensorsData(getApplicationContext());
                        break;
                    case Devices.DEV_NOTESDEPOSIT:
                        items = XFSCodes.getNoteAcceptorData(getApplicationContext());
                        break;
                    case Devices.DEV_PRINTER:
                        items = XFSCodes.getPrinterData(getApplicationContext());
                        break;
                    case Devices.DEV_VDM:
                        items = XFSCodes.getVDMData(getApplicationContext());
                        break;
                    case Devices.DEV_TTU:
                        items = XFSCodes.getTTUData(getApplicationContext());
                        break;
                    case Devices.DEV_BARCODE:
                        items = XFSCodes.getBarCodeData(getApplicationContext());
                        break;
                    case Devices.DEV_DEPOSIT:
                        items = XFSCodes.getDepositData(getApplicationContext());
                        break;
                    case Devices.DEV_ALARMS:
                        items = XFSCodes.getALMData(getApplicationContext());
                        break;
                    case Devices.DEV_CAMERA:
                        items = XFSCodes.getCAMData(getApplicationContext());
                        break;
                    case Devices.DEV_CEU:
                        items = XFSCodes.getCEUData(getApplicationContext());
                        break;
                    case Devices.DEV_CHK:
                        items = XFSCodes.getCHKData(getApplicationContext());
                        break;
                    case Devices.DEV_CRD:
                        items = XFSCodes.getCRDData(getApplicationContext());
                        break;
                    case Devices.DEV_IPM:
                        items = XFSCodes.getIPMData(getApplicationContext());
                        break;
                }

                if( items == null || items.isEmpty()) {
                    if (adapterDevice != null) {
                        adapterDevice.clear();
                        adapterDevice.notifyDataSetChanged();
                        return;
                    }
                }

                ListView lv = findViewById( R.id.listView_device_items);
                adapterDevice = new AdapterDeviceItem( getApplicationContext(), items);
                lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
                lv.setAdapter(adapterDevice);

                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        //Toast.makeText(DevicesActivity.this, "Pos: " + i, Toast.LENGTH_SHORT).show();
                        if( adapterDevice.changeSelectedInListView( i)) {
                            adapterDevice.notifyDataSetChanged();
                            hideOrShowActionButton();
                        }
                    }
                });
                lv.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
                        return false;
                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void hideOrShowActionButton( ) {

        hideAddButton = !adapterDevice.isOneOrMoreSelected();
        invalidateOptionsMenu();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_devices, menu);

        MenuItem itemAdd = menu.findItem(R.id.action_devices_add);
        MenuItem itemUndo = menu.findItem(R.id.action_devices_undo_selection);

        if( hideAddButton) {
            itemAdd.setVisible(false);
            itemUndo.setVisible(false);
        } else {
            itemAdd.setVisible(true);
            itemUndo.setVisible(true);
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_devices_add) {
            boolean[] isSelected = adapterDevice.getSelectedInListView();

            //String strResult = "";
            long add = 0;

            for( int i = 0; i < isSelected.length; i++) {
                if( isSelected[i]) {
                    XFSDeviceCode code = (XFSDeviceCode) adapterDevice.getItem(i);
                    //strResult += code.getValue() + " ";
                    try {
                        add += Long.parseLong(code.getValue().substring(2), 16);
                    } catch( Exception ex) {
                        add = 0;
                    }
                }
            }
            ListView lv = findViewById( R.id.listView_device_items);
            String text = String.format(Locale.getDefault(),"%s 0x%08X -- %d", getResources().getString(R.string.devices_add_result_text), add, add);
            //lv.smoothScrollToPosition(10);
            Snackbar.make(lv, text, Snackbar.LENGTH_INDEFINITE)
                    .setActionTextColor( DevicesActivity.this.getColor(R.color.colorDeviceSelectedText))
                    .setAction(getResources().getString(R.string.devices_add_result_close), new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Al pulsar se cierra, así que no hay que hacer nada aquí.
                }
            }).show();

            return true;
        } else if( id == R.id.action_devices_undo_selection) {

            adapterDevice.deselectAllInListView();
            adapterDevice.notifyDataSetChanged();
            hideOrShowActionButton();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
