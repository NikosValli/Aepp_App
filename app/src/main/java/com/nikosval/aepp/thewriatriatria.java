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

public class thewriatriatria extends AppCompatActivity {
    boolean isCheckedValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatriatria);
        Button triatria=(Button)findViewById(R.id.button3_3);

        SharedPreferences preferences33 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor33 = preferences33.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3_3);
        checkBox.setChecked(preferences33.getBoolean("checked3_3",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor33.putBoolean("checked3_3", isChecked);
                editor33.apply();


            }

         });

        triatria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatriatria.this, thewriatriatessera.class));
            }
        });
}
}
