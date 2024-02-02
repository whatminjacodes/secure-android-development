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

            // Treats the content of the window as secure, preventing it from appearing
            // in screenshots or from being viewed on non-secure displays
            window.setFlags(
                WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE
            )
       // }
    }
}
