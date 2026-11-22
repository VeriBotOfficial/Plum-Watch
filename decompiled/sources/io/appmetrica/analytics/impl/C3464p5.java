package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3464p5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18444a;

    public C3464p5(String str) {
        this.f18444a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f18444a);
    }
}
