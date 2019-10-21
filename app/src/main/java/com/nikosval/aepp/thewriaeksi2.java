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

public class thewriaeksi2 extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriaeksi2);

        SharedPreferences preferences62 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor62 = preferences62.edit();
        Button eksi2=(Button)findViewById(R.id.button6_2);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox6_2);
        checkBox.setChecked(preferences62.getBoolean("checked6_2",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor62.putBoolean("checked6_2", isChecked);
                editor62.apply();


            }
        });
        eksi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriaeksi2.this, thewriaeksi3.class));
            }
        });
    }
}
