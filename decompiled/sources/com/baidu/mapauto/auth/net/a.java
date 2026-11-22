package com.baidu.mapauto.auth.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* loaded from: classes13.dex */
public final class a implements com.baidu.mapauto.auth.net.base.a {
    public static final String b = "a";
    public static final /* synthetic */ boolean c = true;

    /* renamed from: a, reason: collision with root package name */
    public c f8249a;

    public a() {
    }

    public a(c cVar) {
        this.f8249a = cVar;
    }

    public static String a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[8192];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read < 0) {
                        String stringWriter2 = stringWriter.toString();
                        bufferedReader.close();
                        return stringWriter2;
                    }
                    stringWriter.write(cArr, 0, read);
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r5 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r5.startsWith("https") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r5.startsWith("HTTPS") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r11 = r4.b + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if ("POST".equals("GET") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r12.isEmpty() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r11 = android.gov.nist.core.Separators.QUESTION + r2.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r1 = new java.net.URL(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r11.startsWith("https") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r11.startsWith("HTTPS") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r0 = (java.net.HttpURLConnection) r1.openConnection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r3.setRequestMethod("POST");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if ("POST".equals("POST") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        r3.setDoInput(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r3.setDoOutput(true);
        r3.setReadTimeout(r4.f8251a);
        r3.setConnectTimeout(5000);
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        r1 = r0.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        if (r1.hasNext() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        r4 = r1.next();
        r3.setRequestProperty(r4, java.util.Objects.requireNonNull(r0.get(r4)).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if ("POST".equals("POST") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
    
        r3.setRequestProperty(com.alipay.sdk.m.t.e.f, "multipart/form-data; boundary=" + com.baidu.mapauto.auth.net.format.a.f8253a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        r1 = com.baidu.mapauto.auth.util.LogUtil.getInstance();
        r4 = com.baidu.mapauto.auth.net.a.b;
        r1.i(r4, "请求地址: " + r11);
        com.baidu.mapauto.auth.util.LogUtil.getInstance().i(r4, "请求方式: POST");
        com.baidu.mapauto.auth.util.LogUtil.getInstance().i(r4, "请求头: " + r0);
        com.baidu.mapauto.auth.util.LogUtil.getInstance().i(r4, "请求参数: " + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0167, code lost:
    
        if ("POST".equals("POST") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0169, code lost:
    
        r11 = r3.getOutputStream();
        r12 = r2.a(r12);
        r0 = new java.io.DataOutputStream(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0176, code lost:
    
        r0.writeBytes(r12);
        r0.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0189, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018a, code lost:
    
        r3.connect();
        r11 = new com.baidu.mapauto.auth.net.b();
        r12 = r3.getResponseCode();
        r11.f8250a = java.lang.Integer.valueOf(r12);
        r11.b = r3.getResponseMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a4, code lost:
    
        if (r12 != 200) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a6, code lost:
    
        r11.c = a(r3.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b0, code lost:
    
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b3, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0089, code lost:
    
        r0 = (javax.net.ssl.HttpsURLConnection) r1.openConnection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008f, code lost:
    
        r1 = r4.d;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0091, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0093, code lost:
    
        r0.setHostnameVerifier(r1);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b4, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b5, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ca, code lost:
    
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01be, code lost:
    
        throw new java.lang.IllegalArgumentException("net config 检验失败");
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.baidu.mapauto.auth.net.b a(java.lang.String r11, java.util.HashMap r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapauto.auth.net.a.a(java.lang.String, java.util.HashMap):com.baidu.mapauto.auth.net.b");
    }
}
