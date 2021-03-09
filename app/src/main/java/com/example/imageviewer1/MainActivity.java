package com.example.imageviewer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i("TAG","Create MainActivity");
        layout = findViewById(R.id.layout);

    }
    public void move(View V){
        //화면 클릭(터치)하면 SecondActivity 전환하기 화면 보내기 반대로 하는것은 안됨 스텍이 쌓인다(나중에 뒤죽박죽 된다)
        // (1) intent 메세지 객체 생성
        Intent moveINT = new Intent(MainActivity.this,MainActivity2.class);

        // (2) intent 전송 ==> startActivity()
        startActivity(moveINT);

    }
}