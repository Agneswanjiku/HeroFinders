package com.moringaschool.herofinders;

import android.view.View;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.core.IsNot.not;


public class HerosActivityInstrumentationTest {


    @RunWith(AndroidJUnit4.class)
    public class RestaurantsActivityInstrumentationTest {

        @Rule
        public ActivityTestRule<HerosActivity> activityTestRule =
                new ActivityTestRule<>(HerosActivity.class);

        @Test
        public void listItemClickDisplaysToastWithCorrectRestaurant() {
            View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
            String herosName = "Ant man";
            onData(anything())
                    .inAdapterView(withId(R.id.listView))
                    .atPosition(0)
                    .perform(click());
            onView(withText(herosName)).inRoot(withDecorView(not(activityDecorView)))
                    .check(matches(withText(herosName)));
        }
    }
}
