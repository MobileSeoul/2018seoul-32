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


public class KstarengActivity extends AppCompatActivity {
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

        clist = (ListView)findViewById(R.id.clist);
        plist = new ArrayList<>();
        Intent i = getIntent();
        newname = i.getStringExtra("name");
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
        q= "drop table if exists bigbang4 ";
        db.execSQL(q);
        q= "drop table if exists exo4 ";
        db.execSQL(q);
        q= "drop table if exists bts4";
        db.execSQL(q);
        q= "drop table if exists blackpink4 ";
        db.execSQL(q);
        q= "drop table if exists twice4";
        db.execSQL(q);
        q= "drop table if exists redvelvet4";
        db.execSQL(q);
        q= "drop table if exists psy4";
        db.execSQL(q);
        q= "drop table if exists wannaone4";
        db.execSQL(q);
        q= "drop table if exists superjunior4";
        db.execSQL(q);
        q= "drop table if exists dongbangsingi4";
        db.execSQL(q);




        q = "create table if not exists bigbang4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists exo4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bts4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists blackpink4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists twice4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists redvelvet4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists psy4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists wannaone4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists superjunior4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dongbangsingi4(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into bigbang4 values('1','YG Shop','YG Shop is a store that displays and sells YG Entertainment`s logo and its singer based on Korean pop stars such as Big Bang, Psy and 2NE1. Lotte Young Plaza (Myungdong Branch) is located in booth format, so you can see various products such as CD, clothes, stationery, and photo album.','100-092  Sixty-seven Namdaemun-ro, Jung-gu, Seoul','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang4 values('2','YG Entertainment','YG Entertainment is one of the leading entertainment agencies in Korea, and it is affiliated with Big Bang, Psy, Winner, Icon, Black Pink, Epik High, Kang Dong-won and Lee Jong-seok. Located in Hapjeong-dong, Mapo-gu, the shrine features a unique and sophisticated exterior design. It is easier to access using Exit 8 of Hapjeong Station..','04028 3 Heejeong-ro 1-gil, Mapo-gu, Seoul (YG Entertainment)) ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang4 values('3','Three-way Butchers Central City','It is a meat restaurant operated by YG Entertainment and recently moved to Central City from Hongdae. Not only did she go to YG celebrities such as Big Bang`s victory, Sandara Park and other popular celebrities such as Lee Seung-gi and Lee Seo-jin. YG artists such as Winner often throw parties here. It is also fun to see pictures of celebrities and their signs on the wall.\n" +
                "The seats have been changed, but the taste is consistent. The main menu, pork ribs, is thick and tender and not spicy. Pyeongyang naengmyeon is served with buckwheat noodles in broth and hanwoo soybean paste rice, which is a delicacy..','06545 205, Sampyeong-road, Seocho-gu, Seoul (Banpo-dong, CENTRALCITY Banpo-dong)','02-6052-0103','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang4 values('4','Endher','\n" +
                "Andheer, who imports and sells waffles from Belgium`s Liege region, is a college waffle restaurant run by the mother of the Big Bang victor. Authentic Belgian waffles made from a long fermentation process are crisp on the inside and moist inside, and boast a delicious texture and rich taste in itself without any special toppings. In addition to waffles, you can also enjoy pizza, beer, soft coffee, and a wide range of vodka and wines from around the world. The spacious, modern and sophisticated interior of the restaurant offers a relaxed and comfortable rest by arranging a variety of tables, including outdoor terraces. On the second floor of the store, small performances such as indie bands are also held.\n" +
                "\n" +
                "Big Bang Winner Well known for her mother`s waffle café, Andy Hear is located in the Mecca Daehanro of the performing arts. It is one of the hanbok attractions not only for fans of Big Bang but also for domestic and foreign tourists. It is also fun to see the sign cups left by the many stars who visited here..','03085 90, Dongsung-gu, Jongno-gu, Seoul (Dongsung-dong) ','02–744-8464','http://andhere.co.kr/')";
        db.execSQL(q);
        q = "insert into bigbang4 values('5','Aori Raman','The big bang where each member adds its charm in various fields. Among them, the victory runs a Japanese ramen shop named `Aori`s Missing`. The famous ramen house in Japan has developed a recipe with the chefs who have been acquainted with the victory of the ramen mania in Japan.\n" +
                " \n" +
                "Aori ramen which was born like this is main menu. There are Aori ramen with five basic sights (Chashu, Agitamago, Par, Mumma, Kim), and Aori Ramen Light with two famous names (Chashu, Pa). AORI REMEN belongs to Don Kotzlamen, a soup made with pork bones. The deep and deep flavor is delicious enough to make a `thumb chuck` regardless of who eats it. I do not have any pigs, I have a smoky taste,.\n" +
                " \n" +
                "The Japanese style soy sauce, TKG, is also very special. It raises the yolk and the kimono on the hot rice and rubs it on the soy sauce, and it sucks more when it eats it with the deep soup of the aori ramen. There is a Japanese tatami mat seating for one person, and it is also good for rice bowl and lapping. Right downstairs, Milentown is operated by singer Jung Jun-young. Actually, Chung Joon-young, FT Island member, actress Hash Sejin and others frequently visit Aori Ramen.','06014 3rd floor (57th street) in Gangnam-gu, Doosan-dong, Gangnam-gu, Cheongdam-dong ','02-518-3767','http://www.ygfamily.com/')";
        db.execSQL(q);




