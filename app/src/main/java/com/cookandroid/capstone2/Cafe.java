package com.cookandroid.capstone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cafe extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        Button coffee = (Button) findViewById(R.id.coffee);
        coffee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafecoffee.class);
                startActivity(intent);
            } //클릭시 카페커피전환
        });

        Button latte = (Button) findViewById(R.id.latte);
        latte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafelatte.class);
                startActivity(intent);
            } //클릭시 카페라떼 전환
        });
        Button tea = (Button) findViewById(R.id.tea);
        tea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafetea.class);
                startActivity(intent);
            } //클릭시 카페티전환
        });
        Button smoothie = (Button) findViewById(R.id.smoothie);
        smoothie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Cafesmoothie.class);
                startActivity(intent);
            } //클릭시 카페스무디 전환
        });
        Button ade = (Button) findViewById(R.id.ade);
        ade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), Cafeade.class);
                startActivity(intent);
            } //클릭시 카페에이드 전환
        });
        Button frappe = (Button) findViewById(R.id.frappe);
        frappe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), Cafefrappe.class);
                startActivity(intent);
            } //클릭시 카페프라페전환
        });
        Button juice = (Button) findViewById(R.id.juice);
        juice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), Cafejuice.class);
                startActivity(intent);
            } //클릭시 카페주스전환
        });
        Button shake = (Button) findViewById(R.id.shake);
        shake.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getApplicationContext(), Cafeshake.class);
                startActivity(intent);
            } //클릭시 카페쉐이크전환
        });


    }
}