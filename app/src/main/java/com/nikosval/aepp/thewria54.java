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

public class thewria54 extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria54);
        Button tesseradio=(Button)findViewById(R.id.button6_3);


        SharedPreferences preferences54 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor54 = preferences54.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox5_4);
        checkBox.setChecked(preferences54.getBoolean("checked5_4",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor54.putBoolean("checked5_4", isChecked);
                editor54.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria54.this, theoria55.class));
            }
        });
    }

    public void onBackPressed() {




        startActivity(new Intent(thewria54.this, menuthewrias5kefalaio.class));









    }


}
