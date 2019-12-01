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

public class thewriadiopente extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriadiopente);
        Button button = findViewById(R.id.button25);
        SharedPreferences preferences25 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor25 = preferences25.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox25);
        checkBox.setChecked(preferences25.getBoolean("checked2_5",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor25.putBoolean("checked2_5", isChecked);
                editor25.apply();


            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriadiopente.this, menuthewrias2oukefalaiou.class));
            }
        });






    }

    public void onBackPressed() {




        startActivity(new Intent(thewriadiopente.this, menuthewrias2oukefalaiou.class));









    }


}

