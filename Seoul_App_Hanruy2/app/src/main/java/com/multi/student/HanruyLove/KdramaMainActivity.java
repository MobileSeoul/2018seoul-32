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


public class KdramaMainActivity extends AppCompatActivity {
    ListView clist;
    ArrayList<Productadd> plist;
    AddAdapter adapter;
    SQLiteDatabase db;
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
        q= "drop table if exists hwayugi ";
        db.execSQL(q);
        q= "drop table if exists dangzamsa ";
        db.execSQL(q);
        q= "drop table if exists sarang";
        db.execSQL(q);
        q= "drop table if exists ssam ";
        db.execSQL(q);
        q= "drop table if exists doctors";
        db.execSQL(q);
        q= "drop table if exists doggabi";
        db.execSQL(q);
        q= "drop table if exists ddoohaeyoung";
        db.execSQL(q);
        q= "drop table if exists bulgudae";
        db.execSQL(q);
        q= "drop table if exists taeyang";
        db.execSQL(q);
        q= "drop table if exists oungpal";
        db.execSQL(q);
        q = "create table if not exists hwayugi(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dangzamsa(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists sarang(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ssam(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doctors(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doggabi(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ddoohaeyoung(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bulgudae(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists taeyang(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists oungpal(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into hwayugi values('1','문화비축기지','석유파동 이후 석유를 보관하기 위해 5개의 유류탱크로 지어졌던 마포석유비축기지는 2002년 월드컵을 앞두고 안전상의 이유로 폐쇄 되었다가, 2017년 9월 시민들을 위한 문화복합시설인 ‘문화비축기지’로 새롭게 태어났다. 기존 유류탱크를 재활용해 시민을 위한 공연장과 강의실, 전시관, 카페테리아, 다목적 강의실 등으로 탈바꿈 했다. <화유기> 속 천계의 메신저 수보리조사의 아지트로 나왔던 곳은 ‘T1 파빌리온’이다. 탱크 해체 후 남은 콘크리트 옹벽 안에 유리로 벽체와 지붕을 새로 만들어 과거의 옹벽과 현재의 건축물, 매봉산의 암반지형이 조화롭게 펼쳐지는 모습을 볼 수 있는 곳으로 문화비축기지 내 다른 공간처럼 다목적 커뮤니케이션 공간으로 활용되고 있다. T1 파빌리온 외에도 T2, T3, T4, T5, T6, T0까지 저마다 다양한 목적과 용도를 가지고 운영되고 있어 시간 내어 둘러보기에 괜찮다.','서울특별시 마포구 증산로 87','02-376-6410','https://parks.seoul.go.kr/template/sub/culturetank.do')";
        db.execSQL(q);
        q= "insert into hwayugi values('2','워커바웃','여행, 고양이, 태국 음식, 수제 맥주와 같은 키워드를 모두 한데 모은 것이 ‘트래블 펍’ 워커바웃이다. 요괴에 괴롭힘을 당하는 삼장을 손오공(이승기)이 구해주는 장면에서 나왔던 곳이다. 2016년 여행 가이드 론리플래닛에 소개되며 남산 인근을 방문하는 전 세계 여행자의 아지트로 유명해졌다. 풍미가 특별한 유명 수제 맥주와 태국 현지인에게도 인정받은 팟타이, 똠양꿍 등이 주요 메뉴다. 전 세계 화폐를 수집해 놓는가 하면 수많은 방문자들의 폴라로이드 사진으로 빼곡하다. 워커바웃 맞은편에 위치한 숭의여자대학교 별관부터 4호선 명동역 3번 출구까지 이어지는 길 근처엔 만화의 거리로 유명한 ‘재미로’가 있어 다양한 볼거리가 있다.','서울특별시 중구 퇴계로20길 49','02-757-1110','https://www.instagram.com/pub_walkabout/')";
        db.execSQL(q);
        q= "insert into hwayugi values('3','에맥앤볼리오스 이태원점','<화유기> 1회에서 손오공(이승기)이 동장군의 아이스크림 가게에 손님이 없다고 걱정을 하는 장면이 있었다. 그러나 현실의 에맥앤볼리오스에서는 그런 걱정이 필요 없을 정도로 인기다. 신선한 우유를 베이스로 망고의 왕으로 불리는 인도 알폰소 망고 및 각종 제철과일을 최대 22% 함유한 에맥앤볼리오스 아이스크림은 마다가스카산 바닐라빈, 수제 초콜릿 등 최고급 재료를 사용하며, 코셔 인증 등 안전한 생산방식으로 미국 보스턴, 뉴욕 등 현지에서 베스트 아이스크림으로 선정된 바 있다. 40여개 맛의 아이스크림에 후르츠링, 초콜릿, 레인보우스프링클 등 화려한 토핑을 얹은 수제 와플콘은 각종 SNS 상에 게시되며 많은 인기를 끌고 있다.','서울특별시 용산구 이태원로16길 10','02-797-0814','http://emackandbolios.kr/')";
        db.execSQL(q);
        q= "insert into hwayugi values('4','이태원 앤틱스토리','이태원 가구거리 내에 자리 잡은 앤틱스토리는 앤틱, 빈티지 소품과 레트로 가구를 대여, 판매하는 곳이다. <화유기>에서 손오공(이승기)은 가게에서 가장 비싸다는 주전자를 구입하기 위해 사오정에게 전화를 걸어야 했다. 수백만 원을 호가하는 레트로 가구부터 가성비 좋은 소품까지 다양한 제품이 구비되어 있다. 각종 촬영용 소품이나, 인테리어용 집기를 마련하려는 사람에게는 보물창고 같은 존재. 이태원1동 주민센터 올라가는 길 바로 옆에 위치해 있다.','서울특별시 용산구 보광로 104','02-733-2979','')";
        db.execSQL(q);




