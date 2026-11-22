package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3705ym extends X2 {
    public C3705ym(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f18130a;
    }

    public C3705ym(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3307in
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i = this.f18130a;
            if (length > i) {
                String substring = str.substring(0, i);
                this.c.warning("\"%s\" %s size exceeded limit of %d characters", this.b, str, Integer.valueOf(this.f18130a));
                return substring;
            }
        }
        return str;
    }

    public final String a() {
        return this.b;
    }
}
