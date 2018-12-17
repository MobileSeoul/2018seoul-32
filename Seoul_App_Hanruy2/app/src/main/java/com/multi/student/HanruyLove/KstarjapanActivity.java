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


public class KstarjapanActivity extends AppCompatActivity {
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
        q= "drop table if exists bigbang2 ";
        db.execSQL(q);
        q= "drop table if exists exo2 ";
        db.execSQL(q);
        q= "drop table if exists bts2";
        db.execSQL(q);
        q= "drop table if exists blackpink2 ";
        db.execSQL(q);
        q= "drop table if exists twice2";
        db.execSQL(q);
        q= "drop table if exists redvelvet2";
        db.execSQL(q);
        q= "drop table if exists psy2";
        db.execSQL(q);
        q= "drop table if exists wannaone2";
        db.execSQL(q);
        q= "drop table if exists superjunior2";
        db.execSQL(q);
        q= "drop table if exists dongbangsingi2";
        db.execSQL(q);




        q = "create table if not exists bigbang2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists exo2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bts2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists blackpink2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists twice2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists redvelvet2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists psy2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists wannaone2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists superjunior2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dongbangsingi2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into bigbang2 values('1','YGショップ','YGショップはビッグバン、サイ、2NE1など韓流スターが所属しているYGエンターテイメントのロゴと所属歌手をモチーフに製作された商品を展示して販売する店である。ロッテヤングプラザ（明洞店）編集売り場内にブースの形で入店して所属歌手CD、衣服、文房具、写真アルバムなど、さまざまな商品を見ることができる。','100-092  ソウル特別市中区南大門路67（南大門路2が） ','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang2 values('2','YGエンターテイメント','YGエンターテイメントは、国内の代表的な芸能企画社の一つで、ビッグバン、サイ、ウィンナー、アイコン、黒、ピンク、エピックハイ、カン・ドンウォン、イ・ジョンソクなどの所属事務所である。麻浦区合井洞に位置している社屋はユニークで洗練された外観デザインが特徴である。合井駅8番出口を利用すれば、よりアクセスしやすい。 ',' 04028ソウル麻浦区希友情で1道3（YGエンターテイメント） ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang2 values('3','三叉路肉屋セントラルシティ店','YGエンターテイメントが運営する焼肉店では、最近の弘大でセントラルシティに拡張移転した。ビッグバンの勝利で、サンダラ・パクなどYG所属芸能人だけでなくイ・スンギ、イ・ソジンなど人気芸能人らも訪れた。ウィンナーなどYG所属アーティストたちがここで頻繁にパーティーを開くこともないと。壁にかかった芸能人らの記念写真やサインを探してみる面白味もかなりある。\\ n \"+\n" +
                "                「桁は変わったが、味は終始一貫している。代表メニュー豚カルビは肉厚の厚さを誇り、刺激的ではない、ほのかな甘さが人気の要因。韓牛で味をつけたスープに、あっさりそば面を表わした平壌冷麺、濃い味が一品ある韓牛味噌言葉ご飯も美味しい。 ',' 06545ソウル瑞草区四平通り205（盤浦洞、CENTRALCITY半フォーチュン覆蓋駐車場）','02-6052-0103','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into bigbang2 values('4','エンドヒア','ベルギーのリエージュ地域のワッフルを直輸入、販売しているアンド・ヒアはビッグバンメンバー勝利の母が運営する大学路ワッフルグルメだ。長時間の発酵過程を経て作る本格ベルギーワッフルは外はカリカリしながらも、中はしっとりして、何のトッピングがなくても、それ自体でもっちりした食感と豊かな風味を誇る。ワッフル以外にも、ピザとビール、ソフトコーヒーと世界の多くの国の様々なことが製茶、ワインも楽しむことができる。モダンながらも洗練されたインテリアの広い売り場に屋外テラスを含めて、様々なテーブルを配置してゆったり快適な休息を提供する。店頭2階では、インディーズバンドなどの小規模公演も繰り広げられる。\\ n \"+\n" +
                "                \"\\ n\" +\n" +
                "                ビッグバン勝利母のワッフルカフェでよく知られているアンド・ヒアは、舞台芸術のメッカ、大学路に位置してビッグバンのファンはもちろん、国内外の観光客の足が絶えない韓流スポットのひとつだ。ここを訪れた多くのスターたちが残したサインカップを見て楽しいもある。 ',' 03085ソウル鍾路区トンスン道90（東崇洞） ','02–744-8464','http://andhere.co.kr/')";
        db.execSQL(q);
        q = "insert into bigbang2 values('5','アオリラーメン','それぞれのメンバーが様々な分野でその魅力を増しているビッグバン。その中の勝利は、「アオリの行方不明」という名前の日本のラーメン店を運営している。日本で有名なラーメン家は多行っアトウルほどラーメンマニアの勝利が日本で親交を積んだシェフたちと一緒にレシピを開発した。そのように誕生したアオリラーメンがメインメニュー。 5つの基本的な有名（チャーシュー、アジアンたまご、ネギ、メンマ、のり）が上がったアオリラーメンと2つの有名（チャーシュー、ネギ）が上がったアオリラーメンライトがある。アオリラーメンは豚骨スープを出したとんこつラーメンに属しており、濃く深い味わいが誰食べても「親指チャック」をするほど味が一品である。豚ヌリンネが全くなく、辛くながら香ばしい味が年長にもちょうどいい\n" +
                "和風醤油ギェランバプのTKGも美味しい。温かいご飯の上に私を卵黄と有名を上げ肝臓に混ぜて食べる料理で、アオリラーメンの濃いスープと一緒に食べると、さらに訴えている。一人ずつ座る日本特有の畳席ありホンバプ、ホンスルにもぴったり。まさに階下の「ミルタン屋台」は、歌手チョ\u200B\u200Bン・ジュニョンが運営する、実際にチョン・ジュニョンをはじめ、FTアイルランドメンバー、俳優ハ・ソクジンがアオリラーメンをよくして下さい。\n','\n" +
                "06014ソウル市江南区島山大路57道7（チョンダムドン）3階','02-518-3767','http://www.ygfamily.com/')";
        db.execSQL(q);




