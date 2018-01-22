package com.example.aravi.datastorage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SqliteActivity extends AppCompatActivity {

    DatabaseHelper dbhelper;
    Button saveButton;
    EditText messagefield;
    private static final String TAG = "SqliteActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        dbhelper = new DatabaseHelper(getApplicationContext());
        saveButton = (Button) findViewById(R.id.saveButtonSQLId);
        messagefield = (EditText) findViewById(R.id.messageId);


    }


    protected void saveMessage(View view) {
        SQLiteDatabase db = dbhelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        String message = messagefield.getText().toString();

        if (!message.equalsIgnoreCase("")) {
            values.put(BlogContract.BlogEntry.COLUMN_NAME_MESSAGE, message);
            long newRowId = db.insert(BlogContract.BlogEntry.TABLE_NAME, null, values);
            Log.d(TAG, "saveMessage: RowId"+newRowId);
            if (newRowId > -1) {
                Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
                finish();
            } else {
                Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
        else{
            Toast.makeText(this, "Please enter the message!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        dbhelper.close();
        super.onDestroy();

    }
}
