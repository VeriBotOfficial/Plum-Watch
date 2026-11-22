package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2777mk implements InterfaceC1382Aw {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{13, 27, 29, 11, 12, 27, BuiltinOptions.GatherNdOptions, 14, 18, 31, 7, 28, 31, 29, 21, 10, 21, 24, 25, 19, BuiltinOptions.GatherNdOptions, 29, 10, 31};
    }

    public C2777mk() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1382Aw
    public final int A7H() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1382Aw
    public final MediaCodecInfo A7I(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1382Aw
    public final boolean AAI(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1382Aw
    public final boolean AAJ(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 117).equals(str) && A00(15, 9, 119).equals(str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1382Aw
    public final boolean AIK() {
        return false;
    }
}
