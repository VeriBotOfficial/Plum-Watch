package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.oU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2883oU implements C1S {
    public static byte[] A00;
    public static String[] A01 = {"aC8uc30vckBh0ldJ8CsDkWWGmQgl7sOm", "2", "dPCbCdxH5PRV4edn", "QHj", "dDf", "KHWYQA", "nwDl9CeJStZlhkBKgBcw2akg3aHE6X2p", "I5"};
    public static final String A02;
    public static final C1R<AbstractC2883oU> A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 9);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-126, -101, -104, -101, -100, -92, -101, BuiltinOptions.MirrorPadOptions, Byte.MAX_VALUE, -114, -95, -106, -101, -108, -127, -90, -99, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.CallOnceOptions, BuiltinOptions.MirrorPadOptions};
    }

    static {
        A07();
        A02 = AbstractC12174a.A0h(0);
        A03 = new C1R() { // from class: com.facebook.ads.redexgen.X.oX
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                AbstractC2883oU A04;
                A04 = AbstractC2883oU.A04(bundle);
                return A04;
            }
        };
    }

    public static AbstractC2883oU A04(Bundle bundle) {
        int i = bundle.getInt(A02, -1);
        switch (i) {
            case 0:
                return C13529s.A02.A6X(bundle);
            case 1:
                C13509q A6X = C13509q.A02.A6X(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr = A01;
                    strArr[7] = "RK";
                    strArr[1] = "0";
                    return A6X;
                }
                break;
            case 2:
                return C13499p.A04.A6X(bundle);
            case 3:
                C13489o A6X2 = C13489o.A02.A6X(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr2 = A01;
                    strArr2[7] = "Vr";
                    strArr2[1] = "2";
                    return A6X2;
                }
                break;
            default:
                throw new IllegalArgumentException(A06(0, 20, 36) + i);
        }
        throw new RuntimeException();
    }
}
