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


public class KstarchineseActivity extends AppCompatActivity {
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
        q= "drop table if exists bigbang3 ";
        db.execSQL(q);
        q= "drop table if exists exo3 ";
        db.execSQL(q);
        q= "drop table if exists bts3";
        db.execSQL(q);
        q= "drop table if exists blackpink3 ";
        db.execSQL(q);
        q= "drop table if exists twice3";
        db.execSQL(q);
        q= "drop table if exists redvelvet3";
        db.execSQL(q);
        q= "drop table if exists psy3";
        db.execSQL(q);
        q= "drop table if exists wannaone3";
        db.execSQL(q);
        q= "drop table if exists superjunior3";
        db.execSQL(q);
        q= "drop table if exists dongbangsingi3";
        db.execSQL(q);




        q = "create table if not exists bigbang3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists exo3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bts3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists blackpink3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists twice3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists redvelvet3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists psy3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists wannaone3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists superjunior3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dongbangsingi3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into bigbang3 values('1','YG Shop','YG Shop是展示和銷售Bigbang,PSY,2NE1等韓流明星所屬YG娛樂的標誌和以所屬歌手爲原型製作的商品的賣場. 樂天YungPlaza(明洞店)賣場內以展臺形式入駐,可以看到所屬歌手CD,服裝,文具類,相冊等多種商品..','100-092 首爾特別市中區南大門路67 (南大門路2街) ','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang3 values('2','YG 娛樂','YG娛樂是韓國代表性的演藝企劃公司之一,是BigBang,PSY,Winner,IKON,黑粉色,Epik High,姜東元,李鍾碩等的所屬公司. 位於麻浦區合井洞的公司建築物的特點是獨特又幹練的外觀設計. 利用合井站8號出口的話,更容易接近.','04028 首爾麻浦區喜雨亭路1街3 (YG娛樂) ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang3 values('3','三岔路口中央城店','YG娛樂經營的烤肉店最近從弘大搬到中央城. 除了BIGBANG的勝利,Sandara樸等YG旗下藝人外,李勝基,李瑞鎮等人氣藝人也去過. Winner等YG旗下藝人經常在這裏舉行派對. 尋找掛在牆上的藝人們的紀念照片和簽名也別有一番情趣.\n" +
                "雖然位置發生了變化,但味道卻始終如一. 代表性菜單豬排以厚重的厚度著稱,不刺激的清淡甜味是人氣因素..','06545 首爾瑞草區沙坪大路 205 (盤浦洞, CENTRALCITY盤浦川復開停車場)','02-6052-0103','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang3 values('4','恩德希爾','比利時裏埃州地區的華夫餅是bigbang成員勝利的母親經營的大學路華夫餅店. 經過長時間發酵過程製成的正統比利時華夫餅,表面酥脆,內在水潤,即使沒有特別的餡餅,其本身也具有豐富的口感和豐富的口感. 除華夫餅外,還有比薩,啤酒,柔軟的咖啡和世界各國的多種手工茶,葡萄酒. 現代時尚又簡潔的室內裝修寬敞的賣場內,包括戶外露臺在內,設有多種多樣的餐桌,提供悠閒舒適的休息時間. 賣場2樓還將舉行獨立樂隊等小規模演出.\n" +
                "\n" +
                "以bigbang勝利母親的華夫餅咖啡屋而廣爲人知的安德希爾,位於演出藝術的麥加大學路,不僅是bigbang的粉絲,也是國內外遊客絡繹不絕的韓流名勝地之一. 來到這裏的許多明星留下的簽名杯也很有趣.','03085 首爾鍾路區東崇路90 (東崇洞) ','02–744-8464','http://andhere.co.kr/')";
        db.execSQL(q);
        q = "insert into bigbang3 values('5','俄里拉門','bigbang在各個成員的各個領域都具有魅力,其中勝利經營着一個名叫\"蒼鴨行蹤不明\"的日本拉門店. 在日本有名的拉麪館都去過,因此,拉門狂熱愛好者勝利和在日本頗有交情的廚師長一起開發了料理配方..\n" +
                " \n" +
                "主要菜品是5種基本菜名(車修,阿齊馬戈,蔥,門瑪,紫菜),還有艾奧麗•拉門和2種香菜(茶水,蔥). 青森拉麪屬於用豬骨頭熬出的湯的炸豬排,味道濃烈,誰吃都會感到\"吃苦\". 完全沒有豬羶味, 又酸又香, 也正適合解酒.\n" +
                " \n" +
                "日式醬油雞蛋飯TKG也別有風味. 在熱騰騰的米飯上放上蛋黃和菜碼,拌着醬油吃的食物,與青紅鴨的濃湯一起吃的話,更是香噴噴. 樓下有鄭俊英經營的麥片車,實際上包括鄭俊英在內的FTISLAND成員夏石鎮等.','06014 首爾江南區島山大路57街7(清潭洞)3樓 ','02-518-3767','http://www.ygfamily.com/')";
        db.execSQL(q);





