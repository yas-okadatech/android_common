package com.okadatech.android.common.test.view;


import android.support.test.runner.AndroidJUnit4;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.okadatech.android.common.view.ParamsBuilder;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class ParamsBuilderTest {

    @Test
    public void verifyViewGroup() {
        final ViewGroup.LayoutParams params = new ParamsBuilder()
                .viewGroup()
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Test
    public void verifyViewGroupWidthHeight() {
        final ViewGroup.LayoutParams params = new ParamsBuilder()
                .viewGroup()
                .width(1)
                .height(2)
                .build();
        assertThat(params.width, is(1));
        assertThat(params.height, is(2));
    }

    @Test
    public void verifyViewGroupMargin() {
        final ViewGroup.MarginLayoutParams params = new ParamsBuilder()
                .viewGroup()
                .margin(1, 2, 3, 4)
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.leftMargin, is(1));
        assertThat(params.topMargin, is(2));
        assertThat(params.rightMargin, is(3));
        assertThat(params.bottomMargin, is(4));
    }

    @Test
    public void verifyLinearLayout() {
        final LinearLayout.LayoutParams params = new ParamsBuilder()
                .linearLayout()
                .weight(1.5f)
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.weight, is(1.5f));
    }
}
