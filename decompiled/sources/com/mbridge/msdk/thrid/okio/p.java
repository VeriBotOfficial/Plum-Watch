package com.mbridge.msdk.thrid.okio;

/* compiled from: SegmentPool.java */
/* loaded from: classes17.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    static o f12262a;
    static long b;

    private p() {
    }

    static o a() {
        synchronized (p.class) {
            o oVar = f12262a;
            if (oVar == null) {
                return new o();
            }
            f12262a = oVar.f;
            oVar.f = null;
            b -= 8192;
            return oVar;
        }
    }

    static void a(o oVar) {
        if (oVar.f == null && oVar.g == null) {
            if (oVar.d) {
                return;
            }
            synchronized (p.class) {
                long j = b + 8192;
                if (j > 65536) {
                    return;
                }
                b = j;
                oVar.f = f12262a;
                oVar.c = 0;
                oVar.b = 0;
                f12262a = oVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
