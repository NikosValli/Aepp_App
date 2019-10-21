package com.nikosval.aepp;

import android.provider.ContactsContract;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;



public class methodologia3kefalaio extends AppCompatActivity {

    private ViewPager mSlideshow;
    private LinearLayout mdotlayout;
    private SlideAdapter slideradapter;
    private TextView[] mdots;
    private Button mnxtbtn;
    private Button mbackbtn;
    private int mcurrentpage;
    private ImageView logoimage;
    private TextView logotext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methodologia3kefalaio);


        mSlideshow=(ViewPager)findViewById(R.id.SlideViewPager);
        mdotlayout=(LinearLayout)findViewById(R.id.dotsLayout);
        slideradapter=new SlideAdapter(this);
        mSlideshow.setAdapter(slideradapter);
         addDotsIndicator(0);
         mSlideshow.addOnPageChangeListener(viewListener);
         mnxtbtn=(Button)findViewById(R.id.next);
         mbackbtn=(Button)findViewById(R.id.previous);
         logoimage=(ImageView)findViewById(R.id.logoo);
         logotext=(TextView)findViewById(R.id.logotext);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        logoimage.startAnimation(myanim);
        logotext.startAnimation(myanim);

         mnxtbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mSlideshow.setCurrentItem(mcurrentpage+1);
             }
         });


         mbackbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mSlideshow.setCurrentItem(mcurrentpage-1);
             }
         });


    }

    public void addDotsIndicator(int position){


        mdots=new TextView[8];

        for (int i=0; i<mdots.length ;i++){
            mdots[i]=new TextView(this);
            mdots[i].setText(Html.fromHtml("&#8226;"));
            mdots[i].setTextSize(35);
            mdots[i].setTextColor(getResources().getColor(R.color.colorPrimary));

            mdotlayout.addView(mdots[i]);


        }

        if(mdots.length>0){


            mdots[position].setTextColor(getResources().getColor(R.color.colorAccent));
        }


    }

    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);
            mcurrentpage=i;

            if(i==0){
                mnxtbtn.setEnabled(true);
                mbackbtn.setEnabled(false);
                mbackbtn.setVisibility(View.INVISIBLE);
                mnxtbtn.setText("Eπόμενο");
                mbackbtn.setText("");


            } else if (i==mdots.length -1){
                mnxtbtn.setEnabled(true);
                mbackbtn.setEnabled(true);
                mbackbtn.setVisibility(View.INVISIBLE);
                mnxtbtn.setText("Τέλος");
                mbackbtn.setText("Πίσω");


            } else{

                mnxtbtn.setEnabled(true);
                mbackbtn.setEnabled(true);
                mbackbtn.setVisibility(View.VISIBLE);
                mnxtbtn.setText("Eπόμενο");
                mbackbtn.setText("Πίσω");
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
