package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ul, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1882Ul {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{BuiltinOptions.DynamicUpdateSliceOptions, Byte.MIN_VALUE, Byte.MIN_VALUE, -123, -122, -123, BuiltinOptions.BitcastOptions};
    }

    static {
        A02();
    }

    EnumC1882Ul(long j, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    @Nullable
    public static EnumC1882Ul A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (EnumC1882Ul enumC1882Ul : values()) {
            if (enumC1882Ul.A01 == mediaCacheFlag) {
                return enumC1882Ul;
            }
        }
        return null;
    }
}
