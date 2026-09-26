package com.example.androidsdkexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val message = TextView(this).apply {
            text = "Hello Android!\n\nSDK + Gradle + JDK project พร้อมใช้งาน"
            textSize = 20f
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
            setPadding(32, 32, 32, 32)
        }

        setContentView(message)
    }
}
