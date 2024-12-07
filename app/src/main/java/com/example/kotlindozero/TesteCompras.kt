package com.example.kotlindozero
// Aprendendo If, else e else if em Kotlin
fun main() {

    val idade = 18
    val compra = 122
    val descontoC = compra >= 199
    val descontoI = idade >= 20

    if ( descontoI ){
        println("idade maior do que 20")
    }else if ( descontoC ){
        println("compra superior a 199")
    }else{
        println("voce nao cumpriu os requisitos do desconto")
    }

}

