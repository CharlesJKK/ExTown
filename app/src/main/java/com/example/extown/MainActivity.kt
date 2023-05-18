package com.example.extown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.extown.home.HomeActivity

class MainActivity : AppCompatActivity() {

    private var buttonNavigation: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNavigation = findViewById(R.id.buttonNavigation)
        buttonNavigation?.setOnClickListener {
            onNavigationButton()
        }
    }

    private fun onNavigationButton() {
        val goToHomeActivity = Intent(this, HomeActivity::class.java)
        startActivity(goToHomeActivity)
    }
}