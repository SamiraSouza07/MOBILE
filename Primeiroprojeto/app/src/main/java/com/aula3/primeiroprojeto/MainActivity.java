package com.aula3.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

        //ativar o listener
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Germinare");

                Toast.makeText(MainActivity.this, txt.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void alterarMSG(View view) {
        txt.setText("Os Tech");
    }
}