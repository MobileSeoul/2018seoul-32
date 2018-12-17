package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KtvshowCategoryCn extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("无限挑战"," 每周节目形式的变化具有武术的艺术身份，并与上述现实的人物表演形成协同作用，彻底改变了艺术范式以及当时最流行的艺术。","muhandozun3");
        MadeList a2 = new MadeList("我们结婚了","“这是一个有趣的职业选手，从一个几乎结婚的环境开始，并尽可能地表达它。最重要的是，我可以观察到在相对较长的时间内球迷很长时间好奇的石墙中的外观，生活和个性， 你可以看到魅力是一个原因。","ougul3");
        MadeList a3 = new MadeList("跑男","它基本上是一个基于城市的真正的品种，如百货商店和高层建筑。 同时，它是一种添加游戏和动作元素的程序。 换句话说，可以看出它只播放追逐战，这是无限挑战的概念之一。","runningman3");
        MadeList a4 = new MadeList("非首脑会谈","来自12个国家的二十多岁和三十岁的演员正在采用不同的方法来讨论关于韩国社会的话题。","bijungsang3");
        MadeList a5 = new MadeList("我独自生活","它显示了歌手表演的裸体和独自玩耍。","nahonza3");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KenterchineseActivity.class); // 다음넘어갈 화면


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
