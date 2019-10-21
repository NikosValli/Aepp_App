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

public class thewria52 extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria52);
        Button tesseradio=(Button)findViewById(R.id.button5_2);


        SharedPreferences preferences52 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor52 = preferences52.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox5_2);
        checkBox.setChecked(preferences52.getBoolean("checked5_2",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor52.putBoolean("checked5_2", isChecked);
                editor52.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria52.this, thewria53.class));
            }
        });
    }
}
