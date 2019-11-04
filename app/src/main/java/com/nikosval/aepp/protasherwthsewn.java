package com.nikosval.aepp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class protasherwthsewn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protasherwthsewn);

        Button Submiterwthsh=(Button)findViewById(R.id.submit_erwthsh);

        final DataBaseHelper db = new DataBaseHelper(this);


        Submiterwthsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);

                 String usernamee = prefs.getString("username", "UNKNOWN");


                EditText erwthsh=(EditText)findViewById(R.id.erwthshkathigiti);
                EditText epilogh1=(EditText)findViewById(R.id.apanthsh1);
                EditText epilogh2=(EditText)findViewById(R.id.apanthsh2);
                EditText epilogh3=(EditText)findViewById(R.id.apanthsh3);
                EditText swsth_apanthsh=(EditText)findViewById(R.id.swsthapanthsh);
                final String erwthshh=erwthsh.getText().toString();
                final String epilogh11=epilogh1.getText().toString();
                final String epilogh22=epilogh2.getText().toString();
                final String epilogh33=epilogh3.getText().toString();
                final String swsth_apanthshh=swsth_apanthsh.getText().toString();




                db.set_erwthseis(usernamee,erwthshh,epilogh11,epilogh22,epilogh33,swsth_apanthshh);
                Toast.makeText(protasherwthsewn.this,"Η ερώτησή σας καταχωρύθηκε!",Toast.LENGTH_SHORT).show();








            }


        });




    }
}

