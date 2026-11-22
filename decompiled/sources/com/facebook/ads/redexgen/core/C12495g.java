package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.5g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C12495g {
    public static byte[] A0G;
    public static String[] A0H = {"PO8jPPjsWkSohvoClx2DXSl8S5WX59Vo", "WTC2lbEoOF", "JF48xkVfbyUi8xBtmw", "8DzCN5fkinelgfDbo7bZLAsZpLiI5tji", "0XqHByXaOSOjXRziBAqROkukCru0GxwN", "eULZ8KrR2sSax75EYp3yLx1S0uA0IndI", "SEYTT", "AcNYjN6U0IjRu5cSurFZ1FZkr4vsIKRe"};

    @MetaExoPlayerCustomization("The average time that it takes to decode frames expressed in milliseconds")
    public int A00;

    @MetaExoPlayerCustomization("The average time that it takes to render frames expressed in milliseconds")
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;

    @MetaExoPlayerCustomization("Total number of samples used to calculate average decode and render times")
    public int A0C;
    public int A0D;

    @MetaExoPlayerCustomization("The number of frames that were in a gap and skipped as a result of it")
    public int A0E;
    public long A0F;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0G = new byte[]{19, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, 20, BuiltinOptions.PowOptions, 34, BuiltinOptions.ArgMinOptions, 35, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, 30, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SignOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, 5, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PackOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DequantizeOptions, 34, BuiltinOptions.SparseToDenseOptions, 34, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 30, BuiltinOptions.ArgMinOptions, BuiltinOptions.MaximumMinimumOptions, 34, 35, 21, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 30, BuiltinOptions.ArgMinOptions, BuiltinOptions.MaximumMinimumOptions, 34, 35, 21, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 24, 34, 35, BuiltinOptions.MaximumMinimumOptions, 34, 35, 21, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 24, 34, 35, BuiltinOptions.MaximumMinimumOptions, 34, 35, 21, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 21, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 30, BuiltinOptions.ArgMinOptions, BuiltinOptions.MaximumMinimumOptions, 34, 35, 21, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 58, BuiltinOptions.NotEqualOptions, BuiltinOptions.SelectOptions, 20, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, 34, 35, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SparseToDenseOptions, 19, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 21, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 3, BuiltinOptions.PowOptions, 28, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, 58, BuiltinOptions.SparseToDenseOptions, 18, BuiltinOptions.ExpOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMinOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 35, BuiltinOptions.PowOptions, 35, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, 1, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PowOptions, 17, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, 58, BuiltinOptions.SparseToDenseOptions, 7, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SliceOptions, 24, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SparseToDenseOptions, 35, 2, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PowOptions, 17, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, 58, BuiltinOptions.SparseToDenseOptions, 7, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SliceOptions, 24, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SparseToDenseOptions, 35, 20, BuiltinOptions.PowOptions, 34, BuiltinOptions.ArgMinOptions, 35, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NegOptions};
    }

    static {
        A01();
    }

    public final synchronized void A02() {
    }

    @MetaExoPlayerCustomization
    public final void A03(long j) {
        this.A01 = this.A09 == 0 ? -1 : (int) (j / this.A09);
        String[] strArr = A0H;
        if (strArr[5].charAt(27) != strArr[4].charAt(27)) {
            throw new RuntimeException();
        }
        A0H[1] = "yfB4vc6THQ";
    }

    @MetaExoPlayerCustomization
    public final void A04(Pair<Long, Integer> newSamplePerFrameDecodeTimeAndCount) {
        int i;
        this.A0C += ((Integer) newSamplePerFrameDecodeTimeAndCount.second).intValue();
        long updatedTotalDecodeTime = ((Long) newSamplePerFrameDecodeTimeAndCount.first).longValue() + (this.A0C * this.A00);
        if (this.A0C == 0) {
            i = -1;
        } else {
            long currentTotalDecodeTime = this.A0C;
            i = (int) (updatedTotalDecodeTime / currentTotalDecodeTime);
        }
        this.A00 = i;
    }

    public final String toString() {
        return AbstractC12174a.A0n(A00(0, 333, 101), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A08), Integer.valueOf(this.A0A), Integer.valueOf(this.A09), Integer.valueOf(this.A0B), Integer.valueOf(this.A04), Integer.valueOf(this.A05), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Long.valueOf(this.A0F), Integer.valueOf(this.A0D));
    }
}
