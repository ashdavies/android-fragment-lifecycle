package com.chaos.reactive.fragments.events;

public class Event {
    private final String source;
    private final String name;

    private Event(String source, String name) {
        this.source = source;
        this.name = name;
    }

    public static Event create(String source, String name) {
        return new Event(source, name);
    }

    public String getSource() {
        return source;
    }

    public String getName() {
        return name;
    }
}
