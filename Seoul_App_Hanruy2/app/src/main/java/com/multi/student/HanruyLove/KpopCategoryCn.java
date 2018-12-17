package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KpopCategoryCn extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("防弹少年团","青少年正在经历艰苦的工作，在他们的生活中受到偏见和压迫。 防弹男孩采取了深刻的意义来阻止它。","bts3");
        //출처 http://www.flickr.com/photos/42438955@N05/12986783935
        MadeList a2 = new MadeList("鸟叔","Psycho和他的真名叫做重新配对，他的名字叫PSY。","psy3");
        //출처 http://www.flickr.com/photos/42438955@N05/15286315131
        MadeList a3 = new MadeList("宇宙大爆炸","这是一个对年轻时尚潮流产生重大影响的团体，从那时起一直倾注的偶像团体，以及从2000年代中后期开始的韩国音乐产业。","bigbang3");
        //출처 http://www.flickr.com/photos/42438955@N05/15250823940
        MadeList a4 = new MadeList("Super junior","他以“亚洲之门”的头衔首次亮相。 首次亮相的超过1000名球迷的不寻常记录仍然没有中断。","superjunior3");
        //출처 http://www.flickr.com/photos/44124401641@N01/4735595906
        MadeList a5 = new MadeList("Twice","他被选为Mnet生存计划SIXTEEN的TWICE成员。 ","twice3");
        //출처 http://www.flickr.com/photos/59143760@N00/29203651312
        MadeList a6 = new MadeList("EXO","EXO这个名字在“EXO Planet”中有一个主题，意思是太阳系外的一颗外星球，它的意思是“来自未知的新人类”。","exo3");
        //출처 http://www.flickr.com/photos/114085395@N04/28698712911
        MadeList a7 = new MadeList("BlackPink","YG已经躲藏了很长时间，值得一提的是它是一颗已经发布的宝石。整体而言，该成员在唱歌和舞蹈等各方面都具有相当的能力。 ","blackpink3");
        //출처 http://www.flickr.com/photos/159214125@N04/26132928169
        MadeList a8 = new MadeList("Red Velvet","它继承了f（x）的独特性和错误女孩的形象，但与此同时，它也意味着少女时代的友善，年轻而可爱的形象继承并创造出各种魅力。","redvelvet3");
        //출처 http://www.flickr.com/photos/59143760@N00/20412994482
        MadeList a9 = new MadeList("Wanna One","组名Wanna One源自'101'的发音，标题为'Produce 101 Season 2'，这意味着每个人都是一个。","wannaone3");
        MadeList a10 = new MadeList("東方神起","团队名称的意思是“上帝正在东方发生。” 这表明该集团本身是一个旨在赢得亚洲音乐市场的计划项目。 ","dongbangsingi3");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KstarchineseActivity.class); // 다음넘어갈 화면


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
