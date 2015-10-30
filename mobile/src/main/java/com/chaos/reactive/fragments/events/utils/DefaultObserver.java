package com.chaos.reactive.fragments.events.utils;

import rx.Observer;

public abstract class DefaultObserver<T> implements Observer<T> {

    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(Throwable exception) {
    }

    @Override
    public void onNext(T item) {
    }
}
