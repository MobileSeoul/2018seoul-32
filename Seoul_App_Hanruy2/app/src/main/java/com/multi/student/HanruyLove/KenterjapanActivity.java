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


public class KenterjapanActivity extends AppCompatActivity {
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
        q= "drop table if exists runningman2 ";
        db.execSQL(q);
        q= "drop table if exists muhandozun2 ";
        db.execSQL(q);
        q= "drop table if exists ougul2";
        db.execSQL(q);
        q= "drop table if exists nahonza2";
        db.execSQL(q);
        q= "drop table if exists bijungsang2";
        db.execSQL(q);

        q = "create table if not exists runningman2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists muhandozun2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ougul2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists nahonza2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bijungsang2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);

        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into runningman2 values('1','401（弘大）','弘大に位置する401レストランは<無限に挑戦>と<ランニングマン」で活躍している万能エンターテイナーハハが運営する済州豚肉専門店である。ジャマイカ思わせる独特のインテリアが引き立つ401レストランでは、エキサイティングなレゲエ音楽を聴きながら首肉、オギョブサル、豚皮など韓国バーベキュー料理を楽しむことができる。 <無限挑戦>の会食場所でも、多くの場合利用されることが知られており、運が良ければ（笑）を直接会うこともある。 ',' 04043ソウル麻浦区ジャンダリで23（西橋洞）','02-325-0805','')";
        db.execSQL(q);
        q= "insert into runningman2 values('2','通市場','通市場は商圏が活性化された場所に、他の伝統的な市場のベンチマーク事例として有名であり、特に通市場で自主制作した小判は通市場だけのお楽しみ距離だ。小判に両替するとともに、黒のプラスチックシクパンも受けることになる、この時からシクパンを持ち歩いて、市場のあちこちを通って食べ物を食べることができる。ただし、小判は加盟店でのみ使用可能である。','03036ソウル鍾路区紫霞門に15道18','\n" +
                "02-722-0911','http://tonginmarket.co.kr/mall/index.php')";
        db.execSQL(q);
        q= "insert into runningman2 values('3','タールティーン','ランニングマンでユ・ジェソクが聞こえたパイ家で有名なところ外でも見えるようにパイを展示して通り過ぎる人々の歩みを止めること\n" +
                "エキゾチックで独特なインテリアで飾られていて、内部には座席がゆったり多いアメリカ人シェフが直接焼い出し正統レシピこだわっている、高度なパイをアイスクリームやアメリカーノと一緒に楽しむことができている\n" +
                "1,2号店が直面している路地の両側にお店があり、2階で構成され、内部空間も広い。 ',' 04350ソウル龍山区梨泰院で23道4（梨泰院洞）','\n" +
                "02-3785-3400','http://www.tartine.co.kr/shop/main/index.php')";
        db.execSQL(q);
        q= "insert into runningman2 values('4','狂喜ファッションモール','狂喜ファッションモールは、ソウルの代表的なショッピングの中心地、一年四季不夜城を成す東大門に位置している。生産者と消費者を直接接続して、最新の流行の服を低価格で購入できる卸売専門の大型ショッピングモールである。地下1階から地上6階まで、数百の店舗で婦人服、紳士服、カジュアル、女性の衣類、子供服、スポーツウェア、皮革、毛皮など、様々な衣類やファッション商品を購入することができる。午後9時から翌日の午後5時までの夜の時間にオープンするので、ショッピング前近い東大門デザインプラザ（DDP）と清渓川、酪酸公園城の道を戻ってみるといい。\n" +
                "\n" +
                "狂喜ファッションモールは、国内ファンだけでなく、海外のファンにも多くの愛を受けているSBS芸能プログラム<ランニングマン>を介して有名になった。世界的なアクションスタージャッキー・チェンとスーパージュニアのメンバーチェ・シウォンが、ここで宝物を獲得するためのレースを行った。狂喜ファッションモールと隣接して位置する東大門デザインプラザ（DDP）は、様々な韓流ドラマと番組の撮影地として有名である。有名な建築家が設計したユニークな建築物を鑑賞しながら、質の高い文化芸術を体験することができ、歌手G-DRAGON、俳優キム・スヒョン、パク宝剣など数多くのスターたちが訪問した。 ',' 04567ソウル市中区馬場で1道21（新堂洞、狂喜ファッション水）','02-2238-4352','')";
        db.execSQL(q);


