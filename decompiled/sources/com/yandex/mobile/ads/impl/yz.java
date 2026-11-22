package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.net.Uri;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import com.xiaomi.mipush.sdk.Constants;
import com.yandex.mobile.ads.impl.tv;
import com.yandex.mobile.ads.impl.yz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes5.dex */
public class yz extends jk {
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final uh0 i;
    private final uh0 j;
    private final boolean k;
    private wj1<String> l;
    private HttpURLConnection m;
    private InputStream n;
    private boolean o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private long f17471q;
    private long r;

    public static final class a implements tv.a {
        private String b;

        /* renamed from: a, reason: collision with root package name */
        private final uh0 f17472a = new uh0();
        private int c = 8000;
        private int d = 8000;

        @Override // com.yandex.mobile.ads.impl.tv.a
        public final tv a() {
            return new yz(this.b, this.c, this.d, this.f17472a);
        }

        public final a b() {
            this.b = null;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends mc0<String, List<String>> {
        private final Map<String, List<String>> b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(String str) {
            return str != null;
        }

        @Override // com.yandex.mobile.ads.impl.nc0
        protected final Map a() {
            return this.b;
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            Iterator it = (Iterator) vj1.a(entrySet().iterator());
            if (obj == null) {
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.mc0, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public b(Map<String, List<String>> map) {
            this.b = map;
        }

        @Override // com.yandex.mobile.ads.impl.mc0
        protected final Map<String, List<String>> b() {
            return this.b;
        }

        @Override // com.yandex.mobile.ads.impl.mc0, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.yandex.mobile.ads.impl.mc0, java.util.Map
        public final Set<String> keySet() {
            return wx1.a(super.keySet(), new wj1() { // from class: com.yandex.mobile.ads.impl.yz$b$$ExternalSyntheticLambda0
                @Override // com.yandex.mobile.ads.impl.wj1
                public final boolean apply(Object obj) {
                    boolean a2;
                    a2 = yz.b.a((String) obj);
                    return a2;
                }
            });
        }

        @Override // com.yandex.mobile.ads.impl.mc0, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return wx1.a(super.entrySet(), new wj1() { // from class: com.yandex.mobile.ads.impl.yz$b$$ExternalSyntheticLambda1
                @Override // com.yandex.mobile.ads.impl.wj1
                public final boolean apply(Object obj) {
                    boolean a2;
                    a2 = yz.b.a((Map.Entry) obj);
                    return a2;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.yandex.mobile.ads.impl.mc0, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.yandex.mobile.ads.impl.mc0, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && a(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return c();
        }
    }

    public yz(String str, int i, int i2, uh0 uh0Var) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = false;
        this.i = uh0Var;
        this.l = null;
        this.j = new uh0();
        this.k = false;
    }

    private URL a(URL url, String str) throws rh0 {
        if (str == null) {
            throw new rh0("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new rh0("Unsupported protocol redirect: " + protocol, 2001);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new rh0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + Separators.RPAREN, 2001);
        } catch (MalformedURLException e) {
            throw new rh0(e, 2001, 1);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws rh0 {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f17471q;
            if (j != -1) {
                long j2 = j - this.r;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.n;
            int i3 = f92.f15466a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.r += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = f92.f15466a;
            throw rh0.a(e, 2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return lk0.g();
        }
        return new b(httpURLConnection.getHeaderFields());
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void close() throws rh0 {
        try {
            InputStream inputStream = this.n;
            if (inputStream != null) {
                long j = this.f17471q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.r;
                }
                a(this.m, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = f92.f15466a;
                    throw new rh0(e, 2000, 3);
                }
            }
        } finally {
            this.n = null;
            f();
            if (this.o) {
                this.o = false;
                e();
            }
        }
    }

    private HttpURLConnection d(xv xvVar) throws IOException {
        HttpURLConnection a2;
        URL url = new URL(xvVar.f17370a.toString());
        int i = xvVar.c;
        byte[] bArr = xvVar.d;
        long j = xvVar.f;
        long j2 = xvVar.g;
        int i2 = 1;
        int i3 = 0;
        boolean z = (xvVar.i & 1) == 1;
        if (!this.e && !this.k) {
            return a(url, i, bArr, j, j2, z, true, xvVar.e);
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                a2 = a(url, i, bArr, j, j2, z, false, xvVar.e);
                int responseCode = a2.getResponseCode();
                String headerField = a2.getHeaderField("Location");
                if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a2.disconnect();
                    url = a(url, headerField);
                } else {
                    if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    a2.disconnect();
                    if (!this.k || responseCode != 302) {
                        bArr = null;
                        i = 1;
                    }
                    url = a(url, headerField);
                }
                i3 = i4;
                i2 = 1;
            } else {
                throw new rh0(new NoRouteToHostException(oe.a("Too many redirects: ", i4)), 2001, 1);
            }
        }
        return a2;
    }

    private HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String sb;
        HttpURLConnection a2 = a(url);
        a2.setConnectTimeout(this.f);
        a2.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        uh0 uh0Var = this.i;
        if (uh0Var != null) {
            hashMap.putAll(uh0Var.a());
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i2 = hi0.c;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j);
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (j2 != -1) {
                sb2.append((j + j2) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            a2.setRequestProperty("Range", sb);
        }
        String str = this.h;
        if (str != null) {
            a2.setRequestProperty("User-Agent", str);
        }
        a2.setRequestProperty("Accept-Encoding", z ? "gzip" : InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        a2.setInstanceFollowRedirects(z2);
        a2.setDoOutput(bArr != null);
        a2.setRequestMethod(xv.a(i));
        if (bArr != null) {
            a2.setFixedLengthStreamingMode(bArr.length);
            a2.connect();
            OutputStream outputStream = a2.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return a2;
        }
        a2.connect();
        return a2;
    }

    private void f() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                et0.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.m = null;
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = f92.f15466a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final long a(xv xvVar) throws rh0 {
        long j = 0;
        this.r = 0L;
        this.f17471q = 0L;
        b(xvVar);
        try {
            HttpURLConnection d = d(xvVar);
            this.m = d;
            this.p = d.getResponseCode();
            d.getResponseMessage();
            int i = this.p;
            if (i >= 200 && i <= 299) {
                String contentType = d.getContentType();
                wj1<String> wj1Var = this.l;
                if (wj1Var != null && !wj1Var.apply(contentType)) {
                    f();
                    throw new sh0(contentType);
                }
                if (this.p == 200) {
                    long j2 = xvVar.f;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(d.getHeaderField("Content-Encoding"));
                if (!equalsIgnoreCase) {
                    long j3 = xvVar.g;
                    if (j3 != -1) {
                        this.f17471q = j3;
                    } else {
                        long a2 = hi0.a(d.getHeaderField("Content-Length"), d.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        this.f17471q = a2 != -1 ? a2 - j : -1L;
                    }
                } else {
                    this.f17471q = xvVar.g;
                }
                try {
                    this.n = d.getInputStream();
                    if (equalsIgnoreCase) {
                        this.n = new GZIPInputStream(this.n);
                    }
                    this.o = true;
                    c(xvVar);
                    try {
                        a(j);
                        return this.f17471q;
                    } catch (IOException e) {
                        f();
                        if (e instanceof rh0) {
                            throw ((rh0) e);
                        }
                        throw new rh0(e, 2000, 1);
                    }
                } catch (IOException e2) {
                    f();
                    throw new rh0(e2, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = d.getHeaderFields();
            if (this.p == 416) {
                if (xvVar.f == hi0.a(d.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                    this.o = true;
                    c(xvVar);
                    long j4 = xvVar.g;
                    if (j4 != -1) {
                        return j4;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = d.getErrorStream();
            try {
                if (errorStream != null) {
                    int i2 = f92.f15466a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = errorStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i3 = f92.f15466a;
                }
            } catch (IOException unused) {
                int i4 = f92.f15466a;
            }
            f();
            throw new th0(this.p, this.p == 416 ? new uv(2008) : null, headerFields);
        } catch (IOException e3) {
            f();
            throw rh0.a(e3, 1);
        }
    }

    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private void a(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.n;
            int i = f92.f15466a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new rh0(new InterruptedIOException(), 2000, 1);
            }
            if (read != -1) {
                j -= read;
                c(read);
            } else {
                throw new rh0(2008);
            }
        }
    }
}
