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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mn = (Button)this.findViewById(R.id.button);
        mn.setOnClickListener(this);
    }
    public void onClick(View v) {

            Intent nt = new Intent(this,PersonalArea.class);
            startActivity(nt);
    }
    //android:background="@drawable/edittextstyle"
    /*<style name="btn_my">
            <item name="android:layout_width">wrap_content</item>
            <item name="android:layout_height">wrap_content</item>
            <item name="android:textColor">#FFFFFF</item>
            <item name="android:backgroundTint">#DC4F00</item>
            <item name="android:fontFamily">@font/roboto</item>
        </style>8*/
}