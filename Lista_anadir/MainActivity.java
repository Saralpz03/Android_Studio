package com.example.aplicacion_sara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText texto;
    Button grabar;
    ListView lista;
    List list;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto=findViewById(R.id.et_texto);
        grabar=findViewById(R.id.btn_agregar);
        lista=findViewById(R.id.lista);

        list=new ArrayList<String>();
        arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,list);

        grabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre=texto.getText().toString();

                list.add(nombre);
                lista.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });




    }
}