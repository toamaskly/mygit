package com.example.myfragmentx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("自己","我做出了第一次修改");
        Log.i("自己","测试我现在和远程仓库同步了吗");
    }

    public void jumpFragment(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
        Log.i("我自己","测试其他人是否能和仓库同步");
        Log.i("我自己","故意制造冲突哈哈");
        
        Log.i("其他人","其他人的又一次提交");


    }
}

