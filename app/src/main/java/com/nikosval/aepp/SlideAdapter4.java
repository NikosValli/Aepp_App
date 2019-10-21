package com.nikosval.aepp;
import android.content.ContentValues;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class SlideAdapter4 extends PagerAdapter {

    Context context;
    LayoutInflater LayoutInflater;

    public SlideAdapter4(Context context){
        this.context=context;
    }

    //paradeigmata




    public int[] slide_images= {

            R.drawable.ypoprogramma,
            R.drawable.ypoprogrammadio,
            R.drawable.ypoprogrammatria,
            R.drawable.ypoprogrammatessera,
            R.drawable.ypoprogrammapente,




    };

    public String[] Slide_headings={

            "Κλήση υποπρογράμματος",
            "Εντολή κλήσης υποπρογράμματος",
            "Ορισμός μιας διαδικασίας.",
            "Ορισμος μιας συνάρτησης.",
            "Ορισμός μιας συνάρτησης 2 ",




    };

    public String[] Slide_descriptions={

            "Βλέπουμε στο παραπάνω παράδειγμα πως επιτυγχάνεται η κλήση ενός υποπρογράμματος",
            "Εντολή κλήσης υποπρογράμματος.",
            "Ορισμός Διαδικασίας η οποια καλέιται για να  να εκτυπώσει το εμβαδον ενός κυκλου.",
            "Ορισμος μιας συνάρτησης η οποια υπολογίζει το εμβαδον του κύκλου.",
            "Eδώ ορίζεται μια συνάρτηση η οποία υπολογίζει το παραγοντικό ,δωθεντος ενος ακέραιου απο το κυριο πρόγραμμα.",




    };





    @Override

    public int getCount() {
        return Slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view== (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=LayoutInflater.inflate(R.layout.slideshow4,container,false);


        final ImageView slideImageview=(ImageView)view.findViewById(R.id.slideimage4);


        TextView slideheading=(TextView) view.findViewById(R.id.heading4);
        TextView slidedescr=(TextView) view.findViewById(R.id.slide_descr4);

        slideImageview.setImageResource(slide_images[position]);
        slideheading.setText(Slide_headings[position]);
        slidedescr.setText(Slide_descriptions[position]);


        container.addView(view);

        return view;







    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
