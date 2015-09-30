package com.okadatech.android.common;

import android.content.Context;
import android.test.InstrumentationTestCase;
import android.view.LayoutInflater;

public class SystemServicesTest extends InstrumentationTestCase {
    public void testService() {
        assertTrue(SystemServices.service(
                getInstrumentation().getContext(), Context.LAYOUT_INFLATER_SERVICE)
                instanceof LayoutInflater);
    }

    public void testInputMethodManager() {
        assertTrue(SystemServices.inputMethodManager(getInstrumentation().getContext()) != null);
    }
}