        q= "insert into dangzamsa values('5','보뜨플라워','안국역 1번 출구 윤보선길을 따라 북촌한옥마을로 올라가다 보면 멀리서도 눈에 띄는 꽃집이 보인다. 홍주(수지)가 반갑게 인사하던 바로 그 꽃집이다. 다양한 꽃이 판매되고 있으며 오랫동안 아름다움을 즐길 수 있는 드라이 플라워나 프리저브드 플라워가 관광객들에게 인기다. 짧은 시간 동안의 플라워 레슨(일본어 가능)도 가능하다.','서울특별시 종로구 윤보선길 28',' 02-737-8934','http://www.botteflower.com/')";
        db.execSQL(q);
        q= "insert into dangzamsa values('6','파스텔드나따 안국점','보뜨플라워 맞은편에 있는 에그타르트 전문점. 홍주(수지)와 재찬(이종석)은 군침을 삼키며 창 너머로 바라만 보고 발걸음을 옮겼지만 당신은 그럴 필요가 없다. 바삭함과 촉촉한 부드러움이 공존하는 다양한 맛의 에그타르트와 아메리카노 한 잔이면 오후의 활력으로 충분하다. 이미 <상속자들> 등 여러 드라마의 촬영 장소로 활용된 적이 많은 곳이다.','서울특별시 종로구 윤보선길 31','02-733-2979','')";
        db.execSQL(q);
        q= "insert into dangzamsa values('7','We are young 벽화','안국역 1번 출구에서 풍문여고를 끼고 정독도서관을 향해 가는 길, 덕성여고와 덕성여중을 잇는 육교 아래 벽에 그려진 벽화이다. 입맞춤하는 노부부 그림과 we are young이라는 문구가 인상적인 벽화로 북촌한옥마을을 오고 가는 많은 관광객의 사랑을 받고 있다. 시간 차이를 두고 홍주(수지)와 해찬(이종석)이 나란히 서 있었던 바로 그곳이다.','서울특별시 종로구 율곡로3길 64','02-2148-1114','')";
        db.execSQL(q);
        q= "insert into dangzamsa values('8','카페 펌킨','세종대로 뒤편, 조선일보 정동별관 맞은편에 자리 잡은 카페로, 테라스가 특히 멋진 곳이다. <당신이 잠든 사이에>에서는 홍주(수지)와 이유범(이상엽)이 비오는 날에 만나 고성이 오갔던 장면이 연출된 곳이지만, 극 중 분위기와는 다르게 평화롭고 아늑한 분위기를 자랑한다. 햇볕 좋은 날에 활짝 문이 열린 테라스를 향해 놓인 쇼파는 카페 최고 명당자리. 고구마라떼와 비슷하게 꿀호박으로 맛을 낸 꿀호박라떼와 코코넛 크림과 젤리가 들어간 펌킨코코스무디가 봄날 추천 메뉴. 펌킨 파이 등의 디저트 메뉴도 갖추고 있다.','서울특별시 중구 세종대로21길 40','02-733-7905','https://www.instagram.com/cafepump_kin/')";
        db.execSQL(q);





        q= "insert into sarang values('9','그라체나','연남동에 자리한 그라체나는 <사랑의 온도>에서 정선이 프랑스 유학 후 돌아와 차린 레스토랑 ‘굿스프’로 등장하는 곳이다. 메뉴가 무척 다양한데, 가장 인기 있는 메뉴는 수제 맥주와 피자. 셰프의 추천 메뉴는 인도식 커리로, 와인과 의외로 잘 어울린다는 점이 독특하다. 저녁에는 은은한 조명과 로맨틱한 분위기 속에 와인과 스테이크를 즐길 수 있다. 테이블 사이 공간이 넓어 식사 중 대화하기 편하며, 곳곳에 배치된 아기자기한 소품들이 아늑한 분위기를 연출한다.','서울 마포구 연남로 13 1층','02-338-8908','')";
        db.execSQL(q);
        q= "insert into sarang values('10','양출쿠킹','<사랑의 온도>에 등장하는 꽃미남 요리사들이 촬영 전 셰프의 쿠킹 클래스를 수강한 곳이다. 좋을 양(良), 나오다 출(出). 좋은 음식을 내어놓는다는 뜻의 양출은 일본에서 요리를 공부한 이곳 셰프의 이름이기도 하다. 제철 식재료를 활용한 건강하고 든든한 퓨전 한식 한끼를 차려주는 곳. 늘 새로운 메뉴 개발에 힘쓰며 조미료를 쓰지 않는, 정성 가득한 식당이다.','서울 강남구 논현로157길 15','02-547-4420','')";
        db.execSQL(q);
        q= "insert into sarang values('11','와이스파치오','프랑스 유학 전부터 요리 실력이 출중했던 정선. 그가 한 음식을 맛본 정우는 반하고 만다. 극중 정우가 처음 정선의 요리를 경험한 장소로 등장한 곳은 논현동에 자리한 이탤리언 레스토랑 와이스파치오. 따뜻한 스프부터 안티파스토, 메인 요리, 디저트까지 이어지는 와이스파치오의 정찬은 가히 아름답다. 점심 식사로는 합리적인 가격의 3가지 코스가 준비돼 있다. 저녁 식사의 경우 메인 요리인 스테이크와 채끝 등심, 눈꽃살, 양고기 요리 중 하나를 선택할 수 있다. 플레이팅도 섬세해서 시각과 미각 모두 만족스러운 식사를 제공한다. 공간도 매력적인데, 낭만적인 데이트를 원한다면 창가 자리를 추천한다.','서울 강남구 언주로133길 21','02-549-5667','https://www.yspazioseoul.com/')";
        db.execSQL(q);
        q= "insert into sarang values('12','꾸띠자르당','드라마 속에서 거절 당하던 홍아(조보아)는 마음이 아팠겠지만, 그 장면 속의 테라스만큼은 정말 아름다웠다. 이곳은 바로 이태원의 프렌치 레스토랑 꾸띠자르당이다. 셰프를 포함한 직원 대부분이 프랑스인이고, 레스토랑의 내부 또한 프랑스의 노천 카페를 닮아 와인이 절로 생각나는 분위기다. 추천 메뉴는 연어 스테이크. 적당히 새콤하며 담백한 맛에, 탱탱하고 부드러운 식감이 느껴지는 훌륭한 요리다. 1층의 야외테라스부터 2층의 레스토랑, 3층의 바 그리고 꼭대기 층의 파티 라운지까지. 다양하고 널찍한 공간이 준비되어 있으며, 반려동물 출입도 가능하다.','서울 용산구 보광로 120','02-796-5072',' http://blog.naver.com/cotejardin')";
        db.execSQL(q);


