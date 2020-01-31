package com.kanchan.listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] text;
    int[] img;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] text, int[] img) {

        this.context = context;
        this.text=text;
        this.img=img;
        inflater = (LayoutInflater.from(applicationContext));

    }
    @Override
    public int getCount()
    {
        return text.length;
    }
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.listview, null);
        TextView country = view.findViewById(R.id.textView);
        ImageView icon = view.findViewById(R.id.icon);
        country.setText(text[i]);
        icon.setImageResource(img[i]);
        return view;
    }
}
