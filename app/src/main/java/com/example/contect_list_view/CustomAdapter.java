package com.example.contect_list_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    MainActivity mainActivity;
    String[] name;
    String[] subtitle;

    int[] img;

    public CustomAdapter(MainActivity mainActivity,String[]name,String[]subtitle,int[]img)
    {
        this.mainActivity=mainActivity;
        this.name=name;
        this.subtitle=subtitle;
        this.img=img;
    }


    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(mainActivity).inflate(R.layout.activity_main_item,parent,false);
        ImageView imgarr=view.findViewById(R.id.img);
        TextView txt1=view.findViewById(R.id.name);
        TextView txt2=view.findViewById(R.id.subtitle);


        imgarr.setImageResource(img[position]);
        txt1.setText(name[position]);
        txt2.setText(subtitle[position]);
        return view;
    }
}
