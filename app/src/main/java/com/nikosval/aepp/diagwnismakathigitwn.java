package com.nikosval.aepp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class diagwnismakathigitwn extends AppCompatActivity {
    ArrayList<String> erwthseiskathigitwn;
    ArrayAdapter adapter;
    ListView erwthseislist;
    private TextView mScoreView;
    private TextView erwthshkathigiti;
    private Button choice1kathigiti;
    private Button choice2kathigiti;
    private Button choice3kathigiti;
    ArrayList apotelesmata;
    private String manswer;
    private int i=0;
    private int mscored2 = 0;
    private int mQuestionNumber = 0;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismakathigitwn);
        mScoreView = (TextView) findViewById(R.id.scorenumber);
        erwthshkathigiti = (TextView) findViewById(R.id.erwthshkathigiti);
        choice1kathigiti = (Button) findViewById(R.id.choice1kath);
        choice2kathigiti = (Button) findViewById(R.id.choice2kath);
        choice3kathigiti = (Button) findViewById(R.id.choice3kathigiti);
        SharedPreferences preferenceskathigitis1 = PreferenceManager.getDefaultSharedPreferences(this);
         name = preferenceskathigitis1.getString("kathigitis1", "");

        erwthseiskathigitwn = (ArrayList<String>) getIntent().getSerializableExtra("erwthseispoupernanee");

        apotelesmata=new ArrayList<String>();





        updateQuestion();


        choice1kathigiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice1kathigiti.getText().equals(manswer)) {


                    mscored2 = mscored2 + 1;
                    Toast.makeText(diagwnismakathigitwn.this, "Σωστα!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(diagwnismakathigitwn.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                }
                updateScore(mscored2);
                apotelesmata.add("Aπάντησες: "+choice1kathigiti.getText().toString());




                apotelesmata.add(" ");
                updateQuestion();
        }

        });


        choice2kathigiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2kathigiti.getText().equals(manswer)) {


                    mscored2 = mscored2 + 1;
                    Toast.makeText(diagwnismakathigitwn.this, "Σωστα!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(diagwnismakathigitwn.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                }
                updateScore(mscored2);
                apotelesmata.add("Aπάντησες: "+choice2kathigiti.getText().toString());


                apotelesmata.add(" ");
                updateQuestion();

            }
        });

        choice3kathigiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice3kathigiti.getText().equals(manswer)) {


                    mscored2 = mscored2 + 1;
                    Toast.makeText(diagwnismakathigitwn.this, "Σωστα!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(diagwnismakathigitwn.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                }
                updateScore(mscored2);
                apotelesmata.add("Aπάντησες: "+choice2kathigiti.getText().toString());


                apotelesmata.add(" ");

                updateQuestion();

            }
        });
    }


    private void updateQuestion() {



                    if (i < erwthseiskathigitwn.size()) {


                        erwthshkathigiti.setText(erwthseiskathigitwn.get(i));
                        apotelesmata.add("Η ερώτηση ήταν: "+erwthshkathigiti.getText().toString());



                        choice1kathigiti.setText(erwthseiskathigitwn.get(i + 1));
                        choice2kathigiti.setText(erwthseiskathigitwn.get(i + 2));
                        choice3kathigiti.setText(erwthseiskathigitwn.get(i + 3));
                        manswer = erwthseiskathigitwn.get(i + 4);
                        apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

                        i = i + 5;


                    }





            else{

                    AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismakathigitwn.this);

                    alert.setTitle("Το διαγώνισμα τελείωσε!");
                    alert.setCancelable(false);

                    alert.setMessage("Το σκορ σου είναι : " + mscored2 + " πόντοι!");
                    alert.setPositiveButton("Δείξε μου όλες τις απαντήσεις", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent intentk2 = new Intent(diagwnismakathigitwn.this, analitikakathigitwn.class);
                            intentk2.putExtra("apotelesmatakathigitwn", apotelesmata);
                            startActivity(intentk2);

                        }

                    });

                    alert.show();


                }
            }









    private void updateScore(int point){


        mScoreView.setText(""+ mscored2+"/"+erwthseiskathigitwn.size()/5);
    }






        }

