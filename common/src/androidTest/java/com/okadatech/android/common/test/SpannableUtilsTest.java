package com.okadatech.android.common.test;

import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;

import com.okadatech.android.common.SpannableUtils;

import junit.framework.TestCase;

public final class SpannableUtilsTest extends TestCase {

    public void testTrim() {
        SpannableString s = new SpannableString("test");
        assertEquals(new SpannableString("test"), SpannableUtils.trim(s));

        s = new SpannableString(" test ");
        assertEquals(new SpannableString("test"), SpannableUtils.trim(s));

        s = new SpannableString("  test   ");
        assertEquals(new SpannableString("test"), SpannableUtils.trim(s));

        s = new SpannableString(Html.fromHtml("<b> test</b> "));
        assertEquals("test", SpannableUtils.trim(s).toString());
    }

    public void testReplace() {
        final Spannable s = (Spannable) Html.fromHtml("abc <b>ghi</b>jkl<b>mno</b>pqr");
        SpannableUtils.replace(s, StyleSpan.class, new SpannableUtils.Replacer<StyleSpan>() {
            @Override
            public Object replace(final StyleSpan oldSpan) {
                return new UnderlineSpan();
            }
        });

        assertEquals(2, s.getSpans(0, s.length(), UnderlineSpan.class).length);
        assertEquals(0, s.getSpans(0, s.length(), StyleSpan.class).length);
    }
}
