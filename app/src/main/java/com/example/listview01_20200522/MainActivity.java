package com.example.listview01_20200522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.listview01_20200522.databinding.ActivityMainBinding;
import com.example.listview01_20200522.datas.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends baseActivity {
    ActivityMainBinding binding;

    List<Student> ourClassStudentList = new ArrayList<>();

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
        ourClassStudentList.add(new Student("구현정", "서울시 종로구"));

    }
}