        q= "insert into exo3 values('6','一一','這是EXO成員D.O.在某雜誌上推薦的飯店,除了D.O以外,XIUMIN,世勳等EXO成員經常光顧的清潭的這家餐廳是大韓民國的餐廳指南手冊《藍色絲帶》.\n" +
                "這家餐廳以乾淨整潔的氛圍而著稱,人氣菜譜是迪奧推薦的炒章魚和飯糰. 乾淨利索的炒魷魚和能鎮靜住嘴裏的香噴噴的飯糰,還有直接醃製的美味的菜餚組合絕對是一絕. 這裏還有一種推薦菜單,那就是紫色紅薯. 這種像紅紅的兩頰一樣, 有着美麗顏色的紫薯馬格利米酒, 和炒章魚的調和很好, 客人經常光顧.','06064 首爾江南區宣陵路一四八街28 (清潭洞)','02-3443-8834','')";
        db.execSQL(q);
        q= "insert into exo3 values('7','Viva polo水果店','Viva Polo以其美味的意大利餐廳而聞名，但它更有名的是由Chan-Yeol的母親經營的餐廳，該餐廳是EXO集團的成員。 最受歡迎的菜單是泡菜阿拉伯和比薩餅品種。','05257 강동구 양재대로 1631 2층','02-442-7885','')";
        db.execSQL(q);
        q= "insert into exo3 values('8','SMTOWN COEX Athium','尤其是\"SMTOWN博物館博物館\"和超高畫質電子屏幕\"SMTOWN外牆媒體\",2018年5月正在開放.\n" +
                "3樓的SMTOWN博物館是娛樂企業中首個將SM娛樂旗下藝人的誕生和成長過程集大成的空間. 可以欣賞音樂專輯,活動面貌,服裝和道具,幕後故事等的SM ARCHIV,SPECIAL EXHIBITION,SPECIAL EXHIBITION,ARTI. 另外,通過觀看SM文化信息製作過程,與利用增強現實(AR),VR等新技術的SM藝人的假想相遇等,給K-pop粉絲們帶來了與衆不同的體驗和快樂.\n" +
                "\n" +
                "SMTOWN外牆媒體的面積是籃球場的4倍,是韓國國內最大規模的媒體. 因此被稱爲\"韓國的時代廣場\". 這裏不僅將直播韓國流行音樂的mv,還將直播實時多維直播頻道\"t Live等.\n" +
                "5~6層是韓國國內最大的全息圖劇場. 主要放映SM旗下藝人的演唱會影像,還放映未發售DVD的演唱會. 除此之外還有可以購買藝人實際佩戴或挑選商品的禮品店(2層),咖啡館和包含SM藝人形象的多種商品的市場(4層)等..','06164 首爾江南區永東大路513 (三星洞,COEX)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);




