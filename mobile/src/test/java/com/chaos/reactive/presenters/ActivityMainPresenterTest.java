package com.chaos.reactive.presenters;

import com.chaos.reactive.BuildConfig;
import com.chaos.reactive.ui.fragments.BaseFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowMultiDex;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, shadows = {ShadowMultiDex.class})
public class ActivityMainPresenterTest {
    private ActivityMainPresenter presenter;

    @Mock
    private PagerView view;

    @Before
    public void setUp() {
        initMocks(this);
        presenter = ActivityMainPresenter.create(view);
    }

    @Test
    public void assertOnCreate() {
        presenter.onCreate();
        verify(view, times(1)).addFragmentFactory(any(BaseFragment.class));
    }
}