        q= "insert into exo2 values('6','あまねく','EXOのメンバーディオが某雑誌に推薦されたレストラン。ディオのほかシウミン、セフンなどEXOメンバーがよく探すには清潭に位置し、このレストランは、大韓民国のレストランガイドブックである<ブルーリボンサーベイ」でブルーリボンを3つも受けたほど平易いい。\n" +
                "すっきり清潔な雰囲気を誇るこのレストランの人気メニューは、ビデオが推薦したタコ炒めとおにぎりだ。きちんと辛いタコ炒めと一緒に口の中を快適にリラックスさせてくれる香ばしいおにぎり、直接浸すはおいしそうなおかずの組み合わせが一品であるここに推薦するメニューがもう一つありますが、すぐに紫いもマッコリだ。バルグスレた頬のように綺麗な色を帯びるが紫サツマイモマッコリはタコ炒めとし、このようお客様が頻繁に訪れる。','06064ソウル江南区宣陵で148道28（チョンダムドン）','02-3443-8834','')";
        db.execSQL(q);
        q= "insert into exo2 values('7','ビバポロ実点','ビバポロ実点は美味しいイタリアンレストランで有名たりするが、それよりは、グループEXOのメンバーであるチャン列母が運営される飲食店でより有名である。最も人気のあるメニューは、キムチアラビア取ってきてピザの種類である。','05257江東区クチュール通り1631の2階','02-442-7885','')";
        db.execSQL(q);
        q= "insert into exo2 values('8','SMTOWNコエックスアーティウム','全世界のK-popファンたちならば分からないことができないSMエンターテイメントの複合文化空間であるSMTOWNコエックスアティウム。特に「SMTOWNミュージアム」と超高画質電光掲示板」SMTOWN外壁メディア」が2018年5月にドアを開けて、高い関心を集めている。\n" +
                "3階に位置するSMTOWNミュージアムは、エンターテイメント企業としては初めて、SMエンターテイメント所属アーティストたちの誕生と成長過程を集大成した空間である。音楽アルバム、活動の様子、衣装や小物、ビハインドストーリーなどを鑑賞することができる「SM ARCHIVE」（SMアーカイブ）、「SPECIAL EXHIBITION」（スペシャルアキシアルビション）、「ARTIST GALLERY」（アーティストギャラリー）など、様々な展示がありている。また、SMコンテンツ制作過程観戦、拡張現実（AR）、VRなどの新技術を活用したSMのアーティストとの仮想出会いなど、K-popファンにさまざまな経験と楽しさをプレゼントしている。 \n" +
                "\n" +
                "SMTOWN外壁メディアはバスケットボールコート4倍もの大きさで、国内最大規模だ。そのため、「韓国のタイムズスクエア」というニックネームが付くほど。ここで、K-popミュージックビデオだけでなく、リアルタイムのマルチライブ放送チャンネル「！t Live（イットライブ）」などが生中継される。\n" +
                "5〜6階には、国内最大のホログラムシアターがあります。 SM所属アーティストのコンサート映像が主上映されるが、まだDVDで発売されていないコンサートが上映されることもある。上映スケジュールをチェックすること！他にもアーティストが実際に着用したり、選んだアイテムなどを購入することができるギフトショップ（2階）、カフェとSMアーティストのイメージを盛り込んだ様々な商品を販売しているマーケット（4階）などがある。','06164ソウル市江南区永東大路に513（三成洞、コエックス）','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);




