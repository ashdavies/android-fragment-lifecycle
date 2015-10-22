package com.chaos.reactive.ui;

import android.support.annotation.NonNull;
import android.widget.Toast;

import com.chaos.reactive.R;
import com.chaos.reactive.delegates.ActivityPresenterDelegate;
import com.chaos.reactive.events.Event;
import com.chaos.reactive.presenters.ActivityMainPresenter;
import com.chaos.reactive.ui.adapters.BaseListAdapter;
import com.chaos.reactive.ui.adapters.EventListAdapter;
import com.chaos.reactive.ui.views.BaseView;

public class MainActivity extends ActionBarRecyclerActivity<Event, EventListAdapter.ViewHolder> implements BaseView {

    @NonNull
    @Override
    protected ActivityPresenterDelegate createPresenter() {
        return new ActivityPresenterDelegate(ActivityMainPresenter.create(this));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected int getToolbarId() {
        return R.id.toolbar;
    }

    @Override
    public void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected BaseListAdapter<Event, EventListAdapter.ViewHolder> createAdapter() {
        return new EventListAdapter();
    }
}
