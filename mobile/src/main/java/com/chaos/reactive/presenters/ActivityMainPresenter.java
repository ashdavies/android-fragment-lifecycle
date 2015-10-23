package com.chaos.reactive.presenters;

import android.support.v4.app.Fragment;

import com.chaos.reactive.events.Event;
import com.chaos.reactive.ui.fragments.DefaultFragment;
import com.chaos.reactive.ui.views.BaseView;
import com.chaos.reactive.ui.views.FragmentView;
import com.chaos.reactive.utils.DefaultObserver;

import java.util.List;

public class ActivityMainPresenter extends DefaultObserver<Event> implements ActivityPresenter {
    private final FragmentView view;

    protected ActivityMainPresenter(FragmentView view) {
        this.view = view;
    }

    public static ActivityMainPresenter create(FragmentView view) {
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
        view.addFragment(new DefaultFragment());
    }

    public void removeFragment() {
        List<Fragment> fragments = view.getFragments();
        if (fragments.size() > 0) {
            view.removeFragment(fragments.get(0));
        }
    }
}
