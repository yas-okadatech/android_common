package com.okadatech.android.common.view;

import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * ParamsLinearLayoutBuilder.
 */
public class ParamsLinearLayoutBuilder extends ParamsViewGroupBuilder {
    private int mWeight;

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
}
