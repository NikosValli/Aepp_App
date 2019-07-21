package com.nikosval.aepp;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BadgesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         TextView epathla;
         TextView epathladescr;
         ImageView ironman;
         TextView level1descr;
         ImageView thor;
        TextView level2descr;
        DataBaseHelper db;
        db = new DataBaseHelper(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);
        epathla=(TextView)findViewById(R.id.epathla);
        ironman=(ImageView)findViewById(R.id.level1);
        epathladescr=(TextView)findViewById(R.id.epathladescr);
        thor=(ImageView)findViewById(R.id.thor);
        level2descr=(TextView)findViewById(R.id.level2desc);
        level1descr=(TextView)findViewById(R.id.level1descr);
                setLocked(thor);
                setLocked(ironman);
        SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);

        String usernameofuser = prefs.getString("username", "UNKNOWN");





        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        epathla.startAnimation(myanim);
        epathladescr.startAnimation(myanim);


        SharedPreferences mPrefsup = getSharedPreferences("giabadges1", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditorgiabadg = mPrefsup.edit();
        int sinolikohighest=mPrefsup.getInt("highestlevel1",0);

        Cursor a = db.checkiflevelupdated(usernameofuser);
        a.moveToFirst();
        int value = a.getInt(0);

        if (value==1){

            setUnlocked(ironman);
            level1descr.setText("Ξεκλειδώθηκε επιτυχώς!");
            level1descr.setTextColor(getResources().getColor(R.color.colorigotit, null));
            ironman.startAnimation(myanim);



        }
        else{

            setLocked(ironman);
        }


        SharedPreferences mypref2 = getSharedPreferences("mypref2", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefseditor = mypref2.edit();
        int sinolikohighest2=mypref2.getInt("HighScore2",0);
        Cursor b = db.checkiflevelupdated2(usernameofuser);
        b.moveToFirst();
        int value2 = b.getInt(0);



        if (value2==1){

            setUnlocked(thor);
            level2descr.setText("Ξεκλειδώθηκε επιτυχώς!");
            level2descr.setTextColor(getResources().getColor(R.color.colorigotit, null));
            ironman.startAnimation(myanim);



        }
        else{

            setLocked(thor);
        }

    }













    public static void  setLocked(ImageView v)
    {
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);  //0 means grayscale
        ColorMatrixColorFilter cf = new ColorMatrixColorFilter(matrix);
        v.setColorFilter(cf);
        v.setImageAlpha(128);   // 128 = 0.5
    }

    public static void  setUnlocked(ImageView v)
    {
        v.setColorFilter(null);
        v.setImageAlpha(255);
    }


}
