package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuthewrias1oukefaliou extends AppCompatActivity {
         Button prwtokefalio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthewrias1oukefaliou);
        prwtokefalio=(Button) findViewById(R.id.prwtokefalio);
        Button deuterokefalaio=(Button) findViewById(R.id.button5);
        Button tritokefalaio=(Button)findViewById(R.id.button6);
        Button tetartokefalaio=(Button)findViewById(R.id.button7);


        prwtokefalio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias1oukefaliou.this, thewria1oukefalaiou.class));
            }
        });

        deuterokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias1oukefaliou.this, thewria1_2.class));
            }
        });

        tritokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias1oukefaliou.this, thewria1_3.class));
            }
        });

        tetartokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias1oukefaliou.this, thewria1_4.class));
            }
        });
    }


    public void onBackPressed() {
        Intent intentback=new Intent(menuthewrias1oukefaliou.this,menu1okefalio.class);
        startActivity(intentback);



    }
}
