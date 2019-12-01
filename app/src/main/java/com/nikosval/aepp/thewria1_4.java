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

public class thewria1_4 extends AppCompatActivity {
boolean isCheckedValue14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria1_4);
        SharedPreferences preferences14 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor14 = preferences14.edit();
        CheckBox checkBox14 = (CheckBox) findViewById(R.id.checbox1_4);
        Button button14 = (Button) findViewById(R.id.buttonteleiwsethewria);

        checkBox14.setChecked(preferences14.getBoolean("checked1_4", false));

        checkBox14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue14 = isChecked;
                editor14.putBoolean("checked1_4", isChecked);
                editor14.apply();


            }

        });


        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria1_4.this, thewria15.class));
            }
        });





    }


    public void onBackPressed() {




        startActivity(new Intent(thewria1_4.this, menuthewrias1oukefaliou.class));









    }
}
