
package com.okadatech.android.common.log;

import junit.framework.TestCase;

public class DLogTest extends TestCase {

    public void testPrintln() {
        DLog.println(DLog.DEBUG, "test", "testPrintln");
    }

    public void testCriticalStringString() {
        DLog.critical("testCriticalStringString");
    }

    public void testCriticalStringStringObjectArray() {
        DLog.critical("%s", "testCriticalStringStringObjectArray");
    }

    public void testDStringString() {
        DLog.d("testDStringString");
    }

    public void testDStringStringObjectArray() {
        DLog.d("%s", "testDStringStringObjectArray");
    }

    public void testEStringString() {
        DLog.e("testEStringString");
    }

    public void testEStringStringObjectArray() {
        DLog.e("%s", "testEStringStringObjectArray");
    }

    public void testIStringString() {
        DLog.i("testIStringString");
    }

    public void testIStringStringObjectArray() {
        DLog.i("%s", "testIStringStringObjectArray");
    }

    public void testVStringString() {
        DLog.v("testVStringString");
    }

    public void testVStringStringObjectArray() {
        DLog.v("%s", "testVStringStringObjectArray");
    }

    public void testWStringString() {
        DLog.w("testWStringString");
    }

    public void testWStringStringObjectArray() {
        DLog.w("%s", "testWStringStringObjectArray");
    }
}
