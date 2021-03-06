package com.example.semana4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.semana4.Pessoa

class SegundaTela : AppCompatActivity() {

    private lateinit var pessoa: Pessoa
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        this.pessoa = getIntent().getExtras()!!.getSerializable("objetoPessoa") as Pessoa
        this.tvResult = findViewById(R.id.resultado)

        tvResult.setText(pessoa.nome + ", você possui " + pessoa.idade().toString() + " anos!")



    }



}
