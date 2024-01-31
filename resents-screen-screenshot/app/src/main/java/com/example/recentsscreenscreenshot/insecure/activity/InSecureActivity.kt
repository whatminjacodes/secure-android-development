package com.example.recentsscreenscreenshot.insecure.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.recentsscreenscreenshot.ui.theme.RecentsScreenScreenshotTheme

class InSecureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecentsScreenScreenshotTheme() {
                Text(text = "Insecure activity!")
            }
        }
    }
}