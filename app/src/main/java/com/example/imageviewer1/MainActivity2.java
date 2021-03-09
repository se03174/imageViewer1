package com.example.imageviewer1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity2 extends AppCompatActivity {
   private ImageView a;
   // int image[] = {R.id.aloe,R.id.bee,R.id.blue,R.id.fish,R.id.fox,R.id.lemon,R.id.pen,R.id.pig,R.id.sheep,R.id.tomato};
   // int num=10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //Log.i("TAG","Create MainActivity2");
        a = (ImageView)findViewById(R.id.aloe);
//        b = findViewById(R.id.bee);
//        c = findViewById(R.id.blue);
//        d = findViewById(R.id.fish);
//        e = findViewById(R.id.fox);
//        f = findViewById(R.id.lemon);
//        g = findViewById(R.id.pen);
//        h = findViewById(R.id.pig);
//        i = findViewById(R.id.tomato);
//        j = findViewById(R.id.sheep);


        // Image 전송
//        a.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
//                Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.id.aloe);
//                ByteArrayOutputStream stream = new ByteArrayOutputStream();
//                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
//                byte[] byteArray = stream.toByteArray();
//                intent.putExtra("image", byteArray);
//                startActivity(intent);
//
//
//            }
//        });
    }

    public void onClick(View v){

        ImageView imageView = (ImageView)findViewById(v.getId());
        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
        Bitmap sendBitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap(); //비트맵으로 변환
        ByteArrayOutputStream stream = new ByteArrayOutputStream(); //비트맵을 인풋으로 받아서 배열
        sendBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream); // 파일 확장자 맞춰서 넣기
        byte[] byteArray = stream.toByteArray();
        intent.putExtra("image", byteArray);
        startActivity(intent);
        //Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.brush);
//        ByteArrayOutputStream stream = new ByteArrayOutputStream();
//        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
//        byte[] byteArray = stream.toByteArray();
//        moveINT.putExtra("image",byteArray);
    }
}

//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
//                Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.id.bee);
//                ByteArrayOutputStream stream = new ByteArrayOutputStream();
//                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
//                byte[] byteArray = stream.toByteArray();
//                intent.putExtra("image", byteArray);
//                startActivity(intent);
//            }
//        });


