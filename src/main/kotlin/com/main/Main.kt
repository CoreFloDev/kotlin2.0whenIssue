package com.main

import com.example.Test

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()} ${bug(Test.UI.A)}")
}

fun bug(test: Test.UI) : String =
    when (test) {
        Test.UI.A -> "a"
        Test.UI.B -> "b"
    }



