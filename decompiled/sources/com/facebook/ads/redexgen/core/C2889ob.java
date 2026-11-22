package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2889ob implements C1S {
    public static byte[] A03;
    public static String[] A04 = {"UnBMZo2POSkJfz8F5ORuhqz31kXq7ERt", "GIL9xJe6rQGrNyWVB8WflXUexCYVOXiL", "1YJSMghIf03NGeOR9kmJ9bGOSAOIDk9h", "FbkWhL7EvytxWPK79enAjrYaTxkw07sQ", "DvmeNztcauqB3GuZI4NFBZAXEAF", "3h1K0W52WnqAecgG5ddVr1SgL8ZiRxH3", "SzBXc", "YkLyJW6tcdkoyMoq5nPmYT201JvYdNzP"};
    public static final C1R<C2889ob> A05;
    public static final C2889ob A06;
    public static final String A07;
    public static final String A08;
    public final float A00;
    public final float A01;
    public final int A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.IfOptions, BuiltinOptions.FillOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.IfOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RankOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.IfOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.IfOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions, 21, BuiltinOptions.AbsOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, 0, 24, 19, 15, BuiltinOptions.HardSwishOptions, 17, 29, BuiltinOptions.MirrorPadOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhereOptions, 0, 24, 19, 15, BuiltinOptions.HardSwishOptions, 20};
    }

    static {
        A02();
        A06 = new C2889ob(1.0f);
        A08 = AbstractC12174a.A0h(0);
        A07 = AbstractC12174a.A0h(1);
        A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.oc
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2889ob.A00(bundle);
            }
        };
    }

    public C2889ob(float f) {
        this(f, 1.0f);
    }

    public C2889ob(float f, float f2) {
        C3M.A07(f > 0.0f);
        C3M.A07(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(1000.0f * f);
    }

    public static /* synthetic */ C2889ob A00(Bundle bundle) {
        float f = bundle.getFloat(A08, 1.0f);
        float pitch = bundle.getFloat(A07, 1.0f);
        return new C2889ob(f, pitch);
    }

    public final long A03(long j) {
        return this.A02 * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2889ob c2889ob = (C2889ob) obj;
        if (this.A01 == c2889ob.A01) {
            float f = this.A00;
            float f2 = c2889ob.A00;
            if (A04[7].charAt(19) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "pC9U2";
            strArr[4] = "3ca7HvojzYBlvf3WwnTfkyYQmWq";
            if (f == f2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        return (((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return AbstractC12174a.A0n(A01(0, 42, 46), Float.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
