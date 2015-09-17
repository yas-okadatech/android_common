package com.okadatech.android.common.view;

import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * ParamsLinearLayoutBuilder.
 */
public class ParamsLinearLayoutBuilder extends ParamsViewGroupBuilder {

    private float mWeight;

    ParamsLinearLayoutBuilder() {
    }

    @Override
    ViewGroup.LayoutParams createLayoutParams() {
        if (mMargin == null) {
            return new LinearLayout.LayoutParams(mWidth, mHeight);
        } else {
            return new LinearLayout.MarginLayoutParams(mWidth, mHeight);
        }
    }

    public ParamsLinearLayoutBuilder weight(final float weight) {
        mWeight = weight;
        return this;
    }

    @Override
    void onBuild(final ViewGroup.LayoutParams layoutParams) {
        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) layoutParams;
        params.weight = mWeight;
    }
}
