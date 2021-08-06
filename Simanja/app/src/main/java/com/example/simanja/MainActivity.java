package com.example.simanja;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //variableanimasi
    ImageView image;
    TextView logo;

    //waktu
    public static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        //panggil button lupa password
//        Button lupabutton = findViewById(R.id.lupabutton);
//
//        lupabutton.setOnClickListener(v -> {
//
//            Intent intent = new Intent(this, forget_password.class);
//
//            startActivity(intent);
//                    });



        //Hooks
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.TextView);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Login.class);


                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View, String>(image, "logo_image");
                pairs[1] = new Pair<View, String>(logo, "logo_text");


                ActivityOptions Options = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    Options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
                }
                startActivity(intent,Options.toBundle());
            }

        },SPLASH_SCREEN );
//        lupabutton.setOnClickListener(v -> {
//
//            Intent intent = new Intent(this,forget_password.class);
//            startActivity(intent);
        };
    }

