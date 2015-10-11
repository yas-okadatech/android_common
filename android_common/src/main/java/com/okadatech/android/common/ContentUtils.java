package com.okadatech.android.common;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

@SuppressWarnings("WeakerAccess")
public final class ContentUtils {
    private ContentUtils() {
    }

    @SuppressWarnings("unused")
    public static String getFilename(final ContentResolver resolver, final Uri uri) {
        final Cursor cursor = resolver.query(uri, new String[]{MediaStore.Images.Media.DATA}, null,
                null, null);
        try {
            if (!cursor.moveToFirst()) {
                return null;
            }

            return cursor.getString(0);
        } finally {
            CloseableUtils.closeQuietly(cursor);
        }
    }
}
