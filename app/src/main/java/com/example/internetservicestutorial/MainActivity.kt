package com.example.internetservicestutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.internetservicestutorial.di.DIManager
import com.example.internetservicestutorial.util.TutService
import org.koin.dsl.module

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, TutService::class.java)
        intent.putExtra("testString", "siema")

        startService(intent)
    }
}