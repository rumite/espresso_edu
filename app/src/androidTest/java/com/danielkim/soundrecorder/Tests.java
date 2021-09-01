package com.danielkim.soundrecorder;

import androidx.test.rule.ActivityTestRule;

import com.danielkim.soundrecorder.activities.MainActivity;
import com.danielkim.soundrecorder.pages.RecordPage;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.danielkim.soundrecorder.pages.RecordPage.clickRecordButton;
import static com.danielkim.soundrecorder.pages.RecordPage.recordingSavedText;
import static com.danielkim.soundrecorder.pages.RecordPage.recordingStartedText;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.StringContains.containsString;

public class Tests {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void verifyRecordButtonClicking() {
        RecordPage.clickButton(RecordPage.getRecordButton());
    }

    @Test
    public void recordingStartedToastIsDisplayed() {
        clickRecordButton();
        isToastMessageDisplayed(recordingStartedText);
        Helper.logTest("Recording started");
    }


    public void isToastMessageDisplayed(String text) {
        onView(withText(text))
                .inRoot(withDecorView(not(activityActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }

}
