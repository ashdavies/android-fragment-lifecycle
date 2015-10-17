package com.chaos.reactive.events;

public class Event {
    private final String source;
    private final String name;

    public Event(String source, String name) {
        this.source = source;
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public String getName() {
        return name;
    }
}
