package com.example.internetservicestutorial.util

import android.app.Notification
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.example.internetservicestutorial.di.DIManager

class TutService: Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("DEBUG", intent!!.getStringExtra("testString")!!)

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