package com.okadatech.android.common;


import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public final class ContextUtils {
    private ContextUtils() {
    }

    public static Activity getActivity(final Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }

        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }

        return null;
    }
}
