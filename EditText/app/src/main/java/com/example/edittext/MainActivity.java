package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editName = findViewById(R.id.edtNome);
        EditText editNumero = findViewById(R.id.editNumero);
        Button buttonAddPeople = findViewById(R.id.buttonAddPeople);

        buttonAddPeople.setOnClickListener(v -> {
            // getText -> pega o texto digitado do input
            Toast.makeText(this, editName.getText().toString(), Toast.LENGTH_LONG).show();
            Toast.makeText(this, editNumero.getText().toString(), Toast.LENGTH_LONG).show();
        });

    }
}