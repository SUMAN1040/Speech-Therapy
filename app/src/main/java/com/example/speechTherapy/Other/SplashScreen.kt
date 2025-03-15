/*
 * Developed By Suman Kumar Dey
 * Linkedln: www.linkedin.com/in/suman1040
 */

package com.example.speechTherapy.Other

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.speechTherapy.MainActivity
import com.example.speechTherapy.R

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)


        //full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        //media player
        val mediaPlayer = MediaPlayer.create(this, R.raw.welcome)
        mediaPlayer.start()


        //splash screen with time delays
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}