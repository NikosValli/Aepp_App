package com.nikosval.aepp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;



public class Pref {
    private static final String PREF_NAME = "Aepp2";

    private SharedPreferences mPreferences;
    private String mUser;
    private int highscoresl;
    private static Pref sInstance;


    public Pref(Context pContext, String pUserId) {
        mUser = pUserId;
        mPreferences = pContext.getSharedPreferences(String.format("Aepp2", pUserId), Context.MODE_PRIVATE);



    }

    public String getUserId() {
        return mUser;
    }


    public static Pref getPreferences(Context context, String userId) {
        if (null != sInstance || !TextUtils.equals(sInstance.getUserId(), userId)) {
            sInstance = new Pref(context, userId);

        }
        return sInstance;
    }


    public int sethighscoresl(int score){

        SharedPreferences.Editor editor = mPreferences.edit();
        editor.putInt("HighScore", score);
        editor.commit();
        int highscore = mPreferences.getInt("HighScore", 0);
        return  highscore;


    }




    public int gethighscoresl(SharedPreferences sp){

        SharedPreferences.Editor editor = mPreferences.edit();
        int highestscore=mPreferences.getInt("HighScore",0);
        SharedPreferences.Editor editor2 = sp.edit();

       editor2.putInt("highscoreofsl",highestscore);
        editor2.commit();
        int highscoreofsl=sp.getInt("highscoreofsl",0);
        return  highscoreofsl;


    }







    public int sethighscoremc(int scoremc){

        SharedPreferences.Editor editor = mPreferences.edit();
        editor.putInt("HighScore1", scoremc);

        editor.commit();
         int highscoremc = mPreferences.getInt("HighScore1", 0);

        return highscoremc;

    }


    public int sethighscore(int highscore,int highscoremc){

        final SharedPreferences.Editor prefsEditor = mPreferences.edit();
        final int sinolikohighest;
        sinolikohighest = highscore + highscoremc;

        prefsEditor.putInt("sinolikohigh", sinolikohighest);

        prefsEditor.commit();
        return sinolikohighest;

    }






}
