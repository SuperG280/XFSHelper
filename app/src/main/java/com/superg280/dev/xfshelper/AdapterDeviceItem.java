package com.superg280.dev.xfshelper;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.widget.BaseAdapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class AdapterDeviceItem extends BaseAdapter {

    private Context activity;
    private ArrayList<XFSDeviceCode> items = new ArrayList<>();
    private boolean isSelected[];

    private class ViewHolder {
        ConstraintLayout constraintLayout;
        TextView textView;
        TextView textViewResult;
    }

    AdapterDeviceItem(Context activity, ArrayList<XFSDeviceCode> items) {
        this.activity = activity;
        this.items    = items;
        isSelected = new boolean[items.size()];
    }

 //   @Override
//    public boolean isEnabled(int position) {
//        return false;
//    }

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

    public boolean[] getSelectedFlags(){
        return isSelected;
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

        if( isSelected[position]) {
            holder.constraintLayout.setBackgroundColor(activity.getColor(R.color.colorDeviceSelected));
            holder.textView.setTextColor(activity.getColor(R.color.colorDeviceSelectedText));
            holder.textViewResult.setTextColor(activity.getColor(R.color.colorDeviceSelectedText));
        } else {
            holder.constraintLayout.setBackgroundResource(0);
            holder.textView.setTextColor(activity.getColor(R.color.colorDeviceText));
            holder.textViewResult.setTextColor(activity.getColor(R.color.colorDeviceText));
        }

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if( !holder.textViewResult.getText().toString().contains("0x"))
                   return;

               boolean flag = holder.textView.isSelected();
               holder.textView.setSelected(!flag);
               isSelected[position] = !isSelected[position];

               if(holder.textView.isSelected()){
                   holder.constraintLayout.setBackgroundColor(activity.getColor(R.color.colorDeviceSelected));
                   holder.textView.setTextColor(activity.getColor(R.color.colorDeviceSelectedText));
                   holder.textViewResult.setTextColor(activity.getColor(R.color.colorDeviceSelectedText));
               } else {
                   holder.constraintLayout.setBackgroundResource(0);
                   holder.textView.setTextColor(activity.getColor(R.color.colorDeviceText));
                   holder.textViewResult.setTextColor(activity.getColor(R.color.colorDeviceText));
               }
           }
       });

        return v;
    }
}
