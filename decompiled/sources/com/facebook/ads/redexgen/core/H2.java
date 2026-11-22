package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class H2 {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{BuiltinOptions.AbsOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.VarHandleOptions, Byte.MAX_VALUE, BuiltinOptions.AddNOptions, BuiltinOptions.DepthToSpaceOptions, 58, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.GeluOptions, BuiltinOptions.AssignVariableOptions, 58, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentProdOptions, Byte.MAX_VALUE, BuiltinOptions.Rfft2dOptions, 58, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableSizeOptions, 58, BuiltinOptions.UnsortedSegmentMinOptions, Byte.MAX_VALUE, 58, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Rfft2dOptions, 58, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, 58, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, 58, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentProdOptions, Byte.MAX_VALUE, 58, BuiltinOptions.HashtableOptions, BuiltinOptions.VarHandleOptions, Byte.MAX_VALUE, BuiltinOptions.VarHandleOptions, Byte.MAX_VALUE, BuiltinOptions.ExpandDimsOptions};
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(InterfaceC2694lN interfaceC2694lN) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC2694lN.AG9(this.A06, 0, 10);
        interfaceC2694lN.AI1();
        if (GF.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(H1 h1, long j, int i, int i2, int i3, C1538Gz c1538Gz) {
        C3M.A0A(this.A01 <= i2 + i3, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i4 = this.A02;
        this.A02 = i4 + 1;
        if (i4 == 0) {
            this.A04 = j;
            this.A00 = i;
            this.A03 = 0;
        }
        this.A03 += i2;
        this.A01 = i3;
        if (this.A02 >= 16) {
            A05(h1, c1538Gz);
        }
    }

    public final void A05(H1 h1, C1538Gz c1538Gz) {
        if (this.A02 > 0) {
            h1.AIA(this.A04, this.A00, this.A03, this.A01, c1538Gz);
            this.A02 = 0;
        }
    }
}
