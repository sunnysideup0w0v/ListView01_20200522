package com.example.listview01_20200522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.listview01_20200522.databinding.ActivityMainBinding;

public class MainActivity extends baseActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    @Override
    public void SetupEvents() {

    }

    @Override
    public void setValues() {

    }
}
