package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menukefalaio4 extends AppCompatActivity {
    Button thewria;
            Button methodologia;
            Button askiseis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukefalaio4);
        thewria=findViewById(R.id.thewria5);
        methodologia=findViewById(R.id.methodologia5);
        askiseis=findViewById(R.id.askhseis4);

        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio4.this, menuthwrias4okefalaio.class));
            }
        });

        methodologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio4.this, methodologiakefalaio4.class));
            }
        });
        askiseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukefalaio4.this, menuaskisewn4.class));
            }
        });
    }

    public void onBackPressed() {

        Intent intentback = new Intent(menukefalaio4.this, MenuActivity.class);
        startActivity(intentback);


    }
}
