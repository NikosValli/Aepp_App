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

public class menuaskisewn8 extends AppCompatActivity {
    private static boolean RUN_ONCE = true;
    TextView erwthseispouthaapantisei;
    private int seekbarvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn8);
        SharedPreferences prefs8 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs8.getString("username", "UNKNOWN");
        SharedPreferences prefs88 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs88.getString("username", "UNKNOWN");
        Button gotothetest = findViewById(R.id.gotothetest8);
        Pref user = new Pref(this, usernameoflogin);
        TextView currentscore = (TextView) findViewById(R.id.currentscore8);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore8);
        SeekBar seekbar=findViewById(R.id.seekBar8);
        erwthseispouthaapantisei=(TextView)findViewById(R.id.erwthseispouthaapantisei8);
        SharedPreferences settings8 = getSharedPreferences("myprefsbro", 0);
        boolean dialogShown = settings8.getBoolean("dialogShown", false);
        SharedPreferences prefs = getSharedPreferences("osesapantisa8", MODE_PRIVATE);
        int osesapantisa = prefs.getInt("osesapantisa8", 20);

        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn8.this);
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

            SharedPreferences.Editor editor = settings8.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }

        Intent intent = getIntent();
        int score8 = intent.getIntExtra("scorediagwnisma8", 0);
        double percentageoftest = ((double) score8 / osesapantisa) * 100;
        percentageoftest=round(percentageoftest, 1);

        final SharedPreferences mypref8 = getSharedPreferences("mypref8", MODE_PRIVATE);
        int highscore8 = mypref8.getInt("HighScore8", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);

        if (percentageoftest > 50) {


            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ είναι: " + score8 + "/"+osesapantisa+" (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ ειναι : " + score8 + "/"+osesapantisa+"  (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorAccent, null));

        }


        if (highscore8 >= score8) {

            double percentageofhighest = ((double) highscore8 / 10) * 100; //aitia gia highscore emfanisi
            percentageofhighest=round(percentageofhighest, 1);



            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore8 + "/10  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore8 / 10) * 100;
            percentageofslhigest=round(percentageofslhigest, 1);


            SharedPreferences.Editor editor = mypref8.edit();
            editor.putInt("HighScore8", score8);
            editor.commit();
            highscore8 = mypref8.getInt("HighScore8", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore8 + "/10  (" + percentageofslhigest + "%)");


        }

        if (highscore8 >= score8) {

            double percentageofhighest = ((double) highscore8/ 10) * 100; //aitia gia highscore emfanisi
            percentageofhighest=round(percentageofhighest, 1);



            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore8 + "/10  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore8 / 10) * 100;
            percentageofslhigest=round(percentageofslhigest, 1);

            SharedPreferences.Editor editor = mypref8.edit();
            editor.putInt("HighScore8", score8);
            editor.commit();
            highscore8 = mypref8.getInt("HighScore8", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore8 + "/10  (" + percentageofslhigest + "%)");


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
                Intent startIntent = new Intent(getApplicationContext(), diagwnismak8.class);
                startIntent.putExtra("pernatoeuros8", seekbarvalue);
                startActivity(startIntent);            }
        });



        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref8.edit().clear().commit();


            }
        });

        Cursor a6 = db.checkiflevelupdated8(usernameoflogin);
        a6.moveToFirst();
        int value = a6.getInt(0);

        if (value == 0) {
            if ((highscore8) == 10) {


                if (RUN_ONCE == true) {
                    SharedPreferences prefs18 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs18.getString("username", "UNKNOWN");
                    SharedPreferences prefss8 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss8.getInt("level", 0);
                    db.UpdateLevel(usernameofloginn, level); //PROVLHMA
                    db.updatelevel8(usernameoflogin, level);
                    SharedPreferences foronlyonce8 = getSharedPreferences("runonce8", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce8.edit();
                    onceEditor.putBoolean("runonce8", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce8.getBoolean("runonce8", false);
                    startActivity(new Intent(menuaskisewn8.this, LevelupActivity.class));

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
        Intent intentback = new Intent(menuaskisewn8.this, menukefalaio8.class);
        startActivity(intentback);}


}
