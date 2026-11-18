package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f9946a;

    public a(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int r5) throws IOException {
        this.out.write(r5);
        this.f9946a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int r4, int r5) throws IOException {
        this.out.write(bArr, r4, r5);
        this.f9946a += (long) r5;
    }
}
