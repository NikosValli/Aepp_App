package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu1okefalio extends AppCompatActivity {
    Button thewria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1okefalio);
      thewria=(Button)findViewById(R.id.thewria1);
      Button askiseis=(Button)findViewById(R.id.askhseis1);


        thewria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu1okefalio.this, menuthewrias1oukefaliou.class));
            }
        });


        askiseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu1okefalio.this, menuaskisewn1.class));
            }
        });
    }


    public void onBackPressed() {
        Intent intentback=new Intent(menu1okefalio.this,MenuActivity.class);
        startActivity(intentback);



    }




}
