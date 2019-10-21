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

public class menuaskisewn5 extends AppCompatActivity {
    private static boolean RUN_ONCE = true;
    TextView erwthseispouthaapantisei;
    private int seekbarvalue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn5);
        SharedPreferences prefs5 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs5.getString("username", "UNKNOWN");
        SharedPreferences prefs55 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs55.getString("username", "UNKNOWN");
        Button gotothetest = findViewById(R.id.gotothetest5);
        Pref user = new Pref(this, usernameoflogin);
        TextView currentscore = (TextView) findViewById(R.id.currentscore5);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore5);
        SharedPreferences settings5 = getSharedPreferences("myprefsbro", 0);
        SeekBar seekbar=findViewById(R.id.seekBar5);
        erwthseispouthaapantisei=(TextView)findViewById(R.id.erwthseispouthaapantisei5);
        boolean dialogShown = settings5.getBoolean("dialogShown", false);

        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn5.this);
            builder1.setMessage("Απάντησε σωστά σε όλες τις ερωτήσεις και ξεκλείδωσε τον Captain America!");
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

            SharedPreferences.Editor editor = settings5.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }

        Intent intent = getIntent();
        int score5 = intent.getIntExtra("scorediagwnisma5", 0);
        double percentageoftest = ((double) score5 / 15) * 100;
        final SharedPreferences mypref5 = getSharedPreferences("mypref5", MODE_PRIVATE);
        int highscore5 = mypref5.getInt("HighScore5", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);

        if (percentageoftest > 50) {


            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ είναι: " + score5 + "/15 (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscore.setText("To σκορ σου στις ερωτήσεις του τεστ ειναι : " + score5 + "/15  (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorAccent, null));

        }


        if (highscore5 >= score5) {

            double percentageofhighest = ((double) highscore5 / 15) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore5 + "/15  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore5 / 15) * 100;

            SharedPreferences.Editor editor = mypref5.edit();
            editor.putInt("HighScore5", score5);
            editor.commit();
            highscore5 = mypref5.getInt("HighScore5", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore5 + "/15  (" + percentageofslhigest + "%)");


        }

        if (highscore5 >= score5) {

            double percentageofhighest = ((double) highscore5 / 15) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore5 + "/15  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore5 / 15) * 100;

            SharedPreferences.Editor editor = mypref5.edit();
            editor.putInt("HighScore5", score5);
            editor.commit();
            highscore5 = mypref5.getInt("HighScore5", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore5 + "/15  (" + percentageofslhigest + "%)");


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
                startIntent.putExtra("pernatoeuros5", seekbarvalue);
                startActivity(startIntent);            }
        });






        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref5.edit().clear().commit();


            }
        });

        Cursor a5 = db.checkiflevelupdated5(usernameoflogin);
        a5.moveToFirst();
        int value = a5.getInt(0);

        if (value == 0) {
            if ((highscore5) == 15) {


                if (RUN_ONCE == true) {
                    SharedPreferences prefs15 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs15.getString("username", "UNKNOWN");
                    SharedPreferences prefss5 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss5.getInt("level", 0);
                    db.UpdateLevel(usernameofloginn, level); //PROVLHMA
                    db.updatelevel5(usernameoflogin, level);
                    SharedPreferences foronlyonce5 = getSharedPreferences("runonce5", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce5.edit();
                    onceEditor.putBoolean("runonce5", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce5.getBoolean("runonce5", false);
                    startActivity(new Intent(menuaskisewn5.this, LevelupActivity.class));

                }
            }
        }

    }

    public void onBackPressed() {
        Intent intentback = new Intent(menuaskisewn5.this, menukefalaio5.class);
        startActivity(intentback);}


}
