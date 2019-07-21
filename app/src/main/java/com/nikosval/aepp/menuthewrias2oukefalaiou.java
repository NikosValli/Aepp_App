package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuthewrias2oukefalaiou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthewrias2oukefalaiou);

        Button prwtokefalaio=(Button)findViewById(R.id.dioena);
        Button deuterokefalaio=(Button) findViewById(R.id.diodio);
        Button tritokefalaio=(Button)findViewById(R.id.diotria);
        Button tetartokefalaio=(Button)findViewById(R.id.diotessera);
        prwtokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias2oukefalaiou.this, thewriadioena.class));
            }
        });
        deuterokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias2oukefalaiou.this, thewriadiodio.class));
            }
        });

        tritokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias2oukefalaiou.this, thewriadiotria.class));
            }
        });

        tetartokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias2oukefalaiou.this, thewriadiotessera.class));
            }
        });






    }
}
