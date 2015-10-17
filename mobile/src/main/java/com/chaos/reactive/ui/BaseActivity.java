package com.chaos.reactive.ui;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import com.chaos.reactive.delegates.ActivityPresenterDelegate;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    private final ActivityPresenterDelegate delegate = createPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layoutId = getLayoutId();
        setContentView(layoutId);

        delegate.onCreate();
    }

    @Override
    public void setContentView(int layoutResId) {
        super.setContentView(layoutResId);
        ButterKnife.bind(this);
    }

    protected abstract ActivityPresenterDelegate createPresenter();

    @LayoutRes
    protected abstract int getLayoutId();

    @Override
    protected void onStart() {
        super.onStart();
        delegate.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        delegate.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
