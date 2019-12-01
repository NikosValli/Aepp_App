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

public class thewriaefta3 extends AppCompatActivity {
    boolean isCheckedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriaefta3);
        Button efta3=(Button)findViewById(R.id.button7_3);


        SharedPreferences preferences73 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor73 = preferences73.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox7_3);
        checkBox.setChecked(preferences73.getBoolean("checked7_3",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor73.putBoolean("checked7_3", isChecked);
                editor73.apply();


            }
        });

        efta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriaefta3.this, thewriaefta4.class));
            }
        });
    }


    public void onBackPressed() {




        startActivity(new Intent(thewriaefta3.this, menuthewrias7kefalaio.class));









    }
}
