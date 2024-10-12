package com.example.lacam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun abrirMain(view: View){
        val intent=Intent(this, MainActivity::class.java).apply {  }
        startActivity(intent)
    }
}