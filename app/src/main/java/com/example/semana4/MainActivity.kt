package com.example.semana4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btCalcular = findViewById(R.id.btnCalcular)
        this.btCalcular.setOnClickListener({clickBotao(it)})
    }

    fun clickBotao(view: View){
        val intent = Intent(this, SegundaTela::class.java)
        intent.putExtra("MSG_TESTE", "Cheguei")
        startActivityForResult(intent,1)
    }


}