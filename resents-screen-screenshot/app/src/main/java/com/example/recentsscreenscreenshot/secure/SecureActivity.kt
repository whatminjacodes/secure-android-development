package com.example.recentsscreenscreenshot.secure

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recentsscreenscreenshot.ui.theme.Purple40
import com.example.recentsscreenscreenshot.ui.theme.RecentsScreenScreenshotTheme

class SecureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Check if Android 13 or newer
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            // If Android 13 or newer
            setRecentsScreenshotEnabled(false)
        } else {
            // Earlier versions
            window.setFlags(
                WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE
            )
        }

        setContent {
            RecentsScreenScreenshotTheme() {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            text = "Secure Activity Screen",
                            style = TextStyle(
                                fontSize = 28.sp,
                                color = Purple40,
                                fontWeight = FontWeight.W700
                            )
                        )
                        Text(
                            "This is the secure activity that can't be captured by Android system to be shown on Recents screen.",
                            style = TextStyle(
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ),
                            modifier = Modifier.padding(30.dp)
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            "Here could be some sensitive data visible, such as names, addresses or other identifiers.",
                            style = TextStyle(
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ),
                            modifier = Modifier.padding(30.dp)
                        )

                    }
                }
            }
        }
    }

    /*override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            //window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE)
        } else {
            window.addFlags(WindowManager.LayoutParams.FLAG_SECURE)
        }
    }*/
}