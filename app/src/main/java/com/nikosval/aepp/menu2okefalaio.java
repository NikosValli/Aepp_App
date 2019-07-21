package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu2okefalaio extends AppCompatActivity {
    Button thewria;
Button askiseis;
Button methodologia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2okefalaio);
        thewria=(Button)findViewById(R.id.thewria2);
        methodologia=(Button)findViewById(R.id.methodologia2);
        askiseis=(Button)findViewById(R.id.askhseis2);

        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu2okefalaio.this, menuthewrias2oukefalaiou.class));
            }


        });

        methodologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu2okefalaio.this,methodologia2.class));
            }
        });


        askiseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu2okefalaio.this,menuaskisewn2.class));
            }
        });


    }

    public void onBackPressed() {
        Intent intentback = new Intent(menu2okefalaio.this, MenuActivity.class);
        startActivity(intentback);
    }}
