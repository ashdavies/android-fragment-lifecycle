package com.chaos.reactive.fragments.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chaos.reactive.fragments.R;
import com.chaos.reactive.fragments.Event;

import butterknife.Bind;

public class EventListAdapter extends BaseListAdapter<Event, EventListAdapter.ViewHolder> {

    @Override
    public EventListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflater.inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public static class ViewHolder extends BaseListAdapter.ViewHolder<Event> {

        @Bind(R.id.name)
        protected TextView name;

        @Bind(R.id.source)
        protected TextView source;

        public ViewHolder(View view) {
            super(view);
        }

        @Override
        public void bind(Event event) {
            name.setText(event.getName());
            source.setText(event.getSource());
        }
    }
}
