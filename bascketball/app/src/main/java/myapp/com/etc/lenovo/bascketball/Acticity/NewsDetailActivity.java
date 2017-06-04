package myapp.com.etc.lenovo.bascketball.Acticity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import myapp.com.etc.lenovo.bascketball.R;

public class NewsDetailActivity extends AppCompatActivity {

    ImageView news_img;
    TextView news_intro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.newsdetail_toolbar);
        toolbar.setTitle("Basketball");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = new Bundle();
        bundle = this.getIntent().getExtras();
        int brinum = Integer.parseInt(bundle.getString("newsid"));

        news_img = (ImageView) findViewById(R.id.news_img);
        news_intro = (TextView) findViewById(R.id.news_intro);

        String[] names = {"北京时间6月2日消息，中国男篮公布了今夏红篮两队的赛程安排，两支球队均安排了海外拉练。\n" +
                "　　中国男篮红队（主教练李楠）：\n" +
                "　　6月13-18日 中伊国际男篮对抗赛  地点：大连、长春、宁波\n" +
                "　　6月29-7月14日 海外拉练         地点：美国\n" +
                "　　7月19-23日 斯坦科维奇杯        地点：待定\n" +
                "　　7月30日  姚基金慈善赛          地点：香港\n" +
                "　　8月3日-8月5日 国际男篮邀请赛第二战 地点：待定\n" +
                "　　11月23日、26日 2019男篮世界杯窗口期 地点：中国、韩国\n" +
                "　　中国男篮蓝队（主教练杜锋）\n" +
                "　　6月17-21日 金砖国家运动会篮球赛 地点：广州\n" +
                "　　7月5-9日  中澳国际男篮对抗赛  地点：待定\n" +
                "　　7月13-25日 海外拉练   地点：澳大利亚 新西兰\n" +
                "　　7月29-31日 国际男篮邀请赛第一站 地点：昆山\n" +
                "　　8月8日-20日 2017男篮亚洲杯 地点 黎巴嫩贝鲁特",
                "北京时间6月2日消息，据微博上ID为@大河报洛阳新闻的账号爆料，在洛阳王城公园篮球场，打篮球的年轻人和跳广场舞的大叔大妈因为场地问题发生矛盾，由言语冲突发展成为肢体冲突，目前警方已介入。\n" +
                        "此事一经爆料，立刻成为微博上的热点，不少网友表示，平时打球的时候经常会发生篮球场被人占用的事情。如何平衡好打篮球和跳广场的场地问题，现在似乎并没有相关部门会进行协调。\n" +
                        "著名篮球评论员苏群发表对此事的看法：“花4分钟时间看了篮球场和广场舞冲突的完整视频，才敢发表观点：小伙子们很讲道理，几个阿姨也没有冲突之心，绿衣服和红衣服大叔负主要责任，不讲道理还打人。篮球场就是篮球场，学生都说一人一半了，广场舞团队应该适可而止。当地街道、居委管理失职。”"
                ,"北京时间6月2日消息，据《体坛+》撰文透露，将有一名中国球员代表76人队出战夏季联赛，目前看来这名球员很可能会是郭艾伦。\n" +
                "消息源并没有透露代表76人队出战夏季联赛的中国球员的名字，《体坛+》分析认为郭艾伦的可能性非常大。目前郭艾伦正在美国进行个人特训。\n" +
                "此前国家队主帅李楠确认周琦和丁彦雨航因为要参加夏季联赛跟国家队请假了（周琦代表火箭队，丁彦雨航代表小牛队），如果郭艾伦真的能代表76人队出战，那么今年夏天NBA的夏季联赛将成为中国球迷关注的焦点赛事。",
                "名帅尤纳斯重掌广东宏远队教鞭，昨天是他上任后的首训。对于再次执教宏远队，尤纳斯表示希望能够有一个好的结果，而新任俱乐部总经理朱芳雨则在采访中透露了尤纳斯上任后的新政。\n" +
                        "　　“我现在已经认不出几个球员了，现在的球队看起来更像是青年队而不是成年队了。我不清楚我们全队的水平如何，现在这个阵容很明显没法给大家一个满意的赛季。”再次回到宏远俱乐部，尤纳斯表示球队人员变动之大有点出乎他的意料，所以对于新赛季球队的目标，他本人现时还不能确定。\n" +
                        "　　值得一提的是，尤纳斯这次是带着一个两人团队来驰援宏远队的。昨天他对自己的教练组成员也作了详细的介绍：“体能教练在立陶宛国家队和我一起合作了多年，他一直跟着欧洲最好的球队一起工作，他也有开班教其他人如何进行体能训练。助理教练比较年轻，曾经短暂效力过立陶宛国家队。他还曾在斯杯来过中国进行比赛，也在巴塞罗那篮球学校当过教师。”\n" +
                        "　　值得一提的是，后卫陈江华新赛季将以助理教练的身份加入尤纳斯的教练组。尤纳斯昨天采访中也提到了自己的得意弟子：“损失朱芳雨、大鹏和江华，对于球队来说损失很大。他们选择以这种方式回到俱乐部，也是对于俱乐部的一种贡献，一起加入教练组能够培养出更多更好的年轻球员，这是今年的最主要目标。”\n" +
                        "　　采访中，尤纳斯一直强调球队阵容变化很大，他还需要时间为球队制定具体的计划。不过朱芳雨在昨天的采访中爆料了尤纳斯的新政：“我们昨天晚上有初步的沟通，我们队里面除了周鹏和易建联外，二飞能算一个（老队员），剩下的都是年轻队员。昨天晚上开会时候也说，对易建联的使用不可能再是30多分钟、40多分钟这样去使用了。要对阿联进行安全的保护，所以这些是现在和他之前带这个球队最为不同的地方，这是他对于球队的初步的执教理念。”",
                "信息时报讯 （记者 冯爱军） 名帅尤纳斯重掌CBA宏远队教鞭。昨天广东宏远俱乐部官方宣布，尤纳斯已经抵达东莞，与他同时抵达的还有助理教练罗兰达斯·雅鲁提斯以及体能教练斯吉塔斯·卡瓦里奥卡斯。\n" +
                        "　　宏远俱乐部特别提到，今天，新教练组就将开始带队训练了。至此，广东宏远队新的教练组组建工作已经全部完成。据悉，球队已经于5月28日开始集结，进入全运会和新赛季的备战状态。\n" +
                        "　　据悉，尤纳斯将担任广东省全运队成年组以及 2017/18CBA赛季广东东莞银行队主教练。在全运会以及CBA新赛季的双重任务下，广东宏远篮球俱乐部认为，在众多候选人中，更加了解广东宏远队和 中国篮球的尤纳斯是最为合适的教练人选。与此同时，为加强教练组建设，老将陈江华新赛季也将加入球队教练组，担任助理教练一职，辅助尤纳斯进行工作。俱乐 部也希望陈江华能发挥自己的经验，帮助俱乐部年轻后卫成长。\n" +
                        "　　值得一提的是，当年正是尤纳斯的慧眼识珠，将还没有过职业联赛经历的陈江华招入国家队，并随队征战了2006年世锦赛和2008年北京奥运会。",
                "北京时间6月2日，NBA总决赛开打，勇士主场先下一城，以113-91轻取骑士 。\n" +
                        "　　凯文-杜兰特重回总决赛，拿下了38分、8个篮板和8次助攻，斯蒂芬-库里投 中6记三分，拿下了28分、10次助攻和6个篮板，德雷蒙德-格林9分11个篮板 ，克雷-汤普森16投仅3中，只得6分。勇士全场竟然有14人出战。\n" +
                        "　　勒布朗-詹姆斯拿下了28分、15个篮板和8次助攻，但失误也达到8次。凯里- 欧文24分，凯文-勒夫15分21个篮板。[技术统计]\n" +
                        "　　为了这一天，两队已经准备了很久。去年总决赛历历在目，勇士3-1领先竟 然遭到翻盘。在第七场生死战，他们最后4分39秒竟然一分未得，痛失到手 的奖杯。\n" +
                        "　　痛定思痛，勇士引入了另一巨头杜兰特，组成了“四巨头”，目标再指总冠 军。常规赛，他们战绩联盟第一，而在季后赛，此前三轮都是4-0，兵不血 刃。\n" +
                        "　　卫冕冠军骑士也不会束手待毙，引入了科沃尔和德隆-威廉姆斯等强将。他 们在季后赛此前三轮也只输了1场。令人吃惊的是，他们的三分命中率达到 45.3%，居所有之球队之首，高于勇士。[变态准!新浪小炮预测骑士勇士100%全中][新人1元][下载APP看剧透]\n" +
                        "　　两队都胸有成竹，向决冠军发起第一波冲击。开场后，双方都比较紧张。虽 然都是身经百战的高手，但都出现低级失误，命中率不高。不过随着比赛进 程的推进，两队找到了感觉，开始对攻。\n" +
                        "　　首节中段，詹姆斯摆脱防守，面对空篮做了个假动作后轻松扣篮，骑士以 16-14超出。詹姆斯此后给了杜兰特一记盖帽，但杜兰特也还以颜色，在边 线晃倒詹姆斯，轻松突破之后扣篮，勇士以18-17再次领先。\n" +
                        "　　库里也找到感觉，两度三分命中，而伊戈达拉投中压哨三分，勇士以35-30 结束首节。\n" +
                        "　　骑士对外线的防守有些过于紧张，结果篮下多次出现空位，被勇士轻松得分 。第二节之初，詹姆斯下场休息时，勇士将差距拉开。等詹姆斯回来后，骑 士也未能阻住勇士的攻势。\n" +
                        "　　第二节还有4分53秒秒时，杜兰特两罚两中，勇士以49-39取得了两位数的优 势。欧文连投带罚还以4分，但汤普森和利文斯顿相继还以颜色，勇士保持 领先，以60-52结束上半场。\n" +
                        "　　上半场杜兰特扣篮6次，已经平了个人职业生涯全场的纪录，骑士防守的失 误可见一斑。杜兰特已经有23分进账，库里得了12分。\n" +
                        "　　在进攻上，骑士也不差，詹姆斯19分11个篮板，欧文17分，勒夫8分12个篮 板。\n" +
                        "　　杜兰特在第三节一开始就命中三分，而库里也两投两中，勇士以一波13-0开 始本节，一举以73-52取得了21分的优势。骑士在4分钟内一分未得，詹姆斯 只得挺身而出，强行出手命中三分，然后连续传球，助攻勒夫投中三分，骑 士发起反击。\n" +
                        "　　双方差距一度只有12分，但杜兰特连得4分，而库里又一次命中三分。骑士 上半场内线没防好，而下半场则防不住外线。勇士打出一波攻击，以93-72 结束前三节。\n" +
                        "　　詹姆斯消耗太大，但仍坚持在场上。而当他把球传出时，队友命中率并不高 。在这种情形下，骑士打得非常艰难。比赛还有4分08秒时，詹姆斯强突时 失误，勇士发动快攻，杜兰特命中三分，勇士以105-84保持大比分领先。\n" +
                        "　　骑士只得放弃，撤下了詹姆斯等主力。毕竟这只是第一场，失利可以接受， 詹姆斯不宜再有过多消耗。\n" +
                        "　　勇士先拔头筹，总决赛以1-0领先，今年的季后赛仍保持不败。",
                "北京时间6月2日，据美媒体报道，如果能够在今夏帮助勇士队保留核心阵容，凯文-杜兰特愿意降薪续约。\n" +
                        "　　今年夏天，勇士队的两届常规赛MVP库里将成为非受限自由球员，他可以获得一份5年的超级顶薪。与此同时，杜兰特也可以成为自由球员。如果他愿意接受低于顶薪的续约合同，那么这使得勇士可以保留核心阵容。\n" +
                        "　　勇士队板凳席上的两位大将安德烈-伊戈达拉和肖恩-利文斯顿也将在夏天成为自由球员。\n" +
                        "　　如果今夏勇士顶薪续约杜兰特，那么他们不得不放弃伊戈达拉和利文斯顿。下赛季，杜兰特能得到的最高薪水将接近3200万美元。\n" +
                        "　　库里在今夏可以签一份5年2.05亿美元的合同，起薪高达3540万美元。\n" +
                        "　　据知情人士透露，杜兰特愿意在今夏接受低于顶薪的合同与勇士续约，这样勇士就不用为了腾出薪金空间而放弃其他重要的自由球员。\n" +
                        "　　杜兰特原本在今夏可以与勇士续约一份4年合同，但是他更加可能签一份1+1的合同，就像勒布朗-詹姆斯重返骑士队之后的前两年所签的合同类型。之后，杜兰特可以签一份5年总价2.17亿美元的合同，从2019-20赛季开始。\n" +
                        "　　虽然消息源强调杜兰特还没有最终决定如何构建他的下一份合同，但是他们相信杜兰特愿意降薪与勇士队续约，目的是为了保留核心阵容的完整，并让勇士在未来几年内都具备争冠实力。\n" +
                        "　　此前，杜兰特曾多次表示他愿意长期留在勇士队，他现在不仅在湾区安了家，而且还和长期生意伙伴克莱曼在湾区创建了公司。",
                "北京时间6月2日，据《休斯顿纪事报》记者乔纳森-费根报道，NBA总裁亚当-萧华在今天接受采访时特别被问到了中国球员周琦，并给予不错的评价。另据费根表示，火箭队的计划是在今年休赛期签下周琦。\n" +
                        "　　周琦是去年的NBA第43号新秀，被火箭队选中，但是周琦并没有立即加盟火箭队，而是在CBA继续打了一个赛季，而且夺得总冠军。\n" +
                        "　　今年夏天，周琦一直在休斯顿进行训练，而且有消息称他的团队在和火箭队讨论签约事宜。\n" +
                        "　　今天NBA总决赛第1场比赛之前，NBA总裁萧华被问到了NBA的中国球员以及周琦。萧华表示，虽然他还没有在现场见过周琦以及他的比赛，但是从周琦的比赛视频来看，萧华表示“看起来他可以成为一名出色的球员。”\n" +
                        "　　与此同时，《休斯顿纪事报》记者乔纳森-费根在推特上强调，火箭队的计划依然是在今年休赛期签下周琦。",
                "北京时间6月2日，据美媒体报道，今夏将成为自由球员的勇士板凳前锋安德烈-伊戈达拉将受到多支球队的追逐，其中包括：太阳、老鹰和森林狼。\n" +
                        "　　2013年夏天，伊戈达拉加盟勇士队，并成为勇士崛起的关键球员。2015年，伊戈达拉成为总决赛MVP。此外，他一直是联盟最佳第六人的热门。\n" +
                        "　　今年是一哥在勇士队的第四个赛季，虽然他场均只得到7.6分（生涯第二低），但是他依然是一名很有价值的侧翼防守者和外线射手。\n" +
                        "　　本赛季，伊戈达拉的投篮命中率达到生涯最高的52.8%，三分球命中率（36.2%）也达到自2011-12赛季以来的最高。\n" +
                        "　　今年季后赛，伊戈达拉受到膝盖伤势的困扰，并缺席过比赛。在总决赛中，勇士依然非常需要一哥的发挥。\n" +
                        "　　今年夏天，伊戈达拉将成为一名自由球员。据知情人士透露，届时将有多支球队追逐他，其中包括：太阳、老鹰和森林狼。\n" +
                        "　　当然，勇士也非常希望能留住伊戈达拉。据说今夏也将成为自由球员的凯文-杜兰特愿意降薪续约勇士，目的就是希望能留住伊戈达拉这样的核心轮换球员\n",
                "北京时间6月1日，据《篮球内幕》报道，洛杉矶湖人队已经越来越倾向于交易年轻后卫乔丹-克拉克森，而且这笔交易可能会发生在选秀大会当天。\n" +
                        "　　随着湖人的管理层在本赛季发生重大变动，他们的阵容也将会做出相应的调整和补强。由于手握榜眼签的湖人预计将会在选秀大会上选择一名控卫，比如朗佐-鲍尔或者福克斯，这使得湖人的后场阵容显得有些拥挤。\n" +
                        "　　据《篮球内幕》记者莫克-汉密尔顿透露，湖人队已经越来越倾向于交易年轻后卫乔丹-克拉克森，而且这笔交易可能会发生在选秀大会当天。\n" +
                        "　　对湖人来说，乔丹-克拉克森是一个值得关注的交易筹码。即将25岁的他还剩3年3750万美元的合同。鉴于目前的NBA工资帽情况，以及克拉克森的天赋以及潜力，他的这份合同还是非常合理的。\n" +
                        "　　虽然单用克拉克森无法为湖人换来一个明星球员，但是如果湖人用榜眼签选择鲍尔或者福克斯，那么交易克拉克森是一个情理之中的选择。"};

        int[] imgUrs = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10};

        news_img.setImageDrawable(getResources().getDrawable(imgUrs[brinum]));
        news_intro.setText(names[brinum]);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}