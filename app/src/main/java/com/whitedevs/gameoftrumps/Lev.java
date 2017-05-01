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

        font2 = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        TextView txtg = (TextView) findViewById(R.id.game);
        txtg.setTypeface(font2);
        TextView txtsq1 = (TextView) findViewById(R.id.sqbg);
        TextView txtstar = (TextView) findViewById(R.id.star);
        txtstar.setTypeface(font2);
        TextView plus = (TextView) findViewById(R.id.pl);
        plus.setTypeface(font2);
        //mehrnaz lock
        TextView levLogo, levStar;
        FrameLayout FL;
        for (int i = 1; i <= 25; i++) {

            String NOLevLogo;
            String NOFL;
            if (i < 10) {
                NOLevLogo = "levLogo" + "0" + Integer.toString(i);
                NOFL = "fl" + "0" + Integer.toString(i);
            } else {
                NOLevLogo = "levLogo" + Integer.toString(i);
                NOFL = "fl"  + Integer.toString(i);
            }

            levLogo = (TextView) findViewById(getResources().getIdentifier(NOLevLogo, "id", getPackageName()));
            levLogo.setTypeface(font2);
            final int outI=i;
            Log.e("fl",i +"  " + NOFL);
            FL = (FrameLayout) findViewById(getResources().getIdentifier(NOFL, "id", getPackageName()));
            FL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.e("fl",outI +"  " + v);
                    playingGame(outI*2);}
            });

            for (int j = 1; j <= 3; j++) {
                String NOLevStar;
                if (i < 10) {
                    NOLevStar = "levStar" + "0" + Integer.toString(i) + "0" + Integer.toString(j);
                } else {
                    NOLevStar = "levStar" + Integer.toString(i) + "0" + Integer.toString(j);
                }
                levLogo = (TextView) findViewById(getResources().getIdentifier(NOLevStar, "id", getPackageName()));
                levLogo.setTypeface(font2);

            }
        }


        //
        cloudl1 = (TextView) findViewById(R.id.cloudl1);
        cloudl1.setTypeface(font2);
        cloudl2 = (TextView) findViewById(R.id.cloudl2);
        cloudl2.setTypeface(font2);
        cloudl3 = (TextView) findViewById(R.id.cloudl3);
        cloudl3.setTypeface(font2);
        cloudl4 = (TextView) findViewById(R.id.cloudl4);
        cloudl4.setTypeface(font2);
        cloudl5 = (TextView) findViewById(R.id.cloudl5);
        cloudl5.setTypeface(font2);
        // popUp items
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
        TextView topIcMale= (TextView) findViewById(R.id.topIcMale);
        topIcMale.setTypeface(font2);
        final FrameLayout flPopUp= (FrameLayout) findViewById(R.id.popupFrameLayout);


        flPopUp.setVisibility(View.GONE);

//        flPopUp.setVisibility(View.VISIBLE);

        final Animation myAnim = AnimationUtils.loadAnimation(Lev.this, R.anim.anim2);
        flPopUp.startAnimation(myAnim);


        final RelativeLayout fm2= (RelativeLayout) findViewById(R.id.activity_main);
        fm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flPopUp.setVisibility(v.GONE);

            }
        });
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);


//        Log.e("level", "R.layout.level");
//        container = (LinearLayout) findViewById(R.id.activity_main);
//        Log.e("level", "R.id.activity_main");
          sp = new SharedPre(getApplicationContext());
          starsin=0;
//        String userName="Name";
//
       try {
            //remove below line ht700 for lunch
            sp.Set("winstars",Integer.toString(1000));
            //end remove
           starsin=Integer.parseInt(sp.Get("winstars").toString());
           if (Integer.parseInt(sp.Get("winstars").toString())!=400400400){ starsin=Integer.parseInt(sp.Get("winstars").toString());}
            Log.e("sp.Get(winstars)", starsin+"");
        } catch(NumberFormatException nfe) {
//            //	System.out.println("Could not parse " + nfe);
//            starsin=0;
        }
       }
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

////items of header
////     ll
////        txtIconStar = (TextView) findViewById(R.id.txtstar);
////        txtIconStar.setTypeface(font2);
////        txtStarBg = (TextView) findViewById(R.id.txtstarbg);
////        txtStarBg.setTypeface(font2);
//

//        draw(getResources().getStringArray(R.array.type), 5);

        //
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
  private void playingGame(int in) {
        multi mlt = new multi();
      int icon;
      mlt.VibrationStart(1,getApplicationContext(),true);
      int levelselect=0;

        //  if (mInterstitialAd.isLoaded()) {
        //ht789  show ads
        //    mInterstitialAd.show();
        //  } else {
//        if(true){
//            switch (in) {
//                 case "00":
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
           levelselect=in;
           icon=R.string.icon_plus;

               if (levelselect!=1)
               {
                  starsin=starsin-2;
                   sp.Set("winstars",Integer.toString(starsin));
               }
                Intent intent = new Intent(Lev.this, Game.class);
                intent.putExtra("levelNo", (Integer)levelselect);
                startActivity(intent);

                /*
            if(true)
            {
levelselect
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
