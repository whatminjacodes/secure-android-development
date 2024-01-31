package com.example.recentsscreenscreenshot.start

import androidx.compose.runtime.Composable

@Composable
fun StartScreenRoute(
    OnOpenAppClicked :() -> Unit
){
    StartScreen(OnOpenAppClick = OnOpenAppClicked)
}