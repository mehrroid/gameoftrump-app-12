package com.whitedevs.gameoftrumps;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by Mehrnaz on 1/21/2017.
 */

public class Lev extends Activity {
    private LinearLayout container;
    private String vGatTag;
    InterstitialAd mInterstitialAd;
    private AdView mAdView;
    private int starsin;
    private SharedPre sp;

    //az icon play baraye mosalasha estfade shode
    //items of header
    TextView txtStarBg;
    TextView txtIconStar;
    Typeface font2;
//lock items
TextView levLogo00;
    TextView levLogo01;
    TextView levLogo02;
    TextView levLogo03;
    TextView levLogo04;
    TextView levLogo10;
    TextView levLogo11;
    TextView levLogo12;
    TextView levLogo13;
    TextView levLogo14;
    TextView levLogo20;
    TextView levLogo21;
    TextView levLogo22;
    TextView levLogo23;
    TextView levLogo24;
    TextView levLogo30;
    TextView levLogo31;
    TextView levLogo32;
    TextView levLogo33;
    TextView levLogo34;
    TextView levLogo40;
    TextView levLogo41;
    TextView levLogo42;
    TextView levLogo43;
    TextView levLogo44;
    //
//star items
   TextView star000;
 TextView star001;
    TextView star015;
    TextView star016;
    TextView star017;
    TextView star002;
    TextView star003;
    TextView star004;
    TextView star005;
    TextView star006;
    TextView star007;
    TextView star008;
    TextView star009;
    TextView star010;
    TextView star011;
    TextView star012;
    TextView star013;
    TextView star014;

    TextView star018;
    TextView star019;
    TextView star020;
    TextView star021;
    TextView star022;
    TextView star023;
    TextView star024;
    TextView star025;
    TextView star026;
    TextView star027;
    TextView star028;
    TextView star029;
    TextView star030;
    TextView star031;
    TextView star032;
    TextView star033;
    TextView star034;
    TextView star035;
    TextView star036;
    TextView star037;
    TextView star038;
    TextView star039;
    TextView star040;
    TextView star041;
    TextView star042;
    TextView star043;
    TextView star044;
    TextView star045;
    TextView star046;
    TextView star047;
    TextView star048;
    TextView star049;
    TextView star050;
    TextView star051;
    TextView star052;
    TextView star053;
    TextView star054;
    TextView star055;
    TextView star056;
    TextView star057;
    TextView star058;
    TextView star059;
    TextView star060;
    TextView star061;
    TextView star062;
    TextView star063;
    TextView star064;
    TextView star065;
    TextView star066;
    TextView star067;
    TextView star068;
    TextView star069;
    TextView star070;
    TextView star071;
    TextView star072;
    TextView star073;
    TextView star074;
    TextView star075;

    //
    //clouds
    TextView cloudl1;
    TextView cloudl2;
    TextView cloudl3;
    TextView cloudl4;
    TextView cloudl5;
    //
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        Log.e("level", "come");
        setContentView(R.layout.level);

      font2=Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        TextView txtg= (TextView) findViewById(R.id.game);
        txtg.setTypeface(font2);
        TextView txtsq1= (TextView) findViewById(R.id.sqbg);
        TextView txtstar= (TextView) findViewById(R.id.star);
        txtstar.setTypeface(font2);
        TextView plus = (TextView) findViewById(R.id.pl);
        plus.setTypeface(font2);
        //mehrnaz lock



        levLogo00= (TextView) findViewById(R.id.levLogo00);
        levLogo00.setTypeface(font2);

        levLogo01= (TextView) findViewById(R.id.levLogo01);
        levLogo01.setTypeface(font2);

        levLogo02= (TextView) findViewById(R.id.levLogo02);
        levLogo02.setTypeface(font2);

        levLogo03= (TextView) findViewById(R.id.levLogo03);
        levLogo03.setTypeface(font2);


        levLogo04= (TextView) findViewById(R.id.levLogo04);
        levLogo04.setTypeface(font2);


        levLogo10= (TextView) findViewById(R.id.levLogo10);
        levLogo10.setTypeface(font2);

