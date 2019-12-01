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

public class thewria81 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria81);
        Button oxtw1=(Button)findViewById(R.id.button8_1);


        SharedPreferences preferences81 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor81 = preferences81.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox8_1);
        checkBox.setChecked(preferences81.getBoolean("checked8_1",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor81.putBoolean("checked8_1", isChecked);
                editor81.apply();


            }
        });

        oxtw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria81.this, thewria82.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewria81.this, menuthewrias8kefalaio.class));









    }
}
