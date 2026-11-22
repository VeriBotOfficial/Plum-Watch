package com.baidu.bbalbscesium.k.a;

import java.security.InvalidKeyException;

/* loaded from: classes12.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    final b f7422a;
    final int b;
    byte[] c;

    f(b bVar) {
        this.f7422a = bVar;
        this.b = bVar.a();
    }

    final int a() {
        return this.b;
    }

    abstract void a(boolean z, String str, byte[] bArr, byte[] bArr2) throws InvalidKeyException;

    abstract void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    final b b() {
        return this.f7422a;
    }

    void b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        a(bArr, i, i2, bArr2, i3);
    }

    abstract String c();

    abstract void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    void d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        c(bArr, i, i2, bArr2, i3);
    }

    final byte[] d() {
        return this.c;
    }

    abstract void e();

    abstract void f();

    abstract void g();
}
