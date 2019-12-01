package com.nikosval.aepp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SlideAdapter2 extends PagerAdapter {

    Context context;
    LayoutInflater LayoutInflater;

    public SlideAdapter2(Context context){
        this.context=context;
    }

    //paradeigmata




    public int[] slide_images= {

            R.drawable.paradeigmaaplh,
            R.drawable.aplhep2,
            R.drawable.sintheti1,
            R.drawable.sintheti2,
            R.drawable.pollaplh13,
            R.drawable.osoepanelave,
            R.drawable.mexrisotouu,
            R.drawable.giaoso,









    };

    public String[] Slide_headings={

            "Απλή επιλογή",
            "Απλή επιλογή 2",
            "Συνθετή επιλογή",
            "Συνθετή επιλογή 2",
            "Πολλαπλή επιλογή",
            "Δομή Επανάήψης Όσο...Επανέλαβε",
            "Δομή Επανλαληψης Μέχρις_Οτου",
            "Δομή Επανάληψης Για...από...μέχρι",




    };

    public String[] Slide_descriptions={

            "Το παράδειγμα υποδεικνύει μια δομή απλής επιλογής.",
            "Το παράδειγμα υποδεικνύει άλλη μια δομή απλής επιλογής καθώς και το διάγραμμα ροής.",
            "Ένα κλασσικό παράδειγμα σύνθετης επιλογής.",
            "Ένα ακόμη αριθμητικό παράδειγμα σύνθετης επιλογής.",
            "Ένας αλγόριθμος πο χρησιμοποιεί την δομή πολλαπλής επιλογής.",
            "Τρόπος δόμησης της δομής επανάληψης Όσο..επανέλαβε",
            "Κλασσικά Παραδείγματα της δομής επανάληψης Μέχρις_Οτου",
            "Ορθή Σύνταξη της εντολής Για..από...μέχρι",




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
        View view=LayoutInflater.inflate(R.layout.slideshow2,container,false);


        final ImageView slideImageview=(ImageView)view.findViewById(R.id.slideimage2);


        TextView slideheading=(TextView) view.findViewById(R.id.heading2);
        TextView slidedescr=(TextView) view.findViewById(R.id.slide_descr2);

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


