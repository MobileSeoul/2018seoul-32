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


public class KdramaengActivity extends AppCompatActivity {
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
        name = (TextView) findViewById(R.id.name);
        name.setText(i.getStringExtra("listname"));
        newname = i.getStringExtra("name");
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
        q= "drop table if exists hwayugi4 ";
        db.execSQL(q);
        q= "drop table if exists dangzamsa4 ";
        db.execSQL(q);
        q= "drop table if exists sarang4";
        db.execSQL(q);
        q= "drop table if exists ssam4 ";
        db.execSQL(q);
        q= "drop table if exists doctors4";
        db.execSQL(q);
        q= "drop table if exists doggabi4";
        db.execSQL(q);
        q= "drop table if exists ddoohaeyoung4";
        db.execSQL(q);
        q= "drop table if exists bulgudae4";
        db.execSQL(q);
        q= "drop table if exists taeyang4";
        db.execSQL(q);
        q= "drop table if exists oungpal4";
        db.execSQL(q);
        q = "create table if not exists hwayugi4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dangzamsa4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists sarang4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ssam4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doctors4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doggabi4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ddoohaeyoung4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bulgudae4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists taeyang4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists oungpal4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into hwayugi4 values('1','Culture reserve base','\n" +
                "After the oil crisis, the oil reserves of the Mapo Oil Reservoir, which was built with five oil tanks, were shut down for safety reasons ahead of the 2002 World Cup. In September 2017, the new cultural reserve facility, the cultural reserve facility for citizens, Born. The existing oil tank was recycled and turned into a performance hall, a lecture hall, an exhibition hall, a cafeteria, and a multipurpose lecture room for citizens. The Messenger of the Celestial Soul It is the `T1 pavilion` that came out as the azit of the Suvori survey. It is a place where you can see the old wall, the current building, and the rocky terrain of Mt. Mabong in a harmonious way, creating a new wall and roof in the concrete retaining wall after the dismantling of the tank. . In addition to T1 Pavilion, T2, T3, T4, T5, T6, and T0 are operated with various purposes and purposes, so it`s ok to take time out..',' Jeungsanro 87 Mapogu Seoul ','02-376-6410','https://parks.seoul.go.kr/template/sub/culturetank.do')";
        db.execSQL(q);
        q= "insert into hwayugi4 values('2','Walkerboud','It is the `Travel Pub`` Walker Bar out of which all the keywords such as travel, cats, Thai food and handmade beer are combined. It is a place where Son Gong-gong (Lee Seung-gi) rescues the third plagued by a gangster. It was introduced to the 2016 travel guide Lonely Planet and became famous as an azit of travelers all over the world visiting Namsan. Famous handmade beer with a special flavor, and Pat Thai and Choyang Baku, which are recognized by Thai locals, are the main dishes. Collecting the world`s currencies as well as Polaroid photographs of thousands of visitors. There is a \"fun street\" famous for the street of comics near the road that leads from the annex of Sungkyun Women`s University located on the opposite side of Walkerbu to the exit 3 of Myeongdong Station on Line 4, and there are various attractions.','49 Toegye-ro 20-gil, Jung-gu, Seoul','02-757-1110','https://www.instagram.com/pub_walkabout/')";
        db.execSQL(q);
        q= "insert into hwayugi4 values('3','Emac & Bolios Itaewon','In the first episode of \"Hwa-gi,\" Son Oh-gong (Lee Seung-gi) was worried that he had no customers at the ice cream parlor of Dong-gun. However, it is so popular that it is not necessary to worry about such things in Emac & Bolios. With up to 22 percent of Indian Alfonso mango and various seasonal fruits called the king of mango with fresh milk, the Emac&Bolios ice cream uses the best ingredients such as Madagascar, vanilla and homemade chocolate. Handmade waffle cone with 40 flavors of ice cream and colorful toppings such as French, chocolate, and Rainbow Sprinkles are posted on various social networks and is gaining huge popularity.','10-gil 16-gil, Itaewon-ro, Yongsan-gu, Seoul','02-797-0814','http://emackandbolios.kr/')";
        db.execSQL(q);
        q= "insert into hwayugi4 values('4','Itaewon Antik Story','Antik Story, which is located within the furniture street of Itaewon, is a place where furniture is rented and sold with Antik, Vintage and Rhettos. In \"Hwa-gi,\" Son Oh-gong (Lee Seung-gi) had to call Sa-jeong to buy the most expensive kettle in the store. There is a wide range of products ranging from retro furniture to expensive items. It is like a treasure trove for those who want to set up various filming props and interior furniture. It is located next to the road leading to the Community Center in Itaewon 1dong.','\n" +
                "Bokwang Road 104, Yongsan-gu, Seoul','02-733-2979','')";
        db.execSQL(q);




