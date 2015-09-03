package com.okadatech.android.common.sns;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

@SuppressWarnings("WeakerAccess")
public final class TwitterUtils {
    private TwitterUtils() {
    }

    @SuppressWarnings("unused")
    public static boolean share(final Context context, final String text) {
        try {
            final Intent intent = new Intent()
                    .setAction(Intent.ACTION_SEND)
                    .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .setPackage("com.twitter.android")
                    .setType("image/png")
                    .putExtra(Intent.EXTRA_TEXT, text);
            context.startActivity(intent);
            return true;

        } catch (final ActivityNotFoundException e) {
            return false;
        }
    }
}
