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


public class multiplechoicek1 extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    String epilogh;

    ArrayList apotelesmata;
    ArrayList apotelesmatalanthasmenes;
    private int ii;



    private String manswer;
    private int mscore=0;
    ArrayList<String> erwthseis;

    private int mQuestionNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplechoicek1);

        mScoreView=(TextView)findViewById(R.id.scorenumber);
        mQuestionView=(TextView)findViewById(R.id.erwthshkathigiti);
        choice1=(Button) findViewById(R.id.choice1);
        choice2=(Button)findViewById(R.id.choice2);
        choice3=(Button)findViewById(R.id.choice3);
        Intent startIntent= getIntent();
        ii= startIntent.getIntExtra("pernatoeuros1",0);
        apotelesmata=new ArrayList<String>();
        apotelesmatalanthasmenes=new ArrayList<String>();

        mQuestionLibrary.suffle();

        updateQuestion();


        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice1);

                if (choice1.getText()==manswer){


                    mscore=mscore+1;
                    Toast.makeText(multiplechoicek1.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(multiplechoicek1.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();
                    updateScore(mscore);
                apotelesmata.add("Aπάντησες: "+choice1.getText().toString());
                apotelesmata.add(" ");
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView.getText().toString());
                    apotelesmatalanthasmenes.add("Απάντησες λανθασμένα: "+choice1.getText().toString());
                    apotelesmatalanthasmenes.add("Η σωστή απάντηση είναι: "+manswer.toString());

                    apotelesmatalanthasmenes.add(" ");

                }
                       updateQuestion();


            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epilogh=updateText(choice2);

                if (choice2.getText()==manswer){

                    mscore=mscore+1;

                    Toast.makeText(multiplechoicek1.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(multiplechoicek1.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();

                     updateScore(mscore);
                apotelesmata.add("Aπάντησες: "+choice2.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView.getText().toString());
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
                updateText(choice3);
                if (choice3.getText()==manswer){
                    mscore=mscore+1;

                    Toast.makeText(multiplechoicek1.this,"Σωστα!",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(multiplechoicek1.this,"Λάθος απάντηση!",Toast.LENGTH_SHORT).show();

                updateScore(mscore);
                apotelesmata.add("Aπάντησες: "+choice3.getText().toString());
                if(!(epilogh.equals(manswer))){
                    apotelesmatalanthasmenes.add("Η ερώτηση ήταν: "+mQuestionView.getText().toString());
                    apotelesmatalanthasmenes.add("Απάντησες λανθασμένα: "+choice2.getText().toString());
                    apotelesmatalanthasmenes.add("Η σωστή απάντηση είναι: "+manswer.toString());
                    apotelesmatalanthasmenes.add(" ");

                }
                apotelesmata.add(" ");
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


if (mQuestionNumber<ii)
{

    mQuestionView.setText(mQuestionLibrary.getquestion(mQuestionNumber));
    apotelesmata.add("Η ερώτηση ήταν: "+mQuestionView.getText().toString());

    choice1.setText(mQuestionLibrary.getchoice1(mQuestionNumber));
    choice2.setText(mQuestionLibrary.getchoice2(mQuestionNumber));
    choice3.setText(mQuestionLibrary.getchoice3(mQuestionNumber));
    manswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
    apotelesmata.add("H σωστή απάντηση είναι: "+manswer.toString());

    mQuestionNumber++;
}


else{

    AlertDialog.Builder alert = new AlertDialog.Builder(multiplechoicek1.this);

    alert.setTitle("Το διαγώνισμα τελείωσε!");
    alert.setCancelable(false);

    alert.setMessage("Το σκορ σου είναι : " + mscore + " πόντοι!");
    alert.setPositiveButton("Εμφάνισε όλες τις απαντήσεις", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Intent intent=new Intent(multiplechoicek1.this,menuaskisewn1.class);
            intent.putExtra("scoremc",mscore);
            startActivity(intent);
            finish();

            Intent intentmc = new Intent(multiplechoicek1.this, analitikak1mc.class);
            intentmc.putExtra("apotelesmata1mc", apotelesmata);
            startActivity(intentmc);
        }

    });
    alert.show();




    alert.setNegativeButton("Επέστρεψε μόνο τις λανθασμένες", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Intent intent=new Intent(multiplechoicek1.this,menuaskisewn1.class);
            intent.putExtra("scoremc",mscore);
            startActivity(intent);
            finish();
            Intent intentk1 = new Intent(multiplechoicek1.this, analitikalanthasmenes1.class);
            intentk1.putExtra("apotelesmatalanthasmenes1", apotelesmatalanthasmenes);
            startActivity(intentk1);

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


        mScoreView.setText(""+ mscore+"/"+mQuestionLibrary.getlength());
    }



}



