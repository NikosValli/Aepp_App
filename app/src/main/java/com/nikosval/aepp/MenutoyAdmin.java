package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenutoyAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutoy_admin);


        Button showopinions=(Button)findViewById(R.id.showopinions);
        Button showerwthseis=(Button)findViewById(R.id.showerwthseis);


        showopinions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MenutoyAdmin.this, showopinions.class));


            }


        });


        showerwthseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MenutoyAdmin.this, showerwthseis.class));


            }


        });






    }
}