        q= "insert into bts2 values('9','小人キャンプ','新沙駅8番出口から少し歩くと、人目を引く店があります。右のWeb芸能 美男ブロマンスで神話イ・ミヌが防弾少年団政局を連れて行ったキャンプのコンセプトの焼肉屋小人キャンプ。あちこちに用意されたテントと地面に敷かれている砂利が本当にキャンプ場に来たような気にさせている。セットメニューを注文すると、肉とソーセージ、湯の種類を一度に味わうことができる。香ばしくて柔らかい肉を楽しむカルカルハンキムチ鍋に口直しをする既にキャンプ場の真ん中にいる感じ！ \n" +
                "ちなみにイ・ミヌと政局が座った席は窓際の左側に位置している。防弾少年団と神話のファンに人気が非常に多いから、ここに座ってするには、タイミングが重要である。','\n" +
                "06034ソウル市江南区江南大路158道27（新沙洞）','02-3443-6466','https://nanjangcampgarosu.modoo.at/')";
        db.execSQL(q);
        q= "insert into bts2 values('10','Addicted','エディヒテッドは高シャルブチンスキー、OUR LEGACY、LEMAIRE、KITSUNE、タプメンなど、様々なブランドを一目で見ることができる輸入衣料編集ショップである。最近ジェックスキス、シャイニーテミンとキー、ビツビ、ロコ、ツリーワイス・チェヨン、防弾少年団など国内スターらがエディヒテッドの製品を身に着けていた。','\n" +
                "06018ソウル市江南区宣陵で155道24 ','02-547-7332','http://www.addicted.kr/')";
        db.execSQL(q);
        q= "insert into bts2 values('11','よりミンス','\n" +
                "2AMとオムの感性ボーカリストチャンミンの母が運営するカフェで、チャンミンが頻繁とどまるところである。夏場は涼しい手作りエイドやアイスクリームなどが、冬にはライム、レモンショウガ、アップルシナモンなどの定性いっぱい有機車人気メニューだ。韓流ファンのための英語、日本語、中国語で記載されたメニュー版が用意されている。\n" +
                "\n" +
                "\n" +
                "人気アイドルグループ防弾少年団のメンバーがお気に入りの場所では、防弾少年団のTwitterを使って認証ショットが話題になったことがある。よりミンスの防弾少年団のメンバーたちの愛情あふれるメッセージを探してみよう！','\n" +
                "\n" +
                "06018ソウル江南区鴨鴎亭で330（新沙洞）1階112号','02-512-1452','')";

        db.execSQL(q);



        q= "insert into blackpink2 values('12','気持ちのままにフォンケース','ブラックピンクも行っていくほど楽しい異色体験が待っているところ。すぐには、携帯電話ケースを必要に応じて作ってみることができる気持ちのままフォンケース弘大店である。色とりどりのアクセサリーの好みを選び、一方に位置する快適な座席に座っている世の中にただ一つだけの携帯電話ケースを作成する。フレンドリーなスタッフが常駐して方法を案内してくれる。カフェも一緒に運営する。','\n" +
                "ソウル麻浦区ワウ山に19道21','02-322-6682',' http://www.nemamke.com')";
        db.execSQL(q);
        q= "insert into blackpink2 values('13','ノーラッシュ','\n" +
                "ブラックピンクメンバージェニーがSNSのアカウントに写真を掲載して話題になったところ。 「良い」ことができ、50だけを記録して空間に関する疑問を誘発した。植物とヴィンテージ家具で装飾された室内は、「急いでない（No Rush）」という名にふさわしくリラックスした雰囲気を提供する。代表メニューはラザニアと洋風朝食だ。適当に熟した数の概要とアスパラガス、ジャガイモピューレ、ベーコン、サラダが一緒に出てくるメニューは心強い朝食兼昼食になる。ソフトラザニアに牛肉で作った風味深いトマトソースが調和したロゼミートソースのラザニアもオススメのメニューだ。 ','ソウル麻浦区同校で30道17','010-7678-7728','')";
        db.execSQL(q);
        q= "insert into blackpink2 values('14','ドアシャーエルキューブ弘大店','実力的にも、外観にも大勢、ブラック、ピンクの化粧法に追いつきたい？ムンシャトエルキューブ弘大店に行こう。リサ、ロゼ、ジェニー、指数が直接使用するメイクアップ製品を会ってみることができる。さまざまな基礎と色調化粧品を備えているが、そのうちの「クリームペイントライトピット」ティントは、ブラック、ピンク、ファンに最も人気のある製品の一つである。自然で多様な色にさわやかな使用感が加わり、今最も「ホット」な彼女たちの化粧法を完成することができる。','ソウル麻浦区弘益で6道4','02-326-5656','https://moonshot-cosmetics.com/ko/board/off-line-store/13')";
        db.execSQL(q);
        q= "insert into blackpink2 values('15','三叉路肉屋','弘大に多く多くの肉家の中でブラック・ピンクの選択を受けたのは三叉路肉屋。洗練された広々とした空間で良質の韓国式バーベキューを楽しむことができる。ブラックピンクが好きなメニューはYGファミリーセットだ。様々な部位の肉を割引価格で味わうことができ、譲渡盛り沢山である。ここの肉は肉厚で新鮮なのが特徴。素敵にレトロの紙に包まれて出てくる。一緒に出てくる「メルジョト」につけて食べるとコクが一品である。ブラック・ピンクのファンならホップの苦み香り魅力的なビール、「YGラガー」を添え勝つ推薦する。店頭壁面にメンバーたちの直筆サインも多い。 ','ソウル麻浦区ワウ山に72','02-337-3892',' http://www.instagram.com/3geori_butchers')";
        db.execSQL(q);



