package com.dc.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {

        const val TOKEN = "PUo8cegr1CT2P0D2" // 令牌值

        lateinit var context: Context
    }


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}