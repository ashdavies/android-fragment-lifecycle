package com.chaos.reactive.ui.views;

import android.support.v4.app.Fragment;

import java.util.List;

public interface FragmentView extends BaseView {
    Fragment getFragment(String tag);

    List<Fragment> getFragments();

    void addFragment(Fragment fragment);

    void removeFragment(Fragment fragment);
}
