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

public class thewriaeksi1 extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriaeksi1);

        SharedPreferences preferences61 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor61= preferences61.edit();
        Button eksi1=(Button)findViewById(R.id.button6_3);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox6_1);
        checkBox.setChecked(preferences61.getBoolean("checked6_1",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor61.putBoolean("checked6_1", isChecked);
                editor61.apply();


            }
        });

        eksi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriaeksi1.this, thewriaeksi2.class));
            }
        });
    }

    public void onBackPressed() {




        startActivity(new Intent(thewriaeksi1.this, menuthewrias6kefalaio.class));









    }
}
