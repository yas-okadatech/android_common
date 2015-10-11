package com.okadatech.android.common;

import android.content.Context;
import android.net.Uri;

@SuppressWarnings("WeakerAccess")
public final class GooglePlayStore {
    private GooglePlayStore() {
    }

    public static void show(final Context context, final String packageName) {
        Browser.show(context, Uri.parse("market://details?id=" + packageName));
    }

    @SuppressWarnings("unused")
    public static void show(final Context context) {
        show(context, context.getPackageName());
    }
}
