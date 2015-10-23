package com.chaos.reactive.ui.views;

import android.support.v4.app.Fragment;

import java.util.List;

public interface FragmentEventView extends EventView {
    Fragment getFragment(String tag);

    List<Fragment> getFragments();

    void addFragment(Fragment fragment);

    void removeFragment(Fragment fragment);
}
