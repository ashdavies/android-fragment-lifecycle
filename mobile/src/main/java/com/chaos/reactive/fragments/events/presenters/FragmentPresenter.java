package com.chaos.reactive.fragments.events.presenters;

public interface FragmentPresenter {
    void onCreateView();

    void onStart();

    void onStop();

    void onDestroyView();
}
