package com.amap.location.support.security;

import java.io.UnsupportedEncodingException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes7.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    static abstract class Coder {
        public int op;
        public byte[] output;

        Coder() {
        }

        public abstract int maxOutputSize(int r1);

        public abstract boolean process(byte[] bArr, int r2, int r3, boolean z);
    }

    static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int r1, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (r1 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.amap.location.support.security.Base64.Coder
        public int maxOutputSize(int r1) {
            return ((r1 * 3) / 4) + 10;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
        @Override // com.amap.location.support.security.Base64.Coder
        public boolean process(byte[] bArr, int r18, int r19, boolean z) {
            int r1 = this.state;
            if (r1 == 6) {
                return false;
            }
            int r4 = r19 + r18;
            int r5 = this.value;
            byte[] bArr2 = this.output;
            int[] r7 = this.alphabet;
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
                                        this.state = 6;
                                        return false;
                                    }
                                } else if (r3 == -2) {
                                    r6++;
                                } else if (r3 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (r3 >= 0) {
                                int r10 = r3 | (r8 << 6);
                                bArr2[r9 + 2] = (byte) r10;
                                bArr2[r9 + 1] = (byte) (r10 >> 8);
                                bArr2[r9] = (byte) (r10 >> 16);
                                r9 += 3;
                                r8 = r10;
                                r6 = 0;
                            } else if (r3 == -2) {
                                bArr2[r9 + 1] = (byte) (r8 >> 2);
                                bArr2[r9] = (byte) (r8 >> 10);
                                r9 += 2;
                                r6 = 5;
                            } else if (r3 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (r3 >= 0) {
                            r3 |= r8 << 6;
                            r6++;
                            r8 = r3;
                        } else if (r3 == -2) {
                            bArr2[r9] = (byte) (r8 >> 4);
                            r9++;
                            r6 = 4;
                        } else if (r3 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (r3 >= 0) {
                        r3 |= r8 << 6;
                        r6++;
                        r8 = r3;
                    } else if (r3 != -1) {
                        this.state = 6;
                        return false;
                    }
                } else if (r3 >= 0) {
                    r6++;
                    r8 = r3;
                } else if (r3 != -1) {
                    this.state = 6;
                    return false;
                }
                r2 = r15;
            }
            if (!z) {
                this.state = r6;
                this.value = r8;
                this.op = r9;
                return true;
            }
            if (r6 == 1) {
                this.state = 6;
                return false;
            }
            if (r6 == 2) {
                bArr2[r9] = (byte) (r8 >> 4);
                r9++;
            } else if (r6 == 3) {
                int r11 = r9 + 1;
                bArr2[r9] = (byte) (r8 >> 10);
                r9 += 2;
                bArr2[r11] = (byte) (r8 >> 2);
            } else if (r6 == 4) {
                this.state = 6;
                return false;
            }
            this.state = r6;
            this.op = r9;
            return true;
        }
    }

    static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};
        private static final byte[] ENCODE_WEBSAFE = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int r4, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (r4 & 1) == 0;
            boolean z = (r4 & 2) == 0;
            this.do_newline = z;
            this.do_cr = (r4 & 4) != 0;
            this.alphabet = (r4 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z ? 19 : -1;
        }

        @Override // com.amap.location.support.security.Base64.Coder
        public int maxOutputSize(int r1) {
            return ((r1 * 8) / 5) + 10;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd A[EDGE_INSN: B:32:0x00dd->B:22:0x008a BREAK  A[LOOP:0: B:25:0x0090->B:33:0x00e3]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[LOOP:0: B:25:0x0090->B:33:0x00e3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:89:0x00d4 A[SYNTHETIC] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.amap.location.support.security.Base64.Coder
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instruction units count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.location.support.security.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] decode(String str, int r1) {
        return decode(str.getBytes(), r1);
    }

    public static byte[] encode(byte[] bArr, int r3) {
        return encode(bArr, 0, bArr.length, r3);
    }

    public static String encodeToString(byte[] bArr, int r2) {
        try {
            return new String(encode(bArr, r2), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(byte[] bArr, int r3) {
        return decode(bArr, 0, bArr.length, r3);
    }

    public static byte[] encode(byte[] bArr, int r6, int r7, int r8) {
        Encoder encoder = new Encoder(r8, null);
        int r9 = (r7 / 3) * 4;
        if (!encoder.do_padding) {
            int r1 = r7 % 3;
            if (r1 == 1) {
                r9 += 2;
            } else if (r1 == 2) {
                r9 += 3;
            }
        } else if (r7 % 3 > 0) {
            r9 += 4;
        }
        if (encoder.do_newline && r7 > 0) {
            r9 += (((r7 - 1) / 57) + 1) * (encoder.do_cr ? 2 : 1);
        }
        encoder.output = new byte[r9];
        encoder.process(bArr, r6, r7, true);
        return encoder.output;
    }

    public static byte[] decode(byte[] bArr, int r3, int r4, int r5) {
        Decoder decoder = new Decoder(r5, new byte[(r4 * 3) / 4]);
        if (decoder.process(bArr, r3, r4, true)) {
            int r2 = decoder.op;
            byte[] bArr2 = decoder.output;
            if (r2 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[r2];
            System.arraycopy(bArr2, 0, bArr3, 0, r2);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String encodeToString(byte[] bArr, int r2, int r3, int r4) {
        try {
            return new String(encode(bArr, r2, r3, r4), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
