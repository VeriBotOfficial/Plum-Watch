package com.bytedance.sdk.openadsdk.bx.kg;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.ij;

/* loaded from: classes14.dex */
public class bh {
    public static boolean fxn(View view, int i) {
        return fxn(view, false, i);
    }

    public static boolean fxn(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return ij.fxn(view, z ? 30 : 50, i, false);
    }
}
