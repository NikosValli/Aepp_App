package com.nikosval.aepp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class diagwnismakefalaio2 extends AppCompatActivity {
    private QuestionLibraryk2 mQuestionLibrary = new QuestionLibraryk2();
    private TextView mScoreView2;
    private TextView mQuestionView2;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    String epilogh;
    ArrayList apotelesmata;
    ArrayList apotelesmatalanthasmenes;


    private String manswer;
    private int mscored2 = 0;
    private int mQuestionNumber = 0;
    private int ii;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagwnismakefalaio2);
        mScoreView2 = (TextView) findViewById(R.id.scorenumber);
        mQuestionView2 = (TextView) findViewById(R.id.erwthsh);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
         Intent startIntent= getIntent();
         ii= startIntent.getIntExtra("pernatoeuros",0);


        choice3 = (Button) findViewById(R.id.choice3);


        apotelesmata=new ArrayList<String>();

        apotelesmatalanthasmenes=new ArrayList<String>();

        mQuestionLibrary.suffle();
        updateQuestion();
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice1);
                if (choice1.getText()==manswer){


                    mscored2=mscored2+1;
                    Toast.makeText(diagwnismakefalaio2.this,"Σωστα!",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(diagwnismakefalaio2.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                }
                updateScore(mscored2);
                apotelesmata.add("Aπάντησες: "+choice1.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView2.getText().toString());
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

                if (choice2.getText()==manswer){

                    mscored2=mscored2+1;

                    Toast.makeText(diagwnismakefalaio2.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(diagwnismakefalaio2.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();
                }


                updateScore(mscored2);
                apotelesmata.add("Aπάντησες: "+choice2.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView2.getText().toString());
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
                if (choice3.getText()==manswer){
                    mscored2=mscored2+1;

                    Toast.makeText(diagwnismakefalaio2.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(diagwnismakefalaio2.this, "Λάθος απάντηση!", Toast.LENGTH_SHORT).show();

                updateScore(mscored2);
                apotelesmata.add("Aπάντησες: "+choice3.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView2.getText().toString());
                    apotelesmatalanthasmenes.add("Απάντησες Λανθασμένα: "+choice3.getText().toString());
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





                mQuestionView2.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView2.getText().toString());







                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                choice3.setVisibility(View.GONE);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());


                mQuestionNumber++;
            }
            else if(mQuestionLibrary.getanswerslength(mQuestionNumber) == 3){
                choice3.setVisibility(View.VISIBLE);
                apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView2.getText().toString());





                mQuestionView2.setText(mQuestionLibrary.getquestion(mQuestionNumber));
                choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
                choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
                choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
                manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());


                mQuestionNumber++;





            }


        }

        else{

            AlertDialog.Builder alert = new AlertDialog.Builder(diagwnismakefalaio2.this);

            alert.setTitle("Το διαγώνισμα τελείωσε!");
            alert.setCancelable(false);

            alert.setMessage("Το σκορ σου είναι : " + mscored2 + " πόντοι!");
            alert.setPositiveButton("Δείξε μου όλες τις απαντήσεις", new DialogInterface.OnClickListener()  {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent=new Intent(diagwnismakefalaio2.this,menuaskisewn2.class);
                    intent.putExtra("scorediagwnisma2",mscored2);
                    startActivity(intent);
                    finish();
                    Intent intentk2 = new Intent(diagwnismakefalaio2.this, analitikak2.class);
                    intentk2.putExtra("apotelesmata2", apotelesmata);
                    startActivity(intentk2);
                }

            });
            alert.setNegativeButton("Δείξε μου μόνο τις λανθασμένες απαντήσεις", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent=new Intent(diagwnismakefalaio2.this,menuaskisewn2.class);
                    intent.putExtra("scorediagwnisma2",mscored2);
                    startActivity(intent);
                    finish();
                    Intent intentk3 = new Intent(diagwnismakefalaio2.this, analitikalanthasmenes2.class);
                    intentk3.putExtra("apotelesmatalanthasmenes2", apotelesmatalanthasmenes);
                    startActivity(intentk3);
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


        mScoreView2.setText(""+ mscored2+"/"+mQuestionLibrary.getlength());
    }
}