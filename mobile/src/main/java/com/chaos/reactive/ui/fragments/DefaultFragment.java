package com.chaos.reactive.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chaos.reactive.R;
import com.chaos.reactive.presenters.DefaultFragmentPresenter;
import com.chaos.reactive.presenters.FragmentPresenter;

import java.util.Random;

public class DefaultFragment extends BaseFragment {
    private static final int MAX_9_BYTE = 256;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        if (view != null) {
            view.setBackgroundColor(getRandomColor());
        }

        return view;
    }

    private int getRandomColor() {
        return getRandomColor(new Random());
    }

    private int getRandomColor(Random random) {
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
