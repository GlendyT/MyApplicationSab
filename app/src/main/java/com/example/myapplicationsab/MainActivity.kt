package com.example.myapplicationsab

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Mostrar la pantalla definida en XML.
        setContentView(R.layout.activity_main)

        // Conectar las variables con los componentes.
        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val lblSaludo = findViewById<TextView>(R.id.lblSaludo)

        // Acción al presionar el botón.
        btnSaludar.setOnClickListener {
            val nombre = txtNombre.text.toString().trim()

            if (nombre.isEmpty()) {
                lblSaludo.text = "Ingrese su nombre"
            } else {
                lblSaludo.text = "Hola, $nombre"
            }
        }
    }
}
