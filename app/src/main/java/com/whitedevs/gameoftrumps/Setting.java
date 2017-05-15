package com.whitedevs.gameoftrumps;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        TextView txtCircle1;
        TextView txtCircle2;
        TextView txtCircle3;
        Typeface font;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        txtVolume= (TextView) findViewById(R.id.txtVolume);
        txtVolume.setTypeface(font);
        txtVibration= (TextView) findViewById(R.id.txtVibration);
        txtVibration.setTypeface(font);
        txtCirclef= (TextView) findViewById(R.id.circlef);
        txtCirclef.setTypeface(font);
        txtCirclef2= (TextView) findViewById(R.id.circlef2);
        txtCirclef2.setTypeface(font);
        txtCirclef3= (TextView) findViewById(R.id.circlef3);
        txtCirclef3.setTypeface(font);
//        txtCircle1= (TextView) findViewById(R.id.circle1);
//        txtCircle1.setTypeface(font);
//        txtCircle2= (TextView) findViewById(R.id.circle2);
//        txtCircle2.setTypeface(font);
//        txtCircle3= (TextView) findViewById(R.id.circle3);
//        txtCircle3.setTypeface(font);
    }
}
