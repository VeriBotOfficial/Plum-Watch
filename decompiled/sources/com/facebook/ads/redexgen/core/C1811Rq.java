package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1811Rq {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.LessOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterEqualOptions, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpOptions, BuiltinOptions.PackOptions, BuiltinOptions.ExpOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectOptions, 1, BuiltinOptions.GreaterOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.WhereOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, BuiltinOptions.RankOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableImportOptions, 24, 20, 22, BuiltinOptions.WhereOptions, 29, 26, 24, 30, 25, 20, 20, 16, BuiltinOptions.WhereOptions, 26, 31, 8, BuiltinOptions.WhereOptions, 18, 31, 29, 26, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SignOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentMinOptions};
    }

    public C1811Rq(SQ sq) {
        this.A00 = sq.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), sq), 0);
    }

    public final C1810Rp A02() {
        SharedPreferences sharedPreferences = this.A00;
        String A00 = A00(0, 13, 55);
        if (sharedPreferences.contains(A00)) {
            return new C1810Rp(this.A00.getString(A00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), EnumC1809Ro.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return C1810Rp.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(C1810Rp c1810Rp) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(0, 13, 55), c1810Rp.A03());
        edit.putBoolean(A00(54, 15, 96), c1810Rp.A04());
        edit.putLong(A00(26, 7, 65), c1810Rp.A01());
        edit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(13, 13, 78), str);
        edit.apply();
    }
}
