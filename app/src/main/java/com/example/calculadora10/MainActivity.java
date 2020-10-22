package com.example.calculadora10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText primerNumero;
    private EditText segundoNumero;
    private TextView mostrarResutado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primerNumero=(EditText)findViewById(R.id.numeroUno);
        segundoNumero=(EditText)findViewById(R.id.numeroDos );
        mostrarResutado=(TextView)findViewById(R.id.resultado);
    }

   public void suma (View View){

        String cadena1=primerNumero.getText().toString();
        String cadena2=segundoNumero.getText().toString();

        int valor1= Integer.parseInt(cadena1);
        int valor2= Integer.parseInt(cadena2);
        int suma= valor1+valor2;

        String resultadoSuma=String.valueOf(suma);
        mostrarResutado.setText(resultadoSuma);

   }
    public void resta (View View){

        String cadena1=primerNumero.getText().toString();
        String cadena2=segundoNumero.getText().toString();

        int valor1= Integer.parseInt(cadena1);
        int valor2= Integer.parseInt(cadena2);
        int resta= valor1-valor2;

        String resultadoResta=String.valueOf(resta);
        mostrarResutado.setText(resultadoResta);

    }
    public void multiplicacion (View View){

        String cadena1=primerNumero.getText().toString();
        String cadena2=segundoNumero.getText().toString();

        int valor1= Integer.parseInt(cadena1);
        int valor2= Integer.parseInt(cadena2);
        int multiplicacion= valor1*valor2;

        String resultadoMultiplicacion=String.valueOf(multiplicacion);
        mostrarResutado.setText(resultadoMultiplicacion);

    }
    public void divicion (View View){

        String cadena1=primerNumero.getText().toString();
        String cadena2=segundoNumero.getText().toString();

        int valor1= Integer.parseInt(cadena1);
        int valor2= Integer.parseInt(cadena2);
        int divicion= valor1/valor2;

        String resultadoDivicion=String.valueOf(divicion);
        mostrarResutado.setText(resultadoDivicion);

    }
}
