package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class uh0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f17053a = new HashMap();
    private Map<String, String> b;

    public final synchronized Map<String, String> a() {
        if (this.b == null) {
            this.b = Collections.unmodifiableMap(new HashMap(this.f17053a));
        }
        return this.b;
    }
}
