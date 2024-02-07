package com.aula3.sorteadornumerico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView resultado, app_sorteador;
    Button bt_sortear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = findViewById(R.id.resultado);
        bt_sortear = findViewById(R.id.bt_sortear);
        app_sorteador = findViewById(R.id.app_sorteador);

        bt_sortear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random num = new Random();
                resultado.setText(num.nextInt(10));
            }

        }
    }





}