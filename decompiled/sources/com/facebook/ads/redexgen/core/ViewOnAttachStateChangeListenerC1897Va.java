package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnAttachStateChangeListenerC1897Va extends AbstractC2950ps implements View.OnAttachStateChangeListener {
    public static byte[] A02;
    public final View A00;
    public final C2202cu A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Byte.MAX_VALUE, 64, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, 9, Byte.MAX_VALUE, 64, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.DepthToSpaceOptions, 9, BuiltinOptions.BidirectionalSequenceLSTMOptions, 64, BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, 9, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, 9, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 9, 9, 11, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessOptions, BuiltinOptions.BitwiseXorOptions, 11, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.NegOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PowOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 58, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, 14, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TileOptions, 19, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.NegOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, 17, BuiltinOptions.CallOnceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 17, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CosOptions, 17, BuiltinOptions.AddNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SquareOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.RankOptions, 17, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.NonMaxSuppressionV4Options, 17, 17, 8, 30, 24, 20, 21, 31, BuiltinOptions.LogSoftmaxOptions, 24, 19, 26, 21, 21, 30, 23};
    }

    public ViewOnAttachStateChangeListenerC1897Va(View view, C2202cu c2202cu) {
        this.A00 = view;
        this.A01 = c2202cu;
        this.A00.addOnAttachStateChangeListener(this);
        if (A05()) {
            try {
                A00();
            } catch (Throwable th) {
                this.A01.A08().AAy(A00(137, 14, 83), 3600, new C1842Sw(A00(0, 45, 1) + th.getMessage()));
            }
        }
    }

    public final void A04() {
        try {
            A00();
        } catch (Throwable th) {
            this.A01.A08().AAy(A00(137, 14, 83), 3600, new C1842Sw(A00(45, 48, 117) + th.getMessage()));
        }
    }

    public final boolean A05() {
        return P3.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        try {
            A00();
        } catch (Throwable th) {
            this.A01.A08().AAy(A00(137, 14, 83), 3600, new C1842Sw(A00(0, 45, 1) + th.getMessage()));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        try {
            A02();
        } catch (Throwable th) {
            this.A01.A08().AAy(A00(137, 14, 83), 3600, new C1842Sw(A00(93, 44, 25) + th.getMessage()));
        }
    }
}
