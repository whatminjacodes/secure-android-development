package com.whatminjacodes.secureandroiddevelopment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/*
 *      InsecureActivity
 *      - shows an example of an insecure activity that does not prevent the system to take
 *        a screenshot of the view when the app is minimized
 */
class InsecureActivity : AppCompatActivity(R.layout.activity_insecure) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
