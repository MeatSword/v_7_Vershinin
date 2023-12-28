package com.example.vershinin_v_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonalArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
    }
    public void onClickSearch(View v) {
        Intent nt = new Intent(this,Search.class);
        startActivity(nt);
    }
    public void onClickBack(View v) {
        Intent nt = new Intent(this,Login.class);
        startActivity(nt);
    }
}