package com.anythink.core.common.n.c;

/* loaded from: classes12.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    static final long f4241a = 65536;
    static s b;
    static long c;

    private t() {
    }

    static s a() {
        synchronized (t.class) {
            s sVar = b;
            if (sVar != null) {
                b = sVar.h;
                sVar.h = null;
                c -= 8192;
                return sVar;
            }
            return new s();
        }
    }

    static void a(s sVar) {
        if (sVar.h != null || sVar.i != null) {
            throw new IllegalArgumentException();
        }
        if (sVar.f) {
            return;
        }
        synchronized (t.class) {
            long j = c;
            if (j + 8192 > 65536) {
                return;
            }
            c = j + 8192;
            sVar.h = b;
            sVar.e = 0;
            sVar.d = 0;
            b = sVar;
        }
    }
}
