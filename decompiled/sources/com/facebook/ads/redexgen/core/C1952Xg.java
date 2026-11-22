package com.facebook.ads.redexgen.core;

import android.os.PowerManager;
import android.util.Log;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1952Xg {
    public static byte[] A00;
    public static String[] A01 = {"CRKlMdJj7sWkVQXvhxP2gtYMKrwrdBdz", "MDVslC7yGiRJk7iB8DE8e8h4fEVrC5ER", "lH08WA", "RxIchMFZh", "vNyd6Jid8bvsA1cw15Ve5Ic9LBA7HcUI", "txgfdNfKSs8Co5f2ObGoVq", "d8ndlqqx7tIKNJdyWXTDq8r8sQB5dgXc", "5RbatCjsfF363SonahZsted9lIdQCMHb"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            String[] strArr = A01;
            if (strArr[4].charAt(3) != strArr[6].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "R3kMyn";
            copyOfRange[i4] = (byte) (i5 - 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.HashtableImportOptions, OtaCommandGenerator.CMD_OTA_INFO, -117, -115, -104, -100, OtaCommandGenerator.CMD_GET_INFO, -105, -106, BuiltinOptions.FloorModOptions, OtaCommandGenerator.CMD_GET_INFO, -106, BuiltinOptions.FloorModOptions, -101, -117, -102, -115, -115, -106, BuiltinOptions.FloorModOptions, OtaCommandGenerator.CMD_GET_INFO, -106, -100, -115, -102, -119, -117, -100, OtaCommandGenerator.CMD_GET_INFO, -98, -115, BuiltinOptions.FloorModOptions, -117, OtaCommandGenerator.CMD_NOTIFY_STATUS, -115, -117, -109, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions, -119, -101, -101, -99, -107, OtaCommandGenerator.CMD_GET_INFO, -106, -113, BuiltinOptions.FloorModOptions, OtaCommandGenerator.CMD_GET_INFO, -106, -100, -115, -102, -119, -117, -100, OtaCommandGenerator.CMD_GET_INFO, -98, -115, BuiltinOptions.RankOptions, -33, -34, -26, -44, -31, -69, -78, PSSSigner.TRAILER_IMPLICIT, -76, -62};
    }

    static {
        A01();
        A02 = C1952Xg.class.getSimpleName();
    }

    public static boolean A02(C2228dL c2228dL) {
        return A03(c2228dL) && C1953Xh.A03(c2228dL);
    }

    public static boolean A03(C2228dL c2228dL) {
        if (c2228dL == null) {
            return true;
        }
        try {
            return ((PowerManager) c2228dL.getSystemService(A00(60, 5, 91))).isInteractive();
        } catch (Exception e) {
            Log.e(A02, A00(0, 60, 20), e);
            c2228dL.A08().AAy(A00(65, 5, 53), AbstractC1841Sv.A2S, new C1842Sw(e));
            return true;
        }
    }
}
