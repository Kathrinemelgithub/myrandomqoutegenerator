
package com.example.myrandomqoutegenerator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import com.example.myrandomqoutegenerator.R.*
import com.example.myrandomqoutegenerator.R.id.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    // Array of sample quotes
    private val quotes = arrayOf(
        "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
        "The way to get started is to quit talking and begin doing. - Walt Disney",
        "Your time is limited, don't waste it living someone else's life. - Steve Jobs",
        "If life were predictable it would cease to be life, and be without flavor. - Eleanor Roosevelt",
        "Life is what happens when you're busy making other plans. - John Lennon"
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val quoteTextView
        = findViewById<TextView>(


            /* id = */ quoteTextView
        )
        val generateButton: Button = findViewById(generateButton)

        generateButton.setOnClickListener {
            // Generate a random index within the range of the quotes array
            val randomIndex = Random.nextInt(0, quotes.size)
            // Set a random quote to the TextView
            quoteTextView.text = quotes[randomIndex]
        }
    }
}
