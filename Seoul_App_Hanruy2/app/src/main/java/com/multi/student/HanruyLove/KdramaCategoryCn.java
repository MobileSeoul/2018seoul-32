package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KdramaCategoryCn extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("当你沉睡时","讲的是一个不幸的事件，一个可以提前看到梦想的女人，一个正在努力阻止这个梦想成为现实的检察官。","dangzamsa3");
        MadeList a2 = new MadeList("爱情的温度","这是一部描绘年轻人的爱情和关系的戏剧，他们通过各种各样的肤浅关系主宰，一个梦想成为法国厨师的男人，一个渴望成为戏剧作家的女人。","sarang3");
        MadeList a3 = new MadeList("三流之路","这是一部关于成长浪漫的故事，一个小联盟的年轻人想要按照其他人的说法去“我的方式”，尽管他们因为世界上缺乏规范而迫使他们过上了不小的生活。","ssam3");
        MadeList a4 = new MadeList("女流氓慧静","这是一部人类医疗剧，其中两位曾经成为过去医生的男女受伤，长大后会遇到各种各样的人，并在他们的一生中开始他们的爱。","doctors3");
        MadeList a5 = new MadeList("鬼怪","为了结束不朽的生命，新娘需要一个人类的新娘，记忆中的失败者开始与他奇怪的共存。 在他们面前，有一个女孩谁有一个“死亡的命运”声称自己是一个'妖精牧师'，并在一个神秘的浪漫故事上工作","doggabi3");
        MadeList a6 = new MadeList("来自星星的你","这是一部戏剧性的戏剧，描绘了一个怪异浪漫幻想的甜蜜和浪漫的浪漫，伴随着艺术家的非凡幻想，以及外星人的奇迹和400年前落到地球的韩流女神顶星的王国。 ","bulgudae3");
        MadeList a7 = new MadeList("太阳的后裔","这部电视剧重演了陷入衰退期的地面戏剧，它是前期制作剧热潮的制造者。","taeyang3");
        MadeList a8 = new MadeList("華遊記","这是一种绝对浪漫的驱魔，描绘了在黑暗世界寻求光明的旅程。","hwayugi3");
        MadeList a9 = new MadeList("又吴海英","这是一部基于两位名叫“Oh Hae Young”的女性和一位开始展望未来的女性之间的误解和浪漫的戏剧。 这种类型是一种心理幻想的旋律，假装是一部充满神秘感的浪漫喜剧。","ddoohaeyoung3");
        MadeList a10 = new MadeList("请回答1997","TVN 2012年的时尚剧，描绘了H.O.T.和Jakeskis 1997年的出场，后者成为当前偶像热潮的开端。","oungpal3");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KdramachineseActivity.class); // 다음넘어갈 화면


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
