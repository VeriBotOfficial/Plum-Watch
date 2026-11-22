package com.xiaomi.push;

import com.xiaomi.push.ag;

/* loaded from: classes4.dex */
public class fz {

    /* renamed from: a, reason: collision with root package name */
    private static ag f14607a = new ag(true, 20);

    public static void a(final Runnable runnable) {
        f14607a.a(new ag.b() { // from class: com.xiaomi.push.fz.1
            @Override // com.xiaomi.push.ag.b
            public void b() {
                runnable.run();
            }
        });
    }

    public static void a(ag.b bVar) {
        f14607a.a(bVar);
    }

    public static void a(ag.b bVar, long j) {
        f14607a.a(bVar, j);
    }
}