        q= "insert into ssam values('13','서울도서관 하늘뜰','동만(박서준)은 직장에서 힘든 하루를 보낸 애라(김지원)를 안고 “울고 싶을 땐, 우는 게 쿨한 거야”라며 그녀를 위로한다. 동만의 품속에서 애라가 눈물을 터뜨린 곳은 서울도서관 옥상의 하늘뜰이다. 1926년에 지어진 이곳은 80년 넘게 서울의 역사를 지켜봤고, 현재는 건물의 역사적 가치를 인정받아(등록문화재 제52호다) 도서관으로 다시 태어났다. 책을 읽다가 한숨 돌리고 싶을 땐, 옥상에 위치한 하늘뜰에 가보자. 밑으로는 서울광장, 오른쪽과 왼쪽에는 각각 덕수궁과 남산이 보이고 저녁에는 조명이 켜져 운치를 더한다.','서울특별시 중구 세종대로 110번지','',' http://lib.seoul.go.kr/ ')";
        db.execSQL(q);
        q= "insert into ssam values('14','이상한 나라의 미쓰윤','드라마의 또 다른 주인공, 6년차 커플 설희(송하윤)와 주만(안재홍). 주만이 가족에게 “설희 아니면 누구와도 결혼하지 않는다”며 그녀에 대한 애정을 드러낸 곳이다. 이곳은 동화 이상한 나라의 앨리스가 연상되는 인테리어가 인상적인 카페 겸 라운지바. 낮에는 커피와 브런치를 즐길 수 있고, 밤에는 칵테일과 와인을 마실 수 있다. 구전녹용과 커피를 배합한 사슴뿔 카페라떼는 이곳만의 오리지널 메뉴다. 2층의 루프탑에서는 양재천의 녹음과 시원한 바람을 만끽하기 좋다.','서울 서초구 양재천로17길 3','02-353-7777','')";
        db.execSQL(q);
        q= "insert into ssam values('15','루카511','애라는 번번히 아나운서 시험에 미끄러지면서도 자신의 꿈을 포기하지 않는 불굴의 청춘이다. 마이크를 잡으면 저절로 눈이 반짝거리고 목소리가 낭랑해지는 그녀는 동기인 찬숙의 결혼식에서 사회자 대타로 나서 마음껏 재능을 뽐낸다. 애라가 아름다운 드레스를 입고 사회를 본 야외 결혼식은 < 별에서 온 그대 >의 촬영지로도 유명한 루카511에서 열렸다. 유럽의 궁전을 본뜬 디자인이 우아한 본관은 주로 행사의 대관처이며, 별관은 프렌치 레스토랑이다. 본관에서 정원을 가로지르면 별관이 있는데, 본관과 별관을 잇는 정원은 풍경이 아름다워 가든 웨딩 장소로 인기가 좋다.','서울 강남구 도산대로81길 40지번청담동 115-16 LUKA빌딩','02-540-6640','')";
        db.execSQL(q);
        q= "insert into ssam values('16','AY라운지','순애보 의사 무빈(최우식)은 결혼식에서 당당하고 재치있게 사회를 보는 애라의 모습에 반한다. 결혼식 뒷풀이로 향한 술집에서 무빈의 친구들은 애라에게 술을 마시라고 종용하고, 친구들로부터 애라를 보호하기 위해 그는 흑기사를 자처한다. 둘의 인연이 시작되는 뒷풀이 장소가 AY라운지다. AY라운지는 <무한도전 아수라편>을 비롯해 <또오해영>, <함부로 애틋하게> 등 각종 드라마와 예능 프로그램의 촬영지로 알려지며 입소문을 탄 곳. 나무와 가죽으로 마무리되어 고풍스럽고 세련된 인테리어는 유럽의 성 같은 느낌을 준다. 각종 드라마에서 단골로 등장하는 곳은 중앙의 바 자리지만, 탁트인 2층의 소파에서 내려보는 전망도 좋다.','서울 강남구 강남대로92길 13','02-552-8199','')";
        db.execSQL(q);





