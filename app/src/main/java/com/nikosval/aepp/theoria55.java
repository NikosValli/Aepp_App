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

public class theoria55 extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theoria55);
        Button tesseradio=(Button)findViewById(R.id.button5_5);


        SharedPreferences preferences55 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor55 = preferences55.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox5_5);
        checkBox.setChecked(preferences55.getBoolean("checked5_5",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor55.putBoolean("checked5_5", isChecked);
                editor55.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(theoria55.this, menuthewrias5kefalaio.class));
            }
        });
    }
}
