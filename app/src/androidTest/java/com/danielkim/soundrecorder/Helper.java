package com.danielkim.soundrecorder;

import android.util.Log;

public class Helper {
    static boolean logEnabled = true;

    public static void logTest(String log) {
        if (logEnabled) {
            Log.v("Espresso Test", log);
        }
    }
}
