package com.metehanbolat.kotlindetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frequentSender = messages
            .groupBy(Message::sender)
            .maxByOrNull { (_, messages) -> messages.size }
            ?.key
        println(frequentSender)

        val senders = messages
            .asSequence()
            .filter { it.body.isNotBlank() && !it.isRead }
            .map(Message::sender)
            .distinct()
            .sorted()
            .toList()
        println(senders)
    }
}