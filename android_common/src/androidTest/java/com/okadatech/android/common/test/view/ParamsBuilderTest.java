package com.okadatech.android.common.test.view;


import android.support.test.runner.AndroidJUnit4;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.okadatech.android.common.view.ParamsBuilder;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class ParamsBuilderTest {
    private static final int TRUE = -1;

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
        final LinearLayout.LayoutParams expected = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        final LinearLayout.LayoutParams params = new ParamsBuilder()
                .linearLayout()
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.leftMargin, is(expected.leftMargin));
        assertThat(params.topMargin, is(expected.topMargin));
        assertThat(params.rightMargin, is(expected.rightMargin));
        assertThat(params.bottomMargin, is(expected.bottomMargin));
        assertThat(params.weight, is(expected.weight));
        assertThat(params.gravity, is(expected.gravity));
    }

    @Test
    public void verifyLinearLayoutMargin() {
        final LinearLayout.MarginLayoutParams params = new ParamsBuilder()
                .linearLayout()
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
    public void verifyLinearLayoutWeight() {
        final LinearLayout.LayoutParams params = new ParamsBuilder()
                .linearLayout()
                .weight(1.5f)
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.weight, is(1.5f));
    }

    @Test
    public void verifyLinearLayoutAddGravity() {
        final LinearLayout.LayoutParams params = new ParamsBuilder()
                .linearLayout()
                .addGravity(Gravity.CENTER_HORIZONTAL)
                .addGravity(Gravity.CENTER_VERTICAL)
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.gravity, is(Gravity.CENTER));
    }

    @Test
    public void verifyLinearLayoutRemoveGravity() {
        final LinearLayout.LayoutParams params = new ParamsBuilder()
                .linearLayout()
                .addGravity(Gravity.CENTER)
                .removeGravity(Gravity.CENTER_VERTICAL)
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.gravity, is(Gravity.CENTER_HORIZONTAL));
    }

    @Test
    public void verifyRelativeLayout() {
        final RelativeLayout.LayoutParams expected = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        final RelativeLayout.LayoutParams params = new ParamsBuilder()
                .relativeLayout()
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.leftMargin, is(expected.leftMargin));
        assertThat(params.topMargin, is(expected.topMargin));
        assertThat(params.rightMargin, is(expected.rightMargin));
        assertThat(params.bottomMargin, is(expected.bottomMargin));
    }

    @Test
    public void verifyRelativeLayoutAddRule() {
        final RelativeLayout.LayoutParams expected = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        final RelativeLayout.LayoutParams params = new ParamsBuilder()
                .relativeLayout()
                .addRule(RelativeLayout.ALIGN_PARENT_TOP)
                .addRule(RelativeLayout.CENTER_HORIZONTAL)
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.leftMargin, is(expected.leftMargin));
        assertThat(params.topMargin, is(expected.topMargin));
        assertThat(params.rightMargin, is(expected.rightMargin));
        assertThat(params.bottomMargin, is(expected.bottomMargin));

        for (int i = 0; i < params.getRules().length; ++i) {
            final int anchor = params.getRules()[i];
            switch (i) {
                case RelativeLayout.ALIGN_PARENT_TOP:
                case RelativeLayout.CENTER_HORIZONTAL:
                    assertThat(anchor, is(TRUE));
                    break;

                default:
                    assertThat(anchor, is(0));
            }
        }
    }

    @Test
    public void verifyRelativeLayoutAddRuleAnchor() {
        final RelativeLayout.LayoutParams expected = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        final RelativeLayout.LayoutParams params = new ParamsBuilder()
                .relativeLayout()
                .addRule(RelativeLayout.ALIGN_BOTTOM, 3)
                .addRule(RelativeLayout.ALIGN_TOP, 2)
                .addRule(RelativeLayout.CENTER_HORIZONTAL)
                .build();
        assertThat(params.width, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.height, is(ViewGroup.LayoutParams.WRAP_CONTENT));
        assertThat(params.leftMargin, is(expected.leftMargin));
        assertThat(params.topMargin, is(expected.topMargin));
        assertThat(params.rightMargin, is(expected.rightMargin));
        assertThat(params.bottomMargin, is(expected.bottomMargin));

        for (int i = 0; i < params.getRules().length; ++i) {
            final int anchor = params.getRules()[i];
            switch (i) {
                case RelativeLayout.CENTER_HORIZONTAL:
                    assertThat(anchor, is(TRUE));
                    break;

                case RelativeLayout.ALIGN_BOTTOM:
                    assertThat(anchor, is(3));
                    break;

                case RelativeLayout.ALIGN_TOP:
                    assertThat(anchor, is(2));
                    break;

                default:
                    assertThat(anchor, is(0));
            }
        }
    }
}
