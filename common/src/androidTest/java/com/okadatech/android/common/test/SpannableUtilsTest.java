package com.okadatech.android.common.test;

import android.text.Html;
import android.text.SpannableString;

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
}
