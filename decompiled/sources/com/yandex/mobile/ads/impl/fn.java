package com.yandex.mobile.ads.impl;

import java.io.File;

/* loaded from: classes5.dex */
public class fn implements Comparable<fn> {
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final File f;
    public final long g;

    public final String toString() {
        return "[" + this.c + ", " + this.d + "]";
    }

    @Override // java.lang.Comparable
    public final int compareTo(fn fnVar) {
        fn fnVar2 = fnVar;
        if (!this.b.equals(fnVar2.b)) {
            return this.b.compareTo(fnVar2.b);
        }
        long j = this.c - fnVar2.c;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public fn(String str, long j, long j2, long j3, File file) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = file != null;
        this.f = file;
        this.g = j3;
    }
}
