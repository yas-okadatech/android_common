package com.okadatech.android.common.view;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * ParamsRelativeLayoutBuilder.
 */
public class ParamsRelativeLayoutBuilder extends ParamsViewGroupBuilder {
    private static final int TRUE = -1;

    private final SparseIntArray mRules = new SparseIntArray();

    ParamsRelativeLayoutBuilder() {
    }

    @Override
    ViewGroup.LayoutParams createLayoutParams() {
        return new RelativeLayout.LayoutParams(mWidth, mHeight);
    }

    @Override
    void onBuild(final ViewGroup.LayoutParams layoutParams) {
        final RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) layoutParams;
        for (int i = 0; i < mRules.size(); ++i) {
            final int verb = mRules.keyAt(i);
            params.addRule(verb, mRules.get(verb));
        }
    }

    public ParamsRelativeLayoutBuilder addRule(final int verb) {
        mRules.put(verb, TRUE);
        return this;
    }

    public ParamsRelativeLayoutBuilder addRule(final int verb, final int anchor) {
        mRules.put(verb, anchor);
        return this;
    }
}
