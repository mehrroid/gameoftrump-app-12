package com.whitedevs.gameoftrumps;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mehrnaz on 3/2/2017.
 */

public class Setting extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        TextView txtVolume;
        TextView txtVibration;
        TextView txtCirclef;
        TextView txtCirclef2;
        TextView txtCirclef3;
        TextView txtviewblue;
        TextView txtviewpink;
        TextView txtviewblack;
        Typeface font;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        txtVolume= (TextView) findViewById(R.id.txtVolumeIcon);
        txtVolume.setTypeface(font);
        txtVibration= (TextView) findViewById(R.id.txtVibrationIcon);
        txtVibration.setTypeface(font);
        txtviewblue= (TextView) findViewById(R.id.blueapp);
        txtviewblue.setTypeface(font);
        txtviewpink= (TextView) findViewById(R.id.pinkapp);
        txtviewpink.setTypeface(font);
        txtviewblack= (TextView) findViewById(R.id.blackapp);
        txtviewblack.setTypeface(font);
//        txtCircle1= (TextView) findViewById(R.id.circle1);
//        txtCircle1.setTypeface(font);
//        txtCircle2= (TextView) findViewById(R.id.circle2);
//        txtCircle2.setTypeface(font);
//        txtCircle3= (TextView) findViewById(R.id.circle3);
//        txtCircle3.setTypeface(font);


        txtviewblue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }

        });

        txtviewpink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout bgSetting = (LinearLayout) findViewById(R.id.bgSetting);
                bgSetting.setBackgroundResource(R.color.setPinkkBg);
                TextView tv = (TextView) findViewById(R.id.txtVolumeIcon);
                tv.setTextColor(getResources().getColor(R.color.setPinkfont));
                tv = (TextView) findViewById(R.id.txtVolumeText);
                tv.setTextColor(getResources().getColor(R.color.setPinkfont));
                tv = (TextView) findViewById(R.id.txtVibrationIcon);
                tv.setTextColor(getResources().getColor(R.color.setPinkfont));
                tv = (TextView) findViewById(R.id.txtVibrationText);
                tv.setTextColor(getResources().getColor(R.color.setPinkfont));
                tv = (TextView) findViewById(R.id.tvSky);
                tv.setTextColor(getResources().getColor(R.color.setPinkfont));
                tv = (TextView) findViewById(R.id.tvStrawberry);
                tv.setTextColor(getResources().getColor(R.color.setPinkfont));
                tv = (TextView) findViewById(R.id.tvNight);
                tv.setTextColor(getResources().getColor(R.color.setPinkfont));

            }

        });

        txtviewblack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                LinearLayout bgSetting = (LinearLayout) findViewById(R.id.bgSetting);
                bgSetting.setBackgroundResource(R.color.setBlackBg);
                TextView tv = (TextView) findViewById(R.id.txtVolumeIcon);
                tv.setTextColor(getResources().getColor(R.color.setBlackfont));
                tv = (TextView) findViewById(R.id.txtVolumeText);
                tv.setTextColor(getResources().getColor(R.color.setBlackfont));
                tv = (TextView) findViewById(R.id.txtVibrationIcon);
                tv.setTextColor(getResources().getColor(R.color.setBlackfont));
                tv = (TextView) findViewById(R.id.txtVibrationText);
                tv.setTextColor(getResources().getColor(R.color.setBlackfont));
                tv = (TextView) findViewById(R.id.tvSky);
                tv.setTextColor(getResources().getColor(R.color.setBlackfont));
                tv = (TextView) findViewById(R.id.tvStrawberry);
                tv.setTextColor(getResources().getColor(R.color.setBlackfont));
                tv = (TextView) findViewById(R.id.tvNight);
                tv.setTextColor(getResources().getColor(R.color.setBlackfont));
                //tvNight
                //tvStrawberry
                //tvSky
            }

        });
    }
    private void changeSetting (int in)
    {

    }
}
