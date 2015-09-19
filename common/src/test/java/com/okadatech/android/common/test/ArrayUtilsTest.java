package com.okadatech.android.common.test;

import com.okadatech.android.common.ArrayUtils;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayUtilsTest {
    @Test
    public void verifyContains() {
        final String[] arr = {"def", "abc", "ghi"};
        assertTrue(ArrayUtils.contains(arr, "abc"));
        assertTrue(ArrayUtils.contains(arr, "def"));
        assertTrue(ArrayUtils.contains(arr, "ghi"));
        assertFalse(ArrayUtils.contains(arr, "xyz"));
    }

    @Test
    public void verifyContainsInt() {
        final int[] arr = {2, 5, 3, 1, 0, 9};
        assertTrue(ArrayUtils.contains(arr, 0));
        assertTrue(ArrayUtils.contains(arr, 2));
        assertTrue(ArrayUtils.contains(arr, 9));
        assertFalse(ArrayUtils.contains(arr, 4));

        arrayContainingInAnyOrder(arr, 0);
    }
}
