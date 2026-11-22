package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.mu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2787mu implements C8J {
    public static byte[] A01;
    public static String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ C0Q A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.SelectOptions, 27, 10, 7, 1, BuiltinOptions.AbsOptions, 29, 7, 0, 5, BuiltinOptions.AbsOptions, 11, 28, 28, 1, 28, 32, 8, 9, 4, 12, BuiltinOptions.LessEqualOptions, 2, 9, 8, 14, BuiltinOptions.GreaterOptions, 24, 9, 4, 2, 63, 8, 3, 9, 8, 31, 8, 31, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, 11, BuiltinOptions.ExpandDimsOptions, 61, 61, BuiltinOptions.ArgMaxOptions, 24, 25, 32, 22, 28, 18, 2, 7};
    }

    static {
        A01();
    }

    public C2787mu(C0Q c0q) {
        this.A00 = c0q;
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void ACV(Exception exc) {
        C8C c8c;
        AnonymousClass44.A08(A00(16, 23, 101), A00(0, 16, 102), exc);
        c8c = this.A00.A0G;
        c8c.A0D(exc);
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void ACW(C8F c8f) {
        C8C c8c;
        c8c = this.A00.A0G;
        c8c.A0B(c8f);
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void ACX(C8F c8f) {
        C8C c8c;
        c8c = this.A00.A0G;
        c8c.A0C(c8f);
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void AEN() {
        C0Q.A05(this.A00);
        if (0 != 0) {
            C0Q.A05(this.A00);
            throw new NullPointerException(A00(46, 8, 127));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void AEO() {
        C0Q.A05(this.A00);
        if (0 != 0) {
            C0Q.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void AEg(long j) {
        C8C c8c;
        c8c = this.A00.A0G;
        c8c.A03(j);
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void AEh() {
        this.A00.A26();
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void AFF(boolean z) {
        C8C c8c;
        c8c = this.A00.A0G;
        c8c.A0I(z);
    }

    @Override // com.facebook.ads.redexgen.core.C8J
    public final void AFZ(int i, long j, long j2) {
        C8C c8c;
        c8c = this.A00.A0G;
        c8c.A01(i, j, j2);
    }
}
