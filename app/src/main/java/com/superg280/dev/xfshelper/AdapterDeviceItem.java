package com.superg280.dev.xfshelper;

import android.widget.BaseAdapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDeviceItem extends BaseAdapter {

    private Context activity;
    private ArrayList<XFSDeviceCode> items;

    AdapterDeviceItem(Context activity, ArrayList<XFSDeviceCode> items) {
        this.activity = activity;
        this.items    = items;
    }

    @Override
    public int getCount() {
        return items == null ? 0 : items.size();
    }

    public void clear() {

        if( items != null)
            items.clear();
    }

    public void addAll(ArrayList<XFSDeviceCode> newItems) {
        items.addAll(newItems);
    }

    public void setNewArrayItems( ArrayList<XFSDeviceCode> newItems) {
        if( newItems.isEmpty())
            return;

        items = newItems;
    }

    public XFSDeviceCode getItemSelected( int position) {
        return items.get( position);
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert inf != null;
            v = inf.inflate(R.layout.device_element, null);
        }

        XFSDeviceCode deviceItem = items.get(position);

        TextView name = v.findViewById( R.id.textView_device_element_name);
        name.setText( deviceItem.getName());

        TextView value = v.findViewById(R.id.textView_device_element_value);
        value.setText( deviceItem.gerValue());

        return v;
    }
}
