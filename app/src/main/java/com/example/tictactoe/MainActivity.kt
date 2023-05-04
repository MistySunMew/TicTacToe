package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gameText = findViewById<TextView>(R.id.textView)
        var currPlayer = "x"

        val btnA1 = findViewById<Button>(R.id.btnA1)
        btnA1.setOnClickListener() {
            buttonPress(btnA1, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        val btnA2 = findViewById<Button>(R.id.btnA2)
        btnA2.setOnClickListener() {
            buttonPress(btnA2, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        val btnA3 = findViewById<Button>(R.id.btnA3)
        btnA3.setOnClickListener() {
            buttonPress(btnA3, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
         val btnB1 = findViewById<Button>(R.id.btnB1)
        btnB1.setOnClickListener() {
            buttonPress(btnB1, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        val btnB2 = findViewById<Button>(R.id.btnB2)
        btnB2.setOnClickListener() {
            buttonPress(btnB2, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        val btnB3 = findViewById<Button>(R.id.btnB3)
        btnB3.setOnClickListener() {
            buttonPress(btnB3, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        val btnC1 = findViewById<Button>(R.id.btnC1)
        btnC1.setOnClickListener() {
            buttonPress(btnC1, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        val btnC2 = findViewById<Button>(R.id.btnC2)
        btnC2.setOnClickListener() {
            buttonPress(btnC2, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        val btnC3 = findViewById<Button>(R.id.btnC3)
        btnC3.setOnClickListener() {
            buttonPress(btnC3, gameText, currPlayer)
            currPlayer = if (currPlayer == "x") "o" else "x"
        }




        val newGameButton = findViewById<Button>(R.id.new_game)
        newGameButton.setOnClickListener {
            btnA1.text = ""
            btnA2.text = ""
            btnA3.text = ""
            btnB1.text = ""
            btnB2.text = ""
            btnB3.text = ""
            btnC1.text = ""
            btnC2.text = ""
            btnC3.text = ""
            gameText.text = "X's turn"
            currPlayer = "x"
        }
    }

    private fun buttonPress(btn: Button, gameText: TextView, currPlayer: String) {
        if (btn.text == "") {
            if (currPlayer == "x") {
                btn.text = "x"
                gameText.text = "O's turn"
            } else {
                btn.text = "o"
                gameText.text = "X's turn"
            }
        }
    }
}