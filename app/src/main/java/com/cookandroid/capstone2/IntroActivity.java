package com.cookandroid.capstone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Handler x = new Handler();
        x.postDelayed(new SplashHandler(), 1500);
    } // 시작화면으로 몇초의 시간후에 본화면을 보여주는지 나타내는 소스코드

    public class SplashHandler implements Runnable {
        public void run() {
            Intent intent = new Intent(getApplicationContext(),
                    MainActivity.class);
            startActivity(intent);
            finish(); //화면넘김 소스코드
        }
    }
}