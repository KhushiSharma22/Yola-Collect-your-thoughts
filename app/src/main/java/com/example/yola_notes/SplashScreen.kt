package com.example.yola_notes

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
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

        val fadein = AnimationUtils.loadAnimation(this,R.anim.fadein)
        imageView.startAnimation(fadein)

        val intent = Intent(applicationContext, MainActivity::class.java)

        handler.postDelayed({
            startActivity(intent)
            finish()
        },2000)
    }
}