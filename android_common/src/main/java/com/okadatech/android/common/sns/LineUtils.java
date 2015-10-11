package com.okadatech.android.common.sns;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

@SuppressWarnings("WeakerAccess")
public final class LineUtils {
    private LineUtils() {
    }

    @SuppressWarnings("unused")
    public static boolean share(final Context context, final String text) {
        try {
            final Uri uri = Uri.parse("line://msg/text/")
                    .buildUpon()
                    .appendEncodedPath(text)
                    .build();
            final Intent intent = new Intent()
                    .setAction(Intent.ACTION_VIEW)
                    .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .setData(uri);
            context.startActivity(intent);
            return true;

        } catch (final ActivityNotFoundException e) {
            return false;
        }
    }
}
