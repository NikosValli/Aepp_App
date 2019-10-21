package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class thewriatesseraena extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatesseraena);
        Button tesseradio=(Button)findViewById(R.id.button4_1);


        SharedPreferences preferences41 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor41 = preferences41.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox4_1);
        checkBox.setChecked(preferences41.getBoolean("checked4_1",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor41.putBoolean("checked4_1", isChecked);
                editor41.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatesseraena.this, thewriatesseradio.class));
            }
        });
    }
    }

