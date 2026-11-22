package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class XH {
    public static byte[] A0I;
    public static String[] A0J = {"rKrHA1ppiEGtpGml0yFHxQc7aUVdIlaK", "Q4SIGH0IwDzvXyGW0zafZen9gbqpyN1f", "xGmPyT38DpqIOoHtA0YJEsvJmmnM9rU2", "YMTGToIzL8UnFUS7pkYkKngwhslhjZnz", "", "FtuyiQzUiuUOiWtDKsyDRDOBtN4yprur", "", "qY4faXAnnIeFUOBxRnakMYaEddWfOrH2"};
    public static final String A0K;
    public View A0F;
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0I = new byte[]{0, 12, BuiltinOptions.BucketizeOptions, Byte.MAX_VALUE, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.NegOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PackOptions, 11, BuiltinOptions.NotEqualOptions, BuiltinOptions.SparseToDenseOptions, 58, BuiltinOptions.BatchMatMulOptions, Byte.MAX_VALUE, BuiltinOptions.LeakyReluOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMaxOptions, Byte.MAX_VALUE, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SelectOptions, 32, BuiltinOptions.CastOptions, BuiltinOptions.SelectOptions, BuiltinOptions.MaximumMinimumOptions, 21, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.WhereOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, 1, 10, 0, BuiltinOptions.SliceOptions, 13, 9, 1, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RandomOptions, BuiltinOptions.AbsOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.SelectOptions, 18, 20, 29, 0, 17, 23, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.PowOptions, 34, 18, 61, BuiltinOptions.PowOptions, BuiltinOptions.SparseToDenseOptions, 58, 22, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SliceOptions, 35, BuiltinOptions.EqualOptions, 20, 63, BuiltinOptions.SliceOptions, BuiltinOptions.TileOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CosOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.WhileOptions, 14, 25, 31, 19, 14, 24, 21, 18, 27, BuiltinOptions.IfOptions, 21, 17, 12, 14, 25, 15, 15, 21, 19, 18, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.IfOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.FillOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.LogSoftmaxOptions, 35, BuiltinOptions.NotEqualOptions, BuiltinOptions.CastOptions, 35, 14, 15, 17, 28, 12, 16};
    }

    static {
        A02();
        A0K = XH.class.getSimpleName();
    }

    private EnumC1936Wq A00() {
        if (this.A0G == null || this.A0F == null) {
            return EnumC1936Wq.A0J;
        }
        View view = this.A0G;
        String[] strArr = A0J;
        if (strArr[6].length() == strArr[4].length()) {
            String[] strArr2 = A0J;
            strArr2[6] = "";
            strArr2[4] = "";
            if (view != this.A0F) {
                EnumC1936Wq enumC1936Wq = EnumC1936Wq.A0H;
                String[] strArr3 = A0J;
                if (strArr3[7].charAt(18) != strArr3[1].charAt(18)) {
                    throw new RuntimeException();
                }
                A0J[0] = "tmBamhoJLli8fG7mmMEXMJcTnxwesBVw";
                return enumC1936Wq;
            }
            Object tag = this.A0G.getTag(EnumC1936Wq.A02);
            if (tag == null) {
                return EnumC1936Wq.A0I;
            }
            if (!(tag instanceof EnumC1936Wq)) {
                EnumC1936Wq enumC1936Wq2 = EnumC1936Wq.A0K;
                if (A0J[2].charAt(2) == 'm') {
                    A0J[0] = "fnwPYOgaVMSkQLAdq2SZMccx8Jl2b0fK";
                    return enumC1936Wq2;
                }
            } else {
                return (EnumC1936Wq) tag;
            }
        }
        throw new RuntimeException();
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        return -1L;
    }

    public final Map<String, String> A04() {
        long j;
        if (!this.A0H) {
            return null;
        }
        String valueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        if (this.A0C > 0 && this.A0D > this.A0C) {
            j = this.A0D - this.A0C;
        } else {
            j = -1;
        }
        HashMap hashMap = new HashMap();
        String valueOf2 = String.valueOf(this.A04);
        String radius = A01(20, 11, 76);
        hashMap.put(radius, valueOf2);
        String valueOf3 = String.valueOf(this.A05);
        String radius2 = A01(31, 11, 89);
        hashMap.put(radius2, valueOf3);
        String valueOf4 = String.valueOf(this.A06);
        String radius3 = A01(DeviceFeatures.CONFIG_SLEEP, 5, 30);
        hashMap.put(radius3, valueOf4);
        String valueOf5 = String.valueOf(this.A03);
        String radius4 = A01(102, 6, 98);
        hashMap.put(radius4, valueOf5);
        String A01 = A01(42, 14, 108);
        String radius5 = String.valueOf(j);
        hashMap.put(A01, radius5);
        String valueOf6 = String.valueOf(this.A0E);
        String radius6 = A01(165, 9, 118);
        hashMap.put(radius6, valueOf6);
        String valueOf7 = String.valueOf(this.A0D);
        String radius7 = A01(82, 7, 2);
        hashMap.put(radius7, valueOf7);
        String valueOf8 = String.valueOf(this.A0A);
        String radius8 = A01(174, 6, 102);
        hashMap.put(radius8, valueOf8);
        String valueOf9 = String.valueOf(this.A0B);
        String radius9 = A01(180, 6, 49);
        hashMap.put(radius9, valueOf9);
        String valueOf10 = String.valueOf(this.A07);
        String radius10 = A01(56, 6, 114);
        hashMap.put(radius10, valueOf10);
        String valueOf11 = String.valueOf(this.A08);
        String radius11 = A01(62, 6, 42);
        hashMap.put(radius11, valueOf11);
        String valueOf12 = String.valueOf(this.A07);
        String radius12 = A01(89, 4, 112);
        hashMap.put(radius12, valueOf12);
        String valueOf13 = String.valueOf(this.A08);
        String radius13 = A01(93, 4, 45);
        hashMap.put(radius13, valueOf13);
        String valueOf14 = String.valueOf(this.A00);
        String radius14 = A01(97, 5, 20);
        hashMap.put(radius14, valueOf14);
        String radius15 = A01(129, 7, 64);
        hashMap.put(radius15, valueOf);
        String radius16 = A01(136, 7, 98);
        hashMap.put(radius16, valueOf);
        String valueOf15 = String.valueOf(A00().A06());
        String radius17 = A01(68, 14, 90);
        hashMap.put(radius17, valueOf15);
        return hashMap;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 26) + this.A0C;
        }
    }

    public final void A06(C2228dL c2228dL, MotionEvent motionEvent, View view, View view2) {
        if (view == null) {
            c2228dL.A0F().AK0();
            return;
        }
        if (!this.A0H) {
            this.A0H = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                String[] strArr = A0J;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    String[] strArr2 = A0J;
                    strArr2[3] = "Gaq4uS8iinWfWA9p3yS2tuaxngbM8vTH";
                    strArr2[5] = "hEOHH5DdlsOTPss6NfO6KYKxbvbMxS72";
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
                    if (motionRange != null && motionRange2 != null) {
                        this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (iArr[0] / AbstractC1931Wl.A02);
                this.A05 = (int) (iArr[1] / AbstractC1931Wl.A02);
                this.A06 = (int) (view.getWidth() / AbstractC1931Wl.A02);
                this.A03 = (int) (view.getHeight() / AbstractC1931Wl.A02);
                this.A09 = 1;
                this.A0E = System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / AbstractC1931Wl.A02);
                int touchStartYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A0B = (int) (touchStartYInPx / AbstractC1931Wl.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = System.currentTimeMillis();
                this.A07 = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / AbstractC1931Wl.A02);
                int touchEndYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A08 = (int) (touchEndYInPx / AbstractC1931Wl.A02);
                this.A0F = view2;
                return;
            case 2:
                this.A00 -= this.A00 / this.A09;
                this.A00 += motionEvent.getPressure() / this.A09;
                this.A02 -= this.A02 / this.A09;
                this.A02 += motionEvent.getSize() / this.A09;
                this.A09++;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(Context context) {
        boolean z;
        int A07 = U7.A07(context);
        long A03 = A03();
        if (A07 >= 0 && A03 < A07) {
            z = true;
        } else {
            z = false;
        }
        if (BuildConfigApi.isDebug()) {
            String str = A01(108, 21, 55) + z + A01(2, 18, 57) + A07 + A01(0, 2, 74) + A03;
        }
        return z;
    }
}
