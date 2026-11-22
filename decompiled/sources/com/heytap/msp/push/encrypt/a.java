package com.heytap.msp.push.encrypt;

import java.math.BigInteger;
import org.apache.commons.codec.binary.StringUtils;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes11.dex */
public class a extends b {
    private static final int m = 6;
    private static final int n = 3;
    private static final int o = 4;
    private static final int s = 63;
    private final byte[] t;
    private final byte[] u;
    private final byte[] v;
    private final int w;
    private final int x;
    private int y;

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f10113a = {13, 10};
    private static final byte[] p = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f10114q = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options};
    private static final byte[] r = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, BuiltinOptions.LogicalAndOptions, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions};

    public a() {
        this(0);
    }

    public a(int i) {
        this(i, f10113a);
    }

    public a(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r5, byte[] r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L5
            r1 = r0
            goto L6
        L5:
            int r1 = r6.length
        L6:
            r2 = 3
            r3 = 4
            r4.<init>(r2, r3, r5, r1)
            byte[] r1 = com.heytap.msp.push.encrypt.a.r
            r4.u = r1
            r1 = 0
            if (r6 == 0) goto L47
            boolean r2 = r4.l(r6)
            if (r2 != 0) goto L28
            if (r5 <= 0) goto L47
            int r5 = r6.length
            int r5 = r5 + r3
            r4.x = r5
            int r5 = r6.length
            byte[] r5 = new byte[r5]
            r4.v = r5
            int r1 = r6.length
            java.lang.System.arraycopy(r6, r0, r5, r0, r1)
            goto L4b
        L28:
            java.lang.String r5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            r7.<init>(r0)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = "]"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L47:
            r4.x = r3
            r4.v = r1
        L4b:
            int r5 = r4.x
            int r5 = r5 + (-1)
            r4.w = r5
            if (r7 == 0) goto L56
            byte[] r5 = com.heytap.msp.push.encrypt.a.f10114q
            goto L58
        L56:
            byte[] r5 = com.heytap.msp.push.encrypt.a.p
        L58:
            r4.t = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.msp.push.encrypt.a.<init>(int, byte[], boolean):void");
    }

    public a(boolean z) {
        this(76, f10113a, z);
    }

    public static boolean a(byte b) {
        if (b == 61) {
            return true;
        }
        if (b < 0) {
            return false;
        }
        byte[] bArr = r;
        return b < bArr.length && bArr[b] != -1;
    }

    public static boolean a(String str) {
        return b(StringUtils.getBytesUtf8(str));
    }

    public static boolean a(byte[] bArr) {
        return b(bArr);
    }

    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger != null) {
            return a(b(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static byte[] a(byte[] bArr, boolean z) {
        return a(bArr, z, false);
    }

    public static byte[] a(byte[] bArr, boolean z, boolean z2) {
        return a(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] a(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = z ? new a(z2) : new a(0, f10113a, z2);
        long m2 = aVar.m(bArr);
        if (m2 <= i) {
            return aVar.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + m2 + ") than the specified maximum size of " + i);
    }

    public static boolean b(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!a(bArr[i]) && !c(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] b(String str) {
        return new a().c(str);
    }

    static byte[] b(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = bitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    public static byte[] c(byte[] bArr) {
        return a(bArr, false);
    }

    public static String d(byte[] bArr) {
        return StringUtils.newStringUtf8(a(bArr, false));
    }

    public static byte[] e(byte[] bArr) {
        return a(bArr, false, true);
    }

    public static String f(byte[] bArr) {
        return StringUtils.newStringUtf8(a(bArr, false, true));
    }

    public static byte[] g(byte[] bArr) {
        return a(bArr, true);
    }

    public static byte[] h(byte[] bArr) {
        return new a().decode(bArr);
    }

    public static BigInteger i(byte[] bArr) {
        return new BigInteger(1, h(bArr));
    }

    @Override // com.heytap.msp.push.encrypt.b
    void a(byte[] bArr, int i, int i2) {
        if (this.j) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                a(this.x);
                this.l = (this.l + 1) % 3;
                int i4 = i + 1;
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                this.y = (this.y << 8) + i5;
                if (this.l == 0) {
                    byte[] bArr2 = this.h;
                    int i6 = this.i;
                    this.i = i6 + 1;
                    bArr2[i6] = this.t[(this.y >> 18) & 63];
                    byte[] bArr3 = this.h;
                    int i7 = this.i;
                    this.i = i7 + 1;
                    bArr3[i7] = this.t[(this.y >> 12) & 63];
                    byte[] bArr4 = this.h;
                    int i8 = this.i;
                    this.i = i8 + 1;
                    bArr4[i8] = this.t[(this.y >> 6) & 63];
                    byte[] bArr5 = this.h;
                    int i9 = this.i;
                    this.i = i9 + 1;
                    bArr5[i9] = this.t[this.y & 63];
                    this.k += 4;
                    if (this.g > 0 && this.g <= this.k) {
                        System.arraycopy(this.v, 0, this.h, this.i, this.v.length);
                        this.i += this.v.length;
                        this.k = 0;
                    }
                }
                i3++;
                i = i4;
            }
            return;
        }
        this.j = true;
        if (this.l == 0 && this.g == 0) {
            return;
        }
        a(this.x);
        int i10 = this.i;
        int i11 = this.l;
        if (i11 == 1) {
            byte[] bArr6 = this.h;
            int i12 = this.i;
            this.i = i12 + 1;
            bArr6[i12] = this.t[(this.y >> 2) & 63];
            byte[] bArr7 = this.h;
            int i13 = this.i;
            this.i = i13 + 1;
            byte[] bArr8 = this.t;
            bArr7[i13] = bArr8[(this.y << 4) & 63];
            if (bArr8 == p) {
                byte[] bArr9 = this.h;
                int i14 = this.i;
                this.i = i14 + 1;
                bArr9[i14] = 61;
                byte[] bArr10 = this.h;
                int i15 = this.i;
                this.i = i15 + 1;
                bArr10[i15] = 61;
            }
        } else if (i11 == 2) {
            byte[] bArr11 = this.h;
            int i16 = this.i;
            this.i = i16 + 1;
            bArr11[i16] = this.t[(this.y >> 10) & 63];
            byte[] bArr12 = this.h;
            int i17 = this.i;
            this.i = i17 + 1;
            bArr12[i17] = this.t[(this.y >> 4) & 63];
            byte[] bArr13 = this.h;
            int i18 = this.i;
            this.i = i18 + 1;
            byte[] bArr14 = this.t;
            bArr13[i18] = bArr14[(this.y << 2) & 63];
            if (bArr14 == p) {
                byte[] bArr15 = this.h;
                int i19 = this.i;
                this.i = i19 + 1;
                bArr15[i19] = 61;
            }
        }
        this.k += this.i - i10;
        if (this.g <= 0 || this.k <= 0) {
            return;
        }
        System.arraycopy(this.v, 0, this.h, this.i, this.v.length);
        this.i += this.v.length;
    }

    public boolean a() {
        return this.t == f10114q;
    }

    @Override // com.heytap.msp.push.encrypt.b
    void b(byte[] bArr, int i, int i2) {
        byte b;
        if (this.j) {
            return;
        }
        if (i2 < 0) {
            this.j = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            a(this.w);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                this.j = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = r;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    this.l = (this.l + 1) % 4;
                    this.y = (this.y << 6) + b;
                    if (this.l == 0) {
                        byte[] bArr3 = this.h;
                        int i5 = this.i;
                        this.i = i5 + 1;
                        bArr3[i5] = (byte) ((this.y >> 16) & 255);
                        byte[] bArr4 = this.h;
                        int i6 = this.i;
                        this.i = i6 + 1;
                        bArr4[i6] = (byte) ((this.y >> 8) & 255);
                        byte[] bArr5 = this.h;
                        int i7 = this.i;
                        this.i = i7 + 1;
                        bArr5[i7] = (byte) (this.y & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!this.j || this.l == 0) {
            return;
        }
        a(this.w);
        int i8 = this.l;
        if (i8 == 2) {
            this.y >>= 4;
            byte[] bArr6 = this.h;
            int i9 = this.i;
            this.i = i9 + 1;
            bArr6[i9] = (byte) (this.y & 255);
            return;
        }
        if (i8 != 3) {
            return;
        }
        this.y >>= 2;
        byte[] bArr7 = this.h;
        int i10 = this.i;
        this.i = i10 + 1;
        bArr7[i10] = (byte) ((this.y >> 8) & 255);
        byte[] bArr8 = this.h;
        int i11 = this.i;
        this.i = i11 + 1;
        bArr8[i11] = (byte) (this.y & 255);
    }

    @Override // com.heytap.msp.push.encrypt.b
    protected boolean b(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.u;
        return b < bArr.length && bArr[b] != -1;
    }
}
