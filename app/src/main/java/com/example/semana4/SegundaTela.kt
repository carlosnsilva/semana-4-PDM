package com.example.semana4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semana4.Pessoa

class SegundaTela : AppCompatActivity() {

    private lateinit var pessoa: Pessoa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        this.pessoa = (Pessoa) getIntent.getSerializable("objetoPessoa")
    }



}