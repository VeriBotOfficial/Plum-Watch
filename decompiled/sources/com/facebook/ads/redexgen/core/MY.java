package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class MY extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC2540id A00;
    public MX A01;
    public C2228dL A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SquareOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquaredDifferenceOptions, 15, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ResizeNearestNeighborOptions, 15, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, 15, BuiltinOptions.ZerosLikeOptions, 64, BuiltinOptions.SplitVOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, 15, BuiltinOptions.SquareOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions};
    }

    public MY(C2228dL c2228dL, String str, InterfaceC2540id interfaceC2540id, MX mx) {
        this.A02 = c2228dL;
        this.A03 = str;
        this.A01 = mx;
        this.A00 = interfaceC2540id;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        OO.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        OO.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ACb(this.A00);
        }
    }
}
