package com.tencent.mm.opensdk.a;

import com.tencent.mm.opensdk.utils.Log;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements a {
    private final List<f> E = new ArrayList();
    private final ExecutorService D = Executors.newFixedThreadPool(2, new c(this));

    static /* synthetic */ void a(b bVar) {
        synchronized (bVar.E) {
            if (bVar.E.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(bVar.E);
            bVar.E.clear();
            a(arrayList);
        }
    }

    private static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            try {
                do {
                } while (inputStream.read(new byte[512]) != -1);
                inputStream.close();
            } catch (Throwable unused) {
                inputStream.close();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<f> list) {
        String b;
        String b2 = b(list);
        if (b2 == null || (b = b(b2)) == null) {
            return;
        }
        c(b);
    }

    private static String b(String str) {
        try {
            StringBuilder sb = new StringBuilder("keyid=");
            sb.append(URLEncoder.encode("d6880084-9937-4c04-a690-87c49087742a", "UTF-8"));
            sb.append("&events=").append(URLEncoder.encode(str, "UTF-8"));
            return sb.toString();
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "buildBody fail: " + th.getMessage());
            return null;
        }
    }

    private static String b(List<f> list) {
        JSONObject b;
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                f fVar = list.get(i);
                if (fVar != null && (b = fVar.b()) != null) {
                    jSONArray.put(b);
                }
            }
            if (jSONArray.length() == 0) {
                return null;
            }
            return jSONArray.toString();
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "buildEventsJson fail: " + th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(java.lang.String r8) {
        /*
            java.lang.String r0 = "MicroMsg.SDK.PayReport"
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L84 java.io.IOException -> Laa
            java.lang.String r4 = "https://log.wechatpay.cn/mmpayendpointreport/opensdkreport"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> Laa
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> Laa
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L84 java.io.IOException -> Laa
            java.lang.String r4 = "POST"
            r3.setRequestMethod(r4)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r4 = 5000(0x1388, float:7.006E-42)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r4 = 1
            r3.setDoOutput(r4)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r3.setUseCaches(r1)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "application/x-www-form-urlencoded"
            r3.setRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            java.lang.String r5 = "UTF-8"
            byte[] r8 = r8.getBytes(r5)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            java.lang.String r5 = "Content-Length"
            int r6 = r8.length     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r3.setRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            java.io.OutputStream r2 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r2.write(r8)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r2.flush()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            int r8 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            r5 = 200(0xc8, float:2.8E-43)
            if (r8 < r5) goto L53
            r5 = 300(0x12c, float:4.2E-43)
            if (r8 >= r5) goto L53
            goto L54
        L53:
            r4 = r1
        L54:
            if (r4 == 0) goto L5b
            java.io.InputStream r5 = r3.getInputStream()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            goto L5f
        L5b:
            java.io.InputStream r5 = r3.getErrorStream()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
        L5f:
            a(r5)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            if (r4 != 0) goto L72
            java.lang.String r5 = "report http code="
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            java.lang.String r8 = r5.concat(r8)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
            com.tencent.mm.opensdk.utils.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L82
        L72:
            if (r2 == 0) goto L77
            r2.close()     // Catch: java.lang.Throwable -> L77
        L77:
            if (r3 == 0) goto L7c
            r3.disconnect()     // Catch: java.lang.Throwable -> L7c
        L7c:
            return r4
        L7d:
            r8 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L86
        L82:
            r8 = move-exception
            goto Lac
        L84:
            r8 = move-exception
            r3 = r2
        L86:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "report ex: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r8 = r4.append(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.opensdk.utils.Log.w(r0, r8)     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto La2
            r3.close()     // Catch: java.lang.Throwable -> La2
        La2:
            if (r2 == 0) goto La7
            r2.disconnect()     // Catch: java.lang.Throwable -> La7
        La7:
            return r1
        La8:
            r8 = move-exception
            goto Ld2
        Laa:
            r8 = move-exception
            r3 = r2
        Lac:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            java.lang.String r5 = "report io ex: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r8 = r4.append(r8)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lce
            com.tencent.mm.opensdk.utils.Log.w(r0, r8)     // Catch: java.lang.Throwable -> Lce
            if (r2 == 0) goto Lc8
            r2.close()     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            if (r3 == 0) goto Lcd
            r3.disconnect()     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            return r1
        Lce:
            r8 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        Ld2:
            if (r3 == 0) goto Ld7
            r3.close()     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            if (r2 == 0) goto Ldc
            r2.disconnect()     // Catch: java.lang.Throwable -> Ldc
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.a.b.c(java.lang.String):boolean");
    }

    @Override // com.tencent.mm.opensdk.a.a
    public final void a(List<f> list, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            if (z) {
                this.D.execute(new d(this, new ArrayList(list)));
                return;
            }
            synchronized (this.E) {
                this.E.addAll(list);
                while (this.E.size() > 200) {
                    this.E.remove(0);
                }
            }
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "report drop: " + th.getMessage());
        }
    }

    @Override // com.tencent.mm.opensdk.a.a
    public final void flush() {
        try {
            this.D.execute(new e(this));
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "flush drop: " + th.getMessage());
        }
    }
}
