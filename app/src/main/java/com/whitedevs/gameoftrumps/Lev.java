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
import android.widget.RelativeLayout;
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
   TextView star0101;
 TextView star0102;
    TextView star0103;
    TextView star0201;
    TextView star0202;
    TextView star0203;
    TextView star0301;
    TextView star0302;
    TextView star0303;
    TextView star0401;
    TextView star0402;
    TextView star0403;
    TextView star0404;
    TextView star0501;
    TextView star0502;
    TextView star0503;
    TextView star0601;
    TextView star0602;
    TextView star0603;
    TextView star0701;
    TextView star0702;
    TextView star0703;
    TextView star0801;
    TextView star0802;
    TextView star0803;
    TextView star0901;
    TextView star0902;
    TextView star0903;
    TextView star1001;
    TextView star1002;
    TextView star1003;
    TextView star1101;
    TextView star1102;
    TextView star1103;
    TextView star1201;
    TextView star1202;
    TextView star1203;
    TextView star1301;
    TextView star1302;
    TextView star1303;
    TextView star1401;
    TextView star1402;
    TextView star1403;
    TextView star1501;
    TextView star1502;
    TextView star1503;
    TextView star1601;
    TextView star1602;
    TextView star1603;
    TextView star1701;
    TextView star1702;
    TextView star1703;
    TextView star1801;
    TextView star1802;
    TextView star1803;
    TextView star1901;
    TextView star1902;
    TextView star1903;
    TextView star2001;
    TextView star2002;
    TextView star2003;
    TextView star2101;
    TextView star2102;
    TextView star2103;
    TextView star2201;
    TextView star2202;
    TextView star2203;
    TextView star2301;
    TextView star2302;
    TextView star2303;
    TextView star2401;
    TextView star2402;
    TextView star2403;
    TextView star2501;
    TextView star2502;
    TextView star2503;

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
        TextView levLogo;
        for(int i=0;i<5;i++)
        {
          //  for(int j=1;i<4;i++)
           // {
            String noo;
              if (i<11) {
                  noo="levLogo"+"0"+Integer.toString(i);
              } else {
                  noo="levLogo"+Integer.toString(i);}
             levLogo = (TextView) findViewById(getResources().getIdentifier(noo, "id", getPackageName()));
             levLogo.setTypeface(font2);
            //}
        }

