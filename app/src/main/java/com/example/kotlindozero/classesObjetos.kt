package com.example.kotlindozero
//Abstração
//Pessoa: Cpf, nome, Endereço
//Cachorro: nome, porte, peso, raça

class jogador{

    var kart        = ""
    var planador    = ""
    var pneu        = ""

    fun acelerar(aceleracao: Int = 0){
        println("acelerar na velocidade: $aceleracao")
    }

    fun retornaPoder(): String = "cascoPoder"

}

fun main() {

    val jogador  = jogador()
    jogador.kart = "kart do mario"
    jogador.acelerar(aceleracao = 70)
    val poder = jogador.retornaPoder()
    println(poder)
    println(jogador.kart)

}
