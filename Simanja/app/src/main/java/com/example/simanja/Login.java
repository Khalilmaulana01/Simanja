package com.example.simanja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class Login extends AppCompatActivity {

    Button lupabutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    
    lupabutton = findViewById(R.id.lupabutton);
    lupabutton.setOnClickListener (new View.OnclickListener(){
        @Override
        public void onClick(View view){

            Intent intent =new Intent (Login.this, Lupapassword.class);
            startActivity(intent);
        }

    });
    
    }
}