package com.chaos.reactive.fragments.ui.views;

import com.chaos.reactive.fragments.Event;

public interface EventView extends BaseView {
    void registerEvent(Event event);
}
