package com.chaos.reactive.fragments.ui.factories;

import android.content.Context;
import android.support.v4.app.Fragment;

public interface FragmentFactory extends InstanceFactory<Fragment> {
    String getTitle(Context context);
}
