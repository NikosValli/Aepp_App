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

public class thewria84 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria84);
        Button oxtw1=(Button)findViewById(R.id.button8_4);


        SharedPreferences preferences84 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor84 = preferences84.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox8_4);
        checkBox.setChecked(preferences84.getBoolean("checked8_4",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor84.putBoolean("checked8_4", isChecked);
                editor84.apply();


            }
        });

        oxtw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria84.this, thewria85.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewria84.this, menuthewrias8kefalaio.class));









    }
}
