package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13077m {
    public static final C13077m A03;
    public final String A00;
    public final C13067l A01;
    public final Object A02;

    static {
        C13077m c13077m;
        if (AbstractC12174a.A02 < 31) {
            c13077m = new C13077m("");
        } else {
            c13077m = new C13077m(C13067l.A01, "");
        }
        A03 = c13077m;
    }

    public C13077m(C13067l c13067l, String str) {
        this.A01 = c13067l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C13077m(String str) {
        C3M.A08(AbstractC12174a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C13067l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13077m)) {
            return false;
        }
        C13077m c13077m = (C13077m) obj;
        if (Objects.equals(this.A00, c13077m.A00) && Objects.equals(this.A01, c13077m.A01) && Objects.equals(this.A02, c13077m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
