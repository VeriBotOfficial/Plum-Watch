package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes14.dex */
public final class a extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f9946a;

    public a(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        this.f9946a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f9946a += i2;
    }
}