        q= "insert into dangzamsa4 values('5','Bottle Flower','\n" +
                "When you go up to the Bukchon Hanok Village along the road, you can see a florist in a distance. It is the same flower shop that Hongju (Suzu) greeted with pleasure. A variety of flowers are on sale, and dry flowers and pre-seasoned flowers are popular among tourists for a long time to enjoy their beauty. A short flower lesson is also available.','28 Yoonbosunroad, Jongrogu,Seoul',' 02-737-8934','http://www.botteflower.com/')";
        db.execSQL(q);
        q= "insert into dangzamsa4 values('6','Pastelata Anguk store','an Egtart store across from the Bottleflower Hong-ju (Suji) and Jae-chan (Lee Jong-seok) took their steps from the window, swallowing their mouths, but you don`t have to. One glass of egg and Americano, both of which are crispy and moist, will give you plenty of energy in the afternoon. It has been used as a filming location for various dramas.',' 31 Yoonbosunroad, Jongrogu,Seoul','02-733-2979','')";
        db.execSQL(q);
        q= "insert into dangzamsa4 values('7','We are young mural','\n" +
                "It is a mural painted on the wall under the overpass connecting Duksung Girls `High School and Duksung Girls` Way, along the way to the Yongdok Library with Angkukha Girls at the exit 1 of Anguk Station. The kissing old lady painting and we are young are loved by many tourists who come to Bukchon Hanok Village with impressive murals. It is the place where Hongju (Suji) and Ha-chan (Lee Jong-suk) stood side by side with time difference.','Seoul, Yulgok-ro 3-gil, Jongno-gu, Seoul','02-2148-1114','')";
        db.execSQL(q);
        q= "insert into dangzamsa4 values('8','Cafe Pumpkin','\n" +
                "Behind the back of Sejong University, the cafe is located opposite the Chosun Ilbo Chungdong Annex. While you are sleeping, it is the place where Hongju (Sui) and Lee Bum-bee (Lee Sang-yeop) meet on the rainy day, and it is where the castle is set, but it has a peaceful and cozy atmosphere unlike the atmosphere. On the sunny day, the sofa is facing the open terrace with a seating area at the top of the café. Pumpkin Coco Smoothie with honey pumpkin latte, coconut cream and jelly flavored with honey pumpkin similar to sweet potato latte is recommended for spring. Pumpkin pie and other dessert menus are also available.','40, Sejong-daero 21-gil, Jung-gu, Seoul','02-733-7905','https://www.instagram.com/cafepump_kin/')";
        db.execSQL(q);





