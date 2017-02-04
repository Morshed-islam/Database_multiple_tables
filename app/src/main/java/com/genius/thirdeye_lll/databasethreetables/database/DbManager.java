package com.genius.thirdeye_lll.databasethreetables.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.genius.thirdeye_lll.databasethreetables.module.Student;

/**
 * Created by ThirdEye-lll on 2/4/2017.
 */

public class DbManager {

    SQLiteDatabase sql;
    DbHelper dbHelper;

    public DbManager(DbHelper helper) {
        this.dbHelper = helper;
    }


    public void addDataToTableOne(Student mStudent){

        sql =  dbHelper.getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put(DbHelper.TABLE_ONE_COL_NAME,mStudent.getName());
        cv.put(DbHelper.TABLE_ONE_COL_DES,mStudent.getDescription());

        sql.insert(DbHelper.TABLE_ONE,null,cv);
        sql.close();

    }


    public void addDataToTableTwo(Student mStudent){

        sql =  dbHelper.getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put(DbHelper.TABLE_TWO_COL_EMAIL,mStudent.getEmail());
        cv.put(DbHelper.TABLE_TWO_COL_PHONE,mStudent.getPhone());

        sql.insert(DbHelper.TABLE_TWO,null,cv);
        sql.close();

    }

    public void addDataToTableThree(Student mStudent){

        sql =  dbHelper.getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put(DbHelper.TABLE_THREE_COL_VARSITY,mStudent.getVarsityId());
        cv.put(DbHelper.TABLE_THREE_COL_DEPARTMENT,mStudent.getDeartment());

        sql.insert(DbHelper.TABLE_THREE,null,cv);
        sql.close();

    }

    public String[] getTableOneData(){

        sql = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM "+DbHelper.TABLE_ONE;
        Cursor c = sql.rawQuery(query , null);

        String[] received_data = new String[c.getCount()];

        c.moveToFirst();

        if (c.moveToFirst()){
            int counter = 0;
            do {
                received_data[counter] = c.getString(c.getColumnIndex(DbHelper.TABLE_ONE_COL_NAME+""))+"\n"+
                        c.getString(c.getColumnIndex(DbHelper.TABLE_ONE_COL_DES))+"\n";
                counter = counter+1;
            }while (c.moveToNext());
        }

        return received_data;

    }

    public String[] getTableTwoData(){

        sql = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM "+DbHelper.TABLE_TWO;
        Cursor c = sql.rawQuery(query , null);

        String[] received_data = new String[c.getCount()];

        c.moveToFirst();

        if (c.moveToFirst()){
            int counter = 0;
            do {
                received_data[counter] = c.getString(c.getColumnIndex(DbHelper.TABLE_TWO_COL_EMAIL+""))+"\n"+
                        c.getString(c.getColumnIndex(DbHelper.TABLE_TWO_COL_PHONE))+"\n";
                counter = counter+1;
            }while (c.moveToNext());
        }

        return received_data;
    }

    public String[] getTableThreeData(){

        sql = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM "+DbHelper.TABLE_THREE;
        Cursor c = sql.rawQuery(query , null);

        String[] received_data = new String[c.getCount()];

        c.moveToFirst();

        if (c.moveToFirst()){
            int counter = 0;
            do {
                received_data[counter] = c.getString(c.getColumnIndex(DbHelper.TABLE_THREE_COL_VARSITY+""))+"\n"+
                        c.getString(c.getColumnIndex(DbHelper.TABLE_THREE_COL_DEPARTMENT))+"\n";
                counter = counter+1;
            }while (c.moveToNext());
        }

        return received_data;
    }



}
