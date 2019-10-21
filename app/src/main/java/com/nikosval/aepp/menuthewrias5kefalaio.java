package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class menuthewrias5kefalaio extends AppCompatActivity {

    Button pente1;
    Button pente2;
    Button pente3;
    Button pente4;
    Button pente5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthewrias5kefalaio);
        pente1=findViewById(R.id.pente1);
        pente2=findViewById(R.id.pente2);
        pente3=findViewById(R.id.pente3);
        pente4=findViewById(R.id.pente4);
        pente5=findViewById(R.id.pente5);

        pente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias5kefalaio.this, thewria51.class));
            }
        });

        pente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias5kefalaio.this, thewria52.class));
            }
        });
        pente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias5kefalaio.this,thewria53.class));
            }
        });

        pente4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias5kefalaio.this, thewria54.class));
            }
        });

        pente5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias5kefalaio.this, theoria55.class));
            }
        });


    }

    public void onBackPressed() {
        Intent intentback = new Intent(menuthewrias5kefalaio.this, menukefalaio5.class);
        startActivity(intentback);
    }
}
