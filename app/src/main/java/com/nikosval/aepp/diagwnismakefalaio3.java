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

import java.util.ArrayList;

public class diagwnismakefalaio3 extends AppCompatActivity {

    private QuestionLibraryk3 mQuestionLibrary = new QuestionLibraryk3();
    private TextView mScoreView3;
    private TextView mQuestionView3;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    String epilogh;
    private int ii;


    ArrayList apotelesmata;
    ArrayList apotelesmatalanthasmenes;


    private String manswer;
    private int mscored3 = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismakefalaio3);
        mScoreView3 = (TextView) findViewById(R.id.scorenumber3);
        mQuestionView3 = (TextView) findViewById(R.id.erwthsh3);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        Intent startIntent= getIntent();
        ii= startIntent.getIntExtra("pernatoeuros3",0);
        apotelesmata=new ArrayList<String>();
        apotelesmatalanthasmenes=new ArrayList<String>();

        mQuestionLibrary.suffle();


        updateQuestion();


        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice1);
                if (choice1.getText() == manswer) {


                    mscored3 = mscored3 + 1;
                    Toast.makeText(diagwnismakefalaio3.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismakefalaio3.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();
                updateScore(mscored3);
                apotelesmata.add("Aπάντησες: "+choice1.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView3.getText().toString());
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

                    mscored3 = mscored3 + 1;

                    Toast.makeText(diagwnismakefalaio3.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismakefalaio3.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored3);
                apotelesmata.add("Aπάντησες: "+choice2.getText().toString());

                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView3.getText().toString());
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
                    mscored3 = mscored3 + 1;

                    Toast.makeText(diagwnismakefalaio3.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(diagwnismakefalaio3.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored3);
                apotelesmata.add("Aπάντησες: "+choice3.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView3.getText().toString());
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


                            mQuestionView3.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                            apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView3.getText().toString());

                            choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                            choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                choice3.setVisibility(View.GONE);
                            apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());


                            mQuestionNumber++;
            } else if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 3) {
                choice3.setVisibility(View.VISIBLE);


                            mQuestionView3.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                            apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView3.getText().toString());

                            choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                            apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

                            mQuestionNumber++;


            }
        } else {

            AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismakefalaio3.this);

            alert.setTitle("Το διαγώνισμα τελείωσε!");
            alert.setCancelable(false);

            alert.setMessage("Το σκορ σου είναι : " + mscored3 + " πόντοι!");
            alert.setPositiveButton("Δείξε μου όλες τις απαντήσεις", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(diagwnismakefalaio3.this, menuaskisewn3.class);
                                intent.putExtra("scorediagwnisma3", mscored3);
                                startActivity(intent);
                                finish();
                                Intent intentk3= new Intent(diagwnismakefalaio3.this, analitikak3.class);
                                intentk3.putExtra("apotelesmata3", apotelesmata);
                                startActivity(intentk3);
                            }

                        });

                        alert.setNegativeButton("Δείξε μου μόνο τις λανθασμένες απαντήσεις", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(diagwnismakefalaio3.this, menuaskisewn3.class);
                                intent.putExtra("scorediagwnisma3", mscored3);
                                startActivity(intent);
                                finish();
                                Intent intentlathos= new Intent(diagwnismakefalaio3.this, analitikalanthasmenes3.class);
                                intentlathos.putExtra("apotelesmatalanthasmenes3", apotelesmatalanthasmenes);
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


    private void updateScore(int point){


        mScoreView3.setText(""+ mscored3+"/"+mQuestionLibrary.getlength());
    }


}

