package com.example.arslanconstraints10.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.arslanconstraints10.databinding.ActivityVerificationSuccessBinding;
import com.example.arslanconstraints10.drawerRelated.DrawerMenu;

public class VerificationSuccess extends AppCompatActivity {
    int SPLASH_TIME = 122; //This is 2 seconds
    ActivityVerificationSuccessBinding vBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vBinding = ActivityVerificationSuccessBinding.inflate(getLayoutInflater());
        setContentView(vBinding.getRoot());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(VerificationSuccess.this, DrawerMenu.class));
                finish();
            }
        }, SPLASH_TIME);
    }
}