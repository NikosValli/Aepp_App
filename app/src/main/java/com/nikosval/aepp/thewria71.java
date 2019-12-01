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

public class thewria71 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria71);
        Button efta1=(Button)findViewById(R.id.button7_1);


        SharedPreferences preferences71 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor71 = preferences71.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox7_1);
        checkBox.setChecked(preferences71.getBoolean("checked7_1",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor71.putBoolean("checked7_1", isChecked);
                editor71.apply();


            }
        });

        efta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria71.this, thewriaefta2.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewria71.this, menuthewrias7kefalaio.class));









    }
}
