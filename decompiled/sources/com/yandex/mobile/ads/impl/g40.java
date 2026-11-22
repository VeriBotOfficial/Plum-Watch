package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h40;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public interface g40 {
    void a(h40.a aVar);

    void b(h40.a aVar);

    fv getCryptoConfig();

    a getError();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    Map<String, String> queryKeyStatus();

    boolean requiresSecureDecoder(String str);

    static void a(g40 g40Var, g40 g40Var2) {
        if (g40Var == g40Var2) {
            return;
        }
        if (g40Var2 != null) {
            g40Var2.b(null);
        }
        if (g40Var != null) {
            g40Var.a(null);
        }
    }

    public static class a extends IOException {
        public final int b;

        public a(Throwable th, int i) {
            super(th);
            this.b = i;
        }
    }
}
