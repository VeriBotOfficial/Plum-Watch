package com.yandex.mobile.ads.impl;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class ji0 extends nk {

    /* renamed from: a, reason: collision with root package name */
    private final b f15912a;
    private final SSLSocketFactory b;

    public interface b extends t82 {
    }

    private static void a(HttpURLConnection httpURLConnection, up1 up1Var, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    static ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new kf0((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public ji0(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f15912a = bVar;
        this.b = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.nk
    public final ci0 a(up1<?> up1Var, Map<String, String> map) throws IOException, ai {
        SSLSocketFactory sSLSocketFactory;
        String l = up1Var.l();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(up1Var.e());
        b bVar = this.f15912a;
        if (bVar != null) {
            String a2 = bVar.a(l);
            if (a2 == null) {
                throw new IOException("URL blocked by rewriter: " + l);
            }
            l = a2;
        }
        URL url = new URL(l);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int j = up1Var.j();
        httpURLConnection.setConnectTimeout(j);
        httpURLConnection.setReadTimeout(j);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            a(up1Var, httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (up1Var.f() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
                    try {
                        return new ci0(responseCode, a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                ci0 ci0Var = new ci0(responseCode, a(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return ci0Var;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f15913a;

        a(HttpURLConnection httpURLConnection) {
            super(ji0.a(httpURLConnection));
            this.f15913a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f15913a.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    static void a(up1 up1Var, HttpURLConnection httpURLConnection) throws IOException, ai {
        switch (up1Var.f()) {
            case -1:
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] b2 = up1Var.b();
                if (b2 != null) {
                    a(httpURLConnection, up1Var, b2);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod(HttpManager.HTTP_PUT);
                byte[] b3 = up1Var.b();
                if (b3 != null) {
                    a(httpURLConnection, up1Var, b3);
                    return;
                }
                return;
            case 3:
                httpURLConnection.setRequestMethod(HttpManager.HTTP_DELETE);
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] b4 = up1Var.b();
                if (b4 != null) {
                    a(httpURLConnection, up1Var, b4);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
