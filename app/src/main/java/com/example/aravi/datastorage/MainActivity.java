package com.example.aravi.datastorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button preferencesButton;
    Button sqliteButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void preferencesOnClick(View view){

        preferencesButton= (Button) findViewById(R.id.preferenceButtonId);
        Intent intent = new Intent(MainActivity.this,PreferencesActivity.class);
        startActivity(intent);

    }

    protected void sqliteOnclick(View view){
        sqliteButton = (Button) findViewById(R.id.sqliteButtonId);
        Intent intent = new Intent(MainActivity.this,SqliteActivity.class);
        startActivity(intent);
    }

}
