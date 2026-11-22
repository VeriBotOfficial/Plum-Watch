package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    HttpURLConnection f20134a;
    InputStream b;
    String c;

    public g(String str) {
        this.c = str;
    }

    public final int a(byte[] bArr) {
        StringBuilder append;
        String iOException;
        InputStream inputStream = this.b;
        if (inputStream == null) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading data from " + this.c + ": connection is absent!");
            return 0;
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            append = new StringBuilder("Reading source ").append(this.c).append(" is interrupted, error message is : ");
            iOException = e.toString();
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", append.append(iOException).toString());
            return 0;
        } catch (IOException e2) {
            append = new StringBuilder("Error reading data from ").append(this.c).append(", error message is : ");
            iOException = e2.toString();
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", append.append(iOException).toString());
            return 0;
        }
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f20134a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing connection correctly, the error message is : " + e.toString());
            } catch (IllegalArgumentException e2) {
                e = e2;
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            } catch (NullPointerException e3) {
                e = e3;
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: IOException -> 0x0069, TryCatch #0 {IOException -> 0x0069, blocks: (B:6:0x0033, B:15:0x0049, B:18:0x0057), top: B:5:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[Catch: IOException -> 0x0069, TRY_LEAVE, TryCatch #0 {IOException -> 0x0069, blocks: (B:6:0x0033, B:15:0x0049, B:18:0x0057), top: B:5:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[LOOP:0: B:2:0x0007->B:20:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[EDGE_INSN: B:21:0x006c->B:22:0x006c BREAK  A[LOOP:0: B:2:0x0007->B:20:0x0067], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.net.HttpURLConnection b() {
        /*
            r8 = this;
            java.lang.String r0 = "ProxyCache"
            java.lang.String r1 = r8.c
            r2 = 0
            r3 = 0
            r4 = r3
        L7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6d
            java.lang.String r6 = "Open connection "
            r5.<init>(r6)     // Catch: java.io.IOException -> L6d
            java.lang.String r6 = ""
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.IOException -> L6d
            java.lang.String r6 = " to "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.IOException -> L6d
            java.lang.StringBuilder r5 = r5.append(r1)     // Catch: java.io.IOException -> L6d
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L6d
            r6 = 3
            sg.bigo.ads.common.t.a.a(r3, r6, r0, r5)     // Catch: java.io.IOException -> L6d
            java.net.URL r5 = new java.net.URL     // Catch: java.io.IOException -> L6d
            r5.<init>(r1)     // Catch: java.io.IOException -> L6d
            java.net.URLConnection r5 = r5.openConnection()     // Catch: java.io.IOException -> L6d
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.io.IOException -> L6d
            if (r5 == 0) goto L6c
            int r2 = r5.getResponseCode()     // Catch: java.io.IOException -> L69
            r6 = 301(0x12d, float:4.22E-43)
            if (r2 == r6) goto L46
            r6 = 302(0x12e, float:4.23E-43)
            if (r2 == r6) goto L46
            r6 = 303(0x12f, float:4.25E-43)
            if (r2 != r6) goto L44
            goto L46
        L44:
            r2 = r3
            goto L47
        L46:
            r2 = 1
        L47:
            if (r2 == 0) goto L54
            java.lang.String r1 = "Location"
            java.lang.String r1 = r5.getHeaderField(r1)     // Catch: java.io.IOException -> L69
            int r4 = r4 + 1
            r5.disconnect()     // Catch: java.io.IOException -> L69
        L54:
            r6 = 5
            if (r4 <= r6) goto L64
            java.lang.String r6 = "Too many redirects: "
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> L69
            java.lang.String r6 = r6.concat(r7)     // Catch: java.io.IOException -> L69
            sg.bigo.ads.common.t.a.a(r3, r0, r6)     // Catch: java.io.IOException -> L69
        L64:
            if (r2 != 0) goto L67
            goto L6c
        L67:
            r2 = r5
            goto L7
        L69:
            r1 = move-exception
            r2 = r5
            goto L6e
        L6c:
            return r5
        L6d:
            r1 = move-exception
        L6e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "PingHttpUrlSource#openConnection, error message is : "
            r4.<init>(r5)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r1 = r1.toString()
            sg.bigo.ads.common.t.a.a(r3, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.player.a.g.b():java.net.HttpURLConnection");
    }
}
