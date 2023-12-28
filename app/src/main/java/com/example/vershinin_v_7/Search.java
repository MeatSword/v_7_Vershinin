package com.example.vershinin_v_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class Search extends AppCompatActivity  {

    CheckBox chb1;
    CheckBox chb2;
    CheckBox chb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        chb1 = findViewById(R.id.chb1);

        chb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    chb1.setTextColor(Color.parseColor("#DC4F00"));
                }
                else {
                    chb1.setTextColor(Color.parseColor("#FF000000"));
                }
            }
        });

        chb2 = findViewById(R.id.chb2);

        chb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    chb2.setTextColor(Color.parseColor("#DC4F00"));
                }
                else {
                    chb2.setTextColor(Color.parseColor("#FF000000"));
                }
            }
        });

        chb3 = findViewById(R.id.chb3);

        chb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    chb3.setTextColor(Color.parseColor("#DC4F00"));
                }
                else {
                    chb3.setTextColor(Color.parseColor("#FF000000"));
                }
            }
        });
        chb1.setChecked(true);
        chb2.setChecked(true);
    }
    public void onClickPersonalArea(View v) {
        Intent nt = new Intent(this,PersonalArea.class);
        startActivity(nt);
    }
    public void onClickBack(View v) {
        Intent nt = new Intent(this,Login.class);
        startActivity(nt);
    }

}