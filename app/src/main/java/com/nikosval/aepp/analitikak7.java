package com.nikosval.aepp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class analitikak7 extends AppCompatActivity {
    ArrayList<String> apotelesmata;
    ArrayAdapter adapter;
    ListView apotelesmatalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analitikak7);
        apotelesmatalist=findViewById(R.id.listanalitikaapotelesmata7);

        ArrayList<String> apotelesmata = (ArrayList<String>) getIntent().getSerializableExtra("apotelesmata7");

        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,apotelesmata);
        apotelesmatalist.setAdapter(adapter);
    }
}
