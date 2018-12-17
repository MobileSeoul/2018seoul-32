package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KtvshowCategoryEng extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("Infinite Challenge","The changes in the format of the weekly shows have the artistic identity of the martial arts, and cause synergy with the aforementioned realistic character shows, and completely change the artistic paradigm as well as the most popular arts of the day.","muhandozun4");
        MadeList a2 = new MadeList("We Got Married","It is an entertainment program that starts with the setting of being married virtually and expresses it as real as possible. Above all, I can observe the appearance, life, and personality of the lovers who are wondering about for a relatively long time naturally. ","ougul4");
        MadeList a3 = new MadeList("Running Man","It is basically a real variety based on city such as department store and high-rise building. At the same time, it is a type of program that adds game and action elements. In other words, it can be seen that it only broadcasts chase warfare, which is one of the concept of infinite challenge.","runningman4");
        MadeList a4 = new MadeList("Nonsummit","The cast members of twenties and thirties from twelve countries are taking a different approach to discussing a topic on Korean society.","bijungsang4");
        MadeList a5 = new MadeList("I live alone","It shows nakedness of singers' performances and playing alone.","nahonza4");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KenterengActivity.class); // 다음넘어갈 화면


                intent.putExtra("name", mlist.get(position).getTable());
                intent.putExtra("listname",mlist.get(position).getName());


                startActivity(intent);
            }
        });

        mlist.add(a1);
        mlist.add(a2);
        mlist.add(a3);
        mlist.add(a4);
        mlist.add(a5);


        adapter = new Adapter(
                this,
                R.layout.listitem,
                mlist
        );
        listView.setAdapter(adapter);

    }
}
