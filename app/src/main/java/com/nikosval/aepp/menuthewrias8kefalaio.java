package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuthewrias8kefalaio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthewrias8kefalaio);
        Button oxtw1=findViewById(R.id.oxtw1);
        Button oxtw2=findViewById(R.id.oxtw2);
        Button oxtw3=findViewById(R.id.oxtw3);
        Button oxtw4=findViewById(R.id.oxtw4);
        Button oxtw5=findViewById(R.id.oxtw5);
        Button oxtw6=findViewById(R.id.oxtw6);




        oxtw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias8kefalaio.this, thewria81.class));
            }
        });

        oxtw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias8kefalaio.this, thewria82.class));
            }
        });

        oxtw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias8kefalaio.this, thewria83.class));
            }
        });

        oxtw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias8kefalaio.this, thewria84.class));
            }
        });

        oxtw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias8kefalaio.this, thewria85.class));
            }
        });

        oxtw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias8kefalaio.this, thewria86.class));
            }
        });

    }
    public void onBackPressed() {
        Intent intentback = new Intent(menuthewrias8kefalaio.this, menukefalaio8.class);
        startActivity(intentback);
    }
}
