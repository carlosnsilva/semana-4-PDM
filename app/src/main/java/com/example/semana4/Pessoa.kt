package com.example.semana4

import java.io.Serializable


class Pessoa : Serializable{
    lateinit var nome: String
    var ano:Int = 0

    constructor(nome: String, ano:Int){
        this.nome = nome
        this.ano = ano
    }

    fun idade():Int{
        return 2021 - this.ano
    }

}