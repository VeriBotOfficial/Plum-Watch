package com.facebook.ads.redexgen.core;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2708lc {
    public static byte[] A03;
    public static String[] A04 = {"unLJAGqnT9K2C6pR52hzklfZHwTRg6Yr", "LeSEUls9Myr0akOYyr4ALINYOEymKOkL", "W8GYPv6JCblyMHrg4mb8qhrlE9HlP5p8", "LeDDfwbzgRXTDhaT1cwFWvWAB6ITTWPz", "taf7WKL89SeyG6P6BerDozU5lBYArJ2v", "", "BSTJObkWS6NqTAYjIRk7bCGrxc9Lgut2", "ohz3nwuOVveogY5495fLWWA936p3Bkwf"};
    public static final C1468Eh A05;
    public static final C1468Eh A06;
    public static final C1468Eh A07;
    public static final C1468Eh A08;
    public HandlerC1469Ei<? extends InterfaceC1470Ej> A00;
    public IOException A01;
    public final InterfaceExecutorC1486Ez A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A03 = new byte[]{BuiltinOptions.LogicalAndOptions, 3, 20, BuiltinOptions.PadV2Options, 23, 26, 2, 30, 9, BuiltinOptions.FloorDivOptions, BuiltinOptions.ShapeOptions, 20, 26, 31, 30, 9, BuiltinOptions.FloorDivOptions};
    }

    static {
        A07();
        A07 = A01(false, -9223372036854775807L);
        A08 = A01(true, -9223372036854775807L);
        A05 = new C1468Eh(2, -9223372036854775807L);
        A06 = new C1468Eh(3, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C2708lc(InterfaceExecutorC1486Ez interfaceExecutorC1486Ez) {
        this.A02 = interfaceExecutorC1486Ez;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C2708lc(String str) {
        this(AbstractC1485Ey.A00(AbstractC12174a.A0u(A06(0, 17, 64) + str), new C3X() { // from class: com.facebook.ads.redexgen.X.ld
            @Override // com.facebook.ads.redexgen.core.C3X
            public final void A31(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    @MetaExoPlayerCustomization("D14742363 Needed to accept supplied looper for Exo2DashLiveManifestFetcher manifest loading")
    private final <T extends InterfaceC1470Ej> long A00(Looper looper, T t, InterfaceC1467Eg<T> interfaceC1467Eg, int i) {
        C3M.A08(looper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC1469Ei(this, looper, t, interfaceC1467Eg, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public static C1468Eh A01(boolean z, long j) {
        return new C1468Eh(z ? 1 : 0, j);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    public final <T extends InterfaceC1470Ej> long A08(T t, InterfaceC1467Eg<T> interfaceC1467Eg, int i) {
        Looper looper = (Looper) C3M.A02(Looper.myLooper());
        return A00(looper, t, interfaceC1467Eg, i);
    }

    public final void A09() {
        ((HandlerC1469Ei) C3M.A02(this.A00)).A07(false);
    }

    public final void A0A() {
        this.A01 = null;
    }

    public final void A0B(int i) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HandlerC1469Ei<? extends InterfaceC1470Ej> handlerC1469Ei = this.A00;
                if (i == Integer.MIN_VALUE) {
                    HandlerC1469Ei<? extends InterfaceC1470Ej> handlerC1469Ei2 = this.A00;
                    String[] strArr = A04;
                    if (strArr[6].charAt(7) == strArr[1].charAt(7)) {
                        throw new RuntimeException();
                    }
                    A04[2] = "wo2YdO45DQEJfRTdGKzxAcazBLTDj4mX";
                    i = handlerC1469Ei2.A07;
                }
                handlerC1469Ei.A05(i);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A0C(InterfaceC1471Ek interfaceC1471Ek) {
        if (this.A00 != null) {
            HandlerC1469Ei<? extends InterfaceC1470Ej> handlerC1469Ei = this.A00;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "XVuhTdSnDMDRP6HltjyP328n9S8al0u6";
            strArr2[0] = "1piWh3nqPhJ4K6qVEs9qRP5dHkNT6n7u";
            handlerC1469Ei.A07(true);
        }
        if (interfaceC1471Ek != null) {
            this.A02.execute(new RunnableC1472El(interfaceC1471Ek));
        }
        this.A02.AGr();
    }

    public final boolean A0D() {
        return this.A01 != null;
    }

    public final boolean A0E() {
        return this.A00 != null;
    }
}
