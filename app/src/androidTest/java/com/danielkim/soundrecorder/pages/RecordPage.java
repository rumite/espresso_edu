package com.danielkim.soundrecorder.pages;

import com.danielkim.soundrecorder.BaseTest;
import com.danielkim.soundrecorder.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class RecordPage extends BaseTest {
    //Strings
    public static String recordingStartedText = "Recording started";
    public static String recordingSavedText = "Recording saved";

    //Elements

    //Methods
    public static void clickRecordButton() {
        onView(withId(R.id.btnRecord))
                .perform(click());
    }

    public static int getRecordButton() {
        return R.id.btnRecord;
    }
}
