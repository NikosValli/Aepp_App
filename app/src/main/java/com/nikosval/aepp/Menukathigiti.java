















package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menukathigiti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukathigiti);
        Button gotoprotash;
        gotoprotash = (Button) findViewById(R.id.gotoprotaseis);

        gotoprotash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menukathigiti.this, protasherwthsewn.class));
            }
        });
    }
}