package com.yandex.mobile.ads.impl;

import androidx.media3.datasource.cache.CacheDataSink;
import com.yandex.mobile.ads.impl.sm;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class vm implements sv {

    /* renamed from: a, reason: collision with root package name */
    private final sm f17175a;
    private final long b = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    private final int c = 20480;
    private xv d;
    private long e;
    private File f;
    private OutputStream g;
    private long h;
    private long i;
    private or1 j;

    public vm(sm smVar) {
        this.f17175a = (sm) hg.a(smVar);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private sm f17176a;

        public final b a(sm smVar) {
            this.f17176a = smVar;
            return this;
        }

        public final vm a() {
            sm smVar = this.f17176a;
            smVar.getClass();
            return new vm(smVar);
        }
    }

    public static final class a extends sm.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sv
    public final void write(byte[] bArr, int i, int i2) throws a {
        xv xvVar = this.d;
        if (xvVar == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    a();
                    b(xvVar);
                }
                int min = (int) Math.min(i2 - i3, this.e - this.h);
                OutputStream outputStream = this.g;
                int i4 = f92.f15466a;
                outputStream.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new a(e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sv
    public final void close() throws a {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    private void b(xv xvVar) throws IOException {
        long j = xvVar.g;
        long min = j != -1 ? Math.min(j - this.i, this.e) : -1L;
        sm smVar = this.f17175a;
        String str = xvVar.h;
        int i = f92.f15466a;
        this.f = smVar.a(str, xvVar.f + this.i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            or1 or1Var = this.j;
            if (or1Var == null) {
                this.j = new or1(fileOutputStream, this.c);
            } else {
                or1Var.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    private void a() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            f92.a((Closeable) this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.f17175a.a(file, this.h);
        } catch (Throwable th) {
            f92.a((Closeable) this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.sv
    public final void a(xv xvVar) throws a {
        xvVar.h.getClass();
        if (xvVar.g == -1 && (xvVar.i & 2) == 2) {
            this.d = null;
            return;
        }
        this.d = xvVar;
        this.e = (xvVar.i & 4) == 4 ? this.b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            b(xvVar);
        } catch (IOException e) {
            throw new a(e);
        }
    }
}
