package com.anythink.expressad.foundation.g.f;

import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* loaded from: classes12.dex */
public abstract class j<T> implements Comparable<j<T>> {
    private static final String c = "j";

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f4888a;
    protected e<T> b;
    private final int d;
    private final String e;
    private final boolean f;
    private Integer g;
    private k h;
    private boolean i;
    private m j;
    private Object k;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f4889a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;
        public static final int h = 7;
    }

    protected static com.anythink.expressad.foundation.g.f.a.a a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return aVar;
    }

    private static void q() {
    }

    private static void r() {
    }

    protected abstract l<T> a(com.anythink.expressad.foundation.g.f.f.c cVar);

    public void a(OutputStream outputStream) {
    }

    public byte[] h() {
        return null;
    }

    public int j() {
        return 2;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        j jVar = (j) obj;
        int j = j();
        int j2 = jVar.j();
        return j == j2 ? this.g.intValue() - jVar.g.intValue() : j2 - j;
    }

    public j(int i, String str, e<T> eVar) {
        this.f4888a = new ConcurrentHashMap<>();
        this.i = false;
        this.e = str;
        this.d = i;
        this.b = eVar;
        this.f = false;
        this.j = new com.anythink.expressad.foundation.g.f.b();
    }

    public j(int i, String str, e<T> eVar, boolean z) {
        this.f4888a = new ConcurrentHashMap<>();
        this.i = false;
        this.e = str;
        this.d = i;
        this.b = eVar;
        this.f = z;
        this.j = new com.anythink.expressad.foundation.g.f.b();
    }

    public j(String str) {
        this.f4888a = new ConcurrentHashMap<>();
        this.b = null;
        this.i = false;
        this.e = str;
        this.d = 0;
        this.f = false;
        this.j = new com.anythink.expressad.foundation.g.f.b();
    }

    public final int a() {
        return this.d;
    }

    public final void a(e<T> eVar) {
        this.b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j<?> a(Object obj) {
        this.k = obj;
        return this;
    }

    public final Object b() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(m mVar) {
        this.j = mVar;
        return this;
    }

    public final void c() {
        k kVar = this.h;
        if (kVar != null) {
            kVar.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(k kVar) {
        this.h = kVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    private int p() {
        Integer num = this.g;
        if (num == null) {
            throw new IllegalStateException("getSequence called before setSequence");
        }
        return num.intValue();
    }

    public final String d() {
        return this.e;
    }

    public final void e() {
        this.i = true;
    }

    public final boolean f() {
        return this.i;
    }

    public final Map<String, String> g() {
        return this.f4888a;
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    private void a(String str) {
        this.f4888a.remove(str);
    }

    public void i() {
        a("Charset", "UTF-8");
        if (this.f) {
            a(HttpHeaders.CONNECTION, "keep-alive");
        } else {
            a(HttpHeaders.CONNECTION, "close");
        }
    }

    public byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, c cVar) {
        if (bVar.c() != null) {
            return a(bVar);
        }
        return new byte[0];
    }

    private static byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream c2 = bVar.c();
            try {
                if (com.anythink.expressad.foundation.g.f.g.d.b(bVar.b()) && !(c2 instanceof GZIPInputStream)) {
                    c2 = new GZIPInputStream(c2);
                }
                if (c2 == null) {
                    throw new com.anythink.expressad.foundation.g.f.a.a(7, null);
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = c2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (c2 != null) {
                        try {
                            c2.close();
                        } catch (IOException e) {
                            e.getMessage();
                            return byteArray;
                        }
                    }
                    byteArrayOutputStream2.close();
                    return byteArray;
                } catch (Throwable th) {
                    inputStream = c2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e2) {
                            e2.getMessage();
                            throw th;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = c2;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f4890a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;

        private b() {
        }
    }

    public final int k() {
        return this.j.b();
    }

    public final m l() {
        return this.j;
    }

    public final void a(l<T> lVar) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a(lVar);
        }
    }

    public final void b(com.anythink.expressad.foundation.g.f.a.a aVar) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }

    public final void m() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.c();
        }
    }

    public final void n() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void o() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public final void a(long j, long j2) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a(j, j2);
        }
    }

    private int a(j<T> jVar) {
        int j = j();
        int j2 = jVar.j();
        return j == j2 ? this.g.intValue() - jVar.g.intValue() : j2 - j;
    }

    public String toString() {
        return (this.i ? "[X] " : "[ ] ") + this.e + " " + j() + " " + this.g;
    }

    public final void a(String str, String str2) {
        this.f4888a.remove(str);
        this.f4888a.put(str, str2);
    }
}
