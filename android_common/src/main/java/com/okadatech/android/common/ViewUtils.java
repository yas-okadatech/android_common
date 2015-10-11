package com.okadatech.android.common;


import android.app.Activity;
import android.view.View;

@SuppressWarnings("WeakerAccess")
public final class ViewUtils {
    private ViewUtils() {
    }

    public static Activity getActivity(final View view) {
        return ContextUtils.getActivity(view.getContext());
    }
}
