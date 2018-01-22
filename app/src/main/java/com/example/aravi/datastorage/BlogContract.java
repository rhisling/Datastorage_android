package com.example.aravi.datastorage;

import android.provider.BaseColumns;

/**
 * Created by aravi on 09-10-2017.
 */

public final class BlogContract {

private BlogContract(){}

    public static final String DATABASE_NAME="database.db";
    public static class BlogEntry implements BaseColumns{


        public static final String TABLE_NAME = "Blog";
        public static final String COLUMN_NAME_MESSAGE = "Message ";


        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_NAME_MESSAGE + " TEXT)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TABLE_NAME;


    }


}
