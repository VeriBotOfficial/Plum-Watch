package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2462hD implements InterfaceC1711Ns {
    public static byte[] A06;
    public final InterfaceC1693Na A00;
    public final HandlerC1700Nh A01;
    public final C2228dL A02;
    public final Handler A03;
    public final String A04;
    public final InterfaceC1705Nm A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, ProtocolBytes.SOF, -25, -20, -14, -3, -29, TransmissionUnpacked.HD_VAL_MAGIC_HB, TransmissionUnpacked.HD_VAL_MAGIC_HB, -19, TransmissionUnpacked.HD_VAL_MAGIC_HB, -3, -31, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, -24, -21, 6, TransmissionUnpacked.HD_VAL_MAGIC_HB, -21, 6, -14, -20, 0, 21, 22, 20, BuiltinOptions.ExpOptions, 7, 20, 20, 17, 20, BuiltinOptions.ExpOptions, 15, 7, 21, 21, 3, 9, 7, BuiltinOptions.ExpOptions, 13, 7, 27};
    }

    public abstract void A08();

    public abstract void A09();

    public abstract void A0D(boolean z);

    public AbstractC2462hD(C2228dL c2228dL, String str, InterfaceC1706Nn interfaceC1706Nn) {
        this.A02 = c2228dL;
        this.A04 = str;
        DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new C2465hG(c2228dL, this);
        this.A01 = new HandlerC1700Nh(c2228dL, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A05 = interfaceC1706Nn.A5K(this.A00, this, this.A01);
    }

    public final InterfaceC1693Na A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0F().AHG();
            A06();
        } else {
            this.A02.A0F().AH8();
            this.A01.A02 = true;
            this.A01.A0E(UA.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0F().AHM();
        if (!this.A01.A0F(this.A05.A8H(), this.A05.A5J(this.A04))) {
            A09();
            this.A02.A0F().AHE();
        }
    }

    public final void A07() {
        if (!U7.A0u(this.A02)) {
            return;
        }
        XJ.A00(new C2463hE(this));
    }

    public final void A0A(int i) {
        this.A01.A0D(this.A02, i);
    }

    public final void A0B(int i, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String A01 = A01(48, 21, 124);
        if (str != null) {
            bundle.putString(A01, str);
        } else {
            bundle.putString(A01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        AED(i, this.A04, bundle);
    }

    public final void A0C(Message message) {
        this.A05.A9b(message);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Ns
    public final void AED(int i, String str, Bundle bundle) {
        Message obtain = Message.obtain((Handler) null, i);
        obtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            obtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        Runnable callbackApiRunnable = new C2464hF(this, obtain);
        this.A03.post(callbackApiRunnable);
    }
}
