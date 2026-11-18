package com.anythink.core.common.n.a;

import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4048a = 60;
    public static final int b = -1;
    public static final int c = 1;
    public static final int d = 28;
    public static final int e = 5;
    public static final int f = 16;
    public final String g;
    public final int h;
    public final int i;
    public final long j;
    public final int k;
    public final String l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f4049a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
    }

    public l(String str, int r2, int r3, long j, int r6, String str2) {
        this.g = str;
        this.h = r2;
        this.i = r3 <= 0 ? r3 == -1 ? -1 : 60 : r3;
        this.j = j;
        this.k = r6;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            if (this.g.equals(lVar.g) && this.h == lVar.h && this.i == lVar.i && this.j == lVar.j) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.h == 1;
    }

    public final boolean b() {
        return this.h == 28;
    }

    private boolean c() {
        return this.h == 5;
    }

    private boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int r2 = this.i;
        return r2 != -1 && this.j + ((long) r2) <= jCurrentTimeMillis;
    }

    private boolean a(long j) {
        int r0 = this.i;
        return r0 != -1 && this.j + ((long) r0) <= j;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{type:%s, value:%s, source:%s, server:%s, timestamp:%d, ttl:%d}", Integer.valueOf(this.h), this.g, Integer.valueOf(this.k), this.l, Long.valueOf(this.j), Integer.valueOf(this.i));
    }
}
