package com.okadatech.android.common;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

@SuppressWarnings("WeakerAccess")
public final class SystemServices {
    private SystemServices() {
    }

    public static <T> T service(final Context context, final String name) {
        //noinspection unchecked
        return (T) context.getSystemService(name);
    }

    public static InputMethodManager inputMethodManager(final Context context) {
        return service(context, Context.INPUT_METHOD_SERVICE);
    }
}