        q= "insert into muhandozun2 values('5','満腹そば屋','多おなら特集でユ・ジェソクとパク・ミョンスが心拍数を上げるためにビビン麺を食べたところである。実店舗への訪問と、当時の撮影画像とサインが飾られている。満腹そば屋は、まるで1970年代を思わせる素朴でこじんまり室内の雰囲気で清潔麺とドンドン酒、つまみ料理などを楽しむことができる。 <無限挑戦>は、心拍数のために所定の位置でランニングをし辛いビビン麺を食べる姿が電波に乗った。満腹そば屋のビビン麺と熱気を一度に上げるランニングでパク・ミョンスの心拍数110をはるかに超えることもあった。もちろんビビン麺がなくても、快適に楽しむことができる料理が多いのが満腹そば屋の利点である。日本酒とドンドン酒をはじめ、アンチョビ麺、ポッサム、海鮮チヂミ、湧き出るマン和えなどお馴染みのメニューが主をなしている。','ソウル麻浦区上岩洞214-7','02-374-6870',' www.manboknoodle.com')";
        db.execSQL(q);
        q= "insert into muhandozun2 values('6','ドゥレ呉','多おなら特集で鬼だったヤン・セヒョンとファン・グァンヒが心拍数を100以下に維持するために訪れたのがまさにドゥレウー家だ。韓牛がメインメニューが<無限に挑戦>は涼しい冷麺が主人公として登場した。ヤン・セヒョンとファン・グァンヒがすっきりスープをがオン姿だけ見てもよだれが回ったまさにそのシーン！韓国では異例の猛暑が続いていたせいで、これら冷麺を食べる姿だけ見ても自然に涼しい気分になったりした。トゥレウーは、元の農協で直営で運営する炭火焼き牛専門店である。農協から厳選した韓牛だけを選んで送るので、品質と味はどんなところよりも優れている。これらの韓牛でだしをとった冷麺ならなおさら、その味は保証されたわけだ。特にここの特徴は、おいしく焼く方法を研究して、従業員が肉を熟すまで直接焼いてくれるということ！','ソウル麻浦区ワールドカップ北路356','02-374-9255',' www.doorewooga.co.kr')";
        db.execSQL(q);
        q= "insert into muhandozun2 values('7','ドメプ群','\n" +
                "ハハとチョン・ジュナが心拍数を高めるために走って行ったのは、まさに新村の辛いカルビチムの専門店である。よりメプグンの辛い所カルビチムは段階的に辛さを選択することができ、当面のトッポッキつじつまが無料で補充されてボリュームたっぷりの量を食べることができる。辛味を中和するためのチーズトッピングとチーズチャーハン、茶碗蒸しもサイドメニューで構成されている。辛い食べ物が苦手な人は、最も弱い段階の料理をさせておにぎりや茶碗蒸しと一緒に食べればいい。ちなみに多おなら特集で心拍数を100以上維持しなければならいた逃亡者ハハとチョン・ジュナは最も辛いカルビチムを食べた。汗をだらだら流しカルビチムを吸引する母とチョン・ジュナの姿を見ると、自然に口に唾液が溜まる。 ','ソウル西大門区延世大で5覚める37','02-323-5574','http://kprince.fordining.kr/')";
        db.execSQL(q);
        q= "insert into muhandozun2 values('8','MBC WORLD','文化放送MBCが上岩洞DMC団地に移転し、既存の放送局見学プログラムを進化させた、国内初の放送テーマパークMBCワールドを披露した。訪問者は、MBCドラマや人気芸能プログラムの主人公になって高度な技術で実装されたさまざまな体験と映像観覧を楽しみ、実際の番組制作の現場に直面することができる。 MBC建物の外部には、現在放送中の番組がメディアボードを介して放送され、スターたちのハンドプリンティングと実物大の写真が展示されている。建物の中ではMBCの歴史体験、ホログラムシアターで楽しむGDとサイの公演、ダンス体験スタジオ、バーチャルリアリティ体験スペース、トリックアートフォト月には、さまざまなアトラクション体験が設けられている。 4階ではチャングムの誓い、奇皇后などのドラマを再現した撮影セット場で時代劇の衣装を着て見ることができ、7階MBC報道局の現場では、実際にニュース制作過程を察してアンカー体験を試みることができる。 MBCワールドツアーは、毎日9回、予約制で運営されておりガイドと一緒に合計90分間進行される.\n" +
                "\n" +
                "大韓民国最初の放送テーマパーク、MBCワールドでは、韓流ドラマと芸能コンテンツを中心にスターと一緒に踊って歌って、ドラマの中の主人公になってみるの特別な体験を楽しむことができる。バーチャルリアリティ体験、ダンス体験スタジオ、ホログラム舞台など先端技術を動員した体験が観光客に特に人気だ。ツアーが終わったら、韓流スターたちの歓迎の挨拶とデジタルサイネージも受けることができる。実際に「ショー！音楽中心」、「無限挑戦」、「ラジオスター」のような人気番組がMBCグローバルメディアセンターで製作されており、韓流スターたちとの意外な出会いを期待みることができる.','03925ソウル麻浦区ソンアムで267（上岩洞、（株）文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);



