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


public class KenterchineseActivity extends AppCompatActivity {
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
        q= "drop table if exists runningman3 ";
        db.execSQL(q);
        q= "drop table if exists muhandozun3 ";
        db.execSQL(q);
        q= "drop table if exists ougul3";
        db.execSQL(q);
        q= "drop table if exists nahonza3";
        db.execSQL(q);
        q= "drop table if exists bijungsang3";
        db.execSQL(q);

        q = "create table if not exists runningman3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists muhandozun3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ougul3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists nahonza3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bijungsang3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);

        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into runningman3 values('1','401 (弘大)','位於弘大的401餐廳是《無限挑戰》和《running man》中活躍的萬能藝人哈哈經營的濟州豬肉專賣店. 401餐廳內裝修獨特,令人聯想起牙買加,在這裏可以欣賞到令人興奮的雷蓋音樂,頸肉,肉片,豬皮等韓式烤肉. 據悉,《無限挑戰》的會餐場所也經常被利用,如果運氣好的話,可以直接見到哈哈..','04043 首爾麻浦區小橋路23(西橋洞)','02-325-0805','')";
        db.execSQL(q);
        q= "insert into runningman3 values('2','通人市場','通仁市場是商圈活躍的地方,作爲其他傳統市場的標杆管理事例而出名,特別是在通仁市場中自制的銅錢是通仁市場獨有的樂趣. 用銅錢換錢的同時還能拿到黑色塑料餐盤,從這時開始可以拿着餐盤到處逛市場吃. 但是,銅錢只能在加盟店使用.','03036 首爾鍾路區紫霞門路15街18','\n" +
                "02-722-0911','http://tonginmarket.co.kr/mall/index.php')";
        db.execSQL(q);
        q= "insert into runningman3 values('3','焦油青少年','\n" +
                "馅饼的展示使得它可以在着名的馅饼屋外面看到，Yoo Jae-seok悬挂在跑步者身上。它停止了人们经过的步骤。它装饰着异国情调和独特的内饰。\n" +
                "\n" +
                "美国厨师可以自己烘焙，享用精美的馅饼，贴上冰淇淋或Americano的正宗食谱\n" +
                "小巷的两边都有一个商店，内部空间宽敞，有两层楼','04350 梨泰院路23号首尔龙山区4号（梨泰院洞）','\n" +
                "02-3785-3400','http://www.tartine.co.kr/shop/main/index.php')";
        db.execSQL(q);
        q= "insert into runningman3 values('4','光熙時裝店','光熙時尚購物中心位於首爾的代表性購物中心,位於一年四季不夜城的東大門. 可直接連接生產者和消費者,以低廉價格購買最新流行服飾的批發專門大型購物中心. 從地下1層到地上6層,在數百個賣場中可以買到淑女服,男裝,休閒裝,女裝,童裝,運動裝,皮革,毛皮等多種服裝和時裝商品. 因爲晚上9點到翌日下午5點之間開放,所以逛逛購物前附近的東大門設計廣場(DDP)和清溪川,洛山公園城郭路.\n" +
                "\n" +
                "光熙時尚購物中心通過國內粉絲和海外粉絲都喜愛的SBS綜藝節目《Running Man》開始出名. 世界級動作明星成龍和super junior成員崔始源在這裏展開了爭奪寶物的比賽. 位於光熙時裝購物中心附近位置的東大門設計廣場(DDP)以各種韓流電視劇和電視節目拍攝地著稱. 可以欣賞著名建築家設計的獨特建築,體驗高水平的文化藝術,歌手G-Dragon,演員金秀賢,樸寶劍等衆多明星訪問了這裏.','04567 首爾中區馬場路1街21 (新堂洞,光熙時尚物)','02-2238-4352','')";
        db.execSQL(q);




