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

public class thewria53 extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria53);
        Button tesseradio=(Button)findViewById(R.id.button5_3);


        SharedPreferences preferences53 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor53 = preferences53.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox5_3);
        checkBox.setChecked(preferences53.getBoolean("checked5_3",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor53.putBoolean("checked5_3", isChecked);
                editor53.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria53.this, thewria54.class));
            }
        });
    }
}
