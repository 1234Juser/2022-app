package com.cookandroid.capstone2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Haehwa extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haehwa);

        Button ramen_btn = (Button) findViewById(R.id.ramen_btn);
        ramen_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Hawhwaramen.class);
                startActivity(intent);
            } //클릭시 혜화 라면화면전환
        });

        Button rice_btn = (Button) findViewById(R.id.rice_btn);
        rice_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Haehwarice.class);
                startActivity(intent);
            } //클릭시 혜화밥화면전환
        });
        Button don_btn = (Button) findViewById(R.id.don_btn);
        don_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Hawhwadon.class);
                startActivity(intent);
            } //클릭시 혜화돈까스화면 전환
        });
        Button jjigae_btn = (Button) findViewById(R.id.jjigae_btn);
        jjigae_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Haehwajjigae.class);
                startActivity(intent);
            } //클릭시 혜화찌개화면 전환
        });
        Button rice1_btn = (Button) findViewById(R.id.rice1_btn);
        rice1_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String url = "https://portal.dju.ac.kr/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            } //클릭시 URI연결코드
        });

    }
}