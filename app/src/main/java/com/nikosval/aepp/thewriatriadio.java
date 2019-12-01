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

public class thewriatriadio extends AppCompatActivity {
    boolean isCheckedValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatriadio);
        Button triadio=(Button)findViewById(R.id.button3_2) ;

        SharedPreferences preferences32 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor32 = preferences32.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3_2);
        checkBox.setChecked(preferences32.getBoolean("checked3_2",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor32.putBoolean("checked3_2", isChecked);
                editor32.apply();


            }
    });

        triadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatriadio.this, thewriatriatria.class));
            }
        });
}

    public void onBackPressed() {




        startActivity(new Intent(thewriatriadio.this, menuthewrias3kefalaio.class));









    }
}
