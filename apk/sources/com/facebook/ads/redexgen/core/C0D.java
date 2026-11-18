package com.facebook.ads.redexgen.core;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0D extends C0M {
    @Override // com.facebook.ads.redexgen.core.PO
    public final Object A00(int r7, int r8, int r9, int r10, boolean z, boolean z2) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(r7, r8, r9, r10, z, z2);
    }

    @Override // com.facebook.ads.redexgen.core.PO
    public final Object A01(int r2, int r3, boolean z, int r5) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(r2, r3, z, r5);
    }
}
