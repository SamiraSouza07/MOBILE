package com.aula3.convertervalores;

import static com.aula3.convertervalores.R.id.btnConvercao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView txtInformativo, txtValor, txtResultado;
    EditText vlrDolar;
    Button btnConvercao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInformativo = findViewById(R.id.txtInformativo);
        txtValor = findViewById(R.id.txtValor);
        txtResultado = findViewById(R.id.txtResultado);
        vlrDolar = findViewById(R.id.vlrDolar);
        btnConvercao = findViewById(R.id.btnConvercao);

    }
    public void converter(View view){
        String valor = String.valueOf(this.vlrDolar.getText());
        double vl2 = Double.parseDouble(valor)*5;
        DecimalFormat deci = new DecimalFormat("0.00");
        String novoValor = deci.format(vl2);
        txtResultado.setText("R$ "+novoValor);
    }
}