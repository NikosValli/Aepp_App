package com.nikosval.aepp;

public class QuestionLibrary {

    private String multipleQuestions[] = {
            "Σε ποια κατηγορία προβλήματος ανήκει η δευτεροβάθμια εξίσωση σύμφωνα με την δυνατότητα επίλυσης;",
            "Σε Ποια κατηγορία ανήκει η επιλογή μεταφορικού μέσου σύμφωνα με το βαθμο δόμησης μια λύσης;",
            "Σε Ποια κατηγορία ανήκει η διεξαγωγή μαθήματος σύμφωνα με το είδος επίλυσης τους",
            "Ποιο ειναι το πρώτο στάδιο αντιμετώπισης ενός προβλήματος",
            "Ποιο απο τα παρακάτω κριτήρια ΔΕΝ εχει να κανει με το βαθμο δομησης της λύσης του προβλήματος? ",
            "ο Τετραγωνισμός του κύκλου αποτελεί πρόβλημα:",
            "Ποια απο τις παρακάτω λειτουργίες ΔΕΝ ειναι κύρια για τον υπολογιστή?",





    };

    private String manswers[][] = {
            {"Επιλύσιμα", "Ανοικτά", "Αλυτα"},
            {"δομημένα", "ημιδομημένα", "αδόμητα"},
            {"απόφασης", "υπολογιστικά", "βελτιστοποίησης"},
            {"κατανόηση","ανάλυση","επίλυση"},
            {"δομημενα","αδόμητα","απόφασης"},
            {"επιλύσιμο","άλυτο","ανοικτό"},
            {"πολλαπλασιασμός","σύγκριση","πρόσθεση"},


    };

    private String correctanswers[] = {"Επιλύσιμα", "ημιδομημένα", "απόφασης","κατανόηση","απόφασης","άλυτο","πολλαπλασιασμός"};


    public String getquestion(int a){
        String question=multipleQuestions[a];
        return question;

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
}