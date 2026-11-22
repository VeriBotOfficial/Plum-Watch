package com.amap.api.col.p0003sl;

import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes11.dex */
public final class eb implements Closeable {
    static final Pattern o = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final Charset p = Charset.forName("US-ASCII");

    /* renamed from: q, reason: collision with root package name */
    private static final ThreadFactory f1634q;
    static ThreadPoolExecutor r;
    private static final OutputStream s;

    /* renamed from: a, reason: collision with root package name */
    private final File f1635a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private Writer i;
    private int l;
    private long h = 0;
    private int j = 1000;
    private final LinkedHashMap<String, f> k = new LinkedHashMap<>(0, 0.75f, true);
    private long m = 0;
    private final Callable<Void> n = new b();

    /* compiled from: DiskLruCache.java */
    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f1636a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "disklrucache#" + this.f1636a.getAndIncrement());
        }
    }

    /* compiled from: DiskLruCache.java */
    final class b implements Callable<Void> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (eb.this) {
                if (eb.this.i == null) {
                    return null;
                }
                eb.this.j();
                if (eb.this.g()) {
                    eb.this.e();
                    eb.e(eb.this);
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    static class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final f f1638a;
        private final boolean[] b;
        private boolean c;

        /* compiled from: DiskLruCache.java */
        private class a extends FilterOutputStream {
            /* synthetic */ a(d dVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    d.c(d.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    d.c(d.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    d.c(d.this);
                }
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    d.c(d.this);
                }
            }
        }

        /* synthetic */ d(eb ebVar, f fVar, byte b) {
            this(fVar);
        }

        static /* synthetic */ boolean c(d dVar) {
            dVar.c = true;
            return true;
        }

        private d(f fVar) {
            this.f1638a = fVar;
            this.b = fVar.c ? null : new boolean[eb.this.g];
        }

        public final OutputStream a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i < 0 || i >= eb.this.g) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + eb.this.g);
            }
            synchronized (eb.this) {
                if (this.f1638a.d != this) {
                    throw new IllegalStateException();
                }
                if (!this.f1638a.c) {
                    this.b[i] = true;
                }
                File b = this.f1638a.b(i);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused) {
                    eb.this.f1635a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused2) {
                        return eb.s;
                    }
                }
                aVar = new a(this, fileOutputStream, (byte) 0);
            }
            return aVar;
        }

        public final void b() throws IOException {
            if (!this.c) {
                eb.a(eb.this, this, true);
            } else {
                eb.a(eb.this, this, false);
                eb.this.d(this.f1638a.f1641a);
            }
        }

        public final void a() throws IOException {
            eb.a(eb.this, this, false);
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream[] f1640a;

        /* synthetic */ e(eb ebVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(ebVar, str, j, inputStreamArr, jArr);
        }

        public final InputStream a(int i) {
            return this.f1640a[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f1640a) {
                eb.a(inputStream);
            }
        }

        private e(eb ebVar, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f1640a = inputStreamArr;
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class f {

        /* renamed from: a, reason: collision with root package name */
        private final String f1641a;
        private final long[] b;
        private boolean c;
        private d d;
        private long e;

        /* synthetic */ f(eb ebVar, String str, byte b) {
            this(str);
        }

        private f(String str) {
            this.f1641a = str;
            this.b = new long[eb.this.g];
        }

        public final File b(int i) {
            return new File(eb.this.f1635a, this.f1641a + "." + i + DefaultDiskStorage.FileType.TEMP);
        }

        static /* synthetic */ boolean a(f fVar) {
            fVar.c = true;
            return true;
        }

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        public final File a(int i) {
            return new File(eb.this.f1635a, this.f1641a + "." + i);
        }

        static void a(f fVar, String[] strArr) throws IOException {
            if (strArr.length == eb.this.g) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        fVar.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
                    }
                }
                return;
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    static {
        Charset.forName("UTF-8");
        a aVar = new a();
        f1634q = aVar;
        r = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        s = new c();
    }

    private eb(File file, int i, int i2, long j) {
        this.f1635a = file;
        this.e = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.g = i2;
        this.f = j;
    }

    static /* synthetic */ int e(eb ebVar) {
        ebVar.l = 0;
        return 0;
    }

    private void h() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() throws IOException {
        while (true) {
            if (this.h <= this.f && this.k.size() <= this.j) {
                return;
            } else {
                d(this.k.entrySet().iterator().next().getKey());
            }
        }
    }

    public static ThreadPoolExecutor l() {
        try {
            ThreadPoolExecutor threadPoolExecutor = r;
            if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
                r = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), f1634q);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.i == null) {
            return;
        }
        Iterator it = new ArrayList(this.k.values()).iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.d != null) {
                fVar.d.a();
            }
        }
        j();
        this.i.close();
        this.i = null;
    }

    public final synchronized void i() throws IOException {
        h();
        j();
        this.i.flush();
    }

    public final File k() {
        return this.f1635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        throw new java.io.IOException("unexpected journal line: ".concat(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.eb.b():void");
    }

    private void c() throws IOException {
        a(this.c);
        Iterator<f> it = this.k.values().iterator();
        while (it.hasNext()) {
            f next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.g) {
                    this.h += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.g) {
                    a(next.a(i));
                    a(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public static void d() {
        ThreadPoolExecutor threadPoolExecutor = r;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        r.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() throws IOException {
        Writer writer = this.i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), p));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (f fVar : this.k.values()) {
                if (fVar.d != null) {
                    bufferedWriter.write("DIRTY " + fVar.f1641a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + fVar.f1641a + fVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.b.exists()) {
                a(this.b, this.d, true);
            }
            a(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), p));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    public final void f() throws IOException {
        close();
        b(this.f1635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0008, code lost:
    
        if (r2 > 10000) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r2) {
        /*
            r1 = this;
            r0 = 10
            if (r2 >= r0) goto L6
        L4:
            r2 = r0
            goto Lb
        L6:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r2 <= r0) goto Lb
            goto L4
        Lb:
            r1.j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.eb.a(int):void");
    }

    public static eb a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            eb ebVar = new eb(file, i, i2, j);
            if (ebVar.b.exists()) {
                try {
                    ebVar.b();
                    ebVar.c();
                    ebVar.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ebVar.b, true), p));
                    return ebVar;
                } catch (Throwable unused) {
                    ebVar.close();
                    b(ebVar.f1635a);
                }
            }
            file.mkdirs();
            eb ebVar2 = new eb(file, i, i2, j);
            ebVar2.e();
            return ebVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public final synchronized boolean d(String str) throws IOException {
        h();
        a(str);
        f fVar = this.k.get(str);
        if (fVar != null && fVar.d == null) {
            for (int i = 0; i < this.g; i++) {
                File a2 = fVar.a(i);
                if (a2.exists() && !a2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(a2)));
                }
                this.h -= fVar.b[i];
                fVar.b[i] = 0;
            }
            this.l++;
            this.i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.k.remove(str);
            if (g()) {
                l().submit(this.n);
            }
            return true;
        }
        return false;
    }

    public final synchronized e c(String str) throws IOException {
        Throwable th;
        InputStream inputStream;
        try {
            h();
            a(str);
            f fVar = this.k.get(str);
            if (fVar == null) {
                return null;
            }
            if (!fVar.c) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.g];
            for (int i = 0; i < this.g; i++) {
                try {
                    try {
                        try {
                            inputStreamArr[i] = new FileInputStream(fVar.a(i));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                            a(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
            this.l++;
            this.i.append((CharSequence) ("READ " + str + '\n'));
            if (g()) {
                l().submit(this.n);
            }
            return new e(this, str, fVar.e, inputStreamArr, fVar.b, (byte) 0);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    static void a(eb ebVar, d dVar, boolean z) throws IOException {
        synchronized (ebVar) {
            f fVar = dVar.f1638a;
            if (fVar.d == dVar) {
                if (z && !fVar.c) {
                    for (int i = 0; i < ebVar.g; i++) {
                        if (dVar.b[i]) {
                            if (!fVar.b(i).exists()) {
                                dVar.a();
                                return;
                            }
                        } else {
                            dVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                        }
                    }
                }
                for (int i2 = 0; i2 < ebVar.g; i2++) {
                    File b2 = fVar.b(i2);
                    if (z) {
                        if (b2.exists()) {
                            File a2 = fVar.a(i2);
                            b2.renameTo(a2);
                            long j = fVar.b[i2];
                            long length = a2.length();
                            fVar.b[i2] = length;
                            ebVar.h = (ebVar.h - j) + length;
                        }
                    } else {
                        a(b2);
                    }
                }
                ebVar.l++;
                fVar.d = null;
                if (!(fVar.c | z)) {
                    ebVar.k.remove(fVar.f1641a);
                    ebVar.i.write("REMOVE " + fVar.f1641a + '\n');
                } else {
                    f.a(fVar);
                    ebVar.i.write("CLEAN " + fVar.f1641a + fVar.a() + '\n');
                    if (z) {
                        long j2 = ebVar.m;
                        ebVar.m = 1 + j2;
                        fVar.e = j2;
                    }
                }
                ebVar.i.flush();
                if (ebVar.h > ebVar.f || ebVar.g()) {
                    l().submit(ebVar.n);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    private static void a(String str) {
        if (!o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public final d b(String str) throws IOException {
        synchronized (this) {
            h();
            a(str);
            f fVar = this.k.get(str);
            byte b2 = 0;
            if (fVar != null) {
                if (fVar.d != null) {
                    return null;
                }
            } else {
                fVar = new f(this, str, b2);
                this.k.put(str, fVar);
            }
            d dVar = new d(this, fVar, b2);
            fVar.d = dVar;
            this.i.write("DIRTY " + str + '\n');
            this.i.flush();
            return dVar;
        }
    }

    public static void b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
    }
}
