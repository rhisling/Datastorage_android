package com.example.aravi.datastorage;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PreferencesActivity extends AppCompatActivity {
    private EditText booknameId;
    private EditText authornameId;
    private EditText descriptionId;
    public static final String MY_PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
    }

    protected void saveData(View view) {

        booknameId = (EditText) findViewById(R.id.booknameID);
        authornameId = (EditText) findViewById(R.id.authorNameId);
        descriptionId = (EditText) findViewById(R.id.descriptionId);

        String bookname = booknameId.getText().toString();
        String authorname = authornameId.getText().toString();
        String description = descriptionId.getText().toString();
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();

        editor.putString("bookname",bookname);
        editor.putString("authorname", authorname);
        editor.putString("description",description);
        editor.apply();
        editor.commit();
        Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
        finish();


    }
}