        q= "insert into doctors values('17','봉주르하와이','파라솔 지붕이 한눈에 들어오는 입구부터 이국적인 정취가 물씬 풍기는 퓨전레스토랑 ‘봉주르하와이’. 개성 있는 소품과 인테리어는 물론이고, 매장에 울려 퍼지는 하와이 전통음악이 실제 하와이의 어느 카페에 온 듯한 기분 좋은 착각을 들게 하는 곳이다. 소시지, 감자, 닭꼬치, 새우, 삼겹살이 총 집합한 ‘BBQ 선셋플래터’, ‘크림카레우동’ 등 독특한 퓨전요리들이 이곳의 간판 메뉴다. 또한 중독성이 강해 ‘마약 피자’라는 별명이 붙은 이곳만의 스페셜 요리인 ‘스시피자’에 후르츠펀치 칵테일 한 잔이면 하와이 여행도 부럽지 않다.\n" +
                "\n" +
                "드라마 <닥터스> 4회에서 화려하게 등장해 궁금증을 일으킨 ‘봉주르하와이’는 이미 홍대의 ‘핫 플레이스’로 소문난 곳이다. <닥터스>의 여주인공 유혜정(박신혜)의 절친 천순희가 운영하는 카페 ‘수니하와이’로 드라마에 심심치 않게 등장했기 때문이다. 극중 홍지홍(김래원), 유혜정(박신혜) 커플도 이곳에서 시원한 맥주와 함께 데이트를 즐기곤 했다.','04043 서울 마포구 잔다리로3안길 23 (서교동)','010-9756-5406','')";
        db.execSQL(q);
        q= "insert into doctors values('18','서촌전통순대국','드라마 <닥터스>에서 유혜정(박신혜)의 아버지가 운영하는 국밥집으로 등장했던 서촌전통순대국은 사골로만 24시간 우려낸 진한 육수로 소문난 맛집이다. 예스러운 한옥과 정갈한 인테리어는 경복궁 주변 경관과도 조화를 이룬다. 얼큰하고 구수한 순댓국도 일품이지만 식당에서 직접 담근 김치 역시 서울에서 가장 맛있는 김치 중 하나로 꼽힐 정도다. 식사를 마친 후에 지호-혜정 커플이 함께 국밥을 즐겼던 자리에서 잊지 말고 기념사진을 남겨볼 것!','\n" +
                "03027  서울 종로구 사직로9가길 8 (필운동) ','02-735-0122','')";
        db.execSQL(q);
        q= "insert into doctors values('19','양철북 강동구청점','<상속자들>, <닥터스>, <피노키오> 등 인기 드라마의 주연으로 활약한 배우 박신혜의 부모님이 운영하는 양대창 전문점. 넓고 쾌적한 가게 곳곳에 박신혜의 초상화와 포스터, 두 반려견을 본뜬 소품과 케이크 등 팬들로부터 받은 선물이 전시되어 있다. 막창과 곱창, 양 등의 식자재는 매일 우시장에서 공수 받으며, 시원하고 깔끔한 묵밥을 비롯한 밑반찬도 매장에서 직접 만든다. 스케줄이 없는 날에는 박신혜가 종종 동료들과 함께 방문한다.','05399 서울 강동구 성내로 62 (성내동, 유원빌딩)','02-478-1192','')";
        db.execSQL(q);







