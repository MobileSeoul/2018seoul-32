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


public class KdramachineseActivity extends AppCompatActivity {
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

    }

    public void createDB() {
        db = openOrCreateDatabase
                ("member.db", Context.MODE_PRIVATE, null);
    }

    public void createTable() {
        String q;
        q= "drop table if exists hwayugi3 ";
        db.execSQL(q);
        q= "drop table if exists dangzamsa3 ";
        db.execSQL(q);
        q= "drop table if exists sarang3";
        db.execSQL(q);
        q= "drop table if exists ssam3 ";
        db.execSQL(q);
        q= "drop table if exists doctors3";
        db.execSQL(q);
        q= "drop table if exists doggabi3";
        db.execSQL(q);
        q= "drop table if exists ddoohaeyoung3";
        db.execSQL(q);
        q= "drop table if exists bulgudae3";
        db.execSQL(q);
        q= "drop table if exists taeyang3";
        db.execSQL(q);
        q= "drop table if exists oungpal3";
        db.execSQL(q);
        q = "create table if not exists hwayugi3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dangzamsa3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists sarang3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ssam3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doctors3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doggabi3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ddoohaeyoung3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bulgudae3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists taeyang3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists oungpal3(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into hwayugi3 values('1','文化儲備基地','文化儲備基地在石油危機之後，由於安全原因，在石油危機之後建造了五個油庫的麻浦油藏的石油儲量在2017年世界杯之前因安全原因而關閉。2017年9月， 作為一個新生而出生。我們回收舊油罐被改造成一個場地為市民和報告廳，展覽廳，餐廳，多功能教室等。 <有機化學>地方在信使須菩提聚會出來的調查是在天空 T1亭。作為一個多功能的通信空間由混凝土擋土牆其餘創造玻璃的新型牆體和屋頂，在過去的擋土牆和目前的建築，在這裡你可以看到蔓延看起來maebongsan和諧文化的岩床地形水箱拆除後保留基地內的不同空間它是。除了T1 Pavilion，T2，T3，T4，T5，T6和T0有各種用途和用途，因此可以抽出時間。','大韓民國','02-376-6410','https://parks.seoul.go.kr/template/sub/culturetank.do')";
        db.execSQL(q);
        q= "insert into hwayugi3 values('2','沃克baut','\n" +
                "它是 Travel PubWalker Bar，其中包括旅行，貓，泰國食品和手工啤酒等所有關鍵詞。這是Son Gong-gong（Lee Seung-gi）拯救第三個被歹徒困擾的地方。它被介紹給2016年旅行指南孤獨星球，並成為世界各地訪問南山的旅行者的名人。著名的手工啤酒具有獨特的風味，Pat Thai和Choyang Baku是泰國當地人認可的主菜。收集世界各國的貨幣以及成千上萬遊客的寶麗來照片。有一條以街道漫畫而聞名的“有趣的街道”，從位於Walkerbu對面的Sungkyun女子大學的附樓通往4號線明洞站的3號出口，有各種景點。','韓國首爾','02-757-1110','https://www.instagram.com/pub_walkabout/')";
        db.execSQL(q);
        q= "insert into hwayugi3 values('3','Echapon Bolios Itaewon','Son Gogong（Lee Seung-gi）担心东郡的冰淇淋店里没有客人。然而，实际上，Ema Ann Bolios非常受欢迎，您无需担心它。印度的Alfonso Mango（称为芒果之王）和Echolabolos冰淇淋（含有高达22％的各种时令水果）采用新鲜牛奶，采用最好的材料，如马达加斯加香草豆和自制巧克力。波士顿和纽约。自制华夫饼配多彩浇头，如水果戒指，巧克力和彩虹洒在40种口味的冰淇淋上，张贴在各种SNS上，并且越来越受欢迎。','首尔龙山区梨泰院路','02-797-0814','http://emackandbolios.kr/')";
        db.execSQL(q);
        q= "insert into hwayugi3 values('4','梨泰院古董故事','Antique Story位于梨泰院家具街，是一个出租和出售古董，复古配饰和复古家具的地方。在光阳，Son Gogong（Lee Seung Gi）不得不打电话给Sao Jung买水壶，这是商店里最贵的。有各种各样的产品，从价值数百万日元的复古家具到伪精品配件。对于想要安排各种摄影配件和室内电器的人来说，它就像一个宝库。它位于梨泰院1洞居民中心旁边的道路旁。','首尔龙山区Bokwang路104号','02-733-2979','')";
        db.execSQL(q);




        q= "insert into dangzamsa3 values('5','瓶花','當你沿著馬路前往北村韓屋村時，你可以看到遠處的花店。 這是紅菊（Suzi）歡迎的同一家花店。 各種各樣的鮮花正在出售，乾花和預調花在很長一段時間內很受遊客歡迎，以享受它們的美麗。 還提供短期花課程。','韓國首爾28',' 02-737-8934','http://www.botteflower.com/')";
        db.execSQL(q);
        q= "insert into dangzamsa3 values('6','糖果色','瓶花對面的Egtart專賣店,洪珠(秀智飾)和宰燦(李鍾碩飾)嚥下口水,望着窗外,移動了腳步. 酥脆和水潤的柔軟感共存的多種味道的雞蛋茶和一杯美式咖啡,就足以給下午帶來活力. 這裏曾是《繼承者們》等多部電視劇的拍攝場所.','韓國首爾31','02-733-2979','')";
        db.execSQL(q);
        q= "insert into dangzamsa3 values('7','We are young壁畫','安國站1號出口,在豐文女子高中正讀圖書館的路上,漢城德城女子高中,和德成女子下牆上的過街天橋,壁畫。 親吻的老夫婦畫和we are young字樣的壁畫,給北村韓屋村的遊客留下了深刻印象. 這裏就是洪珠(秀智飾)和海燦(李鍾碩飾)在時間上的差異.','首爾特別市鍾路區慄谷路三街64','02-2148-1114','')";
        db.execSQL(q);
        q= "insert into dangzamsa3 values('8','咖啡店南瓜','咖啡館位於世宗大路後側,朝鮮一步步貞洞別館對面,露臺特別漂亮. 《當你入睡時》中洪珠(秀智飾)和李裕範(李相燁飾)在雨天相遇並高聲呼喊的場面雖然在這裏,但與劇中氛圍不同,以平和,平和的氛圍著稱. 陽光明媚的日子裏,向開着敞亮門的露臺擺了沙發,是咖啡館最佳地角. 與地瓜拿鐵差不多,用蜂蜜南瓜塊做成的蜂蜜南瓜仁,含有椰子奶油和果凍的南瓜餅乾是春天推薦的菜單.','首爾特別市中區世宗大路二一街40','02-733-7905','https://www.instagram.com/cafepump_kin/')";
        db.execSQL(q);





        q= "insert into sarang3 values('9','格拉切納','位於延南洞的格拉切納是《愛的溫度》中旌善在法國留學回來後,以餐廳\"good spair\"登場的地方. 菜單非常豐富,最受歡迎的是手工啤酒和比薩. 廚師推薦的菜單是印度式的咖喱,與紅酒的搭配出乎意料地特別. 晚上可以在淡淡的照明和浪漫的氛圍中享受紅酒和牛排. 餐桌間空間寬闊,便於在用餐時進行對話,隨處擺放的可愛小物件營造出了溫馨的氣氛.','首爾麻浦區延南路13樓1樓','02-338-8908','')";
        db.execSQL(q);
        q= "insert into sarang3 values('10','揚出庫金','這裏就是《愛的溫度》中登場的美男廚師們在拍攝前選修廚師烹飪課程的地方. \"好羊\"\"出\"出\",意爲把好菜放出來的意思,揚出也是在這裏學習料理的廚師的名字. 利用時令食材健康,健康,健康,健康地準備一頓韓國料理的地方,是經常致力於開發新菜單,不使用調味料的充滿誠意的餐廳.','首爾江南區論峴路一五七街15','02-547-4420','')";
        db.execSQL(q);
        q= "insert into sarang3 values('11','韋斯帕奇奧','프在蘭斯留學前,他的廚藝就很出衆. 劇中正宇首次體驗旌善料理的地方是位於論峴洞的伊塔麗西餐廳\"wispazio\". 從熱湯到安提帕斯托,主菜,甜點,Wispatcho的正餐非常美. 午餐準備了3種合理的價格. 晚飯時,可以選擇主菜牛排和燈心,雪花肉,羊肉等. 遊戲也很細心,視覺和味覺都提供滿意的食物. 空間也很有魅力,想要浪漫約會的話,推薦窗邊的位置.','首爾江南區彥州路一三三街21號','02-549-5667','https://www.yspazioseoul.com/')";
        db.execSQL(q);
        q= "insert into sarang3 values('12','哥蒂沙當','在電視劇中被拒絕的洪雅(趙寶兒飾)雖然心疼,但是這個場面中的露臺真的非常美麗. 這裏就是梨泰院的法式餐廳\"Cutti Jard\"(音譯). 包括廚師在內的大部分職員都是法國人,餐廳的內部也像法國的露天咖啡館,因此人們自然而然地想到了葡萄酒. 推薦的菜單是三文魚排. 從1樓的戶外露臺到2樓的餐廳,3樓的酒吧,還有頂樓的派對休息室. 這裏擁有多種寬敞的空間,可以出入寵物.','首爾龍山區普光路120','02-796-5072',' http://blog.naver.com/cotejardin')";
        db.execSQL(q);


        q= "insert into ssam3 values('13','首爾圖書館的天庭','東萬(樸敘俊飾)抱着在職場度過艱難一天的愛拉(金智媛飾)安慰她說:\"想哭的時候哭,這太酷了.\" 在東萬的懷抱中,埃拉流淚的地方是首爾圖書館屋頂的空中庭院. 建於1926年,在這裏見證了80多年的首爾歷史,現在建築的歷史價值得到了認可(登記文化遺產第52號),重新成爲了圖書館. 看書想鬆一口氣的時候,就到樓頂的空中花園去看看吧. 下面是首爾廣場,右側和左側是德壽宮和南山,晚上照明燈點亮,更增添了其韻致..','首爾特別市中區世宗大路一一零號','',' http://lib.seoul.go.kr/ ')";
        db.execSQL(q);
        q= "insert into ssam3 values('14','奇怪的國家三思允','電視劇的另一位主人公,6年的情侶雪熙(宋河允飾)和朱曼(安在洪飾). 這裏讓人聯想到童話\"怪國\"愛麗絲的室內裝修,令人印象深刻的咖啡廳兼酒吧,白天可以享用咖啡和早午餐,晚上還可以喝雞尾酒和紅酒. 融合口傳鹿茸和咖啡的鹿角咖啡拿鐵是這裏的原味菜單. 在2樓的屋頂,可以盡情享受良才川的錄音和涼爽的風.','首爾瑞草區良才川路一七街3','02-353-7777','')";
        db.execSQL(q);
        q= "insert into ssam3 values('15','盧卡511','愛羅拉是屢落榜,卻始終不放棄自己夢想的不屈的青春. 抓着麥克風,她的眼睛就不知不覺地變得明亮,在同期的燦淑的婚禮上,她作爲主持人代替主持人,盡情展示自己的才能. Ara身穿美麗的禮服主持婚禮的戶外婚禮在《來自星星的你》的外景地盧卡511舉行. 模仿歐洲宮殿的設計,優雅的本館主要是活動的大型館,別館是法國餐廳. 從本館穿過庭院就是別館,連接本館和別館的庭院風景優美,無論怎麼看,都可作爲婚禮場所受歡迎.','首爾江南區島山大路81路40號清潭洞115-16 LUKA大廈','02-540-6640','')";
        db.execSQL(q);
        q= "insert into ssam3 values('16','AY休息室','順愛報\"的醫生武彬(崔宇植飾)被婚禮上堂堂正正,機智地主持婚禮的愛羅所迷住. 在去參加婚禮的酒吧裏,武彬的朋友們慫恿艾拉喝酒,爲了保護愛拉的朋友們,他自詡爲\"黑騎士\". 兩人的緣分開始,後臺變成了一片狼藉. AY Lount以《無限挑戰阿修羅篇》爲首的《都午海英》《任意依戀》等各種電視劇和綜藝節目的拍攝地聞名遐邇,是擁有像木頭和皮革一樣精緻感覺的地方. 各種電視劇中經常出現的地點是中央酒吧,從2樓的沙發上俯瞰的前景也很好.','首爾江南區江南大路九二街13街','02-552-8199','')";
        db.execSQL(q);





        q= "insert into doctors3 values('17','蓬祖爾哈瓦伊','從一覽無餘的遮陽棚入口開始,散發出異域風情的混合餐廳\"bonzour hui\",這裏不僅有個性十足的小飾品和室內裝修,還有在整個賣場響起的夏威夷傳統音樂. 香腸,土豆,雞肉串,蝦,五花肉總集合的\"BBQ防曬器\",\"奶油咖喱烏冬面\"等獨特的混合料理是這裏的招牌菜. 另外,由於上癮性很強,所以這裏有\"毒品披薩\"的別名,在這裏特有的特別料理\"壽司\"裏,只要喝一杯水果奶酪雞尾酒,就不亞於夏威夷旅行.\n" +
                "\n" +
                "在電視劇《dr.s.》第四集中華麗登場而引發好奇的《bonzour hawice》已經是弘大的\"熱門節目\"之一. 因爲《dr.s.》的女主人公劉慧貞(樸信惠)的至親千順熙運營的咖啡屋\"sunny hawai\"經常在電視劇中登場. 劇中(金來沅)、(樸信惠)情侶홍지홍也將在這裏유혜정清涼的啤酒一起約會。','04043 首爾麻浦區小橋路三內街23 (西橋洞)','010-9756-5406','')";
        db.execSQL(q);
        q= "insert into doctors3 values('18','西村傳統大國','在電視劇《dr.s.》中,劉慧貞(樸信惠飾)的父親經營的湯飯店西村傳統米腸湯店以24小時泡製的濃肉湯聞名. 古典韓屋和整潔的室內裝修與景福宮周邊景觀相協調. 辣辣的,香噴噴的米腸湯也是一流的,在飯店直接醃製的泡菜也是首爾最好吃的泡菜之一. 吃完飯後,智浩和惠貞情侶一起享受着湯飯,別忘了留個紀念照!','\n" +
                "03027 首爾鍾路區社稷路9街8 (筆運動) ','02-735-0122','')";
        db.execSQL(q);
        q= "insert into doctors3 values('19','楊鐵北江東區廳店','《繼承者們》,《Doctors》,《匹諾曹》等人氣電視劇的主角樸信惠的父母經營的兩大窗戶專賣店. 末窗,牛腸,羊等食材每天從牛市空運過來,涼爽乾淨的涼拌涼飯等小菜也是在賣場直接製作的. 沒有日程的時候樸信惠經常和同事一起訪問.','05399 首爾江東區城內路62 (城內洞,柳原大廈)','02-478-1192','')";
        db.execSQL(q);







        q= "insert into doggabi3 values('20','日甘湖','遇到自己的初戀泰熙(鄭海仁飾)的池恩卓(金高恩飾),以湖邊爲背景,展現如畫般的場面的地方是日甘湖. 位於建國大學內,經常被稱作\"建國大學湖\",但不只對在校生,對所有人開放. 在春天和夏季,圍繞湖水的樹木和花朵的香氣將清新而閒暇. 夕陽西下,映照在湖水中的虹霓橋的燈光將呈現迷人的夜景.',' 首爾廣津區陵洞120','','')";
        db.execSQL(q);
        q= "insert into doggabi3 values('21','雲峴宮洋館','‘我會把你叫到世界上最安全的地方.\"每當恩卓處於危險時,鬼怪就會叫她去的家就是位於鍾路的雲峴宮洋館. 雄壯而高貴的鬼屋內生活着鬼怪,陰間使者,池恩卓. 雲峴宮是興宣大院君的私邸,也是他的兒子,朝鮮第26代國王高宗出生併成長的地方.雲峴宮洋館也被稱作\"李宇公邸\",日帝爲了監視朝鮮王族,在大院君的孫子那裏建造了該館. 歐洲風格的近代式建築,包含華麗而又悲傷的故事.','首爾鍾路區三逸大路464','02-765-1840 ',' http://www.unhyeongung.or.kr/')";
        db.execSQL(q);
        q= "insert into doggabi3 values('22','尹潽善家','將彩票中獎號碼告訴奶奶鬼魂的金信(音)突然出現在恩卓眼前. 首爾特別市民俗文化遺產第27號人物尹潽善家是尹潽善前總統一家第4代居住的家庭. 尹潽善故居內部雖然不能入場,但周圍的石牆路因寂靜的氛圍,攝影場所深受衆多遊客的歡迎.',' 鍾路區尹潽善路62','','')";
        db.execSQL(q);
        q= "insert into doggabi3 values('23','週末韓服','位於尹潽善家附近的\"One day韓服\"從傳統韓服到華麗裝飾的改良韓服,舒適的生活韓服和兒童韓服,可以租賃1000多種韓服. 使用4小時的費用是15,000韓元,使用24小時的費用是28,000韓元. 因爲常駐着英語,中文,日語等多種外語的職員,所以很適合和外國朋友在一起.\n" +
                "一帶走,尹潽善家,正讀圖書館對面的牆,特別狹窄彎扭的坡道。 三清洞的茶園是可以品嚐到各種傳統茶的地方,非常適合穿着韓服訪問. 擁有100年以上歷史的韓屋內坐落着整潔的庭院和蓮花池. 在春天和夏天,涼的五味子茶和覆盆子茶是人氣菜譜,配上爽口的甜南瓜蒸糕,味道會更好.','首爾鍾路區北村路五街四街','070-4202-4310','http://www.onedayhanbok.com/')";
        db.execSQL(q);




        q= "insert into ddoohaeyoung3 values('24','三清洞衚衕,咖啡館','樸道京和吳海英在哭的時候,笑的時候,打架的時候,都是一起走的路. 已經向戀人們口碑相傳的三清洞小巷,絕對是散步的樂趣,還有享受風景的樂趣. 電視劇歷史上最激烈的道京和海英的吻戲也是在這裏誕生的. 這裏要來1號線的鐘閣站在仁寺洞沿路走着走着,在豐文女子高中,一直。 左邊是三清洞的根據地咖啡屋\"咖啡館\",海英和道京在這裏吃了不是咖啡的飯. 如果走熱了,可以到咖啡館喝杯涼爽的冰咖啡,也可以繞過左邊的小巷走. 只是,由於是實際居住地,所以嚴禁喧譁.','首爾鍾路區北村路五가路8-11','02-732-7656','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung3 values('25','龜浦麪條','從漢城大入口站出發,慢慢走就會發現這家冷麪店. 與被低矮的屋頂包圍的寂靜村莊氛圍非常相似的龜浦麪條,在《又,吳海英》第五集中,海英和道京用一杯燒酒安撫了淒涼的心. 晚上站在商店前,能看見被照明的漢陽都城,真有這麼大的韻致嗎? 龜浦麪條賣場在畫面上也像乍一看一樣,面對着美麗的花壇. 樸素的花和小樹與酷似20世紀70年代的九浦麪條的氛圍非常吻合. 去九浦冷麪,來一碗涼爽的夜風和麪條消暑怎麼樣? 如果能再像《又,吳海英》中的道京和海英那樣,再配上一杯燒酒的浪漫,真是人間樂園.','首爾特別市城北區城北路52-1','02-744-0215','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung3 values('26','達寧巴魯','《漂亮》的吳海英和《就那樣》的吳海英是和公司同事一起度過火熱之夜的地方! 以景福宮慶會樓爲背景的室內裝修非常有特色. 最主要的特點是,這裏是可以舉行小規模的Wome Wedding,上市秀,時裝秀,展示會,演奏會等豐富多彩的文化活動和私人派對,是綜合文化空間. 平時從18點到22點,還會進行無限制的紅酒自助餐,準備會餐或聚會的人的話,可以先確認一下. 可以品嚐到20種豐富多彩的下酒菜和各種各樣的葡萄酒和生啤酒. 積極推薦給想像吳海英和公司同事一樣盡情地唱歌,跳舞,送禮的人. ','首爾江南區永東大路513COEX會展中心1樓(東大門)','02-6002-2003','www.coexourhome.co.kr')";
        db.execSQL(q);




        q= "insert into bulgudae3 values('27','首爾市立美術館','從德壽宮石牆路通往貞洞路,古色古香的建築巍然聳立. 這裏是首爾市立美術館西小門的本館. 比起展覽,美術館建築本身的建築美更加突出. 美術館方面保留了文藝復興風格的前大法院建築物的正面部分,並在背面新建了現代式建築. 進入美術館時,最先看到的就是將舊建築正面和新建築物的牆面用玻璃連接起來的媒介空間.\n" +
                "特別是從玻璃天花板上噴出的自然光,非常有魅力. 首爾市立美術館的展示會以適當協調專業性和大衆性著稱. 屆時將展示夏加爾,畢加索,馬蒂斯,馬格里特,梵高等美術門外漢也熟知的世界知名畫家的展示會,國際媒體藝術雙年展,美術館春遊展等具有特色的企劃展.','04515 首爾中區德壽宮路61 (西小門洞,首爾市立美術館)','02-2124-8800','http://sema.seoul.go.kr/')";
        db.execSQL(q);
        q= "insert into bulgudae3 values('28','盧卡511','盧卡511是位於江南區清潭洞正中央的意大利餐廳. 被稱爲\"城市中心中的阿房宮\"的盧卡511是小型婚禮,也是電視劇《來自星星的你》,《Remember-兒子的戰爭》,還有《我們結婚了》等節目的拍攝地.','06010 首爾江南區島山大路81路40 (清潭洞,LUKE511大廈)','02-540-6640','https://www.instagram.com/luka511_seoul/')";
        db.execSQL(q);
        q= "insert into bulgudae3 values('29','DDP(東大門設計廣場)','韓流女神千頌伊和外星男都敏俊的浪漫愛情故事的來自星星的你. 從整體來看,在電視劇收視率下降的情況下,最高收視率達到了28.1%,不僅非常有名的炸雞啤酒,而且每集電視劇中的服裝,演出陣容,拍攝地等都成爲了人們熱議的話題. 至今仍有很多人記得和想起的來自星星的你中拍攝地中,最具代表性的就是N首爾塔. 雖然這裏是能夠一眼就能看到首爾的南山名勝地,但千頌伊和都敏俊的愛情故事使這裏成爲浪漫場所.\n" +
                "首爾市立美術館被拍到,都敏俊和都敏俊的摯友,張律師一邊散步一邊交談,一邊接到千頌伊打來的電話. 這裏不僅能觀賞美術,還準備了近代式建築和溫馨的野外庭院,是像都敏俊這樣可以吐露心聲的寵物散步的好去處.\n" +
                "最後一集再次回到地球的都敏俊與千頌伊浪漫接吻的地方是國立劇場. 實際上,這裏是擁有60多年歷史的演出界中心地,每月都能看到各種演出的地方.\n" +
                "除此之外,爲了想吃鍋烏冬面的千頌伊,金秀賢光顧的麪條店,張律師和都敏俊聊過的茶館等,光是來自星星的你的拍攝,就能看到首爾的各個地方.','04566 首爾中區乙支路281 (乙支路7街)','02-2153-0000','http://www.ddp.or.kr/main')";
        db.execSQL(q);
        q= "insert into bulgudae3 values('30','潘帕姆皮亞諾達寧娃','潘帕姆皮亞諾達寧娃是位於上水的Daningba過去運營鋼琴店的地方,一直使用着原來的名字. 內部氛圍舒適,從壁紙到無法輕易看到的室內裝飾小物件,是能欣賞到古風古香又獨特感覺的東西方協調的地方.','04074 서울 마포구 와우산로3길 21 1층','\n" +
                "070-4068-2669','https://www.facebook.com/pp.piano.seoul')";
        db.execSQL(q);



        q= "insert into taeyang3 values('31','B+M','《太陽的後裔》第二集中的一個場面. 從阿富汗回來的劉時鎮在姜暮煙的醫院前面等她. 劉時鎮本想和她一起吃飯,但姜暮煙卻連頭都沒洗,她帶她去的地方就是自己的家,甚至是代替外食吃飯,開始第一次約會的場面. 由於這裏不是電視劇中經常出現的豪華寫字樓,所以更加引人注目,因此這裏將首爾麻浦區延南洞的傢俱商店\"bplus m\". 拍攝當時劉時鎮和姜暮煙吃飯的地方雖然現在有牀位,但這裏獨有的舒適和溫暖感卻沒有改變..','首爾麻浦區聖美山路二九街23','02-336-7181','www.bplusm.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang3 values('32','CGV 弘大','姜暮煙和劉時鎮的首部電影約會成功的地方是CGV的弘大,與姜暮煙的家並不遙遠. 進行拍攝的6館在電視劇播出之後,隨着宋仲基和宋慧喬的約會場所被人們所熟知,特意前來觀看的觀衆也逐漸增多. 坐在他們坐的I106和7號坐下來等電影時,她說:\"我現在很激動. 和美女在一起\"的甜蜜的劉時鎮的臺詞似乎能生動地復活. 但是,旁邊一定會有異性坐的!雖然是同一個電影院,但是對戀人們來說,卻是能夠留下特別回憶的場所. ','首爾麻浦區楊花路153,4樓',' 1544-1122','www.cgv.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang3 values('33','Subway論峴力點','姜暮煙曾高呼\"追加巧克力庫吉套裝\"和\"滿滿的哈拉菲諾!\" 姜暮煙在《Subway》論峴站點,爲了隊友們,爲了買一抱三明治而走進去,還與劉時鎮大尉約會. 麪包,餡材料,醬汁等可以選擇的Subway的特徵在電視劇中姜暮煙的臺詞中也如實地體現出來. 雖然這家三明治賣場已經在全世界廣受歡迎,但至少可以親自去品嚐一下姜暮煙喜歡的\"除洋蔥之外含有很多哈拉菲諾的俱樂部三明治\"吧. 雖微不足道,但會成爲有趣的經驗.','首爾瑞草區江南大路535王子大廈',' 02-512-1014',' www.subwaykorea.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang3 values('34','甜咖啡良才店','《太陽的後裔》第六集中,徐大英上士和尹明珠中尉的愛情戲大放異彩. 徐大英向窗外的尹明珠伸出嘴脣自拍. 隔着玻璃窗,兩人像是親親一樣擺出各種姿勢,形成了浪漫的氛圍. 又名救援情侶的他們約會的場面是在甜蜜咖啡良才店拍攝的. 實際上,甜蜜咖啡的良才店到處都貼着太陽的後裔海報. 尋找救援情侶坐位的時間並不長. 兩人坐在座位上親切地說:\"這裏就是太陽的後裔救援情侶!如果是戀人的話,在\"救世主情侶\"的座位上親自和徐大英一起拍攝\"自拍\"也不失爲一種趣味.','首爾瑞草區江南大路27路7-21','02-529-8399','http://www.dalkomm.com/index.php')";
        db.execSQL(q);




        q= "insert into oungpal3 values('35','雙門洞','《請回答1988》中同齡的發家朋友德善和正煥,澤,善宇,東龍是雙門洞住宅區圍牆對面的鄰居. 劇中的德善是\"雙門女高\",男主人公是\"雙門高中\",實際上以雙門洞名字命名的學校只有\"雙門小學\". 只是從電視劇中映照的衚衕風景和通勤客車路線來看,兩個學校的實際模型應該是貞義女高和宣德高中.\n" +
                "從雙門站4號出口通往貞義女高的衚衕裏,眼前就能看到《請回答1988》中主人公們的身影,非常親切. 沾染着歲月流逝的洗衣店和藥店,紅磚牆的雅緻住宅聚集在一起的情景,喚起了兒時的鄉愁. \n" +
                "“今天去巴西吃炒年糕嗎?”\n" +
                "劇中,德善和朋友們經常光顧的地方是巴西炒年糕.\n" +
                " ','','','')";
        db.execSQL(q);
        q= "insert into oungpal3 values('36','互號麪食','目前巴西2016年那個位置上的炒年糕是,狹窄的女子高中前右側的臉色,就可以長時間裏,好像一個,小吃店。 這裏麪館都有一家共同推出的特色菜單,那就是\"奶酪飯\". 在撒上紫菜粉的炒飯上放了莫札雷拉奶酪,價格低廉,深受附近學生的歡迎. 不僅價格低廉,還能讓人想起學生時代.  \n','首爾市道峯區道峯路一二一街','','')";
        db.execSQL(q);
        q= "insert into oungpal3 values('37','杜麗博物館','遊覽都立博物館後,可以通過多裏公園前往北漢山環路,或者橫穿道峯區的牛耳川邊散步. 從杜麗博物館沿着雙門1洞居民中心方向走15分鐘左右,就可以見到首次發現的杜麗(水逾橋附近). 以水逾橋爲基點,歷經約150m區間,由杜麗壁畫組成,原作家金水晶(音)作家繪製壁畫草案後,德成女子大學70多名在校生和專家共同繪製. 中浪川支流中規模最大的牛耳川長約8公里,這裏不僅有杜麗壁畫,而且適合在每個季節都盛開的野花爲背景,慢慢散步. ','首爾市道峯區시루峯路1街6號','02-990-2200',' http://www.doolymuseum.or.kr/')";
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




