package com.okadatech.android.common;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

public abstract class WeakReferenceHandler<T> extends Handler {

    private final WeakReference<T> mReference;

    public WeakReferenceHandler(final T r) {
        mReference = new WeakReference<>(r);
    }

    @Override
    public final void handleMessage(final Message msg) {
        final T r = mReference.get();
        if (r == null) {
            return;
        }

        handleMessage(r, msg);
    }

    public abstract void handleMessage(T r, Message msg);
}
