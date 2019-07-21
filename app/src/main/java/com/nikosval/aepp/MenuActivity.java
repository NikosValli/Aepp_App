package com.nikosval.aepp;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuInflater;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;

import android.support.design.widget.BottomNavigationView;

import android.view.MenuItem;
import android.view.View;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private TextView logotext;
    private ImageView logoimage;
    Typeface introfont1;
    private ImageButton kefalaio1;
    ImageButton apothikevmena;
    TextView epipedo;
    ListView apothikevmenakef;
    ListView search_ennoies;
    ImageButton badges;
    ImageButton logout;
    ArrayAdapter<String> adapter;
    Toolbar toolbarofuser;
    DataBaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        db = new DataBaseHelper(this);

        SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);

        String username = prefs.getString("username", "UNKNOWN");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarofuser);
        toolbar.setTitle("Καλώς ήρθες "+ username+" !");


            db.addhighlevel(username,0,0 );
            db.addhighlevel2(username,0,0 );





        Cursor data=db.showLevel(username);
        StringBuffer buffer=new StringBuffer();
        while (data.moveToNext()) {


            buffer.append("Επίπεδο: " + data.getInt(0));
            SharedPreferences prefss = getSharedPreferences("MyApp", MODE_PRIVATE);
            prefss.edit().putInt("level", data.getInt(0)).apply();

        };



        epipedo=(TextView)findViewById(R.id.epipedo);
        epipedo.setText(buffer);



        ArrayList<Button> apothikevmenakeff = new ArrayList<>();

        logoimage = (ImageView) findViewById(R.id.logoo);
        logotext = (TextView) findViewById(R.id.logotext);
        introfont1 = Typeface.createFromAsset(this.getAssets(), "fonts/NotoSans-MediumItalic.ttf");
        logotext.setTypeface(introfont1);
        kefalaio1 = (ImageButton) findViewById(R.id.imageButton4);
        apothikevmena = (ImageButton) findViewById(R.id.imageButton2);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.search_ennoies);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        badges=(ImageButton)findViewById(R.id.badges);
        ImageButton kefalaio2=(ImageButton) findViewById(R.id.algortihms);


        kefalaio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, menu1okefalio.class));
            }
        });

        kefalaio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, menu2okefalaio.class));
            }
        });


        apothikevmena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, apothikevmena.class));
            }
        });


        badges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, BadgesActivity.class));
            }
        });

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        logoimage.startAnimation(myanim);
        logotext.startAnimation(myanim);









    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.search_ennoies:

                            startActivity(new Intent(MenuActivity.this, SearchActivity.class));



                            break;


                    }

                    return true;


                }
            };



    public void onBackPressed() {



        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Log out")
                .setMessage("Θες να αποσυνδεθείς απο την εφαρμογή?")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        SharedPreferences preferences =getSharedPreferences("mypref",Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.clear();
                        editor.commit();
                        finish();  //FTIAKSE LOGOUTTTTTTTTT GIA NA DOULEPSEIIIII
                        SharedPreferences preferences2 =getSharedPreferences("mypref2",Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor2 = preferences2.edit();
                        editor2.clear();
                        editor2.commit();
                        finish();  //FTIAKSE LOGOUTTTTTTTTT GIA NA DOULEPSEIIIII
                        startActivity(new Intent(MenuActivity.this, LoginActivity.class));


                    }

                })
                .setNegativeButton("Οχι", null)
                .show();










    }












    }












