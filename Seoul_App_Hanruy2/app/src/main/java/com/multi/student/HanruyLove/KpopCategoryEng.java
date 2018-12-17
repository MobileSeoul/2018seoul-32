package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KpopCategoryEng extends AppCompatActivity{
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("BTS","Teenagers are experiencing hard work, being prejudiced and oppressed as they go through their lives. It contains a profound meaning that the BTS will prevent it.","bts4");
        //출처 http://www.flickr.com/photos/42438955@N05/12986783935
        MadeList a2 = new MadeList("PSY","Psycho and his real name was called JaeSSangee, and his name was PSY.","psy4");
        //출처 http://www.flickr.com/photos/42438955@N05/15286315131
        MadeList a3 = new MadeList("BigBang","It is a group that has had a great influence on young fashion trends, the idol group that has been pouring since then, and the Korean music industry from the mid to late 2000s.","bigbang4");
        //출처 http://www.flickr.com/photos/42438955@N05/15250823940
        MadeList a4 = new MadeList("Super Junior","He made his debut with the title of \"The Gate of Asia.\" An unusual record of more than 1,000 fans in their debut debut is still unbroken.","superjunior4");
        //출처 http://www.flickr.com/photos/44124401641@N01/4735595906
        MadeList a5 = new MadeList("Twice","Mnet's survival program, SIXTEEN, has been selected as a member of TWICE now through the selection of Nae Yeon, Jung Yeon, Momo, Sana, Ji Hyo, Mina, Tae Hyun, Chae Young and Tsui. ","twice4");
        //출처 http://www.flickr.com/photos/59143760@N00/29203651312
        MadeList a6 = new MadeList("EXO","The name of the team EXO got the motif from the exo planet, which means an extraterrestrial planet outside the solar system, and it means \"a new human being from the unknown.\"","exo4");
        //출처 http://www.flickr.com/photos/114085395@N04/28698712911
        MadeList a7 = new MadeList("BlackPink"," YG has been hiding for a long time, and it is worth mentioning that it is a jewel that has been released. As a whole, the member has considerable ability in various aspects such as singing and dancing.","blackpink4");
        //출처 http://www.flickr.com/photos/159214125@N04/26132928169
        MadeList a8 = new MadeList("Red Velvet","It inherits the uniqueness of f (x) and the image of the wrong girl, but at the same time, it also means that the friendliness of Girls' Generation, the youthful and lovely images inherit and create various charms.","redvelvet4");
        //출처 http://www.flickr.com/photos/59143760@N00/20412994482
        MadeList a9 = new MadeList("Wanna One","The group name Wanna One comes from the pronunciation of '101', which is the title of 'Produce 101 Season 2', and it means that everyone is one.","wannaone4");
        MadeList a10 = new MadeList("TVXQ","The team name means 'God is happening in the East.' This suggests that the group itself is a planned project aimed at winning the Asian music market. ","dongbangsingi4");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KstarengActivity.class); // 다음넘어갈 화면


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