        q= "insert into doggabi values('20','일감호','자신의 첫사랑 태희(정해인)를 만난 지은탁(김고은). 호숫가를 배경으로 그림 같은 장면이 연출된 곳은 일감호다. 건국대학교 내에 위치해 흔히‘건대 호수’라고도 불리지만 재학생만이 아닌 모두에게 열려 있다. 봄과 여름에는 호수를 둘러싼 나무와 꽃의 향기가 싱그러워 여유 있는 한때를 보내기에 그만이다. 해가 지면 호수에 비치는 홍예교의 불빛이 매력적인 야경을 선사한다.',' 서울 광진구 능동로 120','','')";
        db.execSQL(q);
        q= "insert into doggabi values('21','운현궁 양관','‘너를 세상 가장 안전한 곳으로 부를게.’은탁이 위험에 처할 때마다 도깨비가 그를 불렀던 집은 종로에 위치한 운현궁 양관이다. 웅장하고 고급스러운 외관의 도깨비 집에 도깨비와 저승사자, 지은탁이 함께 살았다. 운현궁은 흥선대원군의 사저로, 그의 아들이자 조선 26대 임금인 고종이 출생하고 성장한 곳이다.‘이우공저’라고도 불리는 운현궁 양관은 일제가 조선 왕족을 감시할 목적으로 대원군 손자에게 지어주었다. 유럽풍의 근대식 건물로, 화려하지만 슬픈 사연이 담긴 곳. <도깨비> 이외에도 <궁> <더킹 투하츠>등 다양한 드라마 촬영지로 등장했으며, 유물 전시를 비롯해 전통 의상 체험, 역사 콘서트 등 다양한 전통문화를 경험할 수 있다.','서울 종로구 삼일대로 464','02-765-1840 ',' http://www.unhyeongung.or.kr/')";
        db.execSQL(q);
        q= "insert into doggabi values('22','윤보선가','할머니 귀신에게 복권 당첨번호를 알려주던 은탁의 눈앞에 갑자기 나타난 김신. 놀란 둘 뒤로 보이는 고즈넉한 돌담이 눈길을 끄는 이곳은 안국동 윤보선가 일대다. 서울특별시 민속문화재 제27호인 윤보선가는 윤보선 전 대통령의 일가가 4대째 사는 집이다. 윤보선가옥 내부는 입장할 수 없지만, 주변의 돌담길은 고즈넉한 분위기 때문에 사진촬영 장소로 많은 관광객에게 사랑받는 곳. 한복을 입고 기념촬영을 하는 이들을 쉽게 찾아볼 수 있다.',' 종로구 윤보선길 62','','')";
        db.execSQL(q);
        q= "insert into doggabi values('23','원데이한복','윤보선가 부근에 위치한 원데이한복은 전통한복에서부터 화려한 장식의 퓨전 한복, 편안한 생활한복과 아동용 한복까지 1,000여 벌이 넘는 다양한 한복을 대여할 수 있다. 특징은 다른 곳에 비에 가격이 무척 저렴하다는 것. 4시간 이용은 15,000원, 24시간 이용은 28,000원이다. 영어, 중국어, 일본어 등 다양한 외국어를 구사하는 직원이 상주하고 있어 외국인 친구와 함께하기 좋다.\n" +
                "윤보선가 일대를 걷다보면 건너편의 정독도서관 담을 따라 유난히 좁고 꼬불꼬불한 언덕길을 만나게 된다. 삼청동의 차 마시는 뜰은 다양한 전통차를 맛볼 수 있는 곳으로, 한복으로 곱게 차려입고 방문하기에 제격이다. 100년 이상의 역사를 가진 한옥 안에는 정갈하게 가꾼 정원과 연못이 자리한다. 봄과 여름에는 차가운 오미자차와 복분자차가 인기 메뉴로, 포실한 식감의 단호박 시루떡을 곁들이면 더욱 맛깔스럽다.','서울 종로구 북촌로5길 4','070-4202-4310','http://www.onedayhanbok.com/')";
        db.execSQL(q);




        q= "insert into ddoohaeyoung values('24','삼청동 골목길, 커피방앗간','박도경과 오해영이 울 때도 웃을 때도, 싸울 때도 다정할 때도 언제나 함께하던 곳, 함께 걷던 길이다. 이미 연인들에게 입소문이 난 삼청동 골목은 그야말로 걷는 재미, 풍경을 즐기는 재미가 있다. 드라마 사상 가장 격렬했던 도경과 해영의 키스신도 여기서 탄생했다. 이곳에 오려면 1호선 종각역에서 인사동 길을 따라 걷다가 풍문여고를 지나 그 길을 쭉 올라가야 한다. 왼편에는 삼청동의 터줏대감인 카페 ‘커피방앗간’이 자리하고 있는데 해영과 도경은 이곳에서 커피가 아닌 밥을 먹었더랬다. 걷다가 더우면 커피방앗간에 들러 시원한 아이스커피 한 잔을 마셔도 좋고, 왼쪽으로 돌아 좁은 골목 구석구석을 누비고 다녀도 좋다. 다만, 실제 거주지이므로 시끄럽게 떠드는 것은 금물이다. ','서울 종로구 북촌로5가길 8-11','02-732-7656','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung values('25','구포국수','한성대입구역에서 출발해 슬슬 걷다보면 발견하게 되는 국수집이다. 낮은 지붕으로 둘러싸인 고즈넉한 마을 분위기와 꼭 닮은 구포국수는, <또 오해영> 5회에서 해영과 도경이 씁쓸한 마음을 소주 한 잔으로 달래던 곳이다. 밤에 가게 앞에 서 있으면 조명 받은 한양도성이 보인다고 하니 이만한 운치가 있을까. 구포국수 매장은 화면에서도 얼핏 보이듯 어여쁜 화단을 마주보고 있다. 소박한 꽃과 작은 나무들이 1970년대를 닮은 구포국수의 분위기와 절묘하게 맞아 떨어진다. 구포국수에 들러 선선한 밤바람과 국수 한 사발에 더위를 날려보는 건 어떨까. 여기에 <또 오해영>의 도경과 해영처럼 소주 한 잔의 낭만까지 챙긴다면 그야말로 지상낙원이 따로 없을 것이다. ','서울특별시 성북구 성북로 52-1','02-744-0215','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung values('26','다이닝바 루','‘예쁜’ 오해영과 ‘그냥’ 오해영이 회사 동료들과 함께 불타는 밤을 보내던 곳! 다이닝바 루다. 음주가무의 결정판을 보여줬던 회식장면에서 눈에 띄었던 것은 넓은 공간에 촘촘히 박힌 화려한 조명과 높고 웅장한 천장. 경복궁의 경회루(慶會樓)를 모티브로 했다는 인테리어는 그 자체만으로 매장의 분위기를 압도한다. 무엇보다 소규모 하우스웨딩, 런칭쇼, 패션쇼, 쇼케이스, 전시회, 연주회 등 다채로운 문화행사와 프라이빗 파티를 진행할 수 있는 복합문화공간이라는 점이 특징이다. 평일 18시부터 22시까지 무제한 와인뷔페도 진행하고 있다니 회식이나 모임을 준비하는 사람들이라면 체크해두자. 스무 가지 다채로운 안주 메뉴와 함께 다양하게 준비된 와인과 생맥주를 즐길 수 있다. 오해영과 회사 동료들처럼 신나게 마시고 노래하고 춤추며 화려한 불금을 보내고 싶은 사람들에게 적극 추천한다. ','서울 강남구 영동대로 513 코엑스 컨벤션센터 1층(동문)','02-6002-2003','www.coexourhome.co.kr')";
        db.execSQL(q);




