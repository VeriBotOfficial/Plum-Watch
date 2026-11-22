package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes6.dex */
public final class Ic {

    /* renamed from: a, reason: collision with root package name */
    public final C3705ym f17905a;
    public final C3705ym b;
    public final D4 c;
    public final PublicLogger d;
    public final String e;

    public Ic(String str, PublicLogger publicLogger) {
        this(new D4(30), new C3705ym(50, str.concat("map key"), publicLogger), new C3705ym(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Ic(D4 d4, C3705ym c3705ym, C3705ym c3705ym2, String str, PublicLogger publicLogger) {
        this.c = d4;
        this.f17905a = c3705ym;
        this.b = c3705ym2;
        this.e = str;
        this.d = publicLogger;
    }
}
