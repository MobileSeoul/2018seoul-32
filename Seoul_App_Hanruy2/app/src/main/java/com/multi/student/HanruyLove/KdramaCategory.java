package com.multi.student.HanruyLove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KdramaCategory extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("당신이 잠든 사이에","누군가에 닥칠 불행한 사건, 사고를 꿈으로 미리 볼 수 있는 여자와 그 꿈이 현실이 되는 것을 막기 위해 고군분투하는 검사의 이야기를 그리고 있다.","dangzamsa");
        MadeList a2 = new MadeList("사랑의 온도","온라인 채팅으로 시작해 현실에서 만나게 된 드라마 작가 지망생 여자와 프렌치 쉐프를 꿈꾸는 남자, 그리고 다양한 주변 인물들을 통해 피상적인 관계에 길들여져 있는 청춘들의 사랑과 관계를 그리는 드라마.","sarang");
        MadeList a3 = new MadeList("쌈마이웨이","세상이 보기엔 부족한 스펙 때문에 마이너 인생을 강요하는 현실 속에서도, 남들이 뭐라하든 '마이웨이'를 가려는 마이너리그 청춘들의 골 때리는 성장로맨스를 담은 드라마다.","ssam");
        MadeList a4 = new MadeList("닥터스","과거의 상처를 딛고 의사가 된 두 남녀가 여러 인간 군상을 만나며 성장하고, 평생 단 한번뿐인 사랑을 시작하는 휴먼 메디컬 드라마.","doctors");
        MadeList a5 = new MadeList("도깨비","불멸의 삶을 끝내기 위해 인간 신부가 필요한 도깨비, 그와 기묘한 동거를 시작한 기억상실증 저승사자. 그런 그들 앞에 '도깨비 신부'라 주장하는 '죽었어야 할 운명'의 소녀가 나타나며 벌어지는 신비로운 낭만 설화를 다룬 작","doggabi");
        MadeList a6 = new MadeList("별에서 온 그대"," 작가의 엉뚱하고 황당한 상상이 더해진 팩션 로맨스로, 400년 전 지구에 떨어진 외계인 도민준(김수현)과 왕싸가지 한류여신 톱스타 천송이(전지현)의 기적과도 같은 달콤 발랄 로맨스를 그린 드라마다. ","bulgudae");
        MadeList a7 = new MadeList("태양의 후예","침체기에 빠져 있던 지상파 드라마를 다시 일으켜 세운 드라마이자 사전제작 드라마 열풍의 장본인이다.","taeyang");
        MadeList a8 = new MadeList("화유기","고대소설 서유기를 모티브로 퇴폐적 악동요괴 손오공과 고상한 젠틀요괴 우마왕이 어두운 세상에서 빛을 찾아가는 여정을 그린 절대낭만 퇴마극이다.","hwayugi");
        MadeList a9 = new MadeList("또오해영","오해영이라는 이름이 같은 두 여자와 미래를 보기 시작한 남자 박도경 사이에서 생기는 오해와 로맨스를 소재로 하는 드라마다. 장르는 미스터리가 더해진 로맨스 코미디를 가장한 본격 심리 판타지 멜로.","ddoohaeyoung");
        MadeList a10 = new MadeList("응답하라1997","현재 아이돌 열풍의 시초가 된 H.O.T.와 젝스키스가 활동하던 1997년의 모습을 그려낸 tvN의 2012년 작 트렌디 드라마.","oungpal");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KdramaMainActivity.class); // 다음넘어갈 화면


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
