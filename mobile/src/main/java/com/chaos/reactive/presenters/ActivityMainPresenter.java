package com.chaos.reactive.presenters;

import com.chaos.reactive.events.Event;
import com.chaos.reactive.ui.views.BaseView;
import com.chaos.reactive.utils.DefaultObserver;

public class ActivityMainPresenter extends DefaultObserver<Event> implements ActivityPresenter {
    private final BaseView view;

    protected ActivityMainPresenter(BaseView view) {
        this.view = view;
    }

    public static ActivityMainPresenter create(BaseView view) {
        return new ActivityMainPresenter(view);
    }

    @Override
    public void onCreate() {
        // Unused
    }

    @Override
    public void onStart() {
        // Unused
    }

    @Override
    public void onStop() {
        // Unused
    }

    @Override
    public void onDestroy() {
        // Unused
    }
}
