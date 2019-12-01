package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menukefalaio8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukefalaio8);

        Button thewria=(Button)findViewById(R.id.thewria8);
        Button askhseis=(Button)findViewById(R.id.askhseis8);
        Button methodologia=(Button)findViewById(R.id.methodologia8);



        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio8.this, menuthewrias8kefalaio.class));
            }


        });


        methodologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio8.this, methodologiadontexist.class));
            }


        });


        askhseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio8.this, menuaskisewn8.class));
            }


        });


    }

    public void onBackPressed() {

        Intent intentback = new Intent(menukefalaio8.this, MenuActivity.class);
        startActivity(intentback);


    }
}
