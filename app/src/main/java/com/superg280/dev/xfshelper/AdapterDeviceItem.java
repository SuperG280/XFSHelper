package com.superg280.dev.xfshelper;

import android.support.constraint.ConstraintLayout;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class AdapterDeviceItem extends BaseAdapter {

    private Context activity;
    private ArrayList<XFSDeviceCode> items = new ArrayList<>();

    private class ViewHolder {
        ConstraintLayout constraintLayout;
        TextView textView;
        TextView textViewResult;
    }

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

    public boolean changeSelectedInListView( int position) {

        if( items != null && items.size() > position) {
            XFSDeviceCode xfsCode = items.get(position);
            if( xfsCode.getValue().contains("0x")) {
                xfsCode.setSelectedInListView(!xfsCode.isSelectedInListView());
                return true;
            }
        }
        return false;
    }

    public void deselectAllInListView() {

        for( int i = 0; i < items.size(); i++) {
            items.get(i).setSelectedInListView(false);
        }
    }

    public boolean isOneOrMoreSelected() {
        for( XFSDeviceCode xfsCode: items) {
            if( xfsCode.isSelectedInListView())
                return true;
        }
        return false;
    }

    public boolean[] getSelectedInListView(){
        boolean[] Result = new boolean[ items.size()];
        for( int i = 0; i < items.size(); i++) {
            Result[ i] = items.get(i).isSelectedInListView();
        }
        return Result;
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert inf != null;
            v = inf.inflate(R.layout.device_element, null);
            holder = new ViewHolder();
            holder.constraintLayout =  v.findViewById(R.id.constraint_device_element);
            holder.textView = v.findViewById(R.id.textView_device_element_name);
            holder.textViewResult = v.findViewById(R.id.textView_device_element_value);
            v.setTag( holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }

        XFSDeviceCode deviceItem = items.get(position);
        holder.textView.setText(deviceItem.getName());
        holder.textViewResult.setText(deviceItem.getValue());

        if( deviceItem.isSelectedInListView()) {
            holder.constraintLayout.setBackgroundColor(activity.getColor(R.color.colorDeviceSelected));
            holder.textView.setTextColor(activity.getColor(R.color.colorDeviceSelectedText));
            holder.textViewResult.setTextColor(activity.getColor(R.color.colorDeviceSelectedText));
        } else {
            holder.constraintLayout.setBackgroundResource(0);
            holder.textView.setTextColor(activity.getColor(R.color.colorDeviceText));
            holder.textViewResult.setTextColor(activity.getColor(R.color.colorDeviceText));
        }

        return v;
    }
}
