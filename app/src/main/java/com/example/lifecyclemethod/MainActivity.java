package com.example.lifecyclemethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Android", "onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Android", "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Android", "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Android", "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Android", "onStop Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Android", "onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Android", "onDestroy Called");
    }
}
