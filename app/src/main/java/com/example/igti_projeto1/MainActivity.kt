package com.example.igti_projeto1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.igti_projeto1.MENSAGEM"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View) {
        Log.i("IGTI", "Método enviarMensagem chamado.")
        val editText = findViewById<EditText>(R.id.edMensagem)
        val mensagem = editText.text.toString()
        val intent = Intent(this, ExibirMensagemActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)
    }
}