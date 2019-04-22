package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private Button btnRed;
    private EditText valor;
    private TextView numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnRed = (Button) findViewById(R.id.btnRed);
        valor = (EditText) findViewById(R.id.edTxtValor);
        numero = (TextView) findViewById(R.id.txtNumero);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    numero.setText((Integer.parseInt(numero.getText().toString()) + Integer.parseInt(valor.getText().toString())));
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ numero.setText((Integer.parseInt(numero.getText().toString()) - Integer.parseInt(valor.getText().toString())));}catch(Exception e){
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}
