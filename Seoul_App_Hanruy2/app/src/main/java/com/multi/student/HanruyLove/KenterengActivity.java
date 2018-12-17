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


public class KenterengActivity extends AppCompatActivity {
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
        q= "drop table if exists runningman4 ";
        db.execSQL(q);
        q= "drop table if exists muhandozun4 ";
        db.execSQL(q);
        q= "drop table if exists ougul4";
        db.execSQL(q);
        q= "drop table if exists nahonza4";
        db.execSQL(q);
        q= "drop table if exists bijungsang4";
        db.execSQL(q);

        q = "create table if not exists runningman4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists muhandozun4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ougul4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists nahonza4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bijungsang4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);

        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into runningman4 values('1','401 (Hongdae)', '401 restaurant in Hongdae is a Jeju pork specialty restaurant operated by the multi-functional entertainer Haha who plays in <Infinite Challenge> and <Running Man>. At the 401 restaurant, which has a unique interior that reminds you of Jamaica, you can enjoy Korean barbecue dishes such as mushrooms, five-pounded pork, and pork bacon by listening to reggae music. It is known that it is often used as a venue for Infinite Challenge. If you are lucky, you can meet Haha yourself. ',' 04043 Sadangri-ro 23, Mapo-Gu, Seoul, Korea ','02-325-0805','')";
        db.execSQL(q);
        q= "insert into runningman4 values('2','Tongin Market', 'Tongin Market is a place where commercial market is active. It is famous as a benchmarking example of other traditional markets. In particular, it is a self-produced market in Tongin Market. At the same time, they receive a black plastic plate as well as exchange money for the festival. From that time on, they can go around the market and eat food while carrying a plate. However, the festival can only be used at merchants. ',' 03036 Jahamunro Road 15 Jongno-gu, Seoul 18 ','\n" +
                "02-722-0911','http://tonginmarket.co.kr/mall/index.php')";
        db.execSQL(q);
        q= "insert into runningman4 values('3','Tartine', 'Famous for a pie house where Yoo Jae Seok is in the running man \\ n \"+\n" +
                "                \"Show the pie so that you can see it from the outside, stop the walk of those passing by \\ n\" +\n" +
                "                \"It is decorated in an exotic and unique interior, the interior is spacious and has a lot of seating \\ n\" +\n" +
                "                \"An American chef can bake your own and enjoy a fine pie sticking to authentic recipes with ice cream or americano \\ n\" +\n" +
                "                \"One or two stores are facing \\ n\" +\n" +
                "                \"There are shops on both sides of the alley, and the interior is spacious with two floors.\','04350 \n" +
                "Itaewon Road 23 Yongsan-gu, Seoul 4 (Itaewon-dong)','\n" +
                "02-3785-3400','http://www.tartine.co.kr/shop/main/index.php')";
        db.execSQL(q);
        q= "insert into runningman4 values('4','Gwanghee Fashion Mall ',' Gwanghee Fashion Mall is located in Dongdaemun, which is Seouls most famous shopping center and one of the four seasons. It is a wholesale specialty shopping mall that can connect the producers and consumers directly and buy fashionable clothes at low price. You can buy a variety of clothing and fashion items from ladies, mens, casual, womens wear, childrens wear, sportswear, leather, fur to hundreds of stores from the first floor to the sixth floor. It is open from 9:00 pm to 5:00 pm the next day, so it is good to look around the nearby Dongdaemun Design Plaza (DDP), Cheonggyecheon and Naksan Park.\n" +
                "\n" +
                "\n" +
                "Gwanghee Fashion Mall started to gain popularity through SBS entertainment program <Running Man>, which is loved not only by domestic fans but also by overseas fans. World-renowned action stars, Jackie Chan and Super Junior member Choi Won-won have held races here to win the treasure. Dongdaemun Design Plaza (DDP), located adjacent to Gwanghui Fashion Mall, is famous for various Korean drama and programs. Visitors can enjoy high-end cultural arts while enjoying the unique architecture designed by renowned architects. Many stars, including singer dragon, actor Kim Soo-hyun, and Park Bo-gum, have visited.','04567 Seoul, Jung-gu Maero Road 1 21 (Shindangdong, Gwanghee Fashion Water)','02-2238-4352','')";
        db.execSQL(q);


