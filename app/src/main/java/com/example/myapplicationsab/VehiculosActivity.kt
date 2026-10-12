package com.example.myapplicationsab

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class VehiculosActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehiculos)

        val nombre = intent.getStringExtra("nombre") ?: "Usuario"
        val lblBienvenida = findViewById<TextView>(R.id.lblBienvenida)
        lblBienvenida.text = "Bienvenido, $nombre"

        val btnmostrar = findViewById<Button>(R.id.btnSaludar)
        val lblResultado = findViewById<TextView>(R.id.lblResultado)
        btnmostrar.setOnClickListener {
            lblResultado.text = "Fin de la practica"
        }
    }
}
