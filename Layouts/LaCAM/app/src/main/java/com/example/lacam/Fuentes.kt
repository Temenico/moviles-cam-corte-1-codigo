package com.example.lacam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Fuentes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fuentes)
    }

    fun abrirLogin(view: View) {
        val intent= Intent(this,Login::class.java).apply {  }
        startActivity(intent)
    }
}