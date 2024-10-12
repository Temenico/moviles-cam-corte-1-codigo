package com.example.lacam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*val btn: Button = findViewById(R.id.btnIngreso)
        btn.setOnClickListener {
            val intent: Intent = Intent (this, Login::class.java)
            startActivity(intent)
        }*/

    }

    fun abrirFuentes(view: View) {
        val intent=Intent(this,Fuentes::class.java).apply {  }
        startActivity(intent)
    }

    fun abrirAnimales(view: View) {
        val intent=Intent(this,Animales::class.java).apply {  }
        startActivity(intent)
    }

    fun abrirLogin(view: View) {
        val intent=Intent(this,Login::class.java).apply {  }
        startActivity(intent)
    }




}