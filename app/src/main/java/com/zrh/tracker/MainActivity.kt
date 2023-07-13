package com.zrh.tracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zrh.tracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnLogin.setOnClickListener {
            EventTracker.build("Login").with("userName", "qwer@gmail.com").track()
        }

        binding.btnLogout.setOnClickListener {
            EventTracker.build("Logout").with("userName", "qwer@gmail.com").track()
        }
    }
}