        q= "insert into sarang4 values('9','Gracena','Gracena, located in Yeonnam-dong, is the place where Jeongseon, who returned from studying in France, appears as a restaurant called Good Soup. There are many different menus, but the most popular menu is homemade beer and pizza. Chef`s recommended menu is Indian curry, which is unique in that it goes well with wine. In the evening, you can enjoy wine and steak with soft lighting and a romantic atmosphere. Because of the wide space between the tables, it is easy to talk to each other while eating, and the cute little items placed around the table create a cozy atmosphere.','13th floor of Yeonnam-ro, Mapo-gu, Seoul','02-338-8908','')";
        db.execSQL(q);
        q= "insert into sarang4 values('10','Yangchul Cooking','This is where the florist chefs in The Temperature of Love took the Chef`s Cooking class before filming. a good amount Yang-chul, meaning good food, is also the name of this chef who studied cooking in Japan. The restaurant serves a healthy and reliable Korean meal using seasonal ingredients. It is a restaurant full of sincerity, always trying to develop new menus and not using condiments.','157 nonhyeon-ro 15-gil, Gangnam-gu, Seoul','02-547-4420','')";
        db.execSQL(q);
        q= "insert into sarang4 values('11','Weispacio','Jeongseon, who excelled in cooking before studying in France. Jeong-woo, who has tasted the food he has done, is in love with. In the drama, Jeong-woo first appeared as a place where he experienced the cuisine of Jeongseon, an Italian restaurant in Nonhyeon-dong. From warm soup to anti-pasto, main dish to dessert, the feast of Wispachio is truly beautiful. For lunch, there are three courses at reasonable prices. For dinner, you can choose from the main dish, steak or shellfish, snow floral, or lamb. Plating is also delicate, providing a satisfying meal for both vision and taste. Space is also attractive. If you want a romantic date, I recommend a window seat..','133 Road 21, Youngju Road, Gangnam-gu, Seoul','02-549-5667','https://www.yspazioseoul.com/')";
        db.execSQL(q);
        q= "insert into sarang4 values('12','Curt Jarri','Honga (Joe Boa), who was rejected in the drama, would have been sick, but the terraces in the scene were so beautiful. This is the French restaurant of Itaewon. Most of the staff, including chefs, are French, and the interior of the restaurant is like an open-air café in France, and wine is the place to think. Recommendation menu is salmon steak. It is a moderately sour and tasteless dish with a soft and tender texture. From the outdoor terrace on the first floor to the restaurant on the second floor, the bar on the third floor and the party lounge on the top floor. There is a wide variety of space available, and it is also possible to enter a companion animal.','Bokwangro 120, Yongsan-gu, Seoul','02-796-5072',' http://blog.naver.com/cotejardin')";
        db.execSQL(q);


        q= "insert into ssam4 values('13','Seoul Library Sky Garden','Dong-man (Park Seo-jun) comforts her by holding Anna (Kim Ji-won) who had a hard day at work and saying, \"When you want to cry, it`s cool to cry.\" The place where the tears burst in the arms of the East is the sky garden on the roof of the Seoul Library. Built in 1926, it has been a part of the history of Seoul for over 80 years and is now recognized as the library`s historic asset (Registered Cultural Property No. 52). When you want to take a break from reading a book, let`s go to the sky garden on the roof. Deoksugung Palace and Namsan can be seen on the left and right side of Seoul Plaza, respectively, and lights are turned on in the evening.','110, Sejong University Road, Jung-gu, Seoul','',' http://lib.seoul.go.kr/ ')";
        db.execSQL(q);
        q= "insert into ssam4 values('14','Miss uyun of a strange country','Another hero of the drama, Sul-hee (Song Ha-yoon) and Ju-man (Ahn Jae-hong) Only the province has shown her love for her family, saying, \"I do not marry anyone or anyone.\" This is a café and lounge bar with an impressive interior that reminds me of Alice in Wonderland. You can enjoy coffee and brunch during the day and cocktails and wines at night. The deer horn cafe latte is a unique original dish here with a combination of old-fashioned antler and coffee. At the roof top of the 2nd floor, you can enjoy the Yangjae stream and enjoy the cool breeze..','17 Road 3, Yangjae Stream, Seocho-gu, Seoul','02-353-7777','')";
        db.execSQL(q);
        q= "insert into ssam4 values('15','Luca 511','\n" +
                "Anna is an indefinite youth who slips into the announcer test every time but does not give up her dream. When she catches a microphone, her eyes shine and her voice shines on her own. The outdoor wedding ceremony that Ara had seen in a beautiful dress and society was held at Luca 511, which is also famous as the place where you are from. The main building, elegantly designed in the shape of a European palace, is the main venue of the event and the annex is a French restaurant. If you cross the garden from the main building, there is an annex. The garden connecting the main building with the annex is popular as a garden wedding place because of its beautiful scenery.','LUKA Building, 115-16 Cheongdam-dong, Gangnam-gu,','02-540-6640','')";
        db.execSQL(q);
        q= "insert into ssam4 values('16','AY Lounge','Pure Buddha Doctor Mu-Bin (Choi, Woo-sik) is against the appearance of Anna who watches society dignifiedly and witty at a wedding ceremony. In the bar towards the after-wedding party, Mubin`s friends urge Anna to drink, and to protect her from friends, he becomes a black knight. It is the AY lounge where the two parties begin. The AY Lounge is known as a location for various drama and entertainment programs such as <Wuhan Challenge Asura>, <Oh Hae Young> Finished in wood and leather, the antique and sophisticated interior gives the impression of a European castle. The place that appears as a regular in various dramas is the bar in the center, but the view from the sofa on the open 2nd floor is also good.','13th Street, Gangnam-gu, Seoul','02-552-8199','')";
        db.execSQL(q);





