package com.okadatech.android.common.listener;

import android.view.View;
import android.widget.AdapterView;

@SuppressWarnings("unused")
public class OnItemSelectedListenerAdapter implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(final AdapterView<?> parent, final View view, final int position,
                               final long id) {
        // noop
    }

    @Override
    public void onNothingSelected(final AdapterView<?> parent) {
        // noop
    }
}
