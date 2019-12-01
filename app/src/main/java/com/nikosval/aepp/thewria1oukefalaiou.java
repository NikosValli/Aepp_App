package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class thewria1oukefalaiou extends AppCompatActivity {
    CheckBox check;
    ListView listview;
    private boolean isCheckedValue;

    RadioButton r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thewria1oukefalaiou);
        final ArrayList<Button> apothikevmenakeff = new ArrayList<>();
        ConstraintLayout linearLayout = findViewById(R.id.apothikevmena);
        Button button = findViewById(R.id.button);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();




        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox25);
        checkBox.setChecked(preferences.getBoolean("checked",false));


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                isCheckedValue = isChecked;
                editor.putBoolean("checked", isChecked);
                editor.apply();





            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thewria1oukefalaiou.this, thewria1_2.class));
            }
        });




    }
}



























