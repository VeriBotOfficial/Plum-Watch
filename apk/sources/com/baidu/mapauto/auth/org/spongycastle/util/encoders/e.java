package com.baidu.mapauto.auth.org.spongycastle.util.encoders;

import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes15.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8313a = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions};
    public final byte[] b = new byte[128];

    public e() {
        a();
    }

    public final void a() {
        int r0 = 0;
        int r1 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (r1 >= bArr.length) {
                break;
            }
            bArr[r1] = -1;
            r1++;
        }
        while (true) {
            byte[] bArr2 = this.f8313a;
            if (r0 >= bArr2.length) {
                byte[] bArr3 = this.b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.b[bArr2[r0]] = (byte) r0;
            r0++;
        }
    }
}
