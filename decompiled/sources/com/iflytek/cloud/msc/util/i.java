package com.iflytek.cloud.msc.util;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.net.HttpHeaders;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.msc.util.log.DebugLog;
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

/* loaded from: classes17.dex */
public class i extends Thread {
    private String f;

    /* renamed from: a, reason: collision with root package name */
    private int f11190a = 20000;
    private a b = null;
    private volatile boolean c = false;
    private URL d = null;
    private ArrayList<byte[]> e = new ArrayList<>();
    private Object g = null;
    private int h = 0;

    public interface a {
        void a(i iVar, byte[] bArr);

        void onError(SpeechError speechError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c() {
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
                DebugLog.LogD("Start connect server");
                httpURLConnection = (HttpURLConnection) this.d.openConnection();
                try {
                    httpURLConnection.setConnectTimeout(this.f11190a);
                    httpURLConnection.setReadTimeout(this.f11190a);
                    httpURLConnection.setRequestMethod("GET");
                    int responseCode = httpURLConnection.getResponseCode();
                    DebugLog.LogD("responseCode = " + responseCode);
                    if (200 == responseCode) {
                        inputStream2 = httpURLConnection.getInputStream();
                        b(a(inputStream2));
                    } else {
                        DebugLog.LogD("MscHttpRequest connect error:" + responseCode);
                        a(new SpeechError(Math.abs(responseCode) + ErrorCode.MSP_ERROR_HTTP_BASE));
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (Exception e) {
                    e = e;
                    DebugLog.LogE(e);
                    DebugLog.LogD("MscHttpRequest error:" + e.toString());
                    a(new SpeechError(20003));
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

    public void a(int i) {
        this.h = i;
    }

    public void b(int i) {
        this.f11190a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
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
                DebugLog.LogD("MscHttpRequest start Post");
                httpURLConnection = (HttpURLConnection) this.d.openConnection();
                try {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setConnectTimeout(this.f11190a);
                    httpURLConnection.setReadTimeout(this.f11190a);
                    httpURLConnection.setRequestProperty("Content-length", "" + b());
                    httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "Keep-Alive");
                    httpURLConnection.setRequestProperty("Charset", "utf-8");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                    if (!TextUtils.isEmpty(this.f)) {
                        httpURLConnection.setRequestProperty("X-Par", Base64.encodeToString(this.f.getBytes(), 2));
                    }
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
                        DebugLog.LogD("Http Request Failed." + responseCode);
                        a(new SpeechError(responseCode + ErrorCode.MSP_ERROR_HTTP_BASE));
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (Exception e) {
                    e = e;
                    a(new SpeechError(20003));
                    DebugLog.LogD("MscHttpRequest error:" + e.toString());
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

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.h == 1) {
            d();
        } else {
            c();
        }
    }

    private void b(byte[] bArr) {
        if (this.b == null || this.c) {
            return;
        }
        this.b.a(this, bArr);
    }

    public void a(String str, String str2, byte[] bArr) {
        this.e.clear();
        a(bArr);
        try {
            this.d = a(str, str2);
        } catch (MalformedURLException e) {
            DebugLog.LogE(e);
        }
    }

    private int b() {
        int i = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            i += this.e.get(i2).length;
        }
        return i;
    }

    public void a(String str, String str2, byte[] bArr, String str3) {
        this.f = str3;
        a(str, str2, bArr);
    }

    public void a(a aVar) {
        this.b = aVar;
        start();
    }

    public static URL a(String str, String str2) throws MalformedURLException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.endsWith(Separators.QUESTION)) {
                str = str + Separators.QUESTION;
            }
            str = str + str2;
        }
        return new URL(str);
    }

    public void a() {
        this.c = true;
    }

    private byte[] a(InputStream inputStream) throws IOException {
        int read;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
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

    private void a(SpeechError speechError) {
        if (this.b == null || this.c) {
            return;
        }
        this.b.onError(speechError);
    }
}
