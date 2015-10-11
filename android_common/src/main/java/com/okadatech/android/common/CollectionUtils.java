package com.okadatech.android.common;

import java.util.Collection;

@SuppressWarnings("WeakerAccess")
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isNullOrEmpty(final Collection<?> c) {
        return c == null || c.isEmpty();
    }
}
