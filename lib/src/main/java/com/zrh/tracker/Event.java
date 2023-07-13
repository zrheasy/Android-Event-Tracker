package com.zrh.tracker;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zrh
 * @date 2023/7/13
 */
public class Event {
    private final String name;
    private final TrackEngine engine;
    private final Map<String, Object> props = new LinkedHashMap<>();

    public Event(String name, TrackEngine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getProps() {
        return props;
    }

    public Event with(String key, String value) {
        props.put(key, value);
        return this;
    }

    public Event with(String key, int value) {
        props.put(key, value);
        return this;
    }

    public Event with(String key, long value) {
        props.put(key, value);
        return this;
    }

    public Event with(String key, boolean value) {
        props.put(key, value);
        return this;
    }

    public Event with(String key, double value) {
        props.put(key, value);
        return this;
    }

    public Event with(String key, float value) {
        props.put(key, value);
        return this;
    }

    public void track() {
        engine.track(this);
    }
}
