package com.chaos.reactive.presenters;

import android.support.v4.app.Fragment;

import com.chaos.reactive.events.Event;
import com.chaos.reactive.ui.fragments.DefaultFragment;
import com.chaos.reactive.ui.fragments.EventFragment;
import com.chaos.reactive.ui.views.FragmentEventView;
import com.chaos.reactive.utils.DefaultObserver;

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

        view.addFragment(new DefaultFragment());
    }

    public void removeFragment() {
        List<Fragment> fragments = view.getFragments();
        if (fragments.size() > 0) {
            view.removeFragment(fragments.get(0));
        }
    }
}
