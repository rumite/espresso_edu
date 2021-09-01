package com.danielkim.soundrecorder;

import androidx.test.rule.ActivityTestRule;

import com.danielkim.soundrecorder.activities.MainActivity;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;


public class BaseTest {
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    public static void clickButton(int resourceId) {
        onView(withId(resourceId))
                .perform(click())
                .check(matches(isDisplayed()));
    }

}
