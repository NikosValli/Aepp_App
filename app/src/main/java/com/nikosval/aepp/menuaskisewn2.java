package com.nikosval.aepp;

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
import android.widget.SeekBar;
import android.widget.TextView;

public class menuaskisewn2 extends AppCompatActivity {
    private Button swstolathos;
    private static boolean RUN_ONCE = true;
    TextView erwthseispouthaapantisei;
    private int seekbarvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn2);
        SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs.getString("username", "UNKNOWN");
        SharedPreferences prefs11 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs11.getString("username", "UNKNOWN");
        Pref user = new Pref(this, usernameoflogin);
        Button gotothetest = findViewById(R.id.gotothetest2);
        SeekBar seekbar=findViewById(R.id.seekBar);
        erwthseispouthaapantisei=(TextView)findViewById(R.id.erwthseispouthaapantisei);

        TextView currentscoresl = (TextView) findViewById(R.id.currentscore3);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore2);
        SharedPreferences settings = getSharedPreferences("myprefsbro", 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);

        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn2.this);
            builder1.setMessage("Απάντησε σωστά σε όλες τις ερωτήσεις και ξεκλείδωσε τον Thor!");
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
        int score2 = intent.getIntExtra("scorediagwnisma2", 0);
        double percentageoftest = ((double) score2 / 20) * 100;
        final SharedPreferences mypref2 = getSharedPreferences("mypref2", MODE_PRIVATE);
        int highscore = mypref2.getInt("HighScore2", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);


        if (percentageoftest > 50) {


            currentscoresl.setText("To σκορ σου στις ερωτήσεις Σωστου λαθους ειναι : " + score2 + "/20 (" + percentageoftest + "%)");
            currentscoresl.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscoresl.setText("To σκορ σου στις ερωτήσεις Σωστου λαθους ειναι : " + score2 + "/20  (" + percentageoftest + "%)");
            currentscoresl.setTextColor(getResources().getColor(R.color.colorAccent, null));


        }


        if (highscore >= score2) {

            double percentageofhighest = ((double) highscore / 20) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore + "/20  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore / 20) * 100;

            SharedPreferences.Editor editor = mypref2.edit();
            editor.putInt("HighScore2", score2);
            editor.commit();
            highscore = mypref2.getInt("HighScore2", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore + "/20  (" + percentageofslhigest + "%)");


        }      if (highscore >= score2) {

            double percentageofhighest = ((double) highscore / 20) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore + "/20  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore / 20) * 100;

            SharedPreferences.Editor editor = mypref2.edit();
            editor.putInt("HighScore2", score2);
            editor.commit();
            highscore = mypref2.getInt("HighScore2", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore + "/20  (" + percentageofslhigest + "%)");


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
                Intent startIntent = new Intent(getApplicationContext(), diagwnismakefalaio2.class);
                startIntent.putExtra("pernatoeuros", seekbarvalue);
                startActivity(startIntent);
            }
        });


        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref2.edit().clear().commit();


            }
        });


        Cursor a = db.checkiflevelupdated2(usernameoflogin);
        a.moveToFirst();
        int value = a.getInt(0);

        if (value == 0) {
            if ((highscore) == 20) {


                if (RUN_ONCE == true) {
                    SharedPreferences prefs13 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs13.getString("username", "UNKNOWN");
                    SharedPreferences prefss = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss.getInt("level", 0);
                    db.UpdateLevel(usernameofloginn, level); //PROVLHMA
                    db.updatelevel2(usernameoflogin, level);
                    SharedPreferences foronlyonce = getSharedPreferences("runonce2", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce.edit();
                    onceEditor.putBoolean("runonce2", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce.getBoolean("runonce2", false);
                    startActivity(new Intent(menuaskisewn2.this, LevelupActivity.class));

                }
            }
        }


    }


    public void onBackPressed() {
        Intent intentback = new Intent(menuaskisewn2.this, menu2okefalaio.class);
        startActivity(intentback);
    }
}
