package com.example.kotlindozero

class UsuarioC constructor(
    var nome: String = "",
    var sobrenome: String = ""
){

    init {
        println("objeto selecionado")
        println("nome: $nome $sobrenome")
    }

    constructor(nome: String): this(nome, ""){
        println("construtor secondarily")
    }

}

fun main() {

        val usuario = UsuarioC("Henrique")

}