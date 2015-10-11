package com.okadatech.android.common;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtilsTest extends TestCase {
    public void testIsNullOrEmpty() {
        assertTrue(CollectionUtils.isNullOrEmpty(null));
        assertTrue(CollectionUtils.isNullOrEmpty(new ArrayList<String>()));
        assertFalse(CollectionUtils.isNullOrEmpty(Collections.singletonList("a")));
    }
}
