package com.example.primerpasokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alumno=Alumno()
        btn_saludar.setOnClickListener(View.OnClickListener {
            alumno.nombre=et_nombre.text.toString()
            tv_saludar.text="te llamas "+alumno.nombre
        })
    }
}