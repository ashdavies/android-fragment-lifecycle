package com.chaos.reactive.fragments.ui;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.widget.Toolbar;

import com.chaos.reactive.fragments.presenters.ActivityPresenter;

public abstract class ActionBarActivity<P extends ActivityPresenter> extends BaseActivity<P> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int toolbarId = getToolbarId();
        setSupportActionBar((Toolbar) findViewById(toolbarId));
    }

    @IdRes
    protected abstract int getToolbarId();
}