        levLogo11= (TextView) findViewById(R.id.levLogo11);
        levLogo11.setTypeface(font2);


        levLogo12= (TextView) findViewById(R.id.levLogo12);
        levLogo12.setTypeface(font2);

        levLogo13= (TextView) findViewById(R.id.levLogo13);
        levLogo13.setTypeface(font2);

        levLogo14= (TextView) findViewById(R.id.levLogo14);
        levLogo14.setTypeface(font2);

        levLogo20= (TextView) findViewById(R.id.levLogo20);
        levLogo20.setTypeface(font2);

        levLogo21= (TextView) findViewById(R.id.levLogo21);
        levLogo21.setTypeface(font2);

        levLogo22= (TextView) findViewById(R.id.levLogo22);
        levLogo22.setTypeface(font2);


        levLogo23= (TextView) findViewById(R.id.levLogo23);
        levLogo23.setTypeface(font2);

        levLogo24= (TextView) findViewById(R.id.levLogo24);
        levLogo24.setTypeface(font2);

        levLogo30= (TextView) findViewById(R.id.levLogo30);
        levLogo30.setTypeface(font2);


        levLogo31= (TextView) findViewById(R.id.levLogo31);
        levLogo31.setTypeface(font2);

        levLogo32= (TextView) findViewById(R.id.levLogo32);
        levLogo32.setTypeface(font2);

        levLogo33= (TextView) findViewById(R.id.levLogo33);
        levLogo33.setTypeface(font2);

        levLogo34= (TextView) findViewById(R.id.levLogo34);
        levLogo34.setTypeface(font2);


        levLogo40= (TextView) findViewById(R.id.levLogo40);
        levLogo40.setTypeface(font2);

        levLogo41= (TextView) findViewById(R.id.levLogo41);
        levLogo41.setTypeface(font2);

        levLogo42= (TextView) findViewById(R.id.levLogo42);
        levLogo42.setTypeface(font2);

        levLogo43= (TextView) findViewById(R.id.levLogo43);
        levLogo43.setTypeface(font2);

        levLogo44= (TextView) findViewById(R.id.levLogo44);
        levLogo44.setTypeface(font2);


        //
        //mehrnaz stars
        star000= (TextView) findViewById(R.id.star000);
        star000.setTypeface(font2);
        star001= (TextView) findViewById(R.id.Star001);
        star001.setTypeface(font2);
        star002= (TextView) findViewById(R.id.Star002);
        star002.setTypeface(font2);
        star003= (TextView) findViewById(R.id.Star003);
        star003.setTypeface(font2);
        star004= (TextView) findViewById(R.id.Star004);
        star004.setTypeface(font2);
        star005= (TextView) findViewById(R.id.Star005);
        star005.setTypeface(font2);
        star006= (TextView) findViewById(R.id.Star006);
        star006.setTypeface(font2);
        star007= (TextView) findViewById(R.id.Star007);
        star007.setTypeface(font2);
        star008= (TextView) findViewById(R.id.Star008);
        star008.setTypeface(font2);
        star009= (TextView) findViewById(R.id.Star009);
        star009.setTypeface(font2);
        star010= (TextView) findViewById(R.id.Star010);
        star010.setTypeface(font2);
        star011= (TextView) findViewById(R.id.Star011);
        star011.setTypeface(font2);
        star012= (TextView) findViewById(R.id.Star012);
        star012.setTypeface(font2);
        star013= (TextView) findViewById(R.id.Star013);
        star013.setTypeface(font2);
        star014= (TextView) findViewById(R.id.Star014);
        star014.setTypeface(font2);
        star015= (TextView) findViewById(R.id.Star015);
        star015.setTypeface(font2);
        star016= (TextView) findViewById(R.id.Star016);
        star016.setTypeface(font2);
        star017= (TextView) findViewById(R.id.Star017);
        star017.setTypeface(font2);
        star018= (TextView) findViewById(R.id.Star018);
        star018.setTypeface(font2);
        star019= (TextView) findViewById(R.id.Star019);
        star019.setTypeface(font2);
        star020= (TextView) findViewById(R.id.Star020);
        star020.setTypeface(font2);
        star021= (TextView) findViewById(R.id.Star021);
        star021.setTypeface(font2);
        star022= (TextView) findViewById(R.id.Star022);
        star022.setTypeface(font2);
        star023= (TextView) findViewById(R.id.Star023);
        star023.setTypeface(font2);
        star024= (TextView) findViewById(R.id.Star024);
        star024.setTypeface(font2);
        star025= (TextView) findViewById(R.id.Star025);
        star025.setTypeface(font2);
        star026= (TextView) findViewById(R.id.Star026);
        star026.setTypeface(font2);
        star027= (TextView) findViewById(R.id.Star027);
        star027.setTypeface(font2);
        star028= (TextView) findViewById(R.id.Star028);
        star028.setTypeface(font2);
        star029= (TextView) findViewById(R.id.Star029);
        star029.setTypeface(font2);
        star030= (TextView) findViewById(R.id.Star030);
        star030.setTypeface(font2);

