package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class analitikak2 extends AppCompatActivity {
    ArrayList<String> apotelesmata;
    ArrayAdapter adapter;
    ListView apotelesmatalist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analitikak2);

        apotelesmatalist = findViewById(R.id.listanalitikaapotelesmata2);


        ArrayList<String> apotelesmata = (ArrayList<String>) getIntent().getSerializableExtra("apotelesmata2");


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, apotelesmata);
        apotelesmatalist.setAdapter(adapter);


    }


    public void onBackPressed() {


        Intent intentback = new Intent(analitikak2.this, menugiaerwthseiskath.class);

        startActivity(intentback);
    }
}