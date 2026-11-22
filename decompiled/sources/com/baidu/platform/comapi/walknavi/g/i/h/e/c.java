package com.baidu.platform.comapi.walknavi.g.i.h.e;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: IoUtils.java */
/* loaded from: classes13.dex */
public class c {

    /* compiled from: IoUtils.java */
    static class a implements InterfaceC0410c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f8739a;

        a(d dVar) {
            this.f8739a = dVar;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.d
        public void a(long j, long j2) {
            d dVar = this.f8739a;
            if (dVar != null) {
                dVar.a(j, j2);
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.b
        public boolean a() {
            return false;
        }
    }

    /* compiled from: IoUtils.java */
    public interface b {
        boolean a();
    }

    /* compiled from: IoUtils.java */
    /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.e.c$c, reason: collision with other inner class name */
    public interface InterfaceC0410c extends d, b {
    }

    /* compiled from: IoUtils.java */
    public interface d {
        void a(long j, long j2);
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = com.baidu.platform.comapi.walknavi.g.i.h.e.a.d(file);
            try {
                a(inputStream, fileOutputStream);
                a(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static void a(InputStream inputStream, File file, long j, d dVar) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = com.baidu.platform.comapi.walknavi.g.i.h.e.a.d(file);
            try {
                a(inputStream, fileOutputStream, j, dVar);
                a(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, long j, d dVar) throws IOException {
        a(inputStream, outputStream, j, (InterfaceC0410c) new a(dVar));
    }

    public static void a(InputStream inputStream, OutputStream outputStream, long j, InterfaceC0410c interfaceC0410c) throws IOException {
        byte[] bArr = new byte[1024];
        long j2 = 0;
        do {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
            j2 += read;
            if (interfaceC0410c != null) {
                interfaceC0410c.a(j2, j);
            }
        } while (!interfaceC0410c.a());
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
