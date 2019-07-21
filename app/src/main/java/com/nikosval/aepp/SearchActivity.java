package com.nikosval.aepp;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.support.v7.widget.SearchView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
ListView listview;
ListViewAdapter adapter;
String[] title;
String[] description;
int[] icon;
ArrayList<Oros> arrayList=new ArrayList<Oros>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2); // (for Custom theme)
        setTheme(android.R.style.Theme_Holo); // (for Android Built In Theme)

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        title=new String[]{"Πρόβλημα","Επιλύσιμο","Aνοικτό","Άλυτο","Δομημένα","Ημιδομημένα","Αδόμητα","Απόφασης","Υπολογιστικά","Βελτιστοποίησης","Μεταβλητές","Σταθερές","Εκφράσεις","Δομή ακολουθίας","Δομές Επανάληψης"};
        description=new String[]{"Πρόβλημα είναι μια κατάσταση η οποία χρήζει αντιμετώπισης απαιτεί λύση,η δε λύση δεν είναι ούτε γνώστη ούτε προφανής ","Τα προβλήματα που η λύση τους ειναι γνώστη και έχει διατυπωθεί η ειναι γνωστή η συνάφεια τους με ήδη επιλύσιμα προβλημάτα πράγμα που επιτρέπει να θεωρόυμε βέβαιη την δυνατότητα επίλυσης τους"," Η λύση τους δεν έχει ακόμα βρεθεί,αλλα δεν έχει αποδειχθέι οτι δεν λύνονται.","Προβλήμτα που έχει αποδειχθεί οτι δεν επιλύονται. π.χ Τετραγωνισμός κύκλου.","Η λύση προερχεται απο μια αυτοματοποιημένη διαδικασία","Η λυση τους επιδιώκεται στα πλαίσια ενός ευρους πιθανών λύσεων αφήνοντας στονα νθρώπιονο παράγοντα περιθώρια επιλογής της","Οι λύσεις δε μπορούν να δομηθούν η δεν έχει διερευνξθεί σε βάθος η δυνατότητα δόμηση τους.Ο ανθρώπινος παράγοντας παίζει τον κύριο ρόλο στην επίλυση τους","H λύση ειναι μια απόφαση συνήθως σε μια ερώτηση ναι/οχι","Η λύση τους απαιτεί τη διενέρεγεια υπολογισμών.Σε ενα τετοιο πρόβλημα ζητάμε να βρούμε τη τιμή της απάντησης που ικανοποιει τα δεδομένα που παρέχει το πρόβλημα","Το πρόβλημα επιζητά το βέλτιστο αποτέλεσμα για συγκεκριμένο σύνολο δεδομένων.Αναζητούμε δηλαδή την απάντηση που ικανοποιέι κατα τον καλύτερο τρόπο τα δεδομένα που παρέχει το πρόνβλημα.","Είναι μεγέθη των οποίων η τιμή μπορεί να μεταβάλλεται.Έχουν : όνομα, τιμή και τύπο.Μπορεί να μεταβάλλεται μόνο η τιμή τους. Δεν αλλάζουν ποτέ όνομα ή τύπο κατά τη διάρκεια της εκτέλεσης του προγράμματος.","Είναι μεγέθη των οποίων η τιμή δεν μεταβάλλεται κατά τη διάρκεια της εκτέλεσης ενός προγράμματος.Έχουν όνομα και τύπο και δεν είναι δυνατό να αλλάξει τίποτα από τα δύο.","Συνδυασμοί μεταβληρών η σταθερών και τελεστών (ΤΕΛΕΣΤΕΣ ΚΑΙ ΤΕΛΕΣΤΕΟΙ.Η τελική τιμη μιας εκφρασής εξαρτάται απο την ιεραρχία των πράξεων και την χρήση παρενθέσεων.Μια εκφραση μπορει να αποτελείται και μόνο απο μια μεταβλητη η σταθερα μεχρι μια πολυπλοκη μαθηματικη αναπαρασταση","Οταν για την εκτελεση το αλγοριθμου απαιτειται σειριακή εκτελεση εντολών χρησιμοποιουμε την δομή ακολουθίας.Με αυτη επιλύουμε απλα προβλήματα και περίεχει εντολές εισόδου εξόδου εκχώρησης","Πολλές φορές πρεπει να εκτελεστεί μια ομάδα εντολών περισσότερο απο μια φορες για να επιλυθει ενα πρόβλημα.Σε αυτες τις περιπτώσεις χρησιμοποιουνται οι δομές επανάληψης.Οι δυο περιπτώσεις ειναι να ειναι γνωστο το πλήθος των επαναλήψεων "};
        icon=new int[]{R.drawable.provlhma,R.drawable.epilisima,R.drawable.anoikta,R.drawable.aluta,R.drawable.domhmeno,R.drawable.hmidomhmeno,R.drawable.adomhto,R.drawable.apofashs,R.drawable.ypologistika,R.drawable.veltisto,R.drawable.metavlhtes,R.drawable.statheres,R.drawable.ekfrash,R.drawable.domhakolouthias,R.drawable.epanalipsi};




        listview=findViewById(R.id.listvieworwn);

        for (int i=0; i<title.length; i++){
            Oros oros=new Oros(title[i],description[i],icon[i]);
            arrayList.add(oros);


        }

        adapter=new ListViewAdapter(this,arrayList);
        listview.setAdapter(adapter);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuofsearch, menu);
        MenuItem searchItem=menu.findItem(R.id.search_for_ennoies);
        SearchView searchView=(SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listview.clearTextFilter();
                }
                else{
                    adapter.filter(s);
                }
                return true;
            }
        });
return true;
    }



    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }
}
