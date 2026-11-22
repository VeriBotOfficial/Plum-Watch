package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes12.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f6530a = new LinkedList();
    private final Object b = new Object();

    q() {
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            if (b() <= 25) {
                this.f6530a.offer(appLovinAdImpl);
            } else {
                o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    int b() {
        int size;
        synchronized (this.b) {
            size = this.f6530a.size();
        }
        return size;
    }

    boolean c() {
        boolean z;
        synchronized (this.b) {
            z = b() == 0;
        }
        return z;
    }

    AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f6530a.peek();
        }
        return appLovinAdImpl;
    }

    void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            this.f6530a.remove(appLovinAdImpl);
        }
    }

    AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f6530a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
