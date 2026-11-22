package com.facebook.ads.redexgen.core;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class VJ implements UR {
    public static byte[] A0D;
    public static String[] A0E = {"KlcQ4aPMCjTEuj6tlqvSPg02tmhmGUou", "NbdeitWOc1zrv1JDjauqKHmjPPhSGwGe", "R4vSD9xrU3uFkHfeeGcLq0xvgbIcHayT", "rvVAUvGslDbkwSzXQ4gHiQTP5zrG", "ljLEgEfbMYnmdR7mWy3vUvMk8HSCwfcz", "YjYM3cC5SO9DuryblpH9N9a8sNamrwLD", "dglxEHbBnsXp5lOZvNi9PFSn5QE5iyod", "nrMzKM4Ejqm74mRasA"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C2202cu A06;
    public final UQ A07;
    public final InterfaceC2307ed A08;
    public volatile boolean A0C;
    public final Runnable A0A = new VL(this);
    public final Runnable A09 = new VK(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[2].charAt(25) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "STFGVVXWKW9SjLATYObI8PiLTu9r";
            strArr[7] = "1bj9PcPMGQWJpkILDx";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
            i4++;
        }
    }

    public static void A07() {
        A0D = new byte[]{BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CosOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BroadcastToOptions, Byte.MAX_VALUE, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SignOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpandDimsOptions, 64, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CastOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CastOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.PadV2Options, BuiltinOptions.RangeOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableFindOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, 58, BuiltinOptions.Conv3DOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Rfft2dOptions, Byte.MAX_VALUE, BuiltinOptions.RightShiftOptions, 58, BuiltinOptions.Conv3DOptions, BuiltinOptions.SignOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, 58, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.NotEqualOptions, 58, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitwiseXorOptions, 58, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, 58, BuiltinOptions.GeluOptions, Byte.MAX_VALUE, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableSizeOptions, 58, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, Byte.MAX_VALUE, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.NegOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.NegOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.NegOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.LogSoftmaxOptions, 0, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ExpOptions, 61, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BucketizeOptions, 61, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.RightShiftOptions, 32, BuiltinOptions.DequantizeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, 32, 32, BuiltinOptions.EqualOptions, BuiltinOptions.DequantizeOptions, 63, BuiltinOptions.BucketizeOptions, 32, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.BucketizeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.EqualOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.GeluOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SignOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.EqualOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SignOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, 1, 3, 26, 26, 3, 4, 13, BuiltinOptions.ResizeNearestNeighborOptions, 14, 3, 25, 26, 11, 30, 9, 2, BuiltinOptions.ResizeNearestNeighborOptions, 14, 31, 15, BuiltinOptions.ResizeNearestNeighborOptions, 30, 5, BuiltinOptions.ResizeNearestNeighborOptions, 6, 11, 9, 1, BuiltinOptions.ResizeNearestNeighborOptions, 5, 12, BuiltinOptions.ResizeNearestNeighborOptions, 9, 5, 4, 4, 15, 9, 30, 3, 28, 3, 30, 19, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 32, BuiltinOptions.CastOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, 3, 16, 3, 8, 18, 21, BuiltinOptions.PackOptions, BuiltinOptions.NegOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.SelectOptions};
    }

    static {
        A07();
        A0F = UR.class.getSimpleName();
    }

    public VJ(C2202cu c2202cu, UQ uq) {
        this.A07 = uq;
        this.A06 = c2202cu;
        this.A04 = (ConnectivityManager) c2202cu.getSystemService(A03(SportTypeConstant.Course_32, 12, 115));
        this.A08 = C2325ev.A01(c2202cu);
        this.A03 = U9.A0K(c2202cu);
        this.A02 = U9.A0J(c2202cu);
    }

    public static /* synthetic */ int A00(VJ vj) {
        int i = vj.A00 + 1;
        vj.A00 = i;
        return i;
    }

    private void A05() {
        this.A06.A05().AAF();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.ACJ();
        }
    }

    private void A06() {
        if (this.A00 >= U9.A09(this.A06)) {
            A05();
            A5t();
            return;
        }
        int i = this.A00;
        if (A0E[4].charAt(15) == 'm') {
            String[] strArr = A0E;
            strArr[0] = "48XWu56AgSaDG2v80CTGd4cBK4h9Z0cs";
            strArr[1] = "AYX5vj0PphgSAPbgEesjNh2Dg1h2Tuc1";
            if (i == 1) {
                this.A01 = U9.A0I(this.A06);
            } else {
                long j = this.A01 * 2;
                String[] strArr2 = A0E;
                if (strArr2[5].charAt(19) == strArr2[6].charAt(19)) {
                    String[] strArr3 = A0E;
                    strArr3[0] = "1ToF3hMm2VA6KDOeCYlfpYX9EZhWZaCs";
                    strArr3[1] = "Z30ky6DQTC9ucfzgiQKOMI68k5hVrHHu";
                    this.A01 = j;
                }
            }
            A5u();
            return;
        }
        throw new RuntimeException();
    }

    private void A08(long j) {
        this.A05.postDelayed(this.A09, j);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Map<String, String> shortEvnData = this.A06.A04().A5S();
        for (Map.Entry<String, String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() {
        try {
            NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A05().AAF()) {
                    Log.e(A0F, A03(240, 46, 39));
                }
                A08(this.A02);
                return;
            }
            this.A06.A05().AAF();
            JSONObject A5D = this.A07.A5D();
            if (A5D == null) {
                this.A06.A05().AAF();
                A05();
                return;
            }
            boolean AAF = this.A06.A05().AAF();
            String A03 = A03(309, 6, 43);
            if (AAF && A5D.has(A03)) {
                JSONArray jSONArray = A5D.getJSONArray(A03);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String str = A03(4, 19, 81) + i + A03(0, 3, 14) + jSONArray.get(i);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 102), String.valueOf(this.A00));
            A09(jSONObject);
            A5D.put(A03(305, 4, 9), jSONObject);
            C2321er c2321er = new C2321er();
            c2321er.put(A03(315, 7, 6), A5D.toString());
            InterfaceC2306ec AGD = this.A08.AGD(this.A06.A05().A7y(), c2321er.A08());
            String A6v = AGD != null ? AGD.A6v() : null;
            if (!TextUtils.isEmpty(A6v) && AGD != null) {
                if (AGD.A94() != 200) {
                    if (this.A06.A05().AAF()) {
                        String responseBody = A0F;
                        Log.e(responseBody, A03(138, 48, 30) + AGD.A94() + A03(3, 1, 55));
                    }
                    if (AGD.A94() == 413 && U7.A2R(this.A06)) {
                        this.A07.AEr();
                        A05();
                        return;
                    } else {
                        if (A5D.has(A03)) {
                            this.A07.AD0(A5D.getJSONArray(A03));
                        }
                        A06();
                        return;
                    }
                }
                if (!this.A07.AD1(new JSONArray(A6v))) {
                    if (this.A06.A05().AAF()) {
                        Log.w(A0F, A03(DeviceFeatures.CONFIG_SLEEP, 54, 88));
                    }
                    A06();
                    return;
                } else {
                    if (this.A07.AAS()) {
                        if (this.A06.A05().AAF()) {
                            Log.i(A0F, A03(58, 55, 87));
                        }
                        A06();
                        return;
                    }
                    A05();
                    return;
                }
            }
            if (this.A06.A05().AAF()) {
                Log.e(A0F, A03(113, 25, 71));
            }
            if (U7.A2G(this.A06) && A5D.has(A03)) {
                this.A07.AD0(A5D.getJSONArray(A03));
            }
            A06();
        } catch (Exception e) {
            C2202cu c2202cu = this.A06;
            String[] strArr = A0E;
            if (strArr[0].charAt(26) != strArr[1].charAt(26)) {
                Exception e2 = new RuntimeException();
                throw e2;
            }
            String[] strArr2 = A0E;
            strArr2[5] = "juVm3rSGrTKw83uGBob9EWWg86xlgGIp";
            strArr2[6] = "uyuZsDIDSXItwx867Sl9CxjwWd0LLO11";
            if (c2202cu.A05().AAF()) {
                Log.e(A0F, A03(23, 35, 72), e);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UR
    public final void A5t() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.UR
    public final void A5u() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
