package com.anythink.basead.exoplayer.k;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2670a = "AtomicFile";
    private final File b;
    private final File c;

    public b(File file) {
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public final void a() {
        this.b.delete();
        this.c.delete();
    }

    public final OutputStream b() {
        if (this.b.exists()) {
            if (!this.c.exists()) {
                if (!this.b.renameTo(this.c)) {
                    Log.w(f2670a, "Couldn't rename file " + this.b + " to backup file " + this.c);
                }
            } else {
                this.b.delete();
            }
        }
        try {
            return new a(this.b);
        } catch (FileNotFoundException e) {
            if (!this.b.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.b, e);
            }
            try {
                return new a(this.b);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.b, e2);
            }
        }
    }

    public final void a(OutputStream outputStream) {
        outputStream.close();
        this.c.delete();
    }

    private void d() {
        if (this.c.exists()) {
            this.b.delete();
            this.c.renameTo(this.b);
        }
    }

    private static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f2672a;
        private boolean b = false;

        public a(File file) {
            this.f2672a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            flush();
            try {
                this.f2672a.getFD().sync();
            } catch (IOException e) {
                Log.w(b.f2670a, "Failed to sync file descriptor:", e);
            }
            this.f2672a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f2672a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.f2672a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f2672a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            this.f2672a.write(bArr, i, i2);
        }
    }

    public final InputStream c() {
        if (this.c.exists()) {
            this.b.delete();
            this.c.renameTo(this.b);
        }
        return new FileInputStream(this.b);
    }
}