        q= "insert into exo4 values('6','Duru','\n" +
                "A restaurant recommended by a member of EXO Dio. This restaurant is located in Cheongdam where EXO members such as Sioumun and Sehun frequently visit. It is good enough to receive three blue ribbons from the Korean restaurant guidebook \"Blue Ribbon Survey\"\n" +
                "\n" +
                "The popular menu of this restaurant, which boasts a neat and tidy atmosphere, is the octopus stir-fry and rice balls recommended by Dio. It is a gorgeous combination of delicious octopus that stirs your spicy octopus and calms your mouth comfortably. There is one other menu recommended here, the purple sweet potato makgeolli. This purple sweet potato makgeolli, which has a lovely color like two cheeks of cheeks, is good with octopus stirrer..','06064 148 Road 28, Seolleung-ro, Gangnam-gu, Seoul (Cheongdam-dong)','02-3443-8834','')";
        db.execSQL(q);
        q= "insert into exo4 values('7','Viva polo fruit shop','Viva Polo is famous for its delicious Italian restaurant, but it is more famous as a restaurant run by Chan-Yeol`s mother who is a member of group EXO. The most popular menus are Kimchi Arabia and pizza varieties.','05257 1631 Yangjae-dong, Gangdong-gu, 2nd floor','02-442-7885','')";
        db.execSQL(q);
        q= "insert into exo4 values('8','SMTOWN COEX Athium','SMTOWN COEX ARTUM is a multi-cultural space of SM entertainment that K-pop fans all over the world do not know. Especially, `SMTOWN Museum` and `SMTOWN Outer Wall Media`, an ultra-high resolution electronic signboard, opened in May 2018, attracting high interest.\n" +
                "Located on the third floor, SMTOWN Museum is the first entertainment company to compose the birth and growth of SM Entertainment`s artists. SM ARCHIV, SPECIAL EXHIBITION, ARTIST GALLERY, ARTIST GALLERY, etc. are available to listen to music albums, activities, costumes, props and behind-the-wall stories. It also provides K-pop enthusiasts with a different experience and enjoyment, including watching SM content production, augmented reality (AR), and virtual meeting with SM artists using new technologies such as VR.\n" +
                "\n" +
                "SMTOWN exterior media is four times the size of a basketball court, the largest in Korea. That `s why it` s nicknamed `Times Square` in Korea. Here, K-pop music videos as well as real-time multi live broadcast channel! T Live (Live) will be broadcast live.\n" +
                "On the 5th to 6th floors, there is the biggest hologram theater in Korea. The concert images of SM artists are usually screened, but concerts that have not yet been released on DVD are screened. Check the schedule! In addition, there are a gift shop (2nd floor) where artists can actually buy items they have worn or selected, and a market (4th floor) that sells a variety of goods containing images of cafes and SM artists.','06164 Seoul, Korea 513 (Yeongdong-ro 513, Gangnam-gu, Seoul)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);




