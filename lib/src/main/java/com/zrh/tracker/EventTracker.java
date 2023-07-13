package com.zrh.tracker;

/**
 * @author zrh
 * @date 2023/7/13
 */
public class EventTracker {
    private static TrackEngine engine;

    public static void setEngine(TrackEngine engine) {
        EventTracker.engine = engine;
    }

    public static void setUserId(String uid) {
        engine.setUserId(uid);
    }

    public static void setUserProperty(String key, String value) {
        engine.setUserProperty(key, value);
    }

    public static Event build(String name) {
        return new Event(name, engine);
    }
}
