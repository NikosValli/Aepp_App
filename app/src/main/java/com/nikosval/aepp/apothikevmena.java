package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class apothikevmena extends AppCompatActivity {
    CheckBox a1;
    Boolean check1;
    ListView apothikevmenakef;
    Typeface introfont1;

    Button pr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apothikevmena);
        Button fbbutton1 = (Button) findViewById(R.id.button4);
        Button button12 = (Button) findViewById(R.id.button8);
        Button button13 = (Button) findViewById(R.id.button1_3_saved);
        Button button21 = (Button) findViewById(R.id.button2_1);
        Button button23 = (Button) findViewById(R.id.button2_3);
        Button button24 = (Button) findViewById(R.id.button2_4);

        Button button22 = (Button) findViewById(R.id.button2_2);
        Button button14 = (Button) findViewById(R.id.button1_4_saved);
        introfont1 = Typeface.createFromAsset(this.getAssets(), "fonts/NotoSans-MediumItalic.ttf");
        TextView apothikevmenatext = (TextView) findViewById(R.id.textView32);
        apothikevmenatext.setTypeface(introfont1);

        SharedPreferences sharedPreferences = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences sharedPreferencess = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences sharedPreferences13 = PreferenceManager

                .getDefaultSharedPreferences(this);


        SharedPreferences.Editor editor = sharedPreferences.edit();

        SharedPreferences.Editor editorr = sharedPreferencess.edit();
        SharedPreferences.Editor editor13 = sharedPreferences13.edit();

        SharedPreferences sharedPreferences14 = PreferenceManager

                .getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor14 = sharedPreferences14.edit();

        SharedPreferences sharedPreferences21 = PreferenceManager

                .getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor21 = sharedPreferences21.edit();

        SharedPreferences sharedPreferences22 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor22 = sharedPreferences21.edit();

        SharedPreferences sharedPreferences23 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor23 = sharedPreferences21.edit();

        SharedPreferences sharedPreferences24 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor24 = sharedPreferences21.edit();


        boolean checkBoxValue = sharedPreferences.getBoolean("checked", false);
        boolean checkBoxValue2 = sharedPreferencess.getBoolean("checked1_2", false);
        boolean checboxValue3 = sharedPreferences13.getBoolean("checked1_3", false);
        boolean checboxValue4 = sharedPreferences14.getBoolean("checked1_4", false);
        boolean checboxValue5 = sharedPreferences21.getBoolean("checked2_1", false);
        boolean checboxValue6 = sharedPreferences22.getBoolean("checked2_2", false);
        boolean checboxValue7 = sharedPreferences23.getBoolean("checked2_3", false);
        boolean checboxValue8 = sharedPreferences21.getBoolean("checked2_3", false);

        if (checkBoxValue) {
            //For Displaying Button
            fbbutton1.setVisibility(View.VISIBLE);

            fbbutton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria1oukefalaiou.class));
                }
            });
        }

        if (checkBoxValue2) {
            //For Displaying Button
            button12.setVisibility(View.VISIBLE);

            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria1_2.class));
                }
            });


        }

        if (checboxValue3) {
            //For Displaying Button
            button13.setVisibility(View.VISIBLE);

            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria1_3.class));
                }
            });
        }

        if (checboxValue4) {
            //For Displaying Button
            button14.setVisibility(View.VISIBLE);

            button14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria1_4.class));
                }
            });
        }


        if (checboxValue5) {
            //For Displaying Button
            button21.setVisibility(View.VISIBLE);

            button21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriadioena.class));
                }
            });


        }

        if (checboxValue6) {
            //For Displaying Button
            button22.setVisibility(View.VISIBLE);

            button22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriadiodio.class));
                }
            });

            if (checboxValue7) {
                //For Displaying Button
                button23.setVisibility(View.VISIBLE);

                button23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(apothikevmena.this, thewriadiotria.class));
                    }
                });

                if (checboxValue8) {
                    //For Displaying Button
                    button24.setVisibility(View.VISIBLE);

                    button24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(apothikevmena.this, thewriadiotessera.class));
                        }
                    });
                }
            }
        }
    }
}