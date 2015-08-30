package com.okadatech.android.common;

@SuppressWarnings("WeakerAccess")
public final class NumberUtils {

    private NumberUtils() { }

    public static byte parseByte(final String s) {
        try {
            return Byte.parseByte(s);
        } catch (final NumberFormatException e) {
            return 0;
        }
    }
    
    public static double parseDouble(final String s) {
        try {
            return Double.parseDouble(s);
        } catch (final NumberFormatException e) {
            return 0.0;
        } catch (final NullPointerException e) {    // NOPMD
            return 0.0;
        }
    }

    public static float parseFloat(final String s) {
        try {
            return Float.parseFloat(s);
        } catch (final NumberFormatException e) {
            return 0f;
        } catch (final NullPointerException e) {    // NOPMD
            return 0f;
        }
    }
    
    public static int parseInt(final String s) {
        try {
            return Integer.parseInt(s);
        } catch (final NumberFormatException e) {
            return 0;
        }
    }
    
    public static long parseLong(final String s) {
        try {
            return Long.parseLong(s);
        } catch (final NumberFormatException e) {
            return 0;
        }
    }

    public static short parseShort(final String s) {
        try {
            return Short.parseShort(s);
        } catch (final NumberFormatException e) {
            return 0;
        }
    }
}
