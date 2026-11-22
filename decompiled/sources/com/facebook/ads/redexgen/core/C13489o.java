package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13489o extends AbstractC2883oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC12174a.A0h(1);
    public static final String A03 = AbstractC12174a.A0h(2);
    public static final C1R<C13489o> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oS
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            C13489o A00;
            A00 = C13489o.A00(bundle);
            return A00;
        }
    };

    public C13489o() {
        this.A01 = false;
        this.A00 = false;
    }

    public C13489o(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C13489o A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC2883oU.A02, -1) == 3;
        C3M.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new C13489o(bundle.getBoolean(A03, false));
        }
        return new C13489o();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13489o)) {
            return false;
        }
        C13489o c13489o = (C13489o) obj;
        return this.A00 == c13489o.A00 && this.A01 == c13489o.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
