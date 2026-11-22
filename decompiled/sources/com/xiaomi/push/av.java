package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.google.common.net.HttpHeaders;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes4.dex */
public class av {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<a<aw>> f14441a = new AtomicReference<>(a());

    /* renamed from: a, reason: collision with other field name */
    public static final Pattern f214a = Pattern.compile("([^\\s;]+)(.*)");
    public static final Pattern b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);
    public static final Pattern c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    public static InputStream a(Context context, URL url, boolean z, String str, String str2) {
        return a(context, url, z, str, str2, null, null);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m11883a() {
        b();
    }

    public static void b() {
        f14441a.set(a());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Object m11879a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkRequest build;
        ConnectivityManager.NetworkCallback networkCallback;
        if (context == null) {
            context = s.m12370a();
        }
        ConnectivityManager.NetworkCallback networkCallback2 = null;
        if (context != null && !j.m12358a(context)) {
            try {
                connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                build = new NetworkRequest.Builder().build();
                networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.xiaomi.push.av.1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onAvailable(Network network) {
                        super.onAvailable(network);
                        av.b();
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(Network network) {
                        super.onLost(network);
                        av.b();
                    }
                };
            } catch (Throwable th) {
                th = th;
            }
            try {
                ConnectivityManager.NetworkCallback networkCallback3 = networkCallback;
                ConnectivityManager.NetworkCallback networkCallback4 = networkCallback3;
                connectivityManager.registerNetworkCallback(build, networkCallback3);
                return networkCallback;
            } catch (Throwable th2) {
                th = th2;
                networkCallback2 = networkCallback;
                com.xiaomi.channel.commonutils.logger.b.m11781a("exception occurred in adding network callback :" + th);
                return networkCallback2;
            }
        }
        return networkCallback2;
    }

    public static void a(Context context, Object obj) {
        if (context == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof ConnectivityManager.NetworkCallback) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("exception occurred in removing network callback :" + th);
        }
    }

    private static class a<T> extends FutureTask<T> {

        /* renamed from: a, reason: collision with root package name */
        private long f14442a;

        public a(Callable<T> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.f14442a = SystemClock.elapsedRealtime();
            super.run();
        }

        public boolean a() {
            if (j.m12358a(s.m12370a())) {
                return true;
            }
            return isDone() && Math.abs(SystemClock.elapsedRealtime() - this.f14442a) > 1800000;
        }
    }

    private static a<aw> a() {
        return new a<>(new Callable<aw>() { // from class: com.xiaomi.push.av.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public aw call() {
                NetworkInfo activeNetworkInfo;
                Context m12370a = s.m12370a();
                if (m12370a == null) {
                    return null;
                }
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) m12370a.getSystemService("connectivity");
                    if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                        return null;
                    }
                    return new aw(activeNetworkInfo);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    /* renamed from: a, reason: collision with other method in class */
    public static aw m11877a() {
        AtomicReference<a<aw>> atomicReference = f14441a;
        a<aw> aVar = atomicReference.get();
        if (aVar == null) {
            return null;
        }
        try {
            if (aVar.a()) {
                aVar = a();
                atomicReference.set(aVar);
            }
            if (!aVar.isDone()) {
                aVar.run();
            }
            return aVar.get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static InputStream a(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("context");
        }
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        URL url2 = !z ? new URL(a(url.toString())) : url;
        try {
            HttpURLConnection.setFollowRedirects(true);
            HttpURLConnection m11881a = m11881a(context, url2);
            m11881a.setConnectTimeout(10000);
            m11881a.setReadTimeout(15000);
            if (!TextUtils.isEmpty(str)) {
                m11881a.setRequestProperty("User-Agent", str);
            }
            if (str2 != null) {
                m11881a.setRequestProperty("Cookie", str2);
            }
            if (map != null) {
                for (String str3 : map.keySet()) {
                    m11881a.setRequestProperty(str3, map.get(str3));
                }
            }
            if (cVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                cVar.f14444a = m11881a.getResponseCode();
                if (cVar.f215a == null) {
                    cVar.f215a = new HashMap();
                }
                int i = 0;
                while (true) {
                    String headerFieldKey = m11881a.getHeaderFieldKey(i);
                    String headerField = m11881a.getHeaderField(i);
                    if (headerFieldKey == null && headerField == null) {
                        break;
                    }
                    if (!TextUtils.isEmpty(headerFieldKey) && !TextUtils.isEmpty(headerField)) {
                        cVar.f215a.put(headerFieldKey, headerField);
                    }
                    i++;
                }
            }
            return new b(m11881a.getInputStream());
        } catch (IOException e) {
            throw new IOException("IOException:" + e.getClass().getSimpleName());
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    public static String a(Context context, URL url) {
        return a(context, url, false, null, "UTF-8", null);
    }

    public static String a(Context context, URL url, boolean z, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = a(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 != read) {
                        sb.append(cArr, 0, read);
                    } else {
                        x.a((Closeable) inputStream);
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                th = th;
                x.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f14444a;

        /* renamed from: a, reason: collision with other field name */
        public Map<String, String> f215a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.f14444a), this.f215a.toString());
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, bb.a(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, Map<String, String> map, File file, String str2) {
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "Keep-Alive");
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"\r\n");
                dataOutputStream.writeBytes("\r\n");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, read);
                        dataOutputStream.flush();
                    }
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.writeBytes(HttpClient.ENDFLAG);
                    dataOutputStream.writeBytes("*****");
                    dataOutputStream.writeBytes(HttpClient.ENDFLAG);
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.flush();
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                stringBuffer.append(readLine);
                            } else {
                                String stringBuffer2 = stringBuffer.toString();
                                x.a((Closeable) fileInputStream);
                                x.a(bufferedReader);
                                return stringBuffer2;
                            }
                        } catch (IOException e) {
                            e = e;
                            throw new IOException("IOException:" + e.getClass().getSimpleName());
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                x.a((Closeable) null);
                x.a((Closeable) file);
                throw th3;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static int a(Context context) {
        aw m11877a = m11877a();
        if (m11877a == null) {
            return -1;
        }
        return m11877a.a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static HttpURLConnection m11881a(Context context, URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public static final class b extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14443a;

        public b(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (!this.f14443a && (read = super.read(bArr, i, i2)) != -1) {
                return read;
            }
            this.f14443a = true;
            return -1;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m11884a(Context context) {
        return a(context) >= 0;
    }

    public static boolean b(Context context) {
        NetworkCapabilities networkCapabilities;
        boolean hasCapability;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (Exception unused) {
            }
            if (networkCapabilities != null) {
                hasCapability = networkCapabilities.hasCapability(16);
                return hasCapability && c(context);
            }
        }
        hasCapability = false;
        if (hasCapability) {
            return false;
        }
    }

    public static boolean c(Context context) {
        aw m11877a = m11877a();
        return m11877a != null && m11877a.m11888a();
    }

    public static boolean d(Context context) {
        aw m11877a = m11877a();
        return m11877a != null && 1 == m11877a.a();
    }

    public static boolean e(Context context) {
        aw m11878a = m11878a(context);
        return m11878a != null && m11878a.a() == 0 && 20 == m11878a.b();
    }

    public static boolean f(Context context) {
        aw m11878a = m11878a(context);
        return m11878a != null && m11878a.a() == 0 && 13 == m11878a.b();
    }

    public static boolean g(Context context) {
        aw m11878a = m11878a(context);
        if (m11878a == null || m11878a.a() != 0) {
            return false;
        }
        String m11889b = m11878a.m11889b();
        if (!"TD-SCDMA".equalsIgnoreCase(m11889b) && !"CDMA2000".equalsIgnoreCase(m11889b) && !"WCDMA".equalsIgnoreCase(m11889b)) {
            switch (m11878a.b()) {
            }
            return false;
        }
        return true;
    }

    public static boolean h(Context context) {
        aw m11878a = m11878a(context);
        if (m11878a == null || m11878a.a() != 0) {
            return false;
        }
        int b2 = m11878a.b();
        return b2 == 1 || b2 == 2 || b2 == 4 || b2 == 7 || b2 == 11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static aw m11878a(Context context) {
        return m11877a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m11880a(Context context) {
        if (d(context)) {
            return "wifi";
        }
        aw m11877a = m11877a();
        if (m11877a == null) {
            return "";
        }
        return (m11877a.m11887a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + m11877a.m11889b()).toLowerCase();
    }

    public static at a(Context context, String str, Map<String, String> map) {
        return a(context, str, "POST", (Map<String, String>) null, a(map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static at a(Context context, String str, String str2, Map<String, String> map, String str3) {
        boolean z;
        BufferedReader bufferedReader;
        OutputStream outputStream;
        at atVar = new at();
        try {
            try {
                try {
                    HttpURLConnection m11881a = m11881a(context, m11882a(str));
                    m11881a.setConnectTimeout(10000);
                    m11881a.setReadTimeout(15000);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    m11881a.setRequestMethod(str4);
                    int i = 0;
                    if (map != null) {
                        z = "gzip".equalsIgnoreCase(map.get("Content-Encoding"));
                        for (String str5 : map.keySet()) {
                            m11881a.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        z = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        m11881a.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        if (z) {
                            outputStream = new GZIPOutputStream(m11881a.getOutputStream());
                        } else {
                            outputStream = m11881a.getOutputStream();
                        }
                        try {
                            outputStream.write(bytes, 0, bytes.length);
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e) {
                            e = e;
                            throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                    atVar.f14440a = m11881a.getResponseCode();
                    com.xiaomi.channel.commonutils.logger.b.m11781a("Http POST Response Code: " + atVar.f14440a);
                    while (true) {
                        String headerFieldKey = m11881a.getHeaderFieldKey(i);
                        String headerField = m11881a.getHeaderField(i);
                        if (headerFieldKey != null || headerField != null) {
                            atVar.f213a.put(headerFieldKey, headerField);
                            i += 2;
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new b(m11881a.getErrorStream())));
                            }
                        }
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new b(m11881a.getInputStream())));
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                String property = System.getProperty("line.separator");
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    stringBuffer.append(readLine);
                    stringBuffer.append(property);
                }
                atVar.f212a = stringBuffer.toString();
                bufferedReader.close();
                x.a((Closeable) null);
                x.a((Closeable) null);
                return atVar;
            } catch (IOException e3) {
                e = e3;
                throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
            } catch (Throwable th3) {
                th = th3;
                throw new IOException(th.getMessage());
            }
        } catch (Throwable th4) {
            x.a((Closeable) null);
            x.a((Closeable) str2);
            throw th4;
        }
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("Failed to convert from params map to string: " + e);
                    com.xiaomi.channel.commonutils.logger.b.m11781a("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    private static URL m11882a(String str) {
        return new URL(str);
    }
}
