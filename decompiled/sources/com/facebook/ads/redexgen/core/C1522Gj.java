package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Gj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1522Gj {
    public static byte[] A09;
    public static String[] A0A = {"EsB1Svc2O0r", "neXgiGAVZF2hPSW", "e5UrGC6TzR", "xWVfqfZ1XD25z1nFBwMIBfHnywy3RQhb", "m9mgew9TdIxun9z0pjAF4NJPGlbJBstI", "nE", "RVA0jPrNpk", "4CgUEtTVWe3Kq65nNHH5xBV3YKPxdnIZ"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final List<byte[]> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1522Gj A00(C4J c4j) throws C11732i {
        try {
            c4j.A0g(21);
            int A0I = c4j.A0I() & 3;
            int A0I2 = c4j.A0I();
            int i = 0;
            int A092 = c4j.A09();
            for (int i2 = 0; i2 < A0I2; i2++) {
                c4j.A0g(1);
                int A0M = c4j.A0M();
                for (int i3 = 0; i3 < A0M; i3++) {
                    int A0M2 = c4j.A0M();
                    i += A0M2 + 4;
                    c4j.A0g(A0M2);
                }
            }
            c4j.A0f(A092);
            byte[] bArr = new byte[i];
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            float f = 1.0f;
            String str = null;
            for (int i10 = 0; i10 < A0I2; i10++) {
                int A0I3 = c4j.A0I() & 63;
                int A0M3 = c4j.A0M();
                for (int i11 = 0; i11 < A0M3; i11++) {
                    int A0M4 = c4j.A0M();
                    System.arraycopy(AbstractC1529Gq.A03, 0, bArr, i4, AbstractC1529Gq.A03.length);
                    int length = i4 + AbstractC1529Gq.A03.length;
                    System.arraycopy(c4j.A0l(), c4j.A09(), bArr, length, A0M4);
                    if (A0I3 == 33 && i11 == 0) {
                        C1526Gn A05 = AbstractC1529Gq.A05(bArr, length, length + A0M4);
                        i5 = A05.A0A;
                        i6 = A05.A08;
                        i7 = A05.A02;
                        i8 = A05.A01;
                        i9 = A05.A03;
                        f = A05.A00;
                        str = C3U.A03(A05.A07, A05.A0B, A05.A06, A05.A05, A05.A0C, A05.A04);
                    }
                    i4 = length + A0M4;
                    c4j.A0g(A0M4);
                }
            }
            return new C1522Gj(i == 0 ? Collections.emptyList() : Collections.singletonList(bArr), A0I + 1, i5, i6, f, str, i7, i8, i9);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C11732i.A01(A01(0, 25, 126), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0A[5].length() == 29) {
                throw new RuntimeException();
            }
            A0A[5] = "YyBlh7kREcvGfk8zeLahZrRMr2fR36";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
            i4++;
        }
    }

    public static void A02() {
        A09 = new byte[]{Byte.MAX_VALUE, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, 26, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhileOptions, 26, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentSumOptions, 26, BuiltinOptions.QuantizeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CosOptions, BuiltinOptions.IfOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhileOptions};
    }

    static {
        A02();
    }

    public C1522Gj(List<byte[]> initializationData, int i, int i2, int i3, float f, String str, int i4, int i5, int i6) {
        this.A08 = initializationData;
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A07 = str;
        this.A02 = i4;
        this.A01 = i5;
        this.A03 = i6;
    }
}
