package com.kugou.one;

import android.util.Log;

import com.peak.third.Common;

public class One implements Common {
    private static final String TAG = "test_one";

    public One() {
        Log.d(TAG, "One: hello world");
    }

    public void hello() {
        Log.d(TAG, "hello: ");
    }

}
