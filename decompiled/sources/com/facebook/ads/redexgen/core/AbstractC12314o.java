package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12314o {
    public static byte[] A00;
    public static String[] A01 = {"ftBSrscYCZrU1XGsUffOBJlxDQfDqofj", "6A6pNCV2uhgoYcLypb", "8GOV2FUSZps1pTbJ4je5MwftASUnZkM1", "4wRLkwVxN17llLy", "8LQiKKC5rqzUsPzG", "bVt1RMPFhi5Vk9jMxK8mGuGgg99xJtg4", "bUya0H86JSXRIIoahVHYTIdtcqgWtSBf", "i4ePvK4hrBrPNKxpSWALXVVM3"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(SQLiteDatabase sQLiteDatabase, int i, String str) throws C12284l {
        try {
            if (!AbstractC12174a.A19(sQLiteDatabase, A01(159, 17, 73))) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query(A01(159, 17, 73), new String[]{A01(244, 7, 93)}, A01(183, 32, 22), A05(i, str), null, null, null);
            try {
                if (query.getCount() == 0) {
                    if (query != null) {
                        query.close();
                    }
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i2;
            } finally {
            }
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.ShapeOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.RankOptions, 34, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpandDimsOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.RankOptions, 63, BuiltinOptions.SliceOptions, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.RankOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, 63, BuiltinOptions.CastOptions, 34, BuiltinOptions.CastOptions, BuiltinOptions.RankOptions, BuiltinOptions.TileOptions, 14, 25, BuiltinOptions.DequantizeOptions, 26, 23, 15, 19, 4, 32, 19, 4, 5, 31, 25, 24, 5, BuiltinOptions.RankOptions, BuiltinOptions.DepthToSpaceOptions, 16, 19, 23, 2, 3, 4, 19, BuiltinOptions.RankOptions, 63, BuiltinOptions.PowOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, 35, 58, 58, BuiltinOptions.MatrixSetDiagOptions, 31, 24, 5, 2, 23, 24, 21, 19, BuiltinOptions.LessOptions, 3, 31, 18, BuiltinOptions.RankOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, 34, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, 35, 58, 58, BuiltinOptions.MatrixSetDiagOptions, 0, 19, 4, 5, 31, 25, 24, BuiltinOptions.RankOptions, 63, BuiltinOptions.PowOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, 35, 58, 58, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogSoftmaxOptions, 63, BuiltinOptions.PackOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.RankOptions, 61, BuiltinOptions.TileOptions, BuiltinOptions.SelectOptions, BuiltinOptions.RankOptions, BuiltinOptions.DepthToSpaceOptions, 16, 19, 23, 2, 3, 4, 19, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RankOptions, 31, 24, 5, 2, 23, 24, 21, 19, BuiltinOptions.LessOptions, 3, 31, 18, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV4Options, 29, 32, BuiltinOptions.ShapeOptions, 8, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpOptions, 61, BuiltinOptions.NegOptions, 14, 61, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PowOptions, 64, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, 64, 9, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, 9, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquareOptions, 9, 14, 19, 20, 1, 14, 3, 5, 63, 21, 9, 4, 58, BuiltinOptions.LessOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.CastOptions, 35, 34};
        String[] strArr = A01;
        if (strArr[6].charAt(14) == strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        A01[7] = "SNjSmBwt36dpbjCWXjm4KdaDp";
    }

    static {
        A02();
        C2T.A03(A01(215, 17, 54));
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, int i, String str) throws C12284l {
        String A012 = A01(159, 17, 73);
        try {
            if (!AbstractC12174a.A19(sQLiteDatabase, A012)) {
                return;
            }
            sQLiteDatabase.delete(A012, A01(183, 32, 22), A05(i, str));
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws C12284l {
        try {
            sQLiteDatabase.execSQL(A01(0, 159, 103));
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(176, 7, 16), Integer.valueOf(i));
            contentValues.put(A01(DeviceFeatures.HEADSET_KEY_CALL, 12, 113), str);
            contentValues.put(A01(244, 7, 93), Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow(A01(159, 17, 73), null, contentValues);
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    public static String[] A05(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }
}
