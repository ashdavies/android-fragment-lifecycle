package com.chaos.reactive.fragments.presenters;

public interface FragmentPresenter {
    void onCreateView();

    void onStart();

    void onStop();

    void onDestroyView();
}
