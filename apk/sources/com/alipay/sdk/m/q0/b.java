package com.alipay.sdk.m.q0;

import java.io.UnsupportedEncodingException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f1439a = true;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f1440a;
        public int b;
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.q0.b$b, reason: collision with other inner class name */
    public static class C0182b extends a {
        public static final int[] f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public static final int[] g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public int c;
        public int d;
        public final int[] e;

        public C0182b(int r1, byte[] bArr) {
            this.f1440a = bArr;
            this.e = (r1 & 8) == 0 ? f : g;
            this.c = 0;
            this.d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
        public boolean a(byte[] bArr, int r18, int r19, boolean z) {
            int r1 = this.c;
            if (r1 == 6) {
                return false;
            }
            int r4 = r19 + r18;
            int r5 = this.d;
            byte[] bArr2 = this.f1440a;
            int[] r7 = this.e;
            int r9 = 0;
            int r8 = r5;
            int r6 = r1;
            int r2 = r18;
            while (r2 < r4) {
                if (r6 == 0) {
                    while (true) {
                        int r14 = r2 + 4;
                        if (r14 > r4 || (r8 = (r7[bArr[r2] & 255] << 18) | (r7[bArr[r2 + 1] & 255] << 12) | (r7[bArr[r2 + 2] & 255] << 6) | r7[bArr[r2 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[r9 + 2] = (byte) r8;
                        bArr2[r9 + 1] = (byte) (r8 >> 8);
                        bArr2[r9] = (byte) (r8 >> 16);
                        r9 += 3;
                        r2 = r14;
                    }
                    if (r2 >= r4) {
                        break;
                    }
                }
                int r15 = r2 + 1;
                int r3 = r7[bArr[r2] & 255];
                if (r6 != 0) {
                    if (r6 != 1) {
                        if (r6 != 2) {
                            if (r6 != 3) {
                                if (r6 != 4) {
                                    if (r6 == 5 && r3 != -1) {
                                        this.c = 6;
                                        return false;
                                    }
                                } else if (r3 == -2) {
                                    r6++;
                                } else if (r3 != -1) {
                                    this.c = 6;
                                    return false;
                                }
                            } else if (r3 >= 0) {
                                r8 = (r8 << 6) | r3;
                                bArr2[r9 + 2] = (byte) r8;
                                bArr2[r9 + 1] = (byte) (r8 >> 8);
                                bArr2[r9] = (byte) (r8 >> 16);
                                r9 += 3;
                                r6 = 0;
                            } else if (r3 == -2) {
                                bArr2[r9 + 1] = (byte) (r8 >> 2);
                                bArr2[r9] = (byte) (r8 >> 10);
                                r9 += 2;
                                r6 = 5;
                            } else if (r3 != -1) {
                                this.c = 6;
                                return false;
                            }
                        } else if (r3 >= 0) {
                            r8 = (r8 << 6) | r3;
                            r6++;
                        } else if (r3 == -2) {
                            bArr2[r9] = (byte) (r8 >> 4);
                            r9++;
                            r6 = 4;
                        } else if (r3 != -1) {
                            this.c = 6;
                            return false;
                        }
                    } else if (r3 >= 0) {
                        r8 = (r8 << 6) | r3;
                        r6++;
                    } else if (r3 != -1) {
                        this.c = 6;
                        return false;
                    }
                } else if (r3 >= 0) {
                    r6++;
                    r8 = r3;
                } else if (r3 != -1) {
                    this.c = 6;
                    return false;
                }
                r2 = r15;
            }
            if (!z) {
                this.c = r6;
                this.d = r8;
                this.b = r9;
                return true;
            }
            if (r6 == 1) {
                this.c = 6;
                return false;
            }
            if (r6 == 2) {
                bArr2[r9] = (byte) (r8 >> 4);
                r9++;
            } else if (r6 == 3) {
                int r10 = r9 + 1;
                bArr2[r9] = (byte) (r8 >> 10);
                r9 += 2;
                bArr2[r10] = (byte) (r8 >> 2);
            } else if (r6 == 4) {
                this.c = 6;
                return false;
            }
            this.c = r6;
            this.b = r9;
            return true;
        }
    }

    public static class c extends a {
        public final byte[] c;
        public int d;
        public int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final byte[] i;
        public static final /* synthetic */ boolean l = true;
        public static final byte[] j = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};
        public static final byte[] k = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options};

        public c(int r4, byte[] bArr) {
            this.f1440a = bArr;
            this.f = (r4 & 1) == 0;
            boolean z = (r4 & 2) == 0;
            this.g = z;
            this.h = (r4 & 4) != 0;
            this.i = (r4 & 8) == 0 ? j : k;
            this.c = new byte[2];
            this.d = 0;
            this.e = z ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd A[EDGE_INSN: B:32:0x00dd->B:22:0x008a BREAK  A[LOOP:0: B:25:0x0090->B:33:0x00e3]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[LOOP:0: B:25:0x0090->B:33:0x00e3, LOOP_END] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public boolean a(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instruction units count: 514
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.q0.b.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int r3) {
        return a(bArr, 0, bArr.length, r3);
    }

    public static byte[] b(byte[] bArr, int r3) {
        return b(bArr, 0, bArr.length, r3);
    }

    public static String c(byte[] bArr, int r2) {
        try {
            return new String(b(bArr, r2), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] a(byte[] bArr, int r3, int r4, int r5) {
        C0182b c0182b = new C0182b(r5, new byte[(r4 * 3) / 4]);
        if (!c0182b.a(bArr, r3, r4, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int r2 = c0182b.b;
        byte[] bArr2 = c0182b.f1440a;
        if (r2 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[r2];
        System.arraycopy(bArr2, 0, bArr3, 0, r2);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, int r6, int r7, int r8) {
        c cVar = new c(r8, null);
        int r9 = (r7 / 3) * 4;
        if (!cVar.f) {
            int r1 = r7 % 3;
            if (r1 == 1) {
                r9 += 2;
            } else if (r1 == 2) {
                r9 += 3;
            }
        } else if (r7 % 3 > 0) {
            r9 += 4;
        }
        if (cVar.g && r7 > 0) {
            r9 += (((r7 - 1) / 57) + 1) * (cVar.h ? 2 : 1);
        }
        cVar.f1440a = new byte[r9];
        cVar.a(bArr, r6, r7, true);
        if (f1439a || cVar.b == r9) {
            return cVar.f1440a;
        }
        throw new AssertionError();
    }
}
