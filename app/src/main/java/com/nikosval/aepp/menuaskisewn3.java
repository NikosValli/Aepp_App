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

public class menuaskisewn3 extends AppCompatActivity {
    private static boolean RUN_ONCE = true;
    TextView erwthseispouthaapantisei;
    private int seekbarvalue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaskisewn3);
        SharedPreferences prefs3 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs3.getString("username", "UNKNOWN");
        SharedPreferences prefs33 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs33.getString("username", "UNKNOWN");
        Pref user = new Pref(this, usernameoflogin);
        TextView currentscore = (TextView) findViewById(R.id.currentscore3);
        SeekBar seekbar=findViewById(R.id.seekBar3);
        erwthseispouthaapantisei=(TextView)findViewById(R.id.erwthseispouthaapantisei3);
        final TextView highestscore = (TextView) findViewById(R.id.highestscore3);
        SharedPreferences settings = getSharedPreferences("myprefsbro", 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);


        if (!dialogShown) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(menuaskisewn3.this);
            builder1.setMessage("Απάντησε σωστά σε όλες τις ερωτήσεις και ξεκλείδωσε τον Spiderman !");
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
        int score3 = intent.getIntExtra("scorediagwnisma3", 0);
        double percentageoftest = ((double) score3 / 20) * 100;
        final SharedPreferences mypref3 = getSharedPreferences("mypref3", MODE_PRIVATE);
        int highscore = mypref3.getInt("HighScore3", 0);
        DataBaseHelper db;
        db = new DataBaseHelper(this);

        if (percentageoftest > 50) {


            currentscore.setText("To σκορ σου στo τέστ είναι " + score3 + "/20 (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorigotit, null));
        } else {

            currentscore.setText("To σκορ σου στο τέστ είναι : " + score3 + "/20  (" + percentageoftest + "%)");
            currentscore.setTextColor(getResources().getColor(R.color.colorAccent, null));


        }

        if (highscore >= score3) {

            double percentageofhighest = ((double) highscore / 20) * 100; //aitia gia highscore emfanisi


            highestscore.setText("Το μεγαλύτερο σκορ στο τεστ είναι: " + highscore + "/20  (" + percentageofhighest + "%)");


        } else {

            double percentageofslhigest = ((double) highscore / 17) * 100;

            SharedPreferences.Editor editor = mypref3.edit();
            editor.putInt("HighScore3", score3);
            editor.commit();
            highscore = mypref3.getInt("HighScore3", 0);


            highestscore.setText("Το μεγαλύτερο σκορ στο τέστ ειναι: " + highscore + "/20  (" + percentageofslhigest + "%)");


        }

        Button gotothetestthree=findViewById(R.id.gotothetest3);

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

        gotothetestthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), diagwnismakefalaio3.class);
                startIntent.putExtra("pernatoeuros3", seekbarvalue);
                startActivity(startIntent);            }
        });

        Button midenismos;
        midenismos = (Button) findViewById(R.id.midenismos);
        midenismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypref3.edit().clear().commit();


            }
        });

        Cursor d = db.checkiflevelupdated3(usernameoflogin);
        d.moveToFirst();
        int value = d.getInt(0);

        if (value == 0) {
            if ((highscore) == 20) {
                if  (RUN_ONCE == true) {
                    SharedPreferences prefs133 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    String usernameofloginn = prefs133.getString("username", "UNKNOWN");
                    SharedPreferences prefss133 = getSharedPreferences("MyApp", MODE_PRIVATE);
                    int level = prefss133.getInt("level", 0);
                    db.UpdateLevel(usernameofloginn, level); //PROVLHMA
                    db.updatelevel3(usernameoflogin, level);
                    SharedPreferences foronlyonce = getSharedPreferences("runonce3", MODE_PRIVATE); //add key
                    final SharedPreferences.Editor onceEditor = foronlyonce.edit();
                    onceEditor.putBoolean("runonce3", false);
                    onceEditor.commit();
                    RUN_ONCE = foronlyonce.getBoolean("runonce3", false);
                    startActivity(new Intent(menuaskisewn3.this, LevelupActivity.class));
                }
            }
        }



    }

    public void onBackPressed() {
        Intent intentback = new Intent(menuaskisewn3.this, menukefalaio3.class);
        startActivity(intentback);
    }


}
