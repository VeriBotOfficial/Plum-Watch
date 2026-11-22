package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2501hw extends AbstractC1681Mo implements Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final List<AbstractC2503hy> A0A;
    public final ArrayList<Integer> A09 = new ArrayList<>();
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public String A04 = A02(190, 2, 71);
    public final String A08 = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{BuiltinOptions.WhileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RangeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, BuiltinOptions.BatchMatMulOptions, 17, 26, 19, 27, 28, 23, 22, BuiltinOptions.GreaterEqualOptions, 19, 22, 1, BuiltinOptions.GreaterEqualOptions, 17, 29, 7, 28, 6, BuiltinOptions.NotEqualOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, 10, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DequantizeOptions, 10, BuiltinOptions.PowOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterEqualOptions, 10, BuiltinOptions.TransposeConvOptions, 32, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalOrOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorModOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NonMaxSuppressionV4Options, 64, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.FillOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CosOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CosOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RightShiftOptions, Byte.MAX_VALUE, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CosOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CosOptions, Byte.MAX_VALUE, BuiltinOptions.SelectV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ATan2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, 64, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableOptions, 64, BuiltinOptions.ATan2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RandomOptions, 64, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.IfOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, 64, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ResizeNearestNeighborOptions, 13, 14, 18, 23, 10, BuiltinOptions.ExpOptions, 24, 17, 12, 29, 27, BuiltinOptions.ExpOptions, 8, 23, 27, 9, 25, 31};
    }

    public C2501hw(List<AbstractC2503hy> list) {
        this.A0A = list;
    }

    public static C2501hw A00(JSONObject jSONObject, C2228dL c2228dL) throws JSONException {
        return A01(jSONObject, c2228dL, false);
    }

    public static C2501hw A01(JSONObject jSONObject, C2228dL c2228dL, boolean z) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A02(0, 3, 25));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (z) {
                arrayList.add(AnonymousClass77.A00(jSONArray.getJSONObject(i), c2228dL));
            } else {
                arrayList.add(AnonymousClass73.A00(jSONArray.getJSONObject(i), c2228dL));
            }
        }
        C2501hw c2501hw = new C2501hw(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A02(3, 12, 51));
        c2501hw.A04 = chainingParams.toString();
        c2501hw.A01 = chainingParams.optInt(A02(15, 17, 87), arrayList.size());
        c2501hw.A03 = chainingParams.optInt(A02(32, 24, 112), 0);
        c2501hw.A02 = chainingParams.optInt(A02(100, 24, 46), 0);
        c2501hw.A00 = chainingParams.optInt(A02(56, 19, 15), 2);
        c2501hw.A1K(chainingParams);
        c2501hw.A07 = chainingParams.optBoolean(A02(174, 16, 91), false);
        c2501hw.A06 = chainingParams.optBoolean(A02(146, 28, 22), false);
        c2501hw.A05 = chainingParams.optBoolean(A02(124, 22, 58), false);
        JSONArray optJSONArray = chainingParams.optJSONArray(A02(75, 25, 12));
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                c2501hw.A09.add(Integer.valueOf(optJSONArray.optInt(i2, 0)));
            }
        }
        return c2501hw;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1681Mo
    public final int A0l() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1681Mo
    public final int A0m() {
        return this.A03 + this.A02;
    }

    public final int A1t() {
        return this.A00;
    }

    public final int A1u() {
        return this.A01;
    }

    public final int A1v() {
        return this.A02;
    }

    public final AbstractC2503hy A1w() {
        if (!this.A0A.isEmpty()) {
            return this.A0A.get(0);
        }
        return null;
    }

    public final AbstractC2503hy A1x(int i) {
        return this.A0A.get(i);
    }

    public final String A1y() {
        return this.A08;
    }

    public final String A1z() {
        return this.A04;
    }

    public final String A20() {
        AbstractC2503hy firstAdDataBundle = A1w();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A25();
        }
        return null;
    }

    public final ArrayList<Integer> A21() {
        return this.A09;
    }

    public final void A22(int i) {
        this.A0A.remove(i);
        this.A01--;
    }

    public final boolean A23() {
        return this.A00 == 0;
    }

    public final boolean A24() {
        return this.A05;
    }

    public final boolean A25() {
        return this.A06;
    }

    public final boolean A26() {
        return this.A07;
    }

    public final boolean A27(int i) {
        return i >= 0 && i < this.A0A.size();
    }
}
