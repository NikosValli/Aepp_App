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

public class thewriaefta2 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriaefta2);
        Button efta2=(Button)findViewById(R.id.button7_2);


        SharedPreferences preferencesefta2 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor72 = preferencesefta2.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox7_2);
        checkBox.setChecked(preferencesefta2.getBoolean("checked7_2",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor72.putBoolean("checked7_2", isChecked);
                editor72.apply();


            }
        });

        efta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriaefta2.this, thewriaefta3.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewriaefta2.this, menuthewrias7kefalaio.class));









    }
}
