package com.example.navegacaoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Resgatando meu objeto
        Usuario usuario = new Usuario();
        usuario.setNome("Jonatas");
        usuario.setSobrenome("Silva");
        usuario.setIdade(22);
        usuario.setAltura(1.95f);

        Button btn = findViewById(R.id.buttonNavigate2);
        btn.setOnClickListener(v -> {
            // aqui podemos apontar para "activity" que ele vai receber algum valor.
            Intent intent = new Intent(this, SegundaActivity.class);
            // mandando os valores para ser resgatados nas telas
            intent.putExtra("user", usuario);

            startActivity(intent);
        });
    }
}