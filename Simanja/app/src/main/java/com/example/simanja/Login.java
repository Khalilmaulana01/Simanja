package com.example.simanja;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView lupabutton;
    Boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
        super.onBackPressed();

        System.exit( 0);
        return;
    }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Tekan lagi untuk keluar",
                Toast.LENGTH_SHORT).show();
        finish();
    }
    //    int counter = 0;
//    @Override
//    public void onBackPressed() {
//        counter++;
//        if (counter == 1)
//        super.onBackPressed();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    
    lupabutton = findViewById(R.id.forgetbutton);
    lupabutton.setOnClickListener(new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onClick(View v) {

            Intent lupabutt =new Intent (Login.this, lupapassword.class);
            startActivity(lupabutt);

        }




    });

    }
}