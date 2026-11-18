package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.media.AudioManager;
import java.util.Arrays;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class XM {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.SegmentSumOptions, BuiltinOptions.IfOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SignOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ScatterNdOptions, 7, 0, 2, 7, 0, 11};
    }

    public static float A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(A01(2, 5, 11));
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int volume = audioManager.getStreamMaxVolume(3);
            if (volume > 0) {
                return (streamVolume * 1.0f) / volume;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static void A03(Map<String, String> map, boolean z, boolean z2) {
        String strA01 = A01(1, 1, 104);
        String strA02 = A01(0, 1, 81);
        map.put(A01(7, 8, 29), z ? strA01 : strA02);
        if (!z2) {
            strA01 = strA02;
        }
        map.put(A01(15, 6, 107), strA01);
    }
}
