package com.taghavi

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.root() {
    get("/") {
        call.respondText("Hello Ktor", ContentType.Text.Plain)
    }
}

fun Routing.rootPost() {
    post("/") {
        val post = call.receive<String>()
        call.respondText("Received \"$post\" from the post body", ContentType.Text.Plain)
    }
}