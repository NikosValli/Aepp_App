package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menukefalaio5 extends AppCompatActivity {

    Button thewria;
    Button methodologia;
    Button askiseis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukefalaio5);

        thewria=findViewById(R.id.thewria5);
        methodologia=findViewById(R.id.methodologia5);
        askiseis=findViewById(R.id.askhseis5);

        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio5.this, menuthewrias5kefalaio.class));
            }
        });

        methodologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio5.this, methodologiadontexist.class));
            }
        });
        askiseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio5.this, menuaskisewn5.class));
            }
        });
    }

    public void onBackPressed() {

        Intent intentback = new Intent(menukefalaio5.this, MenuActivity.class);
        startActivity(intentback);


    }
}
