package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.2i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C11732i extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C11732i() {
    }

    @Deprecated
    public C11732i(String str) {
        super(str);
    }

    public C11732i(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.A01 = z;
        this.A00 = i;
    }

    public static C11732i A00(String str) {
        return new C11732i(str, null, false, 1);
    }

    public static C11732i A01(String str, Throwable th) {
        return new C11732i(str, th, true, 1);
    }

    public static C11732i A02(String str, Throwable th) {
        return new C11732i(str, th, true, 0);
    }
}
