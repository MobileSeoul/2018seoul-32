package com.multi.student.HanruyLove;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context;
    int itemlayout;
    ArrayList<MadeList> item;
    LayoutInflater inflater;

    public Adapter(Context context, int itemlayout, ArrayList<MadeList> item){
        this.context = context;
        this.itemlayout = itemlayout;
        this.item = item;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return item.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(itemlayout,parent,false);
        }



        TextView name = (TextView)convertView.findViewById(R.id.name);
        TextView subtext = (TextView)convertView.findViewById(R.id.subtext);
        MadeList m = item.get(position);
        //ImageView firstimg = (ImageView)convertView.findViewById(R.id.firstimg);

        name.setText(m.getName());
        subtext.setText(m.getSubtext());
       //firstimg.setImageResource(m.getFirstimg());

        return convertView;
    }
}
