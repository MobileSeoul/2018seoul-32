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


public class KenterMainActivity extends AppCompatActivity {
    ListView clist;
    ArrayList<Productadd> plist;
    AddAdapter adapter;
    SQLiteDatabase db;
    TextView name;
    int draw1;



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

        clist = (ListView)findViewById(R.id.clist);
        plist = new ArrayList<>();

        adapter = new AddAdapter(this, R.layout.additemlist,plist);
        clist.setAdapter(adapter);
        Intent i = getIntent();
        newname = i.getStringExtra("name");
        name = (TextView) findViewById(R.id.name);
        name.setText(i.getStringExtra("listname"));
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

    }

    public void createDB() {
        db = openOrCreateDatabase
                ("member.db", Context.MODE_PRIVATE, null);
    }

    public void createTable() {
        String q;
        q= "drop table if exists runningman ";
        db.execSQL(q);
        q= "drop table if exists muhandozun ";
        db.execSQL(q);
        q= "drop table if exists ougul";
        db.execSQL(q);
        q= "drop table if exists nahonza";
        db.execSQL(q);
        q= "drop table if exists bijungsang";
        db.execSQL(q);

        q = "create table if not exists runningman(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists muhandozun(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ougul(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists nahonza(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bijungsang(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);

        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into runningman values('1','401 (홍대)','홍대에 위치한 401 레스토랑은 <무한도전>과 <런닝맨>에서 활약하고 있는 만능 엔터테이너 하하가 운영하는 제주 돼지고기 전문점이다. 자메이카를 떠올리게 하는 독특한 인테리어가 돋보이는 401 레스토랑에서는 신나는 레게 음악을 들으며 목살, 오겹살, 돼지껍데기 등 한국식 바비큐 요리를 즐길 수 있다. <무한도전>의 회식 장소로도 종종 이용되는 것으로 알려져 있으며, 운이 좋다면 하하를 직접 만날 수도 있다.','04043 서울 마포구 잔다리로 23 (서교동)','02-325-0805','')";
        db.execSQL(q);
        q= "insert into runningman values('2','통인시장','통인시장은 상권이 활성화된 곳으로 다른 전통시장의 벤치마킹 사례로 유명하며 특히 통인시장에서 자체 제작한 엽전은 통인시장만의 즐길거리다. 엽전으로 환전함과 동시에 검은색 플라스틱 식판도 받게 되는데 이때부터 식판을 들고 다니면서 시장 곳곳을 다니며 음식을 먹을 수 있다. 단, 엽전은 가맹점에서만 사용 가능하다.','03036 서울 종로구 자하문로15길 18','\n" +
                "02-722-0911','http://tonginmarket.co.kr/mall/index.php')";
        db.execSQL(q);
        q= "insert into runningman values('3','타르틴','런닝맨에서 유재석이 들린 파이 집으로 유명한 곳 밖에서도 보일 수 있도록 파이를 전시해 지나가는 사람들의 발걸음을 멈추게 함 이국적이고 독특한 인테리어로 꾸며져 있고 내부는 좌석이 여유롭고 많은 편\n" +
                "미국인 쉐프가 직접 구워내어 정통 레시피만을 고집하는 고급 파이를 아이스크림 또는 아메리카노와 함께 즐길 수 있음\n" +
                "1,2호점이 마주하고 있음 골목 양쪽으로 가게가 있고 2층으로 이루어져 내부공간도 넓음.','04350 서울 용산구 이태원로23길 4 (이태원동)','\n" +
                "02-3785-3400','http://www.tartine.co.kr/shop/main/index.php')";
        db.execSQL(q);
        q= "insert into runningman values('4','광희패션몰','광희패션몰은 서울의 대표적인 쇼핑 중심지, 일 년 사계절 불야성을 이루는 동대문에 위치하고 있다. 생산자와 소비자를 직접 연결하여 최신유행의 의류들을 저렴한 가격으로 구매할 수 있는 도매전문 대형쇼핑몰이다. 지하 1층부터 지상 6층까지 수백 개의 매장에서 숙녀복, 남성복, 캐주얼, 여성의류, 아동복, 스포츠웨어, 가죽, 모피 등 다양한 의류와 패션상품을 구입할 수 있다. 오후 9시부터 익일 오후 5시까지 밤 시간에 오픈하기 때문에 쇼핑 전 가까운 동대문디자인플라자(DDP)와 청계천, 낙산공원 성곽길을 돌아보면 좋다.\n" +
                "\n" +
                "광희패션몰은 국내 팬뿐 아니라 해외 팬들에게도 많은 사랑을 받고 있는 SBS 예능 프로그램 <런닝맨>을 통해 유명세를 타기 시작했다. 세계적인 액션스타 성룡과 슈퍼주니어 멤버 최시원이 이곳에서 보물을 차지하기 위한 레이스를 벌였다. 광희패션몰과 인접한 곳에 자리한 동대문디자인플라자(DDP)는 각종 한류 드라마와 방송 프로그램 촬영지로 유명하다. 유명 건축가가 설계한 독특한 건축물을 감상하며 수준 높은 문화예술을 체험할 수 있으며 가수 지드래곤, 배우 김수현, 박보검 등 수많은 스타들이 방문했다.','04567 서울 중구 마장로1길 21 (신당동, 광희 패션물)','02-2238-4352','')";
        db.execSQL(q);


        q= "insert into muhandozun values('5','만복국수집','다방구 특집에서 유재석과 박명수가 심장 박동수를 올리기 위해 비빔국수를 먹었던 곳이다. 실제 매장에 방문하면 당시의 촬영 사진과 사인이 장식되어 있다. 만복국수집은 마치 1970년대를 연상시키는 소박하고 아담한 실내 분위기에서 정갈한 국수와 동동주, 안주 요리 등을 즐길 수 있다. <무한도전> 에서는 심장 박동수 때문에 제자리에서 달리기를 하며 매운 비빔국수를 먹는 모습이 전파를 탔다. 만복국수집의 비빔국수와 뜨거운 열기를 한 번에 올리는 달리기로 박명수의 심장박동은 110을 훌쩍 넘기도 했다. 물론 비빔국수가 아니더라도 편안하게 즐길 수 있는 요리가 많다는 것이 만복국수집의 장점이다. 정종과 동동주를 비롯해 멸치국수, 보쌈, 해물파전, 골뱅이무침 등 친숙한 메뉴들이 주를 이루고 있다.','서울 마포구 상암동 214-7','02-374-6870',' www.manboknoodle.com')";
        db.execSQL(q);
        q= "insert into muhandozun values('6','두레우가','다방구 특집에서 술래였던 양세형과 황광희가 심박수를 100 이하로 유지하기 위해 찾은 곳이 바로 두레우가다. 한우가 주 메뉴지만 <무한도전> 에서는 시원한 냉면이 주인공으로 등장했다. 양세형과 황광희가 시원하게 국물을 들이켜는 모습만 보아도 군침이 돌았던 바로 그 장면! 한국에선 이례적인 폭염이 계속되었던 탓에 이들이 냉면을 먹는 모습만 보아도 절로 시원한 기분이 들기도 했다. 두레우가는 원래 농협에서 직영으로 운영하는 숯불구이 한우전문점이다. 농협에서 엄선한 한우만을 골라 쓰기 때문에 품질과 맛은 그 어떤 곳보다도 뛰어나다. 이러한 한우로 국물을 낸 냉면이라면 더더욱 그 맛은 보증된 셈이다. 특히 이곳의 특징은 맛있게 굽는 방법을 연구해 직원들이 고기를 익을 때까지 직접 구워준다는 것!','서울 마포구 월드컵북로 356','02-374-9255',' www.doorewooga.co.kr')";
        db.execSQL(q);
        q= "insert into muhandozun values('7','더 맵군','하하와 정준하가 심박수를 높이기 위해 달려간 곳은 바로 신촌의 매운 갈비찜 전문점이다. 더 맵군의 매운 소갈비찜은 단계별로 매운맛을 선택할 수 있고 당면과 떡볶이 사리가 무료로 리필돼 푸짐한 양을 먹을 수 있다. 매운 맛을 중화하기 위한 치즈토핑과 치즈볶음밥, 계란찜도 사이드 메뉴로 구성돼 있다. 매운 음식에 약한 사람은 가장 약한 단계의 요리를 시켜 주먹밥이나 계란찜과 함께 먹으면 좋다. 참고로 다방구 특집에서 심박수를 100 이상 유지해야 했던 도망자 하하와 정준하는 가장 매운 갈비찜을 먹었다. 땀을 뻘뻘 흘리며 갈비찜을 흡입하는 하하와 정준하의 모습을 보면 저절로 입에 침이 고인다.','서울 서대문구 연세로5나길 37','02-323-5574','http://kprince.fordining.kr/')";
        db.execSQL(q);
        q= "insert into muhandozun values('8','MBC WORLD','문화방송 MBC가 상암동 DMC 단지로 이전하며 기존의 방송국견학프로그램을 진화시킨, 국내 최초 방송테마파크 MBC월드를 선보였다. 방문객들은 MBC 드라마와 인기 예능 프로그램의 주인공이 되어 첨단기술로 구현된 다양한 체험과 영상 관람을 즐기고 실제 방송 제작 현장을 마주할 수 있다. MBC 건물 외부에는 현재 방송중인 프로그램이 미디어보드를 통해 방영되고, 스타들의 핸드프린팅과 실물 크기의 사진이 전시되어 있다. 건물 안에서는 MBC의 역사 체험, 홀로그램 시어터에서 즐기는 GD와 싸이의 공연, 댄스 체험 스튜디오, 가상현실 체험 공간, 트릭아트 포토월, 다양한 어트랙션 체험이 마련되어 있다. 4층에서는 대장금, 기황후 등 드라마를 재현한 촬영 세트장에서 사극의상을 입어볼 수 있고, 7층 MBC 보도국 현장에서는 실제로 뉴스 제작 과정을 살피며 앵커체험을 해볼 수 있다. MBC월드 투어는 매일 9회, 예약제로 운영되며 가이드와 함께 총90분간 진행된다.\n" +
                "\n" +
                "대한민국 최초의 방송테마파크, MBC월드에서는 한류 드라마와 예능 콘텐츠를 중심으로 스타와 함께 춤추고 노래하며 드라마 속 주인공이 되어보는 특별한 체험들을 즐길 수 있다. 가상현실 체험, 댄스 체험 스튜디오, 홀로그램 무대 등 첨단기술을 동원한 체험들이 관광객들에게 특히 인기다. 투어가 끝나면 한류스타들의 환영인사와 디지털 사인도 받을 수도 있다. 실제로 ‘쇼!음악중심’, ‘무한도전’, ‘라디오스타’ 같은 인기 프로그램들이 MBC 글로벌미디어센터에서 제작되고 있어 한류스타들과의 뜻밖의 만남을 기대해볼 수 있다.','03925 서울 마포구 성암로 267 (상암동, (주)문화방송)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);



        q= "insert into ougul values('9','MBC WORLD','문화방송 MBC가 상암동 DMC 단지로 이전하며 기존의 방송국견학프로그램을 진화시킨, 국내 최초 방송테마파크 MBC월드를 선보였다. 방문객들은 MBC 드라마와 인기 예능 프로그램의 주인공이 되어 첨단기술로 구현된 다양한 체험과 영상 관람을 즐기고 실제 방송 제작 현장을 마주할 수 있다. MBC 건물 외부에는 현재 방송중인 프로그램이 미디어보드를 통해 방영되고, 스타들의 핸드프린팅과 실물 크기의 사진이 전시되어 있다. 건물 안에서는 MBC의 역사 체험, 홀로그램 시어터에서 즐기는 GD와 싸이의 공연, 댄스 체험 스튜디오, 가상현실 체험 공간, 트릭아트 포토월, 다양한 어트랙션 체험이 마련되어 있다. 4층에서는 대장금, 기황후 등 드라마를 재현한 촬영 세트장에서 사극의상을 입어볼 수 있고, 7층 MBC 보도국 현장에서는 실제로 뉴스 제작 과정을 살피며 앵커체험을 해볼 수 있다. MBC월드 투어는 매일 9회, 예약제로 운영되며 가이드와 함께 총90분간 진행된다.\n" +
                "\n" +
                "대한민국 최초의 방송테마파크, MBC월드에서는 한류 드라마와 예능 콘텐츠를 중심으로 스타와 함께 춤추고 노래하며 드라마 속 주인공이 되어보는 특별한 체험들을 즐길 수 있다. 가상현실 체험, 댄스 체험 스튜디오, 홀로그램 무대 등 첨단기술을 동원한 체험들이 관광객들에게 특히 인기다. 투어가 끝나면 한류스타들의 환영인사와 디지털 사인도 받을 수도 있다. 실제로 ‘쇼!음악중심’, ‘무한도전’, ‘라디오스타’ 같은 인기 프로그램들이 MBC 글로벌미디어센터에서 제작되고 있어 한류스타들과의 뜻밖의 만남을 기대해볼 수 있다.','03925 서울 마포구 성암로 267 (상암동, (주)문화방송)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into ougul values('10','설빙 신림2호점','설빙은 티라미수빙수, 망고치즈빙수 등 다채로운 토핑을 얹은 빙수와 인절미토스트, 치즈떡볶이피자 등 독특한 주전부리를 판매하는 디저트 카페다. 설빙 신림2호점은 음악 활동은 물론 배우로도 활약하고 있는 씨엔블루의 멤버 이종현이 운영하고 있는 곳으로, 이종현이 <우리 결혼했어요>에서 가상 커플인 배우 공승연과 데이트를 즐긴 곳이기도 하다. 이종현의 친필 사인과 그의 공연 사진이 전시되어 있다.','08760 서울 관악구 신림로 353 (신림동) 2층','02-882-9080','http://sulbing.com/')";
        db.execSQL(q);
        q= "insert into ougul values('11','마복림 할머니 막내 아들네 떡볶이','빨간 떡볶이의 원조 신당동 떡볶이를 만든 마복림 할머니의 며느리가 비법을 전수받아 운영하는 떡볶이 전문점이다. 신당동 떡볶이 타운 내에 위치하고 있다. 인기가 많아져 최근에는 택배 배송 서비스도 제공하고 있다.','04611 서울특별시 중구 다산로 221 (신당동)','02-962-8288','http://mabokrim.subnara.info/')";
        db.execSQL(q);
        q= "insert into ougul values('12','잠실카트체험장','잠실카트체험장은 잠실에 위치한 카트 체험장으로 남녀노소 누구나 운전면허가 없어도 모터스포츠를 통한 건전한 취미생활을 즐길 수 있는 곳이다. 예능 프로그램<우리 결혼했어요> 촬영지로도 이용됐었다. 매주 월요일, 행사 및 우천 시 휴무한다. 공휴일에는 정상적으로 영업한다.','\n" +
                "05500  서울 송파구 올림픽로 25 (잠실동, 서울종합운동장)','02-420-3886','http://www.birel.kr/?act=main')";
        db.execSQL(q);
        q= "insert into ougul values('13','더스파인가든파이브','호텔급 사우나 시설과 쇼핑, 오락시설 등을 갖춘 대형 찜질방. 드라마에서 보던 한국의 목욕 문화도 즐기고,여행의 피로도 해소할 수 있다.','서울 송파구 충민로 10 가든파이브툴','02-404-2700','http://www.spagarden5.co.kr/')";
        db.execSQL(q);






        q= "insert into nahonza values('14','MBC WORLD','문화방송 MBC가 상암동 DMC 단지로 이전하며 기존의 방송국견학프로그램을 진화시킨, 국내 최초 방송테마파크 MBC월드를 선보였다. 방문객들은 MBC 드라마와 인기 예능 프로그램의 주인공이 되어 첨단기술로 구현된 다양한 체험과 영상 관람을 즐기고 실제 방송 제작 현장을 마주할 수 있다. MBC 건물 외부에는 현재 방송중인 프로그램이 미디어보드를 통해 방영되고, 스타들의 핸드프린팅과 실물 크기의 사진이 전시되어 있다. 건물 안에서는 MBC의 역사 체험, 홀로그램 시어터에서 즐기는 GD와 싸이의 공연, 댄스 체험 스튜디오, 가상현실 체험 공간, 트릭아트 포토월, 다양한 어트랙션 체험이 마련되어 있다. 4층에서는 대장금, 기황후 등 드라마를 재현한 촬영 세트장에서 사극의상을 입어볼 수 있고, 7층 MBC 보도국 현장에서는 실제로 뉴스 제작 과정을 살피며 앵커체험을 해볼 수 있다. MBC월드 투어는 매일 9회, 예약제로 운영되며 가이드와 함께 총90분간 진행된다.\n" +
                "\n" +
                "대한민국 최초의 방송테마파크, MBC월드에서는 한류 드라마와 예능 콘텐츠를 중심으로 스타와 함께 춤추고 노래하며 드라마 속 주인공이 되어보는 특별한 체험들을 즐길 수 있다. 가상현실 체험, 댄스 체험 스튜디오, 홀로그램 무대 등 첨단기술을 동원한 체험들이 관광객들에게 특히 인기다. 투어가 끝나면 한류스타들의 환영인사와 디지털 사인도 받을 수도 있다. 실제로 ‘쇼!음악중심’, ‘무한도전’, ‘라디오스타’ 같은 인기 프로그램들이 MBC 글로벌미디어센터에서 제작되고 있어 한류스타들과의 뜻밖의 만남을 기대해볼 수 있다.','03925 서울 마포구 성암로 267 (상암동, (주)문화방송)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into nahonza values('15','망원시장','망원시장은 다른 전통시장과 크게 다르지는 않지만, ‘육중완 시장’이라 불릴 만큼 <나 혼자 산다>에서 자주 등장해 화제를 모은 바 있다. 육중완을 비롯해 강민혁, 김정민 등 수많은 연예인들이 방문해 엄지손을 치켜든 먹거리 점포들이 모여 있는데, 줄을 서서 기다려야 하는 ‘큐스 닭강정’을 시작으로 단돈 3,000원에 푸짐한 국수 한 그릇을 내주는 ‘홍두깨 칼국수’ 등이 그 주인공이다. 저렴한 가격으로 든든하게 한 끼 식사를 해결하고, 전통시장 구경까지 즐길 수 있어 일석이조다.','서울시 마포구 포은로 8길 14','02-335-3591',' https://mangwonsijang.modoo.at')";
        db.execSQL(q);
        q= "insert into nahonza values('16','안산','최장수 아이돌 그룹 ‘신화’ 출신이자 유머러스하고 건실한 이미지로 많은 사랑을 받고 있는 김동완은 <나 혼자 산다>에서도 혼자 사는 법의 진수를 보여주는 멤버다. 다양한 취미 생활을 가진 그가 산악자전거를 끌고 나타난 곳은 서대문구에 위치한 안산이다.안산은 해발 295.9m로 지형이 높지 않고, 휠체어나 유모차를 이용하여 편안하게 산책을 즐길 수 있도록 무장애 자락길이 조성되어 있어, 약 2시간 반 정도면 충분히 한 바퀴를 돌 수 있다. 안산으로 향하는 등산로 입구는 무악재, 독립문, 서대문자연사박물관 등 도심과 가까운 여러 군데 위치해있다. 완만한 산책로를 걷다보면 메타세콰이어 길 등 아름다운 자연 풍광이 서울 한가운데임을 잊을 만큼 아름다운 경치가 이어진','서울시 서대문구 연희동 일대','02-330-1958','  http://www.sdm.go.kr/educate/naturepark.do?mode=view&sdmBoardSeq=379')";
        db.execSQL(q);
        q= "insert into nahonza values('17','망원한강공원','나혼자 산다에 출연한 인기 록밴드 장미여관의 보컬 육중완은 망원동 근처의 옥탑방에 살고 있는 자타공인 망원동 터줏대감이다. 어느 날 육중완은 작곡의 영감을 찾기 위해 통기타를 둘러메고 집 근처 망원 한강공원으로 향한다. 나 홀로 공원 한편에 우두커니 앉아 창작의 고단함을 토로하던 그는 이내 아름다운 목소리로 즉석 버스킹을 선보이며 시민들을 기쁘게 했다.','서울특별시 마포구 마포나루길 467','02-3780-0601',' http://hangang.seoul.go.kr/archives/3565')";
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

                if(name.equals("1")){
                    draw1 = R.mipmap.c1_2;

                }else if(name.equals("2")){
                    draw1 = R.mipmap.c2_2;

                }else if(name.equals("3")){
                    draw1 = R.mipmap.c3_1;

                }else if(name.equals("4")){
                    draw1 = R.mipmap.c4_1;

                }else if(name.equals("5")){
                    draw1 = R.mipmap.c5_1;

                }else if(name.equals("6")){
                    draw1 = R.mipmap.c6_1;

                }else if(name.equals("7")){
                    draw1 = R.mipmap.c7_2;

                }else if(name.equals("8")){
                    draw1 = R.mipmap.c8_1;

                }else if(name.equals("9")){
                    draw1 = R.mipmap.c9_1;

                }else if(name.equals("10")){
                    draw1 = R.mipmap.c10_1;

                }else if(name.equals("11")){
                    draw1 = R.mipmap.c11_2;

                }else if(name.equals("12")){
                    draw1 = R.mipmap.c12_1;

                }else if(name.equals("13")){
                    draw1 = R.mipmap.c13_1;

                }else if(name.equals("14")){
                    draw1 = R.mipmap.c14_2;

                }else if(name.equals("15")){
                    draw1 = R.mipmap.c15_1;

                }else if(name.equals("16")){
                    draw1 = R.mipmap.c16_2;

                }else if(name.equals("17")){
                    draw1 = R.mipmap.c17_1;

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




