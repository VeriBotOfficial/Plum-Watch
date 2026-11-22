package com.facebook.ads.redexgen.core;

import com.autonavi.aps.amapapi.config.Const;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.4J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4J {
    public static byte[] A03;
    public static String[] A04 = {"RlBAQ9etSzb6rKOU0OwTULVtudJYJZp0", "XAmGWsEC26u1mjqUpAPP", "gKAOne2sLRpvkAzkWDtxdYOHT1y3K7xN", Const.SP_KEY_INFO_UPLOAD, "f0TxnfWyKi4JtHzbatu6pF78XF274ljv", "5Aw1jR83b8etF7", "lH1Eai5bIm9O9MK22LfAWzb", "DxY4VOe5grYAJX95lLrlpegM3yyEwSTm"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{64, BuiltinOptions.CallOnceOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.LessOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LessOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.LessOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.LessOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessOptions, BuiltinOptions.MatrixDiagOptions, Byte.MAX_VALUE, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.GeluOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.GeluOptions, Byte.MAX_VALUE, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, 2, BuiltinOptions.ArgMinOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ExpandDimsOptions, 63, 34, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DequantizeOptions, 29, 0, 6, 3, 3, 28, 1, 7, 22, 23, BuiltinOptions.GatherNdOptions, 16, 27, 18, 1, 0, 22, 7, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = MetaExoPlayerCustomizedCollections.A05(AbstractC2537ia.A02, AbstractC2537ia.A06, AbstractC2537ia.A03, AbstractC2537ia.A04, AbstractC2537ia.A05);
    }

    public C4J() {
        this.A00 = AbstractC12174a.A07;
    }

    public C4J(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C4J(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C4J(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    private char A00(Charset charset, char[] cArr) {
        char A01;
        int i;
        if ((charset.equals(AbstractC2537ia.A06) || charset.equals(AbstractC2537ia.A02)) && A07() >= 1) {
            A01 = AbstractC2339fA.A01(AbstractC2960q6.A00(this.A00[this.A02]));
            i = 1;
        } else if ((charset.equals(AbstractC2537ia.A03) || charset.equals(AbstractC2537ia.A04)) && A07() >= 2) {
            A01 = AbstractC2339fA.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i = 2;
        } else {
            if (!charset.equals(AbstractC2537ia.A05) || A07() < 2) {
                return (char) 0;
            }
            A01 = AbstractC2339fA.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i = 2;
        }
        if (!AbstractC2339fA.A04(cArr, A01)) {
            return (char) 0;
        }
        this.A02 += i;
        char character = AbstractC2339fA.A01(A01);
        return character;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0018 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A06
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L10
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
        L10:
            r3 = 1
        L11:
            int r2 = r4.A02
        L13:
            int r1 = r4.A01
            int r0 = r3 + (-1)
            int r1 = r1 - r0
            if (r2 >= r1) goto L8f
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A06
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2a
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L35
        L2a:
            byte[] r0 = r4.A00
            r0 = r0[r2]
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC12174a.A16(r0)
            if (r0 == 0) goto L35
            return r2
        L35:
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A03
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L45
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L58
        L45:
            byte[] r0 = r4.A00
            r0 = r0[r2]
            if (r0 != 0) goto L58
            byte[] r1 = r4.A00
            int r0 = r2 + 1
            r0 = r1[r0]
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC12174a.A16(r0)
            if (r0 == 0) goto L58
            return r2
        L58:
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A05
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L73
            byte[] r1 = r4.A00
            int r0 = r2 + 1
            r0 = r1[r0]
            if (r0 != 0) goto L73
            byte[] r0 = r4.A00
            r0 = r0[r2]
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC12174a.A16(r0)
            if (r0 == 0) goto L73
            return r2
        L73:
            int r2 = r2 + r3
            goto L13
        L75:
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A03
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8d
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A05
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8d
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2537ia.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L92
        L8d:
            r3 = 2
            goto L11
        L8f:
            int r0 = r4.A01
            return r0
        L92:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 95
            r1 = 21
            r0 = 50
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C4J.A01(java.nio.charset.Charset):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A02(char r5) {
        /*
            r4 = this;
            int r0 = r4.A07()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r4.A02
        La:
            int r0 = r4.A01
            if (r3 >= r0) goto L17
            byte[] r0 = r4.A00
            r0 = r0[r3]
            if (r0 == r5) goto L17
            int r3 = r3 + 1
            goto La
        L17:
            byte[] r2 = r4.A00
            int r1 = r4.A02
            int r0 = r4.A02
            int r0 = r3 - r0
            java.lang.String r2 = com.facebook.ads.redexgen.core.AbstractC12174a.A0r(r2, r1, r0)
            r4.A02 = r3
            int r1 = r4.A02
            int r0 = r4.A01
            if (r1 >= r0) goto L31
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C4J.A02(char):java.lang.String");
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & 255;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | (bArr4[i7] & 255);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | ((bArr4[i7] & 255) << 24);
    }

    public final int A0F() {
        int A0E = A0E();
        if (A0E >= 0) {
            return A0E;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
    }

    public final int A0H() {
        int b2 = A0I();
        int b1 = A0I();
        int b4 = A0I();
        int b3 = A0I();
        int b22 = (b2 << 21) | (b1 << 14);
        int b12 = b4 << 7;
        return b22 | b12 | b3;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | (bArr2[i3] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i4;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0L() {
        int A0C = A0C();
        if (A0C >= 0) {
            return A0C;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr4[r1] & 255) << 24);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j5 = j4 | ((bArr5[r1] & 255) << 32);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j6 = j5 | ((bArr6[r1] & 255) << 40);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j7 = j6 | ((bArr7[r1] & 255) << 48);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j7 | ((255 & bArr8[r1]) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j3 | ((255 & bArr4[r1]) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = (bArr[r1] & 255) << 56;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr2[r1] & 255) << 48);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr3[r1] & 255) << 40);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j4 = j3 | ((bArr4[r1] & 255) << 32);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j5 = j4 | ((bArr5[r1] & 255) << 24);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j6 = j5 | ((bArr6[r1] & 255) << 16);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j7 = j6 | ((bArr7[r1] & 255) << 8);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j7 | (255 & bArr8[r1]);
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j = (bArr[r1] & 255) << 24;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j2 = j | ((bArr2[r1] & 255) << 16);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j3 = j2 | ((bArr3[r1] & 255) << 8);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j3 | (255 & bArr4[r1]);
    }

    public final long A0R() {
        long A0P = A0P();
        if (A0P >= 0) {
            return A0P;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0P);
    }

    public final long A0S() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        int i2 = 7;
        while (A04[3].length() != 11) {
            A04[0] = "oMNWSgm03bScuVXxVZmUeRStw4NVi0TN";
            if (i2 >= 0) {
                int length2 = 1 << i2;
                long value = length2;
                if ((value & j) == 0) {
                    if (i2 < 6) {
                        int length3 = 1 << i2;
                        j &= length3 - 1;
                        i = 7 - i2;
                    } else if (i2 == 7) {
                        i = 1;
                    }
                } else {
                    i2--;
                }
            }
            if (i != 0) {
                int i3 = 1;
                while (i3 < i) {
                    byte[] bArr2 = this.A00;
                    int length4 = this.A02;
                    byte b = bArr2[length4 + i3];
                    if ((b & 192) == 128) {
                        int length5 = b & 63;
                        j = (j << 6) | length5;
                        if (A04[3].length() != 11) {
                            A04[2] = "QkYn4WhdN3Bc00ITVAtZ7M0H0JKEG2qx";
                            i3++;
                        } else {
                            i3++;
                        }
                    } else {
                        throw new NumberFormatException(A03(0, 42, 72) + j);
                    }
                }
                int length6 = this.A02;
                this.A02 = length6 + i;
                return j;
            }
            throw new NumberFormatException(A03(42, 35, 80) + j);
        }
        throw new RuntimeException();
    }

    public final String A0T() {
        return A0Y(AbstractC2537ia.A06);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i) {
        if (i == 0) {
            return A03(0, 0, 97);
        }
        int i2 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0r = AbstractC12174a.A0r(bArr, stringLength4, i2);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return A0r;
    }

    public final String A0W(int i) {
        return A0X(i, AbstractC2537ia.A06);
    }

    public final String A0X(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final String A0Y(Charset charset) {
        C3M.A09(A05.contains(charset), A03(95, 21, 50) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC2537ia.A02)) {
            A0Z();
        }
        int A01 = A01(charset);
        int lineLimit = this.A02;
        String A0X = A0X(A01 - lineLimit, charset);
        int i = this.A02;
        int lineLimit2 = this.A01;
        if (i == lineLimit2) {
            return A0X;
        }
        A05(charset);
        return A0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC2537ia.A06;
        }
        if (A07() >= 2) {
            if (this.A00[this.A02] == -2) {
                byte[] bArr = this.A00;
                int i = this.A02;
                if (A04[0].charAt(23) != 't') {
                    throw new RuntimeException();
                }
                A04[1] = "9QZAaK9H1E15SkUu26Oe";
                if (bArr[i + 1] == -1) {
                    this.A02 += 2;
                    return AbstractC2537ia.A04;
                }
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC2537ia.A05;
            }
            return null;
        }
        return null;
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | ((bArr2[i3] & 255) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    public final void A0c(int i) {
        if (i > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i);
        }
    }

    public final void A0d(int i) {
        A0j(A08() < i ? new byte[i] : this.A00, i);
        String[] strArr = A04;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A04[3] = "3F79npZxDc4PfqkC8vfulVLdM";
    }

    public final void A0e(int i) {
        C3M.A07(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0f(int i) {
        boolean z;
        if (i >= 0) {
            int i2 = this.A01;
            String[] strArr = A04;
            if (strArr[4].charAt(20) != strArr[7].charAt(20)) {
                throw new RuntimeException();
            }
            A04[3] = "UMwuHioqOI4Z";
            if (i <= i2) {
                z = true;
                C3M.A07(z);
                this.A02 = i;
            }
        }
        z = false;
        C3M.A07(z);
        this.A02 = i;
    }

    public final void A0g(int i) {
        A0f(this.A02 + i);
    }

    public final void A0h(C4I c4i, int i) {
        A0k(c4i.A00, 0, i);
        c4i.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}