        q= "insert into bulgudae values('27','서울시립미술관','덕수궁 돌담길에서 정동길로 접어들면 고풍스러운 건물 한 채가 우뚝 서 있다. 서울시립미술관 서소문 본관이다. 전시보다 먼저 미술관 건물 자체의 건축미가 두드러진다. 미술관 측은 르네상스 양식인 옛 대법원 건물의 전면부는 그대로 보존하고 후면부에 현대식 건물을 신축했다. 미술관에 들어섰을 때 가장 처음 만나는 공간이 바로 옛 건물의 전면부와 새 건물의 벽면을 유리로 연결한 매개 공간이다.\n" +
                "특히 유리 천장으로 쏟아지는 자연광은 정말 매력적이다. 서울시립미술관의 전시회는 전문성과 대중성을 적절히 조화시키는 것으로 유명하다. 샤갈, 피카소, 마티스, 마그리트, 고흐 등 미술에 문외한인 사람도 익히 알 만한 세계 유명 화가들의 전시회는 물론 국제미디어아트비엔날레, 미술관 봄나들이전 등 특색 있는 기획 전시를 선보인다.','04515 서울 중구 덕수궁길 61 (서소문동, 서울시립미술관)','02-2124-8800','http://sema.seoul.go.kr/')";
        db.execSQL(q);
        q= "insert into bulgudae values('28','루카511','루카511은 강남구 청담동 한복판에 위치한 분위기 좋은 이탈리안 레스토랑이다. 도심 속의 아방궁이라 불리는 루카511은 스몰 웨딩이 이루어지기도 하며, 드라마<별에서 온 그대>, <리멤버-아들의 전쟁>, 그리고 <우리 결혼했어요> 등의 프로그램 촬영지이기도 하다.','06010 서울 강남구 도산대로81길 40 (청담동, LUKE511빌딩)','02-540-6640','https://www.instagram.com/luka511_seoul/')";
        db.execSQL(q);
        q= "insert into bulgudae values('29','DDP(동대문디자인플라자)','한류여신 톱스타 천송이와 외계남 도민준의 로맨스를 그린 별에서 온 그대. 전체적으로 드라마 시청률이 낮아진 시점에 최고 시청률 28.1%를 기록하며 너무나 유명해진 치맥뿐만 아니라 매회 드라마 속 패션과 출연진, 촬영된 곳까지 모두 화제가 되었다. 아직도 많은 사람들이 기억하고 떠올리는 별에서 온 그대 속 촬영지 중 대표적인 곳은 바로 N서울타워다. 서울을 한눈에 조망할 수 있는 남산의 명소로 이미 유명한 곳이지만 천송이와 도민준의 사랑이야기로 이곳은 더욱 로맨틱한 장소가 되었다.\n" +
                "운치 있는 덕수궁 돌담길에 자리한 서울시립미술관은 도민준과 도민준의 단짝, 장변호사가 함께 산책을 하며 대화를 하다 천송이에게 걸려온 전화를 받는 장면이 촬영되었다. 이곳은 미술 관람은 물론 근대식 건물과 함께 아기자기한 야외 정원이 마련되어 있어 도민준처럼 마음을 털어놓을 수 있는 단짝과 산책하기 딱 좋은 장소다.\n" +
                "마지막회에 다시 지구로 돌아온 도민준이 천송이와 로맨틱한 입맞춤을 나눈 곳은 국립극장이다. 실제로 60년이 넘는 역사를 이어온 공연계의 중심지로 매월 다양한 공연을 만나볼 수 있는 곳이다. \n" +
                "그 외에도 냄비우동을 먹고 싶다는 천송이를 위해 김수현이 들른 국수집, 장변호사와 도민준이 이야기를 나누던 다방 등 별에서 온 그대 촬영지만으로도 서울의 이곳 저곳을 둘러볼 수 있다.','04566 서울 중구 을지로 281 (을지로7가)','02-2153-0000','http://www.ddp.or.kr/main')";
        db.execSQL(q);
        q= "insert into bulgudae values('30','팜팜피아노 다이닝바','팜팜피아노는 상수에 위치한 다이닝바로 과거에 피아노 가게를 운영하던 곳으로 기존의 이름을 그대로 사용하고 있다. 내부는 편안한 분위기를 띄우고 있으며, 벽지부터 쉽게 볼 수 없는 인테리어 소품들까지, 고풍스러우면서도 유니크한 느낌의 동서양의 조화를 즐길 수 있는 곳이다.','04074 서울 마포구 와우산로3길 21 1층','\n" +
                "070-4068-2669','https://www.facebook.com/pp.piano.seoul')";
        db.execSQL(q);



