package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class TM {
    public static byte[] A00;
    public static String[] A01 = {"45sljFocWSeUIm", "kFy0iLqCQu1rSjegRu3gZQBslrN28zfh", "Jt25Esr0vPr63IR3ofREXbE2F9XS", "aIy3uOWBpnLKLBqKI1xznCdUmB4uZWmr", "OU2R0KFOTNKkc0fC1q8eYWzKYBY", "OKiYeSmWG", "N6c8h1LLghxAImqWtVZLONNsuls", "y1x9YRSrIuYSzULWME6mF7szl8n2nmJ"};
    public static final String A02;
    public static final AtomicBoolean A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{BuiltinOptions.HashtableFindOptions, 0, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.DequantizeOptions, 1, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.CastOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquaredDifferenceOptions, 8, BuiltinOptions.SignOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.DensifyOptions, 8, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.IfOptions, 8, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixSetDiagOptions, 8, BuiltinOptions.UniqueOptions, 16, 30, 17, 6, 26, 31, 23, 12, 7, 10, 3, 22, 25, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ATan2Options, BuiltinOptions.PackOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ATan2Options, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.ShapeOptions, 63, BuiltinOptions.LessEqualOptions, 63, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NonMaxSuppressionV5Options, 21, 20, 19, 4, 22, BuiltinOptions.DensifyOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, 20, BuiltinOptions.NotEqualOptions, 61, BuiltinOptions.NegOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.TileOptions, 34, BuiltinOptions.ArgMinOptions, 13, BuiltinOptions.ExpOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FloorModOptions, 61, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogicalAndOptions, 6, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogicalOrOptions, 15, 13, 6, 13, 26, 1, 11, BuiltinOptions.BucketizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.SignOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, Byte.MAX_VALUE, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.WhereOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BroadcastToOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.VarHandleOptions, 12, 22, 58, 0, 8, 16, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FillOptions};
    }

    static {
        A06();
        A02 = TM.class.getSimpleName();
        A03 = new AtomicBoolean();
    }

    public static int A00() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static long A01(SQ sq, String str) {
        try {
            PackageManager packageManager = sq.getPackageManager();
            if (packageManager == null) {
                return -1L;
            }
            return new File(packageManager.getApplicationInfo(str, 0).publicSourceDir).length();
        } catch (Exception e) {
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "r1yKAsFrz8T6kTbDeRMAIryo3adSH8UC";
            strArr2[3] = "KmyFzAC6ois190XCewwcScJ1n5axjY80";
            if (A03.compareAndSet(false, true)) {
                sq.A08().AAy(A02(144, 7, 94), AbstractC1841Sv.A1E, new C1842Sw(e));
            }
            return -1L;
        }
    }

    public static String A03(Context context) {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(37, 10, 101));
            return (String) buildType.get(null);
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A04(Context context) {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(71, 5, 103));
            return String.valueOf(buildType.getBoolean(null));
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A05(SQ sq, String str) {
        JSONObject jSONObject = new JSONObject();
        A07(sq, jSONObject, A02(174, 6, 83), String.valueOf(A08()));
        A07(sq, jSONObject, A02(97, 8, 100), String.valueOf(A01(sq, str)));
        A07(sq, jSONObject, A02(180, 15, 21), String.valueOf(A00()));
        A07(sq, jSONObject, A02(105, 18, 51), String.valueOf(W6.A00(sq)));
        A07(sq, jSONObject, A02(161, 13, 60), String.valueOf(A09(sq)));
        A07(sq, jSONObject, A02(133, 11, 111), A04(sq));
        A07(sq, jSONObject, A02(123, 10, 27), A03(sq));
        return jSONObject.toString();
    }

    public static void A07(SQ sq, JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            if (sq.A05().AAF()) {
                Log.e(A02, A02(47, 24, 108), e);
            }
        }
    }

    public static boolean A08() {
        String str = Build.FINGERPRINT;
        String A022 = A02(144, 7, 94);
        if (!str.contains(A022) && !Build.FINGERPRINT.startsWith(A02(195, 7, 28))) {
            String str2 = Build.MODEL;
            String A023 = A02(151, 10, 34);
            if (!str2.contains(A023) && !Build.MODEL.contains(A02(76, 8, 16))) {
                String str3 = Build.MODEL;
                String[] strArr = A01;
                if (strArr[6].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "CTJ6oNGQrsuCzXfrpGcSjdlcrxq";
                strArr2[4] = "Vk4ircYNHpPTfJ73X6WLPy0mTCx";
                if (!str3.contains(A02(12, 25, 30)) && !Build.MANUFACTURER.contains(A02(84, 10, 101)) && ((!Build.BRAND.startsWith(A022) || !Build.DEVICE.startsWith(A022)) && !A023.equals(Build.PRODUCT))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A09(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
