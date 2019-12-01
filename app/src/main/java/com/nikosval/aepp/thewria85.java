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

public class thewria85 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria85);
        Button oxtw1=(Button)findViewById(R.id.button8_5);


        SharedPreferences preferences85 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor85 = preferences85.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox8_5);
        checkBox.setChecked(preferences85.getBoolean("checked8_5",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor85.putBoolean("checked8_5", isChecked);
                editor85.apply();


            }
        });

        oxtw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria85.this, thewria86.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewria85.this, menuthewrias8kefalaio.class));









    }
}
