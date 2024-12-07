package com.example.kotlindozero

fun main() {

    //em If, else e else if

    val opcao = 53
    if ( opcao == 1){
        println("Direcionando para um atendente")
    }else if ( opcao == 2){
        println("voce ganhou um CARRO")
    }else if ( opcao == 3){
        println("voce e um cara legal")
    }else if ( opcao == 4){
        println("voce seguiu meu amorzinho? BABACA")
    }else{
        println("nenhum opcao selecionada")
    }

    //Em when

    val op = 6

    when(op){
        1 -> println("Direcionando para um atendente")
        2 -> println("voce ganhou um CARRO")
        3 -> println("voce e um cara legal")
        in 4..7 -> println("voce seguiu meu amorzinho? BABACA")
        else -> println("nenhum opcao selecionada")
    }

}