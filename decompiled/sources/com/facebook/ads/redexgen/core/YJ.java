package com.facebook.ads.redexgen.core;

import com.autonavi.aps.amapapi.config.Const;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class YJ implements InterfaceC1826Sg {
    public static byte[] A00;
    public static String[] A01 = {"N9cBQFuEXnMHuOhuUHmrN1NbOn9dUH6l", "t4327HI34dmOHxHgJ5Xqb1TMdgfhViRu", "W9WF83HwW2JJuxhyMa", "tDcIRbsxuTPzi4rfI85ylCxCUvgLsm3F", "qO4Uq7mg6XVWSCx2fb2lLTULAXcH9HmN", "DdhWBjv", "pI4BrYZb6jEfbOR6K30piOXwM4lgsdMH", "sO2hGyIlN5zgciGhFXZ1rYz4NH0oO9ru"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + Const.I_DEF_CGI_SIG);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-70, -73, -54, -73, TransmissionUnpacked.HD_VAL_MAGIC_LB, -58, -56, -59, -71, -69, -55, -55, -65, -60, -67, TransmissionUnpacked.HD_VAL_MAGIC_LB, -59, -58, -54, -65, -59, -60, -55, TransmissionUnpacked.HD_VAL_MAGIC_LB, -71, -59, -53, -60, -54, -56, -49, TransmissionUnpacked.HD_VAL_MAGIC_LB, -63, -69, -49, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, 64, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PackOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TransposeConvOptions, 63, 63, BuiltinOptions.EqualOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 64, BuiltinOptions.EqualOptions, BuiltinOptions.PackOptions, 58, 63, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 5, 2, 21, 2, 32, 17, 19, 16, 4, 6, 20, 20, 10, 15, 8, 32, 16, 17, 21, 10, 16, 15, 20, 32, 20, 21, 2, 21, 6, 32, 12, 6, 26};
        String[] strArr = A01;
        if (strArr[6].charAt(20) == strArr[0].charAt(20)) {
            throw new RuntimeException();
        }
        A01[2] = "00h";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1826Sg
    public final void ABw(InterfaceC1825Sf interfaceC1825Sf) {
        String[] stringArray;
        Integer integer;
        Integer integer2;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 123));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 5));
            integer2 = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 80));
        }
        interfaceC1825Sf.AFC(stringArray, integer, integer2);
    }
}
