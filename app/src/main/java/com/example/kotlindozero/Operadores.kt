package com.example.kotlindozero

fun main() {
    val n1 = 10
    val n2 = 20
    val resultado = n1 + n2 //soma
    val resultadoSub = n1 - n2 //subtração
    val resultadoDiv = n2 / n1 //divisão
    val resultadoMult = n1 * n2 //multiplicação
    val resultadoSob = n1 % n2 //sobra da divisão

    val resultadoIgual = n1 == n2 //Igual
    val resultadoDiferente = n1 != n2 // diferente
    val resultadoMaior = n1 > n2 // maior
    val resultadoMenor = n1 < n2 // menor
    val resultadoMaiorIgual = n1 >= n2 //maior ou igual
    val resultadoMenorIgual = n1 <= n2 // menor ou igual

    val resultadoOu = true || true // seria equivalente ao OU, um ou outro ser verdadeiro
    val resultadoE = true && true // seria equivalente a os 2 serem iguais
    val resultadoNegativo = true && true // negação na visualição do resultado tem um ! ele inverte a respota

    println(resultado)
    println(resultadoSub)
    println(resultadoDiv)
    println(resultadoMult)
    println(resultadoSob)

    println(resultadoIgual)
    println(resultadoDiferente)
    println(resultadoMaior)
    println(resultadoMenor)
    println(resultadoMaiorIgual)
    println(resultadoMenorIgual)

    println(resultadoOu)
    println(resultadoE)
    println(!resultadoNegativo) //apenas adicionar o ! ele inverte a resposta tanto do && tanto do ||

}