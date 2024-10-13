package com.example.adminmealzap

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)

        // Use Handler to delay transition to the LogInActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent) // Start the LogInActivity
            finish() // Close the splash screen so the user can't navigate back to it
        }, 3000) // Delay for 3000 milliseconds (3 seconds)
    }
}
