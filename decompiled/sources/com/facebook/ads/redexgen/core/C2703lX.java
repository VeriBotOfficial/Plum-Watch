package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.WindowManager;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.lX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2703lX implements FT {
    public static byte[] A01;
    public final WindowManager A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-7, -21, TransmissionUnpacked.HD_VAL_MAGIC_HB, -26, -15, -7};
    }

    public C2703lX(WindowManager windowManager) {
        this.A00 = windowManager;
    }

    public static C2703lX A00(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(A01(0, 6, 15));
        if (windowManager != null) {
            return new C2703lX(windowManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.FT
    public final void AGn(FS fs) {
        fs.ACz(this.A00.getDefaultDisplay());
    }

    @Override // com.facebook.ads.redexgen.core.FT
    public final void AJl() {
    }
}
