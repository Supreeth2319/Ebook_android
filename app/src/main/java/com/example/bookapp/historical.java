package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class historical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);

        ImageView img =(ImageView) findViewById(R.id.imageView4);
        img.setClickable(true);
        img.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                gotourl("https://drive.google.com/file/d/1C_OhOMYjUdFIZ38dBm5DimHlwbEeSEUw/view?usp=sharing");
            }
        });

        ImageView img2 =(ImageView) findViewById(R.id.imageView9);
        img2.setClickable(true);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://drive.google.com/file/d/1Qw3Gy9s1OxXgAWatdAUg2udDNq28Ul-Q/view?usp=sharing");
            }
        });

        ImageView img3 =(ImageView) findViewById(R.id.imageView5);
        img3.setClickable(true);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://drive.google.com/file/d/1UNu2x2X4Vyhjvl2la9j0di6kJVCDu01B/view?usp=sharing");
            }
        });

        ImageView img30 =(ImageView) findViewById(R.id.imageView10);
        img3.setClickable(true);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://drive.google.com/file/d/1UNu2x2X4Vyhjvl2la9j0di6kJVCDu01B/view?usp=sharing");
            }
        })       ;

        ImageView img40 =(ImageView) findViewById(R.id.imageView6);
        img3.setClickable(true);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://drive.google.com/file/d/1Ej552QSL89ve6zkBOS6-z2mxy_teSLlG/view?usp=sharing");
            }
        })  ;

        ImageView img50 =(ImageView) findViewById(R.id.imageView7);
        img3.setClickable(true);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://drive.google.com/file/d/1UNu2x2X4Vyhjvl2la9j0di6kJVCDu01B/view?usp=sharing");
            }
        });

    }
    private void gotourl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}