        q= "insert into taeyang values('31','비플러스엠','<태양의 후예> 2회 중 한 장면. 아프가니스탄에서 돌아온 유시진이 강모연의 병원 앞에서 그녀를 기다리고 있다. 유시진은 그녀와 근사한 식사를 하려고 했지만, 머리도 못 감은 강모연이 그를 데리고 들른 곳은 바로 자신의 집. 심지어 외식 대신 밥을 시켜 먹으며 첫 데이트가 시작되는 장면이다. 드라마 속 흔히 등장하는 화려한 오피스텔이 아니어서 더욱 눈길이 갔던 이곳은 다름 아닌 서울 마포구 연남동의 가구 상점 비플러스엠. 30평짜리 주택을 개조해 매장으로 사용하고 있는데 친환경 원목 가구를 판매하고 있다. 촬영 당시 유시진과 강모연이 밥을 먹은 자리에는 이제 침대가 들어서 있지만 이곳만의 편안하고 따뜻한 느낌만은 변하지 않았다.','서울 마포구 성미산로29길 23','02-336-7181','www.bplusm.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang values('32','CGV 홍대','강모연과 유시진의 첫 영화데이트가 성사된 곳은 실제로 강모연의 집과도 멀리 떨어져 있지 않은 CGV 홍대다. 촬영이 진행된 6관은 드라마가 방영된 직후 송중기와 송혜교의 데이트 장소로 입소문을 타며 일부러 찾아오는 관객들도 늘었다고. 그들이 앉은 I열 6번과 7번에 앉아 영화를 기다리다 보면 “난 지금이 설렌다. 미인이랑 같이 있어서”라고 얘기하는 달콤한 유시진의 대사가 생생히 되살아나는 기분이 들것만 같다. 단, 옆자리엔 반드시 이성이 앉아있을 것! 똑같은 영화관이지만 연인들에게야말로 색다른 추억을 줄 수 있는 장소다. ','서울 마포구 양화로 153, 4층',' 1544-1122','www.cgv.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang values('33','서브웨이 논현역점','강모연이 “초코칩 쿠기 세트 추가”와 “할라피뇨 잔뜩!”을 외쳤던 곳이다. 강모연은 서브웨이 논현역점에서 동료들을 위해 샌드위치를 한 아름 사러 들어가기도 했고 유시진 대위와 알콩달콩 브런치 데이트를 즐기기도 했다. 빵과 속 재료, 소스까지 선택할 수 있는 서브웨이의 특징은 드라마 속 강모연의 대사에서도 고스란히 드러난다. 이미 전 세계적으로 인기를 얻고 있는 샌드위치 매장이지만, 강모연이 좋아한다는 ‘양파 빼고 할라피뇨가 많이 들어간 클럽 샌드위치’를 직접 맛보러 한 번쯤은 들러도 좋지 않을까. 소소하지만 흥미로운 경험이 될 것이다.','서울 서초구 강남대로 535 프린스빌딩',' 02-512-1014',' www.subwaykorea.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang values('34','달콤커피 양재점','<태양의 후예> 6회에서는 그야말로 서대영 상사와 윤명주 중위의 애정신이 빛을 발했는데 내용인즉슨 이렇다. 서대영은 유리창 밖에 서 있는 윤명주를 향해 입술을 내밀며 셀카를 찍는다. 유리창을 사이에 두고 두 사람은 마치 뽀뽀를 하는 것 같은 제스추어를 취하며 로맨틱한 무드를 형성한다. 일명 구원커플로 불리는 이들의 데이트 장면은 달콤커피 양재점에서 촬영됐다. 실제로 달콤커피 양재점에는 태양의 후예 포스터가 곳곳에 붙어 있다. 구원커플이 앉은 자리를 찾는 데는 그리 오랜 시간이 걸리지 않는다. 두 사람이 앉은 자리에는 친절하게도 ‘여기가 바로 태양의 후예 구원커플 자리지 말입니다!’라는 문구가 적혀있기 때문. 연인들이라면 ‘구원커플’이 앉았던 자리에서 직접 서대영과 윤명주가 되어 ‘셀카’를 찍어보는 것도 쏠쏠한 재미가 될 것이다','서울 서초구 강남대로27길 7-21','02-529-8399','http://www.dalkomm.com/index.php')";
        db.execSQL(q);




