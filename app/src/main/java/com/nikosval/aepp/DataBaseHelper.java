package com.nikosval.aepp;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.Rating;
import android.widget.RatingBar;

import static android.content.Context.MODE_PRIVATE;
import static android.icu.text.MessagePattern.ArgType.SELECT;

public class  DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="registeruser";
    public static final String TABLE_NAME2="levels";
    public static final String TABLE_NAME3="levels2";
    public static final String TABLE_NAME4="levels3";
    public static final String TABLE_NAME5="Showspiderman";
    public static final String TABLE_NAME6="ShowIronman";
    public static final String TABLE_NAME7="ShowThor";
    public static final String TABLE_NAME8="levels4";
    public static final String TABLE_NAME9="ShowHulk";
    public static final String TABLE_NAME10="levels5";
    public static final String TABLE_NAME11="levels6";
    public static final String TABLE_NAME12="Showca";
    public static final String TABLE_NAME13="ShowThanos";
    public static final String TABLE_NAME14="Opinions";
    public static final String TABLE_NAME15="protaseis_erwthsewn";













    public static final String Col_1="ID";
    public static final String Col_2="username";
    public static final String Col_3="password";
    public static final String Col_4="level";
    public static final String Col_11="username";
    public static final String Col_12="highestlevel1";
    public static final String Col_13="runonce1";
    public static final String Col_51="username";
    public static final String Col_52="highestlevel5";
    public static final String Col_53="runonce5";
    public static final String Col_22="highestlevel2";
    public static final String Col_23="runonce2";
    public static final String Col_32="highestlevel3";
    public static final String Col_33="runonce3";
    public static final String Col_43="showed";
    public static final String Col_42="highestlevel4";
    public static final String Col_433="runonce4";
    public static final String Col_444="showed";
    public static final String Col_61="username";
    public static final String Col_62="highestlevel6";
    public static final String Col_63="runonce6";
    public static final String Col_544="showed";
    public static final String Col_644="showed";
    public static final String Col_opinions_1="username";
    public static final String Col_opinions_2="rating";
    public static final String Col_opinions_3="opinions";
    public static final String Col_eidikothta="eidikothta";
    public static final String Col_erwthsh_1="erwthsh";
    public static final String Col_erwthsh_2="epilogh1";
    public static final String Col_erwthsh_3="epilogh2";
    public static final String Col_erwthsh_4="epilogh3";
    public static final String Col_erwthsh_5="swsth_apanthsh";
    public static final String Col_erwthsh_0="username";





















    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 49);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT,username TEXT,password TEXT,level INTEGER,eidikothta TEXT)");
        sqLiteDatabase.execSQL("CREATE TABLE levels (username TEXT,highestlevel1 INTEGER,runonce1 INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE levels2 (username TEXT,highestlevel2 INTEGER,runonce2 INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE levels3 (username TEXT,highestlevel3 INTEGER,runonce3 INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE levels4 (username TEXT,highestlevel4 INTEGER,runonce4 INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE levels5 (username TEXT,highestlevel5 INTEGER,runonce5 INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE levels6 (username TEXT,highestlevel6 INTEGER,runonce6 INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE Showspiderman (username TEXT,showed INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE ShowIronman (username TEXT,showed INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE ShowThor (username TEXT,showed INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE ShowHulk (username TEXT,showed INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE Showca (username TEXT,showed INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE ShowThanos (username TEXT,showed INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE Opinions (username TEXT,rating FLOAT,opinions TEXT)");
        sqLiteDatabase.execSQL("CREATE TABLE protaseis_erwthsewn(username TEXT,erwthsh TEXT,epilogh1 TEXT,epilogh2 TEXT,epilogh3 TEXT,swsth_apanthsh TEXT)");










    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME2);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME3);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME4);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME5);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME6);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME7);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME8);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME9);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME10);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME11);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME12);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME13);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME14);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME15);











        onCreate(sqLiteDatabase);
    }

    public long adduser(String user,String password,String level,String eidikothta)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_2,user);
        contentValues.put(Col_3,password);
        contentValues.put(Col_4,level);
        contentValues.put(Col_eidikothta,eidikothta);





        long res=db.insert("registeruser",null,contentValues);
        db.close();
        return res;
    }



    public long set_erwthseis(String username,String erwthsh,String epilogh1,String epilogh2,String epilogh3,String swsth_apanthsh)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_erwthsh_0,username);
        contentValues.put(Col_erwthsh_1,erwthsh);
        contentValues.put(Col_erwthsh_2,epilogh1);
        contentValues.put(Col_erwthsh_3,epilogh2);
        contentValues.put(Col_erwthsh_4,epilogh3);
        contentValues.put(Col_erwthsh_5,swsth_apanthsh);







        long res=db.insert("protaseis_erwthsewn",null,contentValues);
        db.close();
        return res;
    }



    public boolean update_erwthsh(String username,String erwthsh,String epilogh1,String epilogh2,String epilogh3,String swsth_apanthsh)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_erwthsh_0,username);
        contentValues.put(Col_erwthsh_1,erwthsh);
        contentValues.put(Col_erwthsh_2,epilogh1);
        contentValues.put(Col_erwthsh_3,epilogh2);
        contentValues.put(Col_erwthsh_4,epilogh3);
        contentValues.put(Col_erwthsh_5,swsth_apanthsh);


        String[] args = new String[]{username,erwthsh};



        db.update(TABLE_NAME15,contentValues,"username=? AND erwthsh=?",args);

        return true;





    }


    public Cursor show_erwthseis(){

        SQLiteDatabase db=this.getReadableDatabase();
            String query="SELECT * FROM "+TABLE_NAME15;
        Cursor cursor=db.rawQuery(query,null);

        return cursor;
    }


    public long set_opinions(String username, float rating, String opinions)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_opinions_1,username);
        contentValues.put(Col_opinions_2,rating);
        contentValues.put(Col_opinions_3,opinions);




        long res=db.insert("Opinions",null,contentValues);
        db.close();
        return res;
    }




    public Cursor show_opinions(){

        SQLiteDatabase db=this.getReadableDatabase();
        String query="SELECT * FROM "+TABLE_NAME14;
        Cursor cursor=db.rawQuery(query,null);

        return cursor;
    }


    public Cursor show_eidikothta(String username){

        SQLiteDatabase db=this.getReadableDatabase();
        String query="SELECT eidikothta FROM " +TABLE_NAME+ " WHERE " +Col_11+"='" +username +"'";
        Cursor cursor=db.rawQuery(query,null);

        return cursor;
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

    public long addhighlevel3(String user,int highlevel,int runonce)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_32,highlevel);
        contentValues.put(Col_33,runonce);




        long res=db.insert("levels3",null,contentValues);
        db.close();
        return res;
    }

    public long addhighlevel4(String user,int highlevel,int runonce)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_42,highlevel);
        contentValues.put(Col_433,runonce);




        long res=db.insert("levels4",null,contentValues);
        db.close();
        return res;
    }

    public long addhighlevel5(String user,int highlevel,int runonce)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_51,user);
        contentValues.put(Col_52,highlevel);
        contentValues.put(Col_53,runonce);




        long res=db.insert("levels5",null,contentValues);
        db.close();
        return res;
    }

    public long addhighlevel6(String user,int highlevel,int runonce)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_61,user);
        contentValues.put(Col_62,highlevel);
        contentValues.put(Col_63,runonce);




        long res=db.insert("levels6",null,contentValues);
        db.close();
        return res;
    }

    public long addshowingspiderman(String user,int showed)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_43,showed);





        long res=db.insert("Showspiderman",null,contentValues);
        db.close();
        return res;
    }


    public long addshowingironman(String user,int showed)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_43,showed);





        long res=db.insert("ShowIronman",null,contentValues);
        db.close();
        return res;
    }

    public long addshowingthor(String user,int showed)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_43,showed);





        long res=db.insert("ShowThor",null,contentValues);
        db.close();
        return res;
    }

    public long addshowingHulk(String user,int showed)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_444,showed);





        long res=db.insert("ShowHulk",null,contentValues);
        db.close();
        return res;
    }


    public long addshowingca(String user,int showed)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_544,showed);





        long res=db.insert("Showca",null,contentValues);
        db.close();
        return res;
    }


    public long addshowingthanos(String user,int showed)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_11,user);
        contentValues.put(Col_644,showed);





        long res=db.insert("Showthanos",null,contentValues);
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

    public boolean updatelevel3(String username,int highlevel){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("highestlevel3",highlevel);
        cv.put("runonce3",1);
        db.update(TABLE_NAME4,cv,"username= '" +username+"'" ,null);
        return true;
    }

    public boolean updatelevel4(String username,int highlevel){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("highestlevel4",highlevel);
        cv.put("runonce4",1);
        db.update(TABLE_NAME8,cv,"username= '" +username+"'" ,null);
        return true;
    }

    public boolean updatelevel5(String username,int highlevel){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("highestlevel5",highlevel);
        cv.put("runonce5",1);
        db.update(TABLE_NAME10,cv,"username= '" +username+"'" ,null);
        return true;
    }

    public boolean updatelevel6(String username,int highlevel){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("highestlevel6",highlevel);
        cv.put("runonce6",1);
        db.update(TABLE_NAME11,cv,"username= '" +username+"'" ,null);
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

    public Cursor checkifisadmin(String username,String password){
        SQLiteDatabase dbb=this.getReadableDatabase();



        Cursor c = dbb.rawQuery("SELECT username,password FROM registeruser WHERE username='" +username+"' AND password='"+password+"'", null);



        return c;


        }








    public Cursor checkiflevelupdated2(String username){
        SQLiteDatabase dbb=this.getReadableDatabase();



        Cursor c = dbb.rawQuery("SELECT runonce2 FROM levels2 WHERE username= '" +username+"'", null);
        return c;


    }

    public Cursor checkiflevelupdated3(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT runonce3 FROM levels3 WHERE username= '" +username+"'", null);
        return d;


    }

    public Cursor checkiflevelupdated4(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT runonce4 FROM levels4 WHERE username= '" +username+"'", null);
        return d;


    }


    public Cursor checkiflevelupdated5(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT runonce5 FROM levels5 WHERE username= '" +username+"'", null);
        return d;


    }

    public Cursor checkiflevelupdated6(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT runonce6 FROM levels6 WHERE username= '" +username+"'", null);
        return d;


    }

    public Cursor checkifsupermanshowed(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT showed FROM Showspiderman WHERE username= '" +username+"'", null);
        return d;


    }

    public Cursor checkifironmanshowed(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT showed FROM ShowIronman WHERE username= '" +username+"'", null);
        return d;


    }

    public Cursor checkifthorshowed(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT showed FROM ShowThor WHERE username= '" +username+"'", null);
        return d;


    }

    public Cursor checkifHulkshowed(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT showed FROM ShowHulk WHERE username= '" +username+"'", null);
        return d;


    }


    public Cursor checkifcashowed(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT showed FROM Showca WHERE username= '" +username+"'", null);
        return d;


    }

    public Cursor checkifthanosshowed(String username){
        SQLiteDatabase dbbb=this.getReadableDatabase();



        Cursor d = dbbb.rawQuery("SELECT showed FROM ShowThanos WHERE username= '" +username+"'", null);
        return d;


    }



}
