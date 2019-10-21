package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menukefalaio3 extends AppCompatActivity {

    Button thewria;
    Button askiseis;
    Button methodologia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukefalaio3);
        thewria = (Button) findViewById(R.id.thewria5);
        methodologia = (Button) findViewById(R.id.methodologia3);
        askiseis = (Button) findViewById(R.id.askhseis3);


        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio3.this, menuthewrias3kefalaio.class));
            }


        });

        methodologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio3.this, methodologia3kefalaio.class));
            }
        });


        askiseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio3.this, menuaskisewn3.class));
            }
        });
    }


    public void onBackPressed() {

        Intent intentback = new Intent(menukefalaio3.this, MenuActivity.class);
        startActivity(intentback);


    }
    }

