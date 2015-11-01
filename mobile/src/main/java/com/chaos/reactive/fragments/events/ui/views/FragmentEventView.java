package com.chaos.reactive.fragments.events.ui.views;

import android.support.v4.app.Fragment;

public interface FragmentEventView extends EventView {
    void addFragment(Fragment fragment);

    void popFragment();
}
