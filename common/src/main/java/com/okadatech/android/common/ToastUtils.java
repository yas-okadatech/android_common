package com.okadatech.android.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.IntDef;
import android.support.annotation.StringRes;
import android.widget.Toast;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings("unused")
public final class ToastUtils {
    @IntDef({Toast.LENGTH_SHORT, Toast.LENGTH_LONG})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    private ToastUtils() {
    }

    private static void show(final Context context, final String s, @Duration final int duration) {
        if (ThreadUtils.isMainThread()) {
            Toast.makeText(context, s, duration).show();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, s, duration).show();
                }
            });
        }
    }

    private static void show(final Context context, @StringRes final int res, @Duration final int duration) {
        show(context, context.getString(res), duration);
    }

    public static void showLong(final Context context, @StringRes final int res) {
        show(context, res, Toast.LENGTH_LONG);
    }

    public static void showLong(final Context context, final String s) {
        show(context, s, Toast.LENGTH_LONG);
    }

    public static void showShort(final Context context, @StringRes final int res) {
        show(context, res, Toast.LENGTH_SHORT);
    }

    public static void showShort(final Context context, final String s) {
        show(context, s, Toast.LENGTH_SHORT);
    }
}
