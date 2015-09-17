package com.okadatech.android.common.view;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * ParamsRelativeLayoutBuilder.
 */
public class ParamsRelativeLayoutBuilder extends ParamsViewGroupBuilder {
    ParamsRelativeLayoutBuilder() {
    }

    @Override
    ViewGroup.LayoutParams createLayoutParams() {
        if (mMargin == null) {
            return new RelativeLayout.LayoutParams(mWidth, mHeight);
        } else {
            return new RelativeLayout.MarginLayoutParams(mWidth, mHeight);
        }
    }
}
