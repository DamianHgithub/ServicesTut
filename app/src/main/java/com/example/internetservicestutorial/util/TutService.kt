package com.example.internetservicestutorial.util

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class TutService: Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("DEBUG", intent!!.getStringExtra("testString")!!)
        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}