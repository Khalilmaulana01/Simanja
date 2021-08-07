package com.example.simanja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView lupabutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    
    lupabutton = findViewById(R.id.forgetbutton);
    lupabutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent lupabutt =new Intent (Login.this, lupapassword.class);
            startActivity(lupabutt);
        }
    });
    
    }
}