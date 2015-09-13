package com.okadatech.android.common;

import android.support.annotation.NonNull;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;

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

    public static <T> void replace(final Spannable s, @NonNull final Class<T> oldSpanClass,
                                   final Replacer<T> replacer) {
        final T[] spans = s.getSpans(0, s.length(), oldSpanClass);
        for (final T span : spans) {
            final int start = s.getSpanStart(span);
            final int end = s.getSpanEnd(span);
            s.removeSpan(span);
            final Object newSpan = replacer.replace(span);
            s.setSpan(newSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

    public interface Replacer<T> {
        @SuppressWarnings("UnusedParameters")
        Object replace(T oldSpan);
    }
}
