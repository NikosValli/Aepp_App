package com.nikosval.aepp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class diagwnismakefalaio1<count> extends AppCompatActivity {
    Button mTrueButton;
    Button mFalseButton;
    TextView mScoreTextView;
    TextView mQuestionTextView;
    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();
    ProgressBar mProgressBar;
    int mIndex;
    int mScore;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private String manswer;
    int mQuestion;
    Toast mToastMessage;


    @NonNull
    private TrueFalse[] mQuestionBank = new TrueFalse[]{
            new TrueFalse(R.string.erwthsh1d1, false),
            new TrueFalse(R.string.erwthsh2d1, true),
            new TrueFalse(R.string.erwthsh3d1, false),
            new TrueFalse(R.string.erwthsh4d1, true),
            new TrueFalse(R.string.erwthsh5d1, true),
            new TrueFalse(R.string.erwthsh6d1, false),
            new TrueFalse(R.string.erwthsh7d1, false),
            new TrueFalse(R.string.erwthsh8d1, true),
            new TrueFalse(R.string.erwthsh9d1, true),
            new TrueFalse(R.string.erwthsh10d1, false),
            new TrueFalse(R.string.erwthsh11d1, false),
            new TrueFalse(R.string.erwthsh12d1, true),
            new TrueFalse(R.string.erwthsh13d1, false)
    };


    final int PROGRESS_BAR_INCREMENT = (int) Math.ceil(100.0 / mQuestionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismakefalaio1);
        mTrueButton = findViewById(R.id.true_buttond1);
        mFalseButton = findViewById(R.id.false_buttond1);
        mQuestionTextView = findViewById(R.id.question_text_viewd1);
        mScoreTextView = findViewById(R.id.scored1111);
        mProgressBar = findViewById(R.id.progressBard1);





        if (savedInstanceState != null) {
            mScore = savedInstanceState.getInt("ScoreKey");
            mIndex = savedInstanceState.getInt("IndexKey");
            mScoreTextView.setText("Score " + mScore + "/" + mQuestionBank.length);
        } else {
            mScore = 0;
            mIndex = 0;
        }


        mQuestion = mQuestionBank[mIndex].getQuestionID();
        mQuestionTextView.setText(mQuestion);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
                updateQuestion();
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
                updateQuestion();
            }
        });


    }
int mQuestionNumber=0;
public int count=0;
    private void updateQuestion() {




        // This takes the modulus. Not a division.
        mIndex = (mIndex + 1) % (mQuestionBank.length);
        count++;



        // Present an alert dialog if we reach the end.
        if (mIndex == 0) {

            AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismakefalaio1.this);

            alert.setTitle("Το διαγώνισμα τελείωσε!");
            alert.setCancelable(false);

            if (mScore<=5) {
                alert.setMessage("Το σκορ σου είναι : " + mScore + " πόντοι! Συνιστούμε να μελετήσεις καλύτερα αυτή την ενότητα!");
            }
            else if (mScore>5 && mScore<=10){

                alert.setMessage("Το σκορ σου είναι : " + mScore + " πόντοι! Oχι και άσχημα αλλα προτείνουμε μια επανάληψη της ενότητας!");

            }

            else if (mScore>10){

                alert.setMessage("Το σκορ σου είναι : " + mScore + " πόντοι! Πολύ καλά!");

            }
            alert.setPositiveButton("Επέστρεψε στο menu", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();


                }

            });


            alert.show();



        Intent intent=new Intent(diagwnismakefalaio1.this,menuaskisewn1.class);
           intent.putExtra("score1",mScore);
            startActivity(intent);








        }




    mQuestion = mQuestionBank[mIndex].getQuestionID();
        mQuestionTextView.setText(mQuestion);


        mProgressBar.incrementProgressBy(PROGRESS_BAR_INCREMENT);

        mScoreTextView.setText("Score " + mScore + "/" + mQuestionBank.length);
    }


    private void checkAnswer(boolean userSelection) {

        boolean correctAnswer = mQuestionBank[mIndex].isAnswer();

        // Can cancel the Toast message if there is one on screen and a new answer
        // has been submitted.
        if (mToastMessage != null) {
            mToastMessage.cancel();
        }

        if(userSelection == correctAnswer) {
            mToastMessage = makeText(getApplicationContext(), R.string.correct_toast, Toast.LENGTH_SHORT);
            mScore = mScore + 1;

        } else {
            mToastMessage = Toast.makeText(getApplicationContext(), R.string.incorrect_toast, Toast.LENGTH_LONG);
        }

        mToastMessage.show();

    }



    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt("ScoreKey", mScore);
        outState.putInt("IndexKey", mIndex);
    }

    public static class TrueFalse {


            private int mQuestionID;
            private boolean mAnswer;

            public TrueFalse(int questionResourceID, boolean trueOrFalse) {
                mQuestionID = questionResourceID;
                mAnswer = trueOrFalse;
            }

            public int getQuestionID() {
                return mQuestionID;
            }

            public boolean isAnswer() {
                return mAnswer;
            }




        }







}