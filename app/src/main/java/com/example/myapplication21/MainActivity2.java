package com.example.myapplication21;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView itexto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        itexto = (TextView) findViewById(R.id.textView2);

        String nombre = getIntent().getStringExtra("nombre");

        itexto.setText(nombre);

        Toast.makeText(getApplicationContext(),"activity 2",Toast.LENGTH_LONG).show();
    }
}