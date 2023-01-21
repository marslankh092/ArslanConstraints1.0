package com.example.arslanconstraints10.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.arslanconstraints10.databinding.ActivitySplashBinding;

public class ActivitySplash extends AppCompatActivity {
    int SPLASH_TIME = 112;
    ActivitySplashBinding spBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spBinding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(spBinding.getRoot());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ActivitySplash.this, MainActivity.class));
                finish();
            }
        }, SPLASH_TIME);
    }
}