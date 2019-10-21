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

public class menuaskisewn4 extends AppCompatActivity {
    private static boolean RUN_ONCE = true;
    TextView erwthseispouthaapantisei;
    private int seekbarvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn4);

        SharedPreferences prefs4 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs4.getString("username", "UNKNOWN");
        SharedPreferences prefs44 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs44.getString("username", "UNKNOWN");
        Pref user = new Pref(this, usernameoflogin);
        Button gotothetest = findViewById(R.id.gotothetest4);
        TextView currentscoresl = (TextView) findViewById(R.id.currentscore4);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore4);
        SharedPreferences settings4 = getSharedPreferences("myprefsbro", 0);
        SeekBar seekbar=findViewById(R.id.seekBar4);
        erwthseispouthaapantisei=(TextView)findViewById(R.id.erwthseispouthaapantisei4);
        boolean dialogShown = settings4.getBoolean("dialogShown", false);

        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn4.this);
            builder1.setMessage("Απάντησε σωστά σε όλες τις ερωτήσεις και ξεκλείδωσε τον Hulk!");
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

            SharedPreferences.Editor editor = settings4.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }

        Intent intent = getIntent();
        int score4 = intent.getIntExtra("scorediagwnisma4", 0);
        double percentageoftest = ((double) score4 / 20) * 100;
        final SharedPreferences mypref4 = getSharedPreferences("mypref4", MODE_PRIVATE);
        int highscore4 = mypref4.getInt("HighScore4", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);

        if (percentageoftest > 50) {


            currentscoresl.setText("To σκορ σου στις ερωτήσεις του τεστ είναι: " + score4 + "/20 (" + percentageoftest + "%)");
            currentscoresl.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscoresl.setText("To σκορ σου στις ερωτήσεις του τεστ ειναι : " + score4 + "/20  (" + percentageoftest + "%)");
            currentscoresl.setTextColor(getResources().getColor(R.color.colorAccent, null));


        }

        if (highscore4 >= score4) {

            double percentageofhighest = ((double) highscore4 / 20) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore4 + "/20  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore4 / 20) * 100;

            SharedPreferences.Editor editor = mypref4.edit();
            editor.putInt("HighScore4", score4);
            editor.commit();
            highscore4 = mypref4.getInt("HighScore4", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore4 + "/20  (" + percentageofslhigest + "%)");


        }
        if (highscore4 >= score4) {

            double percentageofhighest = ((double) highscore4 / 20) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore4 + "/20  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore4 / 20) * 100;

            SharedPreferences.Editor editor = mypref4.edit();
            editor.putInt("HighScore4", score4);
            editor.commit();
            highscore4 = mypref4.getInt("HighScore4", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore4 + "/20  (" + percentageofslhigest + "%)");


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
                Intent startIntent = new Intent(getApplicationContext(), diagwnismakefalaio4.class);
                startIntent.putExtra("pernatoeuros4", seekbarvalue);
                startActivity(startIntent);            }
        });


        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref4.edit().clear().commit();


            }
        });

        Cursor a4 = db.checkiflevelupdated4(usernameoflogin);
        a4.moveToFirst();
        int value = a4.getInt(0);

        if (value == 0) {
            if ((highscore4) == 20) {


                if (RUN_ONCE == true) {
                    SharedPreferences prefs14 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs14.getString("username", "UNKNOWN");
                    SharedPreferences prefss4 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss4.getInt("level", 0);
                    db.UpdateLevel(usernameofloginn, level); //PROVLHMA
                    db.updatelevel4(usernameoflogin, level);
                    SharedPreferences foronlyonce4 = getSharedPreferences("runonce4", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce4.edit();
                    onceEditor.putBoolean("runonce4", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce4.getBoolean("runonce4", false);
                    startActivity(new Intent(menuaskisewn4.this, LevelupActivity.class));

                }
            }
        }


    }


    public void onBackPressed() {
        Intent intentback = new Intent(menuaskisewn4.this, menukefalaio4.class);
        startActivity(intentback);}

}



