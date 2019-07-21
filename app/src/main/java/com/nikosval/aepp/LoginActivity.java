package com.nikosval.aepp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    TextView mTextViewRegister;
    DataBaseHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db=new DataBaseHelper(this);
        mTextUsername=(EditText) findViewById(R.id.username_login);
        mTextPassword=(EditText)findViewById(R.id.password_login);
        mButtonLogin=(Button)findViewById(R.id.button_login);
        mTextViewRegister=(TextView) findViewById(R.id.textview_register);
        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(registerintent);
            }
        });

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user=mTextUsername.getText().toString().trim();
                String pwd=mTextPassword.getText().toString().trim();

                Boolean res=db.checkUser(user,pwd);
                if (res==true){


                    SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);
                    prefs.edit().putString("username", user).apply();

                    Toast.makeText(LoginActivity.this,"Συνδέθηκες με επιτυχία!",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(LoginActivity.this,MenuActivity.class);
                    startActivity(intent);
                }
                else{

                    Toast.makeText(LoginActivity.this,"Aποτυχία σύνδεσης",Toast.LENGTH_SHORT).show();


                }

            }
        });



    }
}
