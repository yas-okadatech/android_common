package com.okadatech.android.common.view;


import android.view.ViewGroup;

import junit.framework.TestCase;

public class ParamsBuilderTest extends TestCase {

    public void testViewGroup() {
        final ViewGroup.LayoutParams params = new ParamsBuilder()
                .viewGroup()
                .build();
        assertEquals(ViewGroup.LayoutParams.WRAP_CONTENT, params.width);
        assertEquals(ViewGroup.LayoutParams.WRAP_CONTENT, params.height);
    }

    public void testViewGroupWidthHeight() {
        final ViewGroup.LayoutParams params = new ParamsBuilder()
                .viewGroup()
                .width(1)
                .height(2)
                .build();
        assertEquals(1, params.width);
        assertEquals(2, params.height);
    }

    public void testViewGroupMargin() {
        final ViewGroup.MarginLayoutParams params = new ParamsBuilder()
                .viewGroup()
                .margin(1, 2, 3, 4)
                .build();
        assertEquals(ViewGroup.LayoutParams.WRAP_CONTENT, params.width);
        assertEquals(ViewGroup.LayoutParams.WRAP_CONTENT, params.height);
        assertEquals(1, params.leftMargin);
        assertEquals(2, params.topMargin);
        assertEquals(3, params.rightMargin);
        assertEquals(4, params.bottomMargin);
    }
}
