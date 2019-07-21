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

public class thewria1_2 extends AppCompatActivity {

    Boolean isCheckedValuee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria1_2);
        SharedPreferences preferencess = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editorr = preferencess.edit();
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox2);
        Button button2=(Button) findViewById(R.id.button2);

        checkBox.setChecked(preferencess.getBoolean("checked1_2",false));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValuee = isChecked;
                editorr.putBoolean("checked1_2", isChecked);
                editorr.apply();





            }

        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria1_2.this, thewria1_3.class));
            }
        });



    }
}
