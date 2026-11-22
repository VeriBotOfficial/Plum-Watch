package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ge0 implements ys0 {

    /* renamed from: a, reason: collision with root package name */
    private final dt0 f15579a;
    private final Object b;

    public /* synthetic */ ge0(Context context, String str) {
        this(context, str, new dt0(context, str));
    }

    public ge0(Context context, String locationServicesClassName, dt0 locationTaskManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(locationTaskManager, "locationTaskManager");
        this.f15579a = locationTaskManager;
        this.b = new Object();
    }

    @Override // com.yandex.mobile.ads.impl.ys0
    public final Location a() {
        Location location;
        synchronized (this.b) {
            ct0 b = this.f15579a.b();
            if (b == null || !b.b()) {
                location = null;
            } else {
                location = b.a();
                this.f15579a.c();
            }
        }
        return location;
    }
}
