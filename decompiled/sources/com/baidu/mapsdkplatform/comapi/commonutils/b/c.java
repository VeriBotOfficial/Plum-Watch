package com.baidu.mapsdkplatform.comapi.commonutils.b;

import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* compiled from: FileDownloadUtil.java */
/* loaded from: classes13.dex */
public class c {
    private d d;
    private int b = 1;
    private List<com.baidu.mapsdkplatform.comapi.commonutils.b.b> c = new LinkedList();

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f8357a = Executors.newCachedThreadPool();

    /* compiled from: FileDownloadUtil.java */
    private class b implements InterfaceC0377c {

        /* renamed from: a, reason: collision with root package name */
        private File f8358a;

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.b.c.InterfaceC0377c
        public void a(com.baidu.mapsdkplatform.comapi.commonutils.b.b bVar) {
            if (c.this.c == null || c.this.c.size() == 0 || bVar == null || !bVar.a() || c.this.c == null) {
                return;
            }
            c.this.c.remove(bVar);
            if (c.this.c.size() == 0) {
                c.this.d.a(this.f8358a);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.b.c.InterfaceC0377c
        public void b(com.baidu.mapsdkplatform.comapi.commonutils.b.b bVar) {
            if (c.this.c == null || c.this.c.size() == 0 || bVar == null) {
                return;
            }
            c.this.c.clear();
            if (c.this.d != null) {
                c.this.d.a();
            }
        }

        private b(File file) {
            this.f8358a = file;
        }
    }

    /* compiled from: FileDownloadUtil.java */
    /* renamed from: com.baidu.mapsdkplatform.comapi.commonutils.b.c$c, reason: collision with other inner class name */
    public interface InterfaceC0377c {
        void a(com.baidu.mapsdkplatform.comapi.commonutils.b.b bVar);

        void b(com.baidu.mapsdkplatform.comapi.commonutils.b.b bVar);
    }

    /* compiled from: FileDownloadUtil.java */
    public interface d {
        void a();

        void a(File file);
    }

    /* compiled from: FileDownloadUtil.java */
    static class e implements HostnameVerifier {
        e() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public void a(String str, String str2, String str3, int i, d dVar) {
        if (i <= 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        this.b = i;
        this.d = dVar;
        a(str, str2, str3);
    }

    private void a(String str, String str2, String str3) {
        String headerField;
        File file = new File(str2);
        if (file.exists() || file.mkdirs()) {
            HttpURLConnection a2 = a(str);
            if (a2 != null) {
                try {
                    if (a2.getResponseCode() == 200) {
                        int contentLength = a2.getContentLength();
                        if (contentLength > 0) {
                            if (str3 != null || ((headerField = a2.getHeaderField("Content-Disposition")) != null && headerField.length() != 0 && (str3 = URLDecoder.decode(headerField.substring(headerField.indexOf("filename=") + 9), "UTF-8")) != null && str3.length() != 0)) {
                                File file2 = new File(file, str3);
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                                randomAccessFile.setLength(contentLength);
                                randomAccessFile.close();
                                a2.disconnect();
                                int i = this.b;
                                int i2 = contentLength % i;
                                int i3 = contentLength / i;
                                if (i2 != 0) {
                                    i3++;
                                }
                                a(str, file2, i3, contentLength);
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException("unKnow file length");
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            throw new RuntimeException("server no response.");
        }
    }

    private void a(String str, File file, int i, int i2) {
        if (TextUtils.isEmpty(str) || file == null || i <= 0 || i2 <= 0) {
            return;
        }
        int i3 = 0;
        while (i3 < this.b) {
            int i4 = i3 + 1;
            com.baidu.mapsdkplatform.comapi.commonutils.b.a aVar = new com.baidu.mapsdkplatform.comapi.commonutils.b.a(i3, i3 * i, (i4 * i) - 1);
            if (i3 == this.b - 1) {
                aVar.a(i2);
            }
            com.baidu.mapsdkplatform.comapi.commonutils.b.b bVar = new com.baidu.mapsdkplatform.comapi.commonutils.b.b(str, file, aVar, new b(file));
            List<com.baidu.mapsdkplatform.comapi.commonutils.b.b> list = this.c;
            if (list != null) {
                list.add(bVar);
            }
            ExecutorService executorService = this.f8357a;
            if (executorService != null && !executorService.isShutdown()) {
                this.f8357a.submit(bVar);
            }
            i3 = i4;
        }
    }

    private HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str);
            if (HttpClient.isHttpsEnable) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setHostnameVerifier(new e());
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            return httpURLConnection;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
