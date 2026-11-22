package com.baidu.mshield.b.d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.baidu.mshield.b.a.g;
import com.baidu.mshield.b.f.e;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: HttpUtil.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, SSLSocketFactory> f8418a = new HashMap();
    public Context b;
    public HttpURLConnection d;
    public String e;
    public String f;
    public String g;
    public byte[] c = new byte[1024];
    public int h = 120000;
    public int i = 120000;
    public boolean j = false;
    public boolean k = false;
    public String l = "";

    /* compiled from: HttpUtil.java */
    public class a implements HostnameVerifier {
        public a(b bVar) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return "mshield.baidu.com".equals(str);
        }
    }

    /* compiled from: HttpUtil.java */
    /* renamed from: com.baidu.mshield.b.d.b$b, reason: collision with other inner class name */
    public class C0385b implements X509TrustManager {

        /* renamed from: a, reason: collision with root package name */
        public X509TrustManager f8419a;
        public X509TrustManagerExtensions b = null;
        public String c;

        public C0385b(b bVar, X509TrustManager x509TrustManager, String str) {
            this.f8419a = x509TrustManager;
            this.c = str;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.f8419a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            com.baidu.mshield.b.c.a.b("... checkServerTrusted ...");
            try {
                com.baidu.mshield.b.c.a.b("checkServerTrusted host=" + this.c);
                if (this.b == null) {
                    this.b = new X509TrustManagerExtensions(this.f8419a);
                }
                this.b.checkServerTrusted(x509CertificateArr, str, this.c);
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.b("... checkServerTrusted .error ...");
                com.baidu.mshield.b.c.a.a(th);
                for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                    if ((th2 instanceof CertificateExpiredException) || (th2 instanceof CertificateNotYetValidException)) {
                        com.baidu.mshield.b.c.a.b("certificate time invalid -> throw");
                        if (!(th2 instanceof CertificateException)) {
                            throw new CertificateException("Certificate time invalid", th2);
                        }
                        throw ((CertificateException) th2);
                    }
                }
                if (th instanceof CertificateException) {
                    com.baidu.mshield.b.c.a.b("  throw e;");
                    throw th;
                }
                com.baidu.mshield.b.c.a.b("  throw new CertificateException();...");
                throw new CertificateException();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f8419a.getAcceptedIssuers();
        }
    }

    public b(Context context, Handler handler) {
        this.b = context.getApplicationContext();
    }

    public final void a(String str, String str2) {
        this.e = str;
        this.f = str2;
        try {
            this.l = new URL(str2).getHost();
        } catch (MalformedURLException e) {
            com.baidu.mshield.b.c.a.a(e);
        }
    }

    public final String b() {
        try {
            Class<?> cls = Class.forName("com.baidu.mshield.ac.F");
            Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("gzd", Context.class);
            declaredMethod2.setAccessible(true);
            return (String) declaredMethod2.invoke(invoke, this.b);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public final InputStream c(String str, String str2) throws Throwable {
        if (!com.baidu.mshield.b.a.d.b(this.b)) {
            throw new NetworkErrorException("requestFromServerStream no network");
        }
        HttpURLConnection a2 = a((Map<String, String>) null, str2);
        this.d = a2;
        if (a2 == null || a2.getResponseCode() != 200) {
            return null;
        }
        if (str == null) {
            if ("gzip".equalsIgnoreCase(this.d.getContentEncoding())) {
                this.j = true;
            } else {
                this.j = false;
            }
            return this.d.getInputStream();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.d.getOutputStream());
        bufferedOutputStream.write(com.baidu.mshield.b.a.c.a(str.getBytes()));
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        if ("gzip".equalsIgnoreCase(this.d.getContentEncoding())) {
            this.j = true;
        } else {
            this.j = false;
        }
        return this.d.getInputStream();
    }

    public final void a(HttpsURLConnection httpsURLConnection, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.l = str;
            }
            Map<String, SSLSocketFactory> map = f8418a;
            SSLSocketFactory sSLSocketFactory = map.get(this.l);
            if (sSLSocketFactory != null) {
                httpsURLConnection.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                return;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length >= 1 && (trustManagers[0] instanceof X509TrustManager)) {
                sSLContext.init(null, new TrustManager[]{new C0385b(this, (X509TrustManager) trustManagers[0], this.l)}, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                if (!TextUtils.isEmpty(this.l)) {
                    map.put(this.l, socketFactory);
                    httpsURLConnection.setHostnameVerifier(new a(this));
                } else {
                    httpsURLConnection.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                }
                httpsURLConnection.setSSLSocketFactory(socketFactory);
                return;
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
    }

    public final String b(InputStream inputStream) throws Throwable {
        byte[] a2;
        if (inputStream == null || (a2 = a(inputStream)) == null) {
            return null;
        }
        if (this.j) {
            a2 = com.baidu.mshield.b.a.c.b(a2);
        }
        if (a2 == null) {
            return null;
        }
        return new String(a2);
    }

    public String b(String str, String str2) throws Throwable {
        InputStream inputStream;
        d.b();
        try {
            try {
                try {
                    a("GET", str);
                    inputStream = c(null, str2);
                    if (inputStream == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                com.baidu.mshield.b.c.a.a(th);
                            }
                        }
                        HttpURLConnection httpURLConnection = this.d;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            this.d = null;
                        }
                        return null;
                    }
                    try {
                        String b = b(inputStream);
                        try {
                            inputStream.close();
                            HttpURLConnection httpURLConnection2 = this.d;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                                this.d = null;
                            }
                        } catch (Throwable th2) {
                            com.baidu.mshield.b.c.a.a(th2);
                        }
                        return b;
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                com.baidu.mshield.b.c.a.a(th4);
                                throw th;
                            }
                        }
                        HttpURLConnection httpURLConnection3 = this.d;
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                            this.d = null;
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
            } catch (Throwable th6) {
                com.baidu.mshield.b.c.a.a(th6);
                d.a();
                return "";
            }
            com.baidu.mshield.b.c.a.a(th6);
            d.a();
            return "";
        } finally {
            d.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.net.HttpURLConnection] */
    public final HttpURLConnection a(Map<String, String> map, String str) throws Throwable {
        int i;
        HttpsURLConnection httpsURLConnection = null;
        String str2 = null;
        httpsURLConnection = null;
        if (this.k) {
            return null;
        }
        if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.f)) {
            if (!this.e.equals("POST") && !this.e.equals("GET")) {
                this.e = "POST";
            }
            URL url = new URL(this.f);
            if (com.baidu.mshield.b.a.d.c(this.b)) {
                i = 80;
            } else {
                str2 = System.getProperties().getProperty("http.proxyHost");
                String property = System.getProperties().getProperty("http.proxyPort");
                if (!TextUtils.isEmpty(property)) {
                    try {
                        i = Integer.parseInt(property);
                    } catch (Throwable unused) {
                    }
                }
                i = -1;
            }
            if (str2 != null && i > 0) {
                httpsURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str2, i)));
            } else {
                httpsURLConnection = (HttpURLConnection) url.openConnection();
            }
            if ("https".equals(url.getProtocol())) {
                a(httpsURLConnection, str);
            }
            httpsURLConnection.setRequestMethod(this.e);
            httpsURLConnection.setDoInput(true);
            if ("POST".equals(this.e)) {
                httpsURLConnection.setDoOutput(true);
            }
            this.g = e.a(b());
            com.baidu.mshield.b.c.a.a("sdkhttputilcuid====" + this.g);
            httpsURLConnection.setInstanceFollowRedirects(true);
            httpsURLConnection.setConnectTimeout(this.h);
            httpsURLConnection.setReadTimeout(this.i);
            httpsURLConnection.setRequestProperty("x-device-id", this.g);
            String str3 = com.baidu.mshield.b.a.a.f8413a;
            String a2 = com.baidu.mshield.b.a.d.a(this.b);
            if (!TextUtils.isEmpty(str)) {
                httpsURLConnection.setRequestProperty("Host", str);
            }
            String str4 = "mshield/" + str3 + "/" + a2 + "/4.2.9";
            com.baidu.mshield.b.c.a.a("useragent==" + str4);
            httpsURLConnection.setRequestProperty("User-Agent", str4);
            httpsURLConnection.setRequestProperty(HttpHeaders.PRAGMA, "no-cache");
            httpsURLConnection.setRequestProperty("Accept", "*/*");
            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            httpsURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().getLanguage());
            httpsURLConnection.setRequestProperty("x-sdk-ver", "mshield/4.2.9");
            httpsURLConnection.setRequestProperty("x-plu-ver", "x0/4.2.9");
            httpsURLConnection.setRequestProperty("x-app-ver", this.b.getPackageName() + "/" + a2);
            httpsURLConnection.setRequestProperty("x-sys-ver", "android/" + g.b());
            httpsURLConnection.setRequestProperty("x-sys-dev", g.a(this.b) + "/" + g.a());
            httpsURLConnection.setRequestProperty("x-api-ver", String.valueOf(Build.VERSION.SDK_INT));
            if (map != null) {
                for (String str5 : map.keySet()) {
                    httpsURLConnection.setRequestProperty(str5, map.get(str5));
                }
            }
        }
        return httpsURLConnection;
    }

    public String a(String str) throws Throwable {
        return b(str, "");
    }

    public String a(String str, byte[] bArr) throws Throwable {
        return a(str, "", bArr);
    }

    public String a(String str, String str2, byte[] bArr) throws Throwable {
        InputStream inputStream;
        d.b();
        try {
            a("POST", str);
            try {
                inputStream = a(bArr, str2);
                if (inputStream == null) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    HttpURLConnection httpURLConnection = this.d;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        this.d = null;
                    }
                    return null;
                }
                try {
                    String b = b(inputStream);
                    inputStream.close();
                    HttpURLConnection httpURLConnection2 = this.d;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                        this.d = null;
                    }
                    return b;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    HttpURLConnection httpURLConnection3 = this.d;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                        this.d = null;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } finally {
            d.a();
        }
    }

    public final InputStream a(byte[] bArr, String str) throws Throwable {
        if (com.baidu.mshield.b.a.d.b(this.b)) {
            HttpURLConnection a2 = a((Map<String, String>) null, str);
            this.d = a2;
            if (a2 == null) {
                return null;
            }
            if (bArr == null) {
                if ("gzip".equalsIgnoreCase(a2.getContentEncoding())) {
                    this.j = true;
                } else {
                    this.j = false;
                }
                return this.d.getInputStream();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.d.getOutputStream());
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            int responseCode = this.d.getResponseCode();
            try {
                com.baidu.mshield.b.c.a.b("httpcode:" + responseCode);
                com.baidu.mshield.b.c.a.b("httpcontent:" + this.d.getContent());
                com.baidu.mshield.b.c.a.b("httpresponse:" + this.d.getResponseMessage());
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.a(th);
            }
            if ("gzip".equalsIgnoreCase(this.d.getContentEncoding())) {
                this.j = true;
            } else {
                this.j = false;
            }
            if (responseCode == 200) {
                return this.d.getInputStream();
            }
            throw new c(responseCode);
        }
        throw new NetworkErrorException("requestFromServerStreamByte no network");
    }

    public final byte[] a(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(this.c);
            if (read != -1) {
                byteArrayOutputStream.write(this.c, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public String a() {
        return this.g;
    }
}
