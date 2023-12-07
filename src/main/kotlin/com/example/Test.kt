package com.example

sealed interface Test {
    sealed interface UI: Test {
        data object A : UI
        data object B : UI
    }
}