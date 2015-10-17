package com.chaos.reactive.ui.adapters;

import android.support.annotation.UiThread;

import java.util.Collection;

public interface ListAdapter<T> {

    @UiThread
    void add(T item);

    @UiThread
    void addAll(Collection<T> items);

    @UiThread
    void clear();
}
