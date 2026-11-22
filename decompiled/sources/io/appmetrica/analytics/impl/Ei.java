package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes6.dex */
public final class Ei {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f17833a;
    public final C3655wm b;
    public final Em c;
    public final Em d;
    public final PublicLogger e;

    public Ei(Revenue revenue, PublicLogger publicLogger) {
        this.e = publicLogger;
        this.f17833a = revenue;
        this.b = new C3655wm(30720, "revenue payload", publicLogger);
        this.c = new Em(new C3655wm(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.d = new Em(new C3705ym(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
