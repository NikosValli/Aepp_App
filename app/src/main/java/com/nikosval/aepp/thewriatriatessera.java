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

public class thewriatriatessera extends AppCompatActivity {
    boolean isCheckedValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatriatessera);
        Button triatessera=(Button)findViewById(R.id.button3_4);
        SharedPreferences preferences34 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor34 = preferences34.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3_4);
        checkBox.setChecked(preferences34.getBoolean("checked3_4",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor34.putBoolean("checked3_4", isChecked);
                editor34.apply();


            }
    });

        triatessera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatriatessera.this, thewriatriapente.class));
            }
        });
}


    public void onBackPressed() {




        startActivity(new Intent(thewriatriatessera.this, menuthewrias3kefalaio.class));









    }
}
