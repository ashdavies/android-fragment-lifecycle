package com.chaos.reactive.fragments.events.ui;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import com.chaos.reactive.fragments.events.presenters.ActivityPresenter;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends ActivityPresenter> extends AppCompatActivity {
    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();

        int layoutId = getLayoutId();
        setContentView(layoutId);

        presenter.onCreate();
    }

    @Override
    public void setContentView(int layoutResId) {
        super.setContentView(layoutResId);
        ButterKnife.bind(this);
    }

    protected abstract P createPresenter();

    @LayoutRes
    protected abstract int getLayoutId();

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();

        ButterKnife.unbind(this);
    }
}
