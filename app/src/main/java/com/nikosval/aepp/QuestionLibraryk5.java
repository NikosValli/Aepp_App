package com.nikosval.aepp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuestionLibraryk5 {

    private String multipleQuestions[] = {
            "Ένα πρόγραμμα σε γλώσσα μηχανής είναι μια ακολουθία δυαδικών ψηφίων.",
            "Για την εκτέλεση μιας εντολής συμβολικής γλώσσας απαιτείται η μετάφρασή της σε γλώσσα μηχανής.",
            "Οι εντολές στις συμβολικές γλώσσες αποτελούνται από ακολουθίες 0 και 1.",
            "Η FORTRAN είναι γλώσσα...:",
            "Τα προγράμματα σε γλώσσες υψηλού επιπέδου είναι ανεξάρτητα του υπολογιστή που αναπτύχθηκαν.",
            "Οι γλώσσες 4ης γενιάς είναι κατάλληλες για ανάπτυξη γενικών εφαρμογών.",
            "Ο μεταγλωττιστής μας επιτρέπει να συντάσσουμε ένα πρόγραμμα.",
            "Τα συντακτικά λάθη στον πηγαίο κώδικα εμφανίζονται κατά το στάδιο της μεταγλώττισής του.",
            "Ο μεταγλωττιστής δέχεται στην είσοδό του ένα πρόγραμμα γραμμένο σε μια γλώσσα υψηλού επιπέδου και παράγει ένα ισοδύναμο πρόγραμμα σε γλώσσα μηχανής.",
            "Η εντολή GOTO που αλλάζει τη ροή εκτέλεσης ενός προγράμματος είναι απαραίτητη στο δομημένο προγραμματισμό.",
            "Η Prolog αποτελεί γλώσσα....",
            "Τα λογικά λάθη είναι συνήθως λάθη σχεδιασμού και δεν προκαλούν τη διακοπή της εκτέλεσης του προγράμματος.",
            "Ο δομημένος προγραμματισμός επιτρέπει την άμεση μεταφορά των αλγορίθμων σε πρόγραμμα.",
            "Η γλωσσα C είναι γλώσσα....",
            "Η γλώσσα JAVA είναι γλώσσα",








    };

    private String manswers[][] = {
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος"},
            {"Σωστό", "Λάθος"},
            {"Γενικής χρήσης","Επιστημονικής κατεύθυνσης","προγραμματισμού συστημάτων"},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
            {"Σωστό", "Λάθος",},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
            {"Τεχνητής νοημοσύνης", "Λογική","Και τα 2"},
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος",},
            {"Αλγοριθμική", "Αντικειμενοστραφής","Συναρτησιακή"},
            {"ερωταπαντήσεων", "Αντικειμενοστραφής","επιστημονικής κατεύθυνσης"},
















    };

    private String correctanswers[] = {"Σωστό", "Σωστό", "Λάθος","Επιστημονικής κατεύθυνσης","Σωστό","Λάθος","Λάθος","Σωστό","Σωστό","Λάθος","Και τα 2","Λάθος","Σωστό","Αλγοριθμική","Αντικειμενοστραφής"};


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