        star031= (TextView) findViewById(R.id.Star031);
        star031.setTypeface(font2);
        star032= (TextView) findViewById(R.id.star032);
        star032.setTypeface(font2);

        star033= (TextView) findViewById(R.id.star033);
        star033.setTypeface(font2);
        star034= (TextView) findViewById(R.id.Star034);
        star034.setTypeface(font2);
        star035= (TextView) findViewById(R.id.star035);
        star035.setTypeface(font2);
        star036= (TextView) findViewById(R.id.Star036);
        star036.setTypeface(font2);
        star037= (TextView) findViewById(R.id.Star037);
        star037.setTypeface(font2);
        star038= (TextView) findViewById(R.id.Star038);
        star038.setTypeface(font2);
        star039= (TextView) findViewById(R.id.Star039);
        star039.setTypeface(font2);
        star040= (TextView) findViewById(R.id.Star040);
        star040.setTypeface(font2);
        star041= (TextView) findViewById(R.id.Star041);
        star041.setTypeface(font2);
        star042= (TextView) findViewById(R.id.Star042);
        star042.setTypeface(font2);
        star043= (TextView) findViewById(R.id.Star043);
        star043.setTypeface(font2);
        star044= (TextView) findViewById(R.id.Star044);
        star044.setTypeface(font2);
        star045= (TextView) findViewById(R.id.Star045);
        star045.setTypeface(font2);
        star046= (TextView) findViewById(R.id.Star046);
        star046.setTypeface(font2);
        star047= (TextView) findViewById(R.id.Star047);
        star047.setTypeface(font2);
        star048= (TextView) findViewById(R.id.Star048);
        star048.setTypeface(font2);
        star049= (TextView) findViewById(R.id.Star049);
        star049.setTypeface(font2);
        star050= (TextView) findViewById(R.id.Star050);
        star050.setTypeface(font2);
        star052= (TextView) findViewById(R.id.Star052);
        star052.setTypeface(font2);
        star053= (TextView) findViewById(R.id.Star053);
        star053.setTypeface(font2);
        star054= (TextView) findViewById(R.id.Star054);
        star054.setTypeface(font2);
        star055= (TextView) findViewById(R.id.Star055);
        star055.setTypeface(font2);
        star056= (TextView) findViewById(R.id.Star056);
        star056.setTypeface(font2);
        star057= (TextView) findViewById(R.id.star057);
        star057.setTypeface(font2);
        star058= (TextView) findViewById(R.id.Star058);
        star058.setTypeface(font2);
        star059= (TextView) findViewById(R.id.Star059);
        star059.setTypeface(font2);
        star060= (TextView) findViewById(R.id.Star060);
        star060.setTypeface(font2);
        star061= (TextView) findViewById(R.id.Star061);
        star061.setTypeface(font2);
        star062= (TextView) findViewById(R.id.Star062);
        star062.setTypeface(font2);
        star063= (TextView) findViewById(R.id.Star063);
        star063.setTypeface(font2);
        star064= (TextView) findViewById(R.id.Star064);
        star064.setTypeface(font2);
        star065= (TextView) findViewById(R.id.Star065);
        star065.setTypeface(font2);
        star066= (TextView) findViewById(R.id.Star066);
        star066.setTypeface(font2);
        star067= (TextView) findViewById(R.id.Star067);
        star067.setTypeface(font2);
        star068= (TextView) findViewById(R.id.Star068);
        star068.setTypeface(font2);
        star069= (TextView) findViewById(R.id.Star069);
        star069.setTypeface(font2);
        star070= (TextView) findViewById(R.id.Star070);
        star070.setTypeface(font2);
        star071= (TextView) findViewById(R.id.star071);
        star071.setTypeface(font2);
        star072= (TextView) findViewById(R.id.star072);
        star072.setTypeface(font2);
        star073= (TextView) findViewById(R.id.star073);
        star073.setTypeface(font2);
        star074= (TextView) findViewById(R.id.star074);
        star074.setTypeface(font2);
        star075= (TextView) findViewById(R.id.star075);
        star075.setTypeface(font2);
        //cloud
        //
        cloudl1= (TextView) findViewById(R.id.cloudl1);
        cloudl1.setTypeface(font2);
        cloudl2= (TextView) findViewById(R.id.cloudl2);
        cloudl2.setTypeface(font2);
        cloudl3= (TextView) findViewById(R.id.cloudl3);
        cloudl3.setTypeface(font2);
        cloudl4= (TextView) findViewById(R.id.cloudl4);
        cloudl4.setTypeface(font2);
        cloudl5= (TextView) findViewById(R.id.cloudl5);
        cloudl5.setTypeface(font2);
        //
//        Log.e("level", "R.layout.level");
//        container = (LinearLayout) findViewById(R.id.activity_main);
//        Log.e("level", "R.id.activity_main");
//        sp = new SharedPre(getApplicationContext());
//        starsin=0;
//        String userName="Name";
//
//        try {
//            //remove below line ht700 for lunch
//            sp.Set("winstars",Integer.toString(1000));
//            //end remove
//           starsin=Integer.parseInt(sp.Get("winstars").toString());
//            if (Integer.parseInt(sp.Get("winstars").toString())!=400400400){ starsin=Integer.parseInt(sp.Get("winstars").toString());}
//            Log.e("sp.Get(winstars)", starsin+"");
//        } catch(NumberFormatException nfe) {
//            //	System.out.println("Could not parse " + nfe);
//            starsin=0;
//        }
//
//        try {
//            userName=(sp.Get("username"));
//            if (userName=="400400400"){userName="Name!";}
//            Log.e("userName", userName+"");
//        } catch(NumberFormatException nfe) {
//            //	System.out.println("Could not parse " + nfe);
//            userName="Name"; }
//
//
//        try {
//
//        TextView tv1 = (TextView) findViewById(R.id.starsNo);
//        tv1.setText(""+starsin);
//        tv1 = (TextView) findViewById(R.id.tvUserName);
//        tv1.setText(userName);
//
//        } catch(NumberFormatException nfe) {}
//
//        Typeface font2 = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
////items of header
////     ll
////        txtIconStar = (TextView) findViewById(R.id.txtstar);
////        txtIconStar.setTypeface(font2);
////        txtStarBg = (TextView) findViewById(R.id.txtstarbg);
////        txtStarBg.setTypeface(font2);
//
//        mAdView = (AdView) findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//
//        mAdView.loadAd(adRequest);
//        draw(getResources().getStringArray(R.array.type), 5);
//        //mehrnaz
//        TextView txt= (TextView) findViewById(R.id.male);
//        TextView txtstars= (TextView) findViewById(R.id.icon_star);
//        TextView txtstars2= (TextView) findViewById(R.id.icon_star2);
//
//        TextView txtstars3= (TextView) findViewById(R.id.icon_star3);
//        TextView txtstars4= (TextView) findViewById(R.id.icon_star03);
//        TextView txtstars5= (TextView) findViewById(R.id.icon_star02);
//        TextView txtstars6= (TextView) findViewById(R.id.icon_star01);
//
//        txt.setTypeface(font2);
//        txtstars.setTypeface(font2);
//        txtstars2.setTypeface(font2);
//        txtstars3.setTypeface(font2);
//        txtstars4.setTypeface(font2);
//        txtstars5.setTypeface(font2);
//        txtstars6.setTypeface(font2);
//        final FrameLayout fl= (FrameLayout) findViewById(R.id.popupFrameLayout);
//
//
//        fl.setVisibility(View.GONE);
//        //
//        //HT 748
//        int winStars= getIntent().getIntExtra("winstars", 0);
//        if (winStars!=0)
//        {
//
//            //777
//            sp.Set("stars",Integer.toString(0));
//            Log.e("winStars", winStars+"");
//            CharSequence text = "You Win , " + winStars + " Stars";
//            Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
//            toast.show();
//            TextView winSentence;
//            winSentence=(TextView) findViewById(R.id.winSentence);
//            switch (winStars){
//                case 0:
//                    winSentence.setText("You Lose!");
//
//                    break;
//                case 1:
//                    //R.string.icon_trophy
//                    winSentence.setText("Fine!");
//                    winSentence=(TextView) findViewById(R.id.icon_star);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star01);
//                    winSentence.setText(R.string.icon_star);
//                    break;
//                case 2:
//                    winSentence.setText("You did it");
//                    winSentence=(TextView) findViewById(R.id.icon_star);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star01);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star2);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star02);
//                    winSentence.setText(R.string.icon_star);
//                    break;
//                case 3:
//                    winSentence.setText("You made it");
//                    winSentence=(TextView) findViewById(R.id.icon_star);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star01);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star2);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star02);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star3);
//                    winSentence.setText(R.string.icon_star);
//                    winSentence=(TextView) findViewById(R.id.icon_star03);
//                    winSentence.setText(R.string.icon_star);
//                    break;
//            }
//
//            //mehrnaz
////            fl.setVisibility(View.VISIBLE);
////
////            final Animation myAnim = AnimationUtils.loadAnimation(Lev.this, R.anim.anim2);
////            fl.startAnimation(myAnim);
//            //
//
////            final TableLayout fm2= (TableLayout) findViewById(R.id.levelmain);
////            fm2.setOnClickListener(new View.OnClickListener() {
////    @Override
////    public void onClick(View v) {
////        fl.setVisibility(v.GONE);
////
////    }
////});
//        }
//        //full screen adsMob start
//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//                requestNewInterstitial();
//                playingGame(vGatTag);
//            }
//        });
//
//        requestNewInterstitial();
//        //full screen adsMob End
//
//    }
//
//
//    private void draw(String[] strs, int column) {
//
//        int row = strs.length / column;
//        int index = 0;
//
//        for (int i = 0; i < row; i++) {
//            LinearLayout ll = new LinearLayout(Lev.this);
//            LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//            ll.setWeightSum(6);
//            ll.setGravity(Gravity.CENTER);
//
//            ll.setOrientation(LinearLayout.HORIZONTAL);
//            ll.setLayoutParams(llParams);
//            container.addView(ll);
//            for (int j = 0; j < column; j++) {
//                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT);
//                params.setMargins(5, 5, 5, 5);
//                params.weight = 1;
//                Button card = new Button(Lev.this);
//                Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
//                card.setText(strs[index]);
//                card.setTypeface(font);
//                card.setTextSize(25);
//                card.setPadding(5, 5, 5, 5);
//                card.setGravity(Gravity.CENTER);
//                card.setLayoutParams(params);
//                card.setTag(i +""+ j);
//                card.setBackgroundResource(R.drawable.circle2);
//                ll.addView(card);
//                //card.setTextColor(R.color.gray);
//                card.setOnClickListener(clickListener);
//                index++;
//
//
//            }
//        }
//    }
//
//    private View.OnClickListener clickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            vGatTag=v.getTag().toString();
//            playingGame(vGatTag);
//
//        }
//    };
//
//    private void playingGame(String in) {
//        multi mlt = new multi();
//        int icon;
//        mlt.VibrationStart(1,getApplicationContext(),true);
//        int levelselect=0;
//
//        //  if (mInterstitialAd.isLoaded()) {
//        //ht789  show ads
//        //    mInterstitialAd.show();
//        //  } else {
//        if(true){
//            switch (in) {
//                case "00":
//                    Log.i("goneToGame()", "case 00");
//                    levelselect=1;
//                    icon=R.string.icon_plus;
//
//                    break;
//                case "01":
//                    Log.i("goneToGame()", "case 01");
//                    levelselect=2;
//                    icon=R.string.icon_plus;
//                    break;
//                case "02":
//                    Log.i("goneToGame()", "case 02");
//                    levelselect=3;
//                    icon=R.string.icon_plus;
//                    break;
//
//                case "03":
//                    Log.i("goneToGame()", "case 03");
//                    levelselect=4;
//                    icon=R.string.icon_plus;
//                    break;
//                case "04":
//                    Log.i("goneToGame()", "case 04");
//                    levelselect=5;
//                    icon=R.string.icon_plus;
//                    break;
//                case "10":
//                    Log.i("goneToGame()", "case 05");
//                    levelselect=6;
//                    icon=R.string.icon_plus;
//                    break;
//                case "11":
//
//                    levelselect=7;
//                    icon=R.string.icon_plus;
//                case "12":
//                    levelselect=8;
//                    icon=R.string.icon_plus;
//                    break;
//                case "13":
//                    levelselect=9;
//                    icon=R.string.icon_plus;
//                    break;
//                case "14":
//                    levelselect=10;
//                    icon=R.string.icon_plus;
//                    break;
//                case "20":
//                    levelselect=11;
//                    icon=R.string.icon_plus;
//                    break;
//                case "21":
//                    levelselect=12;
//                    icon=R.string.icon_plus;
//                    break;
//                case "22":
//                    levelselect=12;
//                    icon=R.string.icon_plus;
//                    break;
//                case "23":
//                    levelselect=14;
//                    icon=R.string.icon_plus;
//                    break;
//                case "24":
//                    levelselect=15;
//                    icon=R.string.icon_plus;
//                    break;
//                case "30":
//                    levelselect=16;
//                    icon=R.string.icon_plus;
//                    break;
//                case "31":
//                    levelselect=17;
//                    icon=R.string.icon_plus;
//                    break;
//                case "32":
//                    levelselect=18;
//                    icon=R.string.icon_plus;
//                    break;
//                case "33":
//                    levelselect=19;
//                    icon=R.string.icon_plus;
//                    break;
//                case "34":
//                    levelselect=20;
//                    icon=R.string.icon_plus;
//                    break;
//                case "40":
//                    levelselect=21;
//                    icon=R.string.icon_plus;
//                    break;
//                case "41":
//                    levelselect=22;
//                    icon=R.string.icon_plus;
//                    break;
//                case "42":
//                    levelselect=23;
//                    icon=R.string.icon_plus;
//                    break;
//                case "43":
//                    levelselect=24;
//                    icon=R.string.icon_plus;
//                    break;
//                case "44":
//                    levelselect=25;
//                    icon=R.string.icon_plus;
//                    break;
//
//            }
//
//            if (starsin>2 || levelselect==1 )
//            {
//                if (levelselect!=1)
//                {
//                    starsin=starsin-2;
//                    sp.Set("winstars",Integer.toString(starsin));
//                }
//                Intent intent = new Intent(Lev.this, Game.class);
//                levelselect=levelselect*2;
//                intent.putExtra("levelNo", (Integer)levelselect);
//                startActivity(intent);
//            }
                /*
            if(true)
            {
                Intent intent = new Intent(Lev.this, Game.class);
                levelselect=levelselect*2;
                intent.putExtra("levelNo", (Integer)levelselect);
                startActivity(intent);
            }
 */
        }
//    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Lev.this, NavigationDrawer.class);
        startActivity(intent);
    }

    public void onGGP(View view) {
        Intent intent = new Intent(Lev.this, userProfile.class);
        startActivity(intent);
    }
}
