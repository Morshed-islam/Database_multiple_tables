package com.genius.thirdeye_lll.databasethreetables.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ThirdEye-lll on 2/4/2017.
 */

public class DbHelper extends SQLiteOpenHelper {

    static final String DATABASE_NAME ="morsheddbnew";
    static final int DATABASE_VERSION = 1;

    //------------------tableOne here----------
    public static final String TABLE_ONE = "table_one";
    public static final String TABLE_ONE_COL_ID= "_id";
    public static final String TABLE_ONE_COL_NAME = "name";
    public static final String TABLE_ONE_COL_DES = "description";

    //---------------------tableTwo here---------------------
    public static final String TABLE_TWO = "table_two";
    public static final String TABLE_TWO_COL_ID= "_id";
    public static final String TABLE_TWO_COL_EMAIL = "email";
    public static final String TABLE_TWO_COL_PHONE = "phone";

    //---------------------tableThree here---------------------
    public static final String TABLE_THREE = "table_three";
    public static final String TABLE_THREE_COL_ID= "_id";
    public static final String TABLE_THREE_COL_VARSITY = "varsity";
    public static final String TABLE_THREE_COL_DEPARTMENT = "department";


    //----------------all query here------------------------------


    String tableOneQuery = ("CREATE TABLE IF NOT EXISTS " + TABLE_ONE + " ( "
            + TABLE_ONE_COL_ID + " INTEGER primary key autoincrement, "
            + TABLE_ONE_COL_NAME + " TEXT NOT NULL, "
            + TABLE_ONE_COL_DES + " TEXT NOT NULL)");

    String tableTwoQuery = ("CREATE TABLE IF NOT EXISTS " + TABLE_TWO + " ( "
            + TABLE_TWO_COL_ID + " INTEGER primary key autoincrement, "
            + TABLE_TWO_COL_EMAIL + " TEXT NOT NULL, "
            + TABLE_TWO_COL_PHONE + " TEXT NOT NULL)");

    String tableThreeQuery = ("CREATE TABLE IF NOT EXISTS " + TABLE_THREE + " ( "
            + TABLE_THREE_COL_ID + " INTEGER primary key autoincrement, "
            + TABLE_THREE_COL_VARSITY + " TEXT NOT NULL, "
            + TABLE_THREE_COL_DEPARTMENT + " TEXT NOT NULL)");



    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tableOneQuery);
        db.execSQL(tableTwoQuery);
        db.execSQL(tableThreeQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