        q= "insert into bts4 values('9','Nanjang Camp','There is a shop that catches eye-catching when we walk a little from Shinsa Station Exit 8. It is a camping concept of Kotungbyeonjang camp which Xinhui Lee Minwoo took a bulletproof boys` government station in the web entertainment bride`s romance. The tents and floors on the ground make you feel like you are really in the campsite. If you order a set menu, you can taste meat, sausage, and hot water at once. Sue and enjoy the soft meat If you chop with Kimchi stew, you feel already in the middle of camping! \n" +
                "For reference, Lee Min Woo and the seat of the government are located on the left side of the window. Timing is important to sit here because bulletin board boys and myths fans are so popular..','06034 Gangnam-dong, Gangnam-gu, Seoul 158 Road 27 (Shinsa-dong)','02-3443-6466','https://nanjangcampgarosu.modoo.at/')";
        db.execSQL(q);
        q= "insert into bts4 values('10','Addicted','The Addicted is an imported garment editing shop where you can see various brands such as Goharu Bocchuski, OUR LEGACY, LEMAIRE, KITSUNE, and Topman at a glance. Recently, domestic stars such as Jekskis, Shaini Taemin and Kee, BiToBi, LoCo, Tweed ChaeYoung and Bulletproof Boys have worn their products.','06018 Seoul, Gangnam-gu, Seolleung-ro 155 Road 24','02-547-7332','http://www.addicted.kr/')";
        db.execSQL(q);
        q= "insert into bts4 values('11','The Mins','\n" +
                "2AM and emotional vocalist of Homme Changmin`s mother`s cafe is where Changmin often lives. In summer, cool homemade aids and ice cream are served. In winter, lively, lemon ginger, and apple cinnamon are all popular. There is a menu board written in English, Japanese and Chinese for Korean fans.\n" +
                "\n" +
                "Popular idol group bullying boys members are favorite places, and the bulletproof boys` twitter has become a hot topic of authentication shots. Let`s look for the affectionate message of bulletproof boy band members in the dermans!','\n" +
                "06018  112, Apgujeong-ro 330, Gangnam-gu, Seoul','02-512-1452','')";

        db.execSQL(q);



        q= "insert into blackpink4 values('12','My Phone Case','Black Pink is a fun place to visit. That`s right, you can make your phone case any way you want. Choose from a variety of accessories to your liking, and sit in a comfortable seat on the side to create the only cellphone case in the world. A friendly staff is there to guide you on how to do it. We also have a cafe.','19 Ways to Woosan Road, Mapo-gu, Seoul 21','02-322-6682',' http://www.nemamke.com')";
        db.execSQL(q);
        q= "insert into blackpink4 values('13','Norrush','\n" +
                "Black Pink Member Jenny posted a picture on her SNS account and became a hot topic. The number of `good`` number recorded about 50 million, causing a question about space. Decorated with plants and vintage furnishings, the interior offers a relaxed atmosphere that fits the name `No Rush``. The main menu is lasagna and western breakfast. The menu with a moderately ripe bunch and asparagus, potato puree, bacon and salad is a good breakfast and lunch. Rosemary sauce lasagna with soft lasagna and deep-fried tomato sauce made from beef is also recommended. ','Seoul, Mapo-gu, Seoul, Korea','010-7678-7728','')";
        db.execSQL(q);
        q= "insert into blackpink4 values('14','Moon shot Elcube Hongdae Branch','What if you want to keep up with the blackfink`s make-up? Let`s go to the Hongdae Branch of Elcube. You can find makeup products that Lisa, Roger, Jenny and Ji-su use. It is equipped with a variety of basic and tinted cosmetics, among which the `cream paint light fit` tint is one of the most popular products for Black Pink fans. The natural and varied colors of use add freshness to complete their most `hot` makeup now.','4 Hongik-ro 6-gil, Mapo-gu, Seoul\n','02-326-5656','https://moonshot-cosmetics.com/ko/board/off-line-store/13')";
        db.execSQL(q);
        q= "insert into blackpink4 values('15','Three-way Butcher','Many places in Hongdae have a choice of black pink, but the place has a three-way butcher. You can enjoy high quality Korean barbecue in a sophisticated and spacious space. Black Pink`s favorite menu is the YG Family set. We can taste various kinds of meat at a discounted price, and it is also very convenient. The meat here is thick and fresh. It comes wrapped in retro style paper nicely. When you eat it, you can taste it with a rich flavor. If you are a fan of Black Pink, it is recommended to add `YG Lager`, an attractive beer of hops. There are many autographs of members on the wall of the store. ','72, Woosan Road, Mapo-gu, Seoul','02-337-3892',' http://www.instagram.com/3geori_butchers')";
        db.execSQL(q);

