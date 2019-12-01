package com.nikosval.aepp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuestionLibraryk7 {

    private String multipleQuestions[] = {
            "Η διαδικασία με την οποία ένα αντικείμενο αποκτά χαρακτηριστικά από άλλο αντικείμενο ονομάζεται:",
            "Η διαδικασία απόκρυψης λεπτομερειών στην γλώσσα του αντικειμενοστραφούς προγραμματισμού αναφέρεται και ως :",
            "Η ενθυλάκωση υποδηλώνει ότι οι εσωτερικές λειτουργίες ενός αντικειμένου είναι ορατές στον έξω κόσμο",
            "O πολυμορφισμός έχει να κάνει με τη δυνατότητα αντικειμένων να διαθέτουν μεθόδους με ίδιο όνομα αλλά διαφορετική υλοποίηση:",
            "Ένα αντικείμενο πρόγονος περιέχει τα ίδια ακριβώς χαρακτηριστικά με το παιδί του",
            "Ένα αντικείμενο απόγονος περιέχει χαρακτηριστικά από τον γονέα του αλλά μπορεί να οριστούν και πρόσθετα χαρακτηριστικά",
            "Ένα αντικείμενο εκτελεί ενέργειες μέσω των ________",
            "Ένα αντικειμενοστραφές πρόγραμμα δομείται ως ένα δίκτυο συνεργαζόμενων οντοτήτων που είναι ________",
            "Μια κλάση μπορεί να παράγει ενα περιορισμένο πλήθος δομικά ίδιων αντικειμένων.",
            " Ο πολυμορφισμός μας επιτρέπει να επαναπροσδιορίσουμε τον τρόπο με τον οποίο λειτουργούν κάποια πράγματα, είτε αλλάζοντας τον τρόπο λειτουργίας τους είτε αλλάζοντας τα εργαλεία τα οποία χρησιμοποιούνται για την επίτευξη του στόχου.",








    };

    private String manswers[][] = {
            {"Ενθυλάκωση", "Κληρονομικότητα","Πολυμορφισμός"},
            {"Ενθυλάκωση", "Κληρονομικότητα","Πολυμορφισμός"},
            {"Σωστό", "Λάθος"},
            {"Σωστό", "Λάθος"},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
            {"Kλάσεων", "Μεθόδων","Ιδιοτήτων"},
            {"τα αντικέιμενα","οι κλάσεις","οι μέθοδοι"},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
















    };

    private String correctanswers[] = {"Κληρονομικότητα", "Ενθυλάκωση", "Λάθος","Σωστό","Λάθος","Σωστό","Μεθόδων","τα αντικέιμενα","Λάθος","Σωστό"};


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




