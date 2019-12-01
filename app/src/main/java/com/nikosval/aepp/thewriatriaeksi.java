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

public class thewriatriaeksi extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatriaeksi);
        Button triapent=(Button)findViewById(R.id.button3_6);
        SharedPreferences preferences36 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor36 = preferences36.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3_6);
        checkBox.setChecked(preferences36.getBoolean("checked3_6", false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor36.putBoolean("checked3_6", isChecked);
                editor36.apply();


            }
        });

        triapent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatriaeksi.this, menuthewrias3kefalaio.class));
            }
        });
    }
    public void onBackPressed() {




        startActivity(new Intent(thewriatriaeksi.this, menuthewrias3kefalaio.class));









    }
}