package com.example.kotlindozero

class usuarioK {
    //Propriedades

    fun logar(email: String, senha: String){
        println("Usuario logado com email: $email e senha: $senha")
    }

    fun logar(Telefone: String){
        println("Usuario logado com numero de Telefone: $Telefone")
    }

}

fun main() {

    val usuario = usuarioK()
    usuario.logar("henrique@gmail.com", "Lindo 1234")
    usuario.logar("1198293283928")

}