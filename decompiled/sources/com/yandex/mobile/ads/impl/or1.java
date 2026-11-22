package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
final class or1 extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16481a;

    public or1(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }

    public or1(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16481a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = f92.f15466a;
        throw th;
    }

    public final void a(OutputStream outputStream) {
        if (this.f16481a) {
            ((BufferedOutputStream) this).out = outputStream;
            ((BufferedOutputStream) this).count = 0;
            this.f16481a = false;
            return;
        }
        throw new IllegalStateException();
    }
}
