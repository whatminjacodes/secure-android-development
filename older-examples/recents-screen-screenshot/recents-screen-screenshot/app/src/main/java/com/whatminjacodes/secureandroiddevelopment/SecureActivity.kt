package com.whatminjacodes.secureandroiddevelopment

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

/*
 *      SecureActivity
 *      - shows an example of a secure activity that prevents the system taking
 *        a screenshot of the view when the app is minimized
 */
class SecureActivity : AppCompatActivity(R.layout.activity_secure) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Check if Android 13 or newer
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            // If Android 13 or newer
            setRecentsScreenshotEnabled(false)
        } else {*/
            // Earlier versions
            window.setFlags(
                WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE
            )
       // }
    }
}
