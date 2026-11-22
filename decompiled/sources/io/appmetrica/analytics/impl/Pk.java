package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Pk implements Om {
    public static final long d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f18016a;
    public final PermissionExtractor b;
    public final CachedDataProvider.CachedData c;

    public Pk(Context context) {
        long j = d;
        this.c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.f18016a = context;
        this.b = C3593ua.j().i();
    }

    public final Kk b() {
        return new Kk((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f18016a, "phone", "getting SimMcc", "TelephonyManager", new Lk()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f18016a, "phone", "getting SimMnc", "TelephonyManager", new Mk()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f18016a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new Ok(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f18016a, "phone", "getting SimOperatorName", "TelephonyManager", new Nk()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.c.shouldUpdateData() != false) goto L9;
     */
    @Override // io.appmetrica.analytics.impl.Om
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<io.appmetrica.analytics.impl.Kk> a() {
        /*
            r4 = this;
            monitor-enter(r4)
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r0 = r4.c     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L19
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L63
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.c     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.shouldUpdateData()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L63
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.ua r1 = io.appmetrica.analytics.impl.C3593ua.E     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.Jl r1 = r1.u     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.Hl r1 = r1.b()     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.C4 r1 = r1.n     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.d     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L5e
            r1 = 23
            boolean r1 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(r1)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L57
            io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor r1 = r4.b     // Catch: java.lang.Throwable -> L65
            android.content.Context r2 = r4.f18016a     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r1.hasPermission(r2, r3)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L49
            android.content.Context r1 = r4.f18016a     // Catch: java.lang.Throwable -> L65
            java.util.List r1 = io.appmetrica.analytics.impl.Qk.a(r1)     // Catch: java.lang.Throwable -> L65
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L65
        L49:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L5e
            io.appmetrica.analytics.impl.Kk r1 = r4.b()     // Catch: java.lang.Throwable -> L65
            r0.add(r1)     // Catch: java.lang.Throwable -> L65
            goto L5e
        L57:
            io.appmetrica.analytics.impl.Kk r1 = r4.b()     // Catch: java.lang.Throwable -> L65
            r0.add(r1)     // Catch: java.lang.Throwable -> L65
        L5e:
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.c     // Catch: java.lang.Throwable -> L65
            r1.setData(r0)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r4)
            return r0
        L65:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L65
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Pk.a():java.util.List");
    }
}