        q= "insert into doctors4 values('17','Bongzur hawaii','From the entrance to the roof of the parasol, a fusion restaurant that exudes exotic flavors. Hawaii`s traditional music resonating with stores, as well as unique props and interiors, is a place where people feel as if they have come to a cafe in Hawaii. Unique fusion dishes such as \"BBQ Sunset Platter,\" which includes sausages, potatoes, chicken skewers, shrimp and samgyeopsal, are the main dishes. Also, if you have a special dish called \"Swiza,\" which is nicknamed \"Magic Pizza,\" and a French-punch cocktail, you don`t envy your trip to Hawaii.\n" +
                "\n" +
                "Bongzurhai, which has appeared in the fourth episode of The Doctor, is already known as a hot place in Hongdae. This is because she appeared in the drama without being bored with the cafe run by Chun Soon-hee, the best friend of \"Doctor\" Yoo Hye-jung (Park Shin-hye). Hong Ji-hong (Kim Rae-won) and Yoo Hye-jung (Park Shin-hye) used to enjoy dating here along with their cool beer.','04043 Jandari-ro 3-An-gil, Mapo-gu, Seoul 23 (Seogyo-dong)','010-9756-5406','')";
        db.execSQL(q);
        q= "insert into doctors4 values('18','Seocheon Tongsunguk','Sechon Traditional Country, which appeared as a Korean rice restaurant run by Yoo Hye-jung (Park Shin-hye)`s father in the drama \"Datters,\" is famous for its deep broth, which was only used for 24 hours. The old hanok and neat interior also harmonizes with the scenery around Gyeongbok Palace. While the restaurant`s kimchi is also one of the most delicious kimchi. After the meal, don`t forget to take a picture of Jiho-hye when the couple enjoyed Korean rice together!','\n" +
                "03027  8 Sajik-ro 9-ga-gil, Jongno-gu, Seoul ','02-735-0122','')";
        db.execSQL(q);
        q= "insert into doctors4 values('19','Gangdong District Office','Yangdaechang Specialist run by Park Shin-hye`s parents, who starred in popular dramas such as \"The Bosses,\" \"Doctor\" and \"Pinocchio.\" There are portraits of Park Shin-hye, posters, props and gifts from fans such as cakes. Food items such as makchang, jagchang and yang are served from the rain market every day, and side dishes such as hot, clean mukbab are also prepared at the store. On days without a schedule, Park often visits with her colleagues.','05399 62 (Seongnae-dong, Yuwon Building)','02-478-1192','')";
        db.execSQL(q);







