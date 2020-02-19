package com.example.laba1kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondSlideIntent = Intent (this, SecondActivity::class.java)
        val handler = android.os.Handler()

        handler.postDelayed({ /*code*/ }, 2000) //specify the number of milliseconds
        android.os.Handler().postDelayed({
            startActivity(secondSlideIntent)
        }, 2000)
    }

    override fun onRestart() {
        super.onRestart()
        finish()
    }
}
