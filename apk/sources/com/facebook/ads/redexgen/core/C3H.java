package com.facebook.ads.redexgen.core;

import android.text.Spannable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C3H {
    public static void A00(Spannable spannable, Object obj, int r7, int r8, int r9) {
        for (Object obj2 : spannable.getSpans(r7, r8, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == r7 && spannable.getSpanEnd(obj2) == r8 && spannable.getSpanFlags(obj2) == r9) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, r7, r8, r9);
    }
}
