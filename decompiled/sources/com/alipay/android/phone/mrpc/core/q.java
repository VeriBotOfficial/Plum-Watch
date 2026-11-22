package com.alipay.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes11.dex */
public class q implements Callable<v> {
    private static final HttpRequestRetryHandler e = new af();

    /* renamed from: a, reason: collision with root package name */
    public l f1286a;
    public Context b;
    public o c;
    public String d;
    private HttpUriRequest f;
    private CookieManager i;
    private AbstractHttpEntity j;
    private HttpHost k;
    private URL l;

    /* renamed from: q, reason: collision with root package name */
    private String f1287q;
    private HttpContext g = new BasicHttpContext();
    private CookieStore h = new BasicCookieStore();
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private String p = null;

    public q(l lVar, o oVar) {
        this.f1286a = lVar;
        this.b = lVar.f1283a;
        this.c = oVar;
    }

    private HttpUriRequest f() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity b = b();
        if (b != null) {
            HttpPost httpPost = new HttpPost(a());
            httpPost.setEntity(b);
            this.f = httpPost;
        } else {
            this.f = new HttpGet(a());
        }
        return this.f;
    }

    private void g() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private ae h() {
        return this.c.f();
    }

    private HttpResponse i() {
        return j();
    }

    private HttpResponse j() {
        Log.d("HttpWorker", "By Http/Https to request. operationType=" + k() + " url=" + this.f.getURI().toString());
        l().getParams().setParameter("http.route.default-proxy", q());
        HttpHost n = n();
        if (o() == 80) {
            n = new HttpHost(p().getHost());
        }
        return l().execute(n, this.f, this.g);
    }

    private String k() {
        if (!TextUtils.isEmpty(this.f1287q)) {
            return this.f1287q;
        }
        String b = this.c.b("operationType");
        this.f1287q = b;
        return b;
    }

    private b l() {
        return this.f1286a.a();
    }

    private void m() {
        ArrayList<Header> c = c();
        if (c != null && !c.isEmpty()) {
            Iterator<Header> it = c.iterator();
            while (it.hasNext()) {
                f().addHeader(it.next());
            }
        }
        b.a((HttpRequest) f());
        b.b(f());
        f().addHeader(ParameterNames.COOKIE, r().getCookie(this.c.a()));
    }

    private HttpHost n() {
        HttpHost httpHost = this.k;
        if (httpHost != null) {
            return httpHost;
        }
        URL p = p();
        HttpHost httpHost2 = new HttpHost(p.getHost(), o(), p.getProtocol());
        this.k = httpHost2;
        return httpHost2;
    }

    private int o() {
        URL p = p();
        return p.getPort() == -1 ? p.getDefaultPort() : p.getPort();
    }

    private URL p() {
        URL url = this.l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.c.a());
        this.l = url2;
        return url2;
    }

    private HttpHost q() {
        HttpHost a2 = t.a(this.b);
        if (a2 != null && TextUtils.equals(a2.getHostName(), "127.0.0.1") && a2.getPort() == 8087) {
            return null;
        }
        return a2;
    }

    private CookieManager r() {
        CookieManager cookieManager = this.i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.i = cookieManager2;
        return cookieManager2;
    }

    public long a(String[] strArr) {
        String str;
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && (str = strArr[i + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    public HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public v a(HttpResponse httpResponse, int i, String str) {
        Log.d("HttpWorker", "开始handle，handleResponse-1," + Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
            }
            return null;
        }
        Log.d("HttpWorker", "200，开始处理，handleResponse-2,threadid = " + Thread.currentThread().getId());
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a(entity, 0L, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.o = false;
                this.f1286a.c(System.currentTimeMillis() - currentTimeMillis);
                this.f1286a.a(byteArray.length);
                Log.i("HttpWorker", "res:" + byteArray.length);
                p pVar = new p(a(httpResponse), i, str, byteArray);
                a(pVar, httpResponse);
                try {
                    byteArrayOutputStream2.close();
                    Log.d("HttpWorker", "finally,handleResponse");
                    return pVar;
                } catch (IOException e2) {
                    throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        throw new RuntimeException("ArrayOutputStream close error!", e3.getCause());
                    }
                }
                Log.d("HttpWorker", "finally,handleResponse");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public v a(HttpResponse httpResponse, o oVar) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode == 200 || a(statusCode, reasonPhrase)) {
            return a(httpResponse, statusCode, reasonPhrase);
        }
        throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
    }

    public URI a() {
        String a2 = this.c.a();
        String str = this.d;
        if (str != null) {
            a2 = str;
        }
        if (a2 != null) {
            return new URI(a2);
        }
        throw new RuntimeException("url should not be null");
    }

    public HashMap<String, String> a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    public void a(p pVar, HttpResponse httpResponse) {
        String str;
        String str2;
        long b = b(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        if (contentType != null) {
            HashMap<String, String> a2 = a(contentType.getValue());
            str = a2.get("charset");
            str2 = a2.get("Content-Type");
        } else {
            str = null;
            str2 = null;
        }
        pVar.b(str2);
        pVar.a(str);
        pVar.a(System.currentTimeMillis());
        pVar.b(b);
    }

    public void a(HttpEntity httpEntity, long j, OutputStream outputStream) {
        if (outputStream == null) {
            httpEntity.consumeContent();
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream a2 = b.a(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = a2.read(bArr);
                    if (read == -1 || this.c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j += read;
                    if (h() != null && contentLength > 0) {
                        h().a(this.c, j / contentLength);
                    }
                }
                outputStream.flush();
            } catch (Exception e2) {
                Log.w("HttpWorker", e2.getCause());
                throw new IOException("HttpWorker Request Error!" + e2.getLocalizedMessage());
            }
        } finally {
            r.a(a2);
        }
    }

    public boolean a(int i, String str) {
        return i == 304;
    }

    public long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException e2) {
                    Log.w("HttpWorker", e2);
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    public AbstractHttpEntity b() {
        AbstractHttpEntity abstractHttpEntity = this.j;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] b = this.c.b();
        String b2 = this.c.b("gzip");
        if (b != null) {
            if (TextUtils.equals(b2, MediaConstraintKeys.TRUE)) {
                this.j = b.a(b, (ContentResolver) null);
            } else {
                this.j = new ByteArrayEntity(b);
            }
            this.j.setContentType(this.c.c());
        }
        return this.j;
    }

    public ArrayList<Header> c() {
        return this.c.d();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public v call() {
        try {
            if (!t.c(this.b)) {
                throw new HttpException(1, "The network is not available");
            }
            if (h() != null) {
                h().b(this.c);
            }
            m();
            this.g.setAttribute("http.cookie-store", this.h);
            l().a(e);
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse i = i();
            this.f1286a.b(System.currentTimeMillis() - currentTimeMillis);
            List<Cookie> cookies = this.h.getCookies();
            if (this.c.e()) {
                r().removeAllCookie();
            }
            if (!cookies.isEmpty()) {
                for (Cookie cookie : cookies) {
                    if (cookie.getDomain() != null) {
                        r().setCookie(this.c.a(), cookie.getName() + "=" + cookie.getValue() + "; domain=" + cookie.getDomain() + (cookie.isSecure() ? "; Secure" : ""));
                        CookieSyncManager.getInstance().sync();
                    }
                }
            }
            v a2 = a(i, this.c);
            if (((a2 == null || a2.b() == null) ? -1L : a2.b().length) == -1 && (a2 instanceof p)) {
                try {
                    Long.parseLong(((p) a2).a().getHead("Content-Length"));
                } catch (Exception unused) {
                    Log.e("HttpWorker", "parse Content-Length error");
                }
            }
            if (this.c.a() != null && !TextUtils.isEmpty(k())) {
                k();
            }
            return a2;
        } catch (HttpException e2) {
            g();
            if (h() != null) {
                h().a(this.c, e2.getCode(), e2.getMsg());
            }
            Log.e("HttpManager", e2 + "");
            throw e2;
        } catch (NullPointerException e3) {
            g();
            int i2 = this.m;
            if (i2 < 1) {
                this.m = i2 + 1;
                return call();
            }
            Log.e("HttpManager", e3 + "");
            throw new HttpException(0, e3 + "");
        } catch (SocketTimeoutException e4) {
            g();
            if (h() != null) {
                h().a(this.c, 4, e4 + "");
            }
            Log.e("HttpManager", e4 + "");
            throw new HttpException(4, e4 + "");
        } catch (URISyntaxException e5) {
            throw new RuntimeException("Url parser error!", e5.getCause());
        } catch (UnknownHostException e6) {
            g();
            if (h() != null) {
                h().a(this.c, 9, e6 + "");
            }
            Log.e("HttpManager", e6 + "");
            throw new HttpException(9, e6 + "");
        } catch (SSLHandshakeException e7) {
            g();
            if (h() != null) {
                h().a(this.c, 2, e7 + "");
            }
            Log.e("HttpManager", e7 + "");
            throw new HttpException(2, e7 + "");
        } catch (SSLPeerUnverifiedException e8) {
            g();
            if (h() != null) {
                h().a(this.c, 2, e8 + "");
            }
            Log.e("HttpManager", e8 + "");
            throw new HttpException(2, e8 + "");
        } catch (SSLException e9) {
            g();
            if (h() != null) {
                h().a(this.c, 6, e9 + "");
            }
            Log.e("HttpManager", e9 + "");
            throw new HttpException(6, e9 + "");
        } catch (NoHttpResponseException e10) {
            g();
            if (h() != null) {
                h().a(this.c, 5, e10 + "");
            }
            Log.e("HttpManager", e10 + "");
            throw new HttpException(5, e10 + "");
        } catch (ConnectionPoolTimeoutException e11) {
            g();
            if (h() != null) {
                h().a(this.c, 3, e11 + "");
            }
            Log.e("HttpManager", e11 + "");
            throw new HttpException(3, e11 + "");
        } catch (ConnectTimeoutException e12) {
            g();
            if (h() != null) {
                h().a(this.c, 3, e12 + "");
            }
            Log.e("HttpManager", e12 + "");
            throw new HttpException(3, e12 + "");
        } catch (HttpHostConnectException e13) {
            g();
            if (h() != null) {
                h().a(this.c, 8, e13 + "");
            }
            Log.e("HttpManager", "", e13);
            throw new HttpException(8, e13 + "");
        } catch (IOException e14) {
            g();
            if (h() != null) {
                h().a(this.c, 6, e14 + "");
            }
            Log.e("HttpManager", e14 + "");
            throw new HttpException(6, e14 + "");
        } catch (Exception e15) {
            Log.e("HttpManager", "", e15);
            g();
            if (h() != null) {
                h().a(this.c, 0, e15 + "");
            }
            throw new HttpException(0, e15 + "");
        }
    }

    public o e() {
        return this.c;
    }
}
