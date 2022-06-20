package com.cookandroid.capstone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cafebene extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_bene);

        Button coffee = (Button) findViewById(R.id.coffee);
        coffee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafebenecoffee.class);
                startActivity(intent);
            } //클릭시 카페베네커피화면 전환
        });

        Button latte = (Button) findViewById(R.id.latte);
        latte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafebenenoncoffee.class);
                startActivity(intent);
            } //클릭시 카페논커피화면 전환
        });
        Button tea = (Button) findViewById(R.id.tea);
        tea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafebenetea.class);
                startActivity(intent);
            } //클릭시 카페베네티 전환
        });
        Button smoothie = (Button) findViewById(R.id.smoothie);
        smoothie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafebenesmoothie.class);
                startActivity(intent);
            } //클릭시 카페스무디 전환
        });
        Button ade = (Button) findViewById(R.id.ade);
        ade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), Cafebeneade.class);
                startActivity(intent);
            } //카페베네에이드 전환
        });

        Button juice = (Button) findViewById(R.id.juice);
        juice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), Cafejuice.class);
                startActivity(intent);
            } //클릭시 카페주스 전환
        });



    }
}