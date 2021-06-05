package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import model.Destination;

import static model.ArrayDestination.savedestinationlist;

public class SplashScreen extends AppCompatActivity {

    private static int SplashScreen = 3000;
    Animation top_animation, bottom_animation;
    ImageView Logo;
    TextView Tagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        getSupportActionBar().hide();

        Logo = findViewById(R.id.Logo);
        Tagline = findViewById(R.id.Tagline);
        top_animation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        Logo.setAnimation(top_animation);
        Tagline.setAnimation(bottom_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, LoginPage.class);
                startActivity(intent);
                finish();
            }
        },SplashScreen);

    }
}