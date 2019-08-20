package com.superg280.dev.xfshelper;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DevicesSpinnerAdapter extends BaseAdapter {

    Context context;
    int icons[];
    String[] literals;
    LayoutInflater inflter;

    public DevicesSpinnerAdapter(Context applicationContext, int[] icons, String[] literals) {
        this.context = applicationContext;
        this.icons = icons;
        this.literals = literals;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_devices, null);
        ImageView icon = view.findViewById(R.id.imageView_device);
        TextView names = view.findViewById(R.id.textView_device);
        icon.setImageResource(icons[i]);
        names.setText(literals[i]);
        return view;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {

        return new CharSequence[0];
    }
}
