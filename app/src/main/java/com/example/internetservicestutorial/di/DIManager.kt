package com.example.internetservicestutorial.di

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DIManager: Application() {
    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val mChannel = NotificationChannel(channelID, "NotificationChannel", NotificationManager.IMPORTANCE_DEFAULT)
            val mManager = getSystemService(NotificationManager::class.java) as NotificationManager
            mManager.createNotificationChannel(mChannel)
        }
        startKoin {
            androidContext(this@DIManager)
            modules(listOf(

            ))
        }
    }
    companion object {
        const val channelID = "NotificationChannel"
    }
}