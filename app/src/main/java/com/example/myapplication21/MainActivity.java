package com.example.myapplication21;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText itexto;
    Button ingreso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingreso = (Button)findViewById(R.id.button);
        itexto = (EditText) findViewById(R.id.Itexto);

        /*Bundle parametros = this.getIntent().getExtras();
        String datos = parametros.getString("datos");
        texto.setText(datos);*/

        /*ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, )
            }
        });*/
    }
    public void enviarDatos(View view){
        Intent trab = new Intent (MainActivity.this,MainActivity2.class);
        trab.putExtra("nombre",itexto.getText()+"");
        startActivity(trab);
    }
}