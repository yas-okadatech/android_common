package com.okadatech.android.common.view;

/**
 * ParamsBuilder.
 */
public class ParamsBuilder {

    private int mGravity;

    public ParamsViewGroupBuilder viewGroup() {
        return new ParamsViewGroupBuilder();
    }

    public ParamsLinearLayoutBuilder linearLayout() {
        return new ParamsLinearLayoutBuilder();
    }

    public ParamsRelativeLayoutBuilder relativeLayout() {
        return new ParamsRelativeLayoutBuilder();
    }
}
