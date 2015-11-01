package com.chaos.reactive.fragments.ui.views;

import android.support.v4.app.Fragment;

public interface FragmentEventView extends EventView {
    void addFragment(Fragment fragment);

    void popFragment();
}
