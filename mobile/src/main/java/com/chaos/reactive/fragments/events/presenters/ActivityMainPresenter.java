package com.chaos.reactive.fragments.events.presenters;

import android.support.v4.app.Fragment;

import com.chaos.reactive.fragments.events.Event;
import com.chaos.reactive.fragments.events.providers.Provides;
import com.chaos.reactive.fragments.events.ui.fragments.EventFragment;
import com.chaos.reactive.fragments.events.ui.views.FragmentEventView;
import com.chaos.reactive.fragments.events.utils.DefaultObserver;
import com.chaos.reactive.fragments.events.utils.Dictionary;

import java.util.List;

public class ActivityMainPresenter extends DefaultObserver<Event> implements ActivityPresenter {
    private final Dictionary dictionary;
    private final FragmentEventView view;

    protected ActivityMainPresenter(Dictionary dictionary, FragmentEventView view) {
        this.dictionary = dictionary;
        this.view = view;
    }

    public static ActivityMainPresenter create(Provides<Dictionary> provider, FragmentEventView view) {
        Dictionary dictionary = provider.getInstance();
        return new ActivityMainPresenter(dictionary, view);
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

        fragment.setName(dictionary.getRandom());
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
