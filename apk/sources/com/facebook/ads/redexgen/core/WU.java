package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONArray;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum WU {
    A07(0),
    A0G(1),
    A08(2),
    A0H(3),
    A09(4),
    A06(5),
    A0E(6),
    A0F(7),
    A0K(8),
    A0D(9),
    A0A(10),
    A0I(11),
    A0J(16),
    A0C(17),
    A0B(18);

    public static byte[] A01;
    public static String[] A02 = {"GbuBsSM1xhQoS8Y9reObCc9WG4REEdk3", "3inGwPOv", "kEgr1UstPMrvCW01nPyEnw", "sDtxFhHTxnkounG", "sPUJsFRJw3lzzMTWDdjyjiVEH8hW8JO7", "B8rHcVyybdzy0uHTSoedXLBdMJjc3Dyy", "NVuWY3VIAgTMV2CQJlZL2IdcLJ4", "cMObfoRVVv9ZpGW59yOoyGmNv0XOfBEh"};
    public static final WU[] A03;
    public static final String A04;
    public final int A00;

    public static String A02(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {BuiltinOptions.MatrixDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ATan2Options, 127, BuiltinOptions.PadV2Options, 58, 58, BuiltinOptions.EqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.HashtableSizeOptions, 127, 127, BuiltinOptions.ReadVariableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SignOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FillOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ExpandDimsOptions, 32, BuiltinOptions.ShapeOptions, 35, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, 34, 34, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SliceOptions, 8, 15, 13, 8, 15, 4, 30, 23, 8, 5, 4, 14, 30, 0, 5, BuiltinOptions.WhileOptions, BuiltinOptions.FillOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 21, 12, 0, 11, 13, 22, 24, 24, 26, 13, 0, 17, 16, 0, 30, 10, 11, 16, 0, 22, 18, 15, 0, 19, 16, 24, 24, 22, 17, 24, BuiltinOptions.CallOnceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.GeluOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.DepthToSpaceOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.TileOptions, 3, 12, 25, 4, 27, 8, 18, 14, 1, 2, 30, 8, 18, 15, 24, 25, 25, 2, 3, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TileOptions, 63, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.EqualOptions, 61, 61, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, 61, BuiltinOptions.ArgMinOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, 32, BuiltinOptions.SliceOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PadV2Options};
        if (A02[5].charAt(26) != 'j') {
            throw new RuntimeException();
        }
        A02[5] = "gBI5PCJLXGTma8ivl9EUy8DAEVjXdNbR";
        A01 = bArr;
    }

    static {
        A03();
        A03 = new WU[]{A0H, A09, A06, A0F, A0I, A0J, A0C, A0B};
        JSONArray jSONArray = new JSONArray();
        for (WU supportedCapability : A03) {
            jSONArray.put(supportedCapability.A00());
        }
        A04 = jSONArray.toString();
    }

    WU(int r3) {
        this.A00 = r3;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A04;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
