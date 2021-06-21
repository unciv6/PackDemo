package com.kugou.packdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

//方案1 导包
//import com.kugou.one.One;
//import com.kugou.sec.Sec;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NewTry.test();


        //方案1 行不通的
//        if (BuildConfig.withOne) {
//            One one = new One();
//            one.hello();
//        }
//        if (BuildConfig.withSec) {
//            Sec sec = new Sec();
//            sec.hello();
//        }
    }
}