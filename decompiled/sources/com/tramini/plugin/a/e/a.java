package com.tramini.plugin.a.e;

import android.content.Context;
import com.tramini.plugin.a.b.a;
import com.tramini.plugin.a.h.f;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13718a = "platform";
    public static final String b = "os_vn";
    public static final String c = "os_vc";
    public static final String d = "package_name";
    public static final String e = "app_vn";
    public static final String f = "app_vc";
    public static final String g = "sdk_ver";
    public static final String h = "android_id";
    public static final String i = "is_proxy";
    public static final String j = "ds_pl";
    public static final String k = "area_type";
    public static final String l = "cached";
    public static final int m = 1;
    public static final int n = 2;
    private static final String p = "a";
    protected b o;

    protected abstract int a();

    protected abstract Object a(String str);

    protected abstract String b();

    protected abstract Map<String, String> c();

    protected abstract byte[] d();

    public abstract boolean g();

    public final void a(int i2, b bVar) {
        this.o = bVar;
        com.tramini.plugin.a.h.b.a.a().a((com.tramini.plugin.a.h.b.b) new AnonymousClass1(i2));
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        Context b2 = com.tramini.plugin.a.b.c.a().b();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", com.tramini.plugin.a.h.e.b());
            jSONObject.put("os_vc", com.tramini.plugin.a.h.e.a());
            jSONObject.put("package_name", com.tramini.plugin.a.h.e.c(b2));
            jSONObject.put("app_vn", com.tramini.plugin.a.h.e.b(b2));
            jSONObject.put("app_vc", com.tramini.plugin.a.h.e.a(b2));
            jSONObject.put("sdk_ver", com.tramini.plugin.a.b.a.f13695a);
            jSONObject.put("area_type", a.b.f13697a);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    protected String f() {
        HashMap hashMap = new HashMap();
        String b2 = com.tramini.plugin.a.h.c.b(e().toString());
        hashMap.put("d_version", "1.0");
        hashMap.put(com.anythink.expressad.foundation.g.a.R, b2);
        hashMap.put("d_sign", f.a("d_version=1.0&d1=".concat(String.valueOf(b2))));
        hashMap.put("pl_c", "5");
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : keySet) {
                jSONObject.put(str, String.valueOf(hashMap.get(str)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    /* renamed from: com.tramini.plugin.a.e.a$1, reason: invalid class name */
    final class AnonymousClass1 extends com.tramini.plugin.a.h.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13719a;

        AnonymousClass1(int i) {
            this.f13719a = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        
            if (r0 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
        
            r0.disconnect();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
        
            if (r0 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
        
            if (r1 == 0) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
        
            if (r1 == 0) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0102, code lost:
        
            if (r1 == 0) goto L93;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v42, types: [com.tramini.plugin.a.e.a] */
        /* JADX WARN: Type inference failed for: r1v43 */
        /* JADX WARN: Type inference failed for: r1v44 */
        /* JADX WARN: Type inference failed for: r1v45 */
        /* JADX WARN: Type inference failed for: r1v46 */
        /* JADX WARN: Type inference failed for: r1v47 */
        /* JADX WARN: Type inference failed for: r1v48 */
        /* JADX WARN: Type inference failed for: r1v49 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v50 */
        /* JADX WARN: Type inference failed for: r1v51 */
        /* JADX WARN: Type inference failed for: r1v52 */
        /* JADX WARN: Type inference failed for: r1v53 */
        /* JADX WARN: Type inference failed for: r1v54 */
        /* JADX WARN: Type inference failed for: r1v55 */
        /* JADX WARN: Type inference failed for: r1v56 */
        /* JADX WARN: Type inference failed for: r1v57 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // com.tramini.plugin.a.h.b.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.a.e.a.AnonymousClass1.a():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v37 */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r0v40, types: [com.tramini.plugin.a.e.a] */
        /* JADX WARN: Type inference failed for: r0v41 */
        /* JADX WARN: Type inference failed for: r0v42 */
        /* JADX WARN: Type inference failed for: r0v43 */
        /* JADX WARN: Type inference failed for: r0v44 */
        /* JADX WARN: Type inference failed for: r0v45 */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r0v48 */
        /* JADX WARN: Type inference failed for: r0v49 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r0v50 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.net.HttpURLConnection] */
        private void a(String str) {
            Throwable th;
            HttpURLConnection httpURLConnection;
            ?? r0 = 0;
            r0 = 0;
            r0 = 0;
            r0 = 0;
            r0 = 0;
            r0 = 0;
            r0 = 0;
            r0 = 0;
            r0 = 0;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (Throwable th2) {
                    HttpURLConnection httpURLConnection2 = r0;
                    th = th2;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (OutOfMemoryError unused) {
            } catch (StackOverflowError unused2) {
            } catch (Error unused3) {
            } catch (ConnectException unused4) {
            } catch (SocketTimeoutException unused5) {
            } catch (UnknownHostException unused6) {
            } catch (ConnectTimeoutException unused7) {
            } catch (Exception unused8) {
            }
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                Map<String, String> c = a.this.c();
                if (c.size() > 0) {
                    for (String str2 : c.keySet()) {
                        httpURLConnection.addRequestProperty(str2, c.get(str2));
                    }
                }
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.connect();
                byte[] d = a.this.d();
                if (d != null) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(d);
                    outputStream.flush();
                    outputStream.close();
                }
                if (httpURLConnection.getResponseCode() != 200) {
                    r0 = a.this;
                    r0.i();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } else {
                    InputStream a2 = a.a(httpURLConnection);
                    InputStreamReader inputStreamReader = new InputStreamReader(a2);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (a2 != null) {
                        a2.close();
                    }
                    if (a.this.g()) {
                        String sb2 = sb.toString();
                        a aVar = a.this;
                        httpURLConnection.getHeaderFields();
                        Object a3 = aVar.a(sb2);
                        a.this.a(a3);
                        r0 = a3;
                    } else {
                        a aVar2 = a.this;
                        httpURLConnection.getHeaderFields();
                        Object a4 = aVar2.a("");
                        a.this.a(a4);
                        r0 = a4;
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            } catch (OutOfMemoryError unused9) {
                r0 = httpURLConnection;
                System.gc();
                a.this.i();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (StackOverflowError unused10) {
                r0 = httpURLConnection;
                System.gc();
                a.this.i();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (Error unused11) {
                r0 = httpURLConnection;
                System.gc();
                a.this.i();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (ConnectException unused12) {
                r0 = httpURLConnection;
                a.this.i();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (SocketTimeoutException unused13) {
                r0 = httpURLConnection;
                a.this.i();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (UnknownHostException unused14) {
                r0 = httpURLConnection;
                a.this.i();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (ConnectTimeoutException unused15) {
                r0 = httpURLConnection;
                a.this.h();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (Exception unused16) {
                r0 = httpURLConnection;
                a.this.i();
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    private void a(int i2) {
        com.tramini.plugin.a.h.b.a.a().a((com.tramini.plugin.a.h.b.b) new AnonymousClass1(i2));
    }

    protected final void h() {
        b bVar = this.o;
        if (bVar != null) {
            bVar.b();
        }
    }

    protected final void i() {
        b bVar = this.o;
        if (bVar != null) {
            bVar.b();
        }
    }

    protected final void a(Object obj) {
        b bVar = this.o;
        if (bVar != null) {
            bVar.a(obj);
        }
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!"gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int read = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (read == -1 || (((bArr[1] & 255) << 8) | (bArr[0] & 255)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }

    protected static byte[] b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }
}
