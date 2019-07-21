package com.nikosval.aepp;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.content.Context.MODE_PRIVATE;
import static android.icu.text.MessagePattern.ArgType.SELECT;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="registeruser";
    public static final String TABLE_NAME2="levels";
    public static final String TABLE_NAME3="levels2";

    public static final String Col_1="ID";
    public static final String Col_2="username";
    public static final String Col_3="password";
    public static final String Col_4="level";
    public static final String Col_11="username";
    public static final String Col_12="highestlevel1";
    public static final String Col_13="runonce1";
    public static final String Col_22="highestlevel2";
    public static final String Col_23="runonce2";






    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 23);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT,username TEXT,password TEXT,level INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE levels (username TEXT,highestlevel1 INTEGER,runonce1 INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE levels2 (username TEXT,highestlevel2 INTEGER,runonce2 INTEGER)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME2);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME3);


        onCreate(sqLiteDatabase);
    }

    public long adduser(String user,String password,String level)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_2,user);
        contentValues.put(Col_3,password);
        contentValues.put(Col_4,level);




       long res=db.insert("registeruser",null,contentValues);
        db.close();
        return res;
    }

    public long addslscore(int score){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("scoresl",score);
        long res=db.insert("levels",null,contentValues);
        db.close();
        return res;





    }


    public long addhighlevel(String user,int highlevel,int runonce)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_12,highlevel);
        contentValues.put(Col_13,runonce);




        long res=db.insert("levels",null,contentValues);
        db.close();
        return res;
    }


    public long addhighlevel2(String user,int highlevel,int runonce)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_22,highlevel);
        contentValues.put(Col_23,runonce);




        long res=db.insert("levels2",null,contentValues);
        db.close();
        return res;
    }




    public boolean checkUser(String username,String password){
String columns[]={Col_1};
SQLiteDatabase db=getReadableDatabase();
String selection=Col_2 + "=?" + " and " + Col_3 + "=?";
String[] selectionArgs={username,password};
        Cursor cursor=db.query(TABLE_NAME,columns,selection,selectionArgs,null,null,null);
int count=cursor.getCount();

cursor.close();
db.close();

if (count>0)
    return true;
else
    return false;



    }

    public Cursor showLevel(String username){


        SQLiteDatabase dbb=this.getReadableDatabase();
        Cursor level=dbb.rawQuery("SELECT level FROM " +TABLE_NAME+ " WHERE " +Col_2+"='" +username +"'",null);
        return level;


    }

    public boolean UpdateLevel(String username,int level){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(Col_2,username);
        level++;
        cv.put(Col_4,level);
        db.update(TABLE_NAME,cv,"username= ?",new String[] {username});
        return true;
    }


    public boolean updatelevel1(String username,int highlevel){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("highestlevel1",highlevel);
        cv.put("runonce1",1);
        db.update(TABLE_NAME2,cv,"username= '" +username+"'" ,null);
        return true;
    }


    public boolean updatelevel2(String username,int highlevel){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("highestlevel2",highlevel);
        cv.put("runonce2",1);
        db.update(TABLE_NAME3,cv,"username= '" +username+"'" ,null);
        return true;
    }

    public Cursor checkifuserexist(String username){
        SQLiteDatabase dbb=this.getReadableDatabase();

        Cursor c = dbb.rawQuery("SELECT username FROM registeruser WHERE username= '" +username+"'", null);
return c;


    }

    public Cursor checkiflevelupdated(String username){
        SQLiteDatabase dbb=this.getReadableDatabase();



        Cursor c = dbb.rawQuery("SELECT runonce1 FROM levels WHERE username= '" +username+"'", null);
        return c;


    }


    public Cursor checkiflevelupdated2(String username){
        SQLiteDatabase dbb=this.getReadableDatabase();



        Cursor c = dbb.rawQuery("SELECT runonce2 FROM levels2 WHERE username= '" +username+"'", null);
        return c;


    }



}