        q= "insert into doggabi4 values('20','Il Ga-ho','Han Eun-tak (Kim Go-eun) met his first love Tae-hee (Jung Hae-in). A picture-like scene was staged at Ilgamho in the background of the lake. Located within Konkuk University, it is often called\"the lake,\" but it is open to all but students. In spring and summer, the scent of trees and flowers surrounding the lake is perfect for a leisurely time. The glow of the Hongye-gyo in the lake provides an attractive night view when the sun sets.',' Seoul, Gwangjin-gu, Seoul 120','','')";
        db.execSQL(q);
        q= "insert into doggabi4 values('21','Unhyeongung Palace','‘\n" +
                "I will call you the safest place in the world. The house where the goblin called him whenever he was in jeopardy is the Chief of Unhyeonggung Palace located in Jongno. I lived with a goblin, a lion, and a japanese japan in a magnificent and luxurious exterior. Unhyeongung Palace is a sister of Heungseon Daewonun, and his son, King Gojong, who is a 26th king of Korea, was born and grew up. A European-style modern building with a gorgeous but sad story. In addition to <Gogebi>, it has appeared as a place for various dramas such as <Palace> <The King of Hearts>, and it is possible to experience a variety of traditional cultures including relics exhibition, traditional costume experience and historical concert.','\n" +
                "464, Samil Street, Jongno-gu, Seoul','02-765-1840 ',' http://www.unhyeongung.or.kr/')";
        db.execSQL(q);
        q= "insert into doggabi4 values('22','Yun Bo Sun','\n" +
                "Kim Shin, who suddenly appeared in front of Yeon-taek, who informed the grandmother ghost of the lottery winner number. This place is a part of Ahn Kook - Dong Yoon Bo-sun, the 27th folk cultural asset of Seoul, is the fourth generation of former family members of the former president. You can not enter the inside of the house, but the surrounding stone wall is a place where you can take photos because of the tranquil atmosphere. You can easily find those who wear a hanbok and make a memorial picture.',' 62 Yoonbosunroad ,Jongrogu, Seoul','','')";
        db.execSQL(q);
        q= "insert into doggabi4 values('23','One-day Hanbok','One day Hanbok, located near Yonbosun, can rent a variety of Hanbok, more than 1,000 pieces, from traditional Hanbok to colorful Fusion Hanbok, comfortable Hanbok and children`s Hanbok. The feature is that the price of rain is very cheap elsewhere. Four hours is 15,000 won and 24 hours is 28,000 won. English, Chinese, Japanese, and other foreign-language employees are available to stay with foreign friends.\n" +
                "When you walk around Yoon-bo Sun, you will meet the narrow and winding road along the front of the library. Samcheong-dong tea-drinking yard is a place where you can taste various traditional tea. The hanok has a history of more than 100 years and has a garden and a pond that have been carefully restored. In the spring and summer, cold omija tea and bokbunja tea are popular dishes.','5th street, Bukchon road, Jongno-gu, Seoul','070-4202-4310','http://www.onedayhanbok.com/')";
        db.execSQL(q);




