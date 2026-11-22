package com.anythink.expressad.foundation.g.f.e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.c.c;
import com.anythink.expressad.foundation.g.f.d.f;
import com.anythink.expressad.foundation.g.f.j;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes12.dex */
public final class b implements com.anythink.expressad.foundation.g.f.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4873a = 100;
    private com.anythink.expressad.foundation.g.f.c.a b;
    private SSLSocketFactory c;

    private static boolean a(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    public b(SSLSocketFactory sSLSocketFactory, com.anythink.expressad.foundation.g.f.c.a aVar) {
        this.c = sSLSocketFactory;
        this.b = aVar;
    }

    @Override // com.anythink.expressad.foundation.g.f.e.a
    public final com.anythink.expressad.foundation.g.f.f.b a(j<?> jVar) {
        HttpURLConnection httpURLConnection;
        SSLSocketFactory sSLSocketFactory;
        URL url = new URL(jVar.d());
        com.anythink.expressad.foundation.g.f.c.a aVar = this.b;
        if (aVar != null && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(this.b.c)) {
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.b.b, Integer.valueOf(this.b.c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        boolean z = false;
        httpURLConnection.setInstanceFollowRedirects(false);
        int k = jVar.k();
        httpURLConnection.setConnectTimeout(k);
        httpURLConnection.setReadTimeout(k);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (Map.Entry<String, String> entry : jVar.g().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            switch (jVar.a()) {
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    b(httpURLConnection, jVar);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod(HttpManager.HTTP_PUT);
                    b(httpURLConnection, jVar);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod(HttpManager.HTTP_DELETE);
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    b(httpURLConnection, jVar);
                    httpURLConnection.setRequestMethod("PATCH");
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (jVar.a() == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                com.anythink.expressad.foundation.g.f.f.b bVar = new com.anythink.expressad.foundation.g.f.f.b(responseCode, a(httpURLConnection.getHeaderFields()));
                httpURLConnection.disconnect();
                return bVar;
            }
            try {
                return new com.anythink.expressad.foundation.g.f.f.b(responseCode, a(httpURLConnection.getHeaderFields()), new a(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static List<c> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new c(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    static class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f4874a;

        a(HttpURLConnection httpURLConnection) {
            super(b.b(httpURLConnection));
            this.f4874a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            super.close();
            this.f4874a.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.b;
        if (aVar != null && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(this.b.c)) {
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.b.b, Integer.valueOf(this.b.c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, j<?> jVar) {
        switch (jVar.a()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, jVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod(HttpManager.HTTP_PUT);
                b(httpURLConnection, jVar);
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
                b(httpURLConnection, jVar);
                httpURLConnection.setRequestMethod("PATCH");
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static void b(HttpURLConnection httpURLConnection, j<?> jVar) {
        byte[] h = jVar.h();
        if (h != null) {
            boolean z = jVar instanceof f;
            if (z) {
                httpURLConnection.setChunkedStreamingMode(2048);
            }
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(h);
            if (z) {
                jVar.a((OutputStream) dataOutputStream);
            }
            dataOutputStream.close();
        }
    }

    private HttpURLConnection a(URL url, j<?> jVar) {
        HttpURLConnection httpURLConnection;
        SSLSocketFactory sSLSocketFactory;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.b;
        if (aVar != null && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(this.b.c)) {
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.b.b, Integer.valueOf(this.b.c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        int k = jVar.k();
        httpURLConnection.setConnectTimeout(k);
        httpURLConnection.setReadTimeout(k);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
