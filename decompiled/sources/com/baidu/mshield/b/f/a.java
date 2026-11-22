package com.baidu.mshield.b.f;

import android.util.Base64;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: AESUtil.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static byte[] f8420a;
    public static byte[] b;
    public static byte[] c;

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return c(bArr2, bArr);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return d(bArr2, bArr);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.b(bArr2, bArr);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return null;
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.a(bArr2, bArr);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return null;
        }
    }

    public static synchronized byte[] a(int i) {
        byte[] bArr;
        synchronized (a.class) {
            try {
                if (i == 16) {
                    byte[] bArr2 = f8420a;
                    if (bArr2 == null || bArr2.length != 16) {
                        f8420a = Base64.decode(new byte[]{BuiltinOptions.MirrorPadOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CallOnceOptions, 61, 61}, 0);
                    }
                    bArr = f8420a;
                } else if (i != 24) {
                    bArr = new byte[0];
                } else {
                    byte[] bArr3 = b;
                    if (bArr3 == null || bArr3.length != 24) {
                        b = Base64.decode(new byte[]{BuiltinOptions.CosOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.WhereOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.WhereOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, 10}, 0);
                    }
                    bArr = b;
                }
            } catch (Throwable th) {
                byte[] bArr4 = new byte[0];
                com.baidu.sec.privacy.f.c.a(th);
                bArr = bArr4;
            }
        }
        return bArr;
    }

    public static synchronized byte[] a() {
        byte[] bArr;
        synchronized (a.class) {
            try {
                byte[] bArr2 = c;
                if (bArr2 == null || bArr2.length != 16) {
                    c = Base64.decode(new byte[]{BuiltinOptions.AbsOptions, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ATan2Options, BuiltinOptions.WhereOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ReverseV2Options, 61, 61, 10}, 0);
                }
                bArr = c;
            } finally {
                return bArr;
            }
        }
        return bArr;
    }
}
