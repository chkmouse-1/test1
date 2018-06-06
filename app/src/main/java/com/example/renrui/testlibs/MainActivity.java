package com.example.renrui.testlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testlibs1.TestLibs1Model;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestLibs1Model testLibs1Model = new TestLibs1Model();
    }
}