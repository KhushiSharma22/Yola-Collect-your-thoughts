package com.example.yola_notes

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    lateinit var handler : Handler
    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        imageView = findViewById(R.id.imageView)
        handler = Handler()

        val intent = Intent(applicationContext, MainActivity::class.java)

        handler.postDelayed({
            startActivity(intent)
            finish()
        },2000)
    }
}