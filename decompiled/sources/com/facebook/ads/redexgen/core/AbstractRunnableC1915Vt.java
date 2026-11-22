package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC1915Vt implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC1905Vj> A04;
    public final C1903Vh A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{BuiltinOptions.GreaterOptions, 11, 16, 16, 31, 28, 18, 27, BuiltinOptions.DepthToSpaceOptions, 29, 12, 27, 31, 10, 27, 26, BuiltinOptions.UniqueOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NegOptions, 22, 12, 27, 31, 26, BuiltinOptions.FillOptions, BuiltinOptions.DepthToSpaceOptions};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC1915Vt() {
        if (A03.get()) {
            this.A00 = C1920Vy.A01(new C1919Vx(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z) {
        A03.set(z);
    }

    public static void A05(boolean z, InterfaceC1905Vj interfaceC1905Vj) {
        A02.set(z);
        A04.set(interfaceC1905Vj);
    }

    public final C1903Vh A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C1920Vy.A03(this);
            }
            try {
                A07();
            } catch (Throwable th) {
                if (A02.get()) {
                    W0.A00().AAo(3301, th);
                    InterfaceC1905Vj interfaceC1905Vj = A04.get();
                    if (interfaceC1905Vj != null) {
                        interfaceC1905Vj.AHp(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                C1920Vy.A04(this);
            }
        } catch (Throwable th2) {
            AbstractC1907Vl.A00(th2, this);
        }
    }
}
