package com.multi.student.HanruyLove;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;


import static com.multi.student.HanruyLove.AddAdapter.newname;


public class KstarMainActivity extends AppCompatActivity {
    ListView clist;
    ArrayList<Productadd> plist;
    AddAdapter adapter;
    SQLiteDatabase db;
    static String address;
    static String tel;
    static String about;
    static String textaddress;
    TextView name;
    int draw1,draw2,draw3;



    @Override
    protected void onStart() {
        super.onStart();
        createDB();
        createTable();
        insertData();
        selectData();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmain);

        Intent i = getIntent();
        newname = i.getStringExtra("name");
        clist = (ListView)findViewById(R.id.clist);
        plist = new ArrayList<>();
        name = (TextView) findViewById(R.id.name);
        name.setText(i.getStringExtra("listname"));

        adapter = new AddAdapter(this, R.layout.additemlist,plist);
        clist.setAdapter(adapter);

        clist.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        AboutActivity.class); // 다음넘어갈 화면


                intent.putExtra("name", plist.get(position).getName());


                startActivity(intent);
            }
        });
    } // end of onCreate





    public void createDB() {
        db = openOrCreateDatabase
                ("member.db", Context.MODE_PRIVATE, null);
    }

    public void createTable() {
        String q;
        q= "drop table if exists bigbang ";
        db.execSQL(q);
        q= "drop table if exists exo ";
        db.execSQL(q);
        q= "drop table if exists bts";
        db.execSQL(q);
        q= "drop table if exists blackpink ";
        db.execSQL(q);
        q= "drop table if exists twice";
        db.execSQL(q);
        q= "drop table if exists redvelvet";
        db.execSQL(q);
        q= "drop table if exists psy";
        db.execSQL(q);
        q= "drop table if exists wannaone";
        db.execSQL(q);
        q= "drop table if exists superjunior";
        db.execSQL(q);
        q= "drop table if exists dongbangsingi";
        db.execSQL(q);




        q = "create table if not exists bigbang(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists exo(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bts(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists blackpink(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists twice(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists redvelvet(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists psy(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists wannaone(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists superjunior(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dongbangsingi(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into bigbang values('1','YG샵','YG샵은 빅뱅, 싸이, 2NE1 등 한류 스타가 소속된 YG엔터테인먼트의 로고와 소속 가수를 모티브로 제작된 상품을 전시하고 판매하는 매장이다. 롯데 영플라자(명동점) 편집매장 내에 부스 형태로 입점해 소속가수 CD, 옷, 문구류, 사진첩 등 다양한 상품을 볼 수 있다.','100-092  서울특별시 중구 남대문로 67 (남대문로2가) ','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang values('2','YG 엔터테이먼트','YG엔터테인먼트는 국내 대표적인 연예기획사 중 하나로, 빅뱅, 싸이, 위너, 아이콘, 블랙핑크, 에픽하이, 강동원, 이종석 등의 소속사이다. 마포구 합정동에 자리해 있는 사옥은 독특하면서도 세련된 외관 디자인이 특징이다. 합정역 8번 출구를 이용하면 보다 접근하기 쉽다.','04028 서울 마포구 희우정로1길 3 (YG엔터테인먼트) ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang values('3','삼거리푸줏간 센트럴시티점','YG엔터테인먼트에서 운영하는 고깃집으로, 최근 홍대에서 센트럴시티로 확장 이전했다. 빅뱅의 승리, 산다라박 등 YG 소속 연예인들뿐만 아니라 이승기, 이서진 등 인기 연예인들도 다녀갔다. 위너 등 YG 소속 아티스트들이 이곳에서 종종 파티를 열기도 한다고. 벽면에 걸린 연예인들의 기념 사진과 사인들을 찾아보는 재미도 쏠쏠하다.\n" +
                "자리는 바뀌었지만 맛은 한결같다. 대표메뉴 돼지갈비는 두툼한 두께를 자랑하며, 자극적이지 않은 은은한 단맛이 인기 요인. 한우로 맛을 낸 육수에 담백한 메밀면을 담아낸 평양냉면, 진한 맛이 일품인 한우된장말이밥도 별미다.','06545 서울 서초구 사평대로 205 (반포동, CENTRALCITY반포천 복개주차장)','02-6052-0103','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang values('4','엔드히어','벨기에 리에주 지역의 와플을 직수입, 판매하는 앤드히어는 빅뱅 멤버 승리의 어머니가 운영하는 대학로 와플 맛집이다. 장시간의 발효과정을 거쳐서 만드는 정통 벨기에 와플은 겉은 바삭하면서도 속은 촉촉해서, 별다른 토핑이 없어도 그 자체로 쫀득한 식감과 풍부한 맛을 자랑한다. 와플 이외에도 피자와 맥주, 부드러운 커피와 세계 여러 나라의 다양한 수제차, 와인도 즐길 수 있다. 모던하면서도 세련된 인테리어의 넓은 매장에 야외 테라스를 포함해 다양한 테이블을 배치해 여유롭고 쾌적한 휴식을 제공한다. 매장 2층에서는 인디밴드 등 소규모 공연도 펼쳐진다.\n" +
                "\n" +
                "빅뱅 승리 어머니의 와플카페로 잘 알려진 앤드히어는 공연예술의 메카 대학로에 위치해 빅뱅의 팬들은 물론 국내외 관광객들의 발길이 끊이지 않는 한류 명소 중 하나다. 이곳을 방문한 많은 스타들이 남긴 사인컵들을 보는 재미도 있다.','03085 서울 종로구 동숭길 90 (동숭동) ','02–744-8464','http://andhere.co.kr/')";
        db.execSQL(q);
        q = "insert into bigbang values('5','아오리라멘','각각의 멤버들이 다양한 분야에서 그 매력을 더하고 있는 빅뱅. 그 중 승리는‘아오리의 행방불명’이라는 이름의 일본 라멘 가게를 운영하고 있다. 일본에서 유명한 라멘집은 다 가보았을 만큼 라멘 마니아인 승리가 일본에서 친분을 쌓은 주방장들과 함께 레시피를 개발했다.\n" +
                " \n" +
                "그렇게 탄생한 아오리 라멘이 주 메뉴. 5가지의 기본 고명(차슈, 아지타마고, 파, 멘마, 김)이 올라간 아오리 라멘과 2가지 고명(차슈, 파)이 올라간 아오리 라멘 라이트가 있다. 아오리 라멘은 돼지 뼈로 국물을 낸 돈코츠라멘에 속하는데, 진하고 깊은 맛이 누가 먹어도‘엄지척’을 할 만큼 맛이 일품이다. 돼지 누린내가 전혀 없고, 얼큰하면서 고소한 맛이 나 해장에도 딱 좋다.\n" +
                " \n" +
                "일본식 간장계란밥인 TKG도 별미다. 따끈한 밥 위에 날 노른자와 고명을 올려 간장에 비벼 먹는 음식으로, 아오리 라멘의 진한 국물과 함께 먹으면 더욱 고소하다. 한 명씩 앉는 일본 특유의 다다미석이 있어 혼밥, 혼술 하기에도 제격. 바로 아래층의 밀땅포차는 가수 정준영이 운영하는데, 실제로 정준영을 비롯해 FT아일랜드 멤버, 배우 하석진 등이 아오리라멘을 자주 찾는다.','06014 서울 강남구 도산대로57길 7 (청담동) 3층 ','02-518-3767','http://www.ygfamily.com/')";
        db.execSQL(q);




        q= "insert into exo values('6','두루','EXO의 멤버 디오가 모 잡지에 추천한 식당. 디오 외에도 시우민, 세훈 등 EXO 멤버들이 자주 찾는다는 청담에 위치한 이 식당은 대한민국 레스토랑 가이드북인 <블루리본 서베이>에서 블루리본을 3개나 받았을 정도로 평이 좋다. \n" +
                "깔끔하고 정갈한 분위기를 자랑하는 이 식당의 인기 메뉴는 디오가 추천한 낙지볶음과 주먹밥이다. 깔끔하게 매운 낙지볶음과 함께 입안을 편안하게 진정시켜주는 고소한 주먹밥, 직접 담근다는 맛깔스러운 밑반찬의 조합이 일품이다. 여기에 추천하는 메뉴가 한 가지 더 있는데, 바로 자색고구마 막걸리이다. 발그스레한 두 뺨처럼 어여쁜 색을 띠는 이 자색고구마 막걸리는 낙지볶음과 합이 좋아 손님들이 자주 같이 찾는다.','06064 서울 강남구 선릉로148길 28 (청담동)','02-3443-8834','')";
        db.execSQL(q);
        q= "insert into exo values('7','비바폴로 열매점','비바폴로 열매점은 맛있는 이탈리안 레스토랑으로 유명하기도 하지만, 그보다는 그룹 EXO의 멤버인 찬열의 어머니가 운영하시는 음식점으로 더 유명하다. 가장 인기 있는 메뉴는 김치 아라비아따와 피자 종류이다.','05257 강동구 양재대로 1631 2층','02-442-7885','')";
        db.execSQL(q);
        q= "insert into exo values('8','SMTOWN코엑스 아티움','전 세계 K-pop 팬들이라면 모를 수 없는 SM엔터테인먼트의 복합 문화 공간인 SMTOWN 코엑스 아티움. 특히 ‘SMTOWN 뮤지엄’과 초고화질 전광판 ‘SMTOWN 외벽 미디어’가 2018년 5월에 문을 열어 높은 관심을 모으고 있다.\n" +
                "3층에 자리한 SMTOWN 뮤지엄은 엔터테인먼트 기업 최초로 SM엔터테인먼트 소속 아티스트들의 탄생과 성장 과정을 집대성한 공간이다. 음악 앨범, 활동 모습, 의상과 소품, 비하인드 스토리 등을 감상할 수 있는 SM ARCHIV(에스엠 아카이브), SPECIAL EXHIBITION(스페셜 엑시비션), ARTIST GALLERY(아티스트 갤러리) 등 다양한 전시가 마련되어 있다. 또한 SM 콘텐츠 제작 과정 관람, 증강현실(AR), VR 등 신기술을 활용한 SM 아티스트와의 가상 만남 등 K-pop팬들에게 색다른 경험과 즐거움을 선사하고 있다. \n" +
                "\n" +
                "SMTOWN 외벽 미디어는 농구장 네 배에 달하는 크기로, 국내 최대 규모다. 그 때문에 ‘한국의 타임스스퀘어’라는 별명이 붙을 정도. 이곳에서 K-pop 뮤직비디오뿐 아니라 실시간 멀티 라이브 방송 채널 !t Live(잇라이브) 등이 생중계된다.\n" +
                "5~6층에는 국내 최대 홀로그램 씨어터가 있다. SM 소속 아티스트의 콘서트 영상이 주로 상영되는데, 아직 DVD로 발매되지 않은 콘서트가 상영되기도 한다. 상영 스케줄을 체크할 것! 그 밖에도 아티스트가 실제로 착용하거나 고른 아이템 등을 살 수 있는 기프트샵(2층), 카페와 SM 아티스트의 이미지를 담은 다양한 상품을 판매하는 마켓(4층) 등이 있다.','06164 서울 강남구 영동대로 513 (삼성동, 코엑스)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);




        q= "insert into bts values('9','난장캠프','신사역 8번 출구에서 조금 걷다 보면 눈길을 사로잡는 가게가 있다. 바로 웹 예능 꽃미남 브로맨스에서 신화 이민우가 방탄소년단 정국을 데려간 캠핑 컨셉의 고깃집 난장캠프. 곳곳에 마련된 텐트와 바닥에 깔려있는 자갈들이 정말 캠핑장에 온 듯한 기분이 들게 한다. 세트 메뉴를 주문하면 고기와 소시지, 탕 종류를 한 번에 맛볼 수 있다. 고소하고 부드러운 고기를 즐기다 칼칼한 김치찌개로 입가심을 하면 이미 캠핑장 한가운데에 있는 느낌! \n" +
                "참고로 이민우와 정국이 앉은 자리는 창가 왼쪽에 위치해 있다. 방탄소년단과 신화의 팬들에게 인기가 매우 많으니 이곳에 앉으려면 타이밍이 중요하다.','06034 서울 강남구 강남대로158길 27 (신사동)','02-3443-6466','https://nanjangcampgarosu.modoo.at/')";
        db.execSQL(q);
        q= "insert into bts values('10','Addicted','에딕티드는 고샤루브친스키, OUR LEGACY, LEMAIRE, KITSUNE, 탑맨 등 다양한 브랜드를 한눈에 볼 수 있는 수입 의류 편집숍이다. 최근 젝스키스, 샤이니 태민과 키, 비투비, 로꼬, 트와이스 채영, 방탄소년단 등 국내 스타들이 에딕티드의 제품을 착용했다.','06018 서울 강남구 선릉로155길 24','02-547-7332','http://www.addicted.kr/')";
        db.execSQL(q);
        q= "insert into bts values('11','더 민스','2AM과 옴므의 감성 보컬리스트 창민의 어머니가 운영하는 카페로, 창민이 자주 머무르는 곳이다. 여름철에는 시원한 수제 에이드와 아이스크림 등이, 겨울철에는 라임, 레몬생강, 애플시나몬 등의 정성 가득한 유기농 차가 인기 메뉴다. 한류 팬들을 위한 영어, 일본어, 중국어로 기재된 메뉴판이 준비되어 있다.\n" +
                "\n" +
                "인기 아이돌그룹 방탄소년단 멤버들이 즐겨 찾는 곳으로, 방탄소년단의 트위터를 통해 인증샷이 화제가 된 바 있다. 더민스에서 방탄소년단 멤버들의 애정 넘치는 메시지를 찾아보자!','\n" +
                "06018  서울 강남구 압구정로 330 (신사동)  1층 112호','02-512-1452','')";

        db.execSQL(q);



        q= "insert into blackpink values('12','내맘대로폰케이스','블랙핑크도 다녀갈 만큼 재미 있는 이색 체험이 기다리는 곳. 바로, 휴대전화 케이스를 원하는 대로 만들어볼 수 있는 내맘대로폰케이스 홍대점이다. 각양각색의 액세서리 중 마음에 드는 것을 고르고, 한편에 자리한 편한 좌석에 앉아 세상에 단 하나뿐인 핸드폰 케이스를 만들면 된다. 친절한 직원이 상주해 방법을 안내해 준다. 카페도 함께 운영한다.','서울 마포구 와우산로19길 21','02-322-6682',' http://www.nemamke.com')";
        db.execSQL(q);
        q= "insert into blackpink values('13','노러쉬','블랙핑크 멤버 제니가 SNS 계정에 사진을 올려 화제가 됐던 곳. ‘좋아요’ 수 50만을 기록하며 공간에 관한 궁금증을 유발했다. 식물과 빈티지 가구로 장식한 실내는 ‘서두르지 않기(No Rush)’라는 이름에 걸맞게 편안한 분위기를 제공한다. 대표 메뉴는 라자냐와 서양식 아침식사다. 알맞게 익은 수란과 아스파라거스, 감자 퓨레, 베이컨, 샐러드가 함께 나오는 메뉴는 든든한 아침 겸 점심 식사가 된다. 부드러운 라자냐에 소고기로 만든 풍미 깊은 토마토 소스가 어우러진 로제 미트소스 라자냐도 추천 메뉴다. ','서울 마포구 동교로30길 17','010-7678-7728','')";
        db.execSQL(q);
        q= "insert into blackpink values('14','문샷 엘큐브 홍대점','실력으로도, 외모로도 ‘대세’, 블랙핑크의 화장법을 따라잡고 싶다면? 문샷 엘큐브 홍대점으로 가자. 리사, 로제, 제니, 지수가 직접 사용하는 메이크업 제품을 만나볼 수 있다. 다양한 기초 및 색조 화장품을 갖추고 있는데, 그중 ‘크림 페인트 라이트핏’ 틴트는 블랙핑크 팬들에게 가장 인기 있는 제품 중 하나다. 자연스럽고 다양한 색상에 산뜻한 사용감이 더해져 지금 가장 ‘핫’한 그녀들의 화장법을 완성할 수 있다.','서울 마포구 홍익로6길 4','02-326-5656','https://moonshot-cosmetics.com/ko/board/off-line-store/13')";
        db.execSQL(q);
        q= "insert into blackpink values('15','삼거리 푸줏간','홍대에 많고 많은 고기집 중 블랙핑크의 선택을 받은 곳은 삼거리 푸줏간. 세련되고 널찍한 공간에서 양질의 한국식 바비큐를 즐길 수 있다. 블랙핑크가 좋아하는 메뉴는 YG 패밀리 세트다. 다양한 부위의 고기를 할인된 가격에 맛볼 수 있고, 양도 푸짐하다. 이곳의 고기는 두툼하고 신선한 것이 특징. 멋스럽게 복고풍의 종이에 싸여 나온다. 함께 나오는 ‘멜젓’에 찍어 먹으면 감칠맛이 일품이다. 블랙핑크의 팬이라면 홉의 쌉쌀한 향이 매력적인 맥주, ‘YG 라거’를 곁들이길 추천한다. 매장 벽면에 멤버들의 친필 사인도 많다. ','서울 마포구 와우산로 72','02-337-3892',' http://www.instagram.com/3geori_butchers')";
        db.execSQL(q);

        q= "insert into twice values('16','JYP엔터테이먼트','JYP엔터테인먼트는 국내 대표적인 연예기획사 중 하나로, 원더걸스, 2AM, 2PM, 미쓰에이, GOT7, 트와이스 등의 소속사이다. JYP사옥 인근에는 큐브엔터테인먼트, SM엔터테인먼트 신사옥, FNC엔터테인먼트, 한류 스타들의 아트토이가 설치된 케이스타로드(K-starroad)가 있다.','06012 서울 강남구 압구정로79길 41 (청담동)','02-3438-2300','http://www.jype.com/')";
        db.execSQL(q);
        q= "insert into twice values('17','두레한식당','60여 년 전 경남 밀양에서 개업한 이래, 인사동에서 2대에 걸쳐 명맥을 이어온 유명 한정식 레스토랑이다. 제철 식재료로 만든 정갈하고 깔끔한 한정식 코스와 일품요리를 제공한다. 한식이 익숙지 않은 외국 관광객이라면 석쇠에 구운 떡갈비 메뉴, 산채비빔밥 반상 등을 추천한다.\n" +
                "\n" +
                "가요프로그램 <인기가요> MC로 활약 중인 미녀 자매, 배우 공승연과 인기 걸그룹 트와이스의 정연의 부친인 유창준 셰프가 활동하고 있는 한식당이다. 유창준 셰프는 서울 유명 호텔에서 20년 이상 경력을 쌓은 실력파 셰프로 알려져 있다.','05551 서울 송파구 올림픽로 300 (신천동) 롯데백화점 에비뉴엘 월드파타워점 6F','02-3213-2638','')";
        db.execSQL(q);
        q= "insert into twice values('18','더 스트리트','배우 이정진이 운영하는 브런치 카페로, 유명 연예인들이 즐겨 찾는 장소로 유명하다. 김치필라프와 차돌박이 된장 파스타 등의 퓨전 요리가 인기이며, 바질페스토 크림파스타는 갓세븐의 멤버 잭슨이 좋아하는 메뉴라고. 그 밖에도 배우 강소라와 박한별, 트와이스의 쯔위 등이 자주 찾는 것으로 알려져 있다. 아늑한 분위기로 꾸며져 있어 조용한 분위기 속에서 식사를 즐길 수 있으며, 저녁 시간에는 은은한 조명으로 바뀌어 낮과는 다른 분위기를 느낄 수 있다.','06013 서울 강남구 도산대로 529 (청담동, KRA프라자)','02-547-8898','')";
        db.execSQL(q);




        q= "insert into redvelvet values('19','SM사옥','SM엔터테인먼트는 국내 대표적인 연예기획사 중 하나로, 보아, 소녀시대, 슈퍼주니어, 샤이니, 엑소, 레드벨벳 등 한류 스타들의 소속사이다. 사옥은 강남구 청담동에 있다. 사옥 지하 1층에 있는 SUM 마켓에서는 SM 소속 아티스트와 여러 아티스트와의 콜라보레이션으로 만든 작품을 판매한다.','06012 서울 강남구 선릉로190길 114 (청담동)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into redvelvet values('20','SMTOWN코엑스 아티움','전 세계 K-pop 팬들이라면 모를 수 없는 SM엔터테인먼트의 복합 문화 공간인 SMTOWN 코엑스 아티움. 특히 ‘SMTOWN 뮤지엄’과 초고화질 전광판 ‘SMTOWN 외벽 미디어’가 2018년 5월에 문을 열어 높은 관심을 모으고 있다.\n" +
                "3층에 자리한 SMTOWN 뮤지엄은 엔터테인먼트 기업 최초로 SM엔터테인먼트 소속 아티스트들의 탄생과 성장 과정을 집대성한 공간이다. 음악 앨범, 활동 모습, 의상과 소품, 비하인드 스토리 등을 감상할 수 있는 ‘SM ARCHIVE’(에스엠 아카이브), ‘SPECIAL EXHIBITION’(스페셜 엑시비션), ‘ARTIST GALLERY’(아티스트 갤러리) 등 다양한 전시가 마련되어 있다. 또한 SM 콘텐츠 제작 과정 관람, 증강현실(AR), VR 등 신기술을 활용한 SM 아티스트와의 가상 만남 등 K-pop팬들에게 색다른 경험과 즐거움을 선사하고 있다. \n" +
                "\n" +
                "SMTOWN 외벽 미디어는 농구장 네 배에 달하는 크기로, 국내 최대 규모다. 그 때문에 ‘한국의 타임스스퀘어’라는 별명이 붙을 정도. 이곳에서 K-pop 뮤직비디오뿐 아니라 실시간 멀티 라이브 방송 채널 ‘!t Live(잇라이브)’ 등이 생중계된다.\n" +
                "5~6층에는 국내 최대 홀로그램 씨어터가 있다. SM 소속 아티스트의 콘서트 영상이 주로 상영되는데, 아직 DVD로 발매되지 않은 콘서트가 상영되기도 한다. 상영 스케줄을 체크할 것! 그 밖에도 아티스트가 실제로 착용하거나 고른 아이템 등을 살 수 있는 기프트샵(2층), 카페와 SM 아티스트의 이미지를 담은 다양한 상품을 판매하는 마켓(4층) 등이 있다.','06164 서울 강남구 영동대로 513 (삼성동, 코엑스)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into redvelvet values('21','SUM 마켓','SM 아티스트의 모든 것을 만날 수 있는 곳. SM엔터테인먼트의 사옥인 ‘SM 커뮤니케이션센터’가 한류 팬들의 새로운 아지트가 되었다. 사옥 1층의 SUM 카페와 지하 1층 ‘SM 편의점’으로도 불리는 SUM 마켓이 문을 열었기 때문. ‘동방신기 트러플 초콜릿’, ‘슈퍼주니어 라면’ 등 식료품과 SM 아티스트의 브랜드를 결합한 다양한 MD 상품들을 판매하고 있다.','06084 서울 강남구 삼성로 648 (삼성동)','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);



        q= "insert into psy values('22','그레뱅 뮤지엄','133년 역사의 세계적인 프랑스 밀랍인형 전문 박물관인 그레뱅 뮤지엄(Musée Grévin)이 서울 을지로에 아시아 최초로 개관했다. 그레뱅 뮤지엄에는 존 레논, 마릴린먼로 등 세계적인 유명인사와 함께 싸이, 지드래곤 등 한류스타, 그리고 세종대왕, 이순신 장군 등 한국을 대표하는 역사적인 인물 등 총 80여 개의 밀랍인형이 전시된다. 각 전시 공간은 각각의 컨셉과 테마를 가지고 특별한 세트와 조명으로 구성돼 있으며 실감나는 음향으로 채워져 있다. 관람객들은 스타들과 자유롭게 사진을 찍을 수 있는 것은 물론, 최첨단 기술이 구현된 여러 인터렉티브한 게임을 체험할 수 있다. 이처럼 그레뱅 뮤지엄만의 고품격 전시 공간은 세계 최고 수준의 밀랍인형과 함께 관람객들에게 시간과 공간을 초월하는 환상적이며 생생한 경험을 선사할 것이다.','04523 서울 중구 을지로 23 (을지로1가, 을지로별관)','02-777-4700','http://www.grevin-seoul.com/ko/')";
        db.execSQL(q);
        q= "insert into psy values('23','YG샵','YG샵은 빅뱅, 싸이, 2NE1 등 한류 스타가 소속된 YG엔터테인먼트의 로고와 소속 가수를 모티브로 제작된 상품을 전시하고 판매하는 매장이다. 롯데 영플라자(명동점) 편집매장 내에 부스 형태로 입점해 소속가수 CD, 옷, 문구류, 사진첩 등 다양한 상품을 볼 수 있다.','100-092  서울특별시 중구 남대문로 67 (남대문로2가) ','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into psy values('24','YG 엔터테이먼트','YG엔터테인먼트는 국내 대표적인 연예기획사 중 하나로, 빅뱅, 싸이, 위너, 아이콘, 블랙핑크, 에픽하이, 강동원, 이종석 등의 소속사이다. 마포구 합정동에 자리해 있는 사옥은 독특하면서도 세련된 외관 디자인이 특징이다. 합정역 8번 출구를 이용하면 보다 접근하기 쉽다.','04028 서울 마포구 희우정로1길 3 (YG엔터테인먼트) ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q= "insert into psy values('25','MBC WORLD','문화방송 MBC가 상암동 DMC 단지로 이전하며 기존의 방송국견학프로그램을 진화시킨, 국내 최초 방송테마파크 MBC월드를 선보였다. 방문객들은 MBC 드라마와 인기 예능 프로그램의 주인공이 되어 첨단기술로 구현된 다양한 체험과 영상 관람을 즐기고 실제 방송 제작 현장을 마주할 수 있다. MBC 건물 외부에는 현재 방송중인 프로그램이 미디어보드를 통해 방영되고, 스타들의 핸드프린팅과 실물 크기의 사진이 전시되어 있다. 건물 안에서는 MBC의 역사 체험, 홀로그램 시어터에서 즐기는 GD와 싸이의 공연, 댄스 체험 스튜디오, 가상현실 체험 공간, 트릭아트 포토월, 다양한 어트랙션 체험이 마련되어 있다. 4층에서는 대장금, 기황후 등 드라마를 재현한 촬영 세트장에서 사극의상을 입어볼 수 있고, 7층 MBC 보도국 현장에서는 실제로 뉴스 제작 과정을 살피며 앵커체험을 해볼 수 있다. MBC월드 투어는 매일 9회, 예약제로 운영되며 가이드와 함께 총90분간 진행된다.\n" +
                "\n" +
                "대한민국 최초의 방송테마파크, MBC월드에서는 한류 드라마와 예능 콘텐츠를 중심으로 스타와 함께 춤추고 노래하며 드라마 속 주인공이 되어보는 특별한 체험들을 즐길 수 있다. 가상현실 체험, 댄스 체험 스튜디오, 홀로그램 무대 등 첨단기술을 동원한 체험들이 관광객들에게 특히 인기다. 투어가 끝나면 한류스타들의 환영인사와 디지털 사인도 받을 수도 있다. 실제로 ‘쇼!음악중심’, ‘무한도전’, ‘라디오스타’ 같은 인기 프로그램들이 MBC 글로벌미디어센터에서 제작되고 있어 한류스타들과의 뜻밖의 만남을 기대해볼 수 있다.','03925 서울 마포구 성암로 267 (상암동, (주)문화방송)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);




        q= "insert into wannaone values('26','K212','워너원이 소속된 기획사 YMC엔터테인먼트 1층에는 카페 K212가 위치해 있다. 지하에 위치한 연습실에서 연습을 마치거나 휴식을 취할 때 자주 찾는다고. K212는 생과일주스, 커피, 빙수, 케이크 등의 디저트와 피자, 파스타, 와인 등 브런치 및 디너를 즐길 수 있는 카페 겸 레스토랑이다. 앤티크하면서도 세련된 느낌의 카페 내부 곳곳에 워너원의 사진과 사인이 조화롭게 걸려 있다. ','서울 용산구 녹사평대로26길 36',' 02-749-2954','')";
        db.execSQL(q);
        q= "insert into wannaone values('27','제니하우스','무대 위에서는 남성미를, 무대 아래에서는 귀여운 소년미를 내뿜는 워너원의 센터 강다니엘의 메이크업 비법은 뭘까? 바라만 봐도 눈이 번쩍 뜨인다고 해서 팬들 사이에서 ‘개안즈’라는 별명을 지닌 멤버 황민현과 옹성우의 조각 같은 외모를 더욱 빛나게 해주는 메이크업 비법 역시 궁금하다면 제니하우스 청담힐을 방문해보자. 워너원의 메이크업을 담당하고 있는 제니하우스는 서울의 대표 뷰티 살롱으로 수많은 한류 스타들이 방문하는 곳. 외국인을 위해 메이크업과 헤어 전문가가 머리와 화장을 매만져주는 1:1 메이크오버 스타일링과 관광객이 직접 개인화장품을 지참해 메이크업 노하우를 배울 수 있는 메이크오버 클래스를 자체 운영 중이다. 제니하우스 홈페이지를 통해 사전예약이 필수다. 영어와 중국어가 가능한 통역 매니저가 항시 대기 중이라 외국인 혼자 찾아가도 걱정이 없다.  ','서울 강남구 선릉로146길 56','02-541-7788','http://jennyhouse.co.kr/en/')";
        db.execSQL(q);
        q= "insert into wannaone values('28','레뒤쁠라','180cm가 넘는 훤칠한 키, 준수한 외모와 유쾌한 성격을 겸비한 강다니엘과 옹성우는 팬들에게 옹녤콤비라고 불릴만큼 워너원에서도 특히 사이가 좋다. 사적으로도 카페와 맛집을 함께 다닐 만큼 절친한 이들이 데뷔 전부터 찾은 레스토랑이 이태원의 프렌치 맛집 레뒤쁠라다. 이들은 테라스석에 즐겨 앉는데, 팬들은 이 좌석을 옹녤석이라고 부른다. 이들이 먹은 메뉴, 스파이시 쉬림프 로제 파스타와 안심스테이크, 미도리샤워와 피치크러쉬도 옹녤세트라는 애칭이 붙을만큼 팬들의 사랑을 받고 있다.','서울 용산구 이태원로19길 6-4','02-797-2228','')";
        db.execSQL(q);


        q= "insert into superjunior values('29','하루앤원데이','슈퍼주니어 동해와 그의 형이 함께 성수동에 오픈한 카페. 시선을 사로잡는 작은 테라스와 마치 갤러리를 닮은 듯한 실내 인테리어가 돋보인다. 고객의 다양한 취향을 배려해 여러 가지 종류의 테이블과 편의시설을 갖췄다. 새로운 원두와 미세한 우유 입자를 사용해 기존 카페라떼나 카푸치노보다 진한 커피 향과 부드러움을 즐길 수 있는 플랫화이트, 커피의 쌉싸래함과 생크림의 달콤한 맛이 어우러지는 비엔나커피가 하루앤원데이의 추천 메뉴다. 매일 직접 구워내는 당근케이크, 베리베리케이크, 초코브라운케이크도 꼭 맛보아야 할 디저트 중에 하나. 평소 조용한 성격이라는 동해를 쏙 빼닮은 아늑한 휴식 공간으로 하루를 마무리하기에 모자람이 없는 곳이다.','04782 서울 성동구 아차산로 92 (성수동2가, 광명타워)','02-499-9303','https://www.instagram.com/cafe_haruoneday/')";
        db.execSQL(q);
        q= "insert into superjunior values('30','SM사옥','SM엔터테인먼트는 국내 대표적인 연예기획사 중 하나로, 보아, 소녀시대, 슈퍼주니어, 샤이니, 엑소, 레드벨벳 등 한류 스타들의 소속사이다. 사옥은 강남구 청담동에 있다. 사옥 지하 1층에 있는 SUM 마켓에서는 SM 소속 아티스트와 여러 아티스트와의 콜라보레이션으로 만든 작품을 판매한다.','06012 서울 강남구 선릉로190길 114 (청담동)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior values('31','SMTOWN코엑스 아티움','전 세계 K-pop 팬들이라면 모를 수 없는 SM엔터테인먼트의 복합 문화 공간인 SMTOWN 코엑스 아티움. 특히 ‘SMTOWN 뮤지엄’과 초고화질 전광판 ‘SMTOWN 외벽 미디어’가 2018년 5월에 문을 열어 높은 관심을 모으고 있다.\n" +
                "3층에 자리한 SMTOWN 뮤지엄은 엔터테인먼트 기업 최초로 SM엔터테인먼트 소속 아티스트들의 탄생과 성장 과정을 집대성한 공간이다. 음악 앨범, 활동 모습, 의상과 소품, 비하인드 스토리 등을 감상할 수 있는 ‘SM ARCHIVE’(에스엠 아카이브), ‘SPECIAL EXHIBITION’(스페셜 엑시비션), ‘ARTIST GALLERY’(아티스트 갤러리) 등 다양한 전시가 마련되어 있다. 또한 SM 콘텐츠 제작 과정 관람, 증강현실(AR), VR 등 신기술을 활용한 SM 아티스트와의 가상 만남 등 K-pop팬들에게 색다른 경험과 즐거움을 선사하고 있다. \n" +
                "\n" +
                "SMTOWN 외벽 미디어는 농구장 네 배에 달하는 크기로, 국내 최대 규모다. 그 때문에 ‘한국의 타임스스퀘어’라는 별명이 붙을 정도. 이곳에서 K-pop 뮤직비디오뿐 아니라 실시간 멀티 라이브 방송 채널 ‘!t Live(잇라이브)’ 등이 생중계된다.\n" +
                "5~6층에는 국내 최대 홀로그램 씨어터가 있다. SM 소속 아티스트의 콘서트 영상이 주로 상영되는데, 아직 DVD로 발매되지 않은 콘서트가 상영되기도 한다. 상영 스케줄을 체크할 것! 그 밖에도 아티스트가 실제로 착용하거나 고른 아이템 등을 살 수 있는 기프트샵(2층), 카페와 SM 아티스트의 이미지를 담은 다양한 상품을 판매하는 마켓(4층) 등이 있다.','06164 서울 강남구 영동대로 513 (삼성동, 코엑스)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into superjunior values('32','SUM 마켓','SM 아티스트의 모든 것을 만날 수 있는 곳. SM엔터테인먼트의 사옥인 ‘SM 커뮤니케이션센터’가 한류 팬들의 새로운 아지트가 되었다. 사옥 1층의 SUM 카페와 지하 1층 ‘SM 편의점’으로도 불리는 SUM 마켓이 문을 열었기 때문. ‘동방신기 트러플 초콜릿’, ‘슈퍼주니어 라면’ 등 식료품과 SM 아티스트의 브랜드를 결합한 다양한 MD 상품들을 판매하고 있다.','06084 서울 강남구 삼성로 648 (삼성동)','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior values('33','솔빈핫도그','동남아와 중국에서 독보적인 인기를 구가하는 한류스타, 슈퍼주니어. 조각 같은 외모와 달변을 겸비한 슈퍼주니어의 ‘실세’, 희철은 미식가로 소문났다. 입맛 까다로운 희철이 몇 년째 단골이라는 곳이 바로 압구정로데오의 명물, 솔빈덕이다. 오후 6시부터 새벽 5시 30분까지 영업한다는 특수성 때문에 스케줄이 끝나고 요기를 하러 이곳을 찾는 연예인들이 심심찮게 목격되기도 한다. 이곳의 메뉴는 크게 타코와 핫도그, 라이스보울의 세 종류. 희철이 즐겨 먹는 메뉴는 입술이 아릴만큼 맵고, 밤마다 생각날 만큼 중독성 최고라는 쓰벌덕. 나초와 사워크림, 할라피뇨, 야채와 갈비를 밥과 함께 먹는 갈비라이스 역시 안 먹으면 후회할 이곳의 간판 메뉴다.\n" +
                " ','06018 서울 강남구 도산대로51길 40 (신사동)','010-9466-3419','')";
        db.execSQL(q);



        q= "insert into dongbangsingi values('34','85st Coffee','손호준을 비롯한 절친들과 하루를 보내기 위한 만남의 장소로 선택한 곳은 85st Coffee. 고등학교 때부터 유노윤호와 인연을 맺어온 노신현 대표가 운영 중이다. 85년생 친구들이 만나 모이는 곳이라는 뜻에서 가게 이름을 붙였다. 친구 모임 외에도 일주일에 한두 번 이상 유노윤호가 다녀간다는 것이 노 대표의 전언. 유노윤호가 가장 좋아하고 자주 주문하는 메뉴는 ‘아메리카노’와 ‘리얼 딸기 요구르트 스무디’라고 한다. 카페의 상징인 커다란 곰 인형은 유노윤호가 직접 선물한 것이다.','서울특별시 강남구 강남대로122길 39(논현초등학교 옆)','','https://www.instagram.com/85st_coffee/')";
        db.execSQL(q);
        q= "insert into dongbangsingi values('35','해남집','유노윤호가 외국 활동을 마치고 귀국할 때나 친구 모임이 있을 때면 꼭 방문하는 단골집 중 하나가 전라도 음식 전문점 해남집이다. 초등학교 때부터 친구인 홍정인 대표가 어머니와 함께 운영하는 곳으로, 유노윤호는 홍정인 대표의 어머니를 ‘엄마’라고 부를 정도로 친근하게 여긴다. 따로 메뉴를 주문하지 않고 ‘밥 주세요!’라는 유노윤호의 말에 제철 음식을 준비해 줄 정도. 매생이, 낙지, 꼬막, 굴비, 떡갈비, 홍어 등 각종 향토 음식이 즐비하지만, 그 중에서도 유노윤호가 가장 좋아한다는 ‘더덕제육볶음’은 꼭 맛보아야 할 음식 중 하나다.','서울특별시 강남구 강남대로160길 10','02-3446-7244','')";
        db.execSQL(q);
        q= "insert into dongbangsingi values('36','SM사옥','SM엔터테인먼트는 국내 대표적인 연예기획사 중 하나로, 보아, 소녀시대, 슈퍼주니어, 샤이니, 엑소, 레드벨벳 등 한류 스타들의 소속사이다. 사옥은 강남구 청담동에 있다. 사옥 지하 1층에 있는 SUM 마켓에서는 SM 소속 아티스트와 여러 아티스트와의 콜라보레이션으로 만든 작품을 판매한다.','06012 서울 강남구 선릉로190길 114 (청담동)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi values('37','SMTOWN코엑스 아티움','전 세계 K-pop 팬들이라면 모를 수 없는 SM엔터테인먼트의 복합 문화 공간인 SMTOWN 코엑스 아티움. 특히 ‘SMTOWN 뮤지엄’과 초고화질 전광판 ‘SMTOWN 외벽 미디어’가 2018년 5월에 문을 열어 높은 관심을 모으고 있다.\n" +
                "3층에 자리한 SMTOWN 뮤지엄은 엔터테인먼트 기업 최초로 SM엔터테인먼트 소속 아티스트들의 탄생과 성장 과정을 집대성한 공간이다. 음악 앨범, 활동 모습, 의상과 소품, 비하인드 스토리 등을 감상할 수 있는 ‘SM ARCHIVE’(에스엠 아카이브), ‘SPECIAL EXHIBITION’(스페셜 엑시비션), ‘ARTIST GALLERY’(아티스트 갤러리) 등 다양한 전시가 마련되어 있다. 또한 SM 콘텐츠 제작 과정 관람, 증강현실(AR), VR 등 신기술을 활용한 SM 아티스트와의 가상 만남 등 K-pop팬들에게 색다른 경험과 즐거움을 선사하고 있다. \n" +
                "\n" +
                "SMTOWN 외벽 미디어는 농구장 네 배에 달하는 크기로, 국내 최대 규모다. 그 때문에 ‘한국의 타임스스퀘어’라는 별명이 붙을 정도. 이곳에서 K-pop 뮤직비디오뿐 아니라 실시간 멀티 라이브 방송 채널 ‘!t Live(잇라이브)’ 등이 생중계된다.\n" +
                "5~6층에는 국내 최대 홀로그램 씨어터가 있다. SM 소속 아티스트의 콘서트 영상이 주로 상영되는데, 아직 DVD로 발매되지 않은 콘서트가 상영되기도 한다. 상영 스케줄을 체크할 것! 그 밖에도 아티스트가 실제로 착용하거나 고른 아이템 등을 살 수 있는 기프트샵(2층), 카페와 SM 아티스트의 이미지를 담은 다양한 상품을 판매하는 마켓(4층) 등이 있다.','06164 서울 강남구 영동대로 513 (삼성동, 코엑스)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi values('38','SUM 마켓','SM 아티스트의 모든 것을 만날 수 있는 곳. SM엔터테인먼트의 사옥인 ‘SM 커뮤니케이션센터’가 한류 팬들의 새로운 아지트가 되었다. 사옥 1층의 SUM 카페와 지하 1층 ‘SM 편의점’으로도 불리는 SUM 마켓이 문을 열었기 때문. ‘동방신기 트러플 초콜릿’, ‘슈퍼주니어 라면’ 등 식료품과 SM 아티스트의 브랜드를 결합한 다양한 MD 상품들을 판매하고 있다.','06084 서울 강남구 삼성로 648 (삼성동)','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);






    }

    public void selectData() {
        String q = "select *from "+newname+"";
        plist.clear();
//        cursor select 해온 data집합
        Cursor cursor = db.rawQuery(q, null);

//        첫번째 cursor는 제목 줄
        if (cursor != null) {
//            실제데이터를 가르킴
            while (cursor.moveToNext()/*다음 투플로 넘어감*/) {
//                table에서 각 어트리뷰트에 넣음


                String name = cursor.getString(0);
                String name2=cursor.getString(1);
                about = cursor.getString(2);
                address = cursor.getString(3);
                tel = cursor.getString(4);
                textaddress = cursor.getString(5);

                if(name.equals("1")){
                    draw1 = R.mipmap.a1_1;

                }else if(name.equals("2")){
                    draw1 = R.mipmap.a2_1;

                }else if(name.equals("3")){
                    draw1 = R.mipmap.a3_1;

                }else if(name.equals("4")){
                    draw1 = R.mipmap.a4_1;

                }else if(name.equals("5")){
                    draw1 = R.mipmap.a5_1;

                }else if(name.equals("6")){
                    draw1 = R.mipmap.a6_1;

                }else if(name.equals("7")){
                    draw1 = R.mipmap.a7_1;

                }else if(name.equals("8")){
                    draw1 = R.mipmap.a8_1;

                }else if(name.equals("9")){
                    draw1 = R.mipmap.a9_1;

                }else if(name.equals("10")){
                    draw1 = R.mipmap.a10_1;

                }else if(name.equals("11")){
                    draw1 = R.mipmap.a11_1;

                }else if(name.equals("12")){
                    draw1 = R.mipmap.a12_1;

                }else if(name.equals("13")){
                    draw1 = R.mipmap.a13_1;

                }else if(name.equals("14")){
                    draw1 = R.mipmap.a14_2;

                }else if(name.equals("15")){
                    draw1 = R.mipmap.a15_1;

                }else if(name.equals("16")){
                    draw1 = R.mipmap.a16_1;

                }else if(name.equals("17")){
                    draw1 = R.mipmap.a17_1;

                }else if(name.equals("18")){
                    draw1 = R.mipmap.a18_1;

                }else if(name.equals("19")){
                    draw1 = R.mipmap.a19_1;

                }else if(name.equals("20")){
                    draw1 = R.mipmap.a20_1;

                }else if(name.equals("21")){
                    draw1 = R.mipmap.a21_1;

                }else if(name.equals("22")){
                    draw1 = R.mipmap.a22_1;

                }else if(name.equals("23")){
                    draw1 = R.mipmap.a23_1;

                }else if(name.equals("24")){
                    draw1 = R.mipmap.a24_1;

                }else if(name.equals("25")){
                    draw1 = R.mipmap.a25_1;

                }else if(name.equals("26")){
                    draw1 = R.mipmap.a26_1;

                }else if(name.equals("27")){
                    draw1 = R.mipmap.a27_1;

                }else if(name.equals("28")){
                    draw1 = R.mipmap.a28_1;

                }else if(name.equals("29")){
                    draw1 = R.mipmap.a29_1;

                }else if(name.equals("30")){
                    draw1 = R.mipmap.a30_1;

                }else if(name.equals("31")){
                    draw1 = R.mipmap.a31_1;

                }else if(name.equals("32")){
                    draw1 = R.mipmap.a32_1;

                }else if(name.equals("33")){
                    draw1 = R.mipmap.a33_1;

                }else if(name.equals("34")){
                    draw1 = R.mipmap.a34_1;

                }else if(name.equals("35")){
                    //
                    draw1 = R.mipmap.a35_2;

                }else if(name.equals("36")){
                    draw1 = R.mipmap.a36_1;

                }else if(name.equals("37")){
                    draw1 = R.mipmap.a37_1;

                }else if(name.equals("38")){
                    draw1 = R.mipmap.a38_1;

                }
                Productadd p1 = new Productadd(draw1,name2);
                plist.add(p1);
            }
            adapter.notifyDataSetChanged();


        }
    }
//    public void store(View view){
//                String q = ("insert into member2 values('"+newname+"','','','"+newcal+"'" +
//                        ")");
//                db.execSQL(q);
//                db.close();
//                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
//        mDialog = new CDialog(this,"재료",
//                leftListener,rightListener);
//        mDialog.show();
//
//            }
        }