        q= "insert into bts3 values('9','蘭江營地','在新沙站8號出口,走一走就能看到一家商店. 就是網絡綜藝花美男布羅曼斯,神話李珉宇帶去防彈少年團政局的露營主題的烤肉店亂裝營. 點套餐的話,可以同時品嚐到肉類,香腸和湯類. 喜歡香軟的肉 用辣辣的泡菜湯漱口的話,感覺已經站在野營場中央了!\n" +
                "作爲參考,李珉宇和政局所處的位置位於窗口左側. 防彈少年團和神話的歌迷們人氣很高,坐這裏的時候時機很重要.','06034 首爾江南區江南大路158街27 (新沙洞)','02-3443-6466','https://nanjangcampgarosu.modoo.at/')";
        db.execSQL(q);
        q= "insert into bts3 values('10','Addicted','Addicted是能夠一眼看到Gosha Lubinski,OUR LEGACY,LEMAIRE,KITSUNE,TOPMAN等多個品牌的進口服裝編輯店. 最近Sechs Kies,SHINee泰民,Key,BTOB,LOCO,Twice蔡英,防彈少年團等國內明星們都使用了edited的產品.','06018 首爾江南區宣陵路一五五街24','02-547-7332','http://www.addicted.kr/')";
        db.execSQL(q);
        q= "insert into bts3 values('11','The Mins','2AM和Homme的感性主唱昌珉的母親經營的咖啡廳,常住着昌珉. 在夏季,涼爽的手工製作冰激凌和冰淇淋等,冬季酸橙,檸檬,蘋果肉桂等充滿誠意的有機農茶是受歡迎的菜單. 爲韓流粉絲們準備的英文,日語,中文菜單已經準備完畢.\n" +
                "\n" +
                "人氣偶像組合防彈少年團成員喜歡去的地方,防彈少年團的推特認證照片曾經成爲話題. 在The Minice尋找防彈少年團成員們充滿愛意的信息吧!','\n" +
                "06018 首爾江南區狎鷗亭路330 (新沙洞) 1樓112號','02-512-1452','')";

        db.execSQL(q);



        q= "insert into blackpink3 values('12','手機保護套','這裏就是可以去觀看黑粉色的別具一格的特色體驗店. 可以從各種各樣的飾品中挑選自己喜歡的物品,也可以坐在一邊舒服的座位上製作世界上獨一無二的手機套. 親切的職員常駐,介紹方法. 同時還運營咖啡廳.','首爾麻浦區臥牛山路19街21號','02-322-6682',' http://www.nemamke.com')";
        db.execSQL(q);
        q= "insert into blackpink3 values('13','諾休斯','黑粉色成員Jenny在SNS上上傳照片而成爲話題,\"喜歡\"人數達到了50萬,引發了對空間的好奇. 用植物和復古傢俱裝飾的室內,爲人們提供與\"不着急(No Rush)\"名稱相符的舒適氛圍. 招牌菜是拿賈尼亞和西式早餐. 與煮熟的海芋,蘆筍,土豆醬,培根,沙拉一起出現的菜單是早餐兼午餐. 在柔軟的羅薩尼亞,用牛肉製成的濃濃的西紅柿醬相融合的\"羅傑米特索斯拉扎尼亞\"也是推薦菜單. ','首爾麻浦區東橋路三零街17','010-7678-7728','')";
        db.execSQL(q);
        q= "insert into blackpink3 values('14','門槽店','想追趕實力,外貌,黑粉色的化妝法的話? 我們去弘大店吧. 可以看到lisa,roje,珍妮,智秀直接使用的化妝產品. 擁有多種基礎及彩妝化妝品,其中\"奶油油漆淺色\"脣彩是黑粉色粉絲們最喜愛的產品之一. 自然多樣的顏色加上清爽的使用感,現在可以完成她們最火熱的化妝方法.','首爾麻浦區弘益路六街四街','02-326-5656','https://moonshot-cosmetics.com/ko/board/off-line-store/13')";
        db.execSQL(q);
        q= "insert into blackpink3 values('15','三岔兒','在弘大衆多的肉類餐廳中,選擇黑粉色的地方是三岔路的福州幹. 可以在簡練寬敞的空間享受到優質的韓國燒烤. 黑粉色喜歡的菜單是YG家族套餐. 各種部位的肉可以以打折的價格品嚐,量也豐富. 這裏的肉是厚而新鮮的特點. 蘸着一起出現的\"蜜醬\"吃的話,味道絕好. 如果是黑粉色的粉絲的話,推薦配帶具有苦味的啤酒\"YG拉格\". 賣場牆壁上有很多成員親筆簽名. ','首爾麻浦區臥牛山路72','02-337-3892',' http://www.instagram.com/3geori_butchers')";
        db.execSQL(q);

