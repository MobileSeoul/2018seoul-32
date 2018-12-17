package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KpopCategory extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listview);
        mlist = new ArrayList<>();
        MadeList a1 = new MadeList("BTS","살아가면서 10대는 힘든 일을 겪고 편견과 억압을 받는다. 방탄소년단이 그것을 막아내겠다는 심오한 뜻을 담는다.","bts");
        //출처 http://www.flickr.com/photos/42438955@N05/12986783935
        MadeList a2 = new MadeList("싸이","싸이코와 본명을 재쌍이(재상이)라고 불려 이름을 PSY라 짓게 되었다.","psy");
        //출처 http://www.flickr.com/photos/42438955@N05/15286315131
        MadeList a3 = new MadeList("빅뱅","2000년대 중후반에서 지금까지 젊은 층의 패션 트렌드, 이후 쏟아져나온 아이돌 그룹 및 한국 가요계에 엄청난 영향력을 끼친 그룹이며, 지금의 YG를 세운 장본인이다.","bigbang");
        //출처 http://www.flickr.com/photos/42438955@N05/15250823940
        MadeList a4 = new MadeList("슈퍼주니어","'아시아의 등용문'이라는 타이틀로 데뷔했다. 첫 데뷔 무대에 1000명이 넘는 팬들이 운집한 이례적인 기록은 아직도 깨지지 않고 있다.","superjunior");
        //출처 http://www.flickr.com/photos/44124401641@N01/4735595906
        MadeList a5 = new MadeList("트와이스","Mnet의 서바이벌 프로그램 SIXTEEN을 통해 나연, 정연, 모모, 사나, 지효, 미나, 다현, 채영, 쯔위(나이 순)가 선발되어 지금의 TWICE 멤버로 활동하고 있다. ","twice");
        //출처 http://www.flickr.com/photos/59143760@N00/29203651312
        MadeList a6 = new MadeList("엑소","EXO라는 팀명은 태양계 밖의 외계행성을 뜻하는 'exoplanet'에서 모티브를 얻었으며 '미지의 세계에서 온 새로운 인간'이라는 의미가 담겨 있다.","exo");
        //출처 http://www.flickr.com/photos/114085395@N04/28698712911
        MadeList a7 = new MadeList("블랙핑크"," YG의 오랫동안 꽁꽁 숨겨두었다가 풀어놓은 보석이란 말에 걸맞게 멤버 전체적으로 노래와 춤 등 다방면으로 상당한 실력을 갖고 있다. ","blackpink");
        //출처 http://www.flickr.com/photos/159214125@N04/26132928169
        MadeList a8 = new MadeList("레드벨벳"," f(x)의 독특함과 엉뚱한 소녀의 이미지를 이어받지만 동시에 소녀시대의 친근함, 발랄하고 사랑스러운 이미지도 계승하며 다양한 매력을 만든다는 의미를 갖고 있다.","redvelvet");
        //출처 http://www.flickr.com/photos/59143760@N00/20412994482
        MadeList a9 = new MadeList("워너원","그룹명 Wanna One은 ‘프로듀스 101 시즌2’의 제목인 ‘101(원오원)'의 발음에서 따왔고 모두가 하나가 된다라는 의미라고 한다.","wannaone");
        MadeList a10 = new MadeList("동방신기","팀명은 '동방에서 신이 일어나다'는 의미다. 이를 통해 이 그룹 자체가 아시아 음악 시장 제패를 목표로 계획된 프로젝트임을 짐작케 한다. ","dongbangsingi");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KstarMainActivity.class); // 다음넘어갈 화면


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