        q= "insert into twice2 values('16','JYPエンターテイメント','JYPエンターテイメントは、国内の代表的な芸能企画社の一つで、ワンダーガールス、2AM、2PM、ミスエイ、GOT7、ツリーワイスなどの所属事務所である。 JYP社屋近くには、キューブエンターテイメント、SMエンターテイメント新社屋、FNCエンターテイメント、韓流スターたちのアートトイがインストールされケイスターロード（K-starroad）がある。','06012ソウル江南区鴨鴎亭で79道41（チョンダムドン）','02-3438-2300','http://www.jype.com/')";
        db.execSQL(q);
        q= "insert into twice2 values('17','ドゥレ韓食堂','60年余り前慶南密陽で開業して以来、仁寺洞で2代にわたって命脈を受け継いできた有名韓定食レストランです。旬の食材で作られた清潔ですっきりした韓定食コースとアラカルトを提供する。韓国料理が慣れていない外国人観光客であれば、グリルで焼いたトッカルビメニュー、山菜ビビンバ盤上等を推薦する。\n" +
                "\n" +
                "\n" +
                "歌謡番組「人気歌謡> MCで活躍中の美女姉妹、俳優、ボールスンヨンと人気ガールズグループアップデートワイスの方形の父親であるユチャンジュンシェフが活動している韓国食堂である。ユチャンジュンシェフは、ソウルの有名ホテルで20年以上のキャリアを積んだ実力派シェフとして知られている。','05551、ソウル松坡区オリンピックで300（新川洞）ロッテ百貨店アベニューエルワールド波タワー店6F','02-3213-2638','')";
        db.execSQL(q);
        q= "insert into twice2 values('18','そのストリート','俳優イ・ジョンジンが運営するブランチカフェで、有名芸能人がお気に入りの場所として有名である。キムチピラフと大理石の味噌パスタなどのフュージョン料理が人気であり、バジルペーストのクリームパスタは新鮮なセブンのメンバージャクソンが好きなメニューと呼ばれる。そのほかにも、俳優カン・ソラとパク・ハンビョル、ツリーワイスのチュウィなどが頻繁に訪れることが知られている。居心地の良い雰囲気で施されており、静かな雰囲気の中で食事を楽しむことができ、夜の時間には、ほのかな照明に変わって、昼とは違った雰囲気を感じることができる。','06013ソウル市江南区島山大路529（チョンダムドン、KRAプラザ）','02-547-8898','')";
        db.execSQL(q);




