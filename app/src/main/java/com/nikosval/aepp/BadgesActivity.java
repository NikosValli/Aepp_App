package com.nikosval.aepp;

import android.content.Intent;
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
         TextView level3descr;
         TextView level1descr;
         ImageView thor;

        ImageView spiderman;
        TextView level2descr;
        DataBaseHelper db;
        db = new DataBaseHelper(this);
        int didyoushowspider;
        didyoushowspider=0;


        ImageView hulk;
        TextView level4descr;
        TextView level5descr;
        TextView level6descr;




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);
        epathla=(TextView)findViewById(R.id.epathla);
        ironman=(ImageView)findViewById(R.id.level1);
        epathladescr=(TextView)findViewById(R.id.epathladescr);
        thor=(ImageView)findViewById(R.id.thor);
        spiderman=(ImageView)findViewById(R.id.spiderman);
        level2descr=(TextView)findViewById(R.id.level2desc);
        level1descr=(TextView)findViewById(R.id.level1descr);
        level3descr=(TextView)findViewById(R.id.descr13);
        level4descr=(TextView)findViewById(R.id.desc14);
        level5descr=(TextView)findViewById(R.id.desc15);
        level6descr=(TextView)findViewById(R.id.desc16);



        hulk=(ImageView)findViewById(R.id.Hulk);
        ImageView ca=(ImageView)findViewById(R.id.captainamerica);
        ImageView thanos=(ImageView)findViewById(R.id.thanos);




        setLocked(thor);
                setLocked(ironman);
                setLocked(spiderman);
                setLocked(hulk);
        setLocked(ca);
        setLocked(thanos);

        int spidermanshowedd=0;
        int ironmanshowedd=0;
        int thorshowedd=0;
        int hulkshowedd=0;
        int cashowedd=0;
        int thanosshowedd=0;







        SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameoflogin = prefs.getString("username", "UNKNOWN");

        SharedPreferences prefs11 = getSharedPreferences("MyApp", MODE_PRIVATE);
        String usernameofuser = prefs11.getString("username", "UNKNOWN");
        Pref user=new Pref(this,usernameoflogin);






        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        epathla.startAnimation(myanim);
        epathladescr.startAnimation(myanim);


        SharedPreferences mPrefsup = getSharedPreferences("giabadges1", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditorgiabadg = mPrefsup.edit();
        int sinolikohighest=mPrefsup.getInt("highestlevel1",0);
        Cursor qq= db.checkifironmanshowed(usernameoflogin);
        qq.moveToFirst();
        int ironmanshowed = qq.getInt(0);

        Cursor a = db.checkiflevelupdated(usernameofuser);
        a.moveToFirst();
        int value = a.getInt(0);
        if (ironmanshowed==0)
            if(ironmanshowedd==0)
        if (value==1){

            setUnlocked(ironman);
            level1descr.setText("Ξεκλειδώθηκε επιτυχώς!");
            ironmanshowedd=1;
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
        Cursor qqq= db.checkifthorshowed(usernameoflogin);
        qqq.moveToFirst();
        int thorshowed = qq.getInt(0);


        if(thorshowed==0) {
            if(thorshowedd==0)
            if (value2 == 1) {

                setUnlocked(thor);
                thorshowedd=1;
                level2descr.setText("Ξεκλειδώθηκε επιτυχώς!");
                level2descr.setTextColor(getResources().getColor(R.color.colorigotit, null));
                ironman.startAnimation(myanim);


            } else {

                setLocked(thor);
            }
        }
        SharedPreferences mypref3 = getSharedPreferences("mypref3", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefseditor3 = mypref3.edit();
        int sinolikohighest3=mypref3.getInt("HighScore3",0);
        Cursor d = db.checkiflevelupdated3(usernameofuser);
        d.moveToFirst();
        int value3 = d.getInt(0);

        Cursor q = db.checkifsupermanshowed(usernameoflogin);
        q.moveToFirst();
        int spidermanshowed = q.getInt(0);


        if(spidermanshowedd==0)
        if (value3==1){
            if (spidermanshowed==0)

            {
                startActivity(new Intent(BadgesActivity.this, Showspiderman.class));
                db.addshowingspiderman(usernameoflogin,1);
                spidermanshowedd=1;


            }

            setUnlocked(spiderman);
            didyoushowspider=1;


            level3descr.setText("Ξεκλειδώθηκε επιτυχώς!");
            level3descr.setTextColor(getResources().getColor(R.color.colorigotit, null));
            spiderman.startAnimation(myanim);



        }
        else{

            setLocked(spiderman);
        }

        SharedPreferences mypref4 = getSharedPreferences("mypref4", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefseditor4 = mypref4.edit();
        int sinolikohighest4=mypref4.getInt("HighScore4",0);
        Cursor b4 = db.checkiflevelupdated4(usernameofuser);
        b4.moveToFirst();
        int value4 = b.getInt(0);
        Cursor qqqq= db.checkifHulkshowed(usernameoflogin);
        qqqq.moveToFirst();
        int hulkshowed = qq.getInt(0);

        if(hulkshowed==0)
            if (value4==1){
                if (hulkshowedd==0)

                {

                    db.addshowingHulk(usernameoflogin,1);
                    hulkshowedd=1;


                }

                setUnlocked(hulk);



                level4descr.setText("Ξεκλειδώθηκε επιτυχώς!");
                level4descr.setTextColor(getResources().getColor(R.color.colorigotit, null));
                hulk.startAnimation(myanim);



            }
            else{

                setLocked(hulk);
            }

        SharedPreferences mypref5 = getSharedPreferences("mypref5", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefseditor5 = mypref5.edit();
        int sinolikohighest5=mypref5.getInt("HighScore5",0);
        Cursor b5 = db.checkiflevelupdated5(usernameofuser);
        b5.moveToFirst();
        int value5 = b5.getInt(0);
        Cursor qqqqq= db.checkifcashowed(usernameoflogin);
        qqqqq.moveToFirst();
        int cashowed = qqqqq.getInt(0);

        if(cashowed==0)
            if (value5==1){
                if (cashowedd==0)

                {
                    startActivity(new Intent(BadgesActivity.this, Showca.class));
                    db.addshowingca(usernameoflogin,1);
                    cashowedd=1;


                }

                setUnlocked(ca);



                level5descr.setText("Ξεκλειδώθηκε επιτυχώς!");
                level5descr.setTextColor(getResources().getColor(R.color.colorigotit, null));
                ca.startAnimation(myanim);



            }
            else{

                setLocked(ca);
            }


        SharedPreferences mypref6 = getSharedPreferences("mypref6", MODE_PRIVATE); //add key
        SharedPreferences.Editor prefseditor6 = mypref6.edit();
        int sinolikohighest6=mypref6.getInt("HighScore6",0);
        Cursor b6 = db.checkiflevelupdated6(usernameofuser);
        b6.moveToFirst();
        int value6 = b6.getInt(0);
        Cursor qqqqqq= db.checkifthanosshowed(usernameoflogin);
        qqqqqq.moveToFirst();
        int thanosshowed = qqqqqq.getInt(0);

        if(thanosshowed==0)
            if (value6==1){
                if (thanosshowedd==0)

                {
                    startActivity(new Intent(BadgesActivity.this, ShowThanos.class));
                    db.addshowingthanos(usernameoflogin,1);
                    thanosshowedd=1;


                }

                setUnlocked(thanos);



                level6descr.setText("Ξεκλειδώθηκε επιτυχώς!");
                level6descr.setTextColor(getResources().getColor(R.color.colorigotit, null));
                thanos.startAnimation(myanim);



            }
            else{

                setLocked(thanos);
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
