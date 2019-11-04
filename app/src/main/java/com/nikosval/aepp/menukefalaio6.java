package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menukefalaio6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukefalaio6);

        Button thewria=(Button)findViewById(R.id.thewria6);
        Button askhseis=(Button)findViewById(R.id.askhseis6);
        Button methodologia=(Button)findViewById(R.id.methodologia6);



        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio6.this, menuthewrias6kefalaio.class));
            }


        });


        methodologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio6.this, methodologiadontexist.class));
            }


        });


        askhseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio6.this, menuaskisewn6.class));
            }


        });


    }

    public void onBackPressed() {

        Intent intentback = new Intent(menukefalaio6.this, MenuActivity.class);
        startActivity(intentback);


    }
}
