package com.nikosval.aepp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
        SharedPreferences preferences =getSharedPreferences("mypref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
        SharedPreferences preferences2 =getSharedPreferences("mypref2",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = preferences2.edit();
        editor2.clear();
        editor2.commit();
        SharedPreferences preferences3=getSharedPreferences("mypref3",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor3 = preferences3.edit();
        editor3.clear();
        editor3.commit();
        SharedPreferences preferences4=getSharedPreferences("mypref4",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor4 = preferences4.edit();
        editor4.clear();
        editor4.commit();
        SharedPreferences preferences5=getSharedPreferences("mypref5",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor5 = preferences5.edit();
        editor5.clear();
        editor5.commit();
        SharedPreferences preferences6=getSharedPreferences("mypref6",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor6 = preferences6.edit();
        editor6.clear();
        editor6.commit();


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
                Boolean ress=checkifisadmin(user,pwd);
                Cursor eidikothta=db.show_eidikothta(user);
                String str = "";
                if (eidikothta!= null) {
                    if (eidikothta.moveToFirst()) {
                        str = eidikothta.getString(0);
                    }
                }



                if (ress==true){ // ΚΩΔΙΚΑΣ ΓΙΑ ADMIN


                    Toast.makeText(LoginActivity.this,"Kαλώς ήρθες διαχειριστή !",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(LoginActivity.this,MenutoyAdmin.class);
                    startActivity(intent);


                }







                if (res==true && ress==false && str.equals("mathitis")){







                    SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);
                    prefs.edit().putString("username", user).apply();
                    Toast.makeText(LoginActivity.this,"Eπιτυχημένη σύνδεση",Toast.LENGTH_SHORT).show();


                    Intent intent=new Intent(LoginActivity.this,MenuActivity.class);
                    startActivity(intent);
                }



                if (res==true && ress==false && str.equals("kathigitis")){
                    SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);
                    prefs.edit().putString("username", user).apply();

                    Intent intent=new Intent(LoginActivity.this,Menukathigiti.class);
                    startActivity(intent);










                }



            }
        });




    }


    public Boolean checkifisadmin(String username,String password){

        if (username.equals("admin") && password.equals("admin"))
        {

            return true;


        } else{

            return false;
        }





    }
}
