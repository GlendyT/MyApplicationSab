package com.example.myapplicationsab

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class VehiculosActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nombre = intent.getStringExtra( "nombre") ?: "Usuario"
        val lblBienvenida = findViewById<TextView>(R.id.lblBienvenida)
        lblBienvenida.text = "Bienvenido, $nombre"

        setContentView(R.layout.activity_vehiculos)
    }
}
