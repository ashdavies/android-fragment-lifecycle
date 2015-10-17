package com.chaos.reactive.ui;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.MenuRes;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public abstract class ActionBarActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int toolbarId = getToolbarId();
        setSupportActionBar((Toolbar) findViewById(toolbarId));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(getMenuId(), menu);
        return super.onCreateOptionsMenu(menu);
    }

    @IdRes
    protected abstract int getToolbarId();

    @MenuRes
    protected abstract int getMenuId();
}
