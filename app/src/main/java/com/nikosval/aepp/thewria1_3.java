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

public class thewria1_3 extends AppCompatActivity {
boolean ischecked13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria1_3);
        SharedPreferences preferences13 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor13 = preferences13.edit();
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox1_3);
        Button nextfrom13=(Button) findViewById(R.id.button1_3);

        checkBox.setChecked(preferences13.getBoolean("checked1_3",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                ischecked13 = isChecked;
                editor13.putBoolean("checked1_3", isChecked);
                editor13.apply();





            }

        });

         nextfrom13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria1_3.this, thewria1_4.class));
            }
        });


    }
}
