package com.moringaschool.herofinders;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;

public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);
}
