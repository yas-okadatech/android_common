package com.okadatech.android.common.view;

import android.graphics.Rect;
import android.view.ViewGroup;

/**
 * ParamsViewGroupBuilder.
 */
public class ParamsViewGroupBuilder {
    int mWidth = ViewGroup.LayoutParams.WRAP_CONTENT;
    int mHeight = ViewGroup.LayoutParams.WRAP_CONTENT;
    Rect mMargin;

    ParamsViewGroupBuilder() {
    }

    public <T extends ViewGroup.LayoutParams> T build() {
        final ViewGroup.LayoutParams params = createLayoutParams();
        buildMargin(params);
        //noinspection unchecked
        return (T) params;
    }

    ViewGroup.LayoutParams createLayoutParams() {
        if (mMargin == null) {
            return new ViewGroup.LayoutParams(mWidth, mHeight);
        } else {
            return new ViewGroup.MarginLayoutParams(mWidth, mHeight);
        }
    }

    private void buildMargin(final ViewGroup.LayoutParams params) {
        if (mMargin == null) {
            return;
        }

        ((ViewGroup.MarginLayoutParams) params).setMargins(mMargin.left, mMargin.top,
                mMargin.right, mMargin.bottom);
    }

    public ParamsViewGroupBuilder width(final int width) {
        mWidth = width;
        return this;
    }

    public ParamsViewGroupBuilder height(final int height) {
        mHeight = height;
        return this;
    }

    public ParamsViewGroupBuilder margin(final int left, final int top, final int right, final int bottom) {
        mMargin = new Rect(left, top, right, bottom);
        return this;
    }

    public ParamsViewGroupBuilder margin(final Rect margin) {
        mMargin = margin;
        return this;
    }
}
