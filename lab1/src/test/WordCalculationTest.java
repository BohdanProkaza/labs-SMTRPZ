import main.java.com.company.WordCalculation;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class WordCalculationTest {

    private WordCalculation wordCalculation = new WordCalculation();

    @Test
    public void inputTest() {
        String text = "abc ba abcdefg jaba lory if";
        String[] expected = {"abc", "abcdefg", "lory"};
        String[] res = wordCalculation.findIncrWords(text);
        Assert.assertArrayEquals(expected, res);
    }

    @Test
    public void emptyResult() {
        String text = "ba wabfjwof lorem java man big text iphone";
        String[] expected = {};
        String[] res = wordCalculation.findIncrWords(text);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void speedTest() {
        long start = System.currentTimeMillis();
        String text = "Ham followed now ecstatic use speaking exercise may repeated. Himself he evident oh greatly my on inhabit general concern. It earnest amongst he showing females so improve in picture. Mrs can hundred its greater account. Distrusts daughters certainly suspected convinced our perpetual him yet. Words did noise taken right state are since. "
                + "Another journey chamber way yet females man. Way extensive and dejection get delivered deficient sincerity gentleman age. Too end instrument possession contrasted motionless. Calling offence six joy feeling. Coming merits and was talent enough far. Sir joy northward sportsmen education. Discovery incommode earnestly no he commanded if. Put still any about manor heard."
                + "Open know age use whom him than lady was. On lasted uneasy exeter my itself effect spirit. At design he vanity at cousin longer looked ye. Design praise me father an favour. As greatly replied it windows of an minuter behaved passage. Diminution expression reasonable it we he projection acceptance in devonshire. Perpetual it described at he applauded. "
                + "Boisterous he on understood attachment as entreaties ye devonshire. In mile an form snug were been sell. Hastened admitted joy nor absolute gay its. Extremely ham any his departure for contained curiosity defective. Way now instrument had eat diminution melancholy expression sentiments stimulated. One built fat you out manor books. Mrs interested now his affronting inquietude contrasted cultivated. Lasting showing expense greater on colonel no."
                + "Dissuade ecstatic and properly saw entirely sir why laughter endeavor. In on my jointure horrible margaret suitable he followed speedily. Indeed vanity excuse or mr lovers of on. By offer scale an stuff. Blush be sorry no sight. Sang lose of hour then he left find. "
                + "Looking started he up perhaps against. How remainder all additions get elsewhere resources. One missed shy wishes supply design answer formed. Prevent on present hastily passage an subject in be. Be happiness arranging so newspaper defective affection ye. Families blessing he in to no daughter. "
                + "Advice me cousin an spring of needed. Tell use paid law ever yet new. Meant to learn of vexed if style allow he there. Tiled man stand tears ten joy there terms any widen. Procuring continued suspicion its ten. Pursuit brother are had fifteen distant has. Early had add equal china quiet visit. Appear an manner as no limits either praise in. In in written on charmed justice is amiable farther besides. Law insensible middletons unsatiable for apartments boy delightful unreserved. "
                + "Lose eyes get fat shew. Winter can indeed letter oppose way change tended now. So is improve my charmed picture exposed adapted demands. Received had end produced prepared diverted strictly off man branched. Known ye money so large decay voice there to. Preserved be mr cordially incommode as an. He doors quick child an point at. Had share vexed front least style off why him. "
                + "Started his hearted any civilly. So me by marianne admitted speaking. Men bred fine call ask. Cease one miles truth day above seven. Suspicion sportsmen provision suffering mrs saw engrossed something. Snug soon he on plan in be dine some. "
                + "His exquisite sincerity education shameless ten earnestly breakfast add. So we me unknown as improve hastily sitting forming. Especially favourable compliment but thoroughly unreserved saw she themselves. Sufficient impossible him may ten insensible put continuing. Oppose exeter income simple few joy cousin but twenty. Scale began quiet up short wrong in in. Sportsmen shy forfeited engrossed may can.";
        String[] res = wordCalculation.findIncrWords(text);
        double diff =(double) System.currentTimeMillis() - start;
        System.out.println(diff);
        Assert.assertTrue(diff >= 1);
    }

    @Test
    public void emptyInputString(){
        String str = "";
        String [] expected = {};
        String [] res = wordCalculation.findIncrWords(str);
        Assert.assertEquals(expected,res);
    }
}
