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

public class thewriatriaena extends AppCompatActivity {
    boolean isCheckedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewriatriaena);
        Button triaena=(Button)findViewById(R.id.button3_1);

        SharedPreferences preferences31 = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor31 = preferences31.edit();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3_1);
        checkBox.setChecked(preferences31.getBoolean("checked3_1",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor31.putBoolean("checked3_1", isChecked);
                editor31.apply();


            }
        });

        triaena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewriatriaena.this, thewriatriadio.class));
            }
        });
    }
}
