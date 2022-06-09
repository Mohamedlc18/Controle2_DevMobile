package com.example.controle2_devmobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import java.util.ArrayList;

public class MyDataClimat extends SQLiteOpenHelper {

    public static String DB_NAME = "Climat.db";
    public static String TABLE_NAME = "Climat";
    public static String COL1 = "Id";
    public static String COL2 = "Nom_Ville";
    public static String COL3 = "Paye";
    public static String COL4 = "Température";
    public static String COL5 = "Pourcentage_Nuages";

    public MyDataClimat(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + TABLE_NAME + "("+ COL1 +" integer primary key autoincrement, "+COL2+" TEXT,"+COL3+" TEXT,"+COL4+" integer,"+COL5+" integer)";

        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public static long AddClimat(SQLiteDatabase sqLiteDatabase, Climat c){
        ContentValues content = new ContentValues();
        content.put(COL2, c.getNom_Ville());
        content.put(COL3, c.getPays());
        content.put(COL4, c.getTempérature());
        content.put(COL5, c.getPourcentage_Nuages());
        return sqLiteDatabase.insert(TABLE_NAME,null,content);
    }

    public static long UpdateClimat(SQLiteDatabase sqLiteDatabase,Climat c){
        ContentValues content = new ContentValues();
        content.put(COL2, c.getNom_Ville());
        content.put(COL3, c.getPays());
        content.put(COL4, c.getTempérature());
        content.put(COL5, c.getPourcentage_Nuages());
        return sqLiteDatabase.update(TABLE_NAME,content,"Id =" + c.getId(),null);
    }

    public static long DeleteClimat(SQLiteDatabase sqLiteDatabase,int Id){
        return sqLiteDatabase.delete(TABLE_NAME,"Id=" + Id,null);
    }

    public static ArrayList<Climat> getAllClimat(SQLiteDatabase sqLiteDatabase){
        ArrayList<Climat> clmts = new ArrayList<>();

        Cursor cur = sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME,null);

        while(cur.moveToNext()){
            Climat c = new Climat();

            c.setId(cur.getInt(0));
            c.setNom_Ville(cur.getString(1));
            c.setPays(cur.getString(2));
            c.setTempérature(cur.getInt(3));
            c.setPourcentage_Nuages(cur.getInt(4));

            clmts.add(c);
        }

        return clmts;
    }

    public static Climat getOneProduit(SQLiteDatabase sqLiteDatabase, int Id){
        Climat c = null;
        Cursor cur = sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME + " WHERE Id = " + Id,null);

        if(cur.moveToNext()){
            c.setId(cur.getInt(0));
            c.setNom_Ville(cur.getString(1));
            c.setPays(cur.getString(2));
            c.setTempérature(cur.getInt(3));
            c.setPourcentage_Nuages(cur.getInt(4));
        }
        return c;
    }
}
