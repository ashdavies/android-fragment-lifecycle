package com.chaos.reactive.fragments.events.ui.factories;

import android.content.Context;

public interface InstanceFactory<T> {
    T instantiate(Context context);
}
