package com.example.aplicaciongrabar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    Button grabar;
    TextView texto;
    EditText apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.et_nombre);
        grabar=findViewById(R.id.bt_mostrar);
        texto=findViewById(R.id.tv_texto);
        apellido=findViewById(R.id.et_apellido);

        grabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nombre.getText().toString();
                String surname=apellido.getText().toString();
                texto.setText(name+","+surname);
            }
        });
    }
}