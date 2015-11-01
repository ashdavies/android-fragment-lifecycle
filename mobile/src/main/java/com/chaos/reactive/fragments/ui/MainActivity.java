package com.chaos.reactive.fragments.ui;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.chaos.reactive.fragments.R;
import com.chaos.reactive.fragments.Event;
import com.chaos.reactive.fragments.presenters.ActivityMainPresenter;
import com.chaos.reactive.fragments.providers.DictionaryProvider;
import com.chaos.reactive.fragments.ui.adapters.BaseListAdapter;
import com.chaos.reactive.fragments.ui.adapters.EventListAdapter;
import com.chaos.reactive.fragments.ui.views.FragmentEventView;

public class MainActivity extends ActionBarRecyclerActivity<ActivityMainPresenter, Event, EventListAdapter.ViewHolder> implements FragmentEventView {
    private final String NAMES_DICTIONARY_FILE = "names.txt";

    @NonNull
    @Override
    protected ActivityMainPresenter createPresenter() {
        DictionaryProvider provider = new DictionaryProvider(getApplicationContext(), NAMES_DICTIONARY_FILE);
        return ActivityMainPresenter.create(provider, this);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                presenter.addFragment();
                return true;

            case R.id.remove:
                presenter.popFragment();
                return true;

            case R.id.clear:
                clear();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void addFragment(Fragment fragment) {
        String tag = fragment.getClass().getName();

        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(tag)
                .add(R.id.frame, fragment, tag)
                .commit();
    }

    @Override
    public void popFragment() {
        getSupportFragmentManager()
                .popBackStack();
    }

    @Override
    public void registerEvent(Event event) {
        add(0, event);
    }
}
