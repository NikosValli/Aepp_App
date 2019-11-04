package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class show_my_questions extends AppCompatActivity {
    DataBaseHelper db;
    ArrayList<String> oierwthseismou;
    ArrayAdapter adapter;
    ArrayList erwthseispouthaperasoun;
int i=1;
    ListView erwthseislist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_my_questions);
        db=new DataBaseHelper(this);
        oierwthseismou=new ArrayList<>();
        erwthseislist=findViewById(R.id.show_my_questions);



        viewerwthseis();

        erwthseislist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String passingerwthsh = String.valueOf(oierwthseismou.get(i).toString());
                String substr=passingerwthsh.substring(passingerwthsh.indexOf(":")+1);

                Intent passare = new Intent(show_my_questions.this,epeksergasiaerwthsewn.class);
                passare.putExtra("herwthsh", substr);
                startActivity(passare);



            }
        });



    }
    int count;
    private void viewerwthseis() {
        SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);

        final String username = prefs.getString("username", "UNKNOWN");

        Cursor cursor=db.show_my_erwthseis(username);

        if (cursor.getCount()==0){

            Toast.makeText(this,"Δεν έχουν καταχωρηθεί ερωτήσεις . ",Toast.LENGTH_SHORT);
        }

        else{

            while (cursor.moveToNext()){

                oierwthseismou.add("KαΘηγητής :"+cursor.getString(0));
                oierwthseismou.add("Ερώτηση :"+cursor.getString(1));
                oierwthseismou.add("Aπάντηση 1: "+cursor.getString(2));

                oierwthseismou.add("Απάντηση 2: "+cursor.getString(3));

                oierwthseismou.add("Απάντηση 3: "+cursor.getString(4));

                oierwthseismou.add("Σωστή απάντηση :"+cursor.getString(5));

                oierwthseismou.add(" ");


            }

            adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,oierwthseismou);
            erwthseislist.setAdapter(adapter);


        }
    }
    }

