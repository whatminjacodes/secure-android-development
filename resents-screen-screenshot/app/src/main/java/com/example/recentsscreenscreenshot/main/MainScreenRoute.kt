package com.example.recentsscreenscreenshot.main

import androidx.compose.runtime.Composable

@Composable
fun MainScreenRoute(
    OnOpenInsecureActivityClicked :() -> Unit
){
    MainScreen(OnOpenInsecureActivityClick = OnOpenInsecureActivityClicked)
}