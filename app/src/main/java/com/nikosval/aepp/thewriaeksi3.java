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

public class thewriaeksi3 extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriaeksi3);
        SharedPreferences preferences63 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor63 = preferences63.edit();
        Button tokatalava=(Button)findViewById(R.id.button6_3);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox6_3);
        checkBox.setChecked(preferences63.getBoolean("checked6_3",false));


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor63.putBoolean("checked6_3", isChecked);
                editor63.apply();


            }
        });



        tokatalava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriaeksi3.this, menuthewrias6kefalaio.class));
            }
        });
    }
}
