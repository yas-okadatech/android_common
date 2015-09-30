package com.okadatech.android.common;

import java.io.Closeable;
import java.io.IOException;

@SuppressWarnings("WeakerAccess")
public final class CloseableUtils {
    private CloseableUtils() {
    }

    public static void closeQuietly(final Closeable closeable) {
        if (closeable == null) {
            return;
        }

        try {
            closeable.close();
        } catch (final IOException e) {
            // ignore
        }
    }
}
