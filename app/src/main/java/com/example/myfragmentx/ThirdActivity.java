package com.example.myfragmentx;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        FragmentManager ft = getSupportFragmentManager();
        FragmentTransaction fts=ft.beginTransaction();
        fts.add(R.id.third_container,new FirstFragment(),"一").commit();
    }
}
