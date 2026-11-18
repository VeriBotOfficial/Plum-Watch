package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2i, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2i extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C2i() {
    }

    @Deprecated
    public C2i(String str) {
        super(str);
    }

    public C2i(String str, Throwable th, boolean z, int r4) {
        super(str, th);
        this.A01 = z;
        this.A00 = r4;
    }

    public static C2i A00(String str) {
        return new C2i(str, null, false, 1);
    }

    public static C2i A01(String str, Throwable th) {
        return new C2i(str, th, true, 1);
    }

    public static C2i A02(String str, Throwable th) {
        return new C2i(str, th, true, 0);
    }
}
