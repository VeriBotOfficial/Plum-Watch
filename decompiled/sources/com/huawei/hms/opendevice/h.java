package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import com.huawei.secure.android.common.util.IOUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: HttpClient.java */
/* loaded from: classes14.dex */
public abstract class h {

    /* compiled from: HttpClient.java */
    private enum a {
        GET("GET"),
        POST("POST");


        /* renamed from: a, reason: collision with root package name */
        private String f10456a;

        a(String str) {
            this.f10456a = str;
        }

        public String a() {
            return this.f10456a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v16, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static String a(Context context, String str, String str2, Map<String, String> map) {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        BufferedInputStream bufferedInputStream;
        HttpsURLConnection httpsURLConnection2;
        BufferedInputStream bufferedInputStream2;
        InputStream inputStream;
        ?? r10;
        InputStream inputStream2;
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection3;
        Throwable th2;
        InputStream inputStream3 = null;
        if (str2 == 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        int i = -1;
        try {
            try {
                httpsURLConnection2 = a((Context) context, (String) str, (Map<String, String>) map, a.POST.a());
                if (httpsURLConnection2 == null) {
                    IOUtil.closeSecure((OutputStream) null);
                    IOUtil.closeSecure((InputStream) null);
                    IOUtil.closeSecure((InputStream) null);
                    o.a(httpsURLConnection2);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                }
                try {
                    r10 = new BufferedOutputStream(httpsURLConnection2.getOutputStream());
                    try {
                        r10.write(str2.getBytes("UTF-8"));
                        r10.flush();
                        i = httpsURLConnection2.getResponseCode();
                        HMSLog.d("PushHttpsClient", "https post response code: " + i);
                        inputStream = i >= 400 ? httpsURLConnection2.getErrorStream() : httpsURLConnection2.getInputStream();
                    } catch (IOException unused) {
                        inputStream = null;
                    } catch (RuntimeException unused2) {
                        inputStream = null;
                    } catch (Exception unused3) {
                        inputStream = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream = null;
                    }
                    try {
                        bufferedInputStream2 = new BufferedInputStream(inputStream);
                    } catch (IOException unused4) {
                        bufferedInputStream2 = null;
                        HMSLog.w("PushHttpsClient", "https execute encounter IOException - http code:" + i);
                        context = httpsURLConnection2;
                        str = r10;
                        str2 = inputStream;
                        map = bufferedInputStream2;
                        IOUtil.closeSecure((OutputStream) str);
                        IOUtil.closeSecure((InputStream) str2);
                        IOUtil.closeSecure((InputStream) map);
                        o.a((HttpsURLConnection) context);
                        HMSLog.i("PushHttpsClient", "close connection");
                        return null;
                    } catch (RuntimeException unused5) {
                        bufferedInputStream2 = null;
                        HMSLog.w("PushHttpsClient", "https execute encounter RuntimeException - http code:" + i);
                        context = httpsURLConnection2;
                        str = r10;
                        str2 = inputStream;
                        map = bufferedInputStream2;
                        IOUtil.closeSecure((OutputStream) str);
                        IOUtil.closeSecure((InputStream) str2);
                        IOUtil.closeSecure((InputStream) map);
                        o.a((HttpsURLConnection) context);
                        HMSLog.i("PushHttpsClient", "close connection");
                        return null;
                    } catch (Exception unused6) {
                        bufferedInputStream2 = null;
                        HMSLog.w("PushHttpsClient", "https execute encounter unknown exception - http code:" + i);
                        context = httpsURLConnection2;
                        str = r10;
                        str2 = inputStream;
                        map = bufferedInputStream2;
                        IOUtil.closeSecure((OutputStream) str);
                        IOUtil.closeSecure((InputStream) str2);
                        IOUtil.closeSecure((InputStream) map);
                        o.a((HttpsURLConnection) context);
                        HMSLog.i("PushHttpsClient", "close connection");
                        return null;
                    } catch (Throwable th4) {
                        th2 = th4;
                        th = th2;
                        httpsURLConnection3 = httpsURLConnection2;
                        outputStream = r10;
                        inputStream2 = inputStream;
                        IOUtil.closeSecure(outputStream);
                        IOUtil.closeSecure(inputStream2);
                        IOUtil.closeSecure(inputStream3);
                        o.a(httpsURLConnection3);
                        HMSLog.i("PushHttpsClient", "close connection");
                        throw th;
                    }
                    try {
                        String a2 = o.a((InputStream) bufferedInputStream2);
                        IOUtil.closeSecure((OutputStream) r10);
                        IOUtil.closeSecure(inputStream);
                        IOUtil.closeSecure((InputStream) bufferedInputStream2);
                        o.a(httpsURLConnection2);
                        HMSLog.i("PushHttpsClient", "close connection");
                        return a2;
                    } catch (IOException unused7) {
                        HMSLog.w("PushHttpsClient", "https execute encounter IOException - http code:" + i);
                        context = httpsURLConnection2;
                        str = r10;
                        str2 = inputStream;
                        map = bufferedInputStream2;
                        IOUtil.closeSecure((OutputStream) str);
                        IOUtil.closeSecure((InputStream) str2);
                        IOUtil.closeSecure((InputStream) map);
                        o.a((HttpsURLConnection) context);
                        HMSLog.i("PushHttpsClient", "close connection");
                        return null;
                    } catch (RuntimeException unused8) {
                        HMSLog.w("PushHttpsClient", "https execute encounter RuntimeException - http code:" + i);
                        context = httpsURLConnection2;
                        str = r10;
                        str2 = inputStream;
                        map = bufferedInputStream2;
                        IOUtil.closeSecure((OutputStream) str);
                        IOUtil.closeSecure((InputStream) str2);
                        IOUtil.closeSecure((InputStream) map);
                        o.a((HttpsURLConnection) context);
                        HMSLog.i("PushHttpsClient", "close connection");
                        return null;
                    } catch (Exception unused9) {
                        HMSLog.w("PushHttpsClient", "https execute encounter unknown exception - http code:" + i);
                        context = httpsURLConnection2;
                        str = r10;
                        str2 = inputStream;
                        map = bufferedInputStream2;
                        IOUtil.closeSecure((OutputStream) str);
                        IOUtil.closeSecure((InputStream) str2);
                        IOUtil.closeSecure((InputStream) map);
                        o.a((HttpsURLConnection) context);
                        HMSLog.i("PushHttpsClient", "close connection");
                        return null;
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream3 = bufferedInputStream2;
                        httpsURLConnection3 = httpsURLConnection2;
                        outputStream = r10;
                        inputStream2 = inputStream;
                        IOUtil.closeSecure(outputStream);
                        IOUtil.closeSecure(inputStream2);
                        IOUtil.closeSecure(inputStream3);
                        o.a(httpsURLConnection3);
                        HMSLog.i("PushHttpsClient", "close connection");
                        throw th;
                    }
                } catch (IOException unused10) {
                    r10 = 0;
                    inputStream = null;
                    bufferedInputStream2 = null;
                    HMSLog.w("PushHttpsClient", "https execute encounter IOException - http code:" + i);
                    context = httpsURLConnection2;
                    str = r10;
                    str2 = inputStream;
                    map = bufferedInputStream2;
                    IOUtil.closeSecure((OutputStream) str);
                    IOUtil.closeSecure((InputStream) str2);
                    IOUtil.closeSecure((InputStream) map);
                    o.a((HttpsURLConnection) context);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                } catch (RuntimeException unused11) {
                    r10 = 0;
                    inputStream = null;
                    bufferedInputStream2 = null;
                    HMSLog.w("PushHttpsClient", "https execute encounter RuntimeException - http code:" + i);
                    context = httpsURLConnection2;
                    str = r10;
                    str2 = inputStream;
                    map = bufferedInputStream2;
                    IOUtil.closeSecure((OutputStream) str);
                    IOUtil.closeSecure((InputStream) str2);
                    IOUtil.closeSecure((InputStream) map);
                    o.a((HttpsURLConnection) context);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                } catch (Exception unused12) {
                    r10 = 0;
                    inputStream = null;
                    bufferedInputStream2 = null;
                    HMSLog.w("PushHttpsClient", "https execute encounter unknown exception - http code:" + i);
                    context = httpsURLConnection2;
                    str = r10;
                    str2 = inputStream;
                    map = bufferedInputStream2;
                    IOUtil.closeSecure((OutputStream) str);
                    IOUtil.closeSecure((InputStream) str2);
                    IOUtil.closeSecure((InputStream) map);
                    o.a((HttpsURLConnection) context);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                } catch (Throwable th6) {
                    th = th6;
                    bufferedInputStream = null;
                    httpsURLConnection = httpsURLConnection2;
                    bufferedInputStream2 = bufferedInputStream;
                    httpsURLConnection2 = httpsURLConnection;
                    inputStream = bufferedInputStream;
                    r10 = inputStream3;
                    inputStream3 = bufferedInputStream2;
                    httpsURLConnection3 = httpsURLConnection2;
                    outputStream = r10;
                    inputStream2 = inputStream;
                    IOUtil.closeSecure(outputStream);
                    IOUtil.closeSecure(inputStream2);
                    IOUtil.closeSecure(inputStream3);
                    o.a(httpsURLConnection3);
                    HMSLog.i("PushHttpsClient", "close connection");
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                inputStream3 = str;
                httpsURLConnection2 = context;
                inputStream = str2;
                bufferedInputStream2 = map;
                r10 = inputStream3;
                inputStream3 = bufferedInputStream2;
                httpsURLConnection3 = httpsURLConnection2;
                outputStream = r10;
                inputStream2 = inputStream;
                IOUtil.closeSecure(outputStream);
                IOUtil.closeSecure(inputStream2);
                IOUtil.closeSecure(inputStream3);
                o.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                throw th;
            }
        } catch (IOException unused13) {
            httpsURLConnection2 = null;
        } catch (RuntimeException unused14) {
            httpsURLConnection2 = null;
        } catch (Exception unused15) {
            httpsURLConnection2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpsURLConnection = null;
            bufferedInputStream = null;
        }
    }

    private static HttpsURLConnection a(Context context, String str, Map<String, String> map, String str2) throws Exception {
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection == null) {
            HMSLog.e("PushHttpsClient", "urlConnection is null");
            return null;
        }
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            try {
                SecureSSLSocketFactory secureSSLSocketFactory = SecureSSLSocketFactory.getInstance(context);
                if (secureSSLSocketFactory != null) {
                    httpsURLConnection.setSSLSocketFactory(secureSSLSocketFactory);
                    httpsURLConnection.setHostnameVerifier(SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                    httpsURLConnection.setRequestMethod(str2);
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(15000);
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setRequestProperty("Content-type", "application/json; charset=UTF-8");
                    httpsURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "close");
                    if (map != null && map.size() >= 1) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            String key = entry.getKey();
                            if (!TextUtils.isEmpty(key)) {
                                httpsURLConnection.setRequestProperty(key, URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), "UTF-8"));
                            }
                        }
                    }
                    return httpsURLConnection;
                }
                HMSLog.e("PushHttpsClient", "No ssl socket factory set.");
                return null;
            } catch (IOException | IllegalAccessException | IllegalArgumentException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                HMSLog.e("PushHttpsClient", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            }
        }
        HMSLog.e("PushHttpsClient", "current request is http not allow connection");
        return null;
    }
}
