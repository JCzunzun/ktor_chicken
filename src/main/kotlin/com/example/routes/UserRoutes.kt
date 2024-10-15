package com.example.routes

import com.example.models.User
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private val users = mutableListOf(
    User(1,"juan",18),
    User(2,"pedro", 24)

)

fun Route.userRouting(){
    route("user"){
        get {
            if(users.isNotEmpty()){
                call.respond(users)
            }else{
                call.respondText("No hay usuarios", status = HttpStatusCode.OK)
            }
        }
    }
}