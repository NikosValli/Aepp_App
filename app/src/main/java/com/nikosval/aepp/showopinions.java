package com.nikosval.aepp;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class showopinions extends AppCompatActivity {
    DataBaseHelper db;
ArrayList<String> apopseis;
ArrayAdapter adapter;
ListView apopseislist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showopinions);
        db=new DataBaseHelper(this);
        apopseislist=findViewById(R.id.listapopseis);

        apopseis=new ArrayList<>();
        
        viewapopseis();







    }

    int count=1;
    private void viewapopseis() {
     Cursor cursor=db.show_opinions();
     if (cursor.getCount()==0){

         Toast.makeText(this,"Δεν έχουν καταχωρηθεί απόψεις",Toast.LENGTH_SHORT);
     }

     else{

         while (cursor.moveToNext()){
             apopseis.add("Γνώμη "+count+":");
             apopseis.add("Χρήστης: "+cursor.getString(0));
             apopseis.add("Bαθμολογία: " +cursor.getString(1));
             apopseis.add("Άποψη: "+cursor.getString(2));
             apopseis.add(" ");

             count++;


         }

         adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,apopseis);
         apopseislist.setAdapter(adapter);
     }

    }
}
