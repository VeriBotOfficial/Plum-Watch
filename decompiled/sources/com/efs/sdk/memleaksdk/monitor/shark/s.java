package com.efs.sdk.memleaksdk.monitor.shark;

/* loaded from: classes14.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    static r f9922a;
    static long b;

    private s() {
    }

    static r a() {
        synchronized (s.class) {
            r rVar = f9922a;
            if (rVar != null) {
                f9922a = rVar.f;
                rVar.f = null;
                b -= 8192;
                return rVar;
            }
            return new r();
        }
    }

    static void a(r rVar) {
        if (rVar.f != null || rVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (rVar.d) {
            return;
        }
        synchronized (s.class) {
            long j = b;
            if (j + 8192 > 65536) {
                return;
            }
            b = j + 8192;
            rVar.f = f9922a;
            rVar.c = 0;
            rVar.b = 0;
            f9922a = rVar;
        }
    }
}
