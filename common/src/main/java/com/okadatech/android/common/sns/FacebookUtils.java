package com.okadatech.android.common.sns;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

@SuppressWarnings("WeakerAccess")
public final class FacebookUtils {
    private FacebookUtils() {
    }

    @SuppressWarnings("unused")
    public static boolean share(final Context context, final String url) {
        try {
            final Intent intent = new Intent()
                    .setAction(Intent.ACTION_SEND)
                    .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .setPackage("com.facebook.katana")
                    .setType("text/plain")
                    .putExtra(Intent.EXTRA_TEXT, url);
            context.startActivity(intent);
            return true;

        } catch (final ActivityNotFoundException e) {
            return false;
        }
    }
}
