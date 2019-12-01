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

public class thewriatesseradio extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatesseradio);
        Button tesseradio=(Button)findViewById(R.id.button4_2);


        SharedPreferences preferences42 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor42 = preferences42.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox4_2);
        checkBox.setChecked(preferences42.getBoolean("checked4_2",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor42.putBoolean("checked4_2", isChecked);
                editor42.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatesseradio.this, thewriatesseratria.class));
            }
        });
    }

}