        q= "insert into ougul2 values('9','MBC WORLD','文化放送MBCが上岩洞DMC団地に移転し、既存の放送局見学プログラムを進化させた、国内初の放送テーマパークMBCワールドを披露した。訪問者は、MBCドラマや人気芸能プログラムの主人公になって高度な技術で実装されたさまざまな体験と映像観覧を楽しみ、実際の番組制作の現場に直面することができる。 MBC建物の外部には、現在放送中の番組がメディアボードを介して放送され、スターたちのハンドプリンティングと実物大の写真が展示されている。建物の中ではMBCの歴史体験、ホログラムシアターで楽しむGDとサイの公演、ダンス体験スタジオ、バーチャルリアリティ体験スペース、トリックアートフォト月には、さまざまなアトラクション体験が設けられている。 4階ではチャングムの誓い、奇皇后などのドラマを再現した撮影セット場で時代劇の衣装を着て見ることができ、7階MBC報道局の現場では、実際にニュース制作過程を察してアンカー体験を試みることができる。 MBCワールドツアーは、毎日9回、予約制で運営されておりガイドと一緒に合計90分間進行される.\n" +
                "\n" +
                "大韓民国最初の放送テーマパーク、MBCワールドでは、韓流ドラマと芸能コンテンツを中心にスターと一緒に踊って歌って、ドラマの中の主人公になってみるの特別な体験を楽しむことができる。バーチャルリアリティ体験、ダンス体験スタジオ、ホログラム舞台など先端技術を動員した体験が観光客に特に人気だ。ツアーが終わったら、韓流スターたちの歓迎の挨拶とデジタルサイネージも受けることができる。実際に「ショー！音楽中心」、「無限挑戦」、「ラジオスター」のような人気番組がMBCグローバルメディアセンターで製作されており、韓流スターたちとの意外な出会いを期待みることができる.','03925ソウル麻浦区ソンアムで267（上岩洞、（株）文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into ougul2 values('10','雪氷新林2号店','雪氷はティラミスかき氷、マンゴーチーズかき氷など多彩なトッピングをのせたかき氷と餅トースト、チーズトッポッキピザなど、ユニークなレギュラーくちばしを販売しているデザートカフェだ。雪氷新林2号店は音楽活動はもちろん、俳優としても活躍しているシエンブルーのメンバーイ・ジョンヒョンが運営している所で、イ・ジョンヒョンが<私たち結婚しました>で仮想カップルの俳優球スンヨンとデートを楽しんだところでもある。イ・ジョンヒョンの直筆サインと彼のパフォーマンスの写真が展示されている。','08760ソウル冠岳区新林で353（新林洞）2階','02-882-9080','http://sulbing.com/')";
        db.execSQL(q);
        q= "insert into ougul2 values('11','マボクリム祖母息子はいトッポッキ','赤いトッポッキの元祖新堂洞トッポッキを作った馬ボクリム祖母の嫁が秘法を伝授され、運営するトッポッキ専門店である。新堂洞トッポッキタウン内に位置している。人気が多くなって、最近では宅配便送料サービスも提供しています。','04611ソウル特別市中区多産で221（新堂洞）','02-962-8288','http://mabokrim.subnara.info/')";
        db.execSQL(q);
        q= "insert into ougul2 values('12','蚕室カート体験場','蚕室カート体験場は蚕室にあるカート体験場で、老若男女誰も運転免許がなくてもモータースポーツを通じた健全な趣味を楽しむことができるところである。芸能番組<私たち結婚しました>撮影地としても利用された。毎週月曜日、イベントや雨天時休業する。祝日には、正常に営業する。','\n" +
                "05500、ソウル松坡区オリンピックで25（蚕室洞、ソウル総合運動場）','02-420-3886','http://www.birel.kr/?act=main')";
        db.execSQL(q);
        q= "insert into ougul2 values('13','よりスパインガーデンファイブ','ホテル級サウナとショッピング、娯楽施設などを備えた大型チムジルバン。ドラマで見た韓国のお風呂文化も楽しんで、旅行の疲れも解消することができる。 ','ソウル松坡区チュンミンで10ガーデンファイブツール','02-404-2700','http://www.spagarden5.co.kr/')";
        db.execSQL(q);






