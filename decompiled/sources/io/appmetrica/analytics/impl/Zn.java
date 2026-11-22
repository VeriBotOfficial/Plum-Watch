package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class Zn extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f18173a;

    public Zn() {
        super(false, "[WakelocksToggle]");
        this.f18173a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f18173a.put(obj, null);
        if (this.f18173a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f18173a.remove(obj);
        if (this.f18173a.isEmpty()) {
            updateState(false);
        }
    }
}
