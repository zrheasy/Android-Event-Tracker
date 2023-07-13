package com.zrh.tracker

import android.util.Log

/**
 *
 * @author zrh
 * @date 2023/7/13
 *
 */
class LogcatTrackEngine(private val isDebug: Boolean) : TrackEngine {

    override fun setUserId(uid: String?) {

    }

    override fun setUserProperty(key: String, value: String?) {

    }

    override fun track(event: Event) {
        if (isDebug)
            Log.d("EventTracker", event.toString())
    }
}