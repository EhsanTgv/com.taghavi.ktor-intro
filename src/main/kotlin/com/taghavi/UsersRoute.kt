package com.taghavi

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.users(){
    get("/users") {
        call.respondText(userData)
    }
}

private const val userData = "{ \"users\": [\"Nate\", \"Megan\", \"John\"] }"