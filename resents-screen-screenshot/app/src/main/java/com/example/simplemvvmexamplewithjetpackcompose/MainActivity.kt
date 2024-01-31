package com.example.simplemvvmexamplewithjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.simplemvvmexamplewithjetpackcompose.ui.theme.SimpleMVVMExampleWithJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleMVVMExampleWithJetpackComposeTheme {
                NavGraph()
            }
        }
    }
}