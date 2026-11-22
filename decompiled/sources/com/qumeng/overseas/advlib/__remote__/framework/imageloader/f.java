package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.text.TextUtils;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes17.dex */
public final class f implements Closeable {
    static final String n = "journal";
    static final String o = "journal.tmp";
    static final String p = "libcore.io.DiskLruCache";

    /* renamed from: q, reason: collision with root package name */
    static final String f12940q = "1";
    static final long r = -1;
    private static final String s = "CLEAN";
    private static final String t = "DIRTY";
    private static final String u = "REMOVE";
    private static final String v = "READ";
    private static final Charset w = Charset.forName("UTF-8");
    private static final int x = 8192;

    /* renamed from: a, reason: collision with root package name */
    private final File f12941a;
    private final File b;
    private final File c;
    private final int d;
    private final long e;
    private final int f;
    private Writer j;
    private int k;
    private final LinkedHashMap<String, c> g = new LinkedHashMap<>(0, 0.75f, true);
    private final ExecutorService h = oqm.a.a(0, 1, "DiskLruCache", false);
    private long i = 0;
    private final Callable<Void> l = new a();
    private long m = 0;

    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (f.this) {
                if (f.this.j == null) {
                    return null;
                }
                f.this.m();
                if (f.this.g()) {
                    f.this.k();
                    f.this.k = 0;
                }
                return null;
            }
        }
    }

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f12943a;
        private boolean b;

        private class a extends FilterOutputStream {
            /* synthetic */ a(b bVar, OutputStream outputStream, a aVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }
        }

        /* synthetic */ b(f fVar, c cVar, a aVar) {
            this(cVar);
        }

        public void abort() throws IOException {
            f.this.a(this, false);
        }

        public void commit() throws IOException {
            if (!this.b) {
                f.this.a(this, true);
            } else {
                f.this.a(this, false);
                f.this.d(this.f12943a.f12945a);
            }
        }

        public String getString(int i) throws IOException {
            InputStream newInputStream = newInputStream(i);
            if (newInputStream != null) {
                return f.b(newInputStream);
            }
            return null;
        }

        public InputStream newInputStream(int i) throws IOException {
            synchronized (f.this) {
                if (this.f12943a.d != this) {
                    throw new IllegalStateException();
                }
                if (!this.f12943a.c) {
                    return null;
                }
                return new FileInputStream(this.f12943a.getCleanFile(i));
            }
        }

        public OutputStream newOutputStream(int i) throws IOException {
            a aVar;
            synchronized (f.this) {
                if (this.f12943a.d != this) {
                    throw new IllegalStateException();
                }
                aVar = new a(this, new FileOutputStream(this.f12943a.getDirtyFile(i)), null);
            }
            return aVar;
        }

        public void set(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i), f.w);
                try {
                    outputStreamWriter2.write(str);
                    f.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    f.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private b(c cVar) {
            this.f12943a = cVar;
        }
    }

    private final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f12945a;
        private final long[] b;
        private boolean c;
        private b d;
        private long e;

        /* synthetic */ c(f fVar, String str, a aVar) {
            this(str);
        }

        public File getCleanFile(int i) {
            return new File(f.this.f12941a, this.f12945a + "." + i);
        }

        public File getDirtyFile(int i) {
            return new File(f.this.f12941a, this.f12945a + "." + i + DefaultDiskStorage.FileType.TEMP);
        }

        public String getLengths() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        private c(String str) {
            this.f12945a = str;
            this.b = new long[f.this.f];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String[] strArr) throws IOException {
            if (strArr.length != f.this.f) {
                throw a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }

        private IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    public final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f12946a;
        private final long b;
        private final InputStream[] c;

        /* synthetic */ d(f fVar, String str, long j, InputStream[] inputStreamArr, a aVar) {
            this(str, j, inputStreamArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.c) {
                f.a((Closeable) inputStream);
            }
        }

        public b edit() throws IOException {
            return f.this.a(this.f12946a, this.b);
        }

        public InputStream getInputStream(int i) {
            return this.c[i];
        }

        public String getString(int i) throws IOException {
            return f.b(getInputStream(i));
        }

        private d(String str, long j, InputStream[] inputStreamArr) {
            this.f12946a = str;
            this.b = j;
            this.c = inputStreamArr;
        }
    }

    private f(File file, int i, int i2, long j) {
        this.f12941a = file;
        this.d = i;
        this.b = new File(file, n);
        this.c = new File(file, o);
        this.f = i2;
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        int i = this.k;
        return i >= 2000 && i >= this.g.size();
    }

    private void i() throws IOException {
        b(this.c);
        Iterator<c> it = this.g.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.f) {
                    this.i += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.f) {
                    b(next.getCleanFile(i));
                    b(next.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void j() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(this.b), 8192);
        try {
            String readLine = bufferedReader.readLine();
            String readLine2 = bufferedReader.readLine();
            String readLine3 = bufferedReader.readLine();
            String readLine4 = bufferedReader.readLine();
            String readLine5 = bufferedReader.readLine();
            if (!p.equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.d).equals(readLine3) || !Integer.toString(this.f).equals(readLine4) || !"".equals(readLine5)) {
                throw new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
            }
            while (true) {
                try {
                    String readLine6 = bufferedReader.readLine();
                    if (TextUtils.isEmpty(readLine6)) {
                        break;
                    } else {
                        c(readLine6);
                    }
                } catch (EOFException unused) {
                }
            }
        } finally {
            a((Closeable) bufferedReader);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() throws IOException {
        Throwable th;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        Writer writer = this.j;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            fileWriter = new FileWriter(this.c);
            try {
                bufferedWriter = new BufferedWriter(fileWriter, 8192);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileWriter = null;
        }
        try {
            bufferedWriter.write(p);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (c cVar : this.g.values()) {
                if (cVar.d != null) {
                    bufferedWriter.write("DIRTY " + cVar.f12945a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + cVar.f12945a + cVar.getLengths() + '\n');
                }
            }
            try {
                bufferedWriter.close();
            } catch (Throwable unused) {
            }
            try {
                fileWriter.close();
            } catch (Throwable unused2) {
            }
            this.c.renameTo(this.b);
            this.j = new BufferedWriter(new FileWriter(this.b, true), 8192);
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Throwable unused3) {
                }
            }
            if (fileWriter == null) {
                throw th;
            }
            try {
                fileWriter.close();
                throw th;
            } catch (Throwable unused4) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws IOException {
        while (this.i > this.e) {
            d(this.g.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.j == null) {
            return;
        }
        Iterator it = new ArrayList(this.g.values()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.d != null) {
                cVar.d.abort();
            }
        }
        m();
        this.j.close();
        this.j = null;
    }

    public long h() {
        return this.e;
    }

    public synchronized long l() {
        return this.i;
    }

    private static void b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private void c(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith(u)) {
                this.g.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        c cVar = this.g.get(substring);
        a aVar = null;
        if (cVar == null) {
            cVar = new c(this, substring, aVar);
            this.g.put(substring, cVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(s)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            cVar.c = true;
            cVar.d = null;
            cVar.b(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith(t)) {
            cVar.d = new b(this, cVar, aVar);
        } else if (indexOf2 == -1 && indexOf == 4) {
            str.startsWith(v);
        }
    }

    public synchronized boolean d(String str) throws IOException {
        b();
        e(str);
        c cVar = this.g.get(str);
        if (cVar != null && cVar.d == null) {
            for (int i = 0; i < this.f; i++) {
                File cleanFile = cVar.getCleanFile(i);
                if (!cleanFile.delete()) {
                    throw new IOException("failed to delete " + cleanFile);
                }
                this.i -= cVar.b[i];
                cVar.b[i] = 0;
            }
            this.k++;
            this.j.append((CharSequence) ("REMOVE " + str + '\n'));
            this.g.remove(str);
            if (g()) {
                this.h.submit(this.l);
            }
            return true;
        }
        return false;
    }

    public File e() {
        return this.f12941a;
    }

    public boolean f() {
        return this.j == null;
    }

    private void e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(InputStream inputStream) throws IOException {
        return a((Reader) new InputStreamReader(inputStream, w));
    }

    public synchronized d b(String str) throws IOException {
        Throwable th;
        try {
            try {
                b();
                e(str);
                c cVar = this.g.get(str);
                if (cVar == null) {
                    return null;
                }
                if (!cVar.c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f];
                for (int i = 0; i < this.f; i++) {
                    try {
                        try {
                            inputStreamArr[i] = new FileInputStream(cVar.getCleanFile(i));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                this.k++;
                this.j.append((CharSequence) ("READ " + str + '\n'));
                if (g()) {
                    this.h.submit(this.l);
                }
                return new d(this, str, cVar.e, inputStreamArr, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String a(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            reader.close();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                return;
            }
        }
    }

    public synchronized void d() throws IOException {
        b();
        m();
        this.j.flush();
    }

    public static f a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 > 0) {
            f fVar = new f(file, i, i2, j);
            if (fVar.b.exists()) {
                try {
                    fVar.j();
                    fVar.i();
                    fVar.j = new BufferedWriter(new FileWriter(fVar.b, true), 8192);
                    return fVar;
                } catch (IOException unused) {
                    fVar.c();
                }
            }
            file.mkdirs();
            f fVar2 = new f(file, i, i2, j);
            fVar2.k();
            return fVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public void c() throws IOException {
        close();
        a(this.f12941a);
    }

    private void b() {
        if (this.j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public b a(String str) throws IOException {
        return a(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized b a(String str, long j) throws IOException {
        b();
        e(str);
        c cVar = this.g.get(str);
        a aVar = null;
        if (j != -1 && (cVar == null || cVar.e != j)) {
            return null;
        }
        if (cVar != null) {
            if (cVar.d != null) {
                return null;
            }
        } else {
            cVar = new c(this, str, aVar);
            this.g.put(str, cVar);
        }
        b bVar = new b(this, cVar, aVar);
        cVar.d = bVar;
        this.j.write("DIRTY " + str + '\n');
        this.j.flush();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(b bVar, boolean z) throws IOException {
        c cVar = bVar.f12943a;
        if (cVar.d == bVar) {
            if (z && !cVar.c) {
                for (int i = 0; i < this.f; i++) {
                    if (!cVar.getDirtyFile(i).exists()) {
                        bVar.abort();
                        throw new IllegalStateException("edit didn't create file " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f; i2++) {
                File dirtyFile = cVar.getDirtyFile(i2);
                if (z) {
                    if (dirtyFile.exists()) {
                        File cleanFile = cVar.getCleanFile(i2);
                        dirtyFile.renameTo(cleanFile);
                        long j = cVar.b[i2];
                        long length = cleanFile.length();
                        cVar.b[i2] = length;
                        this.i = (this.i - j) + length;
                    }
                } else {
                    b(dirtyFile);
                }
            }
            this.k++;
            cVar.d = null;
            if (cVar.c | z) {
                cVar.c = true;
                this.j.write("CLEAN " + cVar.f12945a + cVar.getLengths() + '\n');
                if (z) {
                    long j2 = this.m;
                    this.m = 1 + j2;
                    cVar.e = j2;
                }
            } else {
                this.j.append((CharSequence) "REMOVE\n");
                this.g.remove(cVar.f12945a);
                this.j.write("REMOVE " + cVar.f12945a + '\n');
            }
            if (this.i > this.e || g()) {
                this.h.submit(this.l);
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
