package com.okadatech.android.common;

import android.support.annotation.NonNull;
import android.view.View;

@SuppressWarnings({"WeakerAccess", "unused"})
public final class Ime {
    private Ime() {
    }

    public static void showIme(@NonNull final View view) {
        SystemServices.inputMethodManager(view.getContext()).showSoftInput(view, 0);
    }

    public static void hideIme(final View view) {
        SystemServices.inputMethodManager(view.getContext())
                .hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
