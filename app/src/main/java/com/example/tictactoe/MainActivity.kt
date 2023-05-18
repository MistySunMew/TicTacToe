package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var numTurns = 0
    private var currPlayer = "x"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gameText = findViewById<TextView>(R.id.textView)



        val btnA1 = findViewById<Button>(R.id.btnA1)
        val btnA2 = findViewById<Button>(R.id.btnA2)
        val btnA3 = findViewById<Button>(R.id.btnA3)
        val btnB1 = findViewById<Button>(R.id.btnB1)
        val btnB2 = findViewById<Button>(R.id.btnB2)
        val btnB3 = findViewById<Button>(R.id.btnB3)
        val btnC1 = findViewById<Button>(R.id.btnC1)
        val btnC2 = findViewById<Button>(R.id.btnC2)
        val btnC3 = findViewById<Button>(R.id.btnC3)
        btnA1.setOnClickListener() {
            buttonPress(btnA1, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnA2.setOnClickListener() {
            buttonPress(btnA2, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnA3.setOnClickListener() {
            buttonPress(btnA3, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnB1.setOnClickListener() {
            buttonPress(btnB1, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnB2.setOnClickListener() {
            buttonPress(btnB2, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnB3.setOnClickListener() {
            buttonPress(btnB3, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnC1.setOnClickListener() {
            buttonPress(btnC1, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnC2.setOnClickListener() {
            buttonPress(btnC2, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
        }

        btnC3.setOnClickListener() {
            buttonPress(btnC3, gameText)
            checkWin(gameText, btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3)
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
            gameText.text = "Player X's turn"
            currPlayer = "x"
            numTurns = 0
        }
    }

    private fun buttonPress(btn: Button, gameText: TextView,) {
        if (btn.text == "") {
            numTurns++
            if (currPlayer == "x") {
                btn.text = "x"
                gameText.text = "Player O's turn"
            } else {
                btn.text = "o"
                gameText.text = "Player X's turn"
            }
            currPlayer = if (currPlayer == "x") "o" else "x"
        }
        if (numTurns == 9) {
            gameText.text = "It's a tie!"
        }
    }

    private fun checkWin(gameText: TextView, btnA1: Button, btnA2: Button, btnA3: Button, btnB1: Button, btnB2: Button, btnB3: Button, btnC1: Button, btnC2: Button, btnC3: Button) {
        currPlayer = if (currPlayer == "x") "o" else "x"
        if (btnA1.text == currPlayer && btnA2.text == currPlayer && btnA3.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        else if (btnB1.text == currPlayer && btnB2.text == currPlayer && btnB3.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        else if (btnC1.text == currPlayer && btnC2.text == currPlayer && btnC3.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        else if (btnA1.text == currPlayer && btnB1.text == currPlayer && btnC1.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        else if (btnA2.text == currPlayer && btnB2.text == currPlayer && btnC2.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        else if (btnA3.text == currPlayer && btnB3.text == currPlayer && btnC3.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        else if (btnA1.text == currPlayer && btnB2.text == currPlayer && btnC3.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        else if (btnA3.text == currPlayer && btnB2.text == currPlayer && btnC1.text == currPlayer) {
            gameText.text = "Player ${currPlayer.uppercase()} wins!"
        }
        currPlayer = if (currPlayer == "x") "o" else "x"
    }
}