package com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.util.Locale;

/* loaded from: classes17.dex */
final class b implements Runnable {
    private static final String c = "VCacheProxy";
    static final int d = 8192;
    static final int e = 65536;
    static final int f = 131072;
    private static final long g = 65536;
    private static final long h = 10485760;
    private static final int i = 10000;
    private static final int j = 10000;
    private static final String k = "\r\n";

    /* renamed from: a, reason: collision with root package name */
    private final Socket f13004a;
    private int b;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.b$b, reason: collision with other inner class name */
    private static final class C0812b {

        /* renamed from: a, reason: collision with root package name */
        String f13005a;
        long b;

        private C0812b() {
            this.b = -1L;
        }
    }

    b(Socket socket) {
        this.f13004a = socket;
    }

    static int a(int i2, int i3) {
        if (i3 == 2) {
            return 8192;
        }
        if (i3 != 1 || i2 <= 65536) {
            return i2;
        }
        return 65536;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r0 = r0 + 1;
        r4 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.io.OutputStream r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.b.b(java.io.OutputStream, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x011c, code lost:
    
        if (r11.isHeldByCurrentThread() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.io.OutputStream r23, java.lang.String r24, long r25) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.b.c(java.io.OutputStream, java.lang.String, long):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        OutputStream outputStream;
        InputStream inputStream;
        OutputStream outputStream2;
        C0812b a2;
        int a3 = a();
        this.b = a3;
        if (a3 > 0) {
            n.f(c, "[Handler] 内存偏紧, memLevel=" + this.b + ", buffer降级: LARGE→" + (a(131072, this.b) / 1024) + "KB, MEDIUM→" + (a(65536, this.b) / 1024) + "KB", new Object[0]);
        }
        InputStream inputStream2 = null;
        try {
            this.f13004a.setSoTimeout(10000);
            inputStream = this.f13004a.getInputStream();
            try {
                outputStream2 = this.f13004a.getOutputStream();
                a2 = a(inputStream);
            } catch (Throwable unused) {
                outputStream = null;
                inputStream2 = inputStream;
                inputStream = inputStream2;
                outputStream2 = outputStream;
                a((Closeable) inputStream);
                a(outputStream2);
                a(this.f13004a);
            }
        } catch (Throwable unused2) {
            outputStream = null;
        }
        if (a2 == null) {
            a((Closeable) inputStream);
            a(outputStream2);
            a(this.f13004a);
            return;
        }
        String j2 = c.b().j(a2.f13005a);
        if (j2 == null) {
            a(outputStream2, 404, "Not Found");
            a((Closeable) inputStream);
            a(outputStream2);
            a(this.f13004a);
            return;
        }
        if (d.c().g(j2)) {
            n.a(c, "[Handler] 缓存命中, 从本地文件读取, range=" + a2.b, new Object[0]);
            c(outputStream2, j2, a2.b);
        } else if (a2.b > 0) {
            n.a(c, "[Handler] 非零Range请求, 直接代理转发, range=" + a2.b, new Object[0]);
            b(outputStream2, j2, a2.b);
        } else {
            n.a(c, "[Handler] 缓存未命中, 边下边播", new Object[0]);
            a(outputStream2, j2);
        }
        a((Closeable) inputStream);
        a(outputStream2);
        a(this.f13004a);
    }

    static int a() {
        try {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
            if (maxMemory < 10485760) {
                return 2;
            }
            return maxMemory < 20971520 ? 1 : 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void a(OutputStream outputStream, String str) {
        c b = c.b();
        d c2 = d.c();
        if (b.g(str)) {
            if (c2.g(str)) {
                b.l(str);
                c(outputStream, str, 0L);
                return;
            } else {
                n.a(c, "[Stream] 提交后台下载任务, 进入 tail 读取模式", new Object[0]);
                b.k(str);
            }
        } else {
            n.a(c, "[Stream] 预加载已占有写入槽位, 进入 tail 读取模式", new Object[0]);
        }
        b(outputStream, str);
    }

    private void a(OutputStream outputStream, String str, long j2) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream2 = null;
        try {
            HttpURLConnection a2 = a(str, j2);
            try {
                int responseCode = a2.getResponseCode();
                if (responseCode != 200 && responseCode != 206) {
                    a((Closeable) null);
                    a(a2);
                    return;
                }
                inputStream2 = a2.getInputStream();
                int a3 = a(65536, this.b);
                byte[] bArr = new byte[a3];
                while (true) {
                    int read = inputStream2.read(bArr, 0, a3);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        a((Closeable) inputStream2);
                        a(a2);
                        return;
                    }
                }
            } catch (Throwable unused) {
                inputStream = inputStream2;
                httpURLConnection = a2;
                a((Closeable) inputStream);
                a(httpURLConnection);
            }
        } catch (Throwable unused2) {
            inputStream = null;
        }
    }

    private HttpURLConnection a(String str, long j2) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "keep-alive");
        if (j2 > 0) {
            httpURLConnection.setRequestProperty("Range", "bytes=" + j2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private void a(OutputStream outputStream, int i2, String str, long j2, long j3, long j4) throws Exception {
        StringBuilder sb = new StringBuilder(256);
        if (i2 == 206) {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        } else {
            sb.append("HTTP/1.1 200 OK\r\n");
        }
        sb.append("Content-Type: ").append(str).append("\r\n");
        if (j2 >= 0) {
            sb.append("Content-Length: ").append(j2).append("\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\n");
        if (i2 == 206 && j3 >= 0) {
            if (j4 > 0) {
                sb.append(String.format(Locale.US, "Content-Range: bytes %d-%d/%d", Long.valueOf(j3), Long.valueOf(j4 - 1), Long.valueOf(j4))).append("\r\n");
            } else {
                sb.append(String.format(Locale.US, "Content-Range: bytes %d-%d/*", Long.valueOf(j3), Long.valueOf(j2 > 0 ? (j2 + j3) - 1 : j3))).append("\r\n");
            }
        }
        sb.append("Connection: close\r\n\r\n");
        outputStream.write(sb.toString().getBytes("UTF-8"));
        outputStream.flush();
    }

    private void a(OutputStream outputStream, int i2, String str) {
        try {
            outputStream.write(("HTTP/1.1 " + i2 + " " + str + "\r\nContent-Length: 0\r\nConnection: close\r\n\r\n").getBytes("UTF-8"));
            outputStream.flush();
        } catch (Throwable unused) {
        }
    }

    private C0812b a(InputStream inputStream) {
        long j2;
        try {
            StringBuilder sb = new StringBuilder(512);
            do {
                int read = inputStream.read();
                if (read != -1) {
                    sb.append((char) read);
                    if (sb.length() >= 4) {
                        int length = sb.length();
                        if (sb.charAt(length - 4) == '\r' && sb.charAt(length - 3) == '\n' && sb.charAt(length - 2) == '\r' && sb.charAt(length - 1) == '\n') {
                        }
                    }
                }
                String[] split = sb.toString().split("\r\n");
                if (split.length == 0) {
                    return null;
                }
                String[] split2 = split[0].split(" ");
                if (split2.length < 2) {
                    return null;
                }
                int i2 = 1;
                String str = split2[1];
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                while (true) {
                    if (i2 >= split.length) {
                        j2 = -1;
                        break;
                    }
                    String str2 = split[i2];
                    if (str2.toLowerCase(Locale.US).startsWith("range:")) {
                        j2 = a(str2);
                        break;
                    }
                    i2++;
                }
                C0812b c0812b = new C0812b();
                c0812b.f13005a = str;
                c0812b.b = j2;
                return c0812b;
            } while (sb.length() <= 8192);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0084, LOOP:0: B:24:0x006e->B:26:0x0076, LOOP_END, TryCatch #0 {all -> 0x0084, blocks: (B:5:0x0009, B:7:0x0017, B:9:0x0020, B:11:0x002b, B:15:0x0035, B:22:0x0052, B:23:0x0060, B:24:0x006e, B:26:0x0076, B:28:0x007a, B:33:0x0056), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:5:0x0009, B:7:0x0017, B:9:0x0020, B:11:0x002b, B:15:0x0035, B:22:0x0052, B:23:0x0060, B:24:0x006e, B:26:0x0076, B:28:0x007a, B:33:0x0056), top: B:4:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.io.OutputStream r15, java.lang.String r16, long r17) {
        /*
            r14 = this;
            r10 = 0
            r1 = r16
            r6 = r17
            java.net.HttpURLConnection r11 = r14.a(r1, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r11.getResponseCode()     // Catch: java.lang.Throwable -> L84
            long r4 = r14.b(r11)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = r11.getContentType()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L1d
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L20
        L1d:
            java.lang.String r2 = "video/mp4"
        L20:
            r3 = r2
            java.lang.String r2 = "Content-Range"
            java.lang.String r2 = r11.getHeaderField(r2)     // Catch: java.lang.Throwable -> L84
            r8 = -1
            if (r2 == 0) goto L42
            r12 = 47
            int r12 = r2.indexOf(r12)     // Catch: java.lang.Throwable -> L84
            if (r12 < 0) goto L42
            int r12 = r12 + 1
            java.lang.String r2 = r2.substring(r12)     // Catch: java.lang.NumberFormatException -> L42 java.lang.Throwable -> L84
            java.lang.String r2 = r2.trim()     // Catch: java.lang.NumberFormatException -> L42 java.lang.Throwable -> L84
            long r12 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L42 java.lang.Throwable -> L84
            goto L43
        L42:
            r12 = r8
        L43:
            r2 = 206(0xce, float:2.89E-43)
            if (r1 != r2) goto L56
            r1 = 0
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L4e
            r8 = r12
        L4e:
            r2 = 206(0xce, float:2.89E-43)
            r0 = r14
            r1 = r15
            r0.a(r1, r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L84
            goto L60
        L56:
            r2 = 200(0xc8, float:2.8E-43)
            r6 = -1
            r8 = r4
            r0 = r14
            r1 = r15
            r0.a(r1, r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L84
        L60:
            java.io.InputStream r10 = r11.getInputStream()     // Catch: java.lang.Throwable -> L84
            int r1 = r14.b     // Catch: java.lang.Throwable -> L84
            r2 = 65536(0x10000, float:9.1835E-41)
            int r1 = a(r2, r1)     // Catch: java.lang.Throwable -> L84
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L84
        L6e:
            r3 = 0
            int r4 = r10.read(r2, r3, r1)     // Catch: java.lang.Throwable -> L84
            r5 = -1
            if (r4 == r5) goto L7a
            r15.write(r2, r3, r4)     // Catch: java.lang.Throwable -> L84
            goto L6e
        L7a:
            r15.flush()     // Catch: java.lang.Throwable -> L84
            a(r10)
            a(r11)
            goto L8e
        L84:
            r1 = r10
            r10 = r11
            goto L88
        L87:
            r1 = r10
        L88:
            a(r1)
            a(r10)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.b.b(java.io.OutputStream, java.lang.String, long):void");
    }

    private long a(String str) {
        String trim;
        int indexOf;
        try {
            int indexOf2 = str.indexOf(61);
            if (indexOf2 < 0 || (indexOf = (trim = str.substring(indexOf2 + 1).trim()).indexOf(45)) < 0) {
                return -1L;
            }
            String trim2 = trim.substring(0, indexOf).trim();
            if (trim2.isEmpty()) {
                return -1L;
            }
            return Long.parseLong(trim2);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    private long b(HttpURLConnection httpURLConnection) {
        try {
            String headerField = httpURLConnection.getHeaderField("Content-Length");
            if (headerField == null || headerField.isEmpty()) {
                return -1L;
            }
            return Long.parseLong(headerField.trim());
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
