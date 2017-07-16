package com.example.geoffrey.design;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;


public class SplashActivity extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_activity);


        final View btn_getStarted = findViewById(R.id.btn_getStarted);

        btn_getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intent);
                // close this activity
                finish();

            }
        });





//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    // This method will be executed once the timer is over
//                    // Start your app main activity
//                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
//                    startActivity(i);
//
//                    // close this activity
//                    finish();
//                }
//            }, SPLASH_TIME_OUT);

    }


}
