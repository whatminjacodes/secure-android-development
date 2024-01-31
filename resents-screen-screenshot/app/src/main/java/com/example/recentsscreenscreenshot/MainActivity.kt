package com.example.recentsscreenscreenshot

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recentsscreenscreenshot.insecure.InSecureActivity
import com.example.recentsscreenscreenshot.secure.SecureActivity
import com.example.recentsscreenscreenshot.ui.theme.Purple40
import com.example.recentsscreenscreenshot.ui.theme.RecentsScreenScreenshotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
                            text = "Main Screen",
                            style = TextStyle(
                                fontSize = 28.sp,
                                color = Purple40,
                                fontWeight = FontWeight.W700
                            )
                        )
                        Text(
                            "This is the main screen that will contain navigation to secure and insecure examples of the application.",
                            style = TextStyle(
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ),
                            modifier = Modifier.padding(30.dp)
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            "Click the button below to open insecure activity.",
                            style = TextStyle(
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ),
                            modifier = Modifier.padding(30.dp)
                        )

                        OutlinedButton(
                            onClick = { startInsecureActivity() },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2EDC83),),
                            border = BorderStroke(1.dp, color = Color.Black)
                        ) {
                            Text(text = "Open insecure activity")
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            "Click the button below to open secure activity.",
                            style = TextStyle(
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ),
                            modifier = Modifier.padding(30.dp)
                        )

                        OutlinedButton(
                            onClick = { startSecureActivity() },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2EDC83),),
                            border = BorderStroke(1.dp, color = Color.Black)
                        ) {
                            Text(text = "Open secure activity")
                        }

                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }
            }
        }
    }

    private fun startInsecureActivity() {
        val intent = Intent(this, InSecureActivity::class.java)
        startActivity(intent)
    }

    private fun startSecureActivity() {
        val intent = Intent(this, SecureActivity::class.java)
        startActivity(intent)
    }
}