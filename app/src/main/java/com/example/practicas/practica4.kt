package com.example.practicas

fun main(){
    val edad : Int = 10
    println("Tu edad es: $edad")

    if(edad < 18){
        println("No puedes consumir")
    }else if(edad >= 18 && edad < 40){
        println("Ya con moderacion")
    }else if(edad < 60){
        println("Cuida tu salud")
    }else if (edad < 15){
        println("Estas muy joven para tomar")
    }

}