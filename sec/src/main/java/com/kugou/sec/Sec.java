package com.kugou.sec;

import android.util.Log;

import com.peak.third.Common;

public class Sec implements Common {
    private static final String TAG = "test_sec";

    public Sec() {
        Log.d(TAG, "sec: hello world");
    }


    public void hello() {
        Log.d(TAG, "hello: ");
    }
}
