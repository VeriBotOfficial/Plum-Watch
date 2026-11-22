package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: assets/audience_network.dex */
public class AU {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<AS> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ AV A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-89, -38, -59, -57, -46, -42, -53, -47, -48, -126, -39, -54, -57, -48, -126, -42, -44, -37, -53, -48, -55, -126, -42, -47, -126, -53, -48, TransmissionUnpacked.HD_VAL_MAGIC_LB, -42, -61, -48, -42, -53, -61, -42, -57, -126, -121, TransmissionUnpacked.HD_VAL_MAGIC_LB, -100, -126, -121, TransmissionUnpacked.HD_VAL_MAGIC_LB, -72, -48, -49, -44, -52, -82, -38, -49, -48, -50, -69, -38, -38, -41, -70, -37, -33, -44, -40, -44, -27, -48, -49, -59, -46, -46, -49, -46, -115, -41, -56, -55, -52, -59, -115, -46, -59, -52, -59, -63, -45, -59, -115, -61, -49, -60, -59, -61, -115, -58, -46, -49, -51, -115, -45, -59, -44, -115, -58, -55, -50, -63, -52, -52, -39, -102, Byte.MIN_VALUE, -123, -45, -40, -27, -27, -30, -27, OtaCommandGenerator.CMD_OTA_INFO, -22, -37, -36, -33, -40, OtaCommandGenerator.CMD_OTA_INFO, -27, -40, -33, -40, -44, -26, -40, OtaCommandGenerator.CMD_OTA_INFO, -42, -30, -41, -40, -42, OtaCommandGenerator.CMD_OTA_INFO, -39, -27, -30, -32, OtaCommandGenerator.CMD_OTA_INFO, -26, -40, -25, -83, -109, -104, -26, -34, -15, -24, -23, -27, -38, -14, -34, -21, -85, -89, -38, -17, -86, -89, -20, -21, -36, -89, -67, -38, -17, -86, -35, -58, -34, -35, -30, -38, PSSSigner.TRAILER_IMPLICIT, -24, -35, -34, -36, -70, -35, -38, -23, -19, -34, -21};
    }

    public AU(AV av) {
        this.A02 = av;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AO A02(boolean z, C2500hv c2500hv, EnumC2497hq enumC2497hq, String str) throws MediaCodecInitializationException {
        Set<AO> set;
        if (this.A02.A0I(z, c2500hv) && AV.A0G(str, c2500hv)) {
            synchronized (this.A02.A04) {
                set = this.A02.A04.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        AV av = this.A02;
                        av.A00--;
                        Iterator<AO> it = set.iterator();
                        AO ret = it.next();
                        it.remove();
                        this.A02.A03().A0A(z, str, enumC2497hq, ret.hashCode());
                        return ret;
                    }
                }
            }
        }
        try {
            C2495ho A05 = this.A02.A03().A05(z, str, enumC2497hq);
            AO A032 = A03(z, str);
            this.A02.A03().A06(A05, A032.hashCode());
            return A032;
        } catch (Exception e) {
            throw new MediaCodecInitializationException(str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AO A03(boolean z, String str) throws Exception {
        String A04 = A04(150, 41, 69);
        if (z && AV.A0E(str)) {
            try {
                return (AO) Class.forName(A04).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                Log.w(A04(43, 23, 55), String.format(A04(0, 43, 46), A04, e.getMessage()));
            }
        }
        return new C2772mf(MediaCodec.createByCodecName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public void A0B(EnumC2497hq enumC2497hq) {
        String A04;
        String format;
        AV av;
        Set<AO> set;
        Iterator<AS> it = this.A01.iterator();
        while (it.hasNext()) {
            AS next = it.next();
            try {
                try {
                    if (!next.A05) {
                        A08(next.A01, enumC2497hq, Boolean.valueOf(next.A04), next.A00);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                next.A00.reset();
                                av = this.A02;
                            } catch (Throwable th) {
                                this.A02.A05 = -1L;
                                throw th;
                            }
                        } catch (IllegalStateException unused) {
                            A09(next.A02, next.A00);
                            av = this.A02;
                        }
                        av.A05 = -1L;
                        if (next.A03) {
                            synchronized (this.A02.A04) {
                                set = this.A02.A04.get(next.A02);
                            }
                            if (set != null) {
                                synchronized (set) {
                                    set.add(next.A00);
                                    this.A02.A00++;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.w(A04(43, 23, 55), String.format(A04(112, 38, 63), e.getMessage()));
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(next);
                        }
                    } catch (Exception e2) {
                        A04 = A04(43, 23, 55);
                        format = String.format(A04(66, 46, 44), e2.getMessage());
                        Log.w(A04, format);
                    }
                }
                try {
                    synchronized (this.A01) {
                        this.A01.remove(next);
                    }
                } catch (Exception e3) {
                    A04 = A04(43, 23, 55);
                    format = String.format(A04(66, 46, 44), e3.getMessage());
                    Log.w(A04, format);
                }
            } catch (Throwable th2) {
                try {
                } catch (Exception e4) {
                    Log.w(A04(43, 23, 55), String.format(A04(66, 46, 44), e4.getMessage()));
                }
                synchronized (this.A01) {
                    this.A01.remove(next);
                    throw th2;
                }
            }
        }
    }

    private void A08(C2500hv c2500hv, EnumC2497hq enumC2497hq, Boolean bool, AO ao) {
        try {
            if (!c2500hv.A0Q || (!bool.booleanValue() && !c2500hv.A0P)) {
                ao.stop();
            }
        } finally {
            this.A02.A03().A08(enumC2497hq, ao.hashCode());
            ao.AGr();
            this.A02.A03().A07(enumC2497hq, ao.hashCode());
        }
    }

    private void A09(String str, AO ao) {
        Set<AO> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(ao)) {
                    AV av = this.A02;
                    av.A00--;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A(boolean r24, com.facebook.ads.redexgen.core.C2500hv r25, final com.facebook.ads.redexgen.core.EnumC2497hq r26, java.lang.String r27, com.facebook.ads.redexgen.core.AO r28) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AU.A0A(boolean, com.facebook.ads.redexgen.X.hv, com.facebook.ads.redexgen.X.hq, java.lang.String, com.facebook.ads.redexgen.X.AO):void");
    }
}
