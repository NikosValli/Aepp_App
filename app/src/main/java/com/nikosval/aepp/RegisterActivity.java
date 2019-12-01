package com.nikosval.aepp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    DataBaseHelper db;

    EditText mTextUsername;
    EditText mTextPassword;
    EditText mcnfPassword;
    EditText mistikiapantisi;
    Button mButtonRegister;
    TextView mTextViewLogin;
    CheckBox kathigitis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db=new DataBaseHelper(this);

        mTextUsername=(EditText) findViewById(R.id.username_login);
        mTextPassword=(EditText)findViewById(R.id.password_login);
        mcnfPassword=(EditText)findViewById(R.id.cnf_password_login);
        kathigitis=(CheckBox)findViewById(R.id.kathigitis);
        mistikiapantisi=(EditText)findViewById(R.id.mistikierwthsh);

        mButtonRegister=(Button)findViewById(R.id.button_register);
        mTextViewLogin=(TextView) findViewById(R.id.textview_register);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(LoginIntent);
            }
        });

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = mTextUsername.getText().toString();
                String pwd = mTextPassword.getText().toString();
                String cnf_pwd = mcnfPassword.getText().toString().trim();
                String mistiki_apantisi = mistikiapantisi.getText().toString().trim();

                if (pwd.matches("") || user.matches("")) {

                    Toast.makeText(RegisterActivity.this, "Έχετε αφήσει κάποιο πεδίο κενό !", Toast.LENGTH_SHORT).show();
                } else {
                    if (pwd.equals(cnf_pwd)) {
                        Cursor a = db.checkifuserexist(user);
                        if (a.getCount() > 0) {

                            Toast.makeText(RegisterActivity.this, "Yπάρχει άλλος χρήστης με αυτό το όνομα!", Toast.LENGTH_SHORT).show();

                        } else {
                            if (kathigitis.isChecked()) {


                                long val = db.adduser(user, pwd, "1", "kathigitis", mistiki_apantisi);
                                if (val > 0) {
                                    Toast.makeText(RegisterActivity.this, "Επιτυχημένη εγγραφή καθηγητή!", Toast.LENGTH_SHORT).show();
                                    Intent movetologin = new Intent(RegisterActivity.this, LoginActivity.class);
                                    startActivity(movetologin);
                                }


                            } else if (kathigitis.isChecked() == false) {

                                long val = db.adduser(user, pwd, "1", "mathitis", mistiki_apantisi);
                                if (val > 0) {
                                    Toast.makeText(RegisterActivity.this, "Επιτυχημένη εγγραφή μαθητή!", Toast.LENGTH_SHORT).show();
                                    Intent movetologin = new Intent(RegisterActivity.this, LoginActivity.class);
                                    startActivity(movetologin);
                                }

                            } else {

                                Toast.makeText(RegisterActivity.this, "Πρόβλημα εγγραφής", Toast.LENGTH_SHORT).show();


                            }


                        }
                    } else {

                        Toast.makeText(RegisterActivity.this, "Oι κωδικοί δεν ταιρίαζουν ", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });
    }

}
