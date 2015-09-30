
package com.okadatech.android.common.log;

import junit.framework.TestCase;

public class DLogTest extends TestCase {

    private static final String TAG = DLogTest.class.getSimpleName();

    public void testPrintln() {
        DLog.println(DLog.DEBUG, TAG, "testPrintln");
    }

    public void testCriticalStringString() {
        DLog.critical(TAG, "testCriticalStringString");
    }

    public void testCriticalStringStringObjectArray() {
        DLog.critical(TAG, "%s", "testCriticalStringStringObjectArray");
    }

    public void testDStringString() {
        DLog.d(TAG, "testDStringString");
    }

    public void testDStringStringObjectArray() {
        DLog.d(TAG, "%s", "testDStringStringObjectArray");
    }

    public void testEStringString() {
        DLog.e(TAG, "testEStringString");
    }

    public void testEStringStringObjectArray() {
        DLog.e(TAG, "%s", "testEStringStringObjectArray");
    }

    public void testIStringString() {
        DLog.i(TAG, "testIStringString");
    }

    public void testIStringStringObjectArray() {
        DLog.i(TAG, "%s", "testIStringStringObjectArray");
    }
    
    public void testVStringString() {
        DLog.v(TAG, "testVStringString");
    }

    public void testVStringStringObjectArray() {
        DLog.v(TAG, "%s", "testVStringStringObjectArray");
    }

    public void testWStringString() {
        DLog.w(TAG, "testWStringString");
    }

    public void testWStringStringObjectArray() {
        DLog.w(TAG, "%s", "testWStringStringObjectArray");
    }    
}