        q= "insert into muhandozun4 values('5','Amnesty International','In a multi-specialty feature, Yoo Jae-seok and Park Myeong-su used to eat bibim noodles to raise heart rate. When you visit a real shop, the photographs and signs of the time are decorated. Gwangbokguk collection can enjoy fine noodles, Dongdongju, and Korean dishes in a simple and cozy interior atmosphere reminiscent of the 1970s. In <Infinite Challenge>, the figure of eating spicy bibimbap noodles was spread by running in place because of heart rate. Park Myeong - soos heart beat exceeded 110 because of the bibimbap noodles and the hot fever. Of course, there are many dishes that can be enjoyed comfortably even if it is not Bibim noodles. Famous menus such as sikjeong and Dongdongju, anchovy noodles, bosam, seafood pancake, and gojongbyeo are the main subjects. ',' 214-7, Sangam-dong, Mapo-gu, Mapo-gu, Seoul','02-374-6870',' www.manboknoodle.com')";
        db.execSQL(q);
        q= "insert into muhandozun4 values('6','Dureauga','In a multi - card special feature, Hwang Kwang - hee and Hwang Kwang - hee, both of whom were spokesmen, sought to keep their heart rate below 100. Hanwoo is the main menu, but in the Infinite Challenge, a cool noodle appeared as the main character. The scene that the mouthpiece turns round even if I see both the type and Hwang Kwang-hee turning on the broth coolly! In Korea, an unusual heat wave continued, and even when I saw them eating cold noodles, they felt cool. Dureuga is a charcoal-grilled Hanwoo specialty store operated by the NACF. The quality and taste are superior than any other place because you choose only Hanwoo which is selected from the NACF. If the noodle soup is made with this Hanwoo, the taste is guaranteed even more. Especially, the characteristic of this place is to study how to bake delicious and bake your own meat until it is cooked! ',' Seoul Mapo-gu World Cup North 356\n','02-374-9255',' www.doorewooga.co.kr')";
        db.execSQL(q);
        q= "insert into muhandozun4 values('7','The Mapgoon','\n" +
                "The place where Haha and Jung Jun-ha went to raise their heart rate is Shinchon`s spicy chicken restaurant. The maple spicy chopped chicken ribs can choose a hot spice step by step, and you can eat huge amounts of red pepper paste and tteokbokki sari free of charge. Cheese toppings, fried rice with cheese and steamed eggs are also on the side menu to neutralize the spicy flavor. If you are weak in spicy food, cook the weakest stage and eat it with rice balls or steamed egg. For reference, the fugitives Haha and Jung Jun - ha, who had to maintain a heart rate of 100 or more at the multi - focal feature, ate the most spicy chicken breast. When I look at the pictures of Ha Ha and Jung Jun Ha, who sweat the sweat and suck the galbi steam, I spit in my mouth. ',' Yonsei-ro in Seoul Seodaemun-gu 5','02-323-5574','http://kprince.fordining.kr/')";
        db.execSQL(q);
        q= "insert into muhandozun4 values('8','MBC WORLD','MBC from Cultural Broadcasting moved to Sangam-dong DMC complex and introduced MBC World, the first broadcasting theme park in Korea, which evolved the existing broadcasting program. Visitors can become MBC drama and popular entertainment programs, enjoy various experience and video visualization realized with advanced technology, and face actual broadcasting production site. On the outside of the MBC building, programs currently being broadcast are shown on the media board, and handprinting and lifelike photos of the stars are displayed. Inside the building, you can experience MBC history, holistic theater performances of GD and Psy, dance experience studio, virtual reality experience space, trick art photo wall, and various attractions. On the 4th floor, you can try the historical drama costume at the shooting set which reproduces drama such as Daejanggum and Jiji Empress, and you can try anchor experience at the MBC news station on the 7th floor. MBC World Tour runs 9 times a day, on reservation basis, with a guideline for a total of 90 minutes. MBC World, the first broadcasting theme park in Korea, you can enjoy special experiences of dancing and singing with the star centered on Korean drama and entertainment contents and becoming the protagonist in the drama. Experiences such as virtual reality experience, dance experience studio, hologram stage and other high technology are especially popular with tourists. At the end of the tour, you can also receive welcome greetings from Korean Wave stars and digital signatures. In fact, popular programs such as `Show! Music Center`, `Infinite Challenge`, and `Radio Star` are being produced at MBC Global Media Center, so you can expect unexpected encounters with Korean Wave stars.',' 267 (Sangam-dong, Culture Broadcasting Co., Ltd.)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);



