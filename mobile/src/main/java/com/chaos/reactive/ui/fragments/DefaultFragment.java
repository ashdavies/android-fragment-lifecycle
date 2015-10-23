package com.chaos.reactive.ui.fragments;

import com.chaos.reactive.R;
import com.chaos.reactive.presenters.DefaultFragmentPresenter;
import com.chaos.reactive.presenters.FragmentPresenter;

public class DefaultFragment extends BaseFragment {

    @Override
    protected FragmentPresenter createPresenter() {
        return new DefaultFragmentPresenter();
    }

    @Override
    protected int onCreateViewId() {
        return R.layout.fragment_empty;
    }
}
