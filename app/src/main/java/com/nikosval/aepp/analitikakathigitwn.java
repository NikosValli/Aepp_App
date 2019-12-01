package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class analitikakathigitwn extends AppCompatActivity {
    ArrayList<String> apotelesmata;
    ArrayAdapter adapter;
    ListView apotelesmatalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analitikakathigitwn);

        apotelesmatalist=findViewById(R.id.listanalitikaapotelesmatakathigitwn);



        ArrayList<String> apotelesmata = (ArrayList<String>) getIntent().getSerializableExtra("apotelesmatakathigitwn");


        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,apotelesmata);
        apotelesmatalist.setAdapter(adapter);


    }


    public void onBackPressed() {


        Intent intentback = new Intent(analitikakathigitwn.this, menugiaerwthseiskath.class);

        startActivity(intentback);
    }
}

