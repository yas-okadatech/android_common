package com.okadatech.android.common.test;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;

import com.okadatech.android.common.ContextUtils;

import junit.framework.TestCase;

public class ContextUtilsTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        Looper.prepare();
    }

    public void testGetActivity() {
        Context context = null;
        assertNull(ContextUtils.getActivity(context));

        context = new ContextWrapper(new Application());
        assertNull(ContextUtils.getActivity(context));

        context = new ContextWrapper(new Activity());
        assertNotNull(ContextUtils.getActivity(context));
    }
}
