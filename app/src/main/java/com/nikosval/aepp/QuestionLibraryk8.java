package com.nikosval.aepp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuestionLibraryk8 {

    private String multipleQuestions[] = {
            "Στον έλεγχο «μαύρου κουτιού» τα σενάρια ελέγχου βασίζονται στον κώδικα του προγράμματος.",
            "Ο έλεγχος «μαύρου κουτιού» μπορεί να εφαρμοστεί και σε υποπρογράμματα.",
            "Τα συντακτικά λάθη εμφανίζονται στην εκτέλεση και όχι στη μεταγώτιση του προγράμματος",
            "'Ενα λογικό λάθος στις δομές επιλογής μπορεί να αφορά :",
            " Γινόμενο <- 1\n" +
                    " ΑΡΧΗ_ΕΠΑΝΑΛΗΨΗΣ\n" +
                    "ΓΡΑΨΕ \"Δώσε μη μηδενική τιμή\"\n" +
                    " ΔΙΑΒΑΣΕ Χ\n" +
                    " Γινόμενο <- Χ*Γινόμενο\n" +
                    " ΜΕΧΡΙΣ_ΟΤΟΥ Χ = 0 \n Επιλέξτε τον κώδικα που διορθώνει το λογικό λάθος",
            "Ένα λογικό λάθος σε προβλήματα με πίνακες είναι η υπέρβαση των ορίων του πίνακα",
            "Τα σενάρια ελέγχου περιλαμβάνουν και μη έγκυρες τιμές εισόδου.",
            "Eνα λογικό λάθος εντοπίζεται απο τον ________",
            "Λογικό λάθος στα υποπρογράμματα δεν συμβαίνει κατά το πέρασμα των παραμέτρων",
            "Ένα σενάριο ελέγχου περιγράφει τα δεδομένα εισόδου ολόκληρου του προγράμματος ή τμήματος του προγράμματος (διαδικασία, συνάρτηση) και τα αναμενόμενα αποτελέσματα",








    };

    private String manswers[][] = {
            {"Σωστό", "Λάθος"},
            {"Σωστό", "Λάθος"},
            {"Σωστό", "Λάθος"},
            {"τις συνθήκες", "τις εντολές που εκτελούνται οταν ισχύει η συνθήκη","Και τα 2"},
            {"ΑΡΧΗ_ΕΠΑΝΑΛΗΨΗΣ\n" +
                    " ΓΡΑΨΕ \"Δώσε μη μηδενική τιμή\"\n" +
                    " ΔΙΑΒΑΣΕ Χ\n" +
                    " ΑΝ Χ <> 0 ΤΟΤΕ\n" +
                    " Γινόμενο <- Χ*Γινόμενο\n" +
                    " ΤΕΛΟΣ_ΑΝ\n" +
                    " ΜΕΧΡΙΣ_ΟΤΟΥ Χ = 0 ","Χ <- 1\n" +
                    " ΟΣΟ Χ <> 0 ΕΠΑΝΑΛΑΒΕ\n" +
                    " ΓΡΑΨΕ \"Δώσε μη μηδενική τιμή\"\n" +
                    " ΔΙΑΒΑΣΕ Χ\n" +
                    " Γινόμενο <- Χ*Γινόμενο\n" +
                    " ΤΕΛΟΣ_ΕΠΑΝΑΛΗΨΗΣ"},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
            {"προγραμματιστή","μεταγλωτιστή"},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
















    };

    private String correctanswers[] = {"Σωστό", "Σωστό", "Λάθος","Και τα 2","ΑΡΧΗ_ΕΠΑΝΑΛΗΨΗΣ\n" +
            " ΓΡΑΨΕ \"Δώσε μη μηδενική τιμή\"\n" +
            " ΔΙΑΒΑΣΕ Χ\n" +
            " ΑΝ Χ <> 0 ΤΟΤΕ\n" +
            " Γινόμενο <- Χ*Γινόμενο\n" +
            " ΤΕΛΟΣ_ΑΝ\n" +
            " ΜΕΧΡΙΣ_ΟΤΟΥ Χ = 0 ","Σωστό","Σωστό","προγραμματιστή","Λάθος","Σωστό"};


    public String getquestion(int a){
        String question=multipleQuestions[a];
        return question;

    }

    public int getanswerslength(int a){
        int answerslength=manswers[a].length;
        return answerslength;

    }


    public String getchoice1(int a){

        String choice0=manswers[a][0];
        return choice0;
    }


    public String getchoice2(int a){

        String choice1=manswers[a][1];
        return choice1;
    }

    public String getchoice3(int a) {

        String choice2 = manswers[a][2];
        return choice2;

    }

    public int getlength(){

        int a=multipleQuestions.length;
        return a;

    }


    public String getCorrectAnswer(int a){

        String answer=correctanswers[a];
        return answer;
    }

    public void suffle(){
        long seed = System.nanoTime();

        Collections.shuffle(Arrays.asList(multipleQuestions),new Random(seed));
        Collections.shuffle(Arrays.asList(manswers),new Random(seed));
        Collections.shuffle(Arrays.asList(correctanswers),new Random(seed));


    }
}




