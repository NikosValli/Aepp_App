package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuthewrias7kefalaio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthewrias7kefalaio);
        Button efta1=findViewById(R.id.efta1);
        Button efta2=findViewById(R.id.efta2);
        Button efta3=findViewById(R.id.efta3);
        Button efta4=findViewById(R.id.efta4);
        Button efta5=findViewById(R.id.efta5);



        efta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias7kefalaio.this, thewria71.class));
            }
        });

        efta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias7kefalaio.this, thewriaefta2.class));
            }
        });

        efta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias7kefalaio.this, thewriaefta3.class));
            }
        });

        efta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias7kefalaio.this, thewriaefta4.class));
            }
        });

        efta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias7kefalaio.this, thewriaefta5.class));
            }
        });


    }
    public void onBackPressed() {
        Intent intentback = new Intent(menuthewrias7kefalaio.this, menukefalaio7.class);
        startActivity(intentback);
    }
}
