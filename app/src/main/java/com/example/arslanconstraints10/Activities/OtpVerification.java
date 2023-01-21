package com.example.arslanconstraints10.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.arslanconstraints10.databinding.ActivityOtpVerificationBinding;
//Arslan
public class OtpVerification extends AppCompatActivity {
    int SPLASH_TIME = 121;
    ActivityOtpVerificationBinding otBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        otBinding=ActivityOtpVerificationBinding.inflate(getLayoutInflater());
        setContentView(otBinding.getRoot());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(OtpVerification.this, VerificationSuccess.class));
                finish();
            }
        }, SPLASH_TIME);
    }
}