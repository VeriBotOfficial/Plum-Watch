package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes5.dex */
public class lc0 implements a80 {

    /* renamed from: a, reason: collision with root package name */
    private final a80 f16099a;

    public lc0(wz wzVar) {
        this.f16099a = wzVar;
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f16099a.read(bArr, i, i2);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void b(int i) throws IOException {
        this.f16099a.b(i);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void c() {
        this.f16099a.c();
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public long d() {
        return this.f16099a.d();
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public long a() {
        return this.f16099a.a();
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        this.f16099a.a(bArr, i, i2);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public long b() {
        return this.f16099a.b();
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f16099a.a(bArr, 0, i2, z);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f16099a.b(bArr, 0, i2, z);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void a(int i) throws IOException {
        this.f16099a.a(i);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void b(byte[] bArr, int i, int i2) throws IOException {
        this.f16099a.b(bArr, i, i2);
    }
}
