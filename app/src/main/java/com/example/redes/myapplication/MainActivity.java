package com.example.redes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = "TestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate... ");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause...");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume... ");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop... ");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy... ");
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart... ");
    }
}
