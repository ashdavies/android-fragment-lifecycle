package com.chaos.reactive.fragments.events.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chaos.reactive.fragments.R;
import com.chaos.reactive.fragments.events.presenters.ActivityPresenter;
import com.chaos.reactive.fragments.events.ui.adapters.BaseListAdapter;
import com.chaos.reactive.fragments.events.ui.views.ListingsView;

import java.util.Collection;

import butterknife.Bind;

public abstract class ActionBarRecyclerActivity<P extends ActivityPresenter, T, VH extends BaseListAdapter.ViewHolder> extends ActionBarActivity<P> implements ListingsView<T> {
    private final BaseListAdapter<T, VH> adapter = createAdapter();

    @Bind(R.id.list)
    protected RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list.setAdapter(adapter);
        list.setHasFixedSize(true);
        list.setLayoutManager(getLayoutManager());
    }

    protected abstract BaseListAdapter<T, VH> createAdapter();

    @Override
    public void add(T t) {
        adapter.add(t);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void add(int index, T t) {
        adapter.add(index, t);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void addAll(Collection<T> ts) {
        adapter.addAll(ts);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void clear() {
        adapter.clear();
        adapter.notifyDataSetChanged();
    }

    protected RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(this);
    }
}
