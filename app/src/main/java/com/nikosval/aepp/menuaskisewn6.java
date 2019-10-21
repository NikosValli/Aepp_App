package com.nikosval.aepp;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class menuaskisewn6 extends AppCompatActivity {
    private static boolean RUN_ONCE = true;
    TextView erwthseispouthaapantisei;
    private int seekbarvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn6);
        SharedPreferences prefs6 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs6.getString("username", "UNKNOWN");
        SharedPreferences prefs66 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs66.getString("username", "UNKNOWN");
        Button gotothetest = findViewById(R.id.gotothetest6);
        Pref user = new Pref(this, usernameoflogin);
        TextView currentscore = (TextView) findViewById(R.id.currentscore6);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore6);
        SeekBar seekbar=findViewById(R.id.seekBar6);
        erwthseispouthaapantisei=(TextView)findViewById(R.id.erwthseispouthaapantisei6);
        SharedPreferences settings6 = getSharedPreferences("myprefsbro", 0);
        boolean dialogShown = settings6.getBoolean("dialogShown", false);

        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn6.this);
                builder1.setMessage("Απάντησε σωστά σε όλες τις ερωτήσεις και ξεκλείδωσε τον Thanos!");
            builder1.setCancelable(true);


            builder1.setPositiveButton(
                    "OK!",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });


            AlertDialog alert11 = builder1.create();
            alert11.show();

            SharedPreferences.Editor editor = settings6.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }

        Intent intent = getIntent();
        int score6 = intent.getIntExtra("scorediagwnisma6", 0);
        double percentageoftest = ((double) score6 / 10) * 100;
        final SharedPreferences mypref6 = getSharedPreferences("mypref6", MODE_PRIVATE);
        int highscore6 = mypref6.getInt("HighScore6", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);

        if (percentageoftest > 50) {


            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ είναι: " + score6 + "/10 (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ ειναι : " + score6 + "/10  (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorAccent, null));

        }


        if (highscore6 >= score6) {

            double percentageofhighest = ((double) highscore6 / 10) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore6 + "/10  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore6 / 10) * 100;

            SharedPreferences.Editor editor = mypref6.edit();
            editor.putInt("HighScore6", score6);
            editor.commit();
            highscore6 = mypref6.getInt("HighScore6", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore6 + "/10  (" + percentageofslhigest + "%)");


        }

        if (highscore6 >= score6) {

            double percentageofhighest = ((double) highscore6 / 10) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore6 + "/10  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore6 / 10) * 100;

            SharedPreferences.Editor editor = mypref6.edit();
            editor.putInt("HighScore6", score6);
            editor.commit();
            highscore6 = mypref6.getInt("HighScore6", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore6 + "/10  (" + percentageofslhigest + "%)");


        }

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                seekbarvalue = progress;



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                erwthseispouthaapantisei.setText("Θέλω να απαντήσω "+seekbarvalue+" ερωτήσεις.");

            }
        });




        gotothetest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), diagwnismak6.class);
                startIntent.putExtra("pernatoeuros6", seekbarvalue);
                startActivity(startIntent);            }
        });



        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref6.edit().clear().commit();


            }
        });

        Cursor a6 = db.checkiflevelupdated6(usernameoflogin);
        a6.moveToFirst();
        int value = a6.getInt(0);

        if (value == 0) {
            if ((highscore6) == 10) {


                if (RUN_ONCE == true) {
                    SharedPreferences prefs16 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs16.getString("username", "UNKNOWN");
                    SharedPreferences prefss6 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss6.getInt("level", 0);
                    db.UpdateLevel(usernameofloginn, level); //PROVLHMA
                    db.updatelevel6(usernameoflogin, level);
                    SharedPreferences foronlyonce6 = getSharedPreferences("runonce6", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce6.edit();
                    onceEditor.putBoolean("runonce6", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce6.getBoolean("runonce6", false);
                    startActivity(new Intent(menuaskisewn6.this, LevelupActivity.class));

                }
            }
        }

    }

    public void onBackPressed() {
        Intent intentback = new Intent(menuaskisewn6.this, menukefalaio6.class);
        startActivity(intentback);}


}
