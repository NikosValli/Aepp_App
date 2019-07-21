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

public class diagwnismakefalaio2 extends AppCompatActivity {
    private QuestionLibraryk2 mQuestionLibrary = new QuestionLibraryk2();
    private TextView mScoreView2;
    private TextView mQuestionView2;
    private Button choice1;
    private Button choice2;
    private Button choice3;

    private String manswer;
    private int mscored2 = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismakefalaio2);
        mScoreView2 = (TextView) findViewById(R.id.scorenumber);
        mQuestionView2 = (TextView) findViewById(R.id.erwthsh);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        updateQuestion();

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice1.getText()==manswer){


                    mscored2=mscored2+1;
                    Toast.makeText(diagwnismakefalaio2.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(diagwnismakefalaio2.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();
                updateScore(mscored2);
                updateQuestion();


            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2.getText()==manswer){

                    mscored2=mscored2+1;

                    Toast.makeText(diagwnismakefalaio2.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(diagwnismakefalaio2.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();

                updateScore(mscored2);
                updateQuestion();

            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice3.getText()==manswer){
                    mscored2=mscored2+1;

                    Toast.makeText(diagwnismakefalaio2.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(diagwnismakefalaio2.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();

                updateScore(mscored2);
                updateQuestion();


            }

        });

    }


    private void updateQuestion() {


        if (mQuestionNumber < mQuestionLibrary.getlength()) {
            if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 2) {


                mQuestionView2.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                choice3.setVisibility(View.GONE);

                mQuestionNumber++;
            }
            else if(mQuestionLibrary.getanswerslength(mQuestionNumber) == 3){
                choice3.setVisibility(View.VISIBLE);

                mQuestionView2.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                mQuestionNumber++;




            }


        }

        else{

            AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismakefalaio2.this);

            alert.setTitle("Το διαγώνισμα τελείωσε!");
            alert.setCancelable(false);

            alert.setMessage("Το σκορ σου είναι : " + mscored2 + " πόντοι!");
            alert.setPositiveButton("Επέστρεψε στο menu", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }

            });
            alert.show();

            Intent intent=new Intent(diagwnismakefalaio2.this,menuaskisewn2.class);
            intent.putExtra("scorediagwnisma2",mscored2);
            startActivity(intent);



        }
    }

    private void updateScore(int point){


        mScoreView2.setText(""+ mscored2+"/"+mQuestionLibrary.getlength());
    }
}