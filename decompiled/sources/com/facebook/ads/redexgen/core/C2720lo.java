package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.lo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2720lo implements C1S {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public static String[] A04 = {"0EeRaofkOnG82pPuB", "jcjJv", "T4n", "y6LXg9kPowsRJwalOEx6K", "cypgHvauDeb", "sGCac32Lryl6ta5A9qPel0ZSNDpSTc", "mAWrtqCYM7sM8yItQ0fM", "xdW2EE8FfL1ekapcbmlM6yOkR5Ux1S1"};
    public static final String A06 = AbstractC12174a.A0h(0);
    public static final String A07 = AbstractC12174a.A0h(1);
    public static final String A08 = AbstractC12174a.A0h(2);
    public static final C1R<C2720lo> A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.lp
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2720lo.A00(bundle);
        }
    };

    public C2720lo(int i, int[] iArr, int i2) {
        this.A00 = i;
        this.A03 = Arrays.copyOf(iArr, iArr.length);
        this.A01 = iArr.length;
        this.A02 = i2;
        Arrays.sort(this.A03);
    }

    public static /* synthetic */ C2720lo A00(Bundle bundle) {
        int i = bundle.getInt(A06, -1);
        int[] tracks = bundle.getIntArray(A07);
        int trackType = bundle.getInt(A08, -1);
        C3M.A07(i >= 0 && trackType >= 0);
        C3M.A01(tracks);
        return new C2720lo(i, tracks, trackType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A04;
        if (strArr[5].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "RoyHwRFBbL3TyB1YuYs";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2720lo c2720lo = (C2720lo) obj;
        if (this.A00 == c2720lo.A00 && Arrays.equals(this.A03, c2720lo.A03) && this.A02 == c2720lo.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.A00 * 31) + Arrays.hashCode(this.A03)) * 31;
        int hash = this.A02;
        return hashCode + hash;
    }
}
