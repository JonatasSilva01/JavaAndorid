package com.example.myaplicationimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddImage = findViewById(R.id.buttonAddImg);
        ImageView imgView = findViewById(R.id.imgView);

        buttonAddImage.setOnClickListener(v -> {
            //traz uma imagem da pasta drawable
          imgView.setImageResource(R.drawable.ic_launcher_foreground);
        });
    }
}