        q= "insert into ddoohaeyoung4 values('24','Samcheong-dong alleyway, Coffee mill','When Park, Oh and Hae Young cry, when they laugh, when they fight, when they are sweet, they always walk together. Samcheong-dong alley, which has already made a word of mouth to lovers, has a fun of walking and enjoying scenery. Daesung, the most violent drama ever, was born here. If you want to get here, you have to walk along Insa-dong road from Jonggak station on line 1 and go up the road through Pungmun high school. On the left side, there is a café `coffee mill` in Samcheong - dong, where Haeyoung and Taotyeong were eating coffee instead of coffee here. If you walk up, stop by the coffee mill to drink a cup of cool iced coffee, or turn left and walk around the narrow alleys. However, since it is a real place of residence, it is not allowed to speak loudly. ','8-11 Bukchon Road, Chongno-gu, Seoul','02-732-7656','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung4 values('25','Gupo noodle','It is a collection of bureaus that you will find when you start walking from Hanseong area. The Gupo noodle, which resembles a tranquil village atmosphere surrounded by low roofs, is a place where healing with a bitter cup of shochu was made in the 5th meeting. If you stand in front of the shop at night, you can see the illuminated Hanyang city. The Gupo noodle shop faces a beautiful flowerbed just as it looks at the screen. The rustic flowers and small trees match the atmosphere of Gupo noodles resembling the 1970s. Stop by Gupo Noodle and try to blow the heat on the cool night breeze and a bowl of noodles. If you take the romance of a glass of shochu like <Oh, Hae Young> and Hae Young, there will be no earthly paradise. ','52-1 Seongbuk-ro, Seongbuk-gu, Seoul','02-744-0215','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung4 values('26','Dining bar Roo','‘\n" +
                "Beautiful `Oh Hae Young and` Just `Oh Hae Young have spent a burning night with company colleagues! Dining baruda. What was noticeable in the dining scene that showed the ultimate drinking performance was the colorful lighting, the high ceiling, and the grandeur. The interior of Gyeonghoeru in Gyeongbokgung, which is a motif, overwhelms the atmosphere of the store itself. Above all, it is a complex cultural space that can host various cultural events and private parties such as small house wedding, launching show, fashion show, showcase, exhibition, concert. Unlimited wine buffets are available from 18:00 to 22:00 on weekdays. Let`s check if you are preparing for a party or meeting. You can enjoy various prepared wine and draft beer along with twenty kinds of colorful snacks menu. It is highly recommended for those who want to drink, sing, dance and make a splash like Oh Hae Young and company colleagues. ',' 513 COEX Convention Center, 1st Floor, Dongdaemun, Yeongdong Daero, Gangnam-gu, Seoul','02-6002-2003','www.coexourhome.co.kr')";
        db.execSQL(q);




        q= "insert into bulgudae4 values('27','Seoul Museum of Art','When you fold into Jungdong-gil from Deoksugung Palace`s stone lane, one of the old-fashioned buildings stands high. It is the main building of the Seosomun of Seoul Museum of Art. Before the exhibition, the architectural beauty of the museum building itself stands out. The museum preserved the front part of the old Supreme Court building, a Renaissance style, and built a modern building on the rear. When you enter the museum, the space that you meet for the first time is the space that connects the front of the old building and the wall of the new building with glass.\n" +
                "\n" +
                "Especially the natural light pouring into the glass ceiling is really attractive. The exhibition at the Seoul Museum of Art is famous for its harmony of professionalism and popularity. Chagall, Picasso, Matisse, Magritte, and Van Gogh, as well as world renowned painters who are familiar with art, as well as an international media art biennale and a museum exhibition.','\n" +
                "04515 Deoksugung Gil 61, Jung-gu, Seoul (Seosomun-dong, Seoul Museum of Art)','02-2124-8800','http://sema.seoul.go.kr/')";
        db.execSQL(q);
        q= "insert into bulgudae4 values('28','Luca 511','\n" +
                "Anna is an indefinite youth who slips into the announcer test every time but does not give up her dream. When she catches a microphone, her eyes shine and her voice shines on her own. The outdoor wedding ceremony that Ara had seen in a beautiful dress and society was held at Luca 511, which is also famous as the place where you are from. The main building, elegantly designed in the shape of a European palace, is the main venue of the event and the annex is a French restaurant. If you cross the garden from the main building, there is an annex. The garden connecting the main building with the annex is popular as a garden wedding place because of its beautiful scenery.','LUKA Building, 115-16 Cheongdam-dong, Gangnam-gu,','02-540-6640','')";
        db.execSQL(q);
        q= "insert into bulgudae4 values('29','DDP(Dongdaemun Design Plaza)','\n" +
                "You are from a star who depicts the romance of Hanlou Goddess top star Thangsong and extraterrestrial Nam Min Joon. As a whole, when the ratings were lowered, the highest rating of 28.1% was recorded. Not only did it become so famous, but it also became a hot topic for every fashion, actress, and photographer in the drama. N Seoul Tower is one of the most popular shooting locations in Korea. It is already famous as a famous place of Namsan where you can see Seoul at a glance, but it became a more romantic place because of the love stories of Thansonyi and Daemunjun.\n" +
                "Seoul Metropolitan Museum of Art, located on the stone wall of the Deoksugung Palace, has a scene of taking a phone call to Thangjong while conversing with a friend of Dongmin and Joon Min. This is a good place to go for walks and walks, as you can see the arts, as well as the modern buildings and the charming outdoor gardens..\n" +
                "It is the National Theater where the romantic kiss with Tom Jong-il is restored to the earth in the last episode. In fact, it is a center of performing arts that has been in history for over 60 years, and it is a place where you can meet various performances every month.\n" +
                "In addition, you can go to various places in Seoul just by taking a photo from a star, such as a souvenir collected by Kim Soo-hyun, a lawyer who talked with Chang Min-joon, and a tea ceremony room.','04566 Euljiro 281 (Jijiro 7-ga), Jung-gu, Seoul','02-2153-0000','http://www.ddp.or.kr/main')";
        db.execSQL(q);
        q= "insert into bulgudae4 values('30','Pam Pam Piano Dining Bar','Pam Pam Piano is a place where the piano shop was operated just before the dining at the station, and it is still using its existing name. The inside is comfortable, and you can enjoy the unique blend of East and West, from antique and unique to wall-to-wall interior accessories.','04074 \n" +
                "1 floor 21, Woosan Road, Mapo-gu, Seoul','\n" +
                "070-4068-2669','https://www.facebook.com/pp.piano.seoul')";
        db.execSQL(q);



