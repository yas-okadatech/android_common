package com.okadatech.android.common;

import junit.framework.TestCase;

public class NumberUtilTest extends TestCase {

    @SuppressWarnings("EmptyMethod")
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SuppressWarnings("EmptyMethod")
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testParseByte() {
        assertEquals(2, NumberUtil.parseByte("2"));
        assertEquals(0, NumberUtil.parseByte(null));
        assertEquals(0, NumberUtil.parseByte("a"));
    }

    public void testParseDouble() {
        assertEquals(2.1, NumberUtil.parseDouble("2.1"), 0);
        assertEquals(0, NumberUtil.parseDouble(null), 0);
        assertEquals(0, NumberUtil.parseDouble("a"), 0);
    }

    public void testParseFloat() {
        assertEquals(2.2f, NumberUtil.parseFloat("2.2"), 0);
        assertEquals(0, NumberUtil.parseFloat(null), 0);
        assertEquals(0, NumberUtil.parseFloat("a"), 0);
    }

    public void testParseInt() {
        assertEquals(3, NumberUtil.parseInt("3"));
        assertEquals(0, NumberUtil.parseInt(null));
        assertEquals(0, NumberUtil.parseInt("a"));
    }

    public void testParseLong() {
        assertEquals(4, NumberUtil.parseLong("4"));
        assertEquals(0, NumberUtil.parseLong(null));
        assertEquals(0, NumberUtil.parseLong("a"));
    }

    public void testParseShort() {
        assertEquals(5, NumberUtil.parseShort("5"));
        assertEquals(0, NumberUtil.parseShort(null));
        assertEquals(0, NumberUtil.parseShort("a"));
    }

}
