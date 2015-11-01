package com.chaos.reactive.fragments.events.ui.adapters;

import android.content.Context;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.ButterKnife;

public abstract class BaseListAdapter<T, VH extends BaseListAdapter.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final List<T> items = new ArrayList<>();

    @Override
    public int getItemCount() {
        return items.size();
    }

    public T getItem(int position) {
        return items.get(position);
    }

    public void add(T t) {
        items.add(t);
    }

    public void add(int location, T t) {
        items.add(location, t);
    }

    public void addAll(Collection<T> ts) {
        items.addAll(ts);
    }

    public void clear() {
        items.clear();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(VH holder, int position) {
        T item = items.get(position);
        holder.bind(item);
    }

    public abstract static class ViewHolder<T> extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @UiThread
        public abstract void bind(T t);
    }
}
