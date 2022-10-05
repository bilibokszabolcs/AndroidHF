package com.example.activitylifecyclemonitor2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("Statusz", "MainActivity3:onCreate()");


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz", "MainActivity3:onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "MainActivity3:onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "MainActivity3:onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz", "MainActivity3:onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz", "MainActivity3:onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Statusz", "MainActivity3:onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Statusz", "MainActivity3:onRestoreInstanceState()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz", "MainActivity3:onRestart()");
    }
}