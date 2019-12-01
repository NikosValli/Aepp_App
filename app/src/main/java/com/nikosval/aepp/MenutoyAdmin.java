package com.nikosval.aepp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenutoyAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutoy_admin);


        Button showopinions=(Button)findViewById(R.id.showopinions);
        Button showerwthseis=(Button)findViewById(R.id.showerwthseis);


        showopinions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MenutoyAdmin.this, showopinions.class));


            }


        });


        showerwthseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MenutoyAdmin.this, showerwthseis.class));


            }


        });






    }


    public void onBackPressed() {



        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Log out")
                .setMessage("Θες να αποσυνδεθείς απο την εφαρμογή?")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        Intent intent = new Intent(MenutoyAdmin.this, LoginActivity.class);
                        intent.putExtra("finish", true);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                                Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();


                    }

                })
                .setNegativeButton("Οχι", null)
                .show();










    }

}
