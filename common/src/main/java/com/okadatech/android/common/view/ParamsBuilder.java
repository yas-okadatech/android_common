package com.okadatech.android.common.view;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * ParamsBuilder.
 */
public class ParamsBuilder {

    private enum ViewType {
        ViewGroup,
        LinearLayout,
        RelativeLayout
    }

    private ViewType mViewType = ViewType.ViewGroup;
    private int mWidth = ViewGroup.LayoutParams.WRAP_CONTENT;
    private int mHeight = ViewGroup.LayoutParams.WRAP_CONTENT;
    private Rect mMargin;

    private int mGravity;
    private int mWeight;

    public <T extends ViewGroup.LayoutParams> T build() {
        final ViewGroup.LayoutParams params = createLayoutParams();
        buildMargin(params);
        //noinspection unchecked
        return (T) params;
    }

    private ViewGroup.LayoutParams createLayoutParams() {
        switch (mViewType) {
            case ViewGroup:
                if (mMargin == null) {
                    return new ViewGroup.LayoutParams(mWidth, mHeight);
                } else {
                    return new ViewGroup.MarginLayoutParams(mWidth, mHeight);
                }

            case LinearLayout:
                if (mMargin == null) {
                    return new LinearLayout.LayoutParams(mWidth, mHeight);
                } else {
                    return new LinearLayout.MarginLayoutParams(mWidth, mHeight);
                }

            case RelativeLayout:
                if (mMargin == null) {
                    return new RelativeLayout.LayoutParams(mWidth, mHeight);
                } else {
                    return new RelativeLayout.MarginLayoutParams(mWidth, mHeight);
                }

            default:
                throw new IllegalStateException("view is " + mViewType);
        }
    }

    private void buildMargin(final ViewGroup.LayoutParams params) {
        if (mMargin == null) {
            return;
        }

        ((ViewGroup.MarginLayoutParams) params).setMargins(mMargin.left, mMargin.top,
                mMargin.right, mMargin.bottom);
    }

    public ParamsBuilder linearLayout() {
        mViewType = ViewType.LinearLayout;
        return this;
    }

    public ParamsBuilder relativeLayout() {
        mViewType = ViewType.RelativeLayout;
        return this;
    }


    public ParamsBuilder width(final int width) {
        mWidth = width;
        return this;
    }

    public ParamsBuilder height(final int height) {
        mHeight = height;
        return this;
    }

    public ParamsBuilder margin(final int left, final int top, final int right, final int bottom) {
        mMargin = new Rect(left, top, right, bottom);
        return this;
    }

    public ParamsBuilder margin(final Rect margin) {
        mMargin = margin;
        return this;
    }
}
