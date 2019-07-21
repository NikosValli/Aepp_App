package com.nikosval.aepp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class multiplechoicek1 extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button choice1;
    private Button choice2;
    private Button choice3;

    private String manswer;
    private int mscore=0;
    private int mQuestionNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplechoicek1);

        mScoreView=(TextView)findViewById(R.id.scorenumber);
        mQuestionView=(TextView)findViewById(R.id.erwthsh);
        choice1=(Button) findViewById(R.id.choice1);
        choice2=(Button)findViewById(R.id.choice2);
        choice3=(Button)findViewById(R.id.choice3);
        updateQuestion();
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice1.getText()==manswer){


                    mscore=mscore+1;
                    Toast.makeText(multiplechoicek1.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(multiplechoicek1.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();
                    updateScore(mscore);
                       updateQuestion();


            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2.getText()==manswer){

                    mscore=mscore+1;

                    Toast.makeText(multiplechoicek1.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(multiplechoicek1.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();

                     updateScore(mscore);
                      updateQuestion();

            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice3.getText()==manswer){
                    mscore=mscore+1;

                    Toast.makeText(multiplechoicek1.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(multiplechoicek1.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();

                updateScore(mscore);
                updateQuestion();


                }

        });







}


    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt("ScoreKey", mscore);
        outState.putInt("IndexKey", mQuestionNumber);
    }




    private void updateQuestion() {


if (mQuestionNumber<mQuestionLibrary.getlength())
{

    mQuestionView.setText(mQuestionLibrary.getquestion(mQuestionNumber));
    choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
    choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
    choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
    manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
    mQuestionNumber++;
}


else{

    AlertDialog.Builder alert = new AlertDialog.Builder(multiplechoicek1.this);

    alert.setTitle("Το διαγώνισμα τελείωσε!");
    alert.setCancelable(false);

    alert.setMessage("Το σκορ σου είναι : " + mscore + " πόντοι!");
    alert.setPositiveButton("Επέστρεψε στο menu", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            finish();
        }

    });
    alert.show();

    Intent intent=new Intent(multiplechoicek1.this,menuaskisewn1.class);
    intent.putExtra("scoremc",mscore);
    startActivity(intent);



}




            }


    private void updateScore(int point){


        mScoreView.setText(""+ mscore+"/"+mQuestionLibrary.getlength());
    }



}



