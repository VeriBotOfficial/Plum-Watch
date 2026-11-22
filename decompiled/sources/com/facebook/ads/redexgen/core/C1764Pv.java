package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1764Pv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1775Qg A04;
    public AbstractC1775Qg A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ShapeOptions, 2, BuiltinOptions.CallOnceOptions, 14, 2, BuiltinOptions.FillOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SignOptions, 31, BuiltinOptions.SquaredDifferenceOptions, 64, 14, 5, 23, BuiltinOptions.ArgMaxOptions, 15, 12, 4, 5, 18, BuiltinOptions.WhileOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixSetDiagOptions, 14, 21, 34, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LeakyReluOptions, 31, 4, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.RankOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, 64, BuiltinOptions.RangeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.CallOnceOptions, 64, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, 19};
    }

    public C1764Pv(AbstractC1775Qg abstractC1775Qg, AbstractC1775Qg abstractC1775Qg2) {
        this.A05 = abstractC1775Qg;
        this.A04 = abstractC1775Qg2;
    }

    public C1764Pv(AbstractC1775Qg abstractC1775Qg, AbstractC1775Qg abstractC1775Qg2, int i, int i2, int i3, int i4) {
        this(abstractC1775Qg, abstractC1775Qg2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + AbstractJsonLexerKt.END_OBJ;
    }
}
