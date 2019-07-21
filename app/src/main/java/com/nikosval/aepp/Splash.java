package com.nikosval.aepp;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Type;

public class Splash extends AppCompatActivity {

    private TextView tv;
    private TextView intro;
    private ImageView iv;
    private TextView eisagwgiko3;
    private ImageView arrow;
    Typeface introfont1;
    Typeface introfont2;
    Typeface introfont3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv=(TextView)findViewById(R.id.tv);
        iv=(ImageView)findViewById(R.id.iv);
        intro=(TextView)findViewById(R.id.intro);
        eisagwgiko3=(TextView)findViewById(R.id.textView2);
        arrow=(ImageView)findViewById(R.id.imageView2);
        introfont1= Typeface.createFromAsset(this.getAssets(),"fonts/NotoSans-MediumItalic.ttf");
        introfont2= Typeface.createFromAsset(this.getAssets(),"fonts/NotoSerifDisplay-BoldItalic.ttf");
        introfont3= Typeface.createFromAsset(this.getAssets(),"fonts/SUPERHERO.ttf");
        tv.setTypeface(introfont1);
        intro.setTypeface(introfont2);
        eisagwgiko3.setTypeface(introfont3);

        Animation myblink=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        arrow.startAnimation(myblink);



        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);
        final Intent i=new Intent(this,LoginActivity.class);
        Thread timer=new Thread(){

            public void run (){
                try{
                    sleep(5000);
                } catch (InterruptedException e){

                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }


        };

        timer.start();
    }

}
