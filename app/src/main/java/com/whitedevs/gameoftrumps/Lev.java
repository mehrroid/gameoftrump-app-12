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
   TextView levStar0101;
 TextView levStar0102;
    TextView levStar0103;
    TextView levStar0201;
    TextView levStar0202;
    TextView levStar0203;
    TextView levStar0301;
    TextView levStar0302;
    TextView levStar0303;
    TextView levStar0401;
    TextView levStar0402;
    TextView levStar0403;
    TextView levStar0404;
    TextView levStar0501;
    TextView levStar0502;
    TextView levStar0503;
    TextView levStar0601;
    TextView levStar0602;
    TextView levStar0603;
    TextView levStar0701;
    TextView levStar0702;
    TextView levStar0703;
    TextView levStar0801;
    TextView levStar0802;
    TextView levStar0803;
    TextView levStar0901;
    TextView levStar0902;
    TextView levStar0903;
    TextView levStar1001;
    TextView levStar1002;
    TextView levStar1003;
    TextView levStar1101;
    TextView levStar1102;
    TextView levStar1103;
    TextView levStar1201;
    TextView levStar1202;
    TextView levStar1203;
    TextView levStar1301;
    TextView levStar1302;
    TextView levStar1303;
    TextView levStar1401;
    TextView levStar1402;
    TextView levStar1403;
    TextView levStar1501;
    TextView levStar1502;
    TextView levStar1503;
    TextView levStar1601;
    TextView levStar1602;
    TextView levStar1603;
    TextView levStar1701;
    TextView levStar1702;
    TextView levStar1703;
    TextView levStar1801;
    TextView levStar1802;
    TextView levStar1803;
    TextView levStar1901;
    TextView levStar1902;
    TextView levStar1903;
    TextView levStar2001;
    TextView levStar2002;
    TextView levStar2003;
    TextView levStar2101;
    TextView levStar2102;
    TextView levStar2103;
    TextView levStar2201;
    TextView levStar2202;
    TextView levStar2203;
    TextView levStar2301;
    TextView levStar2302;
    TextView levStar2303;
    TextView levStar2401;
    TextView levStar2402;
    TextView levStar2403;
    TextView levStar2501;
    TextView levStar2502;
    TextView levStar2503;

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
        levStar0101 = (TextView) findViewById(R.id.levStar0101);
        levStar0101.setTypeface(font2);
        levStar0102= (TextView) findViewById(R.id.levStar0102);
        levStar0102.setTypeface(font2);
        levStar0103= (TextView) findViewById(R.id.levStar0103);
        levStar0103.setTypeface(font2);
        levStar0201= (TextView) findViewById(R.id.levStar0201);
        levStar0201.setTypeface(font2);
        levStar0202= (TextView) findViewById(R.id.levStar0202);
        levStar0202.setTypeface(font2);
        levStar0203= (TextView) findViewById(R.id.levStar0203);
        levStar0203.setTypeface(font2);
        levStar0301= (TextView) findViewById(R.id.levStar0301);
        levStar0301.setTypeface(font2);
        levStar0302= (TextView) findViewById(R.id.levStar0302);
        levStar0302.setTypeface(font2);
        levStar0303= (TextView) findViewById(R.id.levStar0303);
        levStar0303.setTypeface(font2);
        levStar0401= (TextView) findViewById(R.id.levStar0401);
        levStar0401.setTypeface(font2);
        levStar0402= (TextView) findViewById(R.id.levStar0402);
        levStar0402.setTypeface(font2);
        levStar0403= (TextView) findViewById(R.id.levStar0403);
        levStar0403.setTypeface(font2);
        levStar0501= (TextView) findViewById(R.id.levStar0501);
        levStar0501.setTypeface(font2);
        levStar0502= (TextView) findViewById(R.id.levStar0502);
        levStar0502.setTypeface(font2);
        levStar0503= (TextView) findViewById(R.id.levStar0503);
        levStar0503.setTypeface(font2);
        levStar0601= (TextView) findViewById(R.id.levStar0601);
        levStar0601.setTypeface(font2);
        levStar0602= (TextView) findViewById(R.id.levStar0602);
        levStar0602.setTypeface(font2);
        levStar0603= (TextView) findViewById(R.id.levStar0603);
        levStar0603.setTypeface(font2);
        levStar0701= (TextView) findViewById(R.id.levStar0701);
        levStar0701.setTypeface(font2);
        levStar0702= (TextView) findViewById(R.id.levStar0702);
        levStar0702.setTypeface(font2);
        levStar0703= (TextView) findViewById(R.id.levStar0703);
        levStar0703.setTypeface(font2);
        levStar0801= (TextView) findViewById(R.id.levStar0801);
        levStar0801.setTypeface(font2);
        levStar0802= (TextView) findViewById(R.id.levStar0802);
        levStar0802.setTypeface(font2);
        levStar0803= (TextView) findViewById(R.id.levStar0803);
        levStar0803.setTypeface(font2);
        levStar0901= (TextView) findViewById(R.id.levStar0901);
        levStar0901.setTypeface(font2);
        levStar0902= (TextView) findViewById(R.id.levStar0902);
        levStar0902.setTypeface(font2);
        levStar0903= (TextView) findViewById(R.id.levStar0903);
        levStar0903.setTypeface(font2);
        levStar1001= (TextView) findViewById(R.id.levStar1001);
        levStar1001.setTypeface(font2);
        levStar1002= (TextView) findViewById(R.id.levStar1002);
        levStar1002.setTypeface(font2);
        levStar1003= (TextView) findViewById(R.id.levStar1003);
        levStar1003.setTypeface(font2);
        levStar1101= (TextView) findViewById(R.id.levStar1101);
        levStar1101.setTypeface(font2);
        levStar1102= (TextView) findViewById(R.id.levStar1102);
        levStar1102.setTypeface(font2);
        levStar1103= (TextView) findViewById(R.id.levStar1103);
        levStar1103.setTypeface(font2);
        levStar1201= (TextView) findViewById(R.id.levStar1201);
        levStar1201.setTypeface(font2);
        levStar1202= (TextView) findViewById(R.id.levStar1202);
        levStar1202.setTypeface(font2);
        levStar1203= (TextView) findViewById(R.id.levStar1203);
        levStar1203.setTypeface(font2);
        levStar1301= (TextView) findViewById(R.id.levStar1301);
        levStar1301.setTypeface(font2);
        levStar1302= (TextView) findViewById(R.id.levStar1302);
        levStar1302.setTypeface(font2);
        levStar1303= (TextView) findViewById(R.id.levStar1303);
        levStar1303.setTypeface(font2);

        levStar1401= (TextView) findViewById(R.id.levStar1401);
        levStar1401.setTypeface(font2);
        levStar1402= (TextView) findViewById(R.id.levStar1402);
        levStar1402.setTypeface(font2);

        levStar1403= (TextView) findViewById(R.id.levStar1403);
        levStar1403.setTypeface(font2);
        levStar1501= (TextView) findViewById(R.id.levStar1501);
        levStar1501.setTypeface(font2);
        levStar1502= (TextView) findViewById(R.id.levStar1502);
        levStar1502.setTypeface(font2);
        levStar1503= (TextView) findViewById(R.id.levStar1503);
        levStar1503.setTypeface(font2);
        levStar1601= (TextView) findViewById(R.id.levStar1601);
        levStar1601.setTypeface(font2);
        levStar1602= (TextView) findViewById(R.id.levStar1602);
        levStar1602.setTypeface(font2);
        levStar1603= (TextView) findViewById(R.id.levStar1603);
        levStar1603.setTypeface(font2);
        levStar1701= (TextView) findViewById(R.id.levStar1701);
        levStar1701.setTypeface(font2);
        levStar1702= (TextView) findViewById(R.id.levStar1702);
        levStar1702.setTypeface(font2);
        levStar1703= (TextView) findViewById(R.id.levStar1703);
        levStar1703.setTypeface(font2);
        levStar1801= (TextView) findViewById(R.id.levStar1801);
        levStar1801.setTypeface(font2);
        levStar1802= (TextView) findViewById(R.id.levStar1802);
        levStar1802.setTypeface(font2);
        levStar1803= (TextView) findViewById(R.id.levStar1803);
        levStar1803.setTypeface(font2);
        levStar1901= (TextView) findViewById(R.id.levStar1901);
        levStar1901.setTypeface(font2);
        levStar1902= (TextView) findViewById(R.id.levStar1902);
        levStar1902.setTypeface(font2);
        levStar1903= (TextView) findViewById(R.id.levStar1903);
        levStar1903.setTypeface(font2);
        levStar2001= (TextView) findViewById(R.id.levStar2001);
        levStar2001.setTypeface(font2);
        levStar2002= (TextView) findViewById(R.id.levStar2002);
        levStar2002.setTypeface(font2);
        levStar2003= (TextView) findViewById(R.id.levStar2003);
        levStar2003.setTypeface(font2);
        levStar2101= (TextView) findViewById(R.id.levStar2101);
        levStar2101.setTypeface(font2);
        levStar2102= (TextView) findViewById(R.id.levStar2102);
        levStar2102.setTypeface(font2);
        levStar2103= (TextView) findViewById(R.id.levStar2103);
        levStar2103.setTypeface(font2);
        levStar2201= (TextView) findViewById(R.id.levStar2201);
        levStar2201.setTypeface(font2);
        levStar2202= (TextView) findViewById(R.id.levStar2202);
        levStar2202.setTypeface(font2);
        levStar2203= (TextView) findViewById(R.id.levStar2203);
        levStar2203.setTypeface(font2);
        levStar2301= (TextView) findViewById(R.id.levStar2301);
        levStar2301.setTypeface(font2);
        levStar2302= (TextView) findViewById(R.id.levStar2302);
        levStar2302.setTypeface(font2);
        levStar2303= (TextView) findViewById(R.id.levStar2303);
        levStar2303.setTypeface(font2);
        levStar2401= (TextView) findViewById(R.id.levStar2401);
        levStar2401.setTypeface(font2);
        levStar2402= (TextView) findViewById(R.id.levStar2402);
        levStar2402.setTypeface(font2);
        levStar2403= (TextView) findViewById(R.id.levStar2403);
        levStar2403.setTypeface(font2);
        levStar2501= (TextView) findViewById(R.id.levStar2501);
        levStar2501.setTypeface(font2);
        levStar2502= (TextView) findViewById(R.id.levStar2502);
        levStar2502.setTypeface(font2);
        levStar2503= (TextView) findViewById(R.id.levStar2503);
        levStar2503.setTypeface(font2);

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
