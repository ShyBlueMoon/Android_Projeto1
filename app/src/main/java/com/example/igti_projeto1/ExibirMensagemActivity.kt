package com.example.igti_projeto1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExibirMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exibir_mensagem)

        val mensagem = intent.getStringExtra(EXTRA_MESSAGE)

        val textview = findViewById<TextView>(R.id.textViewMensagem).apply {
            text = mensagem
        }
    }
}