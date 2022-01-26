package com.example.linapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lin_lib.TTT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TTT.toasts(this,"dddd");
    }
}