        q= "insert into twice3 values('16','JYP娛樂','JYP娛樂是國內代表性的演藝企劃公司之一,其經紀公司有Wonder Girls,2AM,2PM,Miss A,GOT7,TWICE等. JYP公司大樓附近設有Cube娛樂公司,SM娛樂公司新辦公樓,FNC娛樂,韓流明星藝術館的\"K-starroad\"..','06012首爾江南區狎鷗亭路79路41 (清潭洞)','02-3438-2300','http://www.jype.com/')";
        db.execSQL(q);
        q= "insert into twice3 values('17','杜雷汗飯店','自60多年前在慶尚南道密陽開業以來,這裏是一家有名的韓定食餐廳. 提供用時令食材製作的乾淨整潔的韓定食套餐和一流料理. 如果是不太熟悉韓餐的外國遊客,推薦在烤架上烤制的排骨,山菜拌飯,飯牀等..\n" +
                "\n" +
                "這是一個由歌謠節目《人氣歌謠》的主持人,美女姐妹,演員孔升妍和人氣女子組合twice的正妍的父親劉昌俊(音)廚師運營的韓餐廳. 柳昌俊主廚是在首爾知名酒店工作了20年以上的實力派廚師..','05551 首爾鬆坡區奧林匹克路300 (新川洞)樂天百貨商店依紐爾世界塔店6F','02-3213-2638','')";
        db.execSQL(q);
        q= "insert into twice3 values('18','The Street','由演員李廷鎮運營的早午餐咖啡館,是知名藝人們常去的地方. 泡菜過濾筆和牛胸肉大醬,意大利麪等混合料理很受歡迎,肉醬,肉豆醬,意大利麪是GOT7成員Jackson喜歡的菜單. 此外演員姜素拉,樸寒星,Twice的子瑜等也經常光顧. 設計爲雅靜的氛圍,可以在安靜的氣氛中用餐,晚上則變成淡淡的照明,可以感受到與白天不同的氛圍.','06013 首爾江南區島山大路529 (清潭洞,KRA廣場)','02-547-8898','')";
        db.execSQL(q);




        q= "insert into redvelvet3 values('19','SM公司','SM娛樂是韓國代表性的演藝企劃公司之一,是寶兒,少女時代,Super Junior,SHINee,EXO,Red Velvet等韓流明星的所屬公司. 公司建築物位於江南區清潭洞. 公司地下一層的SUM市場銷售SM旗下藝人和多個藝術家合作製作的作品..','06012 首爾江南區宣陵路一九零街114 (清潭洞)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into redvelvet3 values('20','SMTOWN COEX Athium','尤其是\"SMTOWN博物館博物館\"和超高畫質電子屏幕\"SMTOWN外牆媒體\",2018年5月正在開放.\n" +
                "3樓的SMTOWN博物館是娛樂企業中首個將SM娛樂旗下藝人的誕生和成長過程集大成的空間. 可以欣賞音樂專輯,活動面貌,服裝和道具,幕後故事等的SM ARCHIV,SPECIAL EXHIBITION,SPECIAL EXHIBITION,ARTI. 另外,通過觀看SM文化信息製作過程,與利用增強現實(AR),VR等新技術的SM藝人的假想相遇等,給K-pop粉絲們帶來了與衆不同的體驗和快樂.\n" +
                "\n" +
                "SMTOWN外牆媒體的面積是籃球場的4倍,是韓國國內最大規模的媒體. 因此被稱爲\"韓國的時代廣場\". 這裏不僅將直播韓國流行音樂的mv,還將直播實時多維直播頻道\"t Live等.\n" +
                "5~6層是韓國國內最大的全息圖劇場. 主要放映SM旗下藝人的演唱會影像,還放映未發售DVD的演唱會. 除此之外還有可以購買藝人實際佩戴或挑選商品的禮品店(2層),咖啡館和包含SM藝人形象的多種商品的市場(4層)等..','06164 首爾江南區永東大路513 (三星洞,COEX)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into redvelvet3 values('21','SUM 市場','SM SM娛樂的公司大樓\"SM交流中心\"成爲了韓流粉絲的新據點. 因爲公司樓1樓的SUM咖啡屋和地下1樓的\"SM便利店\"SUM市場開業.','06084 서羊毛江南區三星路648 (三星洞)','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);



