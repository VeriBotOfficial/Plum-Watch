package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.view.View;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class YB {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{OtaCommandGenerator.CMD_NOTIFY_STATUS, -116, -117, -65, -82, -77, ProtocolBytes.SOF, -72, -83, ProtocolBytes.SOF, -104, ProtocolBytes.SOF, -66, -63, -71, PSSSigner.TRAILER_IMPLICIT, -75, -123, OtaCommandGenerator.CMD_OTA_INFO, -88, -85, BuiltinOptions.NonMaxSuppressionV4Options, -77, -82, BuiltinOptions.NonMaxSuppressionV4Options, -79, -92, -83, -93, -92, -79, BuiltinOptions.NonMaxSuppressionV4Options, -115, OtaCommandGenerator.CMD_OTA_INFO, -77, -88, -75, -92, BuiltinOptions.NonMaxSuppressionV4Options, -77, -92, -84, ProtocolBytes.SOF, -85, OtaCommandGenerator.CMD_OTA_INFO, -77, -92, BuiltinOptions.HashtableImportOptions, BuiltinOptions.NonMaxSuppressionV4Options, -124, -84, ProtocolBytes.SOF, -77, -72, BuiltinOptions.NonMaxSuppressionV4Options, Byte.MIN_VALUE, -83, -93, -79, -82, -88, -93, BuiltinOptions.NonMaxSuppressionV4Options, -107, -88, -92, -74, BuiltinOptions.NonMaxSuppressionV4Options, -74, -88, -85, -85, BuiltinOptions.NonMaxSuppressionV4Options, -95, -92, BuiltinOptions.NonMaxSuppressionV4Options, -79, -92, -77, -76, -79, -83, -92, -93, BuiltinOptions.HashtableImportOptions, -1, -14, 5, -6, 7, -10, TransmissionUnpacked.HD_VAL_MAGIC_HB, 5, -10, -2, 1, -3, -14, 5, -10};
    }

    public static View A00(C2228dL c2228dL, Throwable th) {
        A03(c2228dL, th);
        return new View(c2228dL);
    }

    public static void A03(C2228dL c2228dL, Throwable th) {
        c2228dL.A08().AAy(A01(85, 15, 103), AbstractC1841Sv.A1w, new C1842Sw(th));
        Log.e(A01(0, 17, 32), A01(17, 68, 21), th);
    }
}
