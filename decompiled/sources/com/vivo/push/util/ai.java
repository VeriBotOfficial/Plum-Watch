package com.vivo.push.util;

import java.text.SimpleDateFormat;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WindowPeriodManager.java */
/* loaded from: classes2.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f14153a = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private static volatile ai c;
    private CopyOnWriteArrayList<a> d = new CopyOnWriteArrayList<>();
    private String e;

    private ai() {
    }

    public static synchronized ai a() {
        ai aiVar;
        synchronized (ai.class) {
            if (c == null) {
                c = new ai();
            }
            aiVar = c;
        }
        return aiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ai.a(java.lang.String):boolean");
    }

    /* compiled from: WindowPeriodManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f14154a;
        private long b;

        public a(long j, long j2) {
            this.f14154a = j;
            this.b = j2;
        }

        public final long a() {
            return this.f14154a;
        }

        public final long b() {
            return this.b;
        }
    }
}