        q= "insert into taeyang4 values('31','B Plus M','one of the two scenes of the Sun Yu Si-jin, who returned from Afghanistan, is waiting for her in front of Kang`s hospital. Yu Si-jin tried to have a nice meal with her, but it was at her house where Kang, who had no hair, stopped by her. This is the scene where the first date begins while eating instead of eating out. As it is not the most popular \"Offsettel\" in the drama, BiplusM, a furniture store in Yeonnam-dong, Mapo-gu, Seoul, went further. The 30-pyeong house has been remodeled and used as a store, and is selling green wooden furniture. There is a bed where Yoo Si-jin and Kang ate rice at the time of filming, but the comfort and warmth of this place has not changed.','Sungmisan Road 29 Mapo, Mapo-gu, Seoul','02-336-7181','www.bplusm.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang4 values('32','CGV Hongdae','The place where Kangmo Yeon and Yoo Se-jin`s first film date was concluded is CGV Hongdae, which is not far from Kangmo-yun`s house. The 6th film, which was filmed, immediately became a date place for Song Ji-ki and Song Hye-kyo shortly after the drama was broadcast. When I sat down in the 6th and 7th seats I sat and watched the movie, I said, \"I`m in trouble now. I feel like the sweet ambassador of Yu-shin, who says, \"I`m with a beautiful person,\" revives alive. However, the opposite side must be sitting reason! It is the same movie theater but it is a place where you can give your lovers memories. ','153, 4F Yanghwa Road, Mapo-gu, Seoul',' 1544-1122','www.cgv.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang4 values('33','Subway Nonhyun Branch','Kang Moo-yeon has shouted \"Chocolate chip cookie set addition\" and \"Hellapisie bunch!\" Kang Moo-yeon went to a sandwich shop for his colleagues at subway nonhyeon station, and also enjoyed a dinner with Mr. Yoo and his wife, Yoo Se-jin. The characteristics of the subway, which can be selected from bread, ingredients, and sauce, are also evident in the ambassador of the Kangmyoe in the drama. It is a sandwich shop that has already become popular around the world, but I would not recommend stopping at once for a taste of \"club sandwich\" that Kangmo-yeon likes \"except for onion, It will be a small but interesting experience.','535 Prince Building, Gangnam-dong, Seocho-gu, Seoul',' 02-512-1014',' www.subwaykorea.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang4 values('34','Sweet coffee shop','In the sixth episode of the Sun, Seo Dae-young and Lieutenant Yoon Myung-joo`s heartfelt sentiment shine. Seo Dae - young takes a self - portrait with his lips toward Yunmyungju standing outside the window. With the window between them, they take a gesture like a kiss and form a romantic mood. Their dating scene, called the Salvation Couple, was shot at a sweet coffee shop. Indeed, there are posters of Sun in every place at the sweet coffee shop. It does not take long for a saved couple to find a seat. When the two sat down there was kindly written the phrase, `This is the place where you will be the savior couple of the sun! In the case of lovers, it would be fun to take a picture of Selka as Seo Dae-young and Yoon Myeong-joo at the place where Salvation Couple sat down','Seoul, Seocho-gu, Gangnam-daero road 27, 7-21','02-529-8399','http://www.dalkomm.com/index.php')";
        db.execSQL(q);




