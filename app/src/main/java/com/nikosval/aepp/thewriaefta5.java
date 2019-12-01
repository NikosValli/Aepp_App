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

public class thewriaefta5 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriaefta5);
        Button efta5=(Button)findViewById(R.id.button7_5);


        SharedPreferences preferences75 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor75 = preferences75.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox7_5);
        checkBox.setChecked(preferences75.getBoolean("checked7_5",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor75.putBoolean("checked7_5", isChecked);
                editor75.apply();


            }
        });

        efta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriaefta5.this, menuthewrias7kefalaio.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewriaefta5.this, menuthewrias7kefalaio.class));









    }
}
