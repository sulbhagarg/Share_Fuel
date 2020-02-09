package com.example.share_fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private Handler splashHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splashHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, com.example.share_fuel.ui.login.LoginActivity.class);
                startActivity(intent);
            }
        }, 3000);

//        Intent i = new Intent(MainActivity.this, com.example.share_fuel.ui.home.HomeFragment.class);
//        startActivity(i);
    }
}
