package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {
    public static View a(ViewGroup viewGroup, Class cls) {
        if (viewGroup == null || cls == null) {
            return null;
        }
        for (int r0 = 0; r0 < viewGroup.getChildCount(); r0++) {
            View childAt = viewGroup.getChildAt(r0);
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
        int[] r0 = new int[2];
        if (view != null) {
            view.getLocationOnScreen(r0);
        }
        return r0;
    }

    public static void a(ViewGroup viewGroup, View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup) || view.getParent() == viewGroup) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }
}
