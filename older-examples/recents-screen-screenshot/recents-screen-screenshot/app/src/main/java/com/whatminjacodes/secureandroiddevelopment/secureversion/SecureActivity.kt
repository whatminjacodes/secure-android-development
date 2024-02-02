package com.whatminjacodes.secureandroiddevelopment.secureversion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.whatminjacodes.secureandroiddevelopment.R

/*
 *      MainActivity
 *      - opens our fragment which has the UI
 */
class SecureActivity : AppCompatActivity(R.layout.activity_secure) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {

            // Adds our fragment
            //supportFragmentManager.commit {
            //    setReorderingAllowed(true)
            //    add<MainFragment>(R.id.fragment_container_view)
           // }
        }
    }
}
