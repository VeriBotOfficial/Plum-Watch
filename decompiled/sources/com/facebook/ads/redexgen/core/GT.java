package com.facebook.ads.redexgen.core;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class GT {
    public static byte[] A03;
    public final GS A00;
    public final Constructor<? extends GX> A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{BuiltinOptions.ShapeOptions, 0, 0, 29, 0, BuiltinOptions.AddNOptions, 27, 28, 1, 6, 19, 28, 6, 27, 19, 6, 27, 28, 21, BuiltinOptions.AddNOptions, 23, 10, 6, 23, 28, 1, 27, 29, 28, BuiltinOptions.CastOptions, 30, 21, 8, 0, 21, 19, 4, 21, 20, BuiltinOptions.UniqueOptions, 21, 2, 2, 31, 2, BuiltinOptions.UniqueOptions, 19, 2, 21, 17, 4, 25, 30, 23, BuiltinOptions.UniqueOptions, 21, 8, 4, 2, 17, 19, 4, 31, 2};
    }

    public GT(GS gs) {
        this.A00 = gs;
    }

    private Constructor<? extends GX> A01() {
        synchronized (this.A02) {
            if (this.A02.get()) {
                return this.A01;
            }
            try {
                return this.A00.A7J();
            } catch (ClassNotFoundException unused) {
                this.A02.set(true);
                return this.A01;
            } catch (Exception e) {
                throw new RuntimeException(A00(0, 29, 124), e);
            }
        }
    }

    public final GX A03(Object... objArr) {
        Constructor<? extends GX> A01 = A01();
        if (A01 == null) {
            return null;
        }
        try {
            return A01.newInstance(objArr);
        } catch (Exception e) {
            throw new IllegalStateException(A00(29, 35, 126), e);
        }
    }
}
