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

public class thewria83 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria83);
        Button oxtw1=(Button)findViewById(R.id.button8_3);


        SharedPreferences preferences83 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor83 = preferences83.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox8_3);
        checkBox.setChecked(preferences83.getBoolean("checked8_3",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor83.putBoolean("checked8_3", isChecked);
                editor83.apply();


            }
        });

        oxtw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria83.this, thewria84.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewria83.this, menuthewrias8kefalaio.class));









    }
}
