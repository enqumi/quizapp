package com.example.quizone

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeMessage: TextView
    private lateinit var startButton: Button

     fun onCreate(savedInstanceState: Bundle?, QuizActivity: kotlin.Any) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        welcomeMessage = findViewById(R.id.welcome_message)
        startButton = findViewById(R.id.start_button)


        startButton.setOnClickListener {

            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}
