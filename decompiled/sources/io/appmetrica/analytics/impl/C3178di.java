package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3178di implements Pn {

    /* renamed from: a, reason: collision with root package name */
    public final Map f18238a;

    public C3178di(Map<String, ?> map) {
        this.f18238a = map;
    }

    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(String str) {
        return this.f18238a.containsKey(str) ? new Nn(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new Nn(this, true, "");
    }
}
