package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Qy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1793Qy implements AdSettingsApi {
    public static byte[] A00;
    public static String[] A01 = {"5g08JbOH8rkW6qlmlOL6A29nsZk", "3r4qaOnTaYokldocBIi2hcDPsInD4tfb", "t1tpXM0pz4jVDPHhq8DkXYPWitYDcWj1", "M2cS8KouRYddMtKm0nW0nVVXMs", "pym3fLCD1Tj466B1DlzVQDM4sLBUPDKC", "ku7CSS8RQpD6IDBrWEnqwcDf2zEQuZtv", "vquYYtSubxB68XLpTdo3CiQszZtPPcit", "yyxMEkIlFEzZN5mv2HKHli04TbghSWGE"};
    public static final String A02;
    public static final Collection<String> A03;
    public static volatile boolean A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
            String[] strArr = A01;
            if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                throw new RuntimeException();
            }
            A01[0] = "ed4gaD";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{14, 5, 23, 15, 8, 14, 3, 24, 25, 10, 21, 31, 25, 3, 21, 24, 3, 20, 29, 15, 20, 3, 23, 25, 5, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ATan2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SliceOptions, BuiltinOptions.Rfft2dOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SliceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SliceOptions, BuiltinOptions.RankOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, Byte.MAX_VALUE, BuiltinOptions.SignOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SliceOptions, BuiltinOptions.Rfft2dOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SliceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.SliceOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SliceOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, Byte.MAX_VALUE, BuiltinOptions.BitcastOptions, BuiltinOptions.BitcastOptions, Byte.MAX_VALUE, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BucketizeOptions, Byte.MAX_VALUE, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, Byte.MAX_VALUE, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BitcastOptions, Byte.MAX_VALUE, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.NegOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.GeluOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.FillOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CosOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.PowOptions, BuiltinOptions.SparseToDenseOptions, 7, 6, 21, 10, 0, 6, BuiltinOptions.NegOptions, 7, BuiltinOptions.PadV2Options, 2, 16, 11, BuiltinOptions.CallOnceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, 16, 4, 9, 30, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UniqueOptions, 22, BuiltinOptions.BitcastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ATan2Options};
    }

    static {
        A01();
        A02 = AdInternalSettings.class.getSimpleName();
        A03 = new HashSet();
        A03.add(A00(262, 3, 66));
        A03.add(A00(252, 10, 79));
        A03.add(A00(265, 7, 41));
        A03.add(A00(272, 8, 69));
        A04 = false;
    }

    public static void A02(String str) {
        if (A04) {
            return;
        }
        A04 = true;
        Log.i(A02, A00(25, 23, 65) + str);
        Log.i(A02, A00(48, 192, 95) + str + A00(0, 3, 99));
    }

    @Override // com.facebook.ads.internal.api.AdSettingsApi
    public final boolean isTestMode(Context context) {
        if (!AdInternalSettings.isDebugBuild() && !AdInternalSettings.isExplicitTestMode()) {
            Collection<String> collection = A03;
            String str = Build.PRODUCT;
            String[] strArr = A01;
            if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "T4gBNxEGe37wgzXKS7GC3py1fkLao5wI";
            strArr2[1] = "pVb2nflAxo98tm2kzzD3dq5aQ79B8LIX";
            if (!collection.contains(str)) {
                MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                String A002 = A00(3, 22, 19);
                String string = multithreadedBundleWrapper.getString(A002, null);
                if (string == null) {
                    SharedPreferences A003 = AbstractC1900Ve.A00(context);
                    String A004 = A00(240, 12, 44);
                    string = A003.getString(A004, null);
                    if (TextUtils.isEmpty(string)) {
                        string = UUID.randomUUID().toString();
                        SharedPreferences.Editor edit = A003.edit();
                        String[] strArr3 = A01;
                        if (strArr3[7].charAt(16) != strArr3[1].charAt(16)) {
                            A01[3] = "RjRRqTdr5YFfB1Oiza3DhfcwhE";
                            edit.putString(A004, string).apply();
                        } else {
                            edit.putString(A004, string).apply();
                        }
                    }
                    AdInternalSettings.sSettingsBundle.putString(A002, string);
                }
                if (AdInternalSettings.getTestDevicesList().contains(string)) {
                    return true;
                }
                A02(string);
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.internal.api.AdSettingsApi
    public final void turnOnDebugger() {
        VF.A02();
    }
}
