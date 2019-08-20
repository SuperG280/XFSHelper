package com.superg280.dev.xfshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DevicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);

        final Spinner spinnerDevices = findViewById( R.id.spinner_devices_select);
        DevicesSpinnerAdapter devicesAdapter = new DevicesSpinnerAdapter( getApplicationContext(), Devices.getDev_icons(), Devices.getDev_literales());


        spinnerDevices.setAdapter(devicesAdapter);

        spinnerDevices.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