        q= "insert into twice4 values('16','JYP Entertainment','YP Entertainment is one of the representative entertainment companies in Korea, and is a subsidiary company of Wonder Girls, 2AM, 2PM, Mt. Ai, GOT7, Twice. Near the JYP office, there is a K-starroad with Cube Entertainment, SM Entertainment New Company, FNC Entertainment, and Art Toys of Korean Wave stars..','06012 Seoul Gangnam-gu Apgujeong-ro 79 Road 41 (Cheongdam-dong)','02-3438-2300','http://www.jype.com/')";
        db.execSQL(q);
        q= "insert into twice4 values('17','Durehan Restaurant','Since its opening in Miryang, South Gyeongsang Province, 60 years ago, it has been serving two generations in Insadong. The restaurant offers a clean, neat limited-course and Japanese cuisine made from seasonal ingredients. Foreign tourists who are not familiar with Korean cuisine are advised to use the grilled rice cakes menu and a statue of Sanchae Bibimbap.\n" +
                "\n" +
                "It is a Korean restaurant with beautiful girls working as MC, actress Kong Seung-yeon, and Jeong Su-joon, father of popular girl group Twice. Yoo Chang-joon is known for his 20-year career at a famous Seoul hotel.','05551 300 (Sincheon-dong) Lotte Department Store Evinuel World Pap Tower 6F','02-3213-2638','')";
        db.execSQL(q);
        q= "insert into twice4 values('18','The Street','It is a brunch cafe run by actor Lee Jung-jin, and is famous as a favorite place for celebrities. Fusion dishes such as kimchi filaf, soybean paste, pasta and so on are popular, and Basilfesto cream pasta is a favorite menu of Gatzen member Jackson. In addition, actors Kang So-ra and Park Han-byul and Twice`s Zwei are known to visit frequently. The restaurant has a cozy atmosphere, so you can enjoy a meal in a quiet atmosphere. In the evening, it changes to a soft light and feels different from the day..','06013 529 Dosan-daero, Gangnam-gu, Seoul (Cheongdam-dong, KRA Plaza)','02-547-8898','')";
        db.execSQL(q);




