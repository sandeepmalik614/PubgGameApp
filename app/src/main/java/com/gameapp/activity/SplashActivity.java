package com.gameapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.gameapp.R;
import com.gameapp.utils.AppPrefrences;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = findViewById(R.id.imageView);
        logo.setAlpha(0f);
        show(logo, 2000);
    }

    private void show(View v, int duration) {
        v.animate().alpha(1f).setDuration(duration);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (AppPrefrences.isUserLoggedOut(SplashActivity.this)) {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                    finish();
                }
            }
        }, (duration + 500));
    }
}
