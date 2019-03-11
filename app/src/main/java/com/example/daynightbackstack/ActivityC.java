package com.example.daynightbackstack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

public class ActivityC extends AppCompatActivity {
    private int mDayNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        mDayNightMode = AppCompatDelegate.getDefaultNightMode();
    }

    public void toggleDayNight(View view) {
        mDayNightMode = (mDayNightMode == AppCompatDelegate.MODE_NIGHT_NO)
                ? AppCompatDelegate.MODE_NIGHT_YES
                : AppCompatDelegate.MODE_NIGHT_NO;
        AppCompatDelegate.setDefaultNightMode(mDayNightMode);
        getDelegate().applyDayNight();
    }
}
