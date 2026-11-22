package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Bv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1405Bv {
    public static byte[] A07;
    public static String[] A08 = {"CYKD2nMMR2kwPobHu8vj2zaJDmBsbtuJ", "1T97HHMVTjXeNt4gEkhbfce0p1OpTQmk", "SUWpzIO8VifItPl53IwYK2GxvFHViABr", "RYVPvk", "LWuCRuFF1x0IzMhL3qP3Bi6UDYkfn6RT", "aSZX88VI8Agv5yyz6W8MmPiDkeOBfUV2", "yvrxvgzWs1HIxL", "zzJQ3nHJo9RAIXvSLHnZEz6WzVBAgkTr"};
    public int A00;
    public C1400Bq A01;
    public C1404Bu A02;
    public final Context A03;
    public final Handler A04 = AbstractC12174a.A0Z();
    public final Requirements A05;
    public final InterfaceC1401Br A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{-24, -11, -21, -7, -10, TransmissionUnpacked.HD_VAL_MAGIC_HB, -21, -75, TransmissionUnpacked.HD_VAL_MAGIC_HB, -11, -5, -20, -11, -5, -75, -24, -22, -5, TransmissionUnpacked.HD_VAL_MAGIC_HB, -10, -11, -75, -56, -54, -37, -48, -42, TransmissionUnpacked.HD_VAL_MAGIC_LB, -26, -41, -42, -34, -52, -39, -26, -54, -42, TransmissionUnpacked.HD_VAL_MAGIC_LB, TransmissionUnpacked.HD_VAL_MAGIC_LB, -52, -54, -37, -52, -53, -44, -31, -41, -27, -30, -36, -41, -95, -36, -31, -25, -40, -31, -25, -95, -44, -42, -25, -36, -30, -31, -95, -76, -74, -57, PSSSigner.TRAILER_IMPLICIT, -62, -63, -46, -61, -62, -54, -72, -59, -46, -73, PSSSigner.TRAILER_IMPLICIT, -58, -74, -62, -63, -63, -72, -74, -57, -72, -73, BuiltinOptions.ArgMinOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.LogicalOrOptions, 6, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquaredDifferenceOptions, 61, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquaredDifferenceOptions, 6, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 6, 28, 29, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpOptions, 27, 29, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, 25, 31, 29, BuiltinOptions.ShapeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SelectOptions, -37, -24, -34, -20, -23, -29, -34, -88, -29, -24, -18, -33, -24, -18, -88, -37, -35, -18, -29, -23, -24, -88, -66, -65, -48, -61, -67, -65, -39, -51, -50, -55, -52, -69, -63, -65, -39, -55, -59, 35, BuiltinOptions.SliceOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, 35, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, 21, 5, 20, 7, 7, 16, BuiltinOptions.ExpOptions, 17, 8, 8, -4, 9, -1, 13, 10, 4, -1, -55, 4, 9, 15, 0, 9, 15, -55, -4, -2, 15, 4, 10, 9, -55, -18, -34, -19, -32, -32, -23, -6, -22, -23, -38, -25, -35, -21, -24, -30, -35, -89, -25, -34, -19, -89, -36, -24, -25, -25, -89, PSSSigner.TRAILER_IMPLICIT, -56, -57, -57, -66, PSSSigner.TRAILER_IMPLICIT, -51, -62, -49, -62, -51, -46, -40, PSSSigner.TRAILER_IMPLICIT, -63, -70, -57, -64, -66, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.CosOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 16, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhereOptions, 16, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UniqueOptions, 16, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PowOptions, BuiltinOptions.PadV2Options, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CastOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.SliceOptions, BuiltinOptions.LessOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DequantizeOptions, -15, -3, -4, -4, -13, -15, 2, -9, 4, -9, 2, 7};
    }

    static {
        A06();
    }

    public C1405Bv(Context context, InterfaceC1401Br interfaceC1401Br, Requirements requirements) {
        this.A03 = context.getApplicationContext();
        this.A06 = interfaceC1401Br;
        this.A05 = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        int A072 = this.A05.A07(this.A03);
        int notMetRequirements = this.A00;
        if (notMetRequirements != A072) {
            this.A00 = A072;
            this.A06.AEz(this, A072);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if ((this.A00 & 3) == 0) {
            return;
        }
        A03();
    }

    private void A05() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C3M.A01((ConnectivityManager) this.A03.getSystemService(A02(311, 12, 37)));
        this.A02 = new C1404Bu(this);
        connectivityManager.registerDefaultNetworkCallback(this.A02);
    }

    public final int A09() {
        this.A00 = this.A05.A07(this.A03);
        IntentFilter intentFilter = new IntentFilter();
        if (this.A05.A0A()) {
            if (AbstractC12174a.A02 >= 24) {
                A05();
            } else {
                intentFilter.addAction(A02(233, 36, 16));
            }
        }
        if (this.A05.A08()) {
            intentFilter.addAction(A02(0, 44, 30));
            intentFilter.addAction(A02(44, 47, 10));
        }
        if (this.A05.A09()) {
            if (AbstractC12174a.A02 >= 23) {
                intentFilter.addAction(A02(269, 42, 121));
            } else {
                intentFilter.addAction(A02(202, 31, 50));
                String A02 = A02(170, 32, 89);
                if (A08[1].charAt(13) != 't') {
                    throw new RuntimeException();
                }
                A08[1] = "34fJRbWthZD6PtxUK55RQZaVQ6NgySS1";
                intentFilter.addAction(A02);
            }
        }
        if (this.A05.A0B()) {
            intentFilter.addAction(A02(91, 40, 111));
            intentFilter.addAction(A02(131, 39, 17));
        }
        this.A01 = new C1400Bq(this);
        this.A03.registerReceiver(this.A01, intentFilter, null, this.A04);
        return this.A00;
    }

    public final Requirements A0A() {
        return this.A05;
    }
}
