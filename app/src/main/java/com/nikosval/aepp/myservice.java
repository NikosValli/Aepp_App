package com.nikosval.aepp;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;

public class myservice extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        SharedPreferences preferences =getSharedPreferences("mypref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();


        super.onDestroy();
    }

        public void onTaskRemoved(Intent rootIntent){




            SharedPreferences mypref =getSharedPreferences("mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor = mypref.edit();
        editor.clear();
        editor.commit();
        SharedPreferences myprefmc =getSharedPreferences("myprefmc",MODE_PRIVATE);
        SharedPreferences.Editor editor2 = myprefmc.edit();
        editor2.clear();
        editor2.commit();


    }
}
