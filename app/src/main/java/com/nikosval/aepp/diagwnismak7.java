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

public class diagwnismak7 extends AppCompatActivity {
    private QuestionLibraryk7 mQuestionLibrary = new QuestionLibraryk7();
    private TextView mScoreView7;
    private TextView mQuestionView7;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    ArrayList apotelesmata;
    ArrayList apotelesmatalanthasmenes;
    String epilogh;

    private String manswer;
    private int mscored7 = 0;
    private int mQuestionNumber = 0;
    private int ii;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismak7);

        mScoreView7 = (TextView) findViewById(R.id.scorenumber7);
        mQuestionView7 = (TextView) findViewById(R.id.erwthsh7);
        choice1 = (Button) findViewById(R.id.choice17);
        choice2 = (Button) findViewById(R.id.choice27);
        choice3 = (Button) findViewById(R.id.choice37);
        apotelesmata=new ArrayList<String>();
        Intent startIntent= getIntent();
        ii= startIntent.getIntExtra("pernatoeuros7",0);
        updateScore(0);

        apotelesmatalanthasmenes=new ArrayList<String>();

        mQuestionLibrary.suffle();

        updateQuestion();


        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice1);

                if (choice1.getText() == manswer) {


                    mscored7 = mscored7 + 1;
                    Toast.makeText(diagwnismak7.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak7.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();
                updateScore(mscored7);
                apotelesmata.add("Aπάντησες: "+choice1.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView7.getText().toString());
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

                    mscored7 = mscored7+ 1;

                    Toast.makeText(diagwnismak7.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak7.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored7);
                apotelesmata.add("Aπάντησες: "+choice2.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView7.getText().toString());
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
                    mscored7 = mscored7 + 1;

                    Toast.makeText(diagwnismak7.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismak7.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored7);
                apotelesmata.add("Aπάντησες: "+choice3.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView7.getText().toString());
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


                mQuestionView7.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView7.getText().toString());

                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                choice3.setVisibility(View.GONE);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());


                mQuestionNumber++;
            } else if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 3) {
                choice3.setVisibility(View.VISIBLE);

                mQuestionView7.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView7.getText().toString());

                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

                mQuestionNumber++;


            }
        } else {

            AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismak7.this);

            alert.setTitle("Το διαγώνισμα τελείωσε!");
            alert.setCancelable(false);
            SharedPreferences.Editor editor = getSharedPreferences("osesapantisa7", MODE_PRIVATE).edit();
            editor.putInt("osesapantisa7",ii);
            editor.apply();

            alert.setMessage("Το σκορ σου είναι : " + mscored7 + " πόντοι!");
            alert.setPositiveButton("Εμφάνισε όλες τις απαντήσεις", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(diagwnismak7.this, menuaskisewn7.class);
                    intent.putExtra("scorediagwnisma7", mscored7);
                    startActivity(intent);
                    finish();
                    Intent intent6 = new Intent(diagwnismak7.this, analitikak7.class);
                    intent6.putExtra("apotelesmata7", apotelesmata);
                    startActivity(intent6);
                }

            });

            alert.setNegativeButton("Εμφάνισε μόνο τις λανθασμένες απαντήσεις", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(diagwnismak7.this, menuaskisewn7.class);
                    intent.putExtra("scorediagwnisma7", mscored7);
                    startActivity(intent);
                    finish();
                    Intent intentlathos = new Intent(diagwnismak7.this, analitikalanthasmenesk7.class);
                    intentlathos.putExtra("apotelesmatalanthasmenes7", apotelesmatalanthasmenes);
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


        mScoreView7.setText("" + mscored7 + "/"+ii);
    }

}

