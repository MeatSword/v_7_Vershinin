package com.example.vershinin_v_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PersonalArea extends AppCompatActivity {

    String username="";
    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);

        txtName = findViewById(R.id.txtName);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            username= extras.getString("name");
        }

        txtName.setText(username);
    }
    public void onClickSearch(View v) {
        Intent nt = new Intent(this,Search.class);
        startActivity(nt);
    }
    public void onClickBack(View v) {
        Intent nt = new Intent(this,Login.class);
        startActivity(nt);
    }
    public void onClickService(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "79538937995"));
        startActivity(intent);
    }
}