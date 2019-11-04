package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

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
        Button button31 = (Button) findViewById(R.id.button3_1);
        Button button32 = (Button) findViewById(R.id.button3_2);
        Button button33 = (Button) findViewById(R.id.button3_3);
        Button button34 = (Button) findViewById(R.id.button3_4);
        Button button35 = (Button) findViewById(R.id.button3_5);
        Button button41 = (Button) findViewById(R.id.button4_1);
        Button button42 = (Button) findViewById(R.id.button4_2);
        Button button43 = (Button) findViewById(R.id.button4_3);
        Button button44 = (Button) findViewById(R.id.button4_4);
        Button button51 = (Button) findViewById(R.id.button5_1);
        Button button52 = (Button) findViewById(R.id.button5_2);
        Button button53 = (Button) findViewById(R.id.button5_3);
        Button button54 = (Button) findViewById(R.id.button6_3);
        Button button55 = (Button) findViewById(R.id.button5_5);

        Button button61 = (Button) findViewById(R.id.button6_1);
        Button button62 = (Button) findViewById(R.id.button6_2);
        Button button63 = (Button) findViewById(R.id.button6_33);

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

        SharedPreferences.Editor editor24 = sharedPreferences24.edit();

        SharedPreferences sharedPreferences31 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor31 = sharedPreferences31.edit();

        SharedPreferences sharedPreferences32 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor32 = sharedPreferences32.edit();

        SharedPreferences sharedPreferences33 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor33 = sharedPreferences33.edit();

        SharedPreferences sharedPreferences34 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor34 = sharedPreferences34.edit();

        SharedPreferences sharedPreferences35 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor35 = sharedPreferences35.edit();

        SharedPreferences sharedPreferences41 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor41 = sharedPreferences41.edit();

        SharedPreferences sharedPreferences42 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor42 = sharedPreferences42.edit();

        SharedPreferences sharedPreferences43 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor43 = sharedPreferences43.edit();

        SharedPreferences sharedPreferences44 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor44 = sharedPreferences44.edit();

        SharedPreferences sharedPreferences51 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor51 = sharedPreferences51.edit();

        SharedPreferences sharedPreferences52 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor52 = sharedPreferences52.edit();

        SharedPreferences sharedPreferences53 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor53 = sharedPreferences53.edit();

        SharedPreferences sharedPreferences54 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor54 = sharedPreferences54.edit();

        SharedPreferences sharedPreferences55 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor55 = sharedPreferences55.edit();

        SharedPreferences sharedPreferences61 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor61 = sharedPreferences61.edit();

        SharedPreferences sharedPreferences62 = PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor62 = sharedPreferences62.edit();

        SharedPreferences sharedPreferences63= PreferenceManager

                .getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor63= sharedPreferences63.edit();

        boolean checkBoxValue = sharedPreferences.getBoolean("checked", false);
        boolean checkBoxValue2 = sharedPreferencess.getBoolean("checked1_2", false);
        boolean checboxValue3 = sharedPreferences13.getBoolean("checked1_3", false);
        boolean checboxValue4 = sharedPreferences14.getBoolean("checked1_4", false);
        boolean checboxValue5 = sharedPreferences21.getBoolean("checked2_1", false);
        boolean checboxValue6 = sharedPreferences22.getBoolean("checked2_2", false);
        boolean checboxValue7 = sharedPreferences23.getBoolean("checked2_3", false);
        boolean checboxValue8 = sharedPreferences21.getBoolean("checked2_3", false);
        boolean checboxValue9 = sharedPreferences31.getBoolean("checked3_1", false);
        boolean checboxValue10 = sharedPreferences32.getBoolean("checked3_2", false);
        boolean checboxValue11 = sharedPreferences33.getBoolean("checked3_3", false);
        boolean checboxValue12 = sharedPreferences34.getBoolean("checked3_4", false);
        boolean checboxValue13 = sharedPreferences35.getBoolean("checked3_5", false);
        boolean checboxValue14 = sharedPreferences41.getBoolean("checked4_1", false);
        boolean checboxValue15 = sharedPreferences42.getBoolean("checked4_2", false);
        boolean checboxValue16 = sharedPreferences43.getBoolean("checked4_3", false);
        boolean checboxValue17 = sharedPreferences44.getBoolean("checked4_4", false);
        boolean checboxValue18 = sharedPreferences35.getBoolean("checked5_1", false);
        boolean checboxValue19 = sharedPreferences41.getBoolean("checked5_2", false);
        boolean checboxValue20 = sharedPreferences42.getBoolean("checked5_3", false);
        boolean checboxValue21 = sharedPreferences43.getBoolean("checked5_4", false);
        boolean checboxValue22 = sharedPreferences44.getBoolean("checked5_5", false);
        boolean checboxValue23 = sharedPreferences61.getBoolean("checked6_1", false);
        boolean checboxValue24 = sharedPreferences62.getBoolean("checked6_2", false);
        boolean checboxValue25 = sharedPreferences63.getBoolean("checked6_3", false);


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
            });}

            if (checboxValue7) {
                //For Displaying Button
                button23.setVisibility(View.VISIBLE);

                button23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(apothikevmena.this, thewriadiotria.class));
                    }
                });}

                if (checboxValue8) {
                    //For Displaying Button
                    button24.setVisibility(View.VISIBLE);

                    button24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(apothikevmena.this, thewriadiotessera.class));
                        }
                    });}

        if (checboxValue9) {
            //For Displaying Button
            button31.setVisibility(View.VISIBLE);

            button31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatriaena.class));
                }
            });
        }

        if (checboxValue10) {
            //For Displaying Button
            button32.setVisibility(View.VISIBLE);

            button32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatriadio.class));
                }
            });
        }

        if (checboxValue11) {
            //For Displaying Button
            button33.setVisibility(View.VISIBLE);

            button33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatriatria.class));
                }
            });
        }

        if (checboxValue12) {
            //For Displaying Button
            button34.setVisibility(View.VISIBLE);

            button34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatriatessera.class));
                }
            });
        }

        if (checboxValue13) {
            //For Displaying Button
            button35.setVisibility(View.VISIBLE);

            button35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatriapente.class));
                }
            });
        }

        if (checboxValue14) {
            //For Displaying Button
            button41.setVisibility(View.VISIBLE);

            button41.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatesseraena.class));
                }
            });
        }

        if (checboxValue15) {
            //For Displaying Button
            button42.setVisibility(View.VISIBLE);

            button42.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatesseradio.class));
                }
            });
        }

        if (checboxValue16) {
            //For Displaying Button
            button43.setVisibility(View.VISIBLE);

            button43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatesseratria.class));
                }
            });

        }

        if (checboxValue17) {
            //For Displaying Button
            button43.setVisibility(View.VISIBLE);

            button43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriatesseratessera.class));
                }
            });
        }

        if (checboxValue18) {
            //For Displaying Button
            button51.setVisibility(View.VISIBLE);

            button51.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria51.class));
                }
            });
        }

        if (checboxValue19) {
            //For Displaying Button
            button52.setVisibility(View.VISIBLE);

            button52.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria52.class));
                }
            });
        }

        if (checboxValue20) {
            //For Displaying Button
            button53.setVisibility(View.VISIBLE);

            button53.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria53.class));
                }
            });
        }

        if (checboxValue21) {
            //For Displaying Button
            button54.setVisibility(View.VISIBLE);

            button54.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewria54.class));
                }
            });
        }

        if (checboxValue22) {
            //For Displaying Button
            button55.setVisibility(View.VISIBLE);

            button55.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, theoria55.class));
                }
            });
        }

        if (checboxValue23) {
            //For Displaying Button
            button61.setVisibility(View.VISIBLE);

            button61.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriaeksi1.class));
                }
            });
        }

        if (checboxValue24) {
            //For Displaying Button
            button62.setVisibility(View.VISIBLE);

            button62.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriaeksi2.class));
                }
            });
        }

        if (checboxValue25) {
            //For Displaying Button
            button63.setVisibility(View.VISIBLE);

            button63.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(apothikevmena.this, thewriaeksi3.class));
                }
            });
        }



                }
            }
