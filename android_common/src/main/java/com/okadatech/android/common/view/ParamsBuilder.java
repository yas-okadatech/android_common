package com.okadatech.android.common.view;

/**
 * ParamsBuilder.
 */
public final class ParamsBuilder {

    public static ParamsViewGroupBuilder viewGroup() {
        return new ParamsViewGroupBuilder();
    }

    public static ParamsLinearLayoutBuilder linearLayout() {
        return new ParamsLinearLayoutBuilder();
    }

    public static ParamsRelativeLayoutBuilder relativeLayout() {
        return new ParamsRelativeLayoutBuilder();
    }
}
