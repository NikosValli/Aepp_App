package com.nikosval.aepp;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class LevelupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_levelup);

        Button buttonok=(Button)findViewById(R.id.ButtonOK);

        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 finish();

            }
        });

    }
}
