package com.example.listview01_20200522;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class baseActivity extends AppCompatActivity {
    public Context mContext = this;
    public abstract void SetupEvents();
    public abstract void setValues();
}
