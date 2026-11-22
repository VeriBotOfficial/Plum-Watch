package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes5.dex */
final class jn {

    /* renamed from: a, reason: collision with root package name */
    public final int f15931a;
    public final String b;
    private final TreeSet<oy1> c = new TreeSet<>();
    private final ArrayList<a> d = new ArrayList<>();
    private nz e;

    public jn(int i, String str, nz nzVar) {
        this.f15931a = i;
        this.b = str;
        this.e = nzVar;
    }

    public final boolean d() {
        return this.d.isEmpty();
    }

    public final void a(oy1 oy1Var) {
        this.c.add(oy1Var);
    }

    public final oy1 b(long j, long j2) {
        oy1 a2 = oy1.a(this.b, j);
        oy1 floor = this.c.floor(a2);
        if (floor != null && floor.c + floor.d > j) {
            return floor;
        }
        oy1 ceiling = this.c.ceiling(a2);
        if (ceiling != null) {
            long j3 = ceiling.c - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return oy1.a(this.b, j, j2);
    }

    public final boolean d(long j, long j2) {
        int i;
        for (0; i < this.d.size(); i + 1) {
            a aVar = this.d.get(i);
            long j3 = aVar.f15932a;
            if (j3 > j) {
                i = (j2 != -1 && j + j2 <= j3) ? i + 1 : 0;
                return false;
            }
            long j4 = aVar.b;
            if (j4 != -1 && j3 + j4 <= j) {
            }
            return false;
        }
        this.d.add(new a(j, j2));
        return true;
    }

    public final boolean a(es esVar) {
        this.e = this.e.a(esVar);
        return !r2.equals(r0);
    }

    public final boolean c() {
        return this.c.isEmpty();
    }

    public final int hashCode() {
        return this.e.hashCode() + v3.a(this.b, this.f15931a * 31, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jn.class == obj.getClass()) {
            jn jnVar = (jn) obj;
            if (this.f15931a == jnVar.f15931a && this.b.equals(jnVar.b) && this.c.equals(jnVar.c) && this.e.equals(jnVar.e)) {
                return true;
            }
        }
        return false;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f15932a;
        public final long b;

        public a(long j, long j2) {
            this.f15932a = j;
            this.b = j2;
        }
    }

    public final TreeSet<oy1> b() {
        return this.c;
    }

    public final boolean c(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            a aVar = this.d.get(i);
            long j3 = aVar.b;
            if (j3 == -1) {
                if (j >= aVar.f15932a) {
                    return true;
                }
            } else if (j2 == -1) {
                continue;
            } else {
                long j4 = aVar.f15932a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        if (j2 >= 0) {
            oy1 b = b(j, j2);
            if (!b.e) {
                long j3 = b.d;
                return -Math.min(j3 != -1 ? j3 : Long.MAX_VALUE, j2);
            }
            long j4 = j + j2;
            long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
            long j6 = b.c + b.d;
            if (j6 < j5) {
                for (oy1 oy1Var : this.c.tailSet(b, false)) {
                    long j7 = oy1Var.c;
                    if (j7 > j6) {
                        break;
                    }
                    j6 = Math.max(j6, j7 + oy1Var.d);
                    if (j6 >= j5) {
                        break;
                    }
                }
            }
            return Math.min(j6 - j, j2);
        }
        throw new IllegalArgumentException();
    }

    public final nz a() {
        return this.e;
    }

    public final boolean a(fn fnVar) {
        if (!this.c.remove(fnVar)) {
            return false;
        }
        File file = fnVar.f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final oy1 a(oy1 oy1Var, long j, boolean z) {
        if (this.c.remove(oy1Var)) {
            File file = oy1Var.f;
            file.getClass();
            if (z) {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                long j2 = oy1Var.c;
                int i = this.f15931a;
                int i2 = oy1.k;
                File file2 = new File(parentFile, i + "." + j2 + "." + j + ".v3.exo");
                if (file.renameTo(file2)) {
                    file = file2;
                } else {
                    et0.d("CachedContent", "Failed to rename " + file + " to " + file2);
                }
            }
            oy1 a2 = oy1Var.a(file, j);
            this.c.add(a2);
            return a2;
        }
        throw new IllegalStateException();
    }

    public final void a(long j) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).f15932a == j) {
                this.d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