        q= "insert into muhandozun3 values('5','萬福菊水集','茶房區特輯中劉在石和樸明秀爲了提升心臟樸東秀而吃了拌麪. 實際上,來到賣場,就能看到當時的拍攝照片和簽名. 萬福麪條店讓人聯想到20世紀70年代,在樸素雅緻的室內氛圍中,可以品嚐到整潔的麪條和鼕鼕酒,下酒菜等. 《無限挑戰》中因爲心臟樸東秀而原地跑步,吃辣的拌麪的樣子被播出了. 萬福麪條店的拌麪和火熱的熱度一次上升,樸明秀的心臟跳動超過了110. 當然,即使不是拌麪,也有很多可以舒適地享用的料理,這是萬福麪條店的優點. 包括正宗和冬東珠,以鯷魚麪條,包肉,海鮮蔥餅,田螺拌菜等熟悉的菜單爲主..','首爾麻浦區上巖洞214-7','02-374-6870',' www.manboknoodle.com')";
        db.execSQL(q);
        q= "insert into muhandozun3 values('6','杜雷烏加','在茶房區特輯中,樑世亨和黃光熙爲了把心跳數維持在100以下而來到了杜雷烏街. 雖然主要由韓牛製作,但是在《無限挑戰》中以涼爽的冷麪作爲主人公登場. 看楊世亨和黃光熙痛快地喝湯的樣子就覺得饞涎欲滴. 由於韓國持續出現罕見的酷暑天氣,他們吃冷麪的樣子讓人不由自主地感到涼爽. 杜萊烏街原來是由農協直接經營的烤炭火店. 因爲農協只使用嚴選的韓牛,所以其質量和味道比任何地方都突出. 用這樣的韓牛熬湯的冷麪的話,味道更保了. 這裏的特點是研究美味的烤制方法,親自烤到職員們熟了肉爲止.','首爾麻浦區世界盃北路356','02-374-9255',' www.doorewooga.co.kr')";
        db.execSQL(q);
        q= "insert into muhandozun3 values('7','更辣','哈哈和鄭俊河爲了提高心跳數而跑到的地方就是新村的辣燉排骨專賣店. 辣辣辣燉牛排可以按階段選擇辣味,也可以免費替換粉絲和炒年糕的調料,吃到豐盛的量. 爲了中和辛辣口味的奶酪拌飯和奶酪炒飯,還有煎雞蛋等都是由側面菜單構成的. 對辛辣食物比較敏感的人,最好在最脆弱的階段做菜,與飯糰飯或雞蛋蒸一起食用. 作爲參考,在茶房區特輯中必須維持100以上心跳數的HAHA和鄭俊河吃了最辣的燉排骨. 看到大汗淋漓地吸着排骨的HAHA和鄭俊河的樣子,不由得嘴角上流着汗.','首爾西大門區延世路五나街37號','02-323-5574','http://kprince.fordining.kr/')";
        db.execSQL(q);
        q= "insert into muhandozun3 values('8','MBC WORLD','文化放送MBCが上岩洞DMC団地に移転し、既存の放送局見学プログラムを進化させた、国内初の放送テーマパークMBCワールドを披露した。訪問者は、MBCドラマや人気芸能プログラムの主人公になって高度な技術で実装されたさまざまな体験と映像観覧を楽しみ、実際の番組制作の現場に直面することができる。 MBC建物の外部には、現在放送中の番組がメディアボードを介して放送され、スターたちのハンドプリンティングと実物大の写真が展示されている。建物の中ではMBCの歴史体験、ホログラムシアターで楽しむGDとサイの公演、ダンス体験スタジオ、バーチャルリアリティ体験スペース、トリックアートフォト月には、さまざまなアトラクション体験が設けられている。 4階ではチャングムの誓い、奇皇后などのドラマを再現した撮影セット場で時代劇の衣装を着て見ることができ、7階MBC報道局の現場では、実際にニュース制作過程を察してアンカー体験を試みることができる。 MBCワールドツアーは、毎日9回、予約制で運営されておりガイドと一緒に合計90分間進行される.\n" +
                "\n" +
                "大韓民国最初の放送テーマパーク、MBCワールドでは、韓流ドラマと芸能コンテンツを中心にスターと一緒に踊って歌って、ドラマの中の主人公になってみるの特別な体験を楽しむことができる。バーチャルリアリティ体験、ダンス体験スタジオ、ホログラム舞台など先端技術を動員した体験が観光客に特に人気だ。ツアーが終わったら、韓流スターたちの歓迎の挨拶とデジタルサイネージも受けることができる。実際に「ショー！音楽中心」、「無限挑戦」、「ラジオスター」のような人気番組がMBCグローバルメディアセンターで製作されており、韓流スターたちとの意外な出会いを期待みることができる.','03925ソウル麻浦区ソンアムで267（上岩洞、（株）文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);



