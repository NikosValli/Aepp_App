package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class thewria15 extends AppCompatActivity {
    boolean isCheckedValue15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria15);
        SharedPreferences preferences15 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor15 = preferences15.edit();
        CheckBox checkBox15 = (CheckBox) findViewById(R.id.checkBox1_5);
        Button button15 = (Button) findViewById(R.id.button1_5);

        checkBox15.setChecked(preferences15.getBoolean("checked1_5", false));

        checkBox15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue15 = isChecked;
                editor15.putBoolean("checked1_5", isChecked);
                editor15.apply();


            }

        });


        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria15.this, ReadyfortestActivity.class));
            }
        });





    }


    public void onBackPressed() {




        startActivity(new Intent(thewria15.this, menuthewrias1oukefaliou.class));









    }
}
