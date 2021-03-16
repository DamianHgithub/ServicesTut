package com.example.internetservicestutorial.util

import android.app.Notification
import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import com.example.internetservicestutorial.di.DIManager
import kotlinx.coroutines.*

class TutService: Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Handler(Looper.myLooper()!!).postDelayed({
            Toast.makeText(applicationContext, "show", Toast.LENGTH_SHORT).show()
            stopSelf()
        },5000)

        val mNotification = NotificationCompat.Builder(this, DIManager.channelID)
            .setContentTitle("Siema")
            .setContentText("Desc")
            .build()

        startForeground(1, mNotification)

        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}