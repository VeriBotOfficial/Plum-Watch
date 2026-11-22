package com.baidu.sec.privacy.f;

import android.util.Base64;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: AESUtil.java */
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static byte[] f9032a;

    public static String a(byte[] bArr) {
        byte[] b;
        if (bArr != null) {
            try {
                if (bArr.length != 0 && (b = b(a(), bArr)) != null && b.length > 0) {
                    return Base64.encodeToString(b, 0);
                }
                return null;
            } catch (Throwable th) {
                c.a(th);
            }
        }
        return null;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.a(bArr2, bArr);
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(a(a(), Base64.decode(str, 0)));
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.b(bArr2, bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized byte[] a() {
        byte[] bArr;
        synchronized (a.class) {
            try {
                byte[] bArr2 = f9032a;
                if (bArr2 == null || bArr2.length != 16) {
                    f9032a = Base64.decode(new byte[]{BuiltinOptions.MirrorPadOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CallOnceOptions, 61, 61}, 0);
                }
                bArr = f9032a;
            } finally {
                return bArr;
            }
        }
        return bArr;
    }
}
