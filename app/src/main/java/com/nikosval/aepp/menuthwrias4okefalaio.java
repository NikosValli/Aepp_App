package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuthwrias4okefalaio extends AppCompatActivity {

    Button thewriatessera1;
    Button thewriatessera2;
    Button thewriatessera3;
    Button thewriatessera4;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuthwrias4okefalaio);
        thewriatessera1=findViewById(R.id.tessera1);
        thewriatessera2=findViewById(R.id.tessera2);
        thewriatessera3=findViewById(R.id.tesseratria);
        thewriatessera4=findViewById(R.id.tessera4);

        thewriatessera1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthwrias4okefalaio.this, thewriatesseraena.class));
            }
        });

        thewriatessera2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthwrias4okefalaio.this, thewriatesseradio.class));
            }
        });
        thewriatessera3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthwrias4okefalaio.this, thewriatesseratria.class));
            }
        });

        thewriatessera4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuthwrias4okefalaio.this, thewriatesseratessera.class));
            }
        });

    }

    public void onBackPressed() {
        Intent intentback=new Intent(menuthwrias4okefalaio.this,menukefalaio4.class);
        startActivity(intentback);
    }
}
