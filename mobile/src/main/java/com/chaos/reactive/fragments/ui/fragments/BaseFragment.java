package com.chaos.reactive.fragments.ui.fragments;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chaos.reactive.fragments.presenters.FragmentPresenter;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {
    private final FragmentPresenter presenter = createPresenter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(onCreateViewId(), null);
        ButterKnife.bind(this, view);

        presenter.onCreateView();
        return view;
    }

    protected abstract FragmentPresenter createPresenter();

    @Override
    public void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.onDestroyView();
    }

    @LayoutRes
    protected abstract int onCreateViewId();
}
