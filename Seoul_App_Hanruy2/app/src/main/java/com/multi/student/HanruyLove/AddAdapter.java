package com.multi.student.HanruyLove;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AddAdapter extends BaseAdapter {
    Context context;
    int itemlayout;
    ArrayList<Productadd> data;
    static String newname;
    static String aboutname;


    LayoutInflater inflater;


    public AddAdapter(Context context, int itemlayout, ArrayList<Productadd> data){
        this.context = context;
        this.itemlayout= itemlayout;
        this.data = data;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return data.size();
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
    public View getView(final int position, View convertView, final ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(itemlayout, parent, false);

        }

        ImageView img1 = (ImageView)convertView.findViewById(R.id.img_1);
        final TextView txt = (TextView)convertView.findViewById(R.id.name_m);
        ViewGroup layout = (ViewGroup)convertView.findViewById(R.id.lay1);


//        layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                newname=data.get(position).getName();
//
//                }
//        });

        Productadd p = data.get(position);
        img1.setImageResource(p.getImgID1());

        txt.setText(p.getName());
        return convertView;
    }
}
