package com.oscarcode10.activieskotlin
class User(var name: String, var email: String, var pswd: String) {

    fun show(){
        println("Usuario $name")
    }

    fun login(){
        if(email=="osca@a.a" && pswd=="123"){
            println("Puede ingresar")
        } else{
            println("No puede ingresar")
        }
    }
}