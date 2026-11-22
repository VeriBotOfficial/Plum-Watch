package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.LocationManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dr0 implements ys0 {

    /* renamed from: a, reason: collision with root package name */
    private final at0 f15305a;
    private final LocationManager b;
    private final b42 c;

    public dr0(Context context, at0 locationSelector) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationSelector, "locationSelector");
        this.f15305a = locationSelector;
        Object systemService = context.getApplicationContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.b = locationManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = new b42(applicationContext, locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.yandex.mobile.ads.impl.ys0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location a() {
        /*
            r4 = this;
            r0 = 0
            android.location.LocationManager r1 = r4.b     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            java.util.List r1 = r1.getAllProviders()     // Catch: java.lang.Throwable -> Lc
            goto L13
        La:
            r1 = r0
            goto L13
        Lc:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.sp0.c(r1)
            goto La
        L13:
            if (r1 == 0) goto L3f
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.yandex.mobile.ads.impl.b42 r3 = r4.c
            android.location.Location r2 = r3.a(r2)
            if (r2 == 0) goto L1d
            r0.add(r2)
            goto L1d
        L35:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            com.yandex.mobile.ads.impl.at0 r1 = r4.f15305a
            android.location.Location r0 = r1.a(r0)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dr0.a():android.location.Location");
    }
}
