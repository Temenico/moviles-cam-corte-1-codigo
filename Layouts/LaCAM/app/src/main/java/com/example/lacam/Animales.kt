package com.example.lacam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Animales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animales)
    }

    fun abrirLogin(view: View) {
        val intent= Intent(this,Login::class.java).apply {  }
        startActivity(intent)
    }
}