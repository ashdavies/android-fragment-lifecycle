package com.chaos.reactive.fragments.ui.views;

import android.support.annotation.UiThread;

import java.util.Collection;

public interface ListingsView<T> extends BaseView {

    @UiThread
    void add(T item);

    @UiThread
    void add(int index, T item);

    @UiThread
    void addAll(Collection<T> items);

    @UiThread
    void clear();
}
