package com.example.fadacai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =(Button)findViewById(R.id.button1);
        Button b2 =(Button)findViewById(R.id.button2);
        Button b3 =(Button)findViewById(R.id.button3);
        Button b4 =(Button)findViewById(R.id.button4);
        Button b5 =(Button)findViewById(R.id.button5);
        Button b6 =(Button)findViewById(R.id.button6);
        Button b7 =(Button)findViewById(R.id.button7);
        Button b8 =(Button)findViewById(R.id.button8);
        b1.setOnClickListener(new Button.OnClickListener(){
        @Override
            public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ADD.class);
            startActivity(intent);
        }
        });
        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, WEB.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, STAR.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SeekBar.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, WIFE.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MENU.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Spinner.class);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LifeCycle.class);
                startActivity(intent);
            }
        });
    }
}
