package com.okadatech.android.common.test;

import android.support.test.runner.AndroidJUnit4;

import com.okadatech.android.common.CollectionUtils;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class CollectionUtilsTest extends TestCase {

    @Test
    public void verifyIsNullOrEmpty() {
        assertTrue(CollectionUtils.isNullOrEmpty(null));
        assertTrue(CollectionUtils.isNullOrEmpty(new ArrayList<String>()));
        assertFalse(CollectionUtils.isNullOrEmpty(Collections.singletonList("a")));
    }

    @Test
    public void verifyLast() {
        assertThat(CollectionUtils.last(null), nullValue());

        List<String> empty = Collections.emptyList();
        assertThat(CollectionUtils.last(empty), nullValue());

        List<String> target = Arrays.asList("a", "b", "c", "d", "e");
        assertThat(CollectionUtils.last(target), is("e"));
    }
}
