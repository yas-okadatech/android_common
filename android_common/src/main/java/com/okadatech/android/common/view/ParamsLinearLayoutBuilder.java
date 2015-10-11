package com.okadatech.android.common.view;

import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * ParamsLinearLayoutBuilder.
 */
public class ParamsLinearLayoutBuilder extends ParamsViewGroupBuilder {

    private int mGravity = 0;
    private float mWeight;

    ParamsLinearLayoutBuilder() {
    }

    @Override
    ViewGroup.LayoutParams createLayoutParams() {
        return new LinearLayout.LayoutParams(mWidth, mHeight);
    }

    @Override
    void onBuild(final ViewGroup.LayoutParams layoutParams) {
        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) layoutParams;
        params.weight = mWeight;
        if (mGravity != 0) {
            params.gravity = mGravity;
        }
    }

    @SuppressWarnings("SameParameterValue")
    public ParamsLinearLayoutBuilder weight(final float weight) {
        mWeight = weight;
        return this;
    }

    public ParamsLinearLayoutBuilder addGravity(final int gravity) {
        mGravity |= gravity;
        return this;
    }

    @SuppressWarnings("SameParameterValue")
    public ParamsLinearLayoutBuilder removeGravity(final int gravity) {
        mGravity &= ~gravity;
        return this;
    }
}
