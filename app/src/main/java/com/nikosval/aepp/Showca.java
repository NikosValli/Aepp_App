package com.nikosval.aepp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Showca extends AppCompatActivity {

    ImageView levelupca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_showca);


        Button buttonok=(Button)findViewById(R.id.ButtonOK);
        levelupca=(ImageView)findViewById(R.id.showca);
        Animation myblink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        levelupca.startAnimation(myblink);
        TextView levelupspider=(TextView)findViewById(R.id.youlevelupsp);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        levelupca.startAnimation(myanim);
        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }
}
