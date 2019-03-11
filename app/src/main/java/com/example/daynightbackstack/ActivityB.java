package com.example.daynightbackstack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    private int mLastDayNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        mLastDayNightMode = AppCompatDelegate.getDefaultNightMode();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (AppCompatDelegate.getDefaultNightMode() != mLastDayNightMode) {
            recreate();
        }
    }

    public void gotoActivityC(View view) {
        startActivity(new Intent(this, ActivityC.class));
    }
}
