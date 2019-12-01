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

public class thewriadiotria extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriadiotria);
        Button button = findViewById(R.id.button);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor23 = preferences.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox25);
        checkBox.setChecked(preferences.getBoolean("checked2_3",false));


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor23.putBoolean("checked2_3", isChecked);
                editor23.apply();


            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriadiotria.this, thewriadiotessera.class));
            }
        });
    }

    public void onBackPressed() {




        startActivity(new Intent(thewriadiotria.this, menuthewrias2oukefalaiou.class));









    }
}

