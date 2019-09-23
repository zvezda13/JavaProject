package com.example.todos.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="todosapp.db";
    private static final int DATABASE_VESION=1;

    //SQL to create tables
    private static final String TABLE_CATEGORIES_CREATE=
            "CREATE TABLE " + TodosContract.CategoriesEntry.TABLE_NAME + " (" +
                    TodosContract.CategoriesEntry._ID + " INTEGER PRIMARY KEY, " +
                    TodosContract.CategoriesEntry.COLUMN_DESCRIPTION + " TEXT " +
                    ")";
    private static final String TABLE_TODOS_CREATE =
            "CREATE TABLE " + TodosContract.TodosEntry.TABLE_NAME + " (" +
                    TodosContract.TodosEntry._ID + " INTEGER PRIMARY KEY, " +
                    TodosContract.TodosEntry.COLUMN_TEXT + " TEXT, " +
                    TodosContract.TodosEntry.COLUMN_CREATED + " TEXT default CURRENT_TIMESTAMP, " +
                    TodosContract.TodosEntry.COLUMN_EXPIRED + " TEXT, " +
                    TodosContract.TodosEntry.COLUMN_DONE + " INTEGER, " +
                    TodosContract.TodosEntry.COLUMN_CATEGORY + " INTEGER, " +
                    " FOREIGN KEY("+ TodosContract.TodosEntry.COLUMN_CATEGORY + ") REFERENCES " + TodosContract.CategoriesEntry.TABLE_NAME
                    + "(" + TodosContract.CategoriesEntry._ID +") " + ")";

    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VESION); //(context,name,factory,version)
    }

    @Override
    //when it's called for the first time
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CATEGORIES_CREATE);
        db.execSQL(TABLE_TODOS_CREATE);

    }

    @Override
    //i- old version, i1-new version. I am changing them.
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TodosContract.TodosEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ TodosContract.CategoriesEntry.TABLE_NAME);
        onCreate(db);

    }
}
