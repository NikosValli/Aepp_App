package com.nikosval.aepp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuestionLibraryk6 {

    private String multipleQuestions[] = {
            "H παρακάτω εντολή αποτελεί μια δήλωση μιας σταθεράς. \n e=2.71.",
            "Ποιες λέξεις απο τις παρακάτων ειναι δεσμευμένες στη ΓΛΩΣΣΑ?",
            "Ο τελεστής DIV μας δίνει πίσω το υπόλοιπο μιας ακέραιας διαίρεσης",
            "Η μαθηματική συνάρτηση Τ_Ρ(4) θα επιστρέψει ως έξοδο την τιμή:",
            "Στη ΓΛΩΣΣΣΑ χρησιμοποιούμε την εντολή ΕΜΦΑΝΙΣΕ για να εμφανίσουμε ένα αποτέλεσμα.",
            "Στους εμφωλευμένους βρόχους ο πρώτος βρόχος αρχίζει πρώτος και τελειώνει τελευταίος.",
            "Στους εμφωλευμένους βρόχους μπορούμε να έχουμε στους βρόχους τον ίδιο μετρητή.",
            "Η δέσμευση ενός συγκεκριμένου μεγέθους πίνακα αποτελεί ενα απο τα μειονεκτήματα των πινάκων.",
            "Ποιος είναι ο πιο γρήγορος αλγόριθμος ταξινόμησης για έναν πίνακα?",
            "Έχω εναν ταξινομημένο πίνακα και θέλω να εφαρμόσω την γρηγορότερη αναζήτηση.Ποιον αλγόριθμο αναζήτησης θα επιλέξω?",








    };

    private String manswers[][] = {
            {"Σωστό", "Λάθος",},
            {"ΜΕΤΑΒΛΗΤΕΣ,ΔΥΝΑΤΕΣ,ΠΡΑΓΜΑΤΙΚΕΣ", "ΠΡΑΓΜΑΤΙΚΕΣ ΑΚΕΡΑΙΕΣ ΣΤΑΘΕΡΕΣ","ΛΟΓΙΚΕΣ ΑΛΦΑΡΙΘΜΗΤΙΚΕΣ ΑΚΕΡΑΙΕΣ"},
            {"Σωστό", "Λάθος"},
            {"4","81","2"},
            {"Σωστό","Λάθος"},
            {"Σωστό","Λάθος"},
            {"Σωστό", "Λάθος",},
            {"Σωστό","Λάθος"},
            {"Γρήγορης Ταξινόμησης","Ευθείας ανταλλαγής"},
            {"Σειριακής Αναζήτησης","Δυαδικής Αναζήτησης"},
















    };

    private String correctanswers[] = {"Σωστό", "ΠΡΑΓΜΑΤΙΚΕΣ ΑΚΕΡΑΙΕΣ ΣΤΑΘΕΡΕΣ", "Λάθος","2","Λάθος","Σωστό","Λάθος","Σωστό","Γρήγορης Ταξινόμησης","Δυαδικής Αναζήτησης"};


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
