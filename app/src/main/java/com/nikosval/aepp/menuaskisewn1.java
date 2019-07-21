package com.nikosval.aepp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;



public class menuaskisewn1 extends AppCompatActivity {
    private Button swstolathos;
    private static boolean RUN_ONCE = true;







    boolean isIncremented = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn1);
        SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs.getString("username", "UNKNOWN");

        SharedPreferences prefs11 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs11.getString("username", "UNKNOWN");
        Pref user=new Pref(this,usernameoflogin);
        swstolathos = (Button) findViewById(R.id.swstolathos1);
        TextView currentscoresl = (TextView) findViewById(R.id.currentscore);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore);
        TextView currentscoresmc = (TextView) findViewById(R.id.currentscoreformc);
        final TextView highestscoremc = (TextView) findViewById(R.id.highestscoreformc);


        SharedPreferences settings = getSharedPreferences("myprefsbro", 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);


        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn1.this);
            builder1.setMessage("Απάντησε σωστά σε όλες τις ερωτήσεις και ξεκλείδωσε τον Ironman!");
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

            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }




        Intent intent = getIntent();
        int score11 = intent.getIntExtra("score1", 0);
        double percentageofsl = ((double) score11 / 13) * 100;
        final SharedPreferences mypref = getSharedPreferences("mypref",MODE_PRIVATE);
         int highscore = mypref.getInt("HighScore", 0);

        Intent intent1 = getIntent();
        int scoreofmc = intent.getIntExtra("scoremc", 0);
        double percentageofmc = ((double) scoreofmc / 7) * 100;
        final SharedPreferences myprefmc = getPreferences(MODE_PRIVATE);
        int  highscoremc = mypref.getInt("HighScore1", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);

        if (percentageofsl > 50) {


            currentscoresl.setText("To σκορ σου στις ερωτήσεις Σωστου λαθους ειναι : " + score11 + "/13 (" + percentageofsl + "%)");
            currentscoresl.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscoresl.setText("To σκορ σου στις ερωτήσεις Σωστου λαθους ειναι : " + score11 + "/13  (" + percentageofsl + "%)");
            currentscoresl.setTextColor(getResources().getColor(R.color.colorAccent, null));


        }


        if (highscore >= score11) {

            double percentageofslhigest = ((double) highscore / 13) * 100;





            highestscore.setText("Το μεγαλύτερο σκορ στο σωστό-λάθος ειναι: " + highscore + "/13  (" + percentageofslhigest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore / 13) * 100;
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("HighScore", score11);
            editor.commit();
            highscore = mypref.getInt("HighScore", 0);





            highestscore.setText("Το μεγαλύτερο σκορ στο σωστό-λάθος ειναι: " + highscore + "/13  (" + percentageofslhigest + "%)");


        }



        Button pollaplhs = (Button) findViewById(R.id.multiplechoice1);


        if (percentageofmc > 50) {


            currentscoresmc.setText("To σκορ σου στις ερωτήσεις Πολλαπλής επιλογής είναι : " + scoreofmc + "/7 (" + percentageofmc + "%)");
            currentscoresmc.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscoresmc.setText("To σκορ σου στις ερωτήσεις πολλαπλής επιλογής είναι : " + scoreofmc + "/7  (" + percentageofmc + "%)");
            currentscoresmc.setTextColor(getResources().getColor(R.color.colorAccent, null));


        }

        if (highscoremc >= scoreofmc) {

            double percentageofmchigest = ((double) highscoremc / 7) * 100;


            highestscoremc.setText("Το μεγαλύτερο σκορ στις ερωτήσεις πολλαπλής επιλογής είναι: " + highscoremc + "/7  (" + percentageofmchigest + "%)");


        } else {
            double percentageofmchigest = ((double) highscoremc / 7) * 100;
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("HighScore1", scoreofmc);
            editor.commit();
              highscoremc = mypref.getInt("HighScore1", 0);





            highestscoremc.setText("Το μεγαλύτερο σκορ στις ερωτήσεις πολλαπλής επιλογής είναι: " + highscoremc + "/7  (" + percentageofmchigest + "%)");


        }



        int sinolikohighest =user.sethighscore(highscore,highscoremc);

        SharedPreferences mPrefsup = getSharedPreferences("giabadges1", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditorgiabadg = mPrefsup.edit();
        prefsEditorgiabadg.putInt("highestlevel1", sinolikohighest);
        prefsEditorgiabadg.commit();





        swstolathos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuaskisewn1.this, diagwnismakefalaio1.class));

            }
        });


        pollaplhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuaskisewn1.this, multiplechoicek1.class));

            }
        });




        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref.edit().clear().commit();
                myprefmc.edit().clear().commit();


            }
        });







        Cursor a = db.checkiflevelupdated2(usernameoflogin);
        a.moveToFirst();
        int value = a.getInt(0);


        if (value == 0) {
            if ((sinolikohighest) == 20) {


                if (RUN_ONCE == true) {


                    SharedPreferences prefs13 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs13.getString("username", "UNKNOWN");
                    SharedPreferences prefss = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss.getInt("level", 0);

                    db.UpdateLevel(usernameofloginn, level);
                    db.updatelevel1(usernameoflogin, level);

                    SharedPreferences foronlyonce = getSharedPreferences("runonce", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce.edit();
                    onceEditor.putBoolean("runonce", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce.getBoolean("runonce", false);




                    startActivity(new Intent(menuaskisewn1.this, LevelupActivity.class));


                }

            }
        }



    }



    public void onBackPressed() {


        Intent intentback = new Intent(menuaskisewn1.this, menu1okefalio.class);

        startActivity(intentback);


    }








    }