        q= "insert into ougul3 values('9','MBC WORLD','文化放送MBCが上岩洞DMC団地に移転し、既存の放送局見学プログラムを進化させた、国内初の放送テーマパークMBCワールドを披露した。訪問者は、MBCドラマや人気芸能プログラムの主人公になって高度な技術で実装されたさまざまな体験と映像観覧を楽しみ、実際の番組制作の現場に直面することができる。 MBC建物の外部には、現在放送中の番組がメディアボードを介して放送され、スターたちのハンドプリンティングと実物大の写真が展示されている。建物の中ではMBCの歴史体験、ホログラムシアターで楽しむGDとサイの公演、ダンス体験スタジオ、バーチャルリアリティ体験スペース、トリックアートフォト月には、さまざまなアトラクション体験が設けられている。 4階ではチャングムの誓い、奇皇后などのドラマを再現した撮影セット場で時代劇の衣装を着て見ることができ、7階MBC報道局の現場では、実際にニュース制作過程を察してアンカー体験を試みることができる。 MBCワールドツアーは、毎日9回、予約制で運営されておりガイドと一緒に合計90分間進行される.\n" +
                "\n" +
                "大韓民国最初の放送テーマパーク、MBCワールドでは、韓流ドラマと芸能コンテンツを中心にスターと一緒に踊って歌って、ドラマの中の主人公になってみるの特別な体験を楽しむことができる。バーチャルリアリティ体験、ダンス体験スタジオ、ホログラム舞台など先端技術を動員した体験が観光客に特に人気だ。ツアーが終わったら、韓流スターたちの歓迎の挨拶とデジタルサイネージも受けることができる。実際に「ショー！音楽中心」、「無限挑戦」、「ラジオスター」のような人気番組がMBCグローバルメディアセンターで製作されており、韓流スターたちとの意外な出会いを期待みることができる.','03925ソウル麻浦区ソンアムで267（上岩洞、（株）文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into ougul3 values('10','雪冰新林2號店','雪冰是一家出售天樂冰沙,芒果芝士冰沙等多姿多彩的冰沙,切糕烤麪包,奶酪炒年糕披薩等獨特的主廚的甜品咖啡館. 雪冰新林2號店是活躍於音樂活動和演員的cnblue成員李宗泫運營的場所,也是李鍾賢在《我們結婚了》中與假想情侶演員孔升妍約會的地方. 展示着李鍾賢親筆簽名和他的演出照片.','08760 首爾冠嶽區新林路353 (新林洞) 2樓','02-882-9080','http://sulbing.com/')";
        db.execSQL(q);
        q= "insert into ougul3 values('11','馬福林奶奶最小的兒子家炒年糕','這是一家由製作紅色炒年糕元祖新堂洞辣炒年糕的馬福林奶奶的兒媳傳授祕訣運營的炒年糕專賣店. 位於新堂洞辣炒年糕城內. 隨着人氣的提高,最近還提供快遞配送服務..','04611首爾特別市中區茶山路221 (新堂洞)','02-962-8288','http://mabokrim.subnara.info/')";
        db.execSQL(q);
        q= "insert into ougul3 values('12','蠶室地毯體驗場','蠶室汽車體驗場是位於蠶室的卡丁車體驗場,無論男女老少,如果沒有駕駛執照,都可以通過賽車運動享受健康的趣味生活. 也曾被用作綜藝節目《我們結婚了》的拍攝地. 每週一,活動和下雨天休息. 公休日正常營業.','\n" +
                "05500  首爾鬆坡區奧林匹克路25 (蠶室洞,首爾綜合運動場)','02-420-3886','http://www.birel.kr/?act=main')";
        db.execSQL(q);
        q= "insert into ougul3 values('13','德斯法因加登法夫','擁有酒店式桑拿設施,購物,娛樂設施等的大型桑拿房..','首爾鬆坡區忠敏路10 garden5 Tools','02-404-2700','http://www.spagarden5.co.kr/')";
        db.execSQL(q);






