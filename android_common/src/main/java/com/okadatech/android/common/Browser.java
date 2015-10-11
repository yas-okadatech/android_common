package com.okadatech.android.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class Browser {
    private Browser() {
    }

    public static void show(final Context context, final Uri url) {
        final Intent intent = new Intent()
                .setAction(Intent.ACTION_VIEW)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .setData(url);

        context.startActivity(intent);
    }

    @SuppressWarnings("SameParameterValue")
    public static void show(final Context context, final String url) {
        show(context, Uri.parse(url));
    }
}
