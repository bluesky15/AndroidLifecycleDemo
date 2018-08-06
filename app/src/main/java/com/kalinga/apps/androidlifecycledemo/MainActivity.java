package com.kalinga.apps.androidlifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Life";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Inside the onCreate of Activity A");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Inside the onStart of Activity A");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Inside the onResume of Activity A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Inside the onStop of Activity A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Inside the onRestart of Activity A");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Inside the onDestroy of Activity A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Inside the onPause of Activity A");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "Inside the onBackPressed of Activity A");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Inside the onSaveInstanceState of Activity A");
    }
}