        q= "insert into redvelvet4 values('19','SM Corporation','SM Entertainment is one of the nation`s leading entertainment agencies, and it is a part of Hallyu stars such as BoA, Girls` Generation, Super Junior, SHINee, EXO and Red velvet. The building is located in Cheongdam-dong, Gangnam-gu. The SUM Market, located on the basement level of the office building, sells collaboratory works with SM artists and other artists.','06012 서울 강남구 선릉로190길 114 (청담동)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into redvelvet4 values('20','SMTOWN COEX Athium','SMTOWN COEX ARTUM is a multi-cultural space of SM entertainment that K-pop fans all over the world do not know. Especially, `SMTOWN Museum` and `SMTOWN Outer Wall Media`, an ultra-high resolution electronic signboard, opened in May 2018, attracting high interest.\n" +
                "Located on the third floor, SMTOWN Museum is the first entertainment company to compose the birth and growth of SM Entertainment`s artists. SM ARCHIV, SPECIAL EXHIBITION, ARTIST GALLERY, ARTIST GALLERY, etc. are available to listen to music albums, activities, costumes, props and behind-the-wall stories. It also provides K-pop enthusiasts with a different experience and enjoyment, including watching SM content production, augmented reality (AR), and virtual meeting with SM artists using new technologies such as VR.\n" +
                "\n" +
                "SMTOWN exterior media is four times the size of a basketball court, the largest in Korea. That `s why it` s nicknamed `Times Square` in Korea. Here, K-pop music videos as well as real-time multi live broadcast channel! T Live (Live) will be broadcast live.\n" +
                "On the 5th to 6th floors, there is the biggest hologram theater in Korea. The concert images of SM artists are usually screened, but concerts that have not yet been released on DVD are screened. Check the schedule! In addition, there are a gift shop (2nd floor) where artists can actually buy items they have worn or selected, and a market (4th floor) that sells a variety of goods containing images of cafes and SM artists.','06164 Seoul, Korea 513 (Yeongdong-ro 513, Gangnam-gu, Seoul)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into redvelvet4 values('21','SUM market','SM Where to meet all of the artists. SM Communication Center, the headquarters of SM Entertainment, became a new azit of Korean fans. The SUM café on the first floor of the building and the SUM market, which is also called \"SM convenience store\" on the first floor underground, opened the door. We sell a variety of MD products that combine groceries and SM artist brands such as `TVXQ Truffle Chocolate` and `Super Junior Ramen`.','06084 Seoul, Gangnam-gu, Samsung-ro 648 (Samsung-dong)','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);



