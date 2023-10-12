package com.example.navegacaoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;
    private Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textNome = findViewById(R.id.textView);
        user = (Usuario) getIntent().getSerializableExtra("user");

        textNome.setText(user.getNome());

        Usuario usuario = new Usuario();
        usuario.setNome("Jonatas");
        usuario.setSobrenome("Silva");
        usuario.setIdade(22);
        usuario.setAltura(1.95f);

        Button btn = findViewById(R.id.buttonNavigate3);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TerceiraActivity.class);
            intent.putExtra("user", usuario);
            startActivity(intent);
        });
    }
}