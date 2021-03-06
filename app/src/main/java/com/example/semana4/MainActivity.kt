package com.example.semana4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.semana4.Pessoa


class MainActivity : AppCompatActivity() {

    private lateinit var btCalcular: Button
    private lateinit var nome: EditText
    private  lateinit var ano: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btCalcular = findViewById(R.id.btnCalcular)
        this.nome = findViewById(R.id.campoNome)
        this.ano = findViewById(R.id.campoAno)

        this.btCalcular.setOnClickListener({clickBotao(it)})
    }

    fun clickBotao(view: View){
        var name = this.nome.getText().toString()
        var age = this.ano.getText().toString()

        val person = Pessoa(name, Integer.parseInt(this.ano.getText().toString()))

        val intent = Intent(this, SegundaTela::class.java)
        intent.putExtra("objetoPessoa", person)
        startActivityForResult(intent,1)
    }


}