        q= "insert into redvelvet2 values('19','SM社屋','SMエンターテイメントは、国内の代表的な芸能企画社の一つで、BoA、少女時代、スーパージュニア、シャイニー、エキソ、赤ベルベットなど韓流スターらの所属事務所である。社屋は江南区清潭洞にある。社屋地下1階にあるSUMマーケットでは、SM所属アーティストと様々なアーティストとのコラボレーションで作られた作品を販売する.','06012ソウル市江南区宣陵で190道114（チョンダムドン）','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into redvelvet2 values('20','SMTOWNコエックスアーティウム','\n" +
                "全世界のK-popファンたちならば分からないことができないSMエンターテイメントの複合文化空間であるSMTOWNコエックスアティウム。特に「SMTOWNミュージアム」と超高画質電光掲示板」SMTOWN外壁メディア」が2018年5月にドアを開けて、高い関心を集めている。\n" +
                "3階に位置するSMTOWNミュージアムは、エンターテイメント企業としては初めて、SMエンターテイメント所属アーティストたちの誕生と成長過程を集大成した空間である。音楽アルバム、活動の様子、衣装や小物、ビハインドストーリーなどを鑑賞することができる「SM ARCHIVE」（SMアーカイブ）、「SPECIAL EXHIBITION」（スペシャルアキシアルビション）、「ARTIST GALLERY」（アーティストギャラリー）など、様々な展示がありている。また、SMコンテンツ制作過程観戦、拡張現実（AR）、VRなどの新技術を活用したSMのアーティストとの仮想出会いなど、K-popファンにさまざまな経験と楽しさをプレゼントしている。 \n" +
                "\n" +
                "SMTOWN外壁メディアはバスケットボールコート4倍もの大きさで、国内最大規模だ。そのため、「韓国のタイムズスクエア」というニックネームが付くほど。ここで、K-popミュージックビデオだけでなく、リアルタイムのマルチライブ放送チャンネル「！t Live（イットライブ）」などが生中継される。\n" +
                "\n" +
                "5〜6階には、国内最大のホログラムシアターがあります。 SM所属アーティストのコンサート映像が主上映されるが、まだDVDで発売されていないコンサートが上映されることもある。上映スケジュールをチェックすること！他にもアーティストが実際に着用したり、選んだアイテムなどを購入することができるギフトショップ（2階）、カフェとSMアーティストのイメージを盛り込んだ様々な商品を販売しているマーケット（4階）などがある。','06164ソウル市江南区永東大路に513（三成洞、コエックス）','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into redvelvet2 values('21','SUMマーケット','SMアーティストのすべてを満たすことができるところ。 SMエンターテイメントの社屋である「SMコミュニケーションセンター」が韓流ファンたちの新しいアジトとなった。社屋1階のSUMカフェと地下1階「SMコンビニ」とも呼ばれるSUMマーケットがオープンしたからだ。 「東方神起トリュフチョコレート」、「スーパージュニアラーメン」などの食料品とSMアーティストのブランドを組み合わせた様々なMD商品を販売している.','06084ソウル市江南区サムソンに648（三成洞）','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);



        q= "insert into psy2 values('22','グレバンミュージアム','133年の歴史の世界的なフランスの蝋人形専門博物館であるグレバンミュージアム（MuséeGrévin）がソウル乙支路にアジアで初めて開館した。グレバンミュージアムには、ジョン・レノン、マリリン・モンローなどの世界的な有名人と一緒にサイ、Gドラゴンなど、韓流スター、そして世宗大王、李舜臣将軍など韓国を代表する歴史上の人物など総80個の蝋人形が展示される。各展示スペースは、それぞれのコンセプトやテーマを持って特別なセットと照明で構成されており、リアルサウンドで満たされている。観覧客はスターたちと自由に写真を撮ることができるのはもちろん、最先端の技術が実装された複数インタラクティブなゲームを体験することができる。このように、グレバンミュージアムのみの高品位展示スペースは、世界最高水準の蝋人形と一緒に観覧客に時間と空間を超越する素晴らしいです鮮やかな体験を提供するものである。','04523ソウル中区乙支路23（乙支路1が、乙支路別館）','02-777-4700','http://www.grevin-seoul.com/ko/')";
        db.execSQL(q);
        q= "insert into psy2 values('23','YGショップ','YGショップはビッグバン、サイ、2NE1など韓流スターが所属しているYGエンターテイメントのロゴと所属歌手をモチーフに製作された商品を展示して販売する店である。ロッテヤングプラザ（明洞店）編集売り場内にブースの形で入店して所属歌手CD、衣服、文房具、写真アルバムなど、さまざまな商品を見ることができる。','\n" +
                "100-092ソウル特別市中区南大門路67（南大門路2が） ','02-2118-5240','http://www.ygfamily.com/')";
        db.execSQL(q);
        q = "insert into psy2 values('24','YGエンターテイメント','YGエンターテイメントは、国内の代表的な芸能企画社の一つで、ビッグバン、サイ、ウィンナー、アイコン、黒、ピンク、エピックハイ、カン・ドンウォン、イ・ジョンソクなどの所属事務所である。麻浦区合井洞に位置している社屋はユニークで洗練された外観デザインが特徴である。合井駅8番出口を利用すれば、よりアクセスしやすい。 ',' 04028ソウル麻浦区希友情で1道3（YGエンターテイメント） ','02-3142-1104','http://www.ygfamily.com/')";
        db.execSQL(q);
        q= "insert into psy2 values('25','MBC WORLD','文化放送MBCが上岩洞DMC団地に移転し、既存の放送局見学プログラムを進化させた、国内初の放送テーマパークMBCワールドを披露した。訪問者は、MBCドラマや人気芸能プログラムの主人公になって高度な技術で実装されたさまざまな体験と映像観覧を楽しみ、実際の番組制作の現場に直面することができる。 MBC建物の外部には、現在放送中の番組がメディアボードを介して放送され、スターたちのハンドプリンティングと実物大の写真が展示されている。建物の中ではMBCの歴史体験、ホログラムシアターで楽しむGDとサイの公演、ダンス体験スタジオ、バーチャルリアリティ体験スペース、トリックアートフォト月には、さまざまなアトラクション体験が設けられている。 4階ではチャングムの誓い、奇皇后などのドラマを再現した撮影セット場で時代劇の衣装を着て見ることができ、7階MBC報道局の現場では、実際にニュース制作過程を察してアンカー体験を試みることができる。 MBCワールドツアーは、毎日9回、予約制で運営されておりガイドと一緒に合計90分間進行される.\n" +
                "\n" +
                "大韓民国最初の放送テーマパーク、MBCワールドでは、韓流ドラマと芸能コンテンツを中心にスターと一緒に踊って歌って、ドラマの中の主人公になってみるの特別な体験を楽しむことができる。バーチャルリアリティ体験、ダンス体験スタジオ、ホログラム舞台など先端技術を動員した体験が観光客に特に人気だ。ツアーが終わったら、韓流スターたちの歓迎の挨拶とデジタルサイネージも受けることができる。実際に「ショー！音楽中心」、「無限挑戦」、「ラジオスター」のような人気番組がMBCグローバルメディアセンターで製作されており、韓流スターたちとの意外な出会いを期待みることができる.','03925ソウル麻浦区ソンアムで267（上岩洞、（株）文化放送)','02-789-3705','http://mbcworld.imbc.com/')";
        db.execSQL(q);