        q= "insert into oungpal4 values('35','Ssangmun Dong','<Reply to the Question> In 1988, the children`s friends Doug Sun, Jung Hwan, Taek, Sun Woo, and Dong Ryong are neighboring cousins \u200B\u200Bfacing the fence of the residential area of \u200B\u200BSukmun Dong. In the drama, Deokseon is depicted as `Sekwonjeokgo` and male protagonists are depicted as `Sekmungo`. In fact, Sukmun Elementary School is the only school named after Sukmundong. However, it is presumed that the actual models of the two schools are Sejukjeon and Seondukgo, considering the scenery of alleys and the routes of school buses in the drama.\n" +
                "In the alleyway from the exit of Ssangmun Station No. 4 to the Justice Girls` Highway, there is a nice residential area just like to face the main characters in the <Reply> The scenery of the long years of dry cleaners, pharmacies and small houses with red brick walls attracts the nostalgia of childhood. \n" +
                "“\n" +
                "Can we go to Brazilian rice cake today?”\n" +
                "There is a Brazilian tteokbokki often appearing in the conversation between the virtue and the friends. This little house with a little odd name was the place that existed until the mid and late 1990s, and it was a well-known family house in front of the justice house at that time.\n" +
                " ','','','')";
        db.execSQL(q);
        q= "insert into oungpal4 values('36','Ho Ho snack bar','As of 2016, Brazilian rice cake is not in the spot, but after passing through the narrow alley right in front of Justice House, there are gathered houses that seem to have taken a long time. There is a unique menu that is common to all of the cafeteria here, it is `cheese rice``. It is made with mozzarella cheese on top of fried rice, which is sprinkled with kimchi powder. You can feel the taste that reminds you of school days as well as low prices.  \n','\n" +
                "Dobong Road, Dobong-gu, Seoul, Korea','','')";
        db.execSQL(q);
        q= "insert into oungpal4 values('37','Dooley Museum','After seeing the Dooley Museum, you can go to Bukhansan Duryu road through Dooly Park or you can take a stroll through the Uiwen-dong crossing Dobong-gu. Walk down the Dooly Museum for about 15 minutes toward Ssangmun 1-dong Citizens`Center and you can see Ui-chun (near Sui Confucianism), where Dooly was first discovered. It is said that the author Lee Soo-jung, who was the original author, painted a draft of the murals, and about 70 students and students from Duksung Women`s University gathered hands together. The largest of the Jungnangcheon tributaries, the Uiheon is about 8 km long. It is good to take a leisurely stroll in the background of the wild flowers that bloom in every season as well as the Doori mural. ','Sirobong-ro, Dobong-gu, Seoul 1-gil, 6','02-990-2200',' http://www.doolymuseum.or.kr/')";
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




