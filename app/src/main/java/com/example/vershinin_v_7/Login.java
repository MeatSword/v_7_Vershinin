package com.example.vershinin_v_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button mn;
    EditText nameBox;
    EditText passBox;

    DBHelper sqlHelper;
    SQLiteDatabase db;
    Cursor cursor;
    long userId=0;
    String username="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameBox = findViewById(R.id.editLog);
        passBox = findViewById(R.id.editPass);

        mn = (Button)this.findViewById(R.id.button);
        mn.setOnClickListener(this);

        sqlHelper = new  DBHelper(this);
    }
    public void onClick(View v) {
        db = sqlHelper.getReadableDatabase();
        cursor = db.rawQuery(String.format("select * from %s where login = '%s' and pass = '%s'",DBHelper.TABLE, nameBox.getText().toString(),passBox.getText().toString()), null);

        if(cursor.moveToFirst()){
            int kk = cursor.getColumnIndex(DBHelper.COLUMN_ID);
            userId = cursor.getInt(kk);
        }
        db.close();

        db = sqlHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put( DBHelper.COLUMN_LOG, nameBox.getText().toString());
        cv.put( DBHelper.COLUMN_PASS, passBox.getText().toString());

        if (userId > 0) {
            db.update( DBHelper.TABLE, cv,  DBHelper.COLUMN_ID + "=" + userId, null);
        } else {
            db.insert( DBHelper.TABLE, null, cv);
        }
        db.close();

        db = sqlHelper.getReadableDatabase();
        cursor = db.rawQuery(String.format("select * from %s where login = '%s' and pass = '%s'",DBHelper.TABLE, nameBox.getText().toString(),passBox.getText().toString()), null);

        if(cursor.moveToFirst()){
            int kk = cursor.getColumnIndex(DBHelper.COLUMN_LOG);
            username = cursor.getString(kk);
        }

        goHome();
    }
    private void goHome(){
        db.close();

        Intent intent = new Intent(this, PersonalArea.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.putExtra("name",username);
        startActivity(intent);
    }
}
    //android:background="@drawable/edittextstyle"
    /*<style name="btn_my">
            <item name="android:layout_width">wrap_content</item>
            <item name="android:layout_height">wrap_content</item>
            <item name="android:textColor">#FFFFFF</item>
            <item name="android:backgroundTint">#DC4F00</item>
            <item name="android:fontFamily">@font/roboto</item>
        </style>8*/
