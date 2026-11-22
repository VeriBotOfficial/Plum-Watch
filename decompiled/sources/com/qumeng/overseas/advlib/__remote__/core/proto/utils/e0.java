package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes17.dex */
public class e0 {
    public static View a(ViewGroup viewGroup, Class cls) {
        if (viewGroup == null || cls == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (cls.isInstance(childAt)) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return a((ViewGroup) childAt, cls);
                }
            }
        }
        return null;
    }

    public static int[] a(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static void a(ViewGroup viewGroup, View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup) || view.getParent() == viewGroup) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }
}
