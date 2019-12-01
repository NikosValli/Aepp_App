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

public class thewria86 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria86);
        Button oxtw6=(Button)findViewById(R.id.button8_6);


        SharedPreferences preferences86 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor86 = preferences86.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox8_6);
        checkBox.setChecked(preferences86.getBoolean("checked8_6",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor86.putBoolean("checked8_6", isChecked);
                editor86.apply();


            }
        });

        oxtw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria86.this, menuthewrias8kefalaio.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewria86.this, menuthewrias8kefalaio.class));









    }
}
