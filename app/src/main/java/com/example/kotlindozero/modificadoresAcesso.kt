package com.example.kotlindozero

open class car{

//    val modelo = "BMW"

    protected open fun combustivel(){
        println("combustivel")
    }

    fun acelerar(){
        combustivel()
        println("acelerar")
    }
}

class Gol: car(){
    override fun combustivel() = Unit
}

fun main() {

    val gol = Gol()
    gol.acelerar()

}