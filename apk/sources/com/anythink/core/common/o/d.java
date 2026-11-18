package com.anythink.core.common.o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f4248a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected long f;
    protected long g;
    protected int h;

    public final int a() {
        return this.f4248a;
    }

    private void a(int r1) {
        this.f4248a = r1;
    }

    public final int b() {
        return this.b;
    }

    private void b(int r1) {
        this.b = r1;
    }

    public final int c() {
        return this.c;
    }

    private void c(int r1) {
        this.c = r1;
    }

    public final int d() {
        return this.d;
    }

    private void d(int r1) {
        this.d = r1;
    }

    public final int e() {
        return this.e;
    }

    private void e(int r1) {
        this.e = r1;
    }

    public final long f() {
        return this.f;
    }

    private void a(long j) {
        this.f = j;
    }

    public final long g() {
        return this.g;
    }

    private void b(long j) {
        this.g = j;
    }

    public final int h() {
        return this.h;
    }

    private void f(int r1) {
        this.h = r1;
    }

    public final String toString() {
        return "PerformaceEntry{totalMemory=" + this.f4248a + ", phoneVailMemory=" + this.b + ", appJavaMemory=" + this.c + ", appMaxJavaMemory=" + this.d + ", cpuNum=" + this.e + ", totalStorage=" + this.f + ", lastStorage=" + this.g + ", cpuRate=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }
}
