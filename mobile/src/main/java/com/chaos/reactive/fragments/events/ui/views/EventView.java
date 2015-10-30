package com.chaos.reactive.fragments.events.ui.views;

import com.chaos.reactive.fragments.events.Event;

public interface EventView extends BaseView {
    void registerEvent(Event event);
}
