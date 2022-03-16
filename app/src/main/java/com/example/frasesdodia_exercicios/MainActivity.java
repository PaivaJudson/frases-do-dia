package com.example.frasesdodia_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String listaFrases[] = {
                "Frase 1",
                "Frase 2",
                "Frase 3",
                "Frase 4",
                "Frase 5"};

        txt = findViewById(R.id.txt_resultado);
        Random random = new Random();
        int i = random.nextInt(listaFrases.length);
        txt.setText(listaFrases[i]);

    }

}