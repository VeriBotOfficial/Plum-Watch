package com.iflytek.idata.extension;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private int f11230a = 20000;
    private a b = null;
    private volatile boolean c = false;
    private URL d = null;
    private ArrayList<byte[]> e = new ArrayList<>();
    private Object f = null;
    private int g = 0;

    public interface a {
        void a(b bVar, byte[] bArr);

        void a(Exception exc);
    }

    private int c() {
        int i = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            i += this.e.get(i2).length;
        }
        return i;
    }

    public void a(int i) {
        this.g = i;
    }

    public void b(int i) {
        this.f11230a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.g == 1) {
            a();
        } else {
            b();
        }
    }

    public void a(String str, String str2, byte[] bArr) {
        this.e.clear();
        a(bArr);
        try {
            this.d = a(str, str2);
        } catch (MalformedURLException e) {
            com.iflytek.idata.extension.d.a.c("Collector", "url error:" + e);
        }
    }

    public void b(a aVar) {
        this.b = aVar;
        start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        HttpURLConnection httpURLConnection;
        InputStream inputStream = null;
        Object[] objArr = 0;
        InputStream inputStream2 = null;
        Object[] objArr2 = 0;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                httpURLConnection = (HttpURLConnection) this.d.openConnection();
                try {
                    httpURLConnection.setConnectTimeout(this.f11230a);
                    httpURLConnection.setReadTimeout(this.f11230a);
                    httpURLConnection.setRequestMethod("GET");
                    int responseCode = httpURLConnection.getResponseCode();
                    if (200 == responseCode) {
                        inputStream2 = httpURLConnection.getInputStream();
                        b(a(inputStream2));
                    } else {
                        a(new Exception("HttpRequest Failed: " + responseCode));
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    a(e);
                    if (0 != 0) {
                        (objArr2 == true ? 1 : 0).close();
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Exception unused) {
                return;
            }
        } catch (Exception e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                    throw th;
                }
            }
            if (0 != 0) {
                (objArr == true ? 1 : 0).disconnect();
            }
            throw th;
        }
        httpURLConnection.disconnect();
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public static URL a(String str, String str2) throws MalformedURLException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.endsWith(Separators.QUESTION)) {
                str = str + Separators.QUESTION;
            }
            str = str + str2;
        }
        com.iflytek.idata.extension.d.a.a("Collector", "url:" + str);
        return new URL(str);
    }

    private byte[] a(InputStream inputStream) throws IOException {
        int read;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = new byte[1024];
        while (!this.c && (read = bufferedInputStream.read(bArr, 0, 1024)) != -1) {
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            this.e.add(bArr);
        }
    }

    private void a(Exception exc) {
        if (this.b == null || this.c) {
            return;
        }
        this.b.a(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        HttpURLConnection httpURLConnection;
        InputStream inputStream = null;
        Object[] objArr = 0;
        InputStream inputStream2 = null;
        Object[] objArr2 = 0;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                httpURLConnection = (HttpURLConnection) this.d.openConnection();
                try {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setConnectTimeout(this.f11230a);
                    httpURLConnection.setReadTimeout(this.f11230a);
                    httpURLConnection.setRequestProperty("Content-length", "" + c());
                    httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "Keep-Alive");
                    httpURLConnection.setRequestProperty("Charset", "utf-8");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    Iterator<byte[]> it = this.e.iterator();
                    while (it.hasNext()) {
                        outputStream.write(it.next());
                    }
                    outputStream.flush();
                    outputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (200 == responseCode) {
                        inputStream2 = httpURLConnection.getInputStream();
                        b(a(inputStream2));
                    } else {
                        a(new Exception("Http Request Failed: " + responseCode));
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (Exception e) {
                    e = e;
                    a(e);
                    if (0 != 0) {
                        (objArr2 == true ? 1 : 0).close();
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Exception unused) {
                return;
            }
        } catch (Exception e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                    throw th;
                }
            }
            if (0 != 0) {
                (objArr == true ? 1 : 0).disconnect();
            }
            throw th;
        }
        httpURLConnection.disconnect();
    }

    private void b(byte[] bArr) {
        if (this.b == null || this.c) {
            return;
        }
        this.b.a(this, bArr);
    }

    public static boolean a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(HiAnalyticsConstant.Direction.RESPONSE)) {
                return jSONObject.getJSONObject(HiAnalyticsConstant.Direction.RESPONSE).getInt("code") != 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
