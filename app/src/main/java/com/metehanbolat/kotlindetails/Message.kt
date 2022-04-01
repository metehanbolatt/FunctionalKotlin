package com.metehanbolat.kotlindetails

data class Message(
    val sender: String,
    val body: String,
    val isRead: Boolean = false
)

val messages = listOf(
    Message("Ma", "Hey! Where are you?"),
    Message("Adam", "Everything going according to play today?"),
    Message("Ma", "Please reply. I've lost you!")
)
