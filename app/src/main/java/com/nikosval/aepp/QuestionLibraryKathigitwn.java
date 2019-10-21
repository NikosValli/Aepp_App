package com.nikosval.aepp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class QuestionLibraryKathigitwn extends AppCompatActivity {
    DataBaseHelper db;
    ArrayList<String> erwthseiss;
    ArrayAdapter adapter;
    ListView erwthseislist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_library_kathigitwn);
        db = new DataBaseHelper(this);
        erwthseiss = new ArrayList<>();
        erwthseislist = findViewById(R.id.erwthseis_passed_list);
        viewperasmeneserwthseis();






        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,erwthseiss);
        erwthseislist.setAdapter(adapter);
    }


    private void viewperasmeneserwthseis() {
        Intent intent = getIntent();

        String erwthsh = intent.getStringExtra("MyClass");

        erwthseiss.add("Eρώτηση: "+erwthsh);




    }

}