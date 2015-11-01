package com.chaos.reactive.fragments.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private final List<String> list;

    public Dictionary() {
        this(new ArrayList<String>());
    }

    public Dictionary(List<String> map) {
        this.list = map;
    }

    public String get(int location) {
        return list.get(location);
    }

    public String getRandom() {
        int index = new Random().nextInt(size());
        return get(index);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void put(String value) {
        list.add(value);
    }

    public void remove(String key) {
        list.remove(key);
    }

    public int size() {
        return list.size();
    }
}