        q= "insert into psy4 values('22','Grevin Museum','Musée Grévin, a 133-year-old museum dedicated to the world`s wax museum, was the first in Asia to be opened in Seoul. In the Grabang Museum, there are about 80 wax dolls, including world famous names such as John Lennon and Marilyn Monroe, as well as historical figures representing South Korea including King Sejong, King Sejong, and General Lee Soon Shin. Each exhibition space has its own set of concepts and themes, with a special set and lighting, filled with realistic sounds. Visitors can take photos freely with the stars, as well as experience interactive games with state-of-the-art technology. As such, the high-quality exhibition space of the Graven Museum alone will bring a spectacular and vivid experience to the spectators with time and space, along with the world-class wax figures.','04523 Euljiro 23, Jung-gu, Seoul (Euljiro 1-ga, Euljiro annex)','02-777-4700','http://www.grevin-seoul.com/ko/')";
        db.execSQL(q);
        q= "insert into psy4 values('23','YG Shop','YG Shop is a store that displays and sells YG Entertainment`s logo and its singer based on Korean pop stars such as Big Bang, Psy and 2NE1. Lotte Young Plaza (Myungdong Branch) is located in booth format, so you can see various products such as CD, clothes, stationery, and photo album.','100-092  Sixty-seven Namdaemun-ro, Jung-gu, Seoul','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into psy4 values('24','YG Entertainment','YG Entertainment is one of the leading entertainment agencies in Korea, and it is affiliated with Big Bang, Psy, Winner, Icon, Black Pink, Epik High, Kang Dong-won and Lee Jong-seok. Located in Hapjeong-dong, Mapo-gu, the shrine features a unique and sophisticated exterior design. It is easier to access using Exit 8 of Hapjeong Station..','04028 3 Heejeong-ro 1-gil, Mapo-gu, Seoul (YG Entertainment)) ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q= "insert into psy4 values('25','MBC WORLD','MBC from Cultural Broadcasting moved to Sangam-dong DMC complex and introduced MBC World, the first broadcasting theme park in Korea, which evolved the existing broadcasting program. Visitors can become MBC drama and popular entertainment programs, enjoy various experience and video visualization realized with advanced technology, and face actual broadcasting production site. On the outside of the MBC building, programs currently being broadcast are shown on the media board, and handprinting and lifelike photos of the stars are displayed. Inside the building, you can experience MBC history, holistic theater performances of GD and Psy, dance experience studio, virtual reality experience space, trick art photo wall, and various attractions. On the 4th floor, you can try the historical drama costume at the shooting set which reproduces drama such as Daejanggum and Jiji Empress, and you can try anchor experience at the MBC news station on the 7th floor. MBC World Tour runs 9 times a day, on reservation basis, with a guideline for a total of 90 minutes. MBC World, the first broadcasting theme park in Korea, you can enjoy special experiences of dancing and singing with the star centered on Korean drama and entertainment contents and becoming the protagonist in the drama. Experiences such as virtual reality experience, dance experience studio, hologram stage and other high technology are especially popular with tourists. At the end of the tour, you can also receive welcome greetings from Korean Wave stars and digital signatures. In fact, popular programs such as `Show! Music Center`, `Infinite Challenge`, and `Radio Star` are being produced at MBC Global Media Center, so you can expect unexpected encounters with Korean Wave stars.',' 267 (Sangam-dong, Culture Broadcasting Co., Ltd.)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);




        q= "insert into wannaone4 values('26','K212','The cafe K212 is located on the first floor of YMC Entertainment, the agency of Warner One. He often finds himself in the basement of the practice room when he `s practicing or taking a break. K212 is a café and restaurant where you can enjoy dessert such as fresh fruit juice, coffee, ice water, cake, and brunch and dinner including pizza, pasta and wine. Inside the cafe, which is antique and stylish, there is a harmonious picture of Warner One`s photographs and signs. ','Seoul, Yongsan-gu,',' 02-749-2954','')";
        db.execSQL(q);
        q= "insert into wannaone4 values('27','Jenny House','What is the make-up secret of Warner One`s center river Daniel, who emits a male beauty on the stage and a cute boy beauty under the stage? If you want to know how to make makeup that will make you look more like sculptures of Hwangmin Hyun and On Sung Woo, you can visit Jenny House Cheongdam Hill. Jenny House, who is in charge of makeup of Warner One, is a representative beauty salon in Seoul where many Korean stars visit. For foreigners, make-up and hair experts are making their own make-over classes to make-up with one-on-one make-over styling, which brings out hair and makeup, and make-up know-how with tourists. It is necessary to make an advance reservation through Jenny House homepage. An interpreter manager who can speak English and Chinese is always on the waiting list.  ','Seoul, Gangnam-gu, Seolleung-ro 146 Road 56','02-541-7788','http://jennyhouse.co.kr/en/')";
        db.execSQL(q);
        q= "insert into wannaone4 values('28','Ledoupla','\n" +
                "It is especially good for Warner One, as it is called \"Onggwa Combi\" for Kang Daniel who has a tall height of over 180cm, a good appearance and pleasant personality. In the past, the restaurants that I have found before their debut are the French restaurants of Itaewon. They sit on terrace seats, and fans call this seat \"Onggwon-seok\". Their menus, spicy shrimp rosé pasta and tenderloin steak, Midori shower and pitch crush are also loved by their fans to get the nickname \".','Itaewon road 19, Yongsan-gu, Seoul 6-4','02-797-2228','')";
        db.execSQL(q);


        q= "insert into superjunior4 values('29','One and One Day','Super Junior A cafe where Donghae and his brother opened together in Seongsu-dong. There is a small terrace that captivates the eye and interior decoration that resembles a gallery. It has various kinds of table and convenience facilities considering various tastes of customers. New white beans and fine milk particles are used to make a coffee that is richer than traditional café latte or cappuccino, and the sweetness of fresh cream. One of the desserts you must try is the carrot cake, berry cake, and chocolate brown cake, which are baked every day. It is a place where you can not finish the day with a cozy resting space that resembles the East Sea which is usually quiet personality.','04782 Sasangsan Road 92, Seongsu-dong 2-ga, Gwangmyung Tower','02-499-9303','https://www.instagram.com/cafe_haruoneday/')";
        db.execSQL(q);
        q= "insert into superjunior4 values('30','SM Corporation','SM Entertainment is one of the nation`s leading entertainment agencies, and it is a part of Hallyu stars such as BoA, Girls` Generation, Super Junior, SHINee, EXO and Red velvet. The building is located in Cheongdam-dong, Gangnam-gu. The SUM Market, located on the basement level of the office building, sells collaboratory works with SM artists and other artists.','06012 서울 강남구 선릉로190길 114 (청담동)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior4 values('31','SMTOWN COEX Athium','SMTOWN COEX ARTUM is a multi-cultural space of SM entertainment that K-pop fans all over the world do not know. Especially, `SMTOWN Museum` and `SMTOWN Outer Wall Media`, an ultra-high resolution electronic signboard, opened in May 2018, attracting high interest.\n" +
                "Located on the third floor, SMTOWN Museum is the first entertainment company to compose the birth and growth of SM Entertainment`s artists. SM ARCHIV, SPECIAL EXHIBITION, ARTIST GALLERY, ARTIST GALLERY, etc. are available to listen to music albums, activities, costumes, props and behind-the-wall stories. It also provides K-pop enthusiasts with a different experience and enjoyment, including watching SM content production, augmented reality (AR), and virtual meeting with SM artists using new technologies such as VR.\n" +
                "\n" +
                "SMTOWN exterior media is four times the size of a basketball court, the largest in Korea. That `s why it` s nicknamed `Times Square` in Korea. Here, K-pop music videos as well as real-time multi live broadcast channel! T Live (Live) will be broadcast live.\n" +
                "On the 5th to 6th floors, there is the biggest hologram theater in Korea. The concert images of SM artists are usually screened, but concerts that have not yet been released on DVD are screened. Check the schedule! In addition, there are a gift shop (2nd floor) where artists can actually buy items they have worn or selected, and a market (4th floor) that sells a variety of goods containing images of cafes and SM artists.','06164 Seoul, Korea 513 (Yeongdong-ro 513, Gangnam-gu, Seoul)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into superjunior4 values('32','SUM market','SM Where to meet all of the artists. SM Communication Center, the headquarters of SM Entertainment, became a new azit of Korean fans. The SUM café on the first floor of the building and the SUM market, which is also called \"SM convenience store\" on the first floor underground, opened the door. We sell a variety of MD products that combine groceries and SM artist brands such as `TVXQ Truffle Chocolate` and `Super Junior Ramen`.','06084 Seoul, Gangnam-gu, Samsung-ro 648 (Samsung-dong)','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior4 values('33','Solvin hot dog','\n" +
                "Super Junior, a hallyu star staring at unprecedented popularity in Southeast Asia and China. Super Junior `s`` real`, which combines sculptural appearance and charm, was rumored to be a gourmet. It is the specialty of the Apgujeong Rodeo, Solvin Duck, which is the place where the demanding Hee Chul is the standard for many years. Due to the fact that it is open from 6 pm to 5:30 am, the schedule is over and the entertainers who visit here to watch Yogi are often witnessed. The menu here is largely tacos, hot dogs, and rice bowls. Hee Chul`s favorite menu is spicy enough that his lips are sparkling, and he`s as addictive as he thinks at night. Nabe, sour cream, jalapenos, vegetables and ribs, along with rice, is also a standard menu for those who regret not eating ribs.\n" +
                " ','06018 Seoul, Gangnam-gu, 51 Road 40 (Sinsa-dong)','010-9466-3419','')";
        db.execSQL(q);



        q= "insert into dongbangsingi4 values('34','85st Coffee','손호준을 비롯한 절친들과 하루를 보내기 위한 만남의 장소로 선택한 곳은 85st Coffee. 고등학교 때부터 유노윤호와 인연을 맺어온 노신현 대표가 운영 중이다. 85년생 친구들이 만나 모이는 곳이라는 뜻에서 가게 이름을 붙였다. 친구 모임 외에도 일주일에 한두 번 이상 유노윤호가 다녀간다는 것이 노 대표의 전언. 유노윤호가 가장 좋아하고 자주 주문하는 메뉴는 ‘아메리카노’와 ‘리얼 딸기 요구르트 스무디’라고 한다. 카페의 상징인 커다란 곰 인형은 유노윤호가 직접 선물한 것이다.','서울특별시 강남구 강남대로122길 39(논현초등학교 옆)','','https://www.instagram.com/85st_coffee/')";
        db.execSQL(q);
        q= "insert into dongbangsingi4 values('35','Haenam House','Yunho Yunho is home to JeonDo food restaurant Haenam House, one of the favorite restaurants to visit whenever you return home after a foreign activity or when you have a group of friends. Since her elementary school, her friend, Hong Jung-in, runs with her mother. Yoo-yoon Yoon is so friendly that she calls her mother \"mother\". I do not order a menu separately, but I will prepare seasonal food at the end of `Yu-yo` There are a lot of local foods such as mushiyaki, octopus, mackerel, caviar, tteokgabi, and red mackerel. Among them, `yodok fried meat` is one of the foods to be tasted.','Seoul, Gangnam-gu, Seoul','02-3446-7244','')";
        db.execSQL(q);
        q= "insert into dongbangsingi4 values('36','SM Corporation','SM Entertainment is one of the nation`s leading entertainment agencies, and it is a part of Hallyu stars such as BoA, Girls` Generation, Super Junior, SHINee, EXO and Red velvet. The building is located in Cheongdam-dong, Gangnam-gu. The SUM Market, located on the basement level of the office building, sells collaboratory works with SM artists and other artists.','06012 서울 강남구 선릉로190길 114 (청담동)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi4 values('37','SMTOWN COEX Athium','SMTOWN COEX ARTUM is a multi-cultural space of SM entertainment that K-pop fans all over the world do not know. Especially, `SMTOWN Museum` and `SMTOWN Outer Wall Media`, an ultra-high resolution electronic signboard, opened in May 2018, attracting high interest.\n" +
                "Located on the third floor, SMTOWN Museum is the first entertainment company to compose the birth and growth of SM Entertainment`s artists. SM ARCHIV, SPECIAL EXHIBITION, ARTIST GALLERY, ARTIST GALLERY, etc. are available to listen to music albums, activities, costumes, props and behind-the-wall stories. It also provides K-pop enthusiasts with a different experience and enjoyment, including watching SM content production, augmented reality (AR), and virtual meeting with SM artists using new technologies such as VR.\n" +
                "\n" +
                "SMTOWN exterior media is four times the size of a basketball court, the largest in Korea. That `s why it` s nicknamed `Times Square` in Korea. Here, K-pop music videos as well as real-time multi live broadcast channel! T Live (Live) will be broadcast live.\n" +
                "On the 5th to 6th floors, there is the biggest hologram theater in Korea. The concert images of SM artists are usually screened, but concerts that have not yet been released on DVD are screened. Check the schedule! In addition, there are a gift shop (2nd floor) where artists can actually buy items they have worn or selected, and a market (4th floor) that sells a variety of goods containing images of cafes and SM artists.','06164 Seoul, Korea 513 (Yeongdong-ro 513, Gangnam-gu, Seoul)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi4 values('38','SUM market','SM Where to meet all of the artists. SM Communication Center, the headquarters of SM Entertainment, became a new azit of Korean fans. The SUM café on the first floor of the building and the SUM market, which is also called \"SM convenience store\" on the first floor underground, opened the door. We sell a variety of MD products that combine groceries and SM artist brands such as `TVXQ Truffle Chocolate` and `Super Junior Ramen`.','06084 Seoul, Gangnam-gu, Samsung-ro 648 (Samsung-dong)','02-6240-9846','http://www.smtown.com/')";
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




