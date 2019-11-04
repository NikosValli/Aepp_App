package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class epeksergasiaerwthsewn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epeksergasiaerwthsewn);
        final Button epeksergasia=(Button)findViewById(R.id.epeksergasia_erw);
        final DataBaseHelper db = new DataBaseHelper(this);
        Intent passare = getIntent();
        String the_word = passare.getStringExtra("herwthsh");
        final EditText erwthsh=(EditText) findViewById(R.id.erwthshkathigiti);
        erwthsh.setText(the_word);
        Button diagrafh=(Button)findViewById(R.id.diagrafi_erw);




        epeksergasia.setOnClickListener(new View.OnClickListener() {
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

                boolean isupdate=db.update_erwthsh(usernamee,erwthshh,epilogh11,epilogh22,epilogh33,swsth_apanthshh);

                if (isupdate==true){

                    Toast.makeText(epeksergasiaerwthsewn.this,"Το αίτημα για επεξεργασία έγινε δεκτό!",Toast.LENGTH_SHORT).show();


                }

                else{


                }

            }


        });


        diagrafh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String erwthshh=erwthsh.getText().toString();

                int deleterows=db.deleteerwthsh(erwthshh);
                if (deleterows>0){
                    Toast.makeText(epeksergasiaerwthsewn.this,"H Διαγραφή πραγματοποιήθηκε",Toast.LENGTH_LONG).show();
                }

            }


        });
    }
}
