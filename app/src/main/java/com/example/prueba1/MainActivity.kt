package com.example.prueba1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_Enviar.setOnClickListener {
            //Le decimos que pasamos de una pagina a otra
            val intent = Intent(this@MainActivity, Page2::class.java)
            //almacenamos el dato
            var dato :String = ediText_DatosDeUsuario.text.toString()
            //Creamos el bundle
            val b : Bundle = Bundle()
            b.putString("dt", dato)
            intent.putExtras(b)
            startActivity(intent)
        }
        ediText_DatosDeUsuario

    }
}
