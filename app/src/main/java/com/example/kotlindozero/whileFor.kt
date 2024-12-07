package com.example.kotlindozero

fun main() {

    //Arrays
    val nomes = arrayOf(
        "henrique", "karen", "Maria "
    )
    println(nomes[2])

    //While
    var numero = 1

    while ( numero in 1..2){

        println("executou $numero")
        numero++
    }

    //For

    for (teste in 1..2){
        println("testeeee $teste")
    }

    val postagens = arrayOf(
        "QUE LUGAR LINDO",
        "QUE MULHER LINDA ESSA MINHA",
        "EU AMO MINHA VO"
    )

    for ( (indice, post) in postagens.withIndex() ){
        println("$indice: $post")
    }

}