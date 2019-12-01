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

public class thewriaefta4 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriaefta4);
        Button efta4=(Button)findViewById(R.id.button7_4);


        SharedPreferences preferences74 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor74 = preferences74.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox7_4);
        checkBox.setChecked(preferences74.getBoolean("checked7_4",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor74.putBoolean("checked7_4", isChecked);
                editor74.apply();


            }
        });

        efta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriaefta4.this, thewriaefta5.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewriaefta4.this, menuthewrias7kefalaio.class));









    }
}
