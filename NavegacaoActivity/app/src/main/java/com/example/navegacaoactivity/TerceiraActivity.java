package com.example.navegacaoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    private TextView texto_objs;
    private Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        texto_objs = findViewById(R.id.text_infos);

        user = (Usuario) getIntent().getSerializableExtra("user");

        texto_objs.setText("Nome: "+ user.getNome() + " Idade: "+ user.getIdade() + " Altura: "+ user.getAltura());
    }
}