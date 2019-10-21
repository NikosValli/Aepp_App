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

public class thewriatesseratessera extends AppCompatActivity {
boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatesseratessera);
        Button tesseradio=(Button)findViewById(R.id.button4_4);


        SharedPreferences preferences44 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor44 = preferences44.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox4_4);
        checkBox.setChecked(preferences44.getBoolean("checked4_4",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor44.putBoolean("checked4_1", isChecked);
                editor44.apply();


            }
        });

        tesseradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatesseratessera.this, menuthwrias4okefalaio.class));
            }
        });
    }
}
