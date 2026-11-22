package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.tm;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q10 implements tm {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f16617a = new LinkedHashMap(16, 0.75f, true);
    private long b = 0;
    private final d c;
    private final int d;

    final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f16618a;

        a(File file) {
            this.f16618a = file;
        }
    }

    static class c extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final long f16620a;
        private long b;

        c(BufferedInputStream bufferedInputStream, long j) {
            super(bufferedInputStream);
            this.f16620a = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.b++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.b += read;
            }
            return read;
        }
    }

    public interface d {
    }

    public q10(File file, int i) {
        this.c = new a(file);
        this.d = i;
    }

    @Override // com.yandex.mobile.ads.impl.tm
    public final synchronized tm.a get(String str) {
        b bVar = (b) this.f16617a.get(str);
        if (bVar == null) {
            return null;
        }
        File file = ((a) this.c).f16618a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                b a2 = b.a(cVar);
                if (!TextUtils.equals(str, a2.b)) {
                    Object[] objArr = {file2.getAbsolutePath(), str, a2.b};
                    boolean z = ti2.f16972a;
                    sp0.a(objArr);
                    b bVar2 = (b) this.f16617a.remove(str);
                    if (bVar2 != null) {
                        this.b -= bVar2.f16619a;
                    }
                    return null;
                }
                return bVar.a(a(cVar, cVar.f16620a - cVar.b));
            } finally {
                cVar.close();
            }
        } catch (IOException e) {
            Object[] objArr2 = {file2.getAbsolutePath(), e.toString()};
            boolean z2 = ti2.f16972a;
            sp0.a(objArr2);
            b(str);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.tm
    public final synchronized void a() {
        File file = ((a) this.c).f16618a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Object[] objArr = {file.getAbsolutePath()};
                boolean z = ti2.f16972a;
                sp0.b(objArr);
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                long length = file2.length();
                c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), length);
                try {
                    b a2 = b.a(cVar);
                    a2.f16619a = length;
                    String str = a2.b;
                    if (this.f16617a.containsKey(str)) {
                        this.b = (a2.f16619a - ((b) this.f16617a.get(str)).f16619a) + this.b;
                    } else {
                        this.b += a2.f16619a;
                    }
                    this.f16617a.put(str, a2);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            } catch (Throwable unused2) {
                Intrinsics.checkNotNullParameter(file2, "<this>");
                try {
                    file2.delete();
                } catch (Throwable unused3) {
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tm
    public final synchronized void a(String str) {
        tm.a aVar = get(str);
        if (aVar != null) {
            aVar.f = 0L;
            aVar.e = 0L;
            a(str, aVar);
        }
    }

    private void b() {
        if (this.b < this.d) {
            return;
        }
        if (ti2.f16972a) {
            sp0.e(new Object[0]);
        }
        long j = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f16617a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            String str = bVar.b;
            File file = ((a) this.c).f16618a;
            int length = str.length() / 2;
            if (new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete()) {
                this.b -= bVar.f16619a;
            } else {
                String str2 = bVar.b;
                int length2 = str2.length() / 2;
                sp0.a(str2, String.valueOf(str2.substring(0, length2).hashCode()) + String.valueOf(str2.substring(length2).hashCode()));
            }
            it.remove();
            i++;
            if (this.b < this.d * 0.9f) {
                break;
            }
        }
        if (ti2.f16972a) {
            sp0.e(Integer.valueOf(i), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    static long b(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            long j = read & 255;
            int read2 = inputStream.read();
            if (read2 != -1) {
                long j2 = j | ((read2 & 255) << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    long j3 = j2 | ((read3 & 255) << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        long j4 = j3 | ((read4 & 255) << 24);
                        int read5 = inputStream.read();
                        if (read5 != -1) {
                            long j5 = j4 | ((read5 & 255) << 32);
                            int read6 = inputStream.read();
                            if (read6 != -1) {
                                long j6 = j5 | ((read6 & 255) << 40);
                                int read7 = inputStream.read();
                                if (read7 != -1) {
                                    long j7 = j6 | ((read7 & 255) << 48);
                                    int read8 = inputStream.read();
                                    if (read8 != -1) {
                                        return ((read8 & 255) << 56) | j7;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final synchronized void b(String str) {
        File file = ((a) this.c).f16618a;
        int length = str.length() / 2;
        boolean delete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
        b bVar = (b) this.f16617a.remove(str);
        if (bVar != null) {
            this.b -= bVar.f16619a;
        }
        if (!delete) {
            int length2 = str.length() / 2;
            Object[] objArr = {str, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode())};
            boolean z = ti2.f16972a;
            sp0.a(objArr);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        long f16619a;
        final String b;
        final String c;
        final long d;
        final long e;
        final long f;
        final long g;
        final List<kf0> h;

        private b(String str, String str2, long j, long j2, long j3, long j4, List<kf0> list) {
            this.b = str;
            this.c = "".equals(str2) ? null : str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static List<kf0> a(tm.a aVar) {
            List<kf0> list = aVar.h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = aVar.g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new kf0(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        static b a(c cVar) throws IOException {
            if (q10.a(cVar) == 538247942) {
                String str = new String(q10.a(cVar, q10.b(cVar)), "UTF-8");
                String str2 = new String(q10.a(cVar, q10.b(cVar)), "UTF-8");
                long b = q10.b(cVar);
                long b2 = q10.b(cVar);
                long b3 = q10.b(cVar);
                long b4 = q10.b(cVar);
                int a2 = q10.a(cVar);
                if (a2 >= 0) {
                    List emptyList = a2 == 0 ? Collections.emptyList() : new ArrayList();
                    int i = 0;
                    while (i < a2) {
                        emptyList.add(new kf0(new String(q10.a(cVar, q10.b(cVar)), "UTF-8").intern(), new String(q10.a(cVar, q10.b(cVar)), "UTF-8").intern()));
                        i++;
                        str = str;
                        str2 = str2;
                        b = b;
                    }
                    return new b(str, str2, b, b2, b3, b4, emptyList);
                }
                throw new IOException(oe.a("readHeaderList size=", a2));
            }
            throw new IOException();
        }

        final tm.a a(byte[] bArr) {
            tm.a aVar = new tm.a();
            aVar.f16982a = bArr;
            aVar.b = this.c;
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.e = this.f;
            aVar.f = this.g;
            List<kf0> list = this.h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (kf0 kf0Var : list) {
                treeMap.put(kf0Var.a(), kf0Var.b());
            }
            aVar.g = treeMap;
            aVar.h = Collections.unmodifiableList(this.h);
            return aVar;
        }

        final boolean a(BufferedOutputStream bufferedOutputStream) {
            try {
                q10.a(bufferedOutputStream, 538247942);
                byte[] bytes = this.b.getBytes("UTF-8");
                q10.a(bufferedOutputStream, bytes.length);
                bufferedOutputStream.write(bytes, 0, bytes.length);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                byte[] bytes2 = str.getBytes("UTF-8");
                q10.a(bufferedOutputStream, bytes2.length);
                bufferedOutputStream.write(bytes2, 0, bytes2.length);
                q10.a(bufferedOutputStream, this.d);
                q10.a(bufferedOutputStream, this.e);
                q10.a(bufferedOutputStream, this.f);
                q10.a(bufferedOutputStream, this.g);
                List<kf0> list = this.h;
                if (list != null) {
                    q10.a(bufferedOutputStream, list.size());
                    for (kf0 kf0Var : list) {
                        byte[] bytes3 = kf0Var.a().getBytes("UTF-8");
                        q10.a(bufferedOutputStream, bytes3.length);
                        bufferedOutputStream.write(bytes3, 0, bytes3.length);
                        byte[] bytes4 = kf0Var.b().getBytes("UTF-8");
                        q10.a(bufferedOutputStream, bytes4.length);
                        bufferedOutputStream.write(bytes4, 0, bytes4.length);
                    }
                } else {
                    q10.a(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e) {
                Object[] objArr = {e.toString()};
                boolean z = ti2.f16972a;
                sp0.a(objArr);
                return false;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tm
    public final synchronized void a(String str, tm.a aVar) {
        File file;
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j = this.b;
        byte[] bArr = aVar.f16982a;
        long length = j + bArr.length;
        int i = this.d;
        if (length <= i || bArr.length <= i * 0.9f) {
            File file2 = ((a) this.c).f16618a;
            int length2 = str.length() / 2;
            File file3 = new File(file2, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                file = file3;
                try {
                    bVar = new b(str, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, b.a(aVar));
                } catch (IOException unused) {
                    if (!file.delete()) {
                        Object[] objArr = {file.getAbsolutePath()};
                        boolean z = ti2.f16972a;
                        sp0.a(objArr);
                    }
                    if (!((a) this.c).f16618a.exists()) {
                        boolean z2 = ti2.f16972a;
                        sp0.a(new Object[0]);
                        this.f16617a.clear();
                        this.b = 0L;
                        a();
                    }
                    return;
                }
            } catch (IOException unused2) {
                file = file3;
            }
            if (bVar.a(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f16982a);
                bufferedOutputStream.close();
                bVar.f16619a = file.length();
                if (!this.f16617a.containsKey(str)) {
                    this.b += bVar.f16619a;
                } else {
                    this.b = (bVar.f16619a - ((b) this.f16617a.get(str)).f16619a) + this.b;
                }
                this.f16617a.put(str, bVar);
                b();
                return;
            }
            bufferedOutputStream.close();
            Object[] objArr2 = {file.getAbsolutePath()};
            boolean z3 = ti2.f16972a;
            sp0.a(objArr2);
            throw new IOException();
        }
    }

    static int a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                int i = read | (read2 << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    int i2 = i | (read3 << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        return (read4 << 24) | i2;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    static byte[] a(c cVar, long j) throws IOException {
        long j2 = cVar.f16620a - cVar.b;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + j2);
    }

    static void a(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    static void a(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }
}
