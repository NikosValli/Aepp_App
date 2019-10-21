package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuthewrias6kefalaio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthewrias6kefalaio);
        Button eksi1=findViewById(R.id.exi1);
        Button eksi2=findViewById(R.id.eksi2);

        eksi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias6kefalaio.this, thewriaeksi1.class));
            }
        });

        eksi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthewrias6kefalaio.this, thewriaeksi2.class));
            }
        });


    }
    public void onBackPressed() {
        Intent intentback = new Intent(menuthewrias6kefalaio.this, menukefalaio6.class);
        startActivity(intentback);
    }
}
