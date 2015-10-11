package com.okadatech.android.common.log;

import android.util.Log;
import android.util.Pair;

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

    private static Pair<StackTraceElement, String> getStackTraceElement() {
        for (final StackTraceElement element : new Throwable().getStackTrace()) {
            if (!"DLog.java".equals(element.getFileName())) {
                final String filename = element.getFileName();
                final String tag = filename.substring(0, filename.indexOf('.'));
                return Pair.create(element, tag);
            }
        }

        throw new IllegalStateException();
    }

    private static void log(final int priority, final String msg) {
        final Pair<StackTraceElement, String> element = getStackTraceElement();
        Log.println(priority, element.second,
                "[" + element.first.getFileName() + ":" + element.first.getLineNumber()
                        + "]" + msg);
    }

    private static void log(final int priority, final String format, final Object... args) {
        final Pair<StackTraceElement, String> element = getStackTraceElement();
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(element.first.getFileName());
        sb.append(":");
        sb.append(element.first.getLineNumber());
        sb.append("]");

        final Formatter formatter = new Formatter(sb);
        formatter.format(format, args);

        Log.println(priority, element.second, sb.toString());
        formatter.close();
    }

    public static void println(final int priority, final String tag, final String msg) {

    }

    public static void critical(final String msg) {
        log(ERROR, msg);
    }

    public static void critical(final String format, final Object... args) {
        log(ERROR, format, args);
    }

    public static void d(final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(DEBUG, msg);
    }

    public static void d(final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(DEBUG, format, args);
    }

    public static void e(final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(ERROR, msg);
    }

    public static void e(final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(ERROR, format, args);
    }

    public static void i(final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(INFO, msg);
    }

    public static void i(final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(INFO, format, args);
    }

    public static void v(final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(VERBOSE, msg);
    }

    public static void v(final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(VERBOSE, format, args);
    }

    public static void w(final String msg) {
        if (!isLoggable()) {
            return;
        }

        log(WARN, msg);
    }

    public static void w(final String format, final Object... args) {
        if (!isLoggable()) {
            return;
        }

        log(WARN, format, args);
    }
}
