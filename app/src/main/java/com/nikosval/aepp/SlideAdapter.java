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


public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater LayoutInflater;

    public SlideAdapter(Context context){
        this.context=context;
    }

    //paradeigmata




    public int[] slide_images= {

            R.drawable.pinakesparadeigma1,
            R.drawable.pinakesparadeigma2,
            R.drawable.pinakesparadeigma3,
            R.drawable.stoivamethodologia,
            R.drawable.ouramethodologia,




    };

    public String[] Slide_headings={

            "Πίνακες λυμένο παράδειγμα 1",
            "Πίνακες λυμένο παράδειγμα 2",
            "Πίνακες λυμένο παράδειγμα 3",
            "Στοίβα μεθοδολογία",
            "Ουρά μεθοδολογία",




    };

    public String[] Slide_descriptions={

            "Χρησιμοποιείται η δομη Για...εφόσον εχουμε να κάνουμε με πίνακες αρα γνώριζουμε το πλήθος των επαναλήψεων.Σημαντικές οι διαγωνιοι για τους τετραγωνικούς πίνακες",
            "Προγραμμα που απαιτεί γνώση στην χρησιμοποίηση πινάκων καθώς και ευρύτερη αλγοριθμική γνώση για να λυθεί. ",
            "Πρόγραμμα που υπλογίζει την μέση θερμοκρασία και τις ημέρες με την μικρότερη θερμοκρασία δεδομένου ενός πίνακα που περιλαμβάνει τις θερμοκρασίες του επομένου μηνα.",
            "Κλασσικες εφαρμογές στοίβας.",
            "Κλασσικές εφαρμογές ουράς.",




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
        View view=LayoutInflater.inflate(R.layout.slideshow,container,false);


        final ImageView slideImageview=(ImageView)view.findViewById(R.id.slideimage);


        TextView slideheading=(TextView) view.findViewById(R.id.heading);
        TextView slidedescr=(TextView) view.findViewById(R.id.slide_descr);

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
