package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: UPCEANExtensionSupport.java */
/* renamed from: com.huawei.hms.scankit.p.ca, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C2988ca {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10629a = {1, 1, 2};
    private final C2980aa b = new C2980aa();
    private final C2984ba c = new C2984ba();

    C2988ca() {
    }

    com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, int i2) throws C2967a {
        int[] a2 = AbstractC2992da.a(c3070x, i2, false, f10629a);
        try {
            return this.c.a(i, c3070x, a2);
        } catch (C2967a unused) {
            return this.b.a(i, c3070x, a2);
        }
    }
}
