package com.example.myfragmentx;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.jump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });



        FragmentManager ft=getSupportFragmentManager();
        FragmentTransaction fts=ft.beginTransaction();

        FatherFragment ff=new FatherFragment();
        fts.add(R.id.second_container,ff,"爸爸");
        fts.commit();

        ChildFragment cf=new ChildFragment();

        findViewById(R.id.replace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // getSupportFragmentManager().beginTransaction().add(R.id.second_container,cf,"儿子").commit();
                ft.beginTransaction().replace(R.id.second_container,cf,"儿子").commit();
            }
        });

        findViewById(R.id.remove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft.beginTransaction().remove(ff).commit();
            }
        });

        


    }
}
