package com.bytedance.sdk.openadsdk.core.bh;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes11.dex */
public class jq {
    public static int fxn(int r3) {
        return ((r3 & 3) == 3 || (r3 & 5) == 5) ? r3 | 8388608 : r3;
    }

    private static void fxn(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
            marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = fxn(layoutParams2.gravity);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = fxn(layoutParams3.gravity);
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
            int[] rules = layoutParams4.getRules();
            if (rules[9] != 0) {
                layoutParams4.addRule(20);
            }
            if (rules[11] != 0) {
                layoutParams4.addRule(21);
            }
            int r1 = rules[0];
            if (r1 != 0) {
                layoutParams4.addRule(16, r1);
            }
            int r2 = rules[1];
            if (r2 != 0) {
                layoutParams4.addRule(17, r2);
            }
            int r3 = rules[5];
            if (r3 != 0) {
                layoutParams4.addRule(18, r3);
            }
            int r0 = rules[7];
            if (r0 != 0) {
                layoutParams4.addRule(19, r0);
            }
        }
    }

    public static ViewGroup.LayoutParams fxn(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsKg = kg(view, layoutParams);
        if (layoutParamsKg != null) {
            layoutParams = layoutParamsKg;
        }
        fxn(layoutParams);
        return layoutParams;
    }

    private static ViewGroup.LayoutParams kg(View view, ViewGroup.LayoutParams layoutParams) {
        ViewParent parent;
        ViewGroup.LayoutParams layoutParams2;
        if (view == null || layoutParams == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (!(parent instanceof LinearLayout)) {
            layoutParams2 = null;
        } else {
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        }
        if (parent instanceof RelativeLayout) {
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new RelativeLayout.LayoutParams(layoutParams);
        }
        if (!(parent instanceof FrameLayout)) {
            return layoutParams2;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return null;
        }
        return new FrameLayout.LayoutParams(layoutParams);
    }
}
