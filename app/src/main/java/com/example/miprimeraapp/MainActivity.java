package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        tv1=findViewById(R.id.tv1);


    }
    public void sumar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        String valor3=et3.getText().toString();
        int nro1 = 0;
        int nro2 = 0;
        int nro3 = 0;
        if(!valor1.isEmpty()){
            nro1=Integer.parseInt(valor1);
        }
        if(!valor2.isEmpty()){
            nro2=Integer.parseInt(valor2);
        }
        if(!valor3.isEmpty()){
            nro3=Integer.parseInt(valor3);
        }
        int suma= nro1 + nro2 + nro3 ;
        String resu = String.valueOf(suma);
        tv1.setText(resu);

    };
    public void restar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        String valor3=et3.getText().toString();
        int nro1 = 0;
        int nro2 = 0;
        int nro3 = 0;
        if(!valor1.isEmpty()){
            nro1=Integer.parseInt(valor1);
        }
        if(!valor2.isEmpty()){
            nro2=Integer.parseInt(valor2);
        }
        if(!valor3.isEmpty()){
            nro3=Integer.parseInt(valor3);
        }
        int resta= nro1 - nro2 - nro3 ;
        String resu = String.valueOf(resta);
        tv1.setText(resu);
    };
    public void multiplicar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        String valor3=et3.getText().toString();
        int nro1 = 1;
        int nro2 = 1;
        int nro3 = 1;
        if(!valor1.isEmpty()){
            nro1=Integer.parseInt(valor1);
        }
        if(!valor2.isEmpty()){
            nro2=Integer.parseInt(valor2);
        }
        if(!valor3.isEmpty()){
            nro3=Integer.parseInt(valor3);
        }
        int multi= nro1 * nro2 * nro3 ;
        String resu = String.valueOf(multi);
        tv1.setText(resu);
    };
    public void dividir(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        String valor3=et3.getText().toString();
        int nro1 = 1;
        int nro2 = 1;
        int nro3 = 1;
        if(!valor1.isEmpty()){
            nro1=Integer.parseInt(valor1);
        }
        if(!valor2.isEmpty()){
            nro2=Integer.parseInt(valor2);
        }
        if(!valor3.isEmpty()){
            nro3=Integer.parseInt(valor3);
        }
        int div= nro1 / nro2 / nro3 ;
        String resu = String.valueOf(div);
        tv1.setText(resu);
    };
    public void reset(View view){
        et1.setText("");
        et2.setText("");
        et3.setText("");
    };
}