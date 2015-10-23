package com.chaos.reactive.ui;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import com.chaos.reactive.R;
import com.chaos.reactive.events.Event;
import com.chaos.reactive.presenters.ActivityMainPresenter;
import com.chaos.reactive.ui.adapters.BaseListAdapter;
import com.chaos.reactive.ui.adapters.EventListAdapter;
import com.chaos.reactive.ui.views.FragmentEventView;

import java.util.List;

import butterknife.OnClick;

public class MainActivity extends ActionBarRecyclerActivity<ActivityMainPresenter, Event, EventListAdapter.ViewHolder> implements FragmentEventView {

    @NonNull
    @Override
    protected ActivityMainPresenter createPresenter() {
        return ActivityMainPresenter.create(this);
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

    @OnClick(R.id.add_fragment)
    protected void onAddFragmentClick(View view) {
        presenter.addFragment();
    }

    @OnClick(R.id.remove_fragment)
    protected void onRemoveFragmentClick(View view) {
        presenter.removeFragment();
    }

    @Override
    public Fragment getFragment(String tag) {
        return getSupportFragmentManager()
                .findFragmentByTag(tag);
    }

    @Override
    public List<Fragment> getFragments() {
        return getSupportFragmentManager()
                .getFragments();
    }

    @Override
    public void addFragment(Fragment fragment) {
        String tag = fragment.getClass().getName();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame, fragment, tag)
                .commit();
    }

    @Override
    public void removeFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .remove(fragment)
                .commit();
    }

    @Override
    public void registerEvent(Event event) {
        add(event);
    }
}
