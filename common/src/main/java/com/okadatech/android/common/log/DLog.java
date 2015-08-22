package com.okadatech.android.common.log;

import android.util.Log;

import com.okadatech.android.common.BuildConfig;

import java.util.Formatter;

@SuppressWarnings({"WeakerAccess", "unused"})
public final class DLog {

    public static final int DEBUG = Log.DEBUG;
    public static final int ERROR = Log.ERROR;
    public static final int INFO = Log.INFO;
    public static final int VERBOSE = Log.VERBOSE;
    public static final int WARN = Log.WARN;

    private static boolean sIsLoggable = BuildConfig.DEBUG;

    private DLog() {
    }

    @SuppressWarnings({"BooleanMethodIsAlwaysInverted", "SameReturnValue"})
    private static boolean isLoggable() {
        return sIsLoggable;
    }

    public static void setLoggable(final boolean loggable) {
        sIsLoggable = loggable;
    }

    private static StackTraceElement getStackTraceElement() {
        for (final StackTraceElement element : new Throwable().getStackTrace()) {
            if (!"DLog.java".equals(element.getFileName())) {
                return element;
            }
        }

        throw new IllegalStateException();
    }

    private static void log(final int priority, final String tag, final String msg) {
        final StackTraceElement element = getStackTraceElement();
        Log.println(priority, tag, "[" + element.getFileName() + ":" + element.getLineNumber()
                + "]" + msg);
    }

    private static void log(final int priority, final String tag, final String format,
                            final Object... args) {
        final StackTraceElement element = getStackTraceElement();
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(element.getFileName());
        sb.append(":");
        sb.append(element.getLineNumber());
        sb.append("]");

        final Formatter formatter = new Formatter(sb);
        formatter.format(format, args);

        Log.println(priority, tag, sb.toString());
        formatter.close();
    }

    public static void println(final int priority, final String tag, final String msg) {

    }

    public static void critical(final String tag, final String msg) {
        log(ERROR, tag, msg);
    }

    public static void critical(final String tag, final String format, final Object... args) {
        log(ERROR, tag, format, args);
    }

    public static void d(final String tag, final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(DEBUG, tag, msg);
    }

    public static void d(final String tag, final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(DEBUG, tag, format, args);
    }

    public static void e(final String tag, final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(ERROR, tag, msg);
    }

    public static void e(final String tag, final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(ERROR, tag, format, args);
    }

    public static void i(final String tag, final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(INFO, tag, msg);
    }

    public static void i(final String tag, final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(INFO, tag, format, args);
    }

    public static void v(final String tag, final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(VERBOSE, tag, msg);
    }

    public static void v(final String tag, final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(VERBOSE, tag, format, args);
    }

    public static void w(final String tag, final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(WARN, tag, msg);
    }

    public static void w(final String tag, final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(WARN, tag, format, args);
    }
}
