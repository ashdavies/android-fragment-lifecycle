package com.chaos.reactive.fragments.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chaos.reactive.fragments.R;
import com.chaos.reactive.fragments.presenters.DefaultFragmentPresenter;
import com.chaos.reactive.fragments.presenters.FragmentPresenter;

import java.util.Random;

public class DefaultFragment extends BaseFragment {
    private static final int MAX_9_BYTE = 256;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        setBackgroundColor(view);
        return view;
    }

    protected void setBackgroundColor(@Nullable View view) {
        if (view != null) {
            int color = getRandomColor();
            view.setBackgroundColor(color);
        }
    }

    protected int getRandomColor() {
        return getRandomColor(new Random());
    }

    protected int getRandomColor(Random random) {
        return Color.rgb(
                random.nextInt(MAX_9_BYTE),
                random.nextInt(MAX_9_BYTE),
                random.nextInt(MAX_9_BYTE)
        );
    }

    @Override
    protected FragmentPresenter createPresenter() {
        return new DefaultFragmentPresenter();
    }

    @Override
    protected int onCreateViewId() {
        return R.layout.fragment_empty;
    }
}
