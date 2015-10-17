package com.chaos.reactive.network;

import com.chaos.reactive.BuildConfig;
import com.chaos.reactive.ui.views.BaseView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowMultiDex;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, shadows = {ShadowMultiDex.class})
public class BaseViewObserverTest {
    private BaseViewObserver observer;

    @Mock
    private BaseView view;

    @Before
    public void setUp() {
        initMocks(this);
        observer = new StubBaseViewObserver(view);
    }

    @Test
    public void assertOnCompleted() {
        observer.onCompleted();
        verify(view, times(1)).snackbar("Complete");
    }

    @Test
    public void assertOnError() {
        Throwable exception = mock(Throwable.class);
        when(exception.toString()).thenReturn("error");

        observer.onError(exception);
        verify(view, times(1)).toast("error");
    }

    public static class StubBaseViewObserver extends BaseViewObserver {
        public StubBaseViewObserver(BaseView view) {
            super(view);
        }
    }
}
