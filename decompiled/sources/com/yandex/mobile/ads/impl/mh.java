package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class mh {

    /* renamed from: a, reason: collision with root package name */
    private final File f16239a;
    private final File b;

    public final FileInputStream c() throws FileNotFoundException {
        if (this.b.exists()) {
            this.f16239a.delete();
            this.b.renameTo(this.f16239a);
        }
        return new FileInputStream(this.f16239a);
    }

    public mh(File file) {
        this.f16239a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public final boolean b() {
        return this.f16239a.exists() || this.b.exists();
    }

    public final void a() {
        this.f16239a.delete();
        this.b.delete();
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.b.delete();
    }

    public final OutputStream d() throws IOException {
        if (this.f16239a.exists()) {
            if (!this.b.exists()) {
                if (!this.f16239a.renameTo(this.b)) {
                    et0.d("AtomicFile", "Couldn't rename file " + this.f16239a + " to backup file " + this.b);
                }
            } else {
                this.f16239a.delete();
            }
        }
        try {
            return new a(this.f16239a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f16239a.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new a(this.f16239a);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + this.f16239a, e2);
                }
            }
            throw new IOException("Couldn't create " + this.f16239a, e);
        }
    }

    private static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f16240a;
        private boolean b = false;

        public a(File file) throws FileNotFoundException {
            this.f16240a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            this.f16240a.flush();
            try {
                this.f16240a.getFD().sync();
            } catch (IOException e) {
                et0.b("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f16240a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f16240a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f16240a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f16240a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f16240a.write(bArr, i, i2);
        }
    }
}