        q= "insert into psy3 values('22','格雷萬博物館','具有133年歷史的世界性法國蠟像專門博物館\"格雷萬博物館(Musce Grévin)\"在首爾乙支路首次在亞洲開館. 格雷萬博物館將展示約翰•列儂,瑪麗蓮•曼羅等世界級知名人士,以及psy,g-dragon等韓流明星,世宗大王,李舜臣將軍等代表韓國的歷史性人物等共80多個蠟像. 各展示空間均以各自的概念和主題,由特別套裝和照明組成,並配有生動的音響. 觀衆不僅可以與明星們自由拍照,還可以體驗到尖端技術體現的各種互動遊戲. 格雷萬蠟像館獨有的高品質展示空間,與世界最高水平的蠟像一起,爲遊客帶來超越時間和空間的夢幻,生動的體驗..','04523 首爾中區乙支路 23 (乙支路1街,乙支路別館)','02-777-4700','http://www.grevin-seoul.com/ko/')";
        db.execSQL(q);
        q= "insert into psy3 values('23','YG Shop','YG Shop是展示和銷售Bigbang,PSY,2NE1等韓流明星所屬YG娛樂的標誌和以所屬歌手爲原型製作的商品的賣場. 樂天YungPlaza(明洞店)賣場內以展臺形式入駐,可以看到所屬歌手CD,服裝,文具類,相冊等多種商品..','100-092 首爾特別市中區南大門路67 (南大門路2街) ','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into psy3 values('24','YG 娛樂','YG娛樂是韓國代表性的演藝企劃公司之一,是BigBang,PSY,Winner,IKON,黑粉色,Epik High,姜東元,李鍾碩等的所屬公司. 位於麻浦區合井洞的公司建築物的特點是獨特又幹練的外觀設計. 利用合井站8號出口的話,更容易接近.','04028 首爾麻浦區喜雨亭路1街3 (YG娛樂) ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q= "insert into psy3 values('25','MBC WORLD','文化廣播MBC將搬到上巖洞DMC園區,將現有的廣播局見學節目進化成國內最早的廣播主題公園MBC世界. 訪客們成爲MBC電視劇和人氣綜藝節目的主人公,享受尖端技術展現的多樣的體驗和觀看影像,並可以親臨實際播放製作現場. MBC建築外部有正在播出的節目通過媒體板播出,並展示明星們的手印和實物大小的照片. 建築內設有MBC的歷史體驗,在全息體驗劇場享受的GD和PSY的演出,舞蹈體驗工作室,虛擬現實體驗空間,Trick Art Photo月,各種互動體驗. 在4樓,可以在再現《大長今》,《奇皇后》等電視劇的攝影棚中穿上史劇服裝,而在7樓MBC新聞局現場,可以觀看新聞製作過程,體驗主持人體驗. MBC世界巡演每天有9次,以預約制運營,與導遊一起共進行90分鐘.\n" +
                "\n" +
                "大韓民國最初的電視主題公園,MBC世界以韓流電視劇和綜藝內容爲中心,與明星一起跳舞唱歌,享受成爲電視劇主人公的特別體驗. 體驗虛擬現實,舞蹈體驗工作室,全息舞臺等利用尖端技術的體驗,尤其受到遊客的歡迎. 巡迴結束後,還會接受韓流明星的歡迎詞和數碼簽名. 實際上《SHOW!音樂中心》,《無限挑戰》,《Radio Star》等人氣節目都在MBC全球媒體中心製作,因此可以期待與韓流明星的意外見面..','03925 首爾麻浦區城巖路267 (上巖洞)文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);




        q= "insert into wannaone3 values('26','K212','Wannaone所屬的企劃公司YMC娛樂1樓有咖啡屋K212. 在地下的練習室結束練習或休息時,經常光顧這裏. K212是可享受鮮果汁,咖啡,冰沙,蛋糕等甜點和比薩餅,意大利麪,紅酒等早午餐的咖啡廳兼餐廳. 咖啡店內處處都掛着華納圓的照片和簽名.. ','首爾龍山區綠莎坪大路二六街36',' 02-749-2954','')";
        db.execSQL(q);
        q= "insert into wannaone3 values('27','珍妮豪斯','在舞臺上散發出男性美,舞臺下則散發出可愛的少年美的華納Wanna won的中心姜丹尼爾的化妝祕訣是什麼呢? 因爲只看一眼就睜大眼睛,所以讓在粉絲們中間有着\"Ganaz\"別名的成員黃珉賢和甕成宇的雕像般的外貌更加光彩照人的化妝祕訣,如果好奇的話,就來Jenihouse吧. 負責Wanna won妝容的Jenny House是首爾代表美容沙龍,是衆多韓流明星訪問的地方. 必須通過珍妮豪斯網站提前預約. 英語和中文翻譯經紀人正在等待,所以外國人自己去也無憂無慮.  ','首爾江南區宣陵路一四六街56','02-541-7788','http://jennyhouse.co.kr/en/')";
        db.execSQL(q);
        q= "insert into wannaone3 values('28','萊杜夫拉','身高超過180釐米,擁有俊俏外貌和愉快性格的姜丹尼爾和甕成宇在Warner One上特別親密,甚至被粉絲們親切地稱爲\"小搭檔\". 據說,他們關係非常好,甚至私下也去咖啡店和美食店,因此他們從出道前開始就來到梨泰院的法式餐廳. 他們喜歡坐在陽臺上,影迷們稱這個座位爲\"小石\". 他們吃的菜單,西奧林普羅澤帕斯塔和安神牛排,密多利沙沃和惠譽國際水手服也被稱爲\"翁布套餐\",受到粉絲們的喜愛.','首爾龍山區梨泰院路一九街 6-4','02-797-2228','')";
        db.execSQL(q);


        q= "insert into superjunior3 values('29','一日一日','super junior東海和他的哥哥一起在聖水洞的咖啡廳,吸引人的小露臺和像的觀衆,室內裝修。 考慮到顧客的多種喜好,具備了多種餐桌和便利設施. 使用新的咖啡豆和細微牛奶粒子,比現有咖啡拿鐵或卡布奇諾更濃郁的咖啡香和更柔和的平白咖啡,以及咖啡的苦辣和鮮奶油的甜蜜味道融合在一起. 每天親自烤制的胡蘿蔔蛋糕,漿果蛋糕,巧克力棕蛋糕也是一定要品嚐到的甜點之一. 平時安靜的性格是一模一樣的東海幽靜的休息空間,結束一天,不足的地方.','04782 首爾城東區峨嵯山路92 (聖水洞二街,光明塔)','02-499-9303','https://www.instagram.com/cafe_haruoneday/')";
        db.execSQL(q);
        q= "insert into superjunior3 values('30','SM公司','SM娛樂是韓國代表性的演藝企劃公司之一,是寶兒,少女時代,Super Junior,SHINee,EXO,Red Velvet等韓流明星的所屬公司. 公司建築物位於江南區清潭洞. 公司地下一層的SUM市場銷售SM旗下藝人和多個藝術家合作製作的作品..','06012 首爾江南區宣陵路一九零街114 (清潭洞)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior3 values('31','SMTOWN COEX Athium','尤其是\"SMTOWN博物館博物館\"和超高畫質電子屏幕\"SMTOWN外牆媒體\",2018年5月正在開放.\n" +
                "3樓的SMTOWN博物館是娛樂企業中首個將SM娛樂旗下藝人的誕生和成長過程集大成的空間. 可以欣賞音樂專輯,活動面貌,服裝和道具,幕後故事等的SM ARCHIV,SPECIAL EXHIBITION,SPECIAL EXHIBITION,ARTI. 另外,通過觀看SM文化信息製作過程,與利用增強現實(AR),VR等新技術的SM藝人的假想相遇等,給K-pop粉絲們帶來了與衆不同的體驗和快樂.\n" +
                "\n" +
                "SMTOWN外牆媒體的面積是籃球場的4倍,是韓國國內最大規模的媒體. 因此被稱爲\"韓國的時代廣場\". 這裏不僅將直播韓國流行音樂的mv,還將直播實時多維直播頻道\"t Live等.\n" +
                "5~6層是韓國國內最大的全息圖劇場. 主要放映SM旗下藝人的演唱會影像,還放映未發售DVD的演唱會. 除此之外還有可以購買藝人實際佩戴或挑選商品的禮品店(2層),咖啡館和包含SM藝人形象的多種商品的市場(4層)等..','06164 首爾江南區永東大路513 (三星洞,COEX)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into superjunior3 values('32','SUM 市場','SM SM娛樂的公司大樓\"SM交流中心\"成爲了韓流粉絲的新據點. 因爲公司樓1樓的SUM咖啡屋和地下1樓的\"SM便利店\"SUM市場開業.','06084 서羊毛江南區三星路648 (三星洞)','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior3 values('33','索爾文熱狗','在東南亞和中國享有獨一無二人氣的韓流明星,super junior,擁有雕塑般外貌和能說會道的super junior的《失勢》和希澈是有名的美食家. 讓人胃口挑剔的希澈,幾年來最常去的地方就是狎鷗亭羅德奧的特產鬆斌德. 因爲下午6點營業到凌晨5點30分的特殊性,很多人目擊了日程結束後來這裏吃夜宵的藝人. 這裏的菜單大致分爲牛鼻子,熱狗,豬排三種..\n" +
                " ','06018 首爾江南區島山大路51路 40 (新沙洞)','010-9466-3419','')";
        db.execSQL(q);



        q= "insert into dongbangsingi3 values('34','85st Coffee','爲了和孫浩俊等至親們度過一天而選擇的見面場所是85st Coffee. 85年出生的人-因爲是朋友們聚在一起的地方,所以給店鋪取了名字. 除了朋友聚會之外,每週還會有一兩次瑜滷允浩光顧. 咖啡屋的象徵大熊玩偶是瑜滷允浩親手贈送的.','首爾特別市江南區江南大路一二二街39(論峴小學旁邊)','','https://www.instagram.com/85st_coffee/')";
        db.execSQL(q);
        q= "insert into dongbangsingi3 values('35','海南家','瑜滷允浩結束外國活動回國時或有朋友聚會時,一定去的常去的餐廳之一就是全羅道飲食專賣店\"海南店\". 瑜滷允浩從小學開始就把洪正仁(音)代表和洪正仁(音)代表當作母親一起經營的地方,他甚至親切地稱呼洪正仁(音)代表的母親爲\"媽媽\". 沒有單獨點菜,而是說給我飯吧!瑜滷允浩的話甚至可以爲他們準備應時食品. 梅生,章魚,毛蛤,幹黃花魚,排骨,幹明太魚等各種鄉土食品比比皆是,但其中瑜滷允浩最喜歡的肉制肉炒是一定要品嚐到的食物之一.','首爾特別市江南區江南大路一六零街10','02-3446-7244','')";
        db.execSQL(q);
        q= "insert into dongbangsingi3 values('36','SM公司','SM娛樂是韓國代表性的演藝企劃公司之一,是寶兒,少女時代,Super Junior,SHINee,EXO,Red Velvet等韓流明星的所屬公司. 公司建築物位於江南區清潭洞. 公司地下一層的SUM市場銷售SM旗下藝人和多個藝術家合作製作的作品..','06012 首爾江南區宣陵路一九零街114 (清潭洞)','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi3 values('37','SMTOWN COEX Athium','尤其是\"SMTOWN博物館博物館\"和超高畫質電子屏幕\"SMTOWN外牆媒體\",2018年5月正在開放.\n" +
                "3樓的SMTOWN博物館是娛樂企業中首個將SM娛樂旗下藝人的誕生和成長過程集大成的空間. 可以欣賞音樂專輯,活動面貌,服裝和道具,幕後故事等的SM ARCHIV,SPECIAL EXHIBITION,SPECIAL EXHIBITION,ARTI. 另外,通過觀看SM文化信息製作過程,與利用增強現實(AR),VR等新技術的SM藝人的假想相遇等,給K-pop粉絲們帶來了與衆不同的體驗和快樂.\n" +
                "\n" +
                "SMTOWN外牆媒體的面積是籃球場的4倍,是韓國國內最大規模的媒體. 因此被稱爲\"韓國的時代廣場\". 這裏不僅將直播韓國流行音樂的mv,還將直播實時多維直播頻道\"t Live等.\n" +
                "5~6層是韓國國內最大的全息圖劇場. 主要放映SM旗下藝人的演唱會影像,還放映未發售DVD的演唱會. 除此之外還有可以購買藝人實際佩戴或挑選商品的禮品店(2層),咖啡館和包含SM藝人形象的多種商品的市場(4層)等..','06164 首爾江南區永東大路513 (三星洞,COEX)','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi3 values('38','SUM 市場','SM SM娛樂的公司大樓\"SM交流中心\"成爲了韓流粉絲的新據點. 因爲公司樓1樓的SUM咖啡屋和地下1樓的\"SM便利店\"SUM市場開業.','06084 서羊毛江南區三星路648 (三星洞)','02-6240-9846','http://www.smtown.com/')";
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




