package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2013Zp {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, TransmissionUnpacked.HD_VAL_MAGIC_HB, -10, -11, -37, -42, -36, -54, -49};
    }

    public C2013Zp() {
        this.A00 = new HashMap();
    }

    public C2013Zp(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C2013Zp A02(XH xh) {
        if (xh != null) {
            this.A00.put(A00(11, 5, 48), AbstractC1937Wr.A01(xh.A04()));
        }
        return this;
    }

    public final C2013Zp A03(C2301eX c2301eX) {
        if (c2301eX != null) {
            this.A00.putAll(c2301eX.A0S());
        }
        return this;
    }

    public final C2013Zp A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
