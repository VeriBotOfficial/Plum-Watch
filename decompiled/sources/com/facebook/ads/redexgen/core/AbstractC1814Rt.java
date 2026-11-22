package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1814Rt {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, BuiltinOptions.EqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.SplitVOptions, 64, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.IfOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, Byte.MAX_VALUE, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.TileOptions, Byte.MAX_VALUE, BuiltinOptions.BucketizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.WhileOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.WhereOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableSizeOptions, 18, 23, 19, 23, 10, BuiltinOptions.ExpOptions, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C1813Rs A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, 113);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c = null;
        try {
            c = contentResolver.query(WQ.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c == null || !c.moveToFirst()) {
                return new C1813Rs(null, null, false);
            }
            String string = c.getString(c.getColumnIndex(A013));
            String attributionId = c.getString(c.getColumnIndex(A012));
            C1813Rs c1813Rs = new C1813Rs(string, attributionId, Boolean.valueOf(c.getString(c.getColumnIndex(A01))).booleanValue());
            if (c != null) {
                c.close();
            }
            return c1813Rs;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
