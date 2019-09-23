package com.example.todos.data;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.support.annotation.Nullable;

import static com.example.todos.data.TodosContract.CONTENT_AUTHORITY;
import static com.example.todos.data.TodosContract.PATH_CATEGORIES;
import static com.example.todos.data.TodosContract.PATH_TODO;

public class TodosProvider extends ContentProvider  {
    //constance for the operation
    private static final int TODOS=1;
    private static final int TODOS_ID=2;
    private static final int CATEGORIES=3;
    private static final int CATEGORIES_ID=4;
    //urimatcher
    private static final UriMatcher uriMatcher= new UriMatcher(UriMatcher.NO_MATCH);
    static {
        uriMatcher.addURI( CONTENT_AUTHORITY,PATH_TODO,TODOS);
        uriMatcher.addURI( CONTENT_AUTHORITY,PATH_TODO+"/#",TODOS_ID);//for single row of the table- #
        uriMatcher.addURI( CONTENT_AUTHORITY,PATH_CATEGORIES,CATEGORIES);
        uriMatcher.addURI( CONTENT_AUTHORITY,PATH_CATEGORIES+"/#",CATEGORIES_ID);
    }
    private DatabaseHelper helper;

    @Override
    public boolean onCreate() {
        helper= new DatabaseHelper(getContext());
        return false;
    }

    @Nullable
    @Override
    public Cursor query( Uri uri, String[] projection, String selection, String[] selectionArgs, String orderBy) {
        SQLiteDatabase db=helper.getReadableDatabase();
        Cursor cursor;
        int match= uriMatcher.match(uri);
        //todos INNER JOIN categories ON category=category_id
        String inTables= TodosContract.TodosEntry.TABLE_NAME
                +" inner join "
                + TodosContract.CategoriesEntry.TABLE_NAME
                +"on"+ TodosContract.TodosEntry.COLUMN_CATEGORY+" ="
                +TodosContract.CategoriesEntry.TABLE_NAME+"."
                +TodosContract.CategoriesEntry._ID;
        SQLiteQueryBuilder builder;

        switch (match){
            case TODOS:
                builder= new SQLiteQueryBuilder();
                builder.setTables(inTables);
                cursor =builder.query(db,projection,selection,selectionArgs,null,null,orderBy);
                break;
            case TODOS_ID:
                builder= new SQLiteQueryBuilder();
                builder.setTables(inTables);
                selection= TodosContract.CategoriesEntry._ID +"=?";
                selectionArgs= new String[]{String.valueOf(ContentUris.parseId(uri))};
                cursor =builder.query(db,projection,selection,selectionArgs,null,null,orderBy);
                break;
            case CATEGORIES:
                cursor =db.query(TodosContract.CategoriesEntry.TABLE_NAME,projection,selection,selectionArgs,null,null,orderBy);
                break;
            case CATEGORIES_ID:
                selection=TodosContract.CategoriesEntry._ID+"=?";
                selectionArgs= new String[]{String.valueOf(ContentUris.parseId(uri))};
                cursor =db.query(TodosContract.CategoriesEntry.TABLE_NAME,projection,selection,selectionArgs,null,null,orderBy);
                break;
                default:
                    throw new IllegalArgumentException("Unknown URI");

        }
        return null;
    }

    @Nullable
    @Override
    public String getType( Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert( Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete( Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update( Uri uri,  ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