        q= "insert into wannaone2 values('26','K212','ワーナー員が所属している企画会社YMCエンターテイメント1階にはカフェK212が位置している。地下にある練習室で練習を終えたり、休憩を取るとき頻繁に訪れると言う。 K212は果物ジュース、コーヒー、かき氷、ケーキなどのデザート、ピザ、パスタ、ワインなどのブランチとディナーを楽しむことができるカフェ兼レストランだ。アンティークでありながらスタイリッシュな印象のカフェ内部のあちこちにワーナー員の写真とサインが調和かかっている。','ソウル龍山区绿莎坪通り26道36',' 02-749-2954','')";
        db.execSQL(q);
        q= "insert into wannaone2 values('27','ジェニーハウス','舞台の上では、男性美を、ステージの下では、かわいい男の子米を洗い流すワーナーウォンの中心川ダニエルのメイクの秘訣は何だろうか？眺めてみても、目が光ってトゥインといってファンの間で「犬アンズ」というニックネームを持つメンバー皇民県翁声優の彫刻のような容貌をさらに輝かせてくれるメイクアップの秘訣も気にならジェニーハウス清潭ヒルを訪れてみよう。ワーナーウォンのメイクを担当しているジェニーハウスは、ソウルの代表美容サロンで多くの韓流スターたちが訪れる場所。外国人のためのメイクアップとヘアの専門家が髪と化粧を毎タッチの1：1メイクオーバースタイリングや観光客が直接個人の化粧品を持参してメイクアップのノウハウを学ぶことができるメイクオーバークラスを独自の運営している。ジェニーハウスホームページを通じて事前予約が必須だ。英語と中国語が可能な通訳マネージャーが常時待機していると、外国人だけで訪れても心配がない。  ','ソウル市江南区宣陵で146道56','02-541-7788','http://jennyhouse.co.kr/en/')";
        db.execSQL(q);
        q= "insert into wannaone2 values('28','レドィプルラ','180cmを超えるすらりとした鍵、ルックスと愉快な性格を兼ね備えた川ダニエルと瓮城泣いファンにオンニェルコンビと呼ばれるほどワーナーウォンでも特に仲が良い。私的にもカフェやグルメを一緒に持ち歩けるほど懇意これらデビュー前から訪れたレストランが梨泰院のフレンチグルメレドィプルラダ。これらテラス席に楽しんで座るために、ファンはこの席を翁ニェルソクと呼ぶ。これら食べメニュー、スパイシーシュリンプロゼパスタと安心ステーキ、みどりシャワーとピッチクラッシュもオンニェルセットという愛称がつくほどのファンたちの愛を受けている。','ソウル龍山区梨泰院で19道6-4','02-797-2228','')";
        db.execSQL(q);


