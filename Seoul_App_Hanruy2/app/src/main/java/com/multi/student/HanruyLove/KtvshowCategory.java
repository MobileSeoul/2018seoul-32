package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KtvshowCategory extends AppCompatActivity {
    ListView listView;
    ArrayList<MadeList> mlist;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listview);

        MadeList a1 = new MadeList("무한도전"," 매주 다양한 포맷으로 변화하는 모습은 무도만의 예능적 아이덴티티를 가지게 했으며 앞서 언급한 리얼한 캐릭터쇼와 시너지 효과를 일으키며 단숨에 당대 최고 인기 예능이자 예능계 패러다임을 완전히 뒤바꿔버린다.","muhandozun");
        MadeList a2 = new MadeList("우리 결혼했어요","가상으로 결혼했다는 설정을 가지고 출발해서 최대한 리얼하게 표현하는 예능프로. 무엇보다 팬들이 궁금해하는 사석에서의 모습과 생활, 성격을 가까이에서 비교적 오랫동안 자연스럽게 관찰할수 있고, 이성앞에서 어떤 모습인지, 어떻게 어필하는지를 보며 이성으로서의 매력요소를 엿볼수 있다. ","ougul");
        MadeList a3 = new MadeList("런닝맨"," 기본적으로 백화점이나 고층빌딩 등의 도시를 배경으로 한 리얼 버라이어티이다. 이와 동시에 게임과 액션 요소를 가미한 형식의 프로그램이라는 것. 즉 무한도전 컨셉 중 하나인 추격전만 방송한다고 볼 수 있다.","runningman");
        MadeList a4 = new MadeList("비정상회담","12개국 출신의 20~30대 남성 출연진들이 한국 사회에 관한 하나의 주제를 놓고 다양한 관점에서 토론을 진행하는 방식을 취하고 있다.","bijungsang");
        MadeList a5 = new MadeList("나혼자산다","독신 연예인들의 자취생활과 혼자놀기를 적나라하게 보여준다.","nahonza");


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        KenterMainActivity.class); // 다음넘어갈 화면


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
