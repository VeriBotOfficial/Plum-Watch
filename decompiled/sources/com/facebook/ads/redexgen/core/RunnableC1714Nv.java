package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Nv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1714Nv implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{BuiltinOptions.ReadVariableOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ArgMinOptions, 61, 32, 34, BuiltinOptions.EqualOptions, 35, 35, BuiltinOptions.ArgMinOptions, 63, BuiltinOptions.LogicalAndOptions};
    }

    public RunnableC1714Nv(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            for (AdSDKNotificationListener adSDKNotificationListener : this.A01) {
                Bundle data = new Bundle();
                data.putString(A00(0, 13, 63), this.A00);
                adSDKNotificationListener.onAdEvent(A00(13, 10, 122), data);
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