/*
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

*/
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
        star0101= (TextView) findViewById(R.id.levStar0101);
        star0101.setTypeface(font2);
        star0102= (TextView) findViewById(R.id.levStar0102);
        star0102.setTypeface(font2);
        star0103= (TextView) findViewById(R.id.levStar0103);
        star0103.setTypeface(font2);
        star0201= (TextView) findViewById(R.id.levStar0201);
        star0201.setTypeface(font2);
        star0202= (TextView) findViewById(R.id.levStar0202);
        star0202.setTypeface(font2);
        star0203= (TextView) findViewById(R.id.levStar0203);
        star0203.setTypeface(font2);
        star0301= (TextView) findViewById(R.id.levStar0301);
        star0301.setTypeface(font2);
        star0302= (TextView) findViewById(R.id.levStar0302);
        star0302.setTypeface(font2);
        star0303= (TextView) findViewById(R.id.levStar0303);
        star0303.setTypeface(font2);
        star0401= (TextView) findViewById(R.id.levStar0401);
        star0401.setTypeface(font2);
        star0402= (TextView) findViewById(R.id.levStar0402);
        star0402.setTypeface(font2);
        star0403= (TextView) findViewById(R.id.levStar0403);
        star0403.setTypeface(font2);
        star0501= (TextView) findViewById(R.id.levStar0501);
        star0501.setTypeface(font2);
        star0502= (TextView) findViewById(R.id.levStar0502);
        star0502.setTypeface(font2);
        star0503= (TextView) findViewById(R.id.levStar0503);
        star0503.setTypeface(font2);
        star0601= (TextView) findViewById(R.id.levStar0601);
        star0601.setTypeface(font2);
        star0602= (TextView) findViewById(R.id.levStar0602);
        star0602.setTypeface(font2);
        star0603= (TextView) findViewById(R.id.levStar0603);
        star0603.setTypeface(font2);
        star0701= (TextView) findViewById(R.id.levStar0701);
        star0701.setTypeface(font2);
        star0702= (TextView) findViewById(R.id.levStar0702);
        star0702.setTypeface(font2);
        star0703= (TextView) findViewById(R.id.levStar0703);
        star0703.setTypeface(font2);
        star0801= (TextView) findViewById(R.id.levStar0801);
        star0801.setTypeface(font2);
        star0802= (TextView) findViewById(R.id.levStar0802);
        star0802.setTypeface(font2);
        star0803= (TextView) findViewById(R.id.levStar0803);
        star0803.setTypeface(font2);
        star0901= (TextView) findViewById(R.id.levStar0901);
        star0901.setTypeface(font2);
        star0902= (TextView) findViewById(R.id.levStar0902);
        star0902.setTypeface(font2);
        star0903= (TextView) findViewById(R.id.levStar0903);
        star0903.setTypeface(font2);
        star1001= (TextView) findViewById(R.id.levStar1001);
        star1001.setTypeface(font2);
        star1002= (TextView) findViewById(R.id.levStar1002);
        star1002.setTypeface(font2);
        star1003= (TextView) findViewById(R.id.levStar1003);
        star1003.setTypeface(font2);
        star1101= (TextView) findViewById(R.id.levStar1101);
        star1101.setTypeface(font2);
        star1102= (TextView) findViewById(R.id.levStar1102);
        star1102.setTypeface(font2);
        star1103= (TextView) findViewById(R.id.levStar1103);
        star1103.setTypeface(font2);
        star1201= (TextView) findViewById(R.id.levStar1201);
        star1201.setTypeface(font2);
        star1202= (TextView) findViewById(R.id.levStar1202);
        star1202.setTypeface(font2);
        star1203= (TextView) findViewById(R.id.levStar1203);
        star1203.setTypeface(font2);
        star1301= (TextView) findViewById(R.id.levStar1301);
        star1301.setTypeface(font2);
        star1302= (TextView) findViewById(R.id.levStar1302);
        star1302.setTypeface(font2);
        star1303= (TextView) findViewById(R.id.levStar1303);
        star1303.setTypeface(font2);

        star1401= (TextView) findViewById(R.id.levStar1401);
        star1401.setTypeface(font2);
        star1402= (TextView) findViewById(R.id.levStar1402);
        star1402.setTypeface(font2);

        star1403= (TextView) findViewById(R.id.levStar1403);
        star1403.setTypeface(font2);
        star1501= (TextView) findViewById(R.id.levStar1501);
        star1501.setTypeface(font2);
        star1502= (TextView) findViewById(R.id.levStar1502);
        star1502.setTypeface(font2);
        star1503= (TextView) findViewById(R.id.levStar1503);
        star1503.setTypeface(font2);
        star1601= (TextView) findViewById(R.id.levStar1601);
        star1601.setTypeface(font2);
        star1602= (TextView) findViewById(R.id.levStar1602);
        star1602.setTypeface(font2);
        star1603= (TextView) findViewById(R.id.levStar1603);
        star1603.setTypeface(font2);
        star1701= (TextView) findViewById(R.id.levStar1701);
        star1701.setTypeface(font2);
        star1702= (TextView) findViewById(R.id.levStar1702);
        star1702.setTypeface(font2);
        star1703= (TextView) findViewById(R.id.levStar1703);
        star1703.setTypeface(font2);
        star1801= (TextView) findViewById(R.id.levStar1801);
        star1801.setTypeface(font2);
        star1802= (TextView) findViewById(R.id.levStar1802);
        star1802.setTypeface(font2);
        star1803= (TextView) findViewById(R.id.levStar1803);
        star1803.setTypeface(font2);
        star1901= (TextView) findViewById(R.id.levStar1901);
        star1901.setTypeface(font2);
        star1902= (TextView) findViewById(R.id.levStar1902);
        star1902.setTypeface(font2);
        star1903= (TextView) findViewById(R.id.levStar1903);
        star1903.setTypeface(font2);
        star2001= (TextView) findViewById(R.id.levStar2001);
        star2001.setTypeface(font2);
        star2002= (TextView) findViewById(R.id.levStar2002);
        star2002.setTypeface(font2);
        star2003= (TextView) findViewById(R.id.levStar2003);
        star2003.setTypeface(font2);
        star2101= (TextView) findViewById(R.id.levStar2101);
        star2101.setTypeface(font2);
        star2102= (TextView) findViewById(R.id.levStar2102);
        star2102.setTypeface(font2);
        star2103= (TextView) findViewById(R.id.levStar2103);
        star2103.setTypeface(font2);
        star2201= (TextView) findViewById(R.id.levStar2201);
        star2201.setTypeface(font2);
        star2202= (TextView) findViewById(R.id.levStar2202);
        star2202.setTypeface(font2);
        star2203= (TextView) findViewById(R.id.levStar2203);
        star2203.setTypeface(font2);
        star2301= (TextView) findViewById(R.id.levStar2301);
        star2301.setTypeface(font2);
        star2302= (TextView) findViewById(R.id.levStar2302);
        star2302.setTypeface(font2);
        star2303= (TextView) findViewById(R.id.levStar2303);
        star2303.setTypeface(font2);
        star2401= (TextView) findViewById(R.id.levStar2401);
        star2401.setTypeface(font2);
        star2402= (TextView) findViewById(R.id.levStar2402);
        star2402.setTypeface(font2);
        star2403= (TextView) findViewById(R.id.levStar2403);
        star2403.setTypeface(font2);
        star2501= (TextView) findViewById(R.id.levStar2501);
        star2501.setTypeface(font2);
        star2502= (TextView) findViewById(R.id.levStar2502);
        star2502.setTypeface(font2);
        star2503= (TextView) findViewById(R.id.levStar2503);
        star2503.setTypeface(font2);

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

        sp = new SharedPre(getApplicationContext());
        starsin=0;
        String userName="Name";
