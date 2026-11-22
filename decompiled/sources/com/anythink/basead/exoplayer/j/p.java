package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.exoplayer.j.s;
import com.anythink.basead.exoplayer.k.af;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2646a = 8000;
    public static final int b = 8000;
    private static final String d = "DefaultHttpDataSource";
    private static final int e = 20;
    private static final long f = 2048;
    private static final Pattern g = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> h = new AtomicReference<>();
    private final boolean i;
    private final int j;
    private final int k;
    private final String l;
    private final com.anythink.basead.exoplayer.k.u<String> m;
    private final s.f n;
    private final s.f o;
    private final aa<? super p> p;

    /* renamed from: q, reason: collision with root package name */
    private k f2647q;
    private HttpURLConnection r;
    private InputStream s;
    private boolean t;
    private long u;
    private long v;
    private long w;
    private long x;

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar) {
        this(str, uVar, null);
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar) {
        this(str, uVar, aaVar, (byte) 0);
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, byte b2) {
        this(str, uVar, aaVar, 8000, 8000, false, null);
    }

    public p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, int i, int i2, boolean z, s.f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.l = str;
            this.m = uVar;
            this.p = aaVar;
            this.o = new s.f();
            this.j = i;
            this.k = i2;
            this.i = z;
            this.n = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.r;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.r;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str, String str2) {
        com.anythink.basead.exoplayer.k.a.a(str);
        com.anythink.basead.exoplayer.k.a.a(str2);
        this.o.a(str, str2);
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str) {
        com.anythink.basead.exoplayer.k.a.a(str);
        this.o.a(str);
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void d() {
        this.o.a();
    }

    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        p pVar;
        HttpURLConnection a2;
        long j;
        this.f2647q = kVar;
        long j2 = 0;
        this.x = 0L;
        this.w = 0L;
        try {
            URL url = new URL(kVar.c.toString());
            byte[] bArr = kVar.d;
            long j3 = kVar.f;
            long j4 = kVar.g;
            boolean a3 = kVar.a(1);
            if (this.i) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        pVar = this;
                        a2 = pVar.a(url, bArr, j3, j4, a3, false);
                        int responseCode = a2.getResponseCode();
                        j = j2;
                        if (responseCode != 300) {
                            if (responseCode != 301) {
                                if (responseCode != 302) {
                                    if (responseCode != 303) {
                                        if (bArr != null) {
                                            break;
                                        }
                                        if (responseCode != 307 && responseCode != 308) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        String headerField = a2.getHeaderField("Location");
                        a2.disconnect();
                        if (headerField == null) {
                            throw new ProtocolException("Null location redirect");
                        }
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (!"https".equals(protocol) && !"http".equals(protocol)) {
                            throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                        }
                        bArr = null;
                        url = url2;
                        i = i2;
                        j2 = j;
                    } else {
                        throw new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i2)));
                    }
                }
            } else {
                try {
                    a2 = a(url, bArr, j3, j4, a3, true);
                    pVar = this;
                    j = 0;
                } catch (IOException e2) {
                    e = e2;
                    throw new s.c("Unable to connect to " + kVar.c.toString(), e, kVar);
                }
            }
            pVar.r = a2;
            try {
                int responseCode2 = a2.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map<String, List<String>> headerFields = pVar.r.getHeaderFields();
                    pVar.j();
                    s.e eVar = new s.e(responseCode2, headerFields, kVar);
                    if (responseCode2 == 416) {
                        eVar.initCause(new i());
                        throw eVar;
                    }
                    throw eVar;
                }
                String contentType = pVar.r.getContentType();
                com.anythink.basead.exoplayer.k.u<String> uVar = pVar.m;
                if (uVar != null && !uVar.a(contentType)) {
                    pVar.j();
                    throw new s.d(contentType, kVar);
                }
                pVar.u = (responseCode2 != 200 || kVar.f == j) ? j : kVar.f;
                if (kVar.a(1)) {
                    pVar.v = kVar.g;
                } else {
                    if (kVar.g != -1) {
                        pVar.v = kVar.g;
                    } else {
                        long a4 = a(pVar.r);
                        pVar.v = a4 != -1 ? a4 - pVar.u : -1L;
                    }
                }
                try {
                    pVar.s = pVar.r.getInputStream();
                    pVar.t = true;
                    aa<? super p> aaVar = pVar.p;
                    if (aaVar != null) {
                        aaVar.b();
                    }
                    return pVar.v;
                } catch (IOException e3) {
                    pVar.j();
                    throw new s.c(e3, kVar, 1);
                }
            } catch (IOException e4) {
                pVar.j();
                throw new s.c("Unable to connect to " + kVar.c.toString(), e4, kVar);
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0034, code lost:
    
        if (r3 > 2048) goto L21;
     */
    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.s     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L77
            java.net.HttpURLConnection r2 = r9.r     // Catch: java.lang.Throwable -> L8a
            long r3 = r9.v     // Catch: java.lang.Throwable -> L8a
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.x     // Catch: java.lang.Throwable -> L8a
            long r3 = r3 - r7
        L14:
            int r7 = com.anythink.basead.exoplayer.k.af.f2668a     // Catch: java.lang.Throwable -> L8a
            r8 = 19
            if (r7 == r8) goto L20
            int r7 = com.anythink.basead.exoplayer.k.af.f2668a     // Catch: java.lang.Throwable -> L8a
            r8 = 20
            if (r7 != r8) goto L67
        L20:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L30
            int r3 = r2.read()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            r4 = -1
            if (r3 != r4) goto L36
            goto L67
        L30:
            r5 = 2048(0x800, double:1.012E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L67
        L36:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            if (r4 != 0) goto L4e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            if (r3 == 0) goto L67
        L4e:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8a
        L67:
            java.io.InputStream r2 = r9.s     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L8a
            r2.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L8a
            goto L77
        L6d:
            r2 = move-exception
            com.anythink.basead.exoplayer.j.s$c r3 = new com.anythink.basead.exoplayer.j.s$c     // Catch: java.lang.Throwable -> L8a
            com.anythink.basead.exoplayer.j.k r4 = r9.f2647q     // Catch: java.lang.Throwable -> L8a
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L8a
            throw r3     // Catch: java.lang.Throwable -> L8a
        L77:
            r9.s = r0
            r9.j()
            boolean r0 = r9.t
            if (r0 == 0) goto L89
            r9.t = r1
            com.anythink.basead.exoplayer.j.aa<? super com.anythink.basead.exoplayer.j.p> r0 = r9.p
            if (r0 == 0) goto L89
            r0.c()
        L89:
            return
        L8a:
            r2 = move-exception
            r9.s = r0
            r9.j()
            boolean r0 = r9.t
            if (r0 == 0) goto L9d
            r9.t = r1
            com.anythink.basead.exoplayer.j.aa<? super com.anythink.basead.exoplayer.j.p> r0 = r9.p
            if (r0 == 0) goto L9d
            r0.c()
        L9d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.j.p.b():void");
    }

    private HttpURLConnection e() {
        return this.r;
    }

    private long f() {
        return this.w;
    }

    private long g() {
        return this.x;
    }

    private long h() {
        long j = this.v;
        return j == -1 ? j : j - this.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection b(com.anythink.basead.exoplayer.j.k r13) {
        /*
            r12 = this;
            java.net.URL r1 = new java.net.URL
            android.net.Uri r0 = r13.c
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            byte[] r2 = r13.d
            long r3 = r13.f
            long r5 = r13.g
            r0 = 1
            boolean r7 = r13.a(r0)
            boolean r13 = r12.i
            if (r13 != 0) goto L21
            r8 = 1
            r0 = r12
            java.net.HttpURLConnection r13 = r0.a(r1, r2, r3, r5, r7, r8)
            return r13
        L21:
            r13 = 0
        L22:
            int r0 = r13 + 1
            r8 = 20
            if (r13 > r8) goto L97
            r11 = 0
            r8 = r5
            r10 = r7
            r5 = r2
            r6 = r3
            r3 = r12
            r4 = r1
            java.net.HttpURLConnection r13 = r3.a(r4, r5, r6, r8, r10, r11)
            r3 = r6
            r5 = r8
            r7 = r10
            int r8 = r13.getResponseCode()
            r9 = 300(0x12c, float:4.2E-43)
            if (r8 == r9) goto L56
            r9 = 301(0x12d, float:4.22E-43)
            if (r8 == r9) goto L56
            r9 = 302(0x12e, float:4.23E-43)
            if (r8 == r9) goto L56
            r9 = 303(0x12f, float:4.25E-43)
            if (r8 == r9) goto L56
            if (r2 != 0) goto L55
            r2 = 307(0x133, float:4.3E-43)
            if (r8 == r2) goto L56
            r2 = 308(0x134, float:4.32E-43)
            if (r8 != r2) goto L55
            goto L56
        L55:
            return r13
        L56:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r13.getHeaderField(r2)
            r13.disconnect()
            if (r2 == 0) goto L8f
            java.net.URL r13 = new java.net.URL
            r13.<init>(r1, r2)
            java.lang.String r1 = r13.getProtocol()
            java.lang.String r2 = "https"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L8b
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L7b
            goto L8b
        L7b:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r0 = "Unsupported protocol redirect: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            r13.<init>(r0)
            throw r13
        L8b:
            r2 = 0
            r1 = r13
            r13 = r0
            goto L22
        L8f:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r0 = "Null location redirect"
            r13.<init>(r0)
            throw r13
        L97:
            java.net.NoRouteToHostException r13 = new java.net.NoRouteToHostException
            java.lang.String r1 = "Too many redirects: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.j.p.b(com.anythink.basead.exoplayer.j.k):java.net.HttpURLConnection");
    }

    private HttpURLConnection a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.j);
        httpURLConnection.setReadTimeout(this.k);
        s.f fVar = this.n;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.b().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.o.b().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.l);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private static URL a(URL url, String str) {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L2b
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L2d
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L2b:
            r4 = -1
        L2d:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto La3
            java.util.regex.Pattern r1 = com.anythink.basead.exoplayer.j.p.g
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto La3
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L8d
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L8d
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L8d
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L8d
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L63
            r4 = r6
            goto La3
        L63:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto La3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r8 = "Inconsistent headers ["
            r1.<init>(r8)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r1 = "] ["
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L8d
            android.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> L8d
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L8d
            r4 = r0
            goto La3
        L8d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r3, r10)
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.j.p.a(java.net.HttpURLConnection):long");
    }

    private void i() {
        if (this.w == this.u) {
            return;
        }
        byte[] andSet = h.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.w;
            long j2 = this.u;
            if (j != j2) {
                int read = this.s.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new EOFException();
                }
                this.w += read;
                aa<? super p> aaVar = this.p;
                if (aaVar != null) {
                    aaVar.a(read);
                }
            } else {
                h.set(andSet);
                return;
            }
        }
    }

    private int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.v;
        if (j != -1) {
            long j2 = j - this.x;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = this.s.read(bArr, i, i2);
        if (read == -1) {
            if (this.v == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.x += read;
        aa<? super p> aaVar = this.p;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    private static void a(HttpURLConnection httpURLConnection, long j) {
        if (af.f2668a == 19 || af.f2668a == 20) {
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
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void j() {
        HttpURLConnection httpURLConnection = this.r;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e(d, "Unexpected error while disconnecting", e2);
            }
            this.r = null;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.w != this.u) {
                byte[] andSet = h.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.w;
                    long j2 = this.u;
                    if (j != j2) {
                        int read = this.s.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read == -1) {
                            throw new EOFException();
                        }
                        this.w += read;
                        aa<? super p> aaVar = this.p;
                        if (aaVar != null) {
                            aaVar.a(read);
                        }
                    } else {
                        h.set(andSet);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.v;
            if (j3 != -1) {
                long j4 = j3 - this.x;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int read2 = this.s.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.v == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.x += read2;
            aa<? super p> aaVar2 = this.p;
            if (aaVar2 != null) {
                aaVar2.a(read2);
            }
            return read2;
        } catch (IOException e2) {
            throw new s.c(e2, this.f2647q, 2);
        }
    }
}
