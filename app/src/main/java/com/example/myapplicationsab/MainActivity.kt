package com.example.myapplicationsab

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.content.Intent

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


            val intent = Intent(this, VehiculosActivity::class.java)
            intent.putExtra( "nombre" ,  nombre)
            startActivity(intent)
        }
    }
}
