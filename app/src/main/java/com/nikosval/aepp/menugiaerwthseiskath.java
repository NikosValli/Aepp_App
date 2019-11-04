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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


public class menugiaerwthseiskath extends AppCompatActivity {
Button erwthseiskathigiti;
    ArrayList erwthsispouthaperasoun;
    CheckBox checkedkathigiti;
    CheckBox checkedkathigiti2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menugiaerwthseiskath);
        erwthseiskathigiti=(Button)findViewById(R.id.erwtkathig);
        erwthsispouthaperasoun=new ArrayList<>();




        SharedPreferences sharedPreferences=getSharedPreferences("oi erwthseis",MODE_PRIVATE);
        Gson gson=new Gson();
        String json=sharedPreferences.getString("oi erwthseiss",null);
        Type type=new TypeToken<ArrayList<String>>() {}.getType();
        erwthsispouthaperasoun=gson.fromJson(json,type);





        erwthseiskathigiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentk2 = new Intent(menugiaerwthseiskath.this, diagwnismakathigitwn.class);
                intentk2.putExtra("erwthseispoupernanee",erwthsispouthaperasoun);
                startActivity(intentk2);            }
        });





            }

    }











