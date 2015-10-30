package com.chaos.reactive.fragments.events.presenters;

import android.support.v4.app.Fragment;

import com.chaos.reactive.fragments.events.Event;
import com.chaos.reactive.fragments.events.ui.fragments.EventFragment;
import com.chaos.reactive.fragments.events.ui.views.FragmentEventView;
import com.chaos.reactive.fragments.events.utils.DefaultObserver;

import java.util.List;

public class ActivityMainPresenter extends DefaultObserver<Event> implements ActivityPresenter {
    private final FragmentEventView view;

    protected ActivityMainPresenter(FragmentEventView view) {
        this.view = view;
    }

    public static ActivityMainPresenter create(FragmentEventView view) {
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

    public void addFragment() {
        EventFragment fragment = new EventFragment();
        fragment.setView(view);

        view.addFragment(fragment);
    }

    public void removeFragment() {
        List<Fragment> fragments = view.getFragments();
        if (fragments.size() > 0) {
            view.removeFragment(fragments.get(0));
        }
    }
}
