package com.kutman.midterm2_dalievazim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<ImageView>(R.id.leftarrow)

        textView.setOnClickListener{
            startActivity(Intent(this,ActivityReview::class.java))
        }

    }
}