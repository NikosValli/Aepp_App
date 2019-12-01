package com.nikosval.aepp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class diagwnismak8 extends AppCompatActivity {
    private QuestionLibraryk8 mQuestionLibrary = new QuestionLibraryk8();
    private TextView mScoreView8;
    private TextView mQuestionView8;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    ArrayList apotelesmata;
    ArrayList apotelesmatalanthasmenes;
    String epilogh;

    private String manswer;
    private int mscored8 = 0;
    private int mQuestionNumber = 0;
    private int ii;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismak8);

        mScoreView8 = (TextView) findViewById(R.id.scorenumber8);
        mQuestionView8 = (TextView) findViewById(R.id.erwthsh8);
        choice1 = (Button) findViewById(R.id.choice18);
        choice2 = (Button) findViewById(R.id.choice28);
        choice3 = (Button) findViewById(R.id.choice38);
        apotelesmata=new ArrayList<String>();
        Intent startIntent= getIntent();
        ii= startIntent.getIntExtra("pernatoeuros8",0);
        updateScore(0);

        apotelesmatalanthasmenes=new ArrayList<String>();

        mQuestionLibrary.suffle();

        updateQuestion();


        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice1);

                if (choice1.getText() == manswer) {


                    mscored8 = mscored8 + 1;
                    Toast.makeText(diagwnismak8.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak8.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();
                updateScore(mscored8);
                apotelesmata.add("Aπάντησες: "+choice1.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView8.getText().toString());
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

                    mscored8 = mscored8+ 1;

                    Toast.makeText(diagwnismak8.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak8.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored8);
                apotelesmata.add("Aπάντησες: "+choice2.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView8.getText().toString());
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
                    mscored8 = mscored8 + 1;

                    Toast.makeText(diagwnismak8.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak8.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored8);
                apotelesmata.add("Aπάντησες: "+choice3.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView8.getText().toString());
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


        if (mQuestionNumber < ii) {
            if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 2) {


                mQuestionView8.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView8.getText().toString());

                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                choice3.setVisibility(View.GONE);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());


                mQuestionNumber++;
            } else if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 3) {
                choice3.setVisibility(View.VISIBLE);

                mQuestionView8.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView8.getText().toString());

                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

                mQuestionNumber++;


            }
        } else {

            AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismak8.this);

            alert.setTitle("Το διαγώνισμα τελείωσε!");
            alert.setCancelable(false);
            SharedPreferences.Editor editor = getSharedPreferences("osesapantisa8", MODE_PRIVATE).edit();
            editor.putInt("osesapantisa8",ii);
            editor.apply();

            alert.setMessage("Το σκορ σου είναι : " + mscored8 + " πόντοι!");
            alert.setPositiveButton("Εμφάνισε όλες τις απαντήσεις", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(diagwnismak8.this, menuaskisewn8.class);
                    intent.putExtra("scorediagwnisma8", mscored8);
                    startActivity(intent);
                    finish();
                    Intent intent6 = new Intent(diagwnismak8.this, analitikak8.class);
                    intent6.putExtra("apotelesmata8", apotelesmata);
                    startActivity(intent6);
                }

            });

            alert.setNegativeButton("Εμφάνισε μόνο τις λανθασμένες απαντήσεις", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(diagwnismak8.this, menuaskisewn8.class);
                    intent.putExtra("scorediagwnisma8", mscored8);
                    startActivity(intent);
                    finish();
                    Intent intentlathos = new Intent(diagwnismak8.this, analitikalanthasmenesk8.class);
                    intentlathos.putExtra("apotelesmatalanthasmenes8", apotelesmatalanthasmenes);
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


        mScoreView8.setText("" + mscored8 + "/"+ii);
    }

}

