package com.nikosval.aepp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class showerwthseis extends AppCompatActivity {
DataBaseHelper db;
ArrayList<String> erwthseis;
ArrayAdapter adapter;

ListView erwthseislist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showerwthseis);
        db=new DataBaseHelper(this);
        erwthseis=new ArrayList<>();
        erwthseislist=findViewById(R.id.erwthseis_list);

        viewerwthseis();

        erwthseislist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                String text=erwthseislist.getItemAtPosition(i).toString();
                Intent intent = new Intent(showerwthseis.this, QuestionLibraryKathigitwn.class);
                intent.putExtra("MyClass", text);

            }
        });
    }
int count;
    private void viewerwthseis() {

        Cursor cursor=db.show_erwthseis();

        if (cursor.getCount()==0){

            Toast.makeText(this,"Δεν έχουν καταχωρηθεί ερωτήσεις . ",Toast.LENGTH_SHORT);
        }

        else{

            while (cursor.moveToNext()){

                erwthseis.add("KαΘηγητής : "+cursor.getString(0));
                erwthseis.add("Ερώτηση: "+cursor.getString(1));
                erwthseis.add("Aπάντηση 1 : "+cursor.getString(2));
                erwthseis.add("Απάντηση 2 : "+cursor.getString(3));
                erwthseis.add("Απάντηση 3 : "+cursor.getString(4));
                erwthseis.add("Σωστή απάντηση : "+cursor.getString(5));

                erwthseis.add(" ");


            }

            adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,erwthseis);
            erwthseislist.setAdapter(adapter);


        }
    }
}
