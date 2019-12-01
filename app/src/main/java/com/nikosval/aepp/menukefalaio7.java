package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menukefalaio7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukefalaio7);

        Button thewria=(Button)findViewById(R.id.thewria7);
        Button askhseis=(Button)findViewById(R.id.askhseis7);
        Button methodologia=(Button)findViewById(R.id.methodologia7);



        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio7.this, menuthewrias7kefalaio.class));
            }


        });


        methodologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio7.this, methodologiadontexist.class));
            }


        });


        askhseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio7.this, menuaskisewn7.class));
            }


        });


    }

    public void onBackPressed() {

        Intent intentback = new Intent(menukefalaio7.this, MenuActivity.class);
        startActivity(intentback);


    }
}
