package com.superg280.dev.xfshelper;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DevicesActivity extends AppCompatActivity implements Callback {

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
                        items = XFSCodes.getDispenserData();
                        break;
                    case Devices.DEV_CARD:
                        items = XFSCodes.getCardReaderData();
                        break;
                    case Devices.DEV_PINPAD:
                        items = XFSCodes.getPinPadData();
                        break;
                    case Devices.DEV_SENSORS:
                        items = XFSCodes.getSensorsData(getApplicationContext());
                        break;
                    case Devices.DEV_NOTESDEPOSIT:
                        items = XFSCodes.getNoteAcceptorData();
                        break;
                    case Devices.DEV_PRINTER:
                        //items = XFSCodes.getPrinterData();
                        break;
                    case Devices.DEV_VDM:
                        //items = XFSCodes.getPrinterData();
                        break;
                    case Devices.DEV_TTU:
                        //items = XFSCodes.getPrinterData();
                        break;
                    case Devices.DEV_BARCODE:
                        //items = XFSCodes.getPrinterData();
                        break;
                    case Devices.DEV_DEPOSIT:
                        //items = XFSCodes.getPrinterData();
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
                adapterDevice.setListener( DevicesActivity.this);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void hideOrShowActionButton( ) {

        boolean isSelected[] = adapterDevice.getSelectedFlags();
        for( boolean b: isSelected) {
            if( b) {
                hideAddButton = false;
                invalidateOptionsMenu();
                return;
            }
        }
        hideAddButton = true;
        invalidateOptionsMenu();
    }

    @Override
    public void onChangeInSelection()
    {
        hideOrShowActionButton( );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_devices, menu);

        MenuItem item = menu.findItem(R.id.action_devices_add);
        if( hideAddButton)
            item.setVisible(false);
        else
            item.setVisible(true);

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
            boolean isSelected[] = adapterDevice.getSelectedFlags();

            //String strResult = "";
            int add = 0;

            for( int i = 0; i < isSelected.length; i++) {
                if( isSelected[i]) {
                    XFSDeviceCode code = (XFSDeviceCode) adapterDevice.getItem(i);
                    //strResult += code.getValue() + " ";
                    try {
                        add += Integer.parseInt(code.getValue().substring(2), 16);
                    } catch( Exception ex) {
                        add = 0;
                    }
                }
            }
            ListView lv = findViewById( R.id.listView_device_items);
            String text = getResources().getString(R.string.devices_add_no_selection_text);
            if( add > 0) {
                text = String.format( "%s 0x%08X -- %d", getResources().getString(R.string.devices_add_result_text), add, add);
            }

            Snackbar.make(lv, text, Snackbar.LENGTH_INDEFINITE)
                    .setActionTextColor(getResources().getColor(R.color.colorDeviceSelectedText))
                    .setAction(getResources().getString(R.string.devices_add_result_close), new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            }).show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
