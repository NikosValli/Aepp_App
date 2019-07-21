package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ReadyfortestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_readyfortest);
        Button buttonyes=(Button)findViewById(R.id.buttonletsgototest);
        Button buttonno=(Button)findViewById(R.id.buttonletsgotomenu);


        buttonyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReadyfortestActivity.this, diagwnismakefalaio1.class));
            }
        });

        buttonno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReadyfortestActivity.this, menuthewrias1oukefaliou.class));
            }
        });
    }
}
