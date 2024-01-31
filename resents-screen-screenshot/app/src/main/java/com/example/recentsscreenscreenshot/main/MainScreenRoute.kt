package com.example.recentsscreenscreenshot.main

import androidx.compose.runtime.Composable

@Composable
fun MainScreenRoute(
    OnOpenAppClicked :() -> Unit
){
    MainScreen(OnOpenAppClick = OnOpenAppClicked)
}