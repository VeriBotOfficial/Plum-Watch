package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class NW {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-121, -122, Byte.MIN_VALUE, -109, BuiltinOptions.BitwiseXorOptions, -126, -120, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SignOptions, -122, BuiltinOptions.DynamicUpdateSliceOptions, -120, BuiltinOptions.BitwiseXorOptions, -125, -126, -109, BuiltinOptions.UnsortedSegmentSumOptions, -122, -122, -125, -122, -109, -127, -125, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, -109, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, -115};
    }

    public static AdSettings.IntegrationErrorMode A00(C2228dL c2228dL) {
        AdSettings.IntegrationErrorMode integrationErrorMode = (AdSettings.IntegrationErrorMode) AdInternalSettings.sSettingsBundle.getSerializable(A01(0, 30, 9));
        if (integrationErrorMode == null) {
            integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        }
        AdSettings.IntegrationErrorMode integrationErrorMode2 = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        if (integrationErrorMode == integrationErrorMode2 && !A03(c2228dL)) {
            return AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE;
        }
        return integrationErrorMode;
    }

    public static boolean A03(C2228dL c2228dL) {
        return (c2228dL.getApplicationInfo().flags & 2) != 0;
    }
}
