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

public class menuaskisewn7 extends AppCompatActivity {
    private static boolean RUN_ONCE = true;
    TextView erwthseispouthaapantisei;
    private int seekbarvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn7);
        SharedPreferences prefs7 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs7.getString("username", "UNKNOWN");
        SharedPreferences prefs77 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs77.getString("username", "UNKNOWN");
        Button gotothetest = findViewById(R.id.gotothetest7);
        Pref user = new Pref(this, usernameoflogin);
        TextView currentscore = (TextView) findViewById(R.id.currentscore7);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore7);
        SeekBar seekbar=findViewById(R.id.seekBar7);
        erwthseispouthaapantisei=(TextView)findViewById(R.id.erwthseispouthaapantisei7);
        SharedPreferences settings7 = getSharedPreferences("myprefsbro", 0);
        boolean dialogShown = settings7.getBoolean("dialogShown", false);
        SharedPreferences prefs = getSharedPreferences("osesapantisa7", MODE_PRIVATE);
        int osesapantisa = prefs.getInt("osesapantisa7", 20); //0 is the default value.

        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn7.this);
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

            SharedPreferences.Editor editor = settings7.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }

        Intent intent = getIntent();
        int score7 = intent.getIntExtra("scorediagwnisma7", 0);
        double percentageoftest = ((double) score7 / osesapantisa) * 100;
        percentageoftest=round(percentageoftest, 1);

        final SharedPreferences mypref7 = getSharedPreferences("mypref7", MODE_PRIVATE);
        int highscore7 = mypref7.getInt("HighScore7", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);

        if (percentageoftest > 50) {


            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ είναι: " + score7 + "/"+osesapantisa+" (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ ειναι : " + score7 + "/"+osesapantisa+"  (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorAccent, null));

        }


        if (highscore7 >= score7) {

            double percentageofhighest = ((double) highscore7 / 10) * 100; //aitia gia highscore emfanisi
            percentageofhighest=round(percentageofhighest, 1);



            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore7 + "/10  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore7 / 10) * 100;
            percentageofslhigest=round(percentageofslhigest, 1);


            SharedPreferences.Editor editor = mypref7.edit();
            editor.putInt("HighScore6", score7);
            editor.commit();
            highscore7 = mypref7.getInt("HighScore7", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore7 + "/10  (" + percentageofslhigest + "%)");


        }

        if (highscore7 >= score7) {

            double percentageofhighest = ((double) highscore7/ 10) * 100; //aitia gia highscore emfanisi
            percentageofhighest=round(percentageofhighest, 1);



            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore7 + "/10  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore7 / 10) * 100;
            percentageofslhigest=round(percentageofslhigest, 1);

            SharedPreferences.Editor editor = mypref7.edit();
            editor.putInt("HighScore7", score7);
            editor.commit();
            highscore7 = mypref7.getInt("HighScore7", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore7 + "/10  (" + percentageofslhigest + "%)");


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
                Intent startIntent = new Intent(getApplicationContext(), diagwnismak7.class);
                startIntent.putExtra("pernatoeuros7", seekbarvalue);
                startActivity(startIntent);            }
        });



        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref7.edit().clear().commit();


            }
        });

        Cursor a6 = db.checkiflevelupdated7(usernameoflogin);
        a6.moveToFirst();
        int value = a6.getInt(0);

        if (value == 0) {
            if ((highscore7) == 10) {


                if (RUN_ONCE == true) {
                    SharedPreferences prefs17 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs17.getString("username", "UNKNOWN");
                    SharedPreferences prefss7 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss7.getInt("level", 0);
                    db.UpdateLevel(usernameofloginn, level); //PROVLHMA
                    db.updatelevel7(usernameoflogin, level);
                    SharedPreferences foronlyonce6 = getSharedPreferences("runonce7", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce6.edit();
                    onceEditor.putBoolean("runonce7", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce6.getBoolean("runonce7", false);
                    startActivity(new Intent(menuaskisewn7.this, LevelupActivity.class));

                }
            }
        }

    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public void onBackPressed() {
        Intent intentback = new Intent(menuaskisewn7.this, menukefalaio7.class);
        startActivity(intentback);}


}
