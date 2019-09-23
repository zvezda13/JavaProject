package com.example.todos;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.todos.data.DatabaseHelper;
import com.example.todos.data.TodosContract;

public class TodoListActivity extends AppCompatActivity {
    static final int ALL_RECORDS= -1;
    Cursor cursor;
    private void createCategory(){
        ContentValues values= new ContentValues();
        values.put(TodosContract.CategoriesEntry.COLUMN_DESCRIPTION,"Work");
        Uri uri= getContentResolver().insert(TodosContract.CategoriesEntry.CONTENT_URI,values);
        Log.d("Main Activity","InsertCategory "+uri);
    }

    private void readData(){
        String [] projection ={
                TodosContract.TodosEntry.COLUMN_TEXT,
                TodosContract.TodosEntry.TABLE_NAME+"."+ TodosContract.TodosEntry._ID,
                TodosContract.TodosEntry.COLUMN_CREATED,
                TodosContract.TodosEntry.COLUMN_EXPIRED,
                TodosContract.TodosEntry.COLUMN_DONE,
                TodosContract.CategoriesEntry.TABLE_NAME+"."+
                TodosContract.CategoriesEntry.COLUMN_DESCRIPTION};
        //String selection= TodosContract.TodosEntry.COLUMN_CATEGORY +" =?";
        //String [] selectionArgs= {"1"};
        cursor =getContentResolver().query(TodosContract.TodosEntry.CONTENT_URI,projection,null,null,null);
        /*int i= c.getCount(); //get count return number of rows in my cursor
        Log.d("Record Count", String.valueOf(i));
        String rowContent= "";
        while (c.moveToNext()){
            for (i=0;i<=4;i++){
                rowContent+= c.getString(i)+" - ";
            }
            Log.i("Row "+ String.valueOf(c.getPosition()),rowContent);
            rowContent="";  //that cleans the row content
        }
        c.close(); //crucial to save my device memory
        */
    }

    private void updateTodo(){
        int id=1;
        DatabaseHelper helper= new DatabaseHelper(this);
        SQLiteDatabase db= helper.getReadableDatabase();
        String[] args ={String.valueOf(id)};
        ContentValues values= new ContentValues();
        values.put(TodosContract.TodosEntry.COLUMN_TEXT, "Call mr Bond");
        int numRows = db.update(TodosContract.TodosEntry.TABLE_NAME,values, TodosContract.TodosEntry._ID+" =?",args);
        Log.d( "Update Rows", String.valueOf(numRows));
        db.close();
    }
    private void deleteTodo(int id){
        //DatabaseHelper helper= new DatabaseHelper(this);SQLiteDatabase db= helper.getReadableDatabase();
        String [] args={String.valueOf(id)};
        if (id== ALL_RECORDS){
            args=null;
        }
        int numRows=getContentResolver().delete(TodosContract.TodosEntry.CONTENT_URI, TodosContract.TodosEntry._ID+ " =?",args); //db.delete(TodosContract.TodosEntry.TABLE_NAME, TodosContract.TodosEntry._ID+" =?",args);
        Log.d("Delete rows", String.valueOf(numRows));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // createCategory();
       // DatabaseHelper helper = new DatabaseHelper(this); //this - we pass the current context
        //create sqlite object, from helper object we call method
        //SQLiteDatabase db= helper.getReadableDatabase()
        //CreateTodo();
        final ListView lv=(ListView) findViewById(R.id.lvTodos);
        readData();// updateTodo();// deleteTodo();
        TodosCursorAdapter adapter= new TodosCursorAdapter(this,cursor,false);
        lv.setAdapter(adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//adds the custom layout

//adds the click event to the listView, reading the content
        /* lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                Intent intent = new Intent(TodoListActivity.this, TodoActivity.class);
                String content= (String) lv.getItemAtPosition(pos);
                intent.putExtra("Content", content);
                startActivity(intent);
            }
        }); */

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void CreateTodo(){
        DatabaseHelper helper = new DatabaseHelper(this);
        SQLiteDatabase db=helper.getWritableDatabase();
        String query = "INSERT INTO todos ("
                + TodosContract.TodosEntry.COLUMN_TEXT+ ","
                + TodosContract.TodosEntry.COLUMN_CATEGORY+ ","
                + TodosContract.TodosEntry.COLUMN_CREATED+ ","
                + TodosContract.TodosEntry.COLUMN_EXPIRED+ ","
                + TodosContract.TodosEntry.COLUMN_DONE+ ")"
                +"VALUES (\"Go to the jim\",1,\"2019-01-01\", \"\",0)";
        db.execSQL(query);

        ContentValues values = new ContentValues();
        values.put(TodosContract.TodosEntry.COLUMN_TEXT,"Call mr Bean");
        values.put(TodosContract.TodosEntry.COLUMN_CATEGORY,1);
        values.put(TodosContract.TodosEntry.COLUMN_CREATED,"2019-02-02");
        values.put(TodosContract.TodosEntry.COLUMN_DONE,0);
        long todo_id=db.insert(TodosContract.TodosEntry.TABLE_NAME,null,values);

    }
}