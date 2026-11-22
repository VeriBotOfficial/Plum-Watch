package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YP implements InterfaceC1921Vz {
    public static byte[] A01;
    public static String[] A02 = {"cL9KuymxmXYmG8NC9NVGcaGlfdWWeniK", "Nk16ts9BY6zqy", "EgJ1qeWjq2zhUumNQfvGHLF4hTEd3z2y", "RODoYaIjQAnjV1WNThn2vejpwKsM19Cc", "40Y1apu8pWAms0kzI1QlbJay1792dWSe", "dN3sSSJjIpaTvjnI8sFpNb6rIgDjDuKA", "fmvlDKN6b1IL1", "7gRFv5vnh1tPqRcG4sTxqyzgIBUkam47"};
    public final /* synthetic */ C2202cu A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[0] = "cTAx5t1qCw5Hmq8oguM2xeNpSThd5fgi";
        A01 = new byte[]{-47, -51, -52, 0, -17, -12, TransmissionUnpacked.HD_VAL_MAGIC_HB, -7, -18, TransmissionUnpacked.HD_VAL_MAGIC_HB, -39, TransmissionUnpacked.HD_VAL_MAGIC_HB, -1, 2, -6, -3, -10, -5, 20, 11, 30, 22, 11, 9, 26, 11, 10, -58, 11, 24, 24, 21, 24, -44, -94, -79, OtaCommandGenerator.CMD_OTA_INFO, -78, -89, -98, -78, -89, -88, -92, -85, -93};
    }

    static {
        A01();
    }

    public YP(C2202cu c2202cu) {
        this.A00 = c2202cu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1921Vz
    public final void AAo(int i, Throwable th) {
        Log.e(A00(0, 17, 81), A00(17, 17, 108), th);
        this.A00.A08().AAy(A00(34, 12, 5), i, new C1842Sw(th));
    }
}
