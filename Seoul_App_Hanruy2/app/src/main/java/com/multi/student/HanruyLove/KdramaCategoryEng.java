package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KdramaCategoryEng extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("While You Were Sleeping","I am telling the story of an unfortunate incident to someone, a woman who can see the dream in advance, and a prosecutor who is struggling to prevent that dream from becoming reality.","dangzamsa4");
        MadeList a2 = new MadeList("Temperature of Love","It is a drama depicting love and relationship of young people who are dominated by a superficial relationship through a variety of people, and a man who dreams of a French chef, a woman who aspires to be a dramatist.","sarang4");
        MadeList a3 = new MadeList("Fight For My Way","It is a drama about the growth romance that a minor league youths who want to go to 'My Way' whatever the others say, despite the fact that they force a minor life because of the lack of specifications in the world.","ssam4");
        MadeList a4 = new MadeList("Dotors","It is a human medical drama where two men and women who have become doctors over the past hurts meet and grow up in various human groups and start their love once in their lifetime.","doctors4");
        MadeList a5 = new MadeList("Goblin","To end the life of immortality, the bride who needs a human bride, the memory loser who began a strange coexistence with him. It is a work that deals with the mysterious romantic fables that appear in front of such a girl of 'destiny to be dead' claiming to be 'goblin priest'.","doggabi4");
        MadeList a6 = new MadeList("My Love From the Star"," It is a dramatic drama depicting the sweet and romantic romance of a freak romantic fantasy with an extraordinary fantasy of the artist, as well as the miracle of the alien and the kingdom of the Korean Wave Goddess Top Star who fell to the earth 400 years ago. ","bulgudae4");
        MadeList a7 = new MadeList("The descendants of the sun","It is a drama that revived the terrestrial drama that had fallen into a recession period, and it is the maker of the pre-production drama fever.","taeyang4");
        MadeList a8 = new MadeList("A Korean Odyssey","It is an absolute romantic exorcism that depicts the journey of seeking the light in the dark world.","hwayugi4");
        MadeList a9 = new MadeList("Another Miss Oh","It is a drama based on misunderstanding and romance between two women named \"Oh Hae Young\" and a man who started to see the future. The genre is a psychological fantasy melody that pretends to be a romance comedy with added mystery.","ddoohaeyoung4");
        MadeList a10 = new MadeList("Replay1997","TVN's trendy drama in 2012, which depicts the 1997 appearance of H.O.T. and Jakeskis, who became the beginning of the current idol craze.","oungpal4");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KdramaengActivity.class); // 다음넘어갈 화면


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
        mlist.add(a6);
        mlist.add(a7);
        mlist.add(a8);
        mlist.add(a9);
        mlist.add(a10);

        adapter = new Adapter(
                this,
                R.layout.listitem,
                mlist
        );
        listView.setAdapter(adapter);

    }
}
