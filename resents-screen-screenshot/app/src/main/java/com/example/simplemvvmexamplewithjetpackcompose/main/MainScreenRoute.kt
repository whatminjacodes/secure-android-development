package com.example.simplemvvmexamplewithjetpackcompose.main

import androidx.compose.runtime.Composable

@Composable
fun MainScreenRoute(messageFromStart: String) {
    FirstScreen(messageFromStart = messageFromStart)
}