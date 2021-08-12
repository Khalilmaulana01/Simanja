package com.example.simanja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lupapassword extends AppCompatActivity {

    TextView kembalilupabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupapassword);


        kembalilupabtn = findViewById(R.id.kembalilupabtn);
        kembalilupabtn.setOnClickListener(v ->
        {

            Intent kembalilupabutt =new Intent (lupapassword.this, Login.class);
            startActivity(kembalilupabutt);
            finish();
        });

    }
}