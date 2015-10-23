package com.chaos.reactive.ui.views;

import com.chaos.reactive.events.Event;

public interface EventView extends BaseView {
    void registerEvent(Event event);
}
