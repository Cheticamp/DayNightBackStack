package com.example.daynightbackstack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

public class ActivityA extends AppCompatActivity {
    private int mLastDayNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        // Capture the day/night mode in effect.
        if (savedInstanceState == null) {
            // This value should come from preferences or other persistent storage but is just
            // hard-coded for the demo.
            mLastDayNightMode = AppCompatDelegate.MODE_NIGHT_NO;
            AppCompatDelegate.setDefaultNightMode(mLastDayNightMode);
        } else {
            mLastDayNightMode = AppCompatDelegate.getDefaultNightMode();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (AppCompatDelegate.getDefaultNightMode() != mLastDayNightMode) {
            recreate();
        }
    }

    public void gotoActivityB(View view) {
        startActivity(new Intent(this, ActivityB.class));
    }
}
