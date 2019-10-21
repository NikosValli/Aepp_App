package com.nikosval.aepp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class diagwnismak5 extends AppCompatActivity {
    private QuestionLibraryk5 mQuestionLibrary = new QuestionLibraryk5();

    private TextView mScoreView5;
    private TextView mQuestionView5;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    ArrayList apotelesmata;
    ArrayList apotelesmatalanthasmenes;
    String epilogh;

    private String manswer;
    private int mscored5 = 0;
    private int mQuestionNumber = 0;
    private int ii;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismak5);

        mScoreView5 = (TextView) findViewById(R.id.scorenumber5);
        mQuestionView5 = (TextView) findViewById(R.id.erwthsh5);
        choice1 = (Button) findViewById(R.id.choice15);
        choice2 = (Button) findViewById(R.id.choice25);
        choice3 = (Button) findViewById(R.id.choice35);
        apotelesmata=new ArrayList<String>();
        Intent startIntent= getIntent();
        ii= startIntent.getIntExtra("pernatoeuros5",0);
        apotelesmatalanthasmenes=new ArrayList<String>();

        mQuestionLibrary.suffle();

        updateQuestion();


        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice1);

                if (choice1.getText() == manswer) {


                    mscored5 = mscored5 + 1;
                    Toast.makeText(diagwnismak5.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak5.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();
                updateScore(mscored5);
                apotelesmata.add("Aπάντησες: "+choice1.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView5.getText().toString());
                    apotelesmatalanthasmenes.add("Απάντησες λανθασμένα: "+choice1.getText().toString());
                    apotelesmatalanthasmenes.add("Η σωστή απάντηση είναι: "+manswer.toString());

                    apotelesmatalanthasmenes.add(" ");

                }
                apotelesmata.add(" ");

                updateQuestion();


            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice2);
                if (choice2.getText() == manswer) {

                    mscored5 = mscored5 + 1;

                    Toast.makeText(diagwnismak5.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak5.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored5);
                apotelesmata.add("Aπάντησες: "+choice2.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView5.getText().toString());
                    apotelesmatalanthasmenes.add("Απάντησες λανθασμένα: "+choice2.getText().toString());
                    apotelesmatalanthasmenes.add("Η σωστή απάντηση είναι: "+manswer.toString());

                    apotelesmatalanthasmenes.add(" ");

                }
                apotelesmata.add(" ");

                updateQuestion();


            }
        });


        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice3);
                if (choice3.getText() == manswer) {
                    mscored5 = mscored5 + 1;

                    Toast.makeText(diagwnismak5.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak5.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored5);
                apotelesmata.add("Aπάντησες: "+choice3.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView5.getText().toString());
                    apotelesmatalanthasmenes.add("Απάντησες λανθασμένα: "+choice3.getText().toString());
                    apotelesmatalanthasmenes.add("Η σωστή απάντηση είναι: "+manswer.toString());

                    apotelesmatalanthasmenes.add(" ");

                }
                apotelesmata.add(" ");

                updateQuestion();



            }
        });

    }


    private void updateQuestion() {



        if (mQuestionNumber <ii) {




            if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 2) {


                mQuestionView5.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView5.getText().toString());

                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                choice3.setVisibility(View.GONE);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

                mQuestionNumber++;
            } else if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 3) {
                choice3.setVisibility(View.VISIBLE);

                mQuestionView5.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView5.getText().toString());

                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

                mQuestionNumber++;


            }
        } else {

            AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismak5.this);

            alert.setTitle("Το διαγώνισμα τελείωσε!");
            alert.setCancelable(false);

            alert.setMessage("Το σκορ σου είναι : " + mscored5 + " πόντοι!");
            alert.setPositiveButton("Δείξε μου όλες τις απαντήσεις", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(diagwnismak5.this, menuaskisewn5.class);
                    intent.putExtra("scorediagwnisma5", mscored5);
                    startActivity(intent);
                    finish();
                    Intent intent2 = new Intent(diagwnismak5.this, analitikak5.class);
                    intent2.putExtra("apotelesmata", apotelesmata);
                    startActivity(intent2);
                }

            });


            alert.setNegativeButton("Δείξε μόνο τις λανθασμένες απαντήσεις", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(diagwnismak5.this, menuaskisewn5.class);
                    intent.putExtra("scorediagwnisma5", mscored5);
                    startActivity(intent);
                    finish();
                    Intent intentlathos = new Intent(diagwnismak5.this, analitikalanthasmenes5.class);
                    intentlathos.putExtra("apotelesmatalanthasmenes5", apotelesmatalanthasmenes);
                    startActivity(intentlathos);
                }

            });
            alert.show();
        }
    }

    public String updateText(View v){
        Button btn = (Button) findViewById(v.getId());
        String text = btn.getText().toString();
        return text;
    }

    private void updateScore(int point) {


        mScoreView5.setText("" + mscored5 + "/" + mQuestionLibrary.getlength());
    }

}