        q= "insert into ougul4 values('9','MBC WORLD','MBC from Cultural Broadcasting moved to Sangam-dong DMC complex and introduced MBC World, the first broadcasting theme park in Korea, which evolved the existing broadcasting program. Visitors can become MBC drama and popular entertainment programs, enjoy various experience and video visualization realized with advanced technology, and face actual broadcasting production site. On the outside of the MBC building, programs currently being broadcast are shown on the media board, and handprinting and lifelike photos of the stars are displayed. Inside the building, you can experience MBC history, holistic theater performances of GD and Psy, dance experience studio, virtual reality experience space, trick art photo wall, and various attractions. On the 4th floor, you can try the historical drama costume at the shooting set which reproduces drama such as Daejanggum and Jiji Empress, and you can try anchor experience at the MBC news station on the 7th floor. MBC World Tour runs 9 times a day, on reservation basis, with a guideline for a total of 90 minutes. MBC World, the first broadcasting theme park in Korea, you can enjoy special experiences of dancing and singing with the star centered on Korean drama and entertainment contents and becoming the protagonist in the drama. Experiences such as virtual reality experience, dance experience studio, hologram stage and other high technology are especially popular with tourists. At the end of the tour, you can also receive welcome greetings from Korean Wave stars and digital signatures. In fact, popular programs such as `Show! Music Center`, `Infinite Challenge`, and `Radio Star` are being produced at MBC Global Media Center, so you can expect unexpected encounters with Korean Wave stars.',' 267 (Sangam-dong, Culture Broadcasting Co., Ltd.)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into ougul4 values('10','Seol Bing Shinlim 2 shop','Seolbing is a dessert café that sells unique fried rice cakes such as tiramisu, mango cheese-bing water, and various toppings such as injeolmi toast and cheese rice cake pizza. Seolbing Sinlim 2 is run by actor Lee Jong-hyun, who plays not only music but also an actor, and Lee Jong-hyun has enjoyed dating actress Kong Seung-yeon, a virtual couple in <We Got Married>. Lee Jong-hyun`s autograph and photos of his performance are on display.','08760 The second floor of Sindim-ro, Gwanak-gu, Seoul','02-882-9080','http://sulbing.com/')";
        db.execSQL(q);
        q= "insert into ougul4 values('11','Ma Bok-rim, your youngest son, Topokki','The daughter-in-law of Ma Bok-rim, the daughter-in-law who made the original Sindang-dong Tteokbokki, is a restaurant specializing in tteokbokki, which is run after receiving secret recipe. It is located in Sindang-dong Tteokbokki Town. It has become more popular. Recently, it is also providing a delivery service.\n.','04611 221 Dasan-ro, Jung-gu, Seoul (Sindang-dong)','02-962-8288','http://mabokrim.subnara.info/')";
        db.execSQL(q);
        q= "insert into ougul4 values('12','Jamsil Cart Experience Center','Jamsil Cart Experience Center is located in Jamsil, where people of all ages and sexes can enjoy healthy hobbies through motor sports without a driver`s license. It was also used as an entertainment show. Closed on Mondays, events and rainy days. Business is normal on holidays.','\n" +
                "05500 Olympic Games in Songpa-gu, Seoul 25 (Samsil-dong, Seoul)','02-420-3886','http://www.birel.kr/?act=main')";
        db.execSQL(q);
        q= "insert into ougul4 values('13','The spa Garden five','a large steam room with hotel-grade sauna, shopping, and entertainment We can enjoy Korean bath culture as seen in drama and relieve fatigue of travel.','10 Garden Five in Chungmin-ro, Songpa-gu, Seoul','02-404-2700','http://www.spagarden5.co.kr/')";
        db.execSQL(q);