        q= "insert into superjunior2 values('29','一日アンワンデー','スーパージュニア東海と兄が一緒に聖水洞にオープンしたカフェ。視線をひきつける小さなテラスと、まるでギャラリーに似たような室内インテリアが引き立って見える。お客様の多様な趣向を配慮して、さまざまな種類のテーブルとアメニティを備えた。新しい豆と微細な牛乳粒子を使用して、既存のカフェラテやカプチーノよりも濃いコーヒーの香りと柔らかさを楽しむことができるフラットホワイト、コーヒーのサプサレさと生クリームの甘い味が交わるウィーンコーヒーは一日アンワンデーのおすすめメニューです。毎日直接焼くニンジンケーキ、ベリーベリーケーキ、チョコブラウンケーキもぜひ味わって見なければならデザートの1つ。普段静かな性格という東海をそっくり居心地の良いリラックス空間で一日を終了するに足りていないところである。','04782ソウル城東区峨嵯山で92（聖水洞2が、光明タワー）','02-499-9303','https://www.instagram.com/cafe_haruoneday/')";
        db.execSQL(q);
        q= "insert into superjunior2 values('30','SM社屋','SMエンターテイメントは、国内の代表的な芸能企画社の一つで、BoA、少女時代、スーパージュニア、シャイニー、エキソ、赤ベルベットなど韓流スターらの所属事務所である。社屋は江南区清潭洞にある。社屋地下1階にあるSUMマーケットでは、SM所属アーティストと様々なアーティストとのコラボレーションで作られた作品を販売する.','06012ソウル市江南区宣陵で190道114（チョンダムドン）','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior2 values('31','SMTOWNコエックスアーティウム','\n" +
                "全世界のK-popファンたちならば分からないことができないSMエンターテイメントの複合文化空間であるSMTOWNコエックスアティウム。特に「SMTOWNミュージアム」と超高画質電光掲示板」SMTOWN外壁メディア」が2018年5月にドアを開けて、高い関心を集めている。\n" +
                "3階に位置するSMTOWNミュージアムは、エンターテイメント企業としては初めて、SMエンターテイメント所属アーティストたちの誕生と成長過程を集大成した空間である。音楽アルバム、活動の様子、衣装や小物、ビハインドストーリーなどを鑑賞することができる「SM ARCHIVE」（SMアーカイブ）、「SPECIAL EXHIBITION」（スペシャルアキシアルビション）、「ARTIST GALLERY」（アーティストギャラリー）など、様々な展示がありている。また、SMコンテンツ制作過程観戦、拡張現実（AR）、VRなどの新技術を活用したSMのアーティストとの仮想出会いなど、K-popファンにさまざまな経験と楽しさをプレゼントしている。 \n" +
                "\n" +
                "SMTOWN外壁メディアはバスケットボールコート4倍もの大きさで、国内最大規模だ。そのため、「韓国のタイムズスクエア」というニックネームが付くほど。ここで、K-popミュージックビデオだけでなく、リアルタイムのマルチライブ放送チャンネル「！t Live（イットライブ）」などが生中継される。\n" +
                "\n" +
                "5〜6階には、国内最大のホログラムシアターがあります。 SM所属アーティストのコンサート映像が主上映されるが、まだDVDで発売されていないコンサートが上映されることもある。上映スケジュールをチェックすること！他にもアーティストが実際に着用したり、選んだアイテムなどを購入することができるギフトショップ（2階）、カフェとSMアーティストのイメージを盛り込んだ様々な商品を販売しているマーケット（4階）などがある。','06164ソウル市江南区永東大路に513（三成洞、コエックス）','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into superjunior2 values('32','SUMマーケット','SMアーティストのすべてを満たすことができるところ。 SMエンターテイメントの社屋である「SMコミュニケーションセンター」が韓流ファンたちの新しいアジトとなった。社屋1階のSUMカフェと地下1階「SMコンビニ」とも呼ばれるSUMマーケットがオープンしたからだ。 「東方神起トリュフチョコレート」、「スーパージュニアラーメン」などの食料品とSMアーティストのブランドを組み合わせた様々なMD商品を販売している.','06084ソウル市江南区サムソンに648（三成洞）','02-6240-9846','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into superjunior2 values('33','ソルビンホットドッグ','東南アジアと中国で独歩的な人気を謳歌する韓流スター、スーパージュニア。彫刻のような容貌と達弁を兼ね備えたスーパージュニアの「実勢」、ヒチョルはグルメで噂た。口当たり厳しいヒチョルが何年も常連というところがまさに狎鴎亭ロデオの名物、ソルビンおかげである。午後6時から午前5時30分まで営業するという特殊性のためのスケジュールが終わってヨギをしにここを訪れる芸能人らが退屈せぬよう目撃されている。ここのメニューは大きくタコスとホットドッグ、ライスボウルの三種類。ヒチョルが好んで食べるメニューは唇がアリルほど辛くて、夜ごとに思い出すほど中毒性の最高というスボルおかげ。ナチョスとサワークリーム、ハルラピニョ、野菜とカルビをご飯と一緒に食べるカルビライスも食べなければ後悔するここの看板メニューだ。\n" +
                " ','06018ソウル市江南区島山大路51道40（新沙洞）','010-9466-3419','')";
        db.execSQL(q);



