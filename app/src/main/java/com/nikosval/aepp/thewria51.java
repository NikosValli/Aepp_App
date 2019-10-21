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

public class thewria51 extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria51);
        Button tesseradio=(Button)findViewById(R.id.button5_1);


        SharedPreferences preferences51 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor51 = preferences51.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox5_1);
        checkBox.setChecked(preferences51.getBoolean("checked5_1",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor51.putBoolean("checked5_1", isChecked);
                editor51.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria51.this, thewria52.class));
            }
        });
    }
}
