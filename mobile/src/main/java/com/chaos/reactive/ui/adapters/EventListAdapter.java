package com.chaos.reactive.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chaos.reactive.R;
import com.chaos.reactive.events.Event;

import butterknife.Bind;

public class EventListAdapter extends BaseListAdapter<Event, EventListAdapter.ViewHolder> {

    @Override
    public EventListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        return new ViewHolder(context, inflater.inflate(R.layout.list_item, parent, false));
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

        public ViewHolder(Context context, View view) {
            super(context, view);
        }

        @Override
        public void bind(Event event) {
            name.setText(event.getName());
            source.setText(event.getSource());
        }
    }
}
