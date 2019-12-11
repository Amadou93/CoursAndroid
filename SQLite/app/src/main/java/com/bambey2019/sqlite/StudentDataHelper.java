package com.bambey2019.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StudentDataHelper extends SQLiteOpenHelper {
    private static final String DATABASENAME ="student.db" ;
    private static final int DATABASEVERSION =1 ;

    public StudentDataHelper(Context context) {
        super(context, DATABASENAME, null, DATABASEVERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREA\n" +
                "\n" +
                "    @OverrideTE TABLE student(id INTEGER PRIMARY KEY, name TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
