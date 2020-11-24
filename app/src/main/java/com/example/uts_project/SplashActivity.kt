package com.example.uts_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_project.MainActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // langsung pindah ke MainActivity atau activity lain
        // begitu memasuki splash screen ini
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}