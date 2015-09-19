package com.okadatech.android.common;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> boolean contains(final T[] arr, final T object) {
        if (object != null) {
            for (final T element : arr) {
                if (object.equals(element)) {
                    return true;
                }
            }
        } else {
            for (final T element : arr) {
                if (element == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean contains(final int[] arr, final int object) {
        for (final int element : arr) {
            if (element == object) {
                return true;
            }
        }
        return false;
    }
}
