package com.nikosval.aepp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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

import com.google.gson.Gson;

import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class showerwthseis extends AppCompatActivity {
DataBaseHelper db;
ArrayList<String> erwthseis;
ArrayAdapter adapter;
    ArrayList erwthseispouthaperasoun;

    int i=1;


ListView erwthseislist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showerwthseis);
        db=new DataBaseHelper(this);
        Button passquestions=(Button)findViewById(R.id.passquestions1);
        erwthseis=new ArrayList<>();
        erwthseislist=findViewById(R.id.erwthseis_list);
        erwthseispouthaperasoun=new ArrayList<String>();


        viewerwthseis();

        erwthseislist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,final int i, long id) {


                AlertDialog.Builder alert = new AlertDialog.Builder(showerwthseis.this);

                alert.setTitle("Θέλετε σίγουρα να διαγράψετε την ερώτηση ?");
                alert.setCancelable(false);

                alert.setMessage("Θα πραγματοποιηθεί διαγραφή της ερώτησης");
                alert.setPositiveButton("Διαγραφή ερώτησης", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        String passingerwthsh = String.valueOf(erwthseis.get(i).toString());
                        String substr=passingerwthsh.substring(passingerwthsh.indexOf(":")+2);
                        int deleterows=db.deleteerwthsh(substr);
                        if (deleterows>0){
                            Toast.makeText(showerwthseis.this,"H Διαγραφή πραγματοποιήθηκε",Toast.LENGTH_LONG).show();
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }
                    }

                });

                alert.show();

                String text=erwthseislist.getItemAtPosition(i).toString();

            }
        });


        passquestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences=getSharedPreferences("oi erwthseis",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                Gson gson=new Gson();
                String json=gson.toJson(erwthseispouthaperasoun);
                editor.putString("oi erwthseiss",json);
                editor.apply();
                Toast.makeText(showerwthseis.this, "Οι ερωτήσεις καταχωρύθηκαν!", Toast.LENGTH_SHORT).show();




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
                erwthseispouthaperasoun.add(cursor.getString(i));

                erwthseis.add("Aπάντηση 1 : "+cursor.getString(2));
                erwthseispouthaperasoun.add(cursor.getString(i+1));

                erwthseis.add("Απάντηση 2 : "+cursor.getString(3));
                erwthseispouthaperasoun.add(cursor.getString(i+2));

                erwthseis.add("Απάντηση 3 : "+cursor.getString(4));
                erwthseispouthaperasoun.add(cursor.getString(i+3));

                erwthseis.add("Σωστή απάντηση : "+cursor.getString(5));
                erwthseispouthaperasoun.add(cursor.getString(i+4));


                erwthseis.add(" ");


            }

            adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,erwthseis);
            erwthseislist.setAdapter(adapter);


        }
    }
}
