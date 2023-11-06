package com.taghavi

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Hello Ktor", ContentType.Text.Plain)
        }

        post("/") {
            val post = call.receive<String>()
            call.respondText("Received \"$post\" from the post body", ContentType.Text.Plain)
        }

        get("/users") {
            call.respondText(userData)
        }
    }
}

private val userData = "{ \"users\": [\"Nate\", \"Megan\", \"John\"] }"