package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KdramaCategoryJp extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("あなたが眠ってる間に","誰かに近づく不幸な出来事、事故を夢にプレビューすることができている女性とその夢が現実になることを防ぐために苦労している検査の話を描いている。","dangzamsa2");
        MadeList a2 = new MadeList("愛の温度","オンラインチャットで始め、現実に出会ったドラマ作家志望の女性とフレンチシェフを夢見る男、そして様々な周辺人物を介して表面的な関係に手懐けられている青春の愛との関係を描くドラマ。","sarang2");
        MadeList a3 = new MadeList("サムマイウェイ","世界が見る足りないスペックのためにマイナー生活を余儀なくされている現実の中でも、他人が言うことを「マイウェイ」を行こうとマイナーリーグ青春のゴール殴る成長のロマンスを描いたドラマだ。.","ssam2");
        MadeList a4 = new MadeList("ドクターズ","過去の傷を乗り越えて医師になった二人の男女が複数の人間群像を会いに成長して、一生一度だけ恋を開始するヒューマンメディカルドラマ。","doctors2");
        MadeList a5 = new MadeList("鬼","不滅の人生を終了させるため、人間の花嫁が必要鬼、彼と奇妙な同居を始めた記憶喪失死神。そんな彼らの前に「鬼の花嫁」と主張している」死んでなければすることが運命」の少女が表示され、広がる神秘的なロマンチックな物語を扱った作品。","doggabi2");
        MadeList a6 = new MadeList("星から来たあなた","作家の無茶で不合理な想像が加わったファクションロマンスで、400年前の地球に落ちたエイリアンドミンジュン（キム・スヒョン）とワンサガジ韓流女神トップスターチョンソンイ（チョン・ジヒョン）の奇跡のような甘くはつらつロマンスを描いたドラマだ。","bulgudae2");
        MadeList a7 = new MadeList("太陽の末裔","低迷期に陥っていた地上波ドラマを再起こし立てドラマであり、事前製作ドラマブームの張本人である。","taeyang2");
        MadeList a8 = new MadeList("華遊記","古代小説西遊記をモチーフに退廃悪童妖怪孫悟空と上品なジェントル妖怪オマワンが暗い世界で光を訪ねて行く旅を描いた絶対ロマンチック退魔極である。","hwayugi2");
        MadeList a9 = new MadeList("またオ・ヘヨン","オヘヨウンという名前の二人の女性との将来を見始めた人のバクドギョンの間で生じる誤解やロマンスを素材とするドラマだ。ジャンルはミステリーが加わったロマンスコメディを装った本格心理ファンタジーメロー。","ddoohaeyoung2");
        MadeList a10 = new MadeList(" 応答せよ1997","現在アイドルブームの始まりされたH.O.T.とジェクスキスが活動していた1997年の姿を描いたtvNの2012年作トレンディドラマ。","oungpal2");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KdramajapanActivity.class); // 다음넘어갈 화면


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
