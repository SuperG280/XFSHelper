package com.superg280.dev.xfshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class DevicesActivity extends AppCompatActivity {

    private AdapterDeviceItem adapterDevice = null;

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
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
