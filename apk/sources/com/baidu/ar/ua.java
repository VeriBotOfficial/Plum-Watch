package com.baidu.ar;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f7242a;
    public int b;
    public int c;
    public long d;

    public ua(ByteBuffer byteBuffer, long j) {
        this.f7242a = byteBuffer;
        this.d = j;
    }

    public ByteBuffer a() {
        return this.f7242a;
    }

    public void a(int r1) {
        this.c = r1;
    }

    public int b() {
        return this.c;
    }

    public void b(int r1) {
        this.b = r1;
    }

    public long c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }
}
