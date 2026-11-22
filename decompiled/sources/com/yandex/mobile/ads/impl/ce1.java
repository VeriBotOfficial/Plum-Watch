package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes5.dex */
final class ce1 {

    /* renamed from: a, reason: collision with root package name */
    public int f15180a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final ag1 g = new ag1(255);

    public final boolean a(wz wzVar, boolean z) throws IOException {
        this.f15180a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g.c(27);
        try {
            if (wzVar.b(this.g.c(), 0, 27, z) && this.g.v() == 1332176723) {
                if (this.g.t() != 0) {
                    if (z) {
                        return false;
                    }
                    throw eg1.a("unsupported bit stream revision");
                }
                this.f15180a = this.g.t();
                this.b = this.g.l();
                this.g.n();
                this.g.n();
                this.g.n();
                int t = this.g.t();
                this.c = t;
                this.d = t + 27;
                this.g.c(t);
                try {
                    if (wzVar.b(this.g.c(), 0, this.c, z)) {
                        for (int i = 0; i < this.c; i++) {
                            this.f[i] = this.g.t();
                            this.e += this.f[i];
                        }
                        return true;
                    }
                } catch (EOFException e) {
                    if (!z) {
                        throw e;
                    }
                }
                return false;
            }
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
        }
        return false;
    }

    ce1() {
    }

    public final boolean a(wz wzVar, long j) throws IOException {
        if (wzVar.a() == wzVar.d()) {
            this.g.c(4);
            while (true) {
                if (j != -1 && wzVar.a() + 4 >= j) {
                    break;
                }
                try {
                    if (!wzVar.b(this.g.c(), 0, 4, true)) {
                        break;
                    }
                    this.g.e(0);
                    if (this.g.v() == 1332176723) {
                        wzVar.c();
                        return true;
                    }
                    wzVar.a(1);
                } catch (EOFException unused) {
                }
            }
            do {
                if (j != -1 && wzVar.a() >= j) {
                    break;
                }
            } while (wzVar.c(1) != -1);
            return false;
        }
        throw new IllegalArgumentException();
    }
}
