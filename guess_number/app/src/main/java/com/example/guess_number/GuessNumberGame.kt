package com.example.guess_number

import java.util.*

class GuessNumberGame {
    private var secret: Int = Random().nextInt(100) + 1
    private var minNum = 1
    private var maxNum = 100

    fun guess(guess: Int): String {
        return when {
            guess == secret -> "猜對了！"
            guess > secret -> {
                maxNum = guess - 1
                "太大了 !區間：$minNum ~ $maxNum"
            }
            else -> {
                minNum = guess + 1
                "太小了 !區間：$minNum ~ $maxNum"
            }
        }
    }

    fun reset() {
        secret = Random().nextInt(100) + 1
        minNum = 1
        maxNum = 100
    }
}
