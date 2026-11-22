package com.huawei.hms.scankit.p;

import java.util.Formatter;

/* compiled from: DetectionResultColumn.java */
/* renamed from: com.huawei.hms.scankit.p.ma, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C3028ma {

    /* renamed from: a, reason: collision with root package name */
    private final C3008ha f10667a;
    private final C3012ia[] b;

    C3028ma(C3008ha c3008ha) {
        this.f10667a = new C3008ha(c3008ha);
        this.b = new C3012ia[(c3008ha.d() - c3008ha.f()) + 1];
    }

    final void a(int i, C3012ia c3012ia) {
        this.b[c(i)] = c3012ia;
    }

    final C3012ia b(int i) {
        C3012ia c3012ia;
        C3012ia c3012ia2;
        C3012ia a2 = a(i);
        if (a2 != null) {
            return a2;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int c = c(i) - i2;
            if (c >= 0 && (c3012ia2 = this.b[c]) != null) {
                return c3012ia2;
            }
            int c2 = c(i) + i2;
            C3012ia[] c3012iaArr = this.b;
            if (c2 < c3012iaArr.length && (c3012ia = c3012iaArr[c2]) != null) {
                return c3012ia;
            }
        }
        return null;
    }

    final int c(int i) {
        return i - this.f10667a.f();
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (C3012ia c3012ia : this.b) {
                if (c3012ia == null) {
                    int i2 = i + 1;
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i = i2;
                } else {
                    int i3 = i + 1;
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(c3012ia.c()), Integer.valueOf(c3012ia.e()));
                    i = i3;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    final C3012ia a(int i) {
        return this.b[c(i)];
    }

    final C3008ha a() {
        return this.f10667a;
    }

    final C3012ia[] b() {
        return this.b;
    }
}
