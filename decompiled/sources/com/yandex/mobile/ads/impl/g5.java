package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15554a = new Object();
    private final yg1 b = new yg1();
    private final LinkedHashMap c = new LinkedHashMap();
    private final ArrayList d = new ArrayList();

    public final List<e5> b() {
        List<e5> list;
        synchronized (this.f15554a) {
            list = CollectionsKt.toList(this.d);
        }
        return list;
    }

    public final void b(f5 adLoadingPhaseType) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        a(adLoadingPhaseType, null);
    }

    public final void a() {
        synchronized (this.f15554a) {
            this.c.clear();
            this.d.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(f5 adLoadingPhaseType) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        yg1 parametersProvider = this.b;
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        a(adLoadingPhaseType, parametersProvider, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:4:0x000d, B:9:0x0031, B:10:0x0043, B:12:0x004d, B:13:0x0053, B:18:0x0018, B:20:0x0020), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:4:0x000d, B:9:0x0031, B:10:0x0043, B:12:0x004d, B:13:0x0053, B:18:0x0018, B:20:0x0020), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.f5 r6, com.yandex.mobile.ads.impl.zg1 r7, com.yandex.mobile.ads.impl.ha2 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "adLoadingPhaseType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "parametersProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r5.f15554a
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r5.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L57
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L18
            goto L2e
        L18:
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L2e
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L57
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L57
            long r3 = r3 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L57
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L43
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L57
            java.util.Map r7 = r7.a(r1)     // Catch: java.lang.Throwable -> L57
            com.yandex.mobile.ads.impl.e5 r1 = new com.yandex.mobile.ads.impl.e5     // Catch: java.lang.Throwable -> L57
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L57
            java.util.ArrayList r7 = r5.d     // Catch: java.lang.Throwable -> L57
            r7.add(r1)     // Catch: java.lang.Throwable -> L57
        L43:
            java.util.LinkedHashMap r7 = r5.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L57
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L53
            java.lang.Object r6 = r6.remove(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L57
        L53:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            return
        L57:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.g5.a(com.yandex.mobile.ads.impl.f5, com.yandex.mobile.ads.impl.zg1, com.yandex.mobile.ads.impl.ha2):void");
    }

    public final void a(f5 adLoadingPhaseType, ha2 ha2Var) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        synchronized (this.f15554a) {
            Map map = (Map) this.c.get(adLoadingPhaseType);
            if (map == null) {
                map = new LinkedHashMap();
            }
            this.c.put(adLoadingPhaseType, map);
            map.put(ha2Var, Long.valueOf(SystemClock.elapsedRealtime()));
            Unit unit = Unit.INSTANCE;
        }
    }
}
