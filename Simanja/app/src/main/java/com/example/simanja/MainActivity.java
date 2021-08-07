package com.example.simanja;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    //variableanimasi
    ImageView image;
    TextView logo;
//    private TextView tombollupa;

    //waktu
    public static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

//        tombollupa=findViewById(R.id.forgetbutton);
//
//        tombollupa.setOnClickListener(v -> {
//            Intent lupapassword;
//            lupapassword = new Intent(MainActivity.this,lupapassword.class);
//            startActivity(lupapassword);
//        });


        //Hooks
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.TextView);


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this,Login.class);


            Pair[] pairs = new Pair[2];
            pairs[0] = new Pair<View, String>(image, "logo_image");
            pairs[1] = new Pair<View, String>(logo, "logo_text");


            ActivityOptions Options = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                Options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
            }
            startActivity(intent, Objects.requireNonNull(Options).toBundle());
        },SPLASH_SCREEN );

    }
}
