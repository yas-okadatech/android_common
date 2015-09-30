package com.okadatech.android.common;

import android.os.Looper;

@SuppressWarnings("WeakerAccess")
public final class ThreadUtils {
    private ThreadUtils() {
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
