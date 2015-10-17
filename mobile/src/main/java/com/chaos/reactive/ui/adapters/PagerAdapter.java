package com.chaos.reactive.ui.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chaos.reactive.ui.factories.FragmentFactory;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private final Context context;
    private final List<FragmentFactory> factories;

    public PagerAdapter(Context context, FragmentManager manager) {
        this(context, manager, new ArrayList<>());
    }

    public PagerAdapter(Context context, FragmentManager manager, List<FragmentFactory> factories) {
        super(manager);

        this.context = context;
        this.factories = factories;
    }

    @Override
    public Fragment getItem(int position) {
        return factories.get(position).instantiate(context);
    }

    @Override
    public int getCount() {
        return factories.size();
    }

    public void addFragmentFactory(FragmentFactory factory) {
        factories.add(factory);
        notifyDataSetChanged();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return factories.get(position).getTitle(context);
    }
}
