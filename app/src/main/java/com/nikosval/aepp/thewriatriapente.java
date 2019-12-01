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

public class thewriatriapente extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatriapente);
        Button triapent=(Button)findViewById(R.id.button3_5);
        SharedPreferences preferences35 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor35 = preferences35.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3_5);
        checkBox.setChecked(preferences35.getBoolean("checked3_5", false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor35.putBoolean("checked3_5", isChecked);
                editor35.apply();


            }
        });

        triapent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatriapente.this, thewriatriaeksi.class));
            }
        });
    }
    public void onBackPressed() {




        startActivity(new Intent(thewriatriapente.this, menuthewrias3kefalaio.class));









    }
}
