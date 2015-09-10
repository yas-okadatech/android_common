package com.okadatech.android.common;

import android.text.SpannableString;

public final class SpannableUtils {
    private SpannableUtils() {
    }

    public static SpannableString trim(final SpannableString s) {
        int start = 0;
        final int last = s.length() - 1;
        int end = last;
        while ((start <= end) && (s.charAt(start) <= ' ')) {
            start++;
        }
        while ((end >= start) && (s.charAt(end) <= ' ')) {
            end--;
        }
        if (start == 0 && end == last) {
            return s;
        }
        return (SpannableString) s.subSequence(start, end + 1);
    }
}