        q= "insert into nahonza2 values('14','MBC WORLD','文化放送MBCが上岩洞DMC団地に移転し、既存の放送局見学プログラムを進化させた、国内初の放送テーマパークMBCワールドを披露した。訪問者は、MBCドラマや人気芸能プログラムの主人公になって高度な技術で実装されたさまざまな体験と映像観覧を楽しみ、実際の番組制作の現場に直面することができる。 MBC建物の外部には、現在放送中の番組がメディアボードを介して放送され、スターたちのハンドプリンティングと実物大の写真が展示されている。建物の中ではMBCの歴史体験、ホログラムシアターで楽しむGDとサイの公演、ダンス体験スタジオ、バーチャルリアリティ体験スペース、トリックアートフォト月には、さまざまなアトラクション体験が設けられている。 4階ではチャングムの誓い、奇皇后などのドラマを再現した撮影セット場で時代劇の衣装を着て見ることができ、7階MBC報道局の現場では、実際にニュース制作過程を察してアンカー体験を試みることができる。 MBCワールドツアーは、毎日9回、予約制で運営されておりガイドと一緒に合計90分間進行される.\n" +
                "\n" +
                "大韓民国最初の放送テーマパーク、MBCワールドでは、韓流ドラマと芸能コンテンツを中心にスターと一緒に踊って歌って、ドラマの中の主人公になってみるの特別な体験を楽しむことができる。バーチャルリアリティ体験、ダンス体験スタジオ、ホログラム舞台など先端技術を動員した体験が観光客に特に人気だ。ツアーが終わったら、韓流スターたちの歓迎の挨拶とデジタルサイネージも受けることができる。実際に「ショー！音楽中心」、「無限挑戦」、「ラジオスター」のような人気番組がMBCグローバルメディアセンターで製作されており、韓流スターたちとの意外な出会いを期待みることができる.','03925ソウル麻浦区ソンアムで267（上岩洞、（株）文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);
        q= "insert into nahonza2 values('15','望遠市場','望遠市場は、他の伝統的な市場と大きく変わらないが、「重いワン市場」と呼ばれるほど<私一人住んでいる>でよく登場して話題を集めたことがある。どっしりワンをはじめ、カン・ミンヒョク、キム・ジョンミンなど数多くの芸能人が訪れ親指を振り上げた食べ物店舗が集まっているが、列に並んで待たなければなら「キュスダルガンジョン」を皮切りに、たった3,000ウォンにボリュームたっぷり麺を出す「綾巻きカルグクス」などがその主人公だ。手頃な価格で心強く一食の食事を解決し、伝統的な市場口径まで楽しむことができて一石二鳥だ。','ソウル市麻浦区ポウン8道14','02-335-3591',' https://mangwonsijang.modoo.at')";
        db.execSQL(q);
        q= "insert into nahonza2 values('16','鞍山','最長寿アイドルグループ「神話」出身であり、ユーモラスで堅実なイメージで多くの愛を受けているキム・ドンワンは「私一人住んでいる>でも一人暮らし法の真髄を見せてくれるメンバーだ。様々な趣味を持つ彼のマウンテンバイクを集めて現れたのは、西大門区に位置する山である。鞍山は海抜295.9mで地形が高くなく、車椅子やベビーカーを利用して、快適な散歩を楽しむことができるようバリアフリー裾の長さ造成されており、約2時間半ほどで十分な車輪を回すことができる。山に向かう登山口はムアクジェ、独立門、西大門自然史博物館などの都心に近い複数箇所位置している。緩やかなトレイルを歩いているとメタセコイア道など、美しい自然の風景がソウルの真ん中であることを忘れほど美しい景色が続いた','ソウル市西大門区延禧洞一帯','02-330-1958','  http://www.sdm.go.kr/educate/naturepark.do?mode=view&sdmBoardSeq=379')";
        db.execSQL(q);
        q= "insert into nahonza2 values('17','望遠漢江公園','私一人住んでいるに出演した人気ロックバンドのバラ旅館のボーカル製材ワンはマンウォンドン近くの屋根裏部屋に住んでいる自他共に認めるマンウォンドン最古参である。ある日どっしりワンは作曲のインスピレーションを見つけるためにギターを担いで家の近くの望遠漢江公園に向かう。私一人公園一方でぼんやり座って創作の疲れてだるさを吐露していた彼は、通常の美しい声で即興バスキングを披露し、市民を喜ばせた。','ソウル特別市麻浦区麻浦ナル道467','02-3780-0601',' http://hangang.seoul.go.kr/archives/3565')";
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




