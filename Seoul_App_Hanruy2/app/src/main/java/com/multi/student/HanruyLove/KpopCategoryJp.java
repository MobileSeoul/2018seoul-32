package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KpopCategoryJp extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("防弾少年団","生きていきながら10代難しいことを経験し偏見と抑圧を受ける。防弾少年団がそれを防いで出すという深い意味を盛る。","bts2");
        //출처 http://www.flickr.com/photos/42438955@N05/12986783935
        MadeList a2 = new MadeList("PSY","心理と本名を「再ペア」と呼ばれ、名前をPSYと犯された。","psy2");
        //출처 http://www.flickr.com/photos/42438955@N05/15286315131
        MadeList a3 = new MadeList("BigBang","2000年代後半から、これまでの若い層のファッショントレンド、以後出たアイドルグループと韓国歌謡界に多大な影響力を及ぼしたグループであり、今のYGを立てた張本人である。","bigbang2");
        //출처 http://www.flickr.com/photos/42438955@N05/15250823940
        MadeList a4 = new MadeList("Super Junior","「アジアの登竜門」というタイトルでデビューした。最初のデビュー舞台に、1000人を超えるファンが殺到した異例の記録はまだ破られている。","superjunior2");
        //출처 http://www.flickr.com/photos/44124401641@N01/4735595906
        MadeList a5 = new MadeList("Twice","MnetのサバイバルプログラムSIXTEENを通じて選抜され、今のTWICEメンバーとして活動している。 ","twice2");
        //출처 http://www.flickr.com/photos/59143760@N00/29203651312
        MadeList a6 = new MadeList("EXO","EXOというチーム名は、太陽系外の太陽系外惑星を意味する「exo planet」でモチーフを得た「未知の世界から来た新しい人間」という意味が込められている。","exo2");
        //출처 http://www.flickr.com/photos/114085395@N04/28698712911
        MadeList a7 = new MadeList("BlackPink"," YGの長いかちかち隠しておき、解放された宝石という言葉にふさわしく、メンバー全体的に歌と踊りなど多方面でかなりの実力を持っている。","blackpink2");
        //출처 http://www.flickr.com/photos/159214125@N04/26132928169
        MadeList a8 = new MadeList("Red Velvet"," f（x）の独特の風変わりな少女のイメージを引き続き受けるが、同時に、少女時代の身近さ、スポーティで愛らしいイメージも継承し、さまざまな魅力を作る意味を持っている。","redvelvet2");
        //출처 http://www.flickr.com/photos/59143760@N00/20412994482
        MadeList a9 = new MadeList("Wanna One","グループ名Wanna Oneは「プロデュース101シーズン2」のタイトルである「101」の発音から取ってきたすべてが一つになるという意味だという。","wannaone2");
        MadeList a10 = new MadeList("TVXQ","チーム名は「東方の神が起きる」という意味だ。これにより、このグループ自体がアジア音楽市場制覇を目標に計画されたプロジェクトであることを推察させる。","dongbangsingi2");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KstarjapanActivity.class); // 다음넘어갈 화면


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
