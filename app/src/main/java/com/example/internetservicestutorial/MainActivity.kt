package com.example.internetservicestutorial

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.internetservicestutorial.di.DIManager
import com.example.internetservicestutorial.util.TutService
import org.koin.dsl.module

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, TutService::class.java)
        intent.putExtra("testString", "siema")

        startService(intent)
    }
}