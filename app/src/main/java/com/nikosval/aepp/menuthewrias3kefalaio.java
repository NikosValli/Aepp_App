package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuthewrias3kefalaio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthewrias3kefalaio);
        Button prwtokefalio=(Button) findViewById(R.id.prwtokefalio3);
        Button deuterokefalaio=(Button) findViewById(R.id.deuterokefalaio3);
        Button tritokefalaio=(Button)findViewById(R.id.tritokefalaio3);
        Button tetartokefalaio=(Button)findViewById(R.id.tetartokefalaio3);
        Button pemptokefalaio=(Button)findViewById(R.id.pemptokefalaio);
        prwtokefalio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias3kefalaio.this, thewriatriaena.class));
            }
        });
        deuterokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias3kefalaio.this, thewriatriadio.class));
            }
        });
        tritokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias3kefalaio.this, thewriatriatria.class));
            }
        });
        tetartokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias3kefalaio.this, thewriatriatessera.class));
            }
        });

        pemptokefalaio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias3kefalaio.this, thewriatriapente.class));
            }
        });

    }

    public void onBackPressed() {
        Intent intentback=new Intent(menuthewrias3kefalaio.this,menukefalaio3.class);
        startActivity(intentback);}
}