        q= "insert into nahonza3 values('14','MBC WORLD','文化放送MBCが上岩洞DMC団地に移転し、既存の放送局見学プログラムを進化させた、国内初の放送テーマパークMBCワールドを披露した。訪問者は、MBCドラマや人気芸能プログラムの主人公になって高度な技術で実装されたさまざまな体験と映像観覧を楽しみ、実際の番組制作の現場に直面することができる。 MBC建物の外部には、現在放送中の番組がメディアボードを介して放送され、スターたちのハンドプリンティングと実物大の写真が展示されている。建物の中ではMBCの歴史体験、ホログラムシアターで楽しむGDとサイの公演、ダンス体験スタジオ、バーチャルリアリティ体験スペース、トリックアートフォト月には、さまざまなアトラクション体験が設けられている。 4階ではチャングムの誓い、奇皇后などのドラマを再現した撮影セット場で時代劇の衣装を着て見ることができ、7階MBC報道局の現場では、実際にニュース制作過程を察してアンカー体験を試みることができる。 MBCワールドツアーは、毎日9回、予約制で運営されておりガイドと一緒に合計90分間進行される.\n" +
                "\n" +
                "大韓民国最初の放送テーマパーク、MBCワールドでは、韓流ドラマと芸能コンテンツを中心にスターと一緒に踊って歌って、ドラマの中の主人公になってみるの特別な体験を楽しむことができる。バーチャルリアリティ体験、ダンス体験スタジオ、ホログラム舞台など先端技術を動員した体験が観光客に特に人気だ。ツアーが終わったら、韓流スターたちの歓迎の挨拶とデジタルサイネージも受けることができる。実際に「ショー！音楽中心」、「無限挑戦」、「ラジオスター」のような人気番組がMBCグローバルメディアセンターで製作されており、韓流スターたちとの意外な出会いを期待みることができる.','03925ソウル麻浦区ソンアムで267（上岩洞、（株）文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into nahonza3 values('15','望遠市場','雖然望遠市場與其他傳統市場沒有太大區別,但《我獨自生活》中經常出現被稱爲\"陸中灣市場\"的漫畫版. 以陸重完爲首,姜敏赫,金正敏等衆多藝人訪問,聚集很多豎起大拇指的小吃店,從排隊等待的\"qux炸雞湯\"開始,一兩碗麪就花掉了. 以低廉的價格解決一頓豐盛的飲食問題,還可以參觀傳統市場,可謂一石二鳥.','首爾市麻浦區圃隱路八街14號','02-335-3591',' https://mangwonsijang.modoo.at')";
        db.execSQL(q);
        q= "insert into nahonza3 values('16','安山','金東萬是最長壽偶像組合\"神話\"出身的成員,以幽默,健康的形象備受人們喜愛的金東萬,在《我獨自生活》中也展現了獨自生活的方法的精髓. 擁有多種興趣愛好的他,帶着山地自行車出現在西大門區安山.鞍山海拔295.9米,地形不高,設有可以利用輪椅或嬰兒車舒適散步的無障礙自樂路,約2個半小時左右,足有一週時間. 通往安山的登山路入口有毋嶽齋,獨立門,西大門自然史博物館等幾處與市中心很近的地方. 漫步在慢緩的散步小徑上,可以忘記首爾中心的美麗風景.','首爾市西大門區延禧洞一帶','02-330-1958','  http://www.sdm.go.kr/educate/naturepark.do?mode=view&sdmBoardSeq=379')";
        db.execSQL(q);
        q= "insert into nahonza3 values('17','望遠漢江公園','出演《望遠漢江公園》,《我獨自生活》等人氣搖滾樂隊玫瑰旅館的演唱者陸重完是住在望遠洞附近的屋塔房裏的望遠洞的基礎. 有一天,陸重完爲了尋找作曲的靈感,揹着吉他前往家附近的望遠漢江公園. 我一個人坐在公園的一邊, 一邊吐露創作的艱辛, 他馬上用優美的嗓音即興表演, 讓市民高興起來.','首爾特別市麻浦區麻浦路467','02-3780-0601',' http://hangang.seoul.go.kr/archives/3565')";
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




