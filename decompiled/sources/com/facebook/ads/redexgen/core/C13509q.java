package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.9q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13509q extends AbstractC2883oU {
    public static byte[] A01;
    public static final C1R<C13509q> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{22, 3, 20, 5, 3, 8, 18, BuiltinOptions.BidirectionalSequenceRNNOptions, 11, 19, 21, 18, BuiltinOptions.BidirectionalSequenceRNNOptions, 4, 3, BuiltinOptions.BidirectionalSequenceRNNOptions, 15, 8, BuiltinOptions.BidirectionalSequenceRNNOptions, 18, 14, 3, BuiltinOptions.BidirectionalSequenceRNNOptions, 20, 7, 8, 1, 3, BuiltinOptions.BidirectionalSequenceRNNOptions, 9, 0, BuiltinOptions.BidirectionalSequenceRNNOptions, 61, BuiltinOptions.RankOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.RankOptions, BuiltinOptions.PackOptions};
    }

    static {
        A03();
        A03 = AbstractC12174a.A0h(1);
        A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.of
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                C13509q A00;
                A00 = C13509q.A00(bundle);
                return A00;
            }
        };
    }

    public C13509q() {
        this.A00 = -1.0f;
    }

    public C13509q(float f) {
        C3M.A09(f >= 0.0f && f <= 100.0f, A02(0, 40, 45));
        this.A00 = f;
    }

    public static C13509q A00(Bundle bundle) {
        C3M.A07(bundle.getInt(AbstractC2883oU.A02, -1) == 1);
        float f = bundle.getFloat(A03, -1.0f);
        return f == -1.0f ? new C13509q() : new C13509q(f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13509q) && this.A00 == ((C13509q) obj).A00;
    }

    public final int hashCode() {
        return BX.A00(Float.valueOf(this.A00));
    }
}