        q= "insert into oungpal values('35','쌍문동','<응답하라 1988>의 동갑내기 소꿉친구들 덕선과 정환, 택, 선우, 동룡은 쌍문동 주택가의 담장을 마주한 이웃사촌들이다. 극중 덕선은 ‘쌍문여고’에, 남자 주인공들은 ‘쌍문고’에 다니는 것으로 그려지는데, 실제로 쌍문동의 이름을 딴 학교는 ‘쌍문초등학교’가 유일하다. 다만 드라마에서 비춰지는 골목길 풍경이나 통학버스의 노선 등을 보아 두 학교의 실제 모델은 정의여고와 선덕고인 것으로 추정된다. \n" +
                "쌍문역 4번 출구에서 정의여고까지 향하는 골목길에서는 당장이라도 <응답하라 1988> 속 주인공들을 마주칠 것만 같은 정겨운 주택가가 나타난다. 오랜 세월이 묻어나는 세탁소와 약국, 빨간 벽돌담의 아담한 주택들이 모여 있는 풍경이 어린 시절의 향수를 불러일으킨다. \n" +
                "“오늘 브라질 떡볶이 갈까?”\n" +
                "극중 덕선과 친구들의 대화에 자주 등장하는 그곳, 브라질 떡볶이. 조금 기묘한 이름을 가진 이 분식집은 1990년대 중후반까지 실재했던 곳으로, 당시 정의여고 앞에 소문난 분식집이었다고. \n" +
                " ','','','')";
        db.execSQL(q);
        q= "insert into oungpal values('36','호호분식','2016년 현재 브라질 떡볶이는 그 자리에 없지만, 정의여고 앞 우측 좁은 골목길을 지나면 오랜 시간 터를 잡은 듯 한 분식집들이 모여 있다. 이곳 분식집들마다 공통으로 내놓는 독특한 메뉴가 하나 있는데, 다름 아닌 ‘치즈밥’이다. 김가루를 뿌린 볶음밥 위에 모짜렐라 치즈를 얹어낸 것으로 가격도 저렴해 인근 학생들에게 인기라고. 저렴한 가격은 물론, 학창 시절을 떠올리게 하는 그 맛을 느낄 수 있다.  \n','서울시 도봉구 도봉로 121길 32','','')";
        db.execSQL(q);
        q= "insert into oungpal values('37','둘리뮤지엄','둘리뮤지엄 관람 후에는 둘리공원을 통해 북한산 둘레길로 향하거나, 도봉구를 가로지르는 우이천변으로 산책이 가능하다. 둘리뮤지엄에서 쌍문1동 주민센터 방향으로 15분가량 걸어내려오면 둘리가 처음 발견되었다는 우이천(수유교 근처)을 만날 수 있다. 수유교를 기점으로 약 150m 구간에 걸쳐 둘리 벽화가 조성되어 있는데, 원작자인 김수정 작가가 벽화의 초안을 그린 후, 덕성여대 재학생·전문가 70여명이 손을 모아 함께 그려냈다고. 중랑천 지류 중 가장 규모가 큰 우이천은 길이가 약 8㎞에 달하는데, 둘리 벽화는 물론 계절마다 피어나는 들꽃들을 배경으로 천천히 산책하기 좋다. ','서울시 도봉구 시루봉로 1길 6','02-990-2200',' http://www.doolymuseum.or.kr/')";
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
                    draw1 = R.mipmap.b1_2;

                }else if(name.equals("2")){
                    draw1 = R.mipmap.b2_1;

                }else if(name.equals("3")){
                    draw1 = R.mipmap.b3_1;

                }else if(name.equals("4")){
                    draw1 = R.mipmap.b4_1;

                }else if(name.equals("5")){
                    draw1 = R.mipmap.b5_2;

                }else if(name.equals("6")){
                    draw1 = R.mipmap.b6_1;
                }else if(name.equals("7")){
                    draw1 = R.mipmap.b7_2;

                }else if(name.equals("8")){
                    draw1 = R.mipmap.b8_1;
                }else if(name.equals("9")){
                    draw1 = R.mipmap.b9_1;
                }else if(name.equals("10")){
                    draw1 = R.mipmap.b10_1;

                }else if(name.equals("11")){
                    draw1 = R.mipmap.b11_1;

                }else if(name.equals("12")){
                    draw1 = R.mipmap.b12_1;

                }else if(name.equals("13")){
                    draw1 = R.mipmap.b13_1;

                }else if(name.equals("14")){
                    draw1 = R.mipmap.b14_2;

                }else if(name.equals("15")){
                    draw1 = R.mipmap.b15_1;

                }else if(name.equals("16")){
                    draw1 = R.mipmap.b16_1;

                }else if(name.equals("17")){
                    draw1 = R.mipmap.b17_1;

                }else if(name.equals("18")){
                    draw1 = R.mipmap.a18_1;

                }else if(name.equals("19")){
                    draw1 = R.mipmap.b19_2;

                }else if(name.equals("20")){
                    draw1 = R.mipmap.b20_1;

                }else if(name.equals("21")){
                    draw1 = R.mipmap.b21_2;

                }else if(name.equals("22")){
                    draw1 = R.mipmap.b22_1;

                }else if(name.equals("23")){
                    draw1 = R.mipmap.b23_1;

                }else if(name.equals("24")){
                    draw1 = R.mipmap.b24_2;

                }else if(name.equals("25")){
                    draw1 = R.mipmap.b25_1;

                }else if(name.equals("26")){
                    draw1 = R.mipmap.b26_1;

                }else if(name.equals("27")){
                    draw1 = R.mipmap.b27_1;

                }else if(name.equals("28")){
                    draw1 = R.mipmap.b28_1;

                }else if(name.equals("29")){
                    draw1 = R.mipmap.b29_1;

                }else if(name.equals("30")){
                    draw1 = R.mipmap.b30_1;

                }else if(name.equals("31")){
                    draw1 = R.mipmap.b31_2;

                }else if(name.equals("32")){
                    draw1 = R.mipmap.b32_1;

                }else if(name.equals("33")){
                    draw1 = R.mipmap.b33_1;

                }else if(name.equals("34")){
                    draw1 = R.mipmap.b34_1;

                }else if(name.equals("35")){
                    //
                    draw1 = R.mipmap.b35_2;

                }else if(name.equals("36")){
                    draw1 = R.mipmap.b36_3;

                }else if(name.equals("37")){
                    draw1 = R.mipmap.b37_1;

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




