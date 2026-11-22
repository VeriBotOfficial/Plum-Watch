package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public abstract class am {

    /* renamed from: a, reason: collision with root package name */
    public static String f12738a;
    private Context c;
    private int d;
    private int e;
    private byte[] f;
    private HttpURLConnection b = null;
    private int g = -1;
    private byte[] h = null;
    private int i = 10000;
    private int j = 0;
    private int k = 2;
    private boolean l = true;
    private Runnable m = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.j >= am.this.k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.c = context;
    }

    static /* synthetic */ int c(am amVar) {
        int i = amVar.j;
        amVar.j = i + 1;
        return i;
    }

    abstract String a();

    abstract void a(int i, byte[] bArr);

    public static synchronized void a(String str) {
        synchronized (am.class) {
            if (!TextUtils.isEmpty(str) && !str.equals(f12738a)) {
                f12738a = str;
            }
        }
    }

    private void b() {
        Object obj;
        if (this.b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f12738a)) {
                jSONObject.put("ipv6", f12738a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.f())) {
                jSONObject.put("gaid", com.pgl.ssdk.ces.b.f());
            }
            jSONObject.put("region", an.a());
            Pair<Integer, String> a2 = aq.a(jSONObject.toString());
            if (a2 == null || (obj = a2.first) == null || a2.second == null) {
                return;
            }
            this.b.addRequestProperty("cypher", String.valueOf(obj));
            this.b.addRequestProperty("transfer-param", (String) a2.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        a(r5.g, r5.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        r0 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r0.disconnect();
        r5.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (r0 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            r5 = this;
            java.lang.String r0 = "https://"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r5.c     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = com.pgl.ssdk.an.a(r3)     // Catch: java.lang.Throwable -> Ld0
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto L1f
            android.content.Context r0 = r5.c     // Catch: java.lang.Throwable -> Ld0
            com.pgl.ssdk.an.b(r0)     // Catch: java.lang.Throwable -> Ld0
            java.net.HttpURLConnection r0 = r5.b
            if (r0 == 0) goto L1e
            r0.disconnect()
            r5.b = r2
        L1e:
            return r1
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = r5.a()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
            boolean r4 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Ld0
            if (r4 != 0) goto L4a
            java.lang.String r4 = "http://"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> Ld0
            if (r4 != 0) goto L4a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> Ld0
        L4a:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Ld0
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Ld0
            boolean r3 = r5.l     // Catch: java.lang.Throwable -> Ld0
            if (r3 == 0) goto L5e
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY     // Catch: java.lang.Throwable -> Ld0
            java.net.URLConnection r0 = r0.openConnection(r3)     // Catch: java.lang.Throwable -> Ld0
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Ld0
            r5.b = r0     // Catch: java.lang.Throwable -> Ld0
            goto L66
        L5e:
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Ld0
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Ld0
            r5.b = r0     // Catch: java.lang.Throwable -> Ld0
        L66:
            java.net.HttpURLConnection r0 = r5.b     // Catch: java.lang.Throwable -> Ld0
            int r3 = r5.i     // Catch: java.lang.Throwable -> Ld0
            r0.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> Ld0
            java.net.HttpURLConnection r0 = r5.b     // Catch: java.lang.Throwable -> Ld0
            int r3 = r5.i     // Catch: java.lang.Throwable -> Ld0
            r0.setReadTimeout(r3)     // Catch: java.lang.Throwable -> Ld0
            int r0 = r5.d     // Catch: java.lang.Throwable -> Ld0
            r5.a(r0)     // Catch: java.lang.Throwable -> Ld0
            int r0 = r5.e     // Catch: java.lang.Throwable -> Ld0
            r5.b(r0)     // Catch: java.lang.Throwable -> Ld0
            byte[] r0 = r5.f     // Catch: java.lang.Throwable -> Ld0
            r3 = 1
            if (r0 == 0) goto L9c
            int r0 = r0.length     // Catch: java.lang.Throwable -> Ld0
            if (r0 <= 0) goto L9c
            java.net.HttpURLConnection r0 = r5.b     // Catch: java.lang.Throwable -> Ld0
            r0.setDoOutput(r3)     // Catch: java.lang.Throwable -> Ld0
            java.net.HttpURLConnection r0 = r5.b     // Catch: java.lang.Throwable -> Ld0
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.lang.Throwable -> Ld0
            byte[] r4 = r5.f     // Catch: java.lang.Throwable -> Ld0
            r0.write(r4)     // Catch: java.lang.Throwable -> Ld0
            r0.flush()     // Catch: java.lang.Throwable -> Ld0
            r0.close()     // Catch: java.lang.Throwable -> Ld0
        L9c:
            java.net.HttpURLConnection r0 = r5.b     // Catch: java.lang.Throwable -> Ld0
            r0.connect()     // Catch: java.lang.Throwable -> Ld0
            java.net.HttpURLConnection r0 = r5.b     // Catch: java.lang.Throwable -> Lb8
            int r0 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Lb8
            r5.g = r0     // Catch: java.lang.Throwable -> Lb8
            java.net.HttpURLConnection r0 = r5.b     // Catch: java.lang.Throwable -> Lb8
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> Lb8
            byte[] r4 = r5.a(r0)     // Catch: java.lang.Throwable -> Lb9
            r5.h = r4     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lbf
            goto Lbc
        Lb8:
            r0 = r2
        Lb9:
            if (r0 != 0) goto Lbc
            goto Lbf
        Lbc:
            r0.close()     // Catch: java.lang.Throwable -> Ld0
        Lbf:
            int r0 = r5.g     // Catch: java.lang.Throwable -> Ld0
            byte[] r4 = r5.h     // Catch: java.lang.Throwable -> Ld0
            r5.a(r0, r4)     // Catch: java.lang.Throwable -> Ld0
            java.net.HttpURLConnection r0 = r5.b
            if (r0 == 0) goto Lcf
            r0.disconnect()
            r5.b = r2
        Lcf:
            return r3
        Ld0:
            java.net.HttpURLConnection r0 = r5.b
            if (r0 == 0) goto Ld9
            r0.disconnect()
            r5.b = r2
        Ld9:
            android.content.Context r0 = r5.c
            com.pgl.ssdk.an.b(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.am.c():boolean");
    }

    private void a(int i) throws ProtocolException {
        this.b.setRequestMethod(i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "GET" : "TRACE" : "HEAD" : HttpManager.HTTP_DELETE : HttpManager.HTTP_PUT : "POST");
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public void a(int i, int i2, byte[] bArr) {
        b(i, i2, bArr);
        ar.a(this.m);
    }

    private void b(int i) {
        String str = i != 1 ? i != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (!str.isEmpty()) {
            this.b.addRequestProperty("Content-Type", str);
        }
        String b = an.b();
        if (b != null) {
            this.b.addRequestProperty("x-pangle-target-idc", b);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
            } else {
                this.b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
            }
        } catch (Throwable unused) {
        }
    }

    private void b(int i, int i2, byte[] bArr) {
        this.d = i;
        this.e = i2;
        this.f = bArr;
    }
}
