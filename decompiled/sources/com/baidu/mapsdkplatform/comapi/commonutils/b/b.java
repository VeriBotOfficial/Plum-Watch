package com.baidu.mapsdkplatform.comapi.commonutils.b;

import com.baidu.mapsdkplatform.comapi.commonutils.b.c;
import java.io.File;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* compiled from: FileDownloadThread.java */
/* loaded from: classes13.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f8356a;
    private File b;
    private com.baidu.mapsdkplatform.comapi.commonutils.b.a c;
    private c.InterfaceC0377c d;
    private volatile boolean e = false;

    /* compiled from: FileDownloadThread.java */
    static class a implements HostnameVerifier {
        a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public b(String str, File file, com.baidu.mapsdkplatform.comapi.commonutils.b.a aVar, c.InterfaceC0377c interfaceC0377c) {
        this.f8356a = str;
        this.b = file;
        this.c = aVar;
        this.d = interfaceC0377c;
    }

    public boolean a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[Catch: IOException -> 0x00cf, TRY_LEAVE, TryCatch #4 {IOException -> 0x00cf, blocks: (B:57:0x00cb, B:48:0x00d3), top: B:56:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            java.lang.String r0 = "bytes="
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r4 = r7.f8356a     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            boolean r4 = com.baidu.mapapi.http.HttpClient.isHttpsEnable     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            if (r4 == 0) goto L1e
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            com.baidu.mapsdkplatform.comapi.commonutils.b.b$a r4 = new com.baidu.mapsdkplatform.comapi.commonutils.b.b$a     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r3.setHostnameVerifier(r4)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            goto L24
        L1e:
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
        L24:
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r4 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r4 = "Range"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r5.<init>(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            com.baidu.mapsdkplatform.comapi.commonutils.b.a r0 = r7.c     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            int r0 = r0.b()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.StringBuilder r0 = r5.append(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r5 = "-"
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            com.baidu.mapsdkplatform.comapi.commonutils.b.a r5 = r7.c     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            int r5 = r5.a()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r3.setRequestProperty(r4, r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r0 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            r3.setRequestProperty(r0, r4)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.io.File r4 = r7.b     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r5 = "rw"
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            com.baidu.mapsdkplatform.comapi.commonutils.b.a r4 = r7.c     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            int r4 = r4.b()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            long r4 = (long) r4     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            r0.seek(r4)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            int r4 = r3.getResponseCode()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L7f
            r5 = 206(0xce, float:2.89E-43)
            if (r4 != r5) goto L92
        L7f:
            r4 = 1048576(0x100000, float:1.469368E-39)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            java.io.InputStream r2 = r3.getInputStream()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
        L87:
            int r3 = r2.read(r4)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            r5 = -1
            if (r3 == r5) goto L92
            r0.write(r4, r1, r3)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            goto L87
        L92:
            r3 = 1
            r7.e = r3     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lc5
            if (r2 == 0) goto L9a
            r2.close()     // Catch: java.io.IOException -> L9e
        L9a:
            r0.close()     // Catch: java.io.IOException -> L9e
            goto Lbf
        L9e:
            r0 = move-exception
            r0.printStackTrace()
            goto Lbf
        La3:
            r0 = move-exception
            r1 = r2
            goto Lc9
        La6:
            r0 = r2
        La7:
            r7.e = r1     // Catch: java.lang.Throwable -> Lc5
            com.baidu.mapsdkplatform.comapi.commonutils.b.c$c r1 = r7.d     // Catch: java.lang.Throwable -> Lc5
            r1.b(r7)     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto Lb6
            r2.close()     // Catch: java.io.IOException -> Lb4
            goto Lb6
        Lb4:
            r0 = move-exception
            goto Lbc
        Lb6:
            if (r0 == 0) goto Lbf
            r0.close()     // Catch: java.io.IOException -> Lb4
            goto Lbf
        Lbc:
            r0.printStackTrace()
        Lbf:
            com.baidu.mapsdkplatform.comapi.commonutils.b.c$c r0 = r7.d
            r0.a(r7)
            return
        Lc5:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        Lc9:
            if (r2 == 0) goto Ld1
            r2.close()     // Catch: java.io.IOException -> Lcf
            goto Ld1
        Lcf:
            r1 = move-exception
            goto Ld7
        Ld1:
            if (r1 == 0) goto Lda
            r1.close()     // Catch: java.io.IOException -> Lcf
            goto Lda
        Ld7:
            r1.printStackTrace()
        Lda:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapsdkplatform.comapi.commonutils.b.b.run():void");
    }
}
