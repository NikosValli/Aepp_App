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

public class thewria82 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria82);
        Button oxtw1=(Button)findViewById(R.id.button8_2);


        SharedPreferences preferences82 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor82 = preferences82.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox8_2);
        checkBox.setChecked(preferences82.getBoolean("checked8_2",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor82.putBoolean("checked8_2", isChecked);
                editor82.apply();


            }
        });

        oxtw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria82.this, thewria83.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewria82.this, menuthewrias8kefalaio.class));









    }
}