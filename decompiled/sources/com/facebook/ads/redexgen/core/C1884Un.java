package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1884Un extends AbstractRunnableC1915Vt {
    public static byte[] A07;
    public final /* synthetic */ long A00;
    public final /* synthetic */ UY A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{21, BuiltinOptions.ExpOptions, 31, -32, 24, 19, 21, 23, 20, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, 29, -32, 29, 19, BuiltinOptions.DequantizeOptions, 19, 32, 19, -32, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, 27, 22, 23, BuiltinOptions.LogSoftmaxOptions, -32, -5, 32, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, 19, 30, 30, 4, 23, 24, 23, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogSoftmaxOptions, 23, BuiltinOptions.LogSoftmaxOptions, 2, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, 27, 22, 23, BuiltinOptions.LogSoftmaxOptions, -74, -62, -64, -127, PSSSigner.TRAILER_IMPLICIT, -63, -58, -57, -76, -70, -59, -76, -64, -127, -74, -62, -63, -57, -72, -63, -57, -61, -59, -62, -55, PSSSigner.TRAILER_IMPLICIT, -73, -72, -59, -127, -100, -63, -58, -57, -76, -65, -65, -91, -72, -71, -72, -59, -59, -72, -59, -93, -59, -62, -55, PSSSigner.TRAILER_IMPLICIT, -73, -72, -59};
    }

    public C1884Un(UY uy, boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A01 = uy;
        this.A06 = z;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = j;
        this.A05 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        boolean fb4aResult;
        fb4aResult = this.A01.A03(A00(0, 52, 96), this.A06, this.A02, this.A04, this.A03, this.A00);
        if (fb4aResult) {
            return;
        }
        boolean fb4aResult2 = this.A05;
        if (fb4aResult2) {
            this.A01.A03(A00(52, 53, 1), this.A06, this.A02, this.A04, this.A03, this.A00);
        }
    }
}
