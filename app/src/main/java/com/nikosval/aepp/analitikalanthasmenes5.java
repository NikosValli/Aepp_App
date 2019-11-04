package com.nikosval.aepp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class analitikalanthasmenes5 extends AppCompatActivity {


    ArrayList<String> apotelesmata;
    ArrayAdapter adapter;
    ListView apotelesmatalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analitikalanthasmenes5);
        apotelesmatalist=findViewById(R.id.listanalitikalanthasmenes5);

        ArrayList<String> apotelesmata = (ArrayList<String>) getIntent().getSerializableExtra("apotelesmatalanthasmenes5");


        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,apotelesmata);
        apotelesmatalist.setAdapter(adapter);
    }
}