        q= "insert into nahonza4 values('14','MBC WORLD','\n" +
                "MBC from Cultural Broadcasting moved to Sangam-dong DMC complex and introduced MBC World, the first broadcasting theme park in Korea, which evolved the existing broadcasting program. Visitors can become MBC drama and popular entertainment programs, enjoy various experience and video visualization realized with advanced technology, and face actual broadcasting production site. On the outside of the MBC building, programs currently being broadcast are shown on the media board, and handprinting and lifelike photos of the stars are displayed. Inside the building, you can experience MBC history, holistic theater performances of GD and Psy, dance experience studio, virtual reality experience space, trick art photo wall, and various attractions. On the 4th floor, you can try the historical drama costume at the shooting set which reproduces drama such as Daejanggum and Jiji Empress, and you can try anchor experience at the MBC news station on the 7th floor. The MBC World Tour is held nine times a day, with a reservation and a guided tour for a total of 90 minutes.\n" +
                "\n" +
                "\n" +
                "In MBC World, the first broadcasting theme park in Korea, you can enjoy special experiences of dancing and singing with the star centered on Korean drama and entertainment contents and becoming the protagonist in the drama. Experiences such as virtual reality experience, dance experience studio, hologram stage and other high technology are especially popular with tourists. At the end of the tour, you can also receive welcome greetings from Korean Wave stars and digital signatures. Indeed, popular programs such as `Show! Music Center`, `Infinite Challenge` and `Radio Star`are being produced at MBC Global Media Center, so you can expect unexpected encounters with Korean Wave stars.','03925 267 Seongam Road, Mapo-gu, Seoul (Sangam-dong, Culture Broadcasting Co., Ltd.)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into nahonza4 values('15','Mangwon Telephoto market','The Mangwon market is not so different from other traditional markets, but it has frequently appeared in \"I live alone\" so that it is called \"the meat market\". A lot of entertainers such as Kwangwoon, Kang Minhyuk and Kim Jung Min visit and gather foodstuffs that have raised their thumbs. There is a `Hong Chuk Kukguksu` which gives a bowl of noodles at a low price of 3,000 won This is the main character. You can enjoy a meal at a reasonable price and enjoy a traditional market visit..','Seoul Mapogu Pouenro 8road 14 ','02-335-3591',' https://mangwonsijang.modoo.at')";
        db.execSQL(q);
        q= "insert into nahonza4 values('16','Ansan','Kim Dong-wan, who is from the longest-running idol group `Shinhwa` and has been loved by humorous and robust images, is a member showing the essence of living alone even in <I live alone>. Ansan is located in Seodaemun-gu, where mountain bikes have been attracted by various hobbies. Ansan is 295.9m above sea level and is equipped with wheelchair and stroller so that you can enjoy a walk in comfort, About two and a half hours you can turn one wheel. The entrance to the mountain trail heading to Ansan is located in several places close to the city center, such as Moojae, Yongmun Gate and Seodaemun Natural History Museum. Walking along a gentle promenade leads to a scenic view that is beautiful enough to forget that the natural scenery, such as the Metasequoia road, is in the middle of Seoul','Yeonhui-dong, Seodaemun-gu, Seoul','02-330-1958','  http://www.sdm.go.kr/educate/naturepark.do?mode=view&sdmBoardSeq=379')";
        db.execSQL(q);
        q= "insert into nahonza4 values('17','\n" +
                "Hangzhou Han River Park','\n" +
                "The most popular rock band starring at Naejang Sanda is the vocalist Jung Wan-woo of the Rose Inn. He lives in the rooftop room near Mangwon-dong. One day, Jung Wan-wan looks around for the inspiration of composing and goes to the Hangang Park near the house. I sat alone in the park alone and sat on the harshness of creation, and he was pleased with the city by showing his instant bus kings in beautiful voice.','Mapon-gu, Mapo-gu, Seoul, Korea 467','02-3780-0601',' http://hangang.seoul.go.kr/archives/3565')";
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




