package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13529s extends AbstractC2883oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC12174a.A0h(1);
    public static final String A03 = AbstractC12174a.A0h(2);
    public static final C1R<C13529s> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.op
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            C13529s A00;
            A00 = C13529s.A00(bundle);
            return A00;
        }
    };

    public C13529s() {
        this.A01 = false;
        this.A00 = false;
    }

    public C13529s(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C13529s A00(Bundle bundle) {
        boolean isRated = bundle.getInt(AbstractC2883oU.A02, -1) == 0;
        C3M.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new C13529s(bundle.getBoolean(A03, false));
        }
        return new C13529s();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13529s)) {
            return false;
        }
        C13529s c13529s = (C13529s) obj;
        return this.A00 == c13529s.A00 && this.A01 == c13529s.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
