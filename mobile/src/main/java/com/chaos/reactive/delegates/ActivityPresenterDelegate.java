package com.chaos.reactive.delegates;

import android.support.annotation.Nullable;

import com.chaos.reactive.presenters.ActivityPresenter;

public final class ActivityPresenterDelegate implements ActivityPresenter {
    private final ActivityPresenter presenter;

    public ActivityPresenterDelegate(@Nullable ActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onCreate() {
        if (presenter != null) {
            presenter.onCreate();
        }
    }

    @Override
    public void onStart() {
        if (presenter != null) {
            presenter.onStart();
        }
    }

    @Override
    public void onStop() {
        if (presenter != null) {
            presenter.onStop();
        }
    }

    @Override
    public void onDestroy() {
        if (presenter != null) {
            presenter.onDestroy();
        }
    }
}
