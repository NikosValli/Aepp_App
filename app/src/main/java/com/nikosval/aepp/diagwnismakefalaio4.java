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

public class diagwnismakefalaio4 extends AppCompatActivity {
                private QuestionLibraryk4 mQuestionLibrary = new QuestionLibraryk4();
                private TextView mScoreView4;
                private TextView mQuestionView4;
                String epilogh;
                private Button choice1;
                private Button choice2;
                private Button choice3;
                ArrayList apotelesmata;
                 ArrayList apotelesmatalanthasmenes;
                 private int ii;




    private String manswer;
                private int mscored4 = 0;
                private int mQuestionNumber = 0;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_diagwnismakefalaio4);
                    mScoreView4 = (TextView) findViewById(R.id.scorenumber4);
                    mQuestionView4 = (TextView) findViewById(R.id.erwthsh4);
                    choice1 = (Button) findViewById(R.id.choice14);
                    choice2 = (Button) findViewById(R.id.choice24);
                    choice3 = (Button) findViewById(R.id.choice34);
                    Intent startIntent= getIntent();
                    ii= startIntent.getIntExtra("pernatoeuros4",0);
                    apotelesmata=new ArrayList<String>();
                    apotelesmatalanthasmenes=new ArrayList<String>();

                    mQuestionLibrary.suffle();

                    updateQuestion();

                    choice1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            epilogh=updateText(choice1);

                            if (choice1.getText() == manswer) {


                                mscored4 = mscored4 + 1;
                                Toast.makeText(diagwnismakefalaio4.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                            } else
                                Toast.makeText(diagwnismakefalaio4.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();
                            updateScore(mscored4);
                            apotelesmata.add("Aπάντησες: "+choice1.getText().toString());
                            if(!(epilogh.equals(manswer))){
                                apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView4.getText().toString());
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

                                mscored4 = mscored4 + 1;

                                Toast.makeText(diagwnismakefalaio4.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                            } else
                                Toast.makeText(diagwnismakefalaio4.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                            updateScore(mscored4);
                            apotelesmata.add("Aπάντησες: "+choice2.getText().toString());
                            if(!(epilogh.equals(manswer))){
                                apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView4.getText().toString());
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
                                mscored4 = mscored4 + 1;

                                Toast.makeText(diagwnismakefalaio4.this, "Σωστα!", Toast.LENGTH_SHORT).show();
                            } else
                                Toast.makeText(diagwnismakefalaio4.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                            updateScore(mscored4);
                            apotelesmata.add("Aπάντησες: "+choice3.getText().toString());
                            if(!(epilogh.equals(manswer))){
                                apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView4.getText().toString());
                                apotelesmatalanthasmenes.add("Απάντησες λανθασμένα: "+choice3.getText().toString());
                                apotelesmatalanthasmenes.add("Η σωστή απάντηση είναι: "+manswer.toString());

                                apotelesmatalanthasmenes.add(" ");

                            }
                            apotelesmata.add(" ");
                            updateQuestion();


                        }

                    });
                }

                private void updateQuestion () {


                    if (mQuestionNumber < ii) {
                        if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 2) {


                            mQuestionView4.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                            apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView4.getText().toString());

                            choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                            choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                            manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                            choice3.setVisibility(View.GONE);
                            apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());


                            mQuestionNumber++;
                        }
                        else if (mQuestionLibrary.getanswerslength(mQuestionNumber) == 3) {
                            choice3.setVisibility(View.VISIBLE);

                            mQuestionView4.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                            apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView4.getText().toString());

                            choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                            choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                            choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
                            manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                            apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

                            mQuestionNumber++;


                        }}

                    else{

                        AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismakefalaio4.this);

                        alert.setTitle("Το διαγώνισμα τελείωσε!");
                        alert.setCancelable(false);

                        alert.setMessage("Το σκόρ σου είναι : " + mscored4 + " πόντοι!");
                        alert.setPositiveButton("Δείξε μου όλες τις απαντήσεις", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(diagwnismakefalaio4.this, menuaskisewn4.class);
                                intent.putExtra("scorediagwnisma4", mscored4);
                                startActivity(intent);
                                finish();
                                Intent intentk4= new Intent(diagwnismakefalaio4.this, analitikak4.class);
                                intentk4.putExtra("apotelesmata4", apotelesmata);
                                startActivity(intentk4);
                            }

                        });

                        alert.setNegativeButton("Δείξε μόνο τις λανθασμένες απαντήσεις", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(diagwnismakefalaio4.this, menuaskisewn4.class);
                                intent.putExtra("scorediagwnisma4", mscored4);
                                startActivity(intent);
                                finish();
                                Intent intentlathos= new Intent(diagwnismakefalaio4.this, analitikalanthasmenes4.class);
                                intentlathos.putExtra("apotelesmatalanthasmenes4", apotelesmatalanthasmenes);
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


        mScoreView4.setText(""+ mscored4+"/"+mQuestionLibrary.getlength());
    }
}