//
        try {
            //remove below line ht700 for lunch
            sp.Set("winstars",Integer.toString(1000));
            //end remove
           starsin=Integer.parseInt(sp.Get("winstars").toString());
            if (Integer.parseInt(sp.Get("winstars").toString())!=400400400){ starsin=Integer.parseInt(sp.Get("winstars").toString());}
            Log.e("sp.Get(winstars)", starsin+"");
        } catch(NumberFormatException nfe) {
            //	System.out.println("Could not parse " + nfe);
            starsin=0;
        }

        try {
            userName=(sp.Get("username"));
            if (userName=="400400400"){userName="Name!";}
            Log.e("userName", userName+"");
        } catch(NumberFormatException nfe) {
            //	System.out.println("Could not parse " + nfe);
            userName="Name"; }


        try {

        TextView tv1 = (TextView) findViewById(R.id.starsNo);
        tv1.setText(""+starsin);
        tv1 = (TextView) findViewById(R.id.tvUserName);
        tv1.setText(userName);

        } catch(NumberFormatException nfe) {}


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);
//        draw(getResources().getStringArray(R.array.type), 5);
//        //mehrnaz code for popUp items
        TextView txt= (TextView) findViewById(R.id.popUpIcMale);
        TextView txtstars= (TextView) findViewById(R.id.icon_star);
        TextView txtstars2= (TextView) findViewById(R.id.icon_star2);
        TextView txtstars3= (TextView) findViewById(R.id.icon_star3);
        TextView txtstars4= (TextView) findViewById(R.id.icon_star03);
        TextView txtstars5= (TextView) findViewById(R.id.icon_star02);
        TextView txtstars6= (TextView) findViewById(R.id.icon_star01);
        txt.setTypeface(font2);
        txtstars.setTypeface(font2);
        txtstars2.setTypeface(font2);
        txtstars3.setTypeface(font2);
        txtstars4.setTypeface(font2);
        txtstars5.setTypeface(font2);
        txtstars6.setTypeface(font2);
        final FrameLayout fl= (FrameLayout) findViewById(R.id.popupFrameLayout);


        fl.setVisibility(View.GONE);
//        //
//        //HT 748
        int winStars= getIntent().getIntExtra("winstars", 0);
        if (winStars!=0)
        {

            //777
            sp.Set("stars",Integer.toString(0));
            Log.e("winStars", winStars+"");
            CharSequence text = "You Win , " + winStars + " Stars";
            Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
            toast.show();
            TextView winSentence;
            winSentence=(TextView) findViewById(R.id.winSentence);
            switch (winStars){
                case 0:
                    winSentence.setText("You Lose!");

                    break;
                case 1:
                    //R.string.icon_trophy
                    winSentence.setText("Fine!");
                    winSentence=(TextView) findViewById(R.id.icon_star);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star01);
                    winSentence.setText(R.string.icon_star);
                    break;
                case 2:
                    winSentence.setText("You did it");
                    winSentence=(TextView) findViewById(R.id.icon_star);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star01);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star2);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star02);
                    winSentence.setText(R.string.icon_star);
                    break;
                case 3:
                    winSentence.setText("You made it");
                    winSentence=(TextView) findViewById(R.id.icon_star);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star01);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star2);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star02);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star3);
                    winSentence.setText(R.string.icon_star);
                    winSentence=(TextView) findViewById(R.id.icon_star03);
                    winSentence.setText(R.string.icon_star);
                    break;
            }

//            //mehrnaz
         fl.setVisibility(View.VISIBLE);
////
        final Animation myAnim = AnimationUtils.loadAnimation(Lev.this, R.anim.anim2);
           fl.startAnimation(myAnim);
//            //
//
           final RelativeLayout fm2= (RelativeLayout) findViewById(R.id.activity_main);
          fm2.setOnClickListener(new View.OnClickListener() {
////    @Override
   public void onClick(View v) {
      fl.setVisibility(v.GONE);
////
  }
});
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
levelselect
            }
 */
        }
    }

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
