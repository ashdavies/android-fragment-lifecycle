package com.chaos.reactive.ui;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.widget.Toolbar;

public abstract class ActionBarActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int toolbarId = getToolbarId();
        setSupportActionBar((Toolbar) findViewById(toolbarId));
    }

    @IdRes
    protected abstract int getToolbarId();
}
