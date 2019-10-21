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

public class thewriatesseratria extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatesseratria);
        Button tesseradio=(Button)findViewById(R.id.button4_3);


        SharedPreferences preferences43 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor43 = preferences43.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox4_3);
        checkBox.setChecked(preferences43.getBoolean("checked4_3",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor43.putBoolean("checked4_3", isChecked);
                editor43.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatesseratria.this, thewriatesseratessera.class));
            }
        });
    }
}
