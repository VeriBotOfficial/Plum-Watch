package com.facebook.ads.redexgen.core;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Sd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1823Sd {
    public static byte[] A01;
    public final SZ A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{BuiltinOptions.WhereOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.CosOptions, 35, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.CosOptions, BuiltinOptions.NonMaxSuppressionV4Options, 4, 8, BuiltinOptions.SplitVOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, 64, BuiltinOptions.RangeOptions, BuiltinOptions.GreaterOptions, 6, 16, 13, 18, BuiltinOptions.SelectV2Options, 22, 3, 0, 14, 7, BuiltinOptions.SelectV2Options, 11, 4, BuiltinOptions.SelectV2Options, 7, 26, 11, 17, 22, 17, BuiltinOptions.SelectV2Options, 34, BuiltinOptions.ExpandDimsOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.ReverseV2Options};
    }

    public abstract String A06();

    public abstract SX[] A0A();

    public AbstractC1823Sd(SZ sz) {
        this.A00 = sz;
    }

    private String A00() {
        SX[] A0A = A0A();
        if (A0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i = 0; i < A0A.length - 1; i++) {
            result = result + A0A[i].A02() + A01(20, 2, 43);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static String A02(String str, SX[] sxArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 114));
        for (int i = 0; i < sxArr.length - 1; i++) {
            sb.append(sxArr[i].A01);
            sb.append(A01(20, 2, 43));
        }
        sb.append(sxArr[sxArr.length - 1].A01);
        sb.append(A01(6, 6, 21));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, SX[] sxArr, SX sx) {
        return A02(str, sxArr) + A01(12, 7, 119) + sx.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
