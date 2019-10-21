package com.nikosval.aepp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class opinions extends AppCompatActivity {
    String telikiapopsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinions);



        SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);

        final String username = prefs.getString("username", "UNKNOWN");

        Button Submitapopsi=(Button)findViewById(R.id.submit_apopsi);


        final DataBaseHelper db = new DataBaseHelper(this);

        Submitapopsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RatingBar rating=(RatingBar)findViewById(R.id.vathmologia);
                EditText apopsi=(EditText)findViewById(R.id.apopsi);
                final String telikiapopsi=apopsi.getText().toString();
                final float dEntry = rating.getRating();

                db.set_opinions(username,dEntry,telikiapopsi);
                Toast.makeText(opinions.this,"Η γνώμη σας καταχωρύθηκε!",Toast.LENGTH_SHORT).show();


            }


            });


    }
}
