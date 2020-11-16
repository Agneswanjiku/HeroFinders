package com.moringaschool.herofinders;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.locationEditText)).perform(typeText("Nairobi"))
                .check(matches(withText("Nairobi")));
    }
//    @Test
//    public void locationIsSentToRestaurantsActivity() {
//        String location = "Nairobi";
//        onView(withId(R.id.locationEditText)).perform(typeText(location));
//        onView(withId(R.id.findHerosButton)).perform(click());
//        onView(withId(R.id.locationTextView)).check(matches
//                (withText("Here are some of heros and their  culture metholodys: " + location)));
//    }

}
