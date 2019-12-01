package com.nikosval.aepp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class findyourpassword extends AppCompatActivity {
    DataBaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findyourpassword);


        final EditText usernamegiarecall = (EditText) findViewById(R.id.usernameforrecall);
        final EditText mistiki_apantisi = (EditText) findViewById(R.id.mistikiapanthsh);
        Button kataxwrisi = (Button) findViewById(R.id.kataxwrisigiarecall);
        db = new DataBaseHelper(this);
        final TextView okwdikossou = (TextView) findViewById(R.id.okwdikos);


        kataxwrisi.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String username = usernamegiarecall.getText().toString();
                String mistiki_apantisii = mistiki_apantisi.getText().toString();
                Cursor cursor = db.show_my_password(username, mistiki_apantisii);

                while (cursor.moveToNext()) {

                    okwdikossou.setText(cursor.getString(0));


                }
            }

        });
    }

}

