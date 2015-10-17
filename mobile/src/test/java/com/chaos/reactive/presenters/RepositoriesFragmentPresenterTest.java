package com.chaos.reactive.presenters;

import com.chaos.reactive.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowMultiDex;

import static junit.framework.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, shadows = {ShadowMultiDex.class})
public class RepositoriesFragmentPresenterTest {

    @Test
    public void assertBuild() {
        assertTrue(true);
    }
}
