package com.zrh.tracker

import android.app.Application

/**
 *
 * @author zrh
 * @date 2023/7/13
 *
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        EventTracker.setEngine(LogcatTrackEngine(true))
        EventTracker.setUserId("007")
        EventTracker.setUserProperty("sex", "boy")
    }
}