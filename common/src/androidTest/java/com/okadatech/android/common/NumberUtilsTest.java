package com.okadatech.android.common;

import junit.framework.TestCase;

public class NumberUtilsTest extends TestCase {

    @SuppressWarnings("EmptyMethod")
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SuppressWarnings("EmptyMethod")
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testParseByte() {
        assertEquals(2, NumberUtils.parseByte("2"));
        assertEquals(0, NumberUtils.parseByte(null));
        assertEquals(0, NumberUtils.parseByte("a"));
    }

    public void testParseDouble() {
        assertEquals(2.1, NumberUtils.parseDouble("2.1"), 0);
        assertEquals(0, NumberUtils.parseDouble(null), 0);
        assertEquals(0, NumberUtils.parseDouble("a"), 0);
    }

    public void testParseFloat() {
        assertEquals(2.2f, NumberUtils.parseFloat("2.2"), 0);
        assertEquals(0, NumberUtils.parseFloat(null), 0);
        assertEquals(0, NumberUtils.parseFloat("a"), 0);
    }

    public void testParseInt() {
        assertEquals(3, NumberUtils.parseInt("3"));
        assertEquals(0, NumberUtils.parseInt(null));
        assertEquals(0, NumberUtils.parseInt("a"));
    }

    public void testParseLong() {
        assertEquals(4, NumberUtils.parseLong("4"));
        assertEquals(0, NumberUtils.parseLong(null));
        assertEquals(0, NumberUtils.parseLong("a"));
    }

    public void testParseShort() {
        assertEquals(5, NumberUtils.parseShort("5"));
        assertEquals(0, NumberUtils.parseShort(null));
        assertEquals(0, NumberUtils.parseShort("a"));
    }

}