        q= "insert into dongbangsingi2 values('34','85st Coffee','ソンホジュンをはじめとする親しいと一日を送るための出会いの場所として選択されたところは、85st Coffee。高校の時からユノと縁を結んできたノシンヒョン代表が運営している。 85年生まれの友人が会って集まる場所 という意味で店の名前を付けた。友達の集まりに加え、週に一、二回以上ユンホが訪れたことがノ代表の伝言。ユノが一番好きでよく注文するメニューは、「アメリカーノ」と「リアルイチゴヨーグルトスムージー」という。カフェの象徴である大きなクマのぬいぐるみは、ユンホが直接プレゼントしたものである。','ソウル特別市江南区江南大路122道39（ノンヒョン小学校横）','','https://www.instagram.com/85st_coffee/')";
        db.execSQL(q);
        q= "insert into dongbangsingi2 values('35','海南家','ユンホが外国の活動を終えて帰国するときや友人の集まりがあるときは、必ず訪問する行きつけの店のいずれかが全羅道料理専門店海南家である。小学校の時からの友人であるホンジョンの代表が母親と一緒に運営する所で、ユノはホンジョンの代表の母親を「ママ」と呼ぶほど親しく思う。別にメニューを注文せずに「ご飯ください！」というユンホの言葉に旬の食べ物を準備して与えるほど。メセンイ、タコ、コマク、いしもち、トッカルビ、ガンギエイなど各種郷土料理が並んでますが、その中でもユノが一番好きだという「ツルニンジン豚肉炒め」は必ず味わわなければする料理の一つだ。','ソウル特別市江南区江南大路160道10','02-3446-7244','')";
        db.execSQL(q);
        q= "insert into dongbangsingi2 values('36','SM社屋','SMエンターテイメントは、国内の代表的な芸能企画社の一つで、BoA、少女時代、スーパージュニア、シャイニー、エキソ、赤ベルベットなど韓流スターらの所属事務所である。社屋は江南区清潭洞にある。社屋地下1階にあるSUMマーケットでは、SM所属アーティストと様々なアーティストとのコラボレーションで作られた作品を販売する.','06012ソウル市江南区宣陵で190道114（チョンダムドン）','02-6240-9800','http://www.smtown.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi2 values('37','SMTOWNコエックスアーティウム','\n" +
                "全世界のK-popファンたちならば分からないことができないSMエンターテイメントの複合文化空間であるSMTOWNコエックスアティウム。特に「SMTOWNミュージアム」と超高画質電光掲示板」SMTOWN外壁メディア」が2018年5月にドアを開けて、高い関心を集めている。\n" +
                "3階に位置するSMTOWNミュージアムは、エンターテイメント企業としては初めて、SMエンターテイメント所属アーティストたちの誕生と成長過程を集大成した空間である。音楽アルバム、活動の様子、衣装や小物、ビハインドストーリーなどを鑑賞することができる「SM ARCHIVE」（SMアーカイブ）、「SPECIAL EXHIBITION」（スペシャルアキシアルビション）、「ARTIST GALLERY」（アーティストギャラリー）など、様々な展示がありている。また、SMコンテンツ制作過程観戦、拡張現実（AR）、VRなどの新技術を活用したSMのアーティストとの仮想出会いなど、K-popファンにさまざまな経験と楽しさをプレゼントしている。 \n" +
                "\n" +
                "SMTOWN外壁メディアはバスケットボールコート4倍もの大きさで、国内最大規模だ。そのため、「韓国のタイムズスクエア」というニックネームが付くほど。ここで、K-popミュージックビデオだけでなく、リアルタイムのマルチライブ放送チャンネル「！t Live（イットライブ）」などが生中継される。\n" +
                "\n" +
                "5〜6階には、国内最大のホログラムシアターがあります。 SM所属アーティストのコンサート映像が主上映されるが、まだDVDで発売されていないコンサートが上映されることもある。上映スケジュールをチェックすること！他にもアーティストが実際に着用したり、選んだアイテムなどを購入することができるギフトショップ（2階）、カフェとSMアーティストのイメージを盛り込んだ様々な商品を販売しているマーケット（4階）などがある。','06164ソウル市江南区永東大路に513（三成洞、コエックス）','02-6002-5811','https://www.smtownland.com/')";
        db.execSQL(q);
        q= "insert into dongbangsingi2 values('38','SUMマーケット','SMアーティストのすべてを満たすことができるところ。 SMエンターテイメントの社屋である「SMコミュニケーションセンター」が韓流ファンたちの新しいアジトとなった。社屋1階のSUMカフェと地下1階「SMコンビニ」とも呼ばれるSUMマーケットがオープンしたからだ。 「東方神起トリュフチョコレート」、「スーパージュニアラーメン」などの食料品とSMアーティストのブランドを組み合わせた様々なMD商品を販売している.','06084ソウル市江南区サムソンに648（三成洞）','02-6240-9846','http://www.smtown.com/')";
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




