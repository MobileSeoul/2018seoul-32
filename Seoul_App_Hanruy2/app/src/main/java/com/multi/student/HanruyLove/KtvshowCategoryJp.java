package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KtvshowCategoryJp extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("無限挑戦","毎週様々なフォーマットに変化する様子は、武道だけの芸能的アイデンティティを持つようにしており、前述したリアルなキャラクターショーとの相乗効果を起こし、一気に当代最高の人気芸能であり、芸能界のパラダイムを完全に後変えてしまう。","muhandozun2");
        MadeList a2 = new MadeList("私たち結婚しました","仮想的に結婚した設定を持って出発して可能な限りリアルに表現する芸能プロ。何よりもファンが心配している私的な席での姿と生活、性格を近くで比較的長時間自然観察できていて、異性の前でどんな姿なのか、どのようにアピールするかを見て、異性としての魅力の要素をうかがうている。 ","ougul2");
        MadeList a3 = new MadeList("ランニングマン","基本的にはデパートや高層ビルなどの都市を背景にしたリアルバラエティーである。これと同時に、ゲームやアクション要素を加味した形式のプログラムとのこと。つまり無限挑戦のコンセプトの一つであるチェイスのみ放送すると見ることができる。","runningman2");
        MadeList a4 = new MadeList("非頂上會談","12カ国出身の20〜30代の男性出演陣が韓国社会の1つのテーマを置いて、さまざまな観点から議論を進行する方式をとっている。","bijungsang2");
        MadeList a5 = new MadeList("私一人住んでいる","独身芸能人の自炊生活と一人で遊ぶことを赤裸々に見せてくれる。","nahonza2");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KenterjapanActivity.class); // 다음넘어갈 화면


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
