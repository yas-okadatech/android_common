package com.okadatech.android.common;

import java.util.Collection;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isNullOrEmpty(final Collection<?> c) {
        return c == null || c.isEmpty();
    }

    public static <T> T last(List<T> c) {
        return isNullOrEmpty(c)
                ? null
                : c.get(c.size() - 1);
    }
}
