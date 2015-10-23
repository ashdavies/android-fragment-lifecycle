package com.chaos.reactive.ui.fragments;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chaos.reactive.events.Event;
import com.chaos.reactive.ui.views.EventView;

public class EventFragment extends DefaultFragment {

    @Nullable
    private EventView view;

    public void setView(@Nullable EventView view) {
        this.view = view;
    }

    private void registerEvent(String event) {
        if (view != null) {
            view.registerEvent(new Event(EventFragment.class.getName(), event));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        registerEvent("onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        registerEvent("onStart");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        registerEvent("onDestroyView");
    }

    @Override
    public void onStop() {
        super.onStop();
        registerEvent("onStrop");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        registerEvent("onHiddenChanged");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        registerEvent("onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerEvent("onCreate");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        registerEvent("onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        registerEvent("onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        registerEvent("onViewStateRestored");
    }

    @Override
    public void onResume() {
        super.onResume();
        registerEvent("onResume");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        registerEvent("onSaveInstanceState");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        registerEvent("onConfigurationChanged");
    }

    @Override
    public void onPause() {
        super.onPause();
        registerEvent("onPause");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        registerEvent("onLowMemory");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        registerEvent("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        registerEvent("onDetach");
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        registerEvent("onDestroyOptionsMenu");
